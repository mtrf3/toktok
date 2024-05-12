package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.33Y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33Y {
    public final C238479Xn LIZ;
    public final AbstractC72932td<User> LIZIZ;

    public C33Y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33Y)) {
            return false;
        }
        C33Y c33y = (C33Y) obj;
        return o.LJ(this.LIZ, c33y.LIZ) && o.LJ(this.LIZIZ, c33y.LIZIZ);
    }

    public final int hashCode() {
        C238479Xn c238479Xn = this.LIZ;
        return this.LIZIZ.hashCode() + ((c238479Xn == null ? 0 : c238479Xn.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SharerState(linkParams=");
        LIZ.append(this.LIZ);
        LIZ.append(", sharer=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C33Y(int i) {
        this(null, C33X.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33Y(C238479Xn c238479Xn, AbstractC72932td<? extends User> sharer) {
        o.LJIIIZ(sharer, "sharer");
        this.LIZ = c238479Xn;
        this.LIZIZ = sharer;
    }
}
