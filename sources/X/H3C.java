package X;

import defpackage.i0;

/* loaded from: classes8.dex */
public final class H3C implements InterfaceC162186Yc {
    public final /* synthetic */ C43426H2o LJLIL;

    public H3C(C43426H2o c43426H2o) {
        this.LJLIL = c43426H2o;
    }

    @Override // X.InterfaceC162186Yc
    public final void onError(String str) {
        this.LJLIL.LJIIJJI(10009, new C43451H3n(i0.LJFF("photo: gen cover failed: ", str)));
    }
}
