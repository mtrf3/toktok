package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.7BX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7BX implements C33Q {
    public final C43I<User> LJLIL;
    public final C43I<C7BY> LJLILLLLZI;

    public C7BX() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7BX)) {
            return false;
        }
        C7BX c7bx = (C7BX) obj;
        return o.LJ(this.LJLIL, c7bx.LJLIL) && o.LJ(this.LJLILLLLZI, c7bx.LJLILLLLZI);
    }

    public final int hashCode() {
        C43I<User> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<C7BY> c43i2 = this.LJLILLLLZI;
        return hashCode + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TaggedState(taggedUsers=");
        LIZ.append(this.LJLIL);
        LIZ.append(", event=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7BX(C43I<? extends User> c43i, C43I<? extends C7BY> c43i2) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
    }
}
