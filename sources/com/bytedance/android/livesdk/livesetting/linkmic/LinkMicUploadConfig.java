package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public class LinkMicUploadConfig {

    @InterfaceC65349Pkn("default_sample")
    public int defaultSample;

    @InterfaceC65349Pkn("enable")
    public int enable;

    @InterfaceC65349Pkn("sample_0")
    public int[] sample0ExceptionType;

    @InterfaceC65349Pkn("sample_100")
    public int[] sample100ExceptionType;

    @InterfaceC65349Pkn("sample_10")
    public int[] sample10ExceptionType;

    @InterfaceC65349Pkn("sample_1")
    public int[] sample1ExceptionType;

    @InterfaceC65349Pkn("sample_50")
    public int[] sample50ExceptionType;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkMicUploadConfig() {
        /*
            r10 = this;
            r1 = 0
            r6 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r6
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadConfig.<init>():void");
    }

    public LinkMicUploadConfig(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, int i2) {
        this.sample0ExceptionType = iArr;
        this.sample1ExceptionType = iArr2;
        this.sample10ExceptionType = iArr3;
        this.sample50ExceptionType = iArr4;
        this.sample100ExceptionType = iArr5;
        this.defaultSample = i;
        this.enable = i2;
    }

    public /* synthetic */ LinkMicUploadConfig(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : iArr, (i3 & 2) != 0 ? null : iArr2, (i3 & 4) != 0 ? null : iArr3, (i3 & 8) != 0 ? null : iArr4, (i3 & 16) == 0 ? iArr5 : null, (i3 & 32) != 0 ? 1 : i, (i3 & 64) != 0 ? 0 : i2);
    }
}
