package X;

import Y.ALAdapterS4S0200000_5;

/* renamed from: X.Bq7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30007Bq7 implements InterfaceC29937Boz {
    public final /* synthetic */ C29701Eo LIZ;
    public final /* synthetic */ ALAdapterS4S0200000_5 LIZIZ;
    public final /* synthetic */ C30001Bq1 LIZJ;

    public C30007Bq7(C29701Eo c29701Eo, ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, C30001Bq1 c30001Bq1) {
        this.LIZ = c29701Eo;
        this.LIZIZ = aLAdapterS4S0200000_5;
        this.LIZJ = c30001Bq1;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        this.LIZ.removeAnimatorListener(this.LIZIZ);
        this.LIZJ.LIZIZ(this.LIZ);
    }
}
