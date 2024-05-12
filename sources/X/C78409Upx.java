package X;

import android.app.Activity;
import android.text.TextUtils;
import com.android.billingclient.api.SkuDetails;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Upx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78409Upx implements InterfaceC04930Hh {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ C0HE LIZIZ;
    public final /* synthetic */ Activity LIZJ;
    public final /* synthetic */ C04920Hg LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ OrderData LJFF;
    public final /* synthetic */ InterfaceC78435UqN LJI;
    public final /* synthetic */ C78407Upv LJII;

    @Override // X.InterfaceC04930Hh
    public final void onSkuDetailsResponse(C0HE c0he, List<SkuDetails> list) {
        C78332Uoi.LIZJ().LJI(this.LIZ, c0he, this.LIZIZ);
        int i = c0he.LIZ;
        if (i == 0) {
            if (list == null || list.isEmpty()) {
                C78368UpI c78368UpI = new C78368UpI(-1, -1, "-1:google details is empty, doesn't has this product.");
                C78273Unl.LJIIIZ().LJ().getClass();
                LIZ(this.LJ, this.LJFF, c78368UpI);
                return;
            }
            for (SkuDetails skuDetails : list) {
                if (skuDetails != null) {
                    ((HashMap) this.LJII.LJI).put(skuDetails.LIZ(), skuDetails);
                }
            }
            Object obj = ((HashMap) this.LJII.LJI).get(this.LJ);
            if (obj != null) {
                C0H5 c0h5 = new C0H5();
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                c0h5.LIZLLL = arrayList;
                C0HB LIZ = C78400Upo.LIZ(c0h5, this.LJFF);
                C78407Upv c78407Upv = this.LJII;
                Activity activity = this.LIZJ;
                String str = this.LJ;
                InterfaceC78435UqN interfaceC78435UqN = this.LJI;
                c78407Upv.getClass();
                interfaceC78435UqN.LIZJ(LIZ);
                ((ConcurrentHashMap) c78407Upv.LIZIZ).put(str, interfaceC78435UqN);
                interfaceC78435UqN.LIZ();
                interfaceC78435UqN.LJI();
                c78407Upv.LJIIJJI.LJFF(activity, LIZ);
                return;
            }
            C78368UpI c78368UpI2 = new C78368UpI(-2, -1, "-2:google details doesn't has this product.");
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            Object[] objArr = {this.LJ};
            LJ.getClass();
            C16880lQ.LLLZ("BillingManager: onQuerySkuDetailsSuccess but doesn't contain %s", objArr);
            LIZ(this.LJ, this.LJFF, c78368UpI2);
            return;
        }
        if (this.LIZ == 0) {
            if (i == -3) {
                this.LJII.LIZJ(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, 1, c0he);
                return;
            }
            if (i == -1) {
                this.LJII.LIZIZ(new C78425UqD(this, c0he));
                return;
            }
            if (TextUtils.equals("An internal error occurred.", c0he.LIZIZ)) {
                this.LJII.LIZJ(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LIZ + 1, c0he);
                return;
            }
            C78368UpI LJIJI = C78897Uxp.LJIJI(c0he);
            C78273Unl.LJIIIZ().LJ().getClass();
            C16880lQ.LLLZ("BillingManager: querySkuDetailsAsync before execute new purchase had error, result: %s", new Object[]{LJIJI});
            LIZ(this.LJ, this.LJFF, LJIJI);
            return;
        }
        C78368UpI LJIJI2 = C78897Uxp.LJIJI(c0he);
        C78273Unl.LJIIIZ().LJ().getClass();
        C16880lQ.LLLZ("BillingManager: querySkuDetailsAsync before execute new purchase had error, result: %s", new Object[]{LJIJI2});
        LIZ(this.LJ, this.LJFF, LJIJI2);
    }

    public final void LIZ(String str, OrderData orderData, C78368UpI c78368UpI) {
        C78332Uoi.LIZJ().LJFF(str, orderData.getOrderId(), orderData.getIapPayRequest().LIZIZ, orderData.getUserId(), c78368UpI);
        InterfaceC78435UqN interfaceC78435UqN = this.LJI;
        if (interfaceC78435UqN != null) {
            interfaceC78435UqN.LIZLLL(c78368UpI, null, null);
        }
        this.LJII.LJIIIIZZ.compareAndSet(true, false);
    }

    public C78409Upx(C78407Upv c78407Upv, int i, C0HE c0he, Activity activity, C04920Hg c04920Hg, String str, OrderData orderData, InterfaceC78435UqN interfaceC78435UqN) {
        this.LJII = c78407Upv;
        this.LIZ = i;
        this.LIZIZ = c0he;
        this.LIZJ = activity;
        this.LIZLLL = c04920Hg;
        this.LJ = str;
        this.LJFF = orderData;
        this.LJI = interfaceC78435UqN;
    }
}
