package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.AUf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26309AUf implements L4O {
    public final EnumC53521KzV LJLIL;
    public final String LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26309AUf)) {
            return false;
        }
        C26309AUf c26309AUf = (C26309AUf) obj;
        return this.LJLIL == c26309AUf.LJLIL && o.LJ(this.LJLILLLLZI, c26309AUf.LJLILLLLZI);
    }

    public final int hashCode() {
        EnumC53521KzV enumC53521KzV = this.LJLIL;
        int hashCode = (enumC53521KzV == null ? 0 : enumC53521KzV.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // X.L4O
    public final String getString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C65352Pkq.LIZ(C26309AUf.class).LJFF());
        LIZ.append(this.LJLIL);
        return X1D.LIZIZ(LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarInteractionState(type=");
        LIZ.append(this.LJLIL);
        LIZ.append(", text=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C26309AUf(EnumC53521KzV enumC53521KzV, String str) {
        this.LJLIL = enumC53521KzV;
        this.LJLILLLLZI = str;
    }
}
