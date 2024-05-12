package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class DynamicLightWaveUtil {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaPublicJniJNI.delete_DynamicLightWaveUtil(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public DynamicLightWaveUtil(long j, long j2, long j3, String str, String str2) {
        long new_DynamicLightWaveUtil = NLEMediaPublicJniJNI.new_DynamicLightWaveUtil(j, j2, j3, str, str2);
        this.LIZIZ = true;
        this.LIZ = new_DynamicLightWaveUtil;
    }
}
