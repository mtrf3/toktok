package com.ss.android.ugc.aweme.utils;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class BrightnessInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("screen_auto_mode")
    public final int screenAutoMode;

    @InterfaceC65349Pkn("screen_brightness")
    public final float screenBrightness;

    public static /* synthetic */ BrightnessInfo copy$default(BrightnessInfo brightnessInfo, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = brightnessInfo.screenBrightness;
        }
        if ((i2 & 2) != 0) {
            i = brightnessInfo.screenAutoMode;
        }
        return brightnessInfo.copy(f, i);
    }

    public final BrightnessInfo copy(float f, int i) {
        return new BrightnessInfo(f, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.screenBrightness), Integer.valueOf(this.screenAutoMode)};
    }

    public final int getScreenAutoMode() {
        return this.screenAutoMode;
    }

    public final float getScreenBrightness() {
        return this.screenBrightness;
    }

    public BrightnessInfo(float f, int i) {
        this.screenBrightness = f;
        this.screenAutoMode = i;
    }
}
