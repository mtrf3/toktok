package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JX8 extends JSR implements JX9, InterfaceC49672JeW, InterfaceC49368JZc {
    public static int LJLJJL = 10;
    public final List<String> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JX8(JTS bulletContext) {
        super(bulletContext);
        o.LJIIIZ(bulletContext, "bulletContext");
        JTV jtv = (JTV) bulletContext.LJIIL.getValue();
        jtv.getClass();
        ((ArrayList) jtv.LIZ).add(this);
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = C221108m2.LIZIZ(new AqS155S0200000_8(bulletContext, this, 46));
    }

    @Override // X.InterfaceC49368JZc
    public final void LIZIZ(F3T f3t) {
        f3t.LJ(InterfaceC49672JeW.class, new F25(this));
    }

    @Override // X.InterfaceC49672JeW
    public final boolean LIZJ(JSONObject params) {
        String str;
        o.LJIIIZ(params, "params");
        JSONObject optJSONObject = params.optJSONObject("search_extra");
        if (optJSONObject != null) {
            str = optJSONObject.optString("video_from");
        } else {
            str = null;
        }
        if (o.LJ(str, "from_search_continuous_loading_card")) {
            return true;
        }
        return false;
    }

    @Override // X.JX9
    public final void LIZLLL(Aweme aweme, String str) {
        if (!TextUtils.equals(aweme.getAid(), this.LJLJJI)) {
            JTS jts = this.LJLIL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scroll_aweme_id", aweme.getAid());
            jSONObject.put("cid", aweme.getChallengeId());
            JT6 jt6 = (JT6) this.LJLJI.getValue();
            if (jt6 != null && o.LJ(str, "from_search_continuous_loading_card")) {
                C50420Jqa c50420Jqa = new C50420Jqa(21);
                c50420Jqa.LJLJJI = str;
                jt6.LJFF(c50420Jqa, aweme, new AqS190S0100000_8(jSONObject, 85));
            }
            C50340JpI c50340JpI = jts.LJIILLIIL;
            if (c50340JpI != null) {
                c50340JpI.LIZ("updateVideoCloseState", jSONObject);
            }
        }
        Iterator it = ((java.util.Map) JXA.LIZIZ.getValue()).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((Reference) entry.getValue()).get() == this || ((Reference) entry.getValue()).get() == null) {
                it.remove();
            }
        }
    }

    @Override // X.InterfaceC49672JeW
    public final boolean LIZ(JSONObject params, Bundle bundle, Bundle bundle2) {
        Integer num;
        String str;
        o.LJIIIZ(params, "params");
        ActivityC45651qj activityC45651qj = this.LJLIL.LIZIZ;
        if (activityC45651qj != null) {
            ((java.util.Map) JXA.LIZIZ.getValue()).put(Integer.valueOf(activityC45651qj.hashCode()), new WeakReference(this));
        }
        this.LJLJJI = params.optString("current_item_id");
        JSONArray optJSONArray = params.optJSONArray("item_ids");
        int length = optJSONArray.length();
        ((ArrayList) this.LJLILLLLZI).clear();
        for (int i = 0; i < length; i++) {
            List<String> list = this.LJLILLLLZI;
            String optString = optJSONArray.optString(i);
            o.LJIIIIZZ(optString, "ids.optString(i)");
            ((ArrayList) list).add(optString);
        }
        LJLJJL = bundle.getInt("item_size", 10);
        JSONObject optJSONObject = params.optJSONObject("search_extra");
        if (optJSONObject != null) {
            num = Integer.valueOf(optJSONObject.optInt("type"));
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 2) {
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65456);
            } else if (num.intValue() == 4) {
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65458);
            }
        }
        JT6 jt6 = (JT6) this.LJLJI.getValue();
        if (optJSONObject != null) {
            str = optJSONObject.optString("video_from");
        } else {
            str = null;
        }
        if (o.LJ(str, "from_search_continuous_loading_card")) {
            if (params.optBoolean("use_general_search_video_flow") && o.LJ(params.optString("from_card_type"), "tt_featured_answer")) {
                C2U8.LIZ(new C2PJ(this.LJLJJI));
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
                bundle.putString("video_from", "from_search_mix");
                bundle.putBoolean("is_update_search_result_id", true);
                SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL.LIZ.getContext(), "//aweme/detail");
                buildRoute.withParam(bundle);
                if (bundle2 != null) {
                    buildRoute.withBundleAnimation(bundle2);
                    buildRoute.withParam("activity_has_activity_options", true);
                }
                buildRoute.open();
                return true;
            }
            if (C50452Jr6.LIZ() && params.optBoolean("use_general_search_video_flow")) {
                AqS155S0200000_8 aqS155S0200000_8 = new AqS155S0200000_8(this, bundle, 45);
                if (params.optBoolean("click_on_live_card") && !((RBX) HG3.LJIILL()).isLogin()) {
                    Z9N.LIZIZ.LJJJJLI(aqS155S0200000_8, null);
                } else {
                    aqS155S0200000_8.invoke();
                }
                return true;
            }
            if (jt6 != null) {
                Context context = this.LJLIL.LIZ.getContext();
                o.LJIIIIZZ(context, "bulletContext.itemView.context");
                C49183JRz c49183JRz = new C49183JRz();
                JSONObject optJSONObject2 = params.optJSONObject("search_extra");
                if (optJSONObject2 != null) {
                    c49183JRz.LIZ = optJSONObject2.optString("keyword");
                    c49183JRz.LIZIZ = optJSONObject2.optInt("type");
                    c49183JRz.LIZJ = optJSONObject2.optString("id");
                }
                jt6.LJ(context, bundle, c49183JRz, null);
                return true;
            }
        }
        return false;
    }
}
