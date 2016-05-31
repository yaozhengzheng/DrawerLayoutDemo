package com.yao.feicui.drawerlayoutdemo;

/**
 * Created by 16245 on 2016/05/31.
 */
public class Item {
    private int iconId;
    private String iconName;

    public Item() {
    }

    public Item(int iconId, String iconName) {
        this.iconId = iconId;
        this.iconName = iconName;
    }

    public int getIconId() {
        return iconId;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
}
