package com.ss.android.ugc.aweme.services.audio;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VoiceDetectionParam extends F9E {
    public final String businessType;
    public final int sourceType;
    public final double targetThresholds;

    public static /* synthetic */ VoiceDetectionParam copy$default(VoiceDetectionParam voiceDetectionParam, int i, String str, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = voiceDetectionParam.sourceType;
        }
        if ((i2 & 2) != 0) {
            str = voiceDetectionParam.businessType;
        }
        if ((i2 & 4) != 0) {
            d = voiceDetectionParam.targetThresholds;
        }
        return voiceDetectionParam.copy(i, str, d);
    }

    public final VoiceDetectionParam copy(int i, String businessType, double d) {
        o.LJIIIZ(businessType, "businessType");
        return new VoiceDetectionParam(i, businessType, d);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.sourceType), this.businessType, Double.valueOf(this.targetThresholds)};
    }

    public final String getBusinessType() {
        return this.businessType;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final double getTargetThresholds() {
        return this.targetThresholds;
    }

    public VoiceDetectionParam(int i, String businessType, double d) {
        o.LJIIIZ(businessType, "businessType");
        this.sourceType = i;
        this.businessType = businessType;
        this.targetThresholds = d;
    }
}
