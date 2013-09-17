package net.kucoe.elvn;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumerates allowed colors.
 * 
 * @author Vitaliy Basyuk
 */
public enum ListColor {
    
    /**
     * All color.
     */
    All("a", "#FFFFFF"),
    
    /**
     * Today color.
     */
    Today("t", "#4EE2EC"),
    
    /**
     * Red color.
     */
    Red("r", "#FF0000"),
    
    /**
     * Orange color.
     */
    Orange("o", "#F88017"),
    
    /**
     * Yellow color.
     */
    Yellow("y", "#FFFF00"),
    
    /**
     * Green color.
     */
    Green("g", "#347C2C"),
    
    /**
     * Blue color.
     */
    Blue("b", "#2554C7"),
    
    /**
     * Pink color.
     */
    Pink("p", "#F52887"),
    
    /**
     * Violet color.
     */
    Violet("v", "#6A287E"),
    
    /**
     * Done color.
     */
    Done("d", "#5C5858");
    
    private String el;
    private String hex;
    
    private ListColor(final String element, final String color) {
        el = element;
        hex = color;
    }
    
    private static Map<String, ListColor> colors = new HashMap<String, ListColor>();
    
    static {
        for (ListColor color : ListColor.values()) {
            String st = color.el;
            colors.put(st, color);
            colors.put(color.toString(), color);
        }
        colors.put("all", All);
        colors.put("done", Done);
        colors.put("today", Today);
    }
    
    /**
     * Returns color by string
     * 
     * @param string
     * @return {@link ListColor}
     */
    public static ListColor color(final String string) {
        return colors.get(string.trim().toLowerCase());
    }
    
    /**
     * Returns the hex String.
     * 
     * @return the hex String.
     */
    public String getHex() {
        return hex;
    }
    
    @Override
    public String toString() {
        return name().toLowerCase();
    }
    
    /**
     * Returns whether color is system
     * 
     * @param color
     * @return boolean
     */
    public static boolean isSystemColor(ListColor color) {
        return All.equals(color) || Today.equals(color) || Done.equals(color);
    }
    
}
