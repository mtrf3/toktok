package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Upy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78410Upy implements C0HS {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ C0HE LIZIZ;
    public final /* synthetic */ OrderData LIZJ;
    public final /* synthetic */ Activity LIZLLL;
    public final /* synthetic */ C04870Hb LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ InterfaceC78435UqN LJI;
    public final /* synthetic */ C78408Upw LJII;

    @Override // X.C0HS
    public final void LIZ(C0HE c0he, List<C0HQ> list) {
        C78332Uoi.LIZJ().LJI(this.LIZ, c0he, this.LIZIZ);
        int i = c0he.LIZ;
        if (i == 0) {
            OrderData orderData = this.LIZJ;
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty()) {
                C78368UpI c78368UpI = new C78368UpI(-1, -1, "-1:google details is empty, doesn't has this product.");
                C78273Unl.LJIIIZ().LJ().getClass();
                LIZIZ(this.LIZJ, c78368UpI);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0HQ c0hq = (C0HQ) it.next();
                if (c0hq != null) {
                    ((HashMap) this.LJII.LJI).put(c0hq.LIZJ, c0hq);
                }
            }
            C0HQ c0hq2 = (C0HQ) ((HashMap) this.LJII.LJI).get(this.LJFF);
            if (c0hq2 != null) {
                C0HB LIZ = C78400Upo.LIZ(this.LJII.LJ(c0hq2.LIZJ, orderData), this.LIZJ);
                C78408Upw c78408Upw = this.LJII;
                Activity activity = this.LIZLLL;
                String str = this.LJFF;
                InterfaceC78435UqN interfaceC78435UqN = this.LJI;
                c78408Upw.getClass();
                interfaceC78435UqN.LIZJ(LIZ);
                ((ConcurrentHashMap) c78408Upw.LIZIZ).put(str, interfaceC78435UqN);
                interfaceC78435UqN.LIZ();
                interfaceC78435UqN.LJI();
                c78408Upw.LJIIJJI.LJFF(activity, LIZ);
                return;
            }
            C78368UpI c78368UpI2 = new C78368UpI(-2, -1, "-2:google details doesn't has this product.");
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            Object[] objArr = {this.LJFF};
            LJ.getClass();
            C16880lQ.LLLZ("BillingManager: onQuerySkuDetailsSuccess but doesn't contain %s", objArr);
            LIZIZ(this.LIZJ, c78368UpI2);
            return;
        }
        if (this.LIZ == 0) {
            if (i == -3) {
                this.LJII.LIZLLL(this.LIZLLL, this.LJ, this.LJFF, this.LIZJ, this.LJI, 1, c0he);
                return;
            }
            if (i == -1) {
                this.LJII.LIZJ(new C78426UqE(this, c0he));
                return;
            }
            if (TextUtils.equals("An internal error occurred.", c0he.LIZIZ)) {
                this.LJII.LIZLLL(this.LIZLLL, this.LJ, this.LJFF, this.LIZJ, this.LJI, this.LIZ + 1, c0he);
                return;
            }
            C78368UpI LJIJI = C78897Uxp.LJIJI(c0he);
            C78273Unl.LJIIIZ().LJ().getClass();
            C16880lQ.LLLZ("BillingManager: querySkuDetailsAsync before execute new purchase had error, result: %s", new Object[]{LJIJI});
            LIZIZ(this.LIZJ, LJIJI);
            return;
        }
        C78368UpI LJIJI2 = C78897Uxp.LJIJI(c0he);
        C78273Unl.LJIIIZ().LJ().getClass();
        C16880lQ.LLLZ("BillingManager: querySkuDetailsAsync before execute new purchase had error, result: %s", new Object[]{LJIJI2});
        LIZIZ(this.LIZJ, LJIJI2);
    }

    public final void LIZIZ(OrderData orderData, C78368UpI c78368UpI) {
        C78332Uoi.LIZJ().LJFF(this.LJFF, orderData.getOrderId(), orderData.getIapPayRequest().LIZIZ, orderData.getUserId(), c78368UpI);
        InterfaceC78435UqN interfaceC78435UqN = this.LJI;
        if (interfaceC78435UqN != null) {
            interfaceC78435UqN.LJIIIZ(c78368UpI, null, null);
        }
        this.LJII.LJIIIIZZ.compareAndSet(true, false);
    }

    public C78410Upy(C78408Upw c78408Upw, int i, C0HE c0he, OrderData orderData, Activity activity, C04870Hb c04870Hb, String str, InterfaceC78435UqN interfaceC78435UqN) {
        this.LJII = c78408Upw;
        this.LIZ = i;
        this.LIZIZ = c0he;
        this.LIZJ = orderData;
        this.LIZLLL = activity;
        this.LJ = c04870Hb;
        this.LJFF = str;
        this.LJI = interfaceC78435UqN;
    }
}
