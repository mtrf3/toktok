package com.ss.android.ugc.aweme.commercialize.media.api.setting;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes8.dex */
public final class CommercialMusicExperimentModel extends F9E {

    @InterfaceC65349Pkn("show_over_check_timer_interval_ms")
    public final long showOverCheckTimerIntervalMS;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.showOverCheckTimerIntervalMS)};
    }

    public CommercialMusicExperimentModel(long j) {
        this.showOverCheckTimerIntervalMS = j;
    }
}
