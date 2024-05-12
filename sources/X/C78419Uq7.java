package X;

import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uq7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78419Uq7 implements C0HU {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ C78407Upv LIZIZ;

    public C78419Uq7(C78407Upv c78407Upv, long j) {
        this.LIZIZ = c78407Upv;
        this.LIZ = j;
    }

    @Override // X.C0HU
    public final void LIZIZ(C0HE c0he, List<Purchase> list) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("querying inapp + subscriptions unfinished purchases from google service finished cost ");
        C48339Iy7.LIZLLL(System.currentTimeMillis(), this.LIZ, LIZ, " ms , result code is:");
        LIZ.append(c0he.LIZ);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        boolean z = true;
        if (c0he.LIZ == 0) {
            ArrayList arrayList = new ArrayList();
            for (Purchase purchase : list) {
                if (!purchase.LIZJ.optBoolean("acknowledged", true)) {
                    arrayList.add(purchase);
                }
            }
            this.LIZIZ.LJFF(arrayList, true);
        }
        C78332Uoi LIZJ = C78332Uoi.LIZJ();
        if (c0he.LIZ != 0) {
            z = false;
        }
        LIZJ.LIZLLL(c0he.toString(), "subs", list, z);
    }
}
