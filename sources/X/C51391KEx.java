package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.utils.Au2S17S0100000_8;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.KEx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51391KEx extends AbstractC51386KEs {
    @Override // X.InterfaceC70514Rlu
    public final void W0() {
        C188727au LIZ = LIZ();
        String str = getEntranceModel().LJIIIZ;
        if (str == null) {
            str = getEntranceModel().LIZ;
        }
        LIZ.LJIIIZ("enter_from", str);
        LIZ.LJIIIZ("search_entrance", getEntranceModel().LJII);
        java.util.Map<String, String> map = LIZ.LIZ;
        o.LJIIIIZZ(map, "generateGeneralLogEventM…               .builder()");
        C76542zS.LIZ("show_search", map);
    }

    @Override // X.AbstractC51386KEs
    public final SmartRoute LIZIZ(Context context) {
        SmartRoute LIZIZ = super.LIZIZ(context);
        if (LIZIZ != null) {
            LIZIZ.withParam("set_hint_by_sug_word", true);
            return LIZIZ;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51391KEx(Context context, ECSearchEntranceData eCSearchEntranceData, KEK kek, InterfaceC65784Pro interfaceC65784Pro) {
        super(context, eCSearchEntranceData, kek, interfaceC65784Pro);
        a1.LJFF(context, "context");
        Context context2 = getContext();
        if (context2 != null) {
            TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
            tuxIconView.setIconRes(R.raw.icon_magnifying_glass);
            Integer LJI = C79045V0n.LJI(R.attr.go, context2);
            if (LJI != null) {
                tuxIconView.setTintColor(LJI.intValue());
            }
            tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
            tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
            addView(tuxIconView);
        }
        C16880lQ.LJIIJ(new Au2S17S0100000_8(this, 1), this);
    }
}
