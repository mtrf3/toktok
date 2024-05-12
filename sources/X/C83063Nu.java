package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83063Nu {
    public final List<IMContact> LIZ;
    public final boolean LIZIZ;

    public C83063Nu() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83063Nu)) {
            return false;
        }
        C83063Nu c83063Nu = (C83063Nu) obj;
        return o.LJ(this.LIZ, c83063Nu.LIZ) && this.LIZIZ == c83063Nu.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InternalLoadState(contacts=");
        LIZ.append(this.LIZ);
        LIZ.append(", isLoading=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C83063Nu(int i) {
        this(C61878OQg.INSTANCE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83063Nu(List<? extends IMContact> contacts, boolean z) {
        o.LJIIIZ(contacts, "contacts");
        this.LIZ = contacts;
        this.LIZIZ = z;
    }
}
