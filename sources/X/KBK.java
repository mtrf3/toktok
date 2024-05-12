package X;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KBK extends C51387KEt {
    public final SmartRoute LJLLJ;
    public final java.util.Map<Integer, View> LJLLL;

    @Override // X.C51387KEt
    public final View LIZJ(int i) {
        java.util.Map<Integer, View> map = this.LJLLL;
        Integer valueOf = Integer.valueOf(R.id.miy);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.miy);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.C51387KEt
    public final void LJII() {
    }

    @Override // X.C51387KEt, X.InterfaceC70514Rlu
    public final void W0() {
    }

    @Override // X.C51387KEt, X.AbstractC51386KEs, X.InterfaceC70514Rlu
    public final void Y0() {
    }

    @Override // X.AbstractC51386KEs
    public SmartRoute getSmartRoute() {
        return this.LJLLJ;
    }

    @Override // X.C51387KEt, X.AbstractC51386KEs
    public final SmartRoute LIZIZ(Context context) {
        SmartRoute LIZIZ = super.LIZIZ(context);
        if (LIZIZ != null) {
            LIZIZ.withParam("ec_entrance_new_arch", "1");
            LIZIZ.withParam("back_flag", "1");
            LIZIZ.withParam("search_hint_word", "");
            LIZIZ.withParam("last_search_position", KAK.SHOP.getTabName());
            LIZIZ.withParam("direct_to_page", EnumC50961JzJ.SUG_PAGE.getPageName());
            LIZIZ.withParam("sug_search_word", getEntranceModel().LJ);
            return LIZIZ;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KBK(Context context, ECSearchEntranceData eCSearchEntranceData, KEK kek, InterfaceC65784Pro interfaceC65784Pro) {
        super(context, eCSearchEntranceData, kek, interfaceC65784Pro);
        this.LJLLL = C62850Ola.LJFF(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//ec/search");
        o.LJIIIIZZ(buildRoute, "buildRoute(\n        cont…nts.URL_ECOM_SEARCH\n    )");
        this.LJLLJ = buildRoute;
    }
}
