package com.bytedance.android.livesdk.livesetting.subscription;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveSubOnlyChatSetting {

    @InterfaceC65349Pkn("animation_enable")
    public boolean animationEnable;

    @InterfaceC65349Pkn("on_live_switch_enable")
    public boolean onLiveSwitchEnable;

    @InterfaceC65349Pkn("on_live_setting_switch_frequency_min")
    public int onLiveSwitchFrequencyMin;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveSubOnlyChatSetting() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    public final boolean getOnLiveSwitchEnable() {
        return this.onLiveSwitchEnable;
    }

    public final int getOnLiveSwitchFrequencyMin() {
        return this.onLiveSwitchFrequencyMin;
    }

    public final void setAnimationEnable(boolean z) {
        this.animationEnable = z;
    }

    public final void setOnLiveSwitchEnable(boolean z) {
        this.onLiveSwitchEnable = z;
    }

    public final void setOnLiveSwitchFrequencyMin(int i) {
        this.onLiveSwitchFrequencyMin = i;
    }

    public LiveSubOnlyChatSetting(int i, boolean z, boolean z2) {
        this.onLiveSwitchFrequencyMin = i;
        this.onLiveSwitchEnable = z;
        this.animationEnable = z2;
    }

    public /* synthetic */ LiveSubOnlyChatSetting(int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2);
    }
}
