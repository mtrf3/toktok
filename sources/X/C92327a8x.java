package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8x, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92327a8x extends C92108a5Q {
    public final String LIZJ;

    public C92327a8x() {
        super(EnumC92109a5R.INIT, null);
        this.LIZJ = null;
    }

    public final int hashCode() {
        String str = this.LIZJ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PayResultInit(msg=");
        LIZ.append((Object) this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C92108a5Q
    public final String LIZ() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C92327a8x) && o.LJ(this.LIZJ, ((C92327a8x) obj).LIZJ)) {
            return true;
        }
        return false;
    }
}
