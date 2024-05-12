package X;

import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.2Q1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2Q1 extends Throwable {
    public final String LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C2Q1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C2Q1 copy$default(C2Q1 c2q1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2q1.LJLIL;
        }
        return c2q1.copy(str);
    }

    public final C2Q1 copy(String str) {
        return new C2Q1(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2Q1) && o.LJ(this.LJLIL, ((C2Q1) obj).LJLIL);
    }

    public int hashCode() {
        String str = this.LJLIL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FutureException(msg=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final String getMsg() {
        return this.LJLIL;
    }

    public C2Q1(String str) {
        this.LJLIL = str;
    }

    public /* synthetic */ C2Q1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
