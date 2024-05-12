package com.ss.bytertc.engine.type;

import X.X1D;
import com.ss.bytertc.engine.InternalRemoteStreamSwitch;

/* loaded from: classes33.dex */
public class RemoteStreamSwitch {
    public boolean afterEnable;
    public int afterVideoIndex;
    public boolean beforeEnable;
    public int beforeVideoIndex;
    public boolean isScreen;
    public FallbackOrRecoverReason reason;
    public String uid;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoteStreamSwitch{uid='");
        LIZ.append(this.uid);
        LIZ.append('\'');
        LIZ.append(", isScreen='");
        LIZ.append(this.isScreen);
        LIZ.append('\'');
        LIZ.append(", before_video_index='");
        LIZ.append(this.beforeVideoIndex);
        LIZ.append('\'');
        LIZ.append(", after_video_index='");
        LIZ.append(this.afterVideoIndex);
        LIZ.append('\'');
        LIZ.append(", before_enable='");
        LIZ.append(this.beforeEnable);
        LIZ.append('\'');
        LIZ.append(", after_enable='");
        LIZ.append(this.afterEnable);
        LIZ.append('\'');
        LIZ.append(", reason='");
        LIZ.append(this.reason);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public RemoteStreamSwitch() {
    }

    public RemoteStreamSwitch(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        this.uid = internalRemoteStreamSwitch.uid;
        this.beforeVideoIndex = internalRemoteStreamSwitch.beforeVideoIndex;
        this.afterVideoIndex = internalRemoteStreamSwitch.afterVideoIndex;
        this.beforeEnable = internalRemoteStreamSwitch.beforeEnable;
        this.afterEnable = internalRemoteStreamSwitch.afterEnable;
        this.reason = getFallbackOrRecoverReason(internalRemoteStreamSwitch.reason);
    }

    private FallbackOrRecoverReason getFallbackOrRecoverReason(int i) {
        switch (i) {
            case 0:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_BANDWIDTH;
            case 1:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_PERFORMANCE;
            case 2:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_BANDWIDTH;
            case 3:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_PERFORMANCE;
            case 4:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_BANDWIDTH;
            case 5:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_PERFORMANCE;
            case 6:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_BANDWIDTH;
            case 7:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_PERFORMANCE;
            default:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_UNKNOWN;
        }
    }
}
