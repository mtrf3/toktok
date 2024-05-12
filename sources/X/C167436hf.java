package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener;
import kotlin.jvm.internal.o;

/* renamed from: X.6hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167436hf {
    public Boolean LIZ;
    public double LIZIZ;
    public VoiceDetectionListener LIZJ;

    public C167436hf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C167436hf)) {
            return false;
        }
        C167436hf c167436hf = (C167436hf) obj;
        return o.LJ(this.LIZ, c167436hf.LIZ) && Double.compare(this.LIZIZ, c167436hf.LIZIZ) == 0 && o.LJ(this.LIZJ, c167436hf.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceDetectTask(isReachTargetRate=");
        LIZ.append(this.LIZ);
        LIZ.append(", targetRate=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", listener=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        Boolean bool = this.LIZ;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int LIZIZ = C1JX.LIZIZ(this.LIZIZ, hashCode * 31, 31);
        VoiceDetectionListener voiceDetectionListener = this.LIZJ;
        if (voiceDetectionListener != null) {
            i = voiceDetectionListener.hashCode();
        }
        return LIZIZ + i;
    }

    public C167436hf(int i) {
        this.LIZ = null;
        this.LIZIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LIZJ = null;
    }
}
