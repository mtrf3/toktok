package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.9NF, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9NF {
    public final int LIZ;
    public final WeakReference<G27> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9NF)) {
            return false;
        }
        C9NF c9nf = (C9NF) obj;
        return this.LIZ == c9nf.LIZ && o.LJ(this.LIZIZ, c9nf.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConfigurationObserver(activityHash=");
        LIZ.append(this.LIZ);
        LIZ.append(", ob=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C9NF(int i, WeakReference<G27> weakReference) {
        this.LIZ = i;
        this.LIZIZ = weakReference;
    }
}
