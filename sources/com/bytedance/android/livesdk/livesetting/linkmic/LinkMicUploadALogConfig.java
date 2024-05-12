package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class LinkMicUploadALogConfig extends LinkMicUploadConfig {

    @InterfaceC65349Pkn("upload_freq_threshold")
    public int uploadThreshold;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkMicUploadALogConfig() {
        /*
            r11 = this;
            r1 = 0
            r6 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r6
            r8 = r6
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadALogConfig.<init>():void");
    }

    public LinkMicUploadALogConfig(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, int i2, int i3) {
        super(iArr, iArr2, iArr3, iArr4, iArr5, i, i2);
        this.uploadThreshold = i3;
    }

    public /* synthetic */ LinkMicUploadALogConfig(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : iArr, (i4 & 2) != 0 ? null : iArr2, (i4 & 4) != 0 ? null : iArr3, (i4 & 8) != 0 ? null : iArr4, (i4 & 16) == 0 ? iArr5 : null, (i4 & 32) != 0 ? 1 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? 10 : i3);
    }
}
