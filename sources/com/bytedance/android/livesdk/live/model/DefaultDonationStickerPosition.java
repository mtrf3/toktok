package com.bytedance.android.livesdk.live.model;

import X.C29676Bkm;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class DefaultDonationStickerPosition {
    public static final C29676Bkm Companion = new C29676Bkm();
    public static final float DEFAULT_POSITION = 0.5f;

    @InterfaceC65349Pkn("x_ratio")
    public float xRatio;

    @InterfaceC65349Pkn("y_ratio")
    public float yRatio;

    public static final float getDEFAULT_POSITION() {
        Companion.getClass();
        return DEFAULT_POSITION;
    }

    public DefaultDonationStickerPosition() {
        float f = DEFAULT_POSITION;
        this.xRatio = f;
        this.yRatio = f;
    }

    public final float getXRatio() {
        return this.xRatio;
    }

    public final float getYRatio() {
        return this.yRatio;
    }

    public final void setXRatio(float f) {
        this.xRatio = f;
    }

    public final void setYRatio(float f) {
        this.yRatio = f;
    }
}
