package com.ss.android.ugc.aweme.component.searchcomponent;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SearchAdComponentDataModel implements Serializable {

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("color_show_time")
    public final float colorChangeTime;

    @InterfaceC65349Pkn("corner_radius")
    public final int cornerRadius;

    @InterfaceC65349Pkn("bg_color")
    public final String ctaBgColor;

    @InterfaceC65349Pkn("have_arrow")
    public final boolean haveArrow;

    @InterfaceC65349Pkn("left_padding")
    public final int textMarginStart;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchAdComponentDataModel() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 63
            r0 = r9
            r2 = r1
            r4 = r3
            r6 = r3
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.component.searchcomponent.SearchAdComponentDataModel.<init>():void");
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final float getColorChangeTime() {
        return this.colorChangeTime;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final String getCtaBgColor() {
        return this.ctaBgColor;
    }

    public final boolean getHaveArrow() {
        return this.haveArrow;
    }

    public final int getTextMarginStart() {
        return this.textMarginStart;
    }

    public SearchAdComponentDataModel(String buttonText, String ctaBgColor, int i, boolean z, float f, int i2) {
        o.LJIIIZ(buttonText, "buttonText");
        o.LJIIIZ(ctaBgColor, "ctaBgColor");
        this.buttonText = buttonText;
        this.ctaBgColor = ctaBgColor;
        this.textMarginStart = i;
        this.haveArrow = z;
        this.colorChangeTime = f;
        this.cornerRadius = i2;
    }

    public /* synthetic */ SearchAdComponentDataModel(String str, String str2, int i, boolean z, float f, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) == 0 ? str2 : "", (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0.0f : f, (i3 & 32) != 0 ? 0 : i2);
    }
}
