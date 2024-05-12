package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveSeiTalkSettingConfig {

    @InterfaceC65349Pkn("talk_sei_interval")
    public int seiInterval;

    @InterfaceC65349Pkn("talk_sei_enable")
    public boolean seiTalkEnable;

    @InterfaceC65349Pkn("talk_wave_enable")
    public boolean talkWaveEnable;

    @InterfaceC65349Pkn("min_audio_volume")
    public int volumeThreshold;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveSeiTalkSettingConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    }

    public LiveSeiTalkSettingConfig(boolean z, int i, boolean z2, int i2) {
        this.seiTalkEnable = z;
        this.seiInterval = i;
        this.talkWaveEnable = z2;
        this.volumeThreshold = i2;
    }

    public /* synthetic */ LiveSeiTalkSettingConfig(boolean z, int i, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 1000 : i, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? 20 : i2);
    }
}
