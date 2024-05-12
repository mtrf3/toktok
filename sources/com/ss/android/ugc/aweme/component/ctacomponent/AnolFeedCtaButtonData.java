package com.ss.android.ugc.aweme.component.ctacomponent;

import X.C47959Irz;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnolFeedCtaButtonData implements Serializable {

    @InterfaceC65349Pkn("background_color")
    public final String backgroundColor;

    @InterfaceC65349Pkn("text")
    public final String buttonText;

    @InterfaceC65349Pkn("button_type")
    public final Integer buttonType;

    @InterfaceC65349Pkn("color_show_milliseconds")
    public final float colorShowTime;

    @InterfaceC65349Pkn("have_arrow")
    public final Boolean haveArrow;

    @InterfaceC65349Pkn("inner_content_height")
    public final Integer height;

    @InterfaceC65349Pkn("icon_url")
    public final String iconURL;

    @InterfaceC65349Pkn("initial_background_color")
    public final String initialBackgroundColor;

    public static /* synthetic */ AnolFeedCtaButtonData copy$default(AnolFeedCtaButtonData anolFeedCtaButtonData, String str, String str2, String str3, Boolean bool, float f, String str4, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anolFeedCtaButtonData.buttonText;
        }
        if ((i & 2) != 0) {
            str2 = anolFeedCtaButtonData.initialBackgroundColor;
        }
        if ((i & 4) != 0) {
            str3 = anolFeedCtaButtonData.backgroundColor;
        }
        if ((i & 8) != 0) {
            bool = anolFeedCtaButtonData.haveArrow;
        }
        if ((i & 16) != 0) {
            f = anolFeedCtaButtonData.colorShowTime;
        }
        if ((i & 32) != 0) {
            str4 = anolFeedCtaButtonData.iconURL;
        }
        if ((i & 64) != 0) {
            num = anolFeedCtaButtonData.buttonType;
        }
        if ((i & 128) != 0) {
            num2 = anolFeedCtaButtonData.height;
        }
        return anolFeedCtaButtonData.copy(str, str2, str3, bool, f, str4, num, num2);
    }

    public final AnolFeedCtaButtonData copy(String str, String str2, String str3, Boolean bool, float f, String str4, Integer num, Integer num2) {
        return new AnolFeedCtaButtonData(str, str2, str3, bool, f, str4, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnolFeedCtaButtonData)) {
            return false;
        }
        AnolFeedCtaButtonData anolFeedCtaButtonData = (AnolFeedCtaButtonData) obj;
        return o.LJ(this.buttonText, anolFeedCtaButtonData.buttonText) && o.LJ(this.initialBackgroundColor, anolFeedCtaButtonData.initialBackgroundColor) && o.LJ(this.backgroundColor, anolFeedCtaButtonData.backgroundColor) && o.LJ(this.haveArrow, anolFeedCtaButtonData.haveArrow) && Float.compare(this.colorShowTime, anolFeedCtaButtonData.colorShowTime) == 0 && o.LJ(this.iconURL, anolFeedCtaButtonData.iconURL) && o.LJ(this.buttonType, anolFeedCtaButtonData.buttonType) && o.LJ(this.height, anolFeedCtaButtonData.height);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.buttonText;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.initialBackgroundColor;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.backgroundColor;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool = this.haveArrow;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.colorShowTime, (i4 + hashCode4) * 31, 31);
        String str4 = this.iconURL;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i5 = (LIZIZ + hashCode5) * 31;
        Integer num = this.buttonType;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        Integer num2 = this.height;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnolFeedCtaButtonData(buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", initialBackgroundColor=");
        LIZ.append(this.initialBackgroundColor);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.backgroundColor);
        LIZ.append(", haveArrow=");
        LIZ.append(this.haveArrow);
        LIZ.append(", colorShowTime=");
        LIZ.append(this.colorShowTime);
        LIZ.append(", iconURL=");
        LIZ.append(this.iconURL);
        LIZ.append(", buttonType=");
        LIZ.append(this.buttonType);
        LIZ.append(", height=");
        return s0.LIZJ(LIZ, this.height, ')', LIZ);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final Integer getButtonType() {
        return this.buttonType;
    }

    public final float getColorShowTime() {
        return this.colorShowTime;
    }

    public final Boolean getHaveArrow() {
        return this.haveArrow;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getIconURL() {
        return this.iconURL;
    }

    public final String getInitialBackgroundColor() {
        return this.initialBackgroundColor;
    }

    public AnolFeedCtaButtonData(String str, String str2, String str3, Boolean bool, float f, String str4, Integer num, Integer num2) {
        this.buttonText = str;
        this.initialBackgroundColor = str2;
        this.backgroundColor = str3;
        this.haveArrow = bool;
        this.colorShowTime = f;
        this.iconURL = str4;
        this.buttonType = num;
        this.height = num2;
    }

    public /* synthetic */ AnolFeedCtaButtonData(String str, String str2, String str3, Boolean bool, float f, String str4, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, bool, (i & 16) != 0 ? 0.0f : f, str4, num, num2);
    }
}
