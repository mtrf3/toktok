package Y;

import X.C05040Hs;
import X.C6ZT;
import X.FMX;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ACListenerS25S1000000_3 implements View.OnClickListener {
    public final int $t;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public ACListenerS25S1000000_3(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final void onClick$0(ACListenerS25S1000000_3 aCListenerS25S1000000_3, View v) {
        o.LJIIIZ(v, "v");
        if (C6ZT.LIZ(v)) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(v.getContext(), "//webview");
        buildRoute.withParam(UriProtector.parse(aCListenerS25S1000000_3.s0));
        buildRoute.withParam("use_webview_title", true);
        buildRoute.open();
    }

    public static final void onClick$1(ACListenerS25S1000000_3 aCListenerS25S1000000_3, View view) {
        String enterFrom = aCListenerS25S1000000_3.s0;
        o.LJIIIZ(enterFrom, "enterFrom");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", enterFrom);
        linkedHashMap.put("enter_method", "favourite_poi_toast");
        FMX.LJIIL("enter_favourite_places", linkedHashMap);
        SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://favorite/");
        buildRoute.withParam("tab_name", "places");
        C05040Hs.LJ(buildRoute, "enter_from", aCListenerS25S1000000_3.s0, "enter_method", "favourite_poi_toast");
    }
}
