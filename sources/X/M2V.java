package X;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$refreshLiveInfoView$4$1", f = "StoreFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class M2V extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ StoreFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2V(StoreFragment storeFragment, String str, String str2, InterfaceC67352kd<? super M2V> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = storeFragment;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String jSONObject;
        C141335gf.LIZJ(obj);
        View view = (View) this.LJLIL;
        Object obj2 = this.LJLILLLLZI.LJLIL.get("source_previous_page");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        if (str != null && o.LJJJJ(str, "_homepage", false) && kotlin.jvm.internal.o.LJ(this.LJLJI, this.LJLJJI)) {
            this.LJLILLLLZI.requireActivity().onBackPressed();
        } else {
            java.util.Map<String, Object> trackParams = this.LJLILLLLZI.LJLIL;
            kotlin.jvm.internal.o.LJIIIZ(trackParams, "trackParams");
            try {
                if (trackParams.isEmpty()) {
                    jSONObject = new JSONObject().putOpt("traffic_source_list", new JSONArray(new int[]{7})).toString();
                    kotlin.jvm.internal.o.LJIIIIZZ(jSONObject, "{\n                JSONOb….toString()\n            }");
                } else {
                    JSONObject jSONObject2 = new JSONObject(trackParams);
                    if (jSONObject2.has("traffic_source_list")) {
                        jSONObject2.putOpt("traffic_source_list", new JSONArray(M2T.LIZJ(7, jSONObject2.get("traffic_source_list").toString())));
                    } else {
                        jSONObject2.putOpt("traffic_source_list", new JSONArray(new int[]{7}));
                    }
                    jSONObject = jSONObject2.toString();
                    kotlin.jvm.internal.o.LJIIIIZZ(jSONObject, "{\n                val tr….toString()\n            }");
                }
            } catch (Exception e) {
                C52966KqY.LIZ(e);
                jSONObject = new JSONObject().putOpt("traffic_source_list", new JSONArray(new int[]{7})).toString();
                kotlin.jvm.internal.o.LJIIIIZZ(jSONObject, "JSONObject().putOpt(TRAF…(sourceType))).toString()");
            }
            Context context = view.getContext();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("aweme://user/profile/");
            LIZ.append(this.LJLJI);
            SmartRoute buildRoute = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ));
            buildRoute.withParam("trackParams", jSONObject);
            buildRoute.open();
        }
        this.LJLILLLLZI.LJLJI.put("click_area", "head");
        b.LJJIJIIJI("tiktokec_module_click", this.LJLILLLLZI.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        M2V m2v = new M2V(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        m2v.LJLIL = view;
        return m2v.invokeSuspend(C76800UCe.LIZ);
    }
}
