package X;

import android.app.Activity;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Uq4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78416Uq4 implements InterfaceC78437UqP {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ OrderData LIZLLL;
    public final /* synthetic */ InterfaceC78435UqN LJ;
    public final /* synthetic */ C78408Upw LJFF;

    @Override // X.InterfaceC78437UqP
    public final void LIZIZ() {
        String str;
        if (this.LJFF.LJIIIIZZ.get()) {
            C78273Unl.LJIIIZ().LJ().getClass();
            return;
        }
        this.LJFF.LJIIIIZZ.compareAndSet(false, true);
        C78408Upw c78408Upw = this.LJFF;
        Activity activity = this.LIZ;
        String str2 = this.LIZIZ;
        boolean z = this.LIZJ;
        OrderData orderData = this.LIZLLL;
        InterfaceC78435UqN interfaceC78435UqN = this.LJ;
        C0H5 LJ = c78408Upw.LJ(str2, orderData);
        if (LJ != null) {
            C0HB LIZ = C78400Upo.LIZ(LJ, orderData);
            interfaceC78435UqN.LIZJ(LIZ);
            ((ConcurrentHashMap) c78408Upw.LIZIZ).put(str2, interfaceC78435UqN);
            interfaceC78435UqN.LIZ();
            interfaceC78435UqN.LJI();
            c78408Upw.LJIIJJI.LJFF(activity, LIZ);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C0HY c0hy = new C0HY();
        c0hy.LIZ = str2;
        if (z) {
            str = "subs";
        } else {
            str = "inapp";
        }
        c0hy.LIZIZ = str;
        arrayList.add(c0hy.LIZ());
        C0HX c0hx = new C0HX();
        c0hx.LIZ(arrayList);
        c78408Upw.LIZLLL(activity, new C04870Hb(c0hx), str2, orderData, interfaceC78435UqN, 0, null);
    }

    @Override // X.InterfaceC78437UqP
    public final void LIZ(C78368UpI c78368UpI) {
        InterfaceC78435UqN interfaceC78435UqN = this.LJ;
        if (interfaceC78435UqN != null) {
            interfaceC78435UqN.LJIIIZ(c78368UpI, null, null);
        }
    }

    public C78416Uq4(C78408Upw c78408Upw, Activity activity, String str, boolean z, OrderData orderData, C78315UoR c78315UoR) {
        this.LJFF = c78408Upw;
        this.LIZ = activity;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = orderData;
        this.LJ = c78315UoR;
    }
}
