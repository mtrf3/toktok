package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Uq1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78413Uq1 implements C0HS {
    public final /* synthetic */ InterfaceC78385UpZ LIZ;
    public final /* synthetic */ C78408Upw LIZIZ;

    public C78413Uq1(C78408Upw c78408Upw, InterfaceC78385UpZ interfaceC78385UpZ) {
        this.LIZIZ = c78408Upw;
        this.LIZ = interfaceC78385UpZ;
    }

    @Override // X.C0HS
    public final void LIZ(C0HE c0he, List<C0HQ> list) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c0he.LIZ);
        LIZ.append(":");
        LIZ.append(c0he.LIZIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(((ArrayList) list).size());
        LIZ2.append("");
        Object[] objArr = {X1D.LIZIZ(LIZ), X1D.LIZIZ(LIZ2)};
        LJ.getClass();
        C16880lQ.LLLZ("BillingManager: result of query skuDetails list asynchronously is billingResult code is %s,skuDetailsList size is %s", objArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C0HQ c0hq = (C0HQ) it.next();
            arrayList.add(new C78439UqR(c0hq));
            if (!((HashMap) this.LIZIZ.LJI).containsKey(c0hq.LIZJ)) {
                ((HashMap) this.LIZIZ.LJI).put(c0hq.LIZJ, c0hq);
            }
        }
        this.LIZ.LIZ(C78897Uxp.LJIJI(c0he), arrayList);
    }
}
