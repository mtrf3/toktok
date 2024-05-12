package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.im.core.api.experiment.BatchAckSamplingConfig;

/* renamed from: X.4eQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114464eQ {
    public static final BatchAckSamplingConfig LIZ = new BatchAckSamplingConfig(0, null, null, null, 15, null);

    public static BatchAckSamplingConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        BatchAckSamplingConfig batchAckSamplingConfig = LIZ;
        BatchAckSamplingConfig batchAckSamplingConfig2 = (BatchAckSamplingConfig) LIZLLL.LJIIIIZZ("imsdk_e2e_latency_event_config", BatchAckSamplingConfig.class, batchAckSamplingConfig);
        if (batchAckSamplingConfig2 == null) {
            return batchAckSamplingConfig;
        }
        return batchAckSamplingConfig2;
    }
}
