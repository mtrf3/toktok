package X;

import Y.ARunnableS30S0200000_11;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.PgS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65080PgS<T> implements InterfaceC64642PYo<T> {
    public final /* synthetic */ InterfaceC64642PYo LIZ;
    public final /* synthetic */ C65078PgQ LIZIZ;

    public C65080PgS(C65078PgQ c65078PgQ, InterfaceC64642PYo interfaceC64642PYo) {
        this.LIZIZ = c65078PgQ;
        this.LIZ = interfaceC64642PYo;
    }

    @Override // X.InterfaceC64642PYo
    public final void onFailure(InterfaceC65079PgR<T> interfaceC65079PgR, Throwable th) {
        this.LIZIZ.LJLIL.execute(new ARunnableS30S0200000_11(this, th, 34));
    }

    @Override // X.InterfaceC64642PYo
    public final void onResponse(InterfaceC65079PgR<T> interfaceC65079PgR, C64653PYz<T> c64653PYz) {
        this.LIZIZ.LJLIL.execute(new ARunnableS30S0200000_11(this, c64653PYz, 33));
    }
}
