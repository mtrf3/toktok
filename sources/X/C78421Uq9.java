package X;

import com.android.billingclient.api.Purchase;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

/* renamed from: X.Uq9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78421Uq9 implements C0HU {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ InterfaceC78382UpW LIZIZ;
    public final /* synthetic */ C78407Upv LIZJ;

    @Override // X.C0HU
    public final void LIZIZ(C0HE c0he, List<Purchase> list) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("querying inapp unfinished purchases from google service finished cost ");
        C48339Iy7.LIZLLL(System.currentTimeMillis(), this.LIZ, LIZ, " ms , result code is:");
        LIZ.append(c0he.LIZ);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        boolean z = false;
        if (c0he.LIZ == 0) {
            this.LIZJ.LJFF(list, false);
        }
        this.LIZIZ.onQueryFinished(IapPaymentMethod.GOOGLE, new C78368UpI(0, -1, "query success."), this.LIZJ.LJII);
        C78332Uoi LIZJ = C78332Uoi.LIZJ();
        if (c0he.LIZ == 0) {
            z = true;
        }
        LIZJ.LIZLLL(c0he.toString(), "inapp", list, z);
    }

    public C78421Uq9(C78407Upv c78407Upv, long j, InterfaceC78382UpW interfaceC78382UpW) {
        this.LIZJ = c78407Upv;
        this.LIZ = j;
        this.LIZIZ = interfaceC78382UpW;
    }
}
