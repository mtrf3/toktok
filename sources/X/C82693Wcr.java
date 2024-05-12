package X;

import java.util.HashSet;

/* renamed from: X.Wcr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82693Wcr implements InterfaceC82692Wcq {
    public final /* synthetic */ InterfaceC82692Wcq LIZ;
    public final /* synthetic */ C82694Wcs LIZIZ;

    @Override // X.InterfaceC82692Wcq
    public final void LIZ() {
        InterfaceC82692Wcq interfaceC82692Wcq = this.LIZ;
        if (interfaceC82692Wcq != null) {
            interfaceC82692Wcq.LIZ();
        }
        C82691Wcp c82691Wcp = this.LIZIZ.LJII;
        if (c82691Wcp != null) {
            HashSet<InterfaceC82702Wd0> hashSet = C82699Wcx.LIZLLL;
            synchronized (hashSet) {
                hashSet.remove(c82691Wcp);
            }
        }
        this.LIZIZ.LJII = null;
    }

    @Override // X.InterfaceC82692Wcq
    public final void LIZIZ() {
        InterfaceC82692Wcq interfaceC82692Wcq = this.LIZ;
        if (interfaceC82692Wcq != null) {
            interfaceC82692Wcq.LIZIZ();
        }
        C82691Wcp c82691Wcp = this.LIZIZ.LJII;
        if (c82691Wcp != null) {
            HashSet<InterfaceC82702Wd0> hashSet = C82699Wcx.LIZLLL;
            synchronized (hashSet) {
                hashSet.add(c82691Wcp);
            }
        }
    }

    @Override // X.InterfaceC82692Wcq
    public final void LIZJ() {
        InterfaceC82692Wcq interfaceC82692Wcq = this.LIZ;
        if (interfaceC82692Wcq != null) {
            interfaceC82692Wcq.LIZJ();
        }
    }

    public C82693Wcr(C54192LOq c54192LOq, C82694Wcs c82694Wcs) {
        this.LIZ = c54192LOq;
        this.LIZIZ = c82694Wcs;
    }
}
