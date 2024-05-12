package com.ss.android.ugc.aweme.sticker.data;

import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class TextStickerInfo implements Serializable {

    @InterfaceC65349Pkn("alignment")
    public int alignment;

    @InterfaceC65349Pkn("bg_color")
    public String bgColor;

    @InterfaceC65349Pkn("source_height")
    public float srcHeight;

    @InterfaceC65349Pkn("text_language")
    public String srcLanguage;

    @InterfaceC65349Pkn("source_width")
    public float srcWidth;

    @InterfaceC65349Pkn("text_color")
    public String textColor;

    @InterfaceC65349Pkn("text_size")
    public int textSize;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextStickerInfo() {
        /*
            r10 = this;
            r1 = 0
            r4 = 0
            r6 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r3 = r1
            r5 = r4
            r7 = r6
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.data.TextStickerInfo.<init>():void");
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final float getSrcHeight() {
        return this.srcHeight;
    }

    public final String getSrcLanguage() {
        return this.srcLanguage;
    }

    public final float getSrcWidth() {
        return this.srcWidth;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public TextStickerInfo(String str, String str2, String str3, float f, float f2, int i, int i2) {
        HH1.LIZ(str, "bgColor", str2, "textColor", str3, "srcLanguage");
        this.bgColor = str;
        this.textColor = str2;
        this.srcLanguage = str3;
        this.srcWidth = f;
        this.srcHeight = f2;
        this.textSize = i;
        this.alignment = i2;
    }

    public /* synthetic */ TextStickerInfo(String str, String str2, String str3, float f, float f2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "#00000000" : str, (i3 & 2) != 0 ? "#00FFFFFF" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? 0.0f : f2, (i3 & 32) != 0 ? 28 : i, (i3 & 64) != 0 ? 0 : i2);
    }
}
