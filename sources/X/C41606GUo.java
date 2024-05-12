package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GUo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41606GUo {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final Throwable LIZLLL;
    public final Object LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errorCode:");
        LIZ.append(this.LIZ);
        LIZ.append(" stage:");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C41606GUo(String errorCode, String stage, boolean z, Throwable th, Object obj) {
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(stage, "stage");
        this.LIZ = errorCode;
        this.LIZIZ = stage;
        this.LIZJ = z;
        this.LIZLLL = th;
        this.LJ = obj;
    }
}
