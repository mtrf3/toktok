package com.ss.android.ugc.aweme.feed.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class AdPreloadExperimentData extends F9E implements Serializable {

    @InterfaceC65349Pkn("delay_millseconds")
    public final int delayMillsec;

    @InterfaceC65349Pkn("is_use_preload")
    public final boolean isUse;

    /* JADX WARN: Multi-variable type inference failed */
    public AdPreloadExperimentData() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ AdPreloadExperimentData copy$default(AdPreloadExperimentData adPreloadExperimentData, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = adPreloadExperimentData.isUse;
        }
        if ((i2 & 2) != 0) {
            i = adPreloadExperimentData.delayMillsec;
        }
        return adPreloadExperimentData.copy(z, i);
    }

    public final AdPreloadExperimentData copy(boolean z, int i) {
        return new AdPreloadExperimentData(z, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isUse), Integer.valueOf(this.delayMillsec)};
    }

    public final int getDelayMillsec() {
        return this.delayMillsec;
    }

    public final boolean isUse() {
        return this.isUse;
    }

    public AdPreloadExperimentData(boolean z, int i) {
        this.isUse = z;
        this.delayMillsec = i;
    }

    public /* synthetic */ AdPreloadExperimentData(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? LiveNetAdaptiveHurryTimeSetting.DEFAULT : i);
    }
}
