package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import kotlin.jvm.internal.o;

/* renamed from: X.4rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122724rk {
    public final NLETrack LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C122724rk) && o.LJ(this.LIZ, ((C122724rk) obj).LIZ);
    }

    public final int hashCode() {
        NLETrack nLETrack = this.LIZ;
        if (nLETrack == null) {
            return 0;
        }
        return nLETrack.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrackEvent(nleTrack=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C122724rk(NLETrack nLETrack) {
        this.LIZ = nLETrack;
    }
}
