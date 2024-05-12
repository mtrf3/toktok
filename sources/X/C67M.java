package X;

import Y.ARunnableS8S0201000_5;

/* renamed from: X.67M, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C67M implements InterfaceC156116At {
    public final /* synthetic */ C1557369h LIZ;
    public final /* synthetic */ InterfaceC156116At LIZIZ;

    public /* synthetic */ C67M(C1557369h c1557369h, C67G c67g) {
        this.LIZ = c1557369h;
        this.LIZIZ = c67g;
    }

    @Override // X.InterfaceC156116At
    public final void LIZ() {
        C1557369h c1557369h = this.LIZ;
        InterfaceC156116At interfaceC156116At = this.LIZIZ;
        if (c1557369h.LLIIIZ != null) {
            c1557369h.LJLJL.post(new ARunnableS8S0201000_5(2, c1557369h, interfaceC156116At, 0));
        }
    }
}
