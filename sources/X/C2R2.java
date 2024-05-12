package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.2R2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2R2 extends RuntimeException {
    public final String LJLIL;
    public final Throwable LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C2R2() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2R2(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C2R2 copy$default(C2R2 c2r2, String str, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2r2.getMessage();
        }
        if ((i & 2) != 0) {
            th = c2r2.getCause();
        }
        return c2r2.copy(str, th);
    }

    public final String component1() {
        return getMessage();
    }

    public final Throwable component2() {
        return getCause();
    }

    public final C2R2 copy(String str, Throwable th) {
        return new C2R2(str, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2R2)) {
            return false;
        }
        C2R2 c2r2 = (C2R2) obj;
        return o.LJ(getMessage(), c2r2.getMessage()) && o.LJ(getCause(), c2r2.getCause());
    }

    public int hashCode() {
        return ((getMessage() == null ? 0 : getMessage().hashCode()) * 31) + (getCause() != null ? getCause().hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditPostNoFieldsException(message=");
        LIZ.append(getMessage());
        LIZ.append(", cause=");
        LIZ.append(getCause());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.LJLILLLLZI;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLIL;
    }

    public C2R2(String str, Throwable th) {
        this.LJLIL = str;
        this.LJLILLLLZI = th;
    }

    public /* synthetic */ C2R2(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }
}
