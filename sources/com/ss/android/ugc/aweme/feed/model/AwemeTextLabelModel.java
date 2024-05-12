package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class AwemeTextLabelModel implements Serializable {

    @InterfaceC65349Pkn("color")
    public String bgColor;

    @InterfaceC65349Pkn("by_source")
    public String bySource;

    @InterfaceC65349Pkn("by_text")
    public String byText;

    @InterfaceC65349Pkn("by_uid")
    public long byUid;

    @InterfaceC65349Pkn("compliance_color")
    public int complianceColor;

    @InterfaceC65349Pkn("compliance_position")
    public int compliancePosition;

    @InterfaceC65349Pkn("corner_radius")
    public int corner_radius;

    @InterfaceC65349Pkn("enable_show")
    public boolean enableShow;

    @InterfaceC65349Pkn("compliance_has_icon")
    public boolean hasIcon;

    @InterfaceC65349Pkn("compliance_icon_type")
    public int iconType;

    @InterfaceC65349Pkn("compliance_bg_color")
    public int labelBgColor;

    @InterfaceC65349Pkn("text")
    public String labelName;

    @InterfaceC65349Pkn("compliance_text_color")
    public int labelTextColor;

    @InterfaceC65349Pkn("type")
    public int labelType;

    @InterfaceC65349Pkn("show_seconds")
    public float showSeconds;

    @InterfaceC65349Pkn("color_text")
    public String textColor;

    @InterfaceC65349Pkn("white_color")
    public String whiteBgColor;

    @InterfaceC65349Pkn("white_color_text")
    public String whiteTextColor;

    @InterfaceC65349Pkn("height")
    public int height = -1;

    @InterfaceC65349Pkn("font")
    public int font = -1;

    public boolean isAdHollowText() {
        if (!TextUtils.isEmpty(this.textColor) && this.textColor.endsWith("00000000")) {
            return true;
        }
        return false;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public int getComplianceColor() {
        return this.complianceColor;
    }

    public int getCompliancePosition() {
        return this.compliancePosition;
    }

    public int getCornerRadius() {
        return this.corner_radius;
    }

    public int getFont() {
        return this.font;
    }

    public int getHeight() {
        return this.height;
    }

    public int getIconType() {
        return this.iconType;
    }

    public int getLabelBgColor() {
        return this.labelBgColor;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public int getLabelTextColor() {
        return this.labelTextColor;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public float getShowSeconds() {
        return this.showSeconds;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public String getWhiteBgColor() {
        return this.whiteBgColor;
    }

    public String getWhiteTextColor() {
        return this.whiteTextColor;
    }

    public boolean isEnableShow() {
        return this.enableShow;
    }

    public boolean isHasIcon() {
        return this.hasIcon;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setEnableShow(boolean z) {
        this.enableShow = z;
    }

    public void setLabelName(String str) {
        this.labelName = str;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setShowSeconds(float f) {
        this.showSeconds = f;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }
}
