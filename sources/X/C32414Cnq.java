package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Cnq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32414Cnq implements PU2 {
    public final /* synthetic */ InterfaceC32416Cns LIZ;

    public C32414Cnq(C32411Cnn c32411Cnn) {
        this.LIZ = c32411Cnn;
    }

    @Override // X.PU2
    public final void LIZ(long j) {
        this.LIZ.LIZ(j);
    }

    @Override // X.PU2
    public final void LIZIZ(C32425Co1 t) {
        o.LJIIIZ(t, "t");
        this.LIZ.onFailed(t);
    }

    @Override // X.PU2
    public final void onProgress(int i) {
        this.LIZ.LIZIZ();
    }

    @Override // X.PU2
    public final void LIZLLL(long j, String path) {
        o.LJIIIZ(path, "path");
        this.LIZ.LIZLLL(j, path);
    }
}
