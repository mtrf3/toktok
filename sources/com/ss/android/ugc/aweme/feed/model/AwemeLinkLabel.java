package com.ss.android.ugc.aweme.feed.model;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AwemeLinkLabel implements Serializable {

    @InterfaceC65349Pkn("color")
    public final String color;

    @InterfaceC65349Pkn("color_icon")
    public final String colorIcon;

    @InterfaceC65349Pkn("color_text")
    public final String colorText;

    @InterfaceC65349Pkn("icon")
    public final UrlModel icon;

    @InterfaceC65349Pkn("show_seconds")
    public final int showSeconds;

    @InterfaceC65349Pkn("style_type")
    public final int styleType;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("white_color_icon")
    public final String whiteColorIcon;

    @InterfaceC65349Pkn("white_color_text")
    public final String whiteColorText;

    public static /* synthetic */ AwemeLinkLabel copy$default(AwemeLinkLabel awemeLinkLabel, String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, UrlModel urlModel, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = awemeLinkLabel.color;
        }
        if ((i4 & 2) != 0) {
            str2 = awemeLinkLabel.text;
        }
        if ((i4 & 4) != 0) {
            str3 = awemeLinkLabel.colorText;
        }
        if ((i4 & 8) != 0) {
            str4 = awemeLinkLabel.whiteColorText;
        }
        if ((i4 & 16) != 0) {
            i = awemeLinkLabel.type;
        }
        if ((i4 & 32) != 0) {
            str5 = awemeLinkLabel.colorIcon;
        }
        if ((i4 & 64) != 0) {
            str6 = awemeLinkLabel.whiteColorIcon;
        }
        if ((i4 & 128) != 0) {
            i2 = awemeLinkLabel.styleType;
        }
        if ((i4 & 256) != 0) {
            i3 = awemeLinkLabel.showSeconds;
        }
        if ((i4 & 512) != 0) {
            urlModel = awemeLinkLabel.icon;
        }
        return awemeLinkLabel.copy(str, str2, str3, str4, i, str5, str6, i2, i3, urlModel);
    }

    public final AwemeLinkLabel copy(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, UrlModel urlModel) {
        return new AwemeLinkLabel(str, str2, str3, str4, i, str5, str6, i2, i3, urlModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeLinkLabel)) {
            return false;
        }
        AwemeLinkLabel awemeLinkLabel = (AwemeLinkLabel) obj;
        return o.LJ(this.color, awemeLinkLabel.color) && o.LJ(this.text, awemeLinkLabel.text) && o.LJ(this.colorText, awemeLinkLabel.colorText) && o.LJ(this.whiteColorText, awemeLinkLabel.whiteColorText) && this.type == awemeLinkLabel.type && o.LJ(this.colorIcon, awemeLinkLabel.colorIcon) && o.LJ(this.whiteColorIcon, awemeLinkLabel.whiteColorIcon) && this.styleType == awemeLinkLabel.styleType && this.showSeconds == awemeLinkLabel.showSeconds && o.LJ(this.icon, awemeLinkLabel.icon);
    }

    public int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.colorText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.whiteColorText;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.type) * 31;
        String str5 = this.colorIcon;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.whiteColorIcon;
        int hashCode6 = (((((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.styleType) * 31) + this.showSeconds) * 31;
        UrlModel urlModel = this.icon;
        return hashCode6 + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeLinkLabel(color=");
        LIZ.append(this.color);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", colorText=");
        LIZ.append(this.colorText);
        LIZ.append(", whiteColorText=");
        LIZ.append(this.whiteColorText);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", colorIcon=");
        LIZ.append(this.colorIcon);
        LIZ.append(", whiteColorIcon=");
        LIZ.append(this.whiteColorIcon);
        LIZ.append(", styleType=");
        LIZ.append(this.styleType);
        LIZ.append(", showSeconds=");
        LIZ.append(this.showSeconds);
        LIZ.append(", icon=");
        return C31461Li.LIZLLL(LIZ, this.icon, ')', LIZ);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorIcon() {
        return this.colorIcon;
    }

    public final String getColorText() {
        return this.colorText;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public final int getStyleType() {
        return this.styleType;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final String getWhiteColorIcon() {
        return this.whiteColorIcon;
    }

    public final String getWhiteColorText() {
        return this.whiteColorText;
    }

    public AwemeLinkLabel(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, UrlModel urlModel) {
        this.color = str;
        this.text = str2;
        this.colorText = str3;
        this.whiteColorText = str4;
        this.type = i;
        this.colorIcon = str5;
        this.whiteColorIcon = str6;
        this.styleType = i2;
        this.showSeconds = i3;
        this.icon = urlModel;
    }

    public /* synthetic */ AwemeLinkLabel(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, UrlModel urlModel, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i4 & 16) != 0 ? 4 : i, str5, str6, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? 0 : i3, urlModel);
    }
}
