package X;

import com.bytedance.android.live.wallet.viewmodel.recharge.singlepage.SingleRechargeVM;
import java.util.HashMap;

/* renamed from: X.Uco, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77594Uco implements InterfaceC77748UfI {
    public final /* synthetic */ SingleRechargeVM LIZ;

    public C77594Uco(SingleRechargeVM singleRechargeVM) {
        this.LIZ = singleRechargeVM;
    }

    @Override // X.InterfaceC77748UfI
    public final void LIZ(String str, HashMap hashMap) {
        HashMap LIZ = C1R5.LIZ(str, "serviceName");
        if (hashMap != null) {
            LIZ.putAll(hashMap);
        }
        LIZ.putAll(this.LIZ.LJLLL.LIZIZ);
        int i = this.LIZ.rv0().count;
        SingleRechargeVM singleRechargeVM = this.LIZ;
        C77541Ubx.LJIJI(i, singleRechargeVM.LJLLL, singleRechargeVM.LJLLLL, false, LIZ, singleRechargeVM.rv0(), true, this.LIZ.LJLJL, false, false);
    }
}
