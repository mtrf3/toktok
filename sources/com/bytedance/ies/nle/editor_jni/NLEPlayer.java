package com.bytedance.ies.nle.editor_jni;

import X.EnumC133595Md;

/* loaded from: classes3.dex */
public final class NLEPlayer {
    public transient long LIZ;
    public transient boolean LIZIZ = true;

    public final synchronized void LIZ() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEMediaPublicJniJNI.delete_NLEPlayer(j);
            }
            this.LIZ = 0L;
        }
    }

    public final int LIZIZ() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                return NLEMediaPublicJniJNI.NLEPlayer_destroy(j, this);
            }
            return 0;
        }
    }

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaPublicJniJNI.delete_NLEPlayer(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEPlayer(long j) {
        this.LIZ = j;
    }

    public final int LIZJ(long j, EnumC133595Md enumC133595Md) {
        return NLEMediaPublicJniJNI.NLEPlayer_seekTime(this.LIZ, this, j, enumC133595Md.swigValue());
    }
}
