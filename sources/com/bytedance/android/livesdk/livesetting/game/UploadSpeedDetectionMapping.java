package com.bytedance.android.livesdk.livesetting.game;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class UploadSpeedDetectionMapping {

    @InterfaceC65349Pkn("hd_60_min")
    public float hd_60_min;

    @InterfaceC65349Pkn("hd_min")
    public float hd_min;

    @InterfaceC65349Pkn("ld_min")
    public float ld_min;

    @InterfaceC65349Pkn("sd_min")
    public float sd_min;

    @InterfaceC65349Pkn("uhd_60_min")
    public float uhd_60_min;

    @InterfaceC65349Pkn("uhd_min")
    public float uhd_min;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UploadSpeedDetectionMapping() {
        /*
            r9 = this;
            r1 = 0
            r7 = 63
            r8 = 0
            r0 = r9
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.game.UploadSpeedDetectionMapping.<init>():void");
    }

    public final float getHd_60_min() {
        return this.hd_60_min;
    }

    public final float getHd_min() {
        return this.hd_min;
    }

    public final float getLd_min() {
        return this.ld_min;
    }

    public final float getSd_min() {
        return this.sd_min;
    }

    public final float getUhd_60_min() {
        return this.uhd_60_min;
    }

    public final float getUhd_min() {
        return this.uhd_min;
    }

    public final void setHd_60_min(float f) {
        this.hd_60_min = f;
    }

    public final void setHd_min(float f) {
        this.hd_min = f;
    }

    public final void setLd_min(float f) {
        this.ld_min = f;
    }

    public final void setSd_min(float f) {
        this.sd_min = f;
    }

    public final void setUhd_60_min(float f) {
        this.uhd_60_min = f;
    }

    public final void setUhd_min(float f) {
        this.uhd_min = f;
    }

    public UploadSpeedDetectionMapping(float f, float f2, float f3, float f4, float f5, float f6) {
        this.ld_min = f;
        this.sd_min = f2;
        this.hd_min = f3;
        this.hd_60_min = f4;
        this.uhd_min = f5;
        this.uhd_60_min = f6;
    }

    public /* synthetic */ UploadSpeedDetectionMapping(float f, float f2, float f3, float f4, float f5, float f6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.5f : f, (i & 2) != 0 ? 1.5f : f2, (i & 4) != 0 ? 2.5f : f3, (i & 8) != 0 ? 4.0f : f4, (i & 16) != 0 ? 6.0f : f5, (i & 32) != 0 ? 6.0f : f6);
    }
}
