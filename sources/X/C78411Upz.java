package X;

import android.app.Activity;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Upz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78411Upz implements InterfaceC78437UqP {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ OrderData LIZLLL;
    public final /* synthetic */ InterfaceC78435UqN LJ;
    public final /* synthetic */ C78407Upv LJFF;

    @Override // X.InterfaceC78437UqP
    public final void LIZIZ() {
        String str;
        if (this.LJFF.LJIIIIZZ.get()) {
            C78273Unl.LJIIIZ().LJ().getClass();
            return;
        }
        this.LJFF.LJIIIIZZ.compareAndSet(false, true);
        C78407Upv c78407Upv = this.LJFF;
        Activity activity = this.LIZ;
        String str2 = this.LIZIZ;
        boolean z = this.LIZJ;
        OrderData orderData = this.LIZLLL;
        InterfaceC78435UqN interfaceC78435UqN = this.LJ;
        Object obj = ((HashMap) c78407Upv.LJI).get(str2);
        if (obj != null) {
            C0H5 c0h5 = new C0H5();
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            c0h5.LIZLLL = arrayList;
            C0HB LIZ = C78400Upo.LIZ(c0h5, orderData);
            interfaceC78435UqN.LIZJ(LIZ);
            ((ConcurrentHashMap) c78407Upv.LIZIZ).put(str2, interfaceC78435UqN);
            interfaceC78435UqN.LIZ();
            interfaceC78435UqN.LJI();
            c78407Upv.LJIIJJI.LJFF(activity, LIZ);
            return;
        }
        ArrayList LIZIZ = C05040Hs.LIZIZ(str2);
        C04910Hf c04910Hf = new C04910Hf();
        c04910Hf.LIZIZ = new ArrayList(LIZIZ);
        if (z) {
            str = "subs";
        } else {
            str = "inapp";
        }
        c04910Hf.LIZ = str;
        c78407Upv.LIZJ(activity, c04910Hf.LIZ(), str2, orderData, interfaceC78435UqN, 0, null);
    }

    @Override // X.InterfaceC78437UqP
    public final void LIZ(C78368UpI c78368UpI) {
        InterfaceC78435UqN interfaceC78435UqN = this.LJ;
        if (interfaceC78435UqN != null) {
            interfaceC78435UqN.LIZLLL(c78368UpI, null, null);
        }
    }

    public C78411Upz(C78407Upv c78407Upv, Activity activity, String str, boolean z, OrderData orderData, C78315UoR c78315UoR) {
        this.LJFF = c78407Upv;
        this.LIZ = activity;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = orderData;
        this.LJ = c78315UoR;
    }
}
