package X;

import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.HashMap;

/* renamed from: X.Uck, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77590Uck implements InterfaceC77748UfI {
    public final /* synthetic */ RechargeViewModel LIZ;

    public C77590Uck(RechargeViewModel rechargeViewModel) {
        this.LIZ = rechargeViewModel;
    }

    @Override // X.InterfaceC77748UfI
    public final void LIZ(String str, HashMap hashMap) {
        int i;
        java.util.Map<String, String> map;
        HashMap LIZ = C1R5.LIZ(str, "serviceName");
        if (hashMap != null) {
            LIZ.putAll(hashMap);
        }
        C77591Ucl c77591Ucl = this.LIZ.LJLLLL;
        if (c77591Ucl != null && (map = c77591Ucl.LIZIZ) != null) {
            LIZ.putAll(map);
        }
        RechargeViewModel rechargeViewModel = this.LIZ;
        Diamond diamond = rechargeViewModel.LLIILII;
        if (diamond != null) {
            i = diamond.count;
        } else {
            i = 0;
        }
        C77541Ubx.LJIJI(i, rechargeViewModel.LJLLLL, rechargeViewModel.LJLLLLLL, rechargeViewModel.LLIIIILZ, LIZ, rechargeViewModel.LLIIL, false, rechargeViewModel.LJLJL, rechargeViewModel.LLIIIZ, rechargeViewModel.rv0());
    }
}
