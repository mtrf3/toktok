package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class Sticker {
    public String LIZ;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("h")
    public int screenHeight;

    @InterfaceC65349Pkn("w")
    public int screenWidth;

    @InterfaceC65349Pkn("text_color")
    public String textColor;

    @InterfaceC65349Pkn("text_size")
    public int textSize;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("x")
    public int x;

    @InterfaceC65349Pkn("y")
    public int y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Sticker() {
        /*
            r14 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r12 = 1023(0x3ff, float:1.434E-42)
            r0 = r14
            r5 = r1
            r6 = r1
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r13 = r1
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.Sticker.<init>():void");
    }

    public Sticker(String str, long j, int i, String content, String str2, int i2, int i3, int i4, int i5, int i6) {
        o.LJIIIZ(content, "content");
        this.LIZ = str;
        this.id = j;
        this.type = i;
        this.content = content;
        this.textColor = str2;
        this.textSize = i2;
        this.x = i3;
        this.y = i4;
        this.screenWidth = i5;
        this.screenHeight = i6;
    }

    public /* synthetic */ Sticker(String str, long j, int i, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? 0L : j, (i7 & 4) != 0 ? 0 : i, (i7 & 8) != 0 ? "" : str2, (i7 & 16) == 0 ? str3 : "", (i7 & 32) != 0 ? 0 : i2, (i7 & 64) != 0 ? -1 : i3, (i7 & 128) == 0 ? i4 : -1, (i7 & 256) != 0 ? 0 : i5, (i7 & 512) == 0 ? i6 : 0);
    }
}
