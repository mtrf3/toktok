package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AudioChatWatermarkResolution {

    @InterfaceC65349Pkn("h")
    public int h;

    @InterfaceC65349Pkn("w")
    public int w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AudioChatWatermarkResolution() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.AudioChatWatermarkResolution.<init>():void");
    }

    public AudioChatWatermarkResolution(int i, int i2) {
        this.w = i;
        this.h = i2;
    }

    public /* synthetic */ AudioChatWatermarkResolution(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 240 : i, (i3 & 2) != 0 ? 240 : i2);
    }
}
