package com.ss.android.ugc.aweme.feed.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AdPreloadMainSwitch implements Serializable {

    @InterfaceC65349Pkn("lynx_mask_data")
    public final AdPreloadExperimentData lynxMaskData;

    @InterfaceC65349Pkn("lynx_superlike_data")
    public final AdPreloadExperimentData lynxSuperLikeData;

    @InterfaceC65349Pkn("other_optimize_enabled")
    public final boolean otherOptimizeEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public AdPreloadMainSwitch() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdPreloadMainSwitch copy$default(AdPreloadMainSwitch adPreloadMainSwitch, boolean z, AdPreloadExperimentData adPreloadExperimentData, AdPreloadExperimentData adPreloadExperimentData2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = adPreloadMainSwitch.otherOptimizeEnabled;
        }
        if ((i & 2) != 0) {
            adPreloadExperimentData = adPreloadMainSwitch.lynxMaskData;
        }
        if ((i & 4) != 0) {
            adPreloadExperimentData2 = adPreloadMainSwitch.lynxSuperLikeData;
        }
        return adPreloadMainSwitch.copy(z, adPreloadExperimentData, adPreloadExperimentData2);
    }

    public final AdPreloadMainSwitch copy(boolean z, AdPreloadExperimentData adPreloadExperimentData, AdPreloadExperimentData adPreloadExperimentData2) {
        return new AdPreloadMainSwitch(z, adPreloadExperimentData, adPreloadExperimentData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdPreloadMainSwitch)) {
            return false;
        }
        AdPreloadMainSwitch adPreloadMainSwitch = (AdPreloadMainSwitch) obj;
        return this.otherOptimizeEnabled == adPreloadMainSwitch.otherOptimizeEnabled && o.LJ(this.lynxMaskData, adPreloadMainSwitch.lynxMaskData) && o.LJ(this.lynxSuperLikeData, adPreloadMainSwitch.lynxSuperLikeData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        boolean z = this.otherOptimizeEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        AdPreloadExperimentData adPreloadExperimentData = this.lynxMaskData;
        int hashCode = (i + (adPreloadExperimentData == null ? 0 : adPreloadExperimentData.hashCode())) * 31;
        AdPreloadExperimentData adPreloadExperimentData2 = this.lynxSuperLikeData;
        return hashCode + (adPreloadExperimentData2 != null ? adPreloadExperimentData2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdPreloadMainSwitch(otherOptimizeEnabled=");
        LIZ.append(this.otherOptimizeEnabled);
        LIZ.append(", lynxMaskData=");
        LIZ.append(this.lynxMaskData);
        LIZ.append(", lynxSuperLikeData=");
        LIZ.append(this.lynxSuperLikeData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final AdPreloadExperimentData getLynxMaskData() {
        return this.lynxMaskData;
    }

    public final AdPreloadExperimentData getLynxSuperLikeData() {
        return this.lynxSuperLikeData;
    }

    public final boolean getOtherOptimizeEnabled() {
        return this.otherOptimizeEnabled;
    }

    public AdPreloadMainSwitch(boolean z, AdPreloadExperimentData adPreloadExperimentData, AdPreloadExperimentData adPreloadExperimentData2) {
        this.otherOptimizeEnabled = z;
        this.lynxMaskData = adPreloadExperimentData;
        this.lynxSuperLikeData = adPreloadExperimentData2;
    }

    public /* synthetic */ AdPreloadMainSwitch(boolean z, AdPreloadExperimentData adPreloadExperimentData, AdPreloadExperimentData adPreloadExperimentData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : adPreloadExperimentData, (i & 4) != 0 ? null : adPreloadExperimentData2);
    }
}
