package X;

import kotlin.jvm.internal.o;

/* renamed from: X.DvP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35431DvP extends IllegalArgumentException {
    public final String LJLIL;

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cannot parse schema modifier settings, missing arg: ");
        LIZ.append(this.LJLIL);
        return X1D.LIZIZ(LIZ);
    }

    public C35431DvP(String missedArg) {
        o.LJIIJ(missedArg, "missedArg");
        this.LJLIL = missedArg;
    }
}
