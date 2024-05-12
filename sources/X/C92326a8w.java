package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8w, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92326a8w extends C92108a5Q {
    public final String LIZJ;

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PayResultFailed(msg=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C92108a5Q
    public final String LIZ() {
        return this.LIZJ;
    }

    public C92326a8w(String str) {
        super(EnumC92109a5R.FAILED, str);
        this.LIZJ = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C92326a8w) && o.LJ(this.LIZJ, ((C92326a8w) obj).LIZJ)) {
            return true;
        }
        return false;
    }
}
