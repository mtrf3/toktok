package X;

import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Uq6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78418Uq6 implements InterfaceC78437UqP {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ InterfaceC78385UpZ LIZJ;
    public final /* synthetic */ C78407Upv LIZLLL;

    @Override // X.InterfaceC78437UqP
    public final void LIZIZ() {
        String str;
        if (this.LIZ) {
            str = "subs";
        } else {
            str = "inapp";
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = str;
        StringBuilder LIZ = X1D.LIZ();
        List list = this.LIZIZ;
        if (list != null) {
            i = list.size();
        }
        objArr[1] = C08380Uo.LIZ(LIZ, i, "", LIZ);
        LJ.getClass();
        C16880lQ.LLLZ("BillingManager: query skuDetails list from google service, itemType: %s, skuList length is: %s", objArr);
        C04910Hf c04910Hf = new C04910Hf();
        c04910Hf.LIZIZ = new ArrayList(this.LIZIZ);
        c04910Hf.LIZ = str;
        C1FD c1fd = this.LIZLLL.LJIIJJI;
        C04920Hg LIZ2 = c04910Hf.LIZ();
        final InterfaceC78385UpZ interfaceC78385UpZ = this.LIZJ;
        c1fd.LIZ(LIZ2, new InterfaceC04930Hh() { // from class: X.Uq2
            @Override // X.InterfaceC04930Hh
            public final void onSkuDetailsResponse(C0HE c0he, List list2) {
                Object LIZIZ;
                C78418Uq6 c78418Uq6 = C78418Uq6.this;
                InterfaceC78385UpZ interfaceC78385UpZ2 = interfaceC78385UpZ;
                c78418Uq6.getClass();
                C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
                Object[] objArr2 = new Object[2];
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(c0he.LIZ);
                LIZ3.append(":");
                LIZ3.append(c0he.LIZIZ);
                objArr2[0] = X1D.LIZIZ(LIZ3);
                if (list2 == null) {
                    LIZIZ = 0;
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(list2.size());
                    LIZ4.append("");
                    LIZIZ = X1D.LIZIZ(LIZ4);
                }
                objArr2[1] = LIZIZ;
                LJ2.getClass();
                C16880lQ.LLLZ("BillingManager: result of query skuDetails list asynchronously is billingResult code is %s,skuDetailsList size is %s", objArr2);
                ArrayList arrayList = new ArrayList();
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        SkuDetails skuDetails = (SkuDetails) it.next();
                        arrayList.add(new C78438UqQ(skuDetails));
                        if (!((HashMap) c78418Uq6.LIZLLL.LJI).containsKey(skuDetails.LIZ())) {
                            ((HashMap) c78418Uq6.LIZLLL.LJI).put(skuDetails.LIZ(), skuDetails);
                        }
                    }
                }
                interfaceC78385UpZ2.LIZ(C78897Uxp.LJIJI(c0he), arrayList);
            }
        });
    }

    @Override // X.InterfaceC78437UqP
    public final void LIZ(C78368UpI c78368UpI) {
        this.LIZJ.LIZ(c78368UpI, null);
    }

    public C78418Uq6(C78407Upv c78407Upv, boolean z, List list, InterfaceC78385UpZ interfaceC78385UpZ) {
        this.LIZLLL = c78407Upv;
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = interfaceC78385UpZ;
    }
}
