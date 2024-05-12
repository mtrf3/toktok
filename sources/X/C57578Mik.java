package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mik, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57578Mik extends IllegalStateException {
    public final EnumC57577Mij LJLIL;
    public final String LJLILLLLZI;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLILLLLZI;
    }

    public final EnumC57577Mij getReason() {
        return this.LJLIL;
    }

    public C57578Mik(EnumC57577Mij reason) {
        o.LJIIIZ(reason, "reason");
        this.LJLIL = reason;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Get contact name fail, cause by ");
        LIZ.append(reason);
        this.LJLILLLLZI = X1D.LIZIZ(LIZ);
    }
}
