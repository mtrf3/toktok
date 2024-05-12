package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LinkMicAudioModeSettingConf {

    @InterfaceC65349Pkn("push_stream_compatible_enable")
    public boolean pushStreamCompatibleEnable;

    @InterfaceC65349Pkn("push_stream_compatible_version")
    public long pushStreamCompatibleVersion;

    public LinkMicAudioModeSettingConf() {
        this(false, 0L, 3, null);
    }

    public LinkMicAudioModeSettingConf(boolean z, long j) {
        this.pushStreamCompatibleEnable = z;
        this.pushStreamCompatibleVersion = j;
    }

    public /* synthetic */ LinkMicAudioModeSettingConf(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 2610L : j);
    }
}
