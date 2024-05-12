package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class VolumeAdjustmentExperimentParams extends F9E implements Serializable {

    @InterfaceC65349Pkn("db_range")
    public final double dbRange;

    @InterfaceC65349Pkn("default_pos")
    public final float defaultPos;

    @InterfaceC65349Pkn("optimization_on")
    public final boolean enabled;

    public VolumeAdjustmentExperimentParams() {
        this(false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0.0f, 7, null);
    }

    public static /* synthetic */ VolumeAdjustmentExperimentParams copy$default(VolumeAdjustmentExperimentParams volumeAdjustmentExperimentParams, boolean z, double d, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            z = volumeAdjustmentExperimentParams.enabled;
        }
        if ((i & 2) != 0) {
            d = volumeAdjustmentExperimentParams.dbRange;
        }
        if ((i & 4) != 0) {
            f = volumeAdjustmentExperimentParams.defaultPos;
        }
        return volumeAdjustmentExperimentParams.copy(z, d, f);
    }

    public final VolumeAdjustmentExperimentParams copy(boolean z, double d, float f) {
        return new VolumeAdjustmentExperimentParams(z, d, f);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enabled), Double.valueOf(this.dbRange), Float.valueOf(this.defaultPos)};
    }

    public final double getDbRange() {
        return this.dbRange;
    }

    public final float getDefaultPos() {
        return this.defaultPos;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public VolumeAdjustmentExperimentParams(boolean z, double d, float f) {
        this.enabled = z;
        this.dbRange = d;
        this.defaultPos = f;
    }

    public /* synthetic */ VolumeAdjustmentExperimentParams(boolean z, double d, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 4) != 0 ? 0.5f : f);
    }
}
