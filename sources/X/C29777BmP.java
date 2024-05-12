package X;

import Y.ALAdapterS4S0200000_5;

/* renamed from: X.BmP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29777BmP implements InterfaceC29937Boz {
    public final /* synthetic */ C29701Eo LIZ;
    public final /* synthetic */ ALAdapterS4S0200000_5 LIZIZ;
    public final /* synthetic */ C29779BmR LIZJ;

    public C29777BmP(C29701Eo c29701Eo, ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, C29779BmR c29779BmR) {
        this.LIZ = c29701Eo;
        this.LIZIZ = aLAdapterS4S0200000_5;
        this.LIZJ = c29779BmR;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        this.LIZ.removeAnimatorListener(this.LIZIZ);
        C29779BmR c29779BmR = this.LIZJ;
        C29701Eo c29701Eo = this.LIZ;
        c29779BmR.getClass();
        c29701Eo.setVisibility(4);
        if (c29779BmR.LIZ.size() >= 5) {
            C16880lQ.LJLLL(c29701Eo, c29779BmR.LIZIZ.LIZLLL);
        } else {
            c29779BmR.LIZ.add(c29701Eo);
        }
    }
}
