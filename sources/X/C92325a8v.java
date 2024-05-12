package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8v, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92325a8v extends C92108a5Q {
    public final String LIZJ;

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PayResultApiError(msg=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C92108a5Q
    public final String LIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92325a8v(String msg) {
        super(EnumC92109a5R.API_ERROR, msg);
        o.LJIIIZ(msg, "msg");
        this.LIZJ = msg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C92325a8v) && o.LJ(this.LIZJ, ((C92325a8v) obj).LIZJ)) {
            return true;
        }
        return false;
    }
}
