package X;

import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.UdB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77617UdB implements InterfaceC77693UeP {
    @Override // X.InterfaceC77693UeP
    public final void LIZ(C77667Udz c77667Udz, long j) {
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.nun);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_recharge_giftbox)");
        c77667Udz.LIZLLL = LJIILJJIL;
        c77667Udz.LIZIZ = new C63129Oq5(CFX.LIZ("tiktok_live_link_mic", "tiktok_live_revenue_demand_1"), "ttlive_ic_wallet_recharge_single_gift_box.webp");
    }

    @Override // X.InterfaceC77693UeP
    public final boolean LIZIZ(long j, String chargeReason) {
        o.LJIIIZ(chargeReason, "chargeReason");
        Iterator it = C47261Igj.LJJIJIL("git_box").iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (o.LJ(next, chargeReason)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
