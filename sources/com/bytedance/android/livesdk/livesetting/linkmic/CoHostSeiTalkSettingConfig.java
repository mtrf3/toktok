package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CoHostSeiTalkSettingConfig {

    @InterfaceC65349Pkn("min_audio_volume")
    public int minAudioVolume;

    @InterfaceC65349Pkn("talk_sei_interval")
    public int seiInterval;

    @InterfaceC65349Pkn("talk_sei_enable")
    public boolean seiTalkEnable;

    /* JADX WARN: Multi-variable type inference failed */
    public CoHostSeiTalkSettingConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    public CoHostSeiTalkSettingConfig(boolean z, int i, int i2) {
        this.seiTalkEnable = z;
        this.seiInterval = i;
        this.minAudioVolume = i2;
    }

    public /* synthetic */ CoHostSeiTalkSettingConfig(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 1000 : i, (i3 & 4) != 0 ? 20 : i2);
    }
}
