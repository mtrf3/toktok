package X;

import java.util.Iterator;

/* renamed from: X.UqC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78424UqC implements C0H4 {
    public final /* synthetic */ C78408Upw LIZ;

    @Override // X.C0H4
    public final void onBillingServiceDisconnected() {
        C78273Unl.LJIIIZ().LJ().getClass();
        this.LIZ.LJIILIIL.set(false);
        this.LIZ.LIZ.set(false);
        this.LIZ.LIZ.set(false);
    }

    public C78424UqC(C78408Upw c78408Upw) {
        this.LIZ = c78408Upw;
    }

    @Override // X.C0H4
    public final void onBillingSetupFinished(C0HE c0he) {
        String str;
        if (c0he != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("result code is ");
            LIZ.append(c0he.LIZ);
            LIZ.append(" result message is ");
            LIZ.append(c0he.LIZIZ);
            str = X1D.LIZIZ(LIZ);
        } else {
            str = "billingResult is null!";
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onBillingSetupFinished:");
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        LJ.getClass();
        this.LIZ.LJIILIIL.set(false);
        C78368UpI LJIJI = C78897Uxp.LJIJI(c0he);
        if (c0he.LIZ == 0) {
            this.LIZ.LIZ.set(true);
            Iterator<InterfaceC78437UqP> it = this.LIZ.LJFF.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ();
            }
            this.LIZ.LJFF.clear();
            return;
        }
        this.LIZ.LIZ.set(false);
        Iterator<InterfaceC78437UqP> it2 = this.LIZ.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(LJIJI);
        }
        this.LIZ.LJFF.clear();
    }
}
