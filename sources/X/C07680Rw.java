package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.0Rw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07680Rw {
    public final LiveEffect LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07680Rw) && o.LJ(this.LIZ, ((C07680Rw) obj).LIZ);
    }

    public final int hashCode() {
        LiveEffect liveEffect = this.LIZ;
        if (liveEffect == null) {
            return 0;
        }
        return liveEffect.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveEffectWrapper(liveEffect=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C07680Rw(LiveEffect liveEffect) {
        this.LIZ = liveEffect;
    }
}
