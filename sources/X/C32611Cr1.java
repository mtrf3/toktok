package X;

import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Cr1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32611Cr1 implements InterfaceC19890qH {
    public final /* synthetic */ C32609Cqz LJLIL;
    public final /* synthetic */ C32633CrN LJLILLLLZI;

    public C32611Cr1(C32609Cqz c32609Cqz, C32633CrN c32633CrN) {
        this.LJLIL = c32609Cqz;
        this.LJLILLLLZI = c32633CrN;
    }

    @Override // X.InterfaceC19890qH
    public final void onShow() {
        InterfaceC32642CrW mIView = this.LJLIL.getMIView();
        if (mIView != null) {
            mIView.LIZLLL(this.LJLILLLLZI);
        }
        int i = Calendar.getInstance().get(6);
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.i;
        Integer LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GIFT_RANDOM_LAST_DAY.value");
        if (i != LIZJ.intValue()) {
            if (C32636CrQ.LIZ().get(Integer.valueOf(i)) == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!C32636CrQ.LIZ().isEmpty()) {
                    linkedHashMap.putAll(C32636CrQ.LIZ());
                }
                linkedHashMap.put(Integer.valueOf(i), Boolean.TRUE);
                InterfaceC30442Bx8.j.LIZ(linkedHashMap);
                InterfaceC30442Bx8.h.LIZ(Integer.valueOf(C32636CrQ.LIZIZ() + 1));
            }
            c48459J0d.LIZ(Integer.valueOf(i));
        }
        B52.LIZIZ("gift_guide_bubble_show", new OSZ("show_reason", "random_effect_gift"));
    }
}
