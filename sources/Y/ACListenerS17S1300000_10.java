package Y;

import X.C025908h;
import X.C188727au;
import X.C2PD;
import X.EBF;
import X.EnumC85244Xcu;
import X.FMX;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PoiReTagBottomBarAssem;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ACListenerS17S1300000_10 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final void onClick$0(ACListenerS17S1300000_10 aCListenerS17S1300000_10, View view) {
        CommentInputFragment commentInputFragment = (CommentInputFragment) aCListenerS17S1300000_10.l1;
        String str = aCListenerS17S1300000_10.s0;
        Aweme aweme = (Aweme) aCListenerS17S1300000_10.l2;
        AwemeCommerceStruct awemeCommerceStruct = (AwemeCommerceStruct) aCListenerS17S1300000_10.l3;
        commentInputFragment.getClass();
        StringBuilder LIZ = X1D.LIZ();
        String str2 = "https%3A%2F%2Finapp.tiktokv.com%2Fad%2Ftetris%2Fexperience%2Ffeedback_form%3fhide_nav_bar%3d1%26report_type%3d3";
        try {
            StringBuilder sb = new StringBuilder("aweme://webview/?url=");
            SettingsManager.LIZLLL().getClass();
            sb.append(SettingsManager.LJI("report_ads_problem_schema_setting", "https%3A%2F%2Finapp.tiktokv.com%2Fad%2Ftetris%2Fexperience%2Ffeedback_form%3fhide_nav_bar%3d1%26report_type%3d3"));
            str2 = sb.toString();
        } catch (Throwable unused) {
        }
        String LIZIZ = C025908h.LIZIZ(LIZ, str2, "%26selectTab%3d", str, LIZ);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creativeId", aweme.getCommerceVideoAuthInfo().getCreativeId());
        FMX.LJIIL("select_report_ads", c188727au.LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(commentInputFragment.getContext(), LIZIZ);
        buildRoute.withParam("bundle_ad_id_from_aweme", awemeCommerceStruct.getAdId());
        buildRoute.withParam("bundle_advertiser_id_from_aweme", awemeCommerceStruct.getAdvId());
        buildRoute.withParam("bundle_creative_id_from_aweme", awemeCommerceStruct.getCreativeId());
        buildRoute.withParam("bundle_item_id_from_aweme", awemeCommerceStruct.getItemId());
        buildRoute.withParam("bundle_view_time_from_aweme", awemeCommerceStruct.getLastViewTime());
        buildRoute.withParam("bundle_desc_from_aweme", aweme.getDesc());
        if (aweme.getVideo() != null && aweme.getVideo().getCover() != null && aweme.getVideo().getCover().getUrlList() != null && aweme.getVideo().getCover().getUrlList().size() > 0) {
            buildRoute.withParam("bundle_cover_url_from_aweme", (String) ListProtector.get(aweme.getVideo().getCover().getUrlList(), 0));
        }
        buildRoute.open();
    }

    public static final void onClick$1(ACListenerS17S1300000_10 aCListenerS17S1300000_10, View view) {
        ViewGroup viewGroup = ((PoiReTagBottomBarAssem) aCListenerS17S1300000_10.l1).LLFII;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        String aid = ((Aweme) aCListenerS17S1300000_10.l2).getAid();
        String str = "";
        if (aid == null) {
            aid = "";
        }
        Set<String> stringSet = EBF.LIZIZ().getStringSet("key_poi_re_tag_aid", new LinkedHashSet());
        o.LJIIIIZZ(stringSet, "INSTANCE.getStringSet(KE…_TAG_AID, mutableSetOf())");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(stringSet);
        linkedHashSet.add(aid);
        EBF.LIZIZ().storeStringSet("key_poi_re_tag_aid", linkedHashSet);
        SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "//poi/search");
        buildRoute.withParam("page_scene", EnumC85244Xcu.POI_RE_TAG);
        buildRoute.withParam("aid", ((Aweme) aCListenerS17S1300000_10.l2).getAid());
        String str2 = aCListenerS17S1300000_10.s0;
        if (str2 == null) {
            str2 = "";
        }
        buildRoute.withParam("poi_mob_param", new PoiMobParam(null, null, null, null, str2, Integer.valueOf(((VideoItemParams) aCListenerS17S1300000_10.l3).getAweme().getAwemeType()), null, 79, null));
        buildRoute.open();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = aCListenerS17S1300000_10.s0;
        VideoItemParams videoItemParams = (VideoItemParams) aCListenerS17S1300000_10.l3;
        if (str3 != null) {
            str = str3;
        }
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", "click_re_tag_entrance");
        linkedHashMap.put("aweme_type", String.valueOf(videoItemParams.getAweme().getAwemeType()));
        linkedHashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("enter_poi_search", linkedHashMap);
        C2PD.LIZ(Integer.valueOf(((Aweme) aCListenerS17S1300000_10.l2).getAwemeType()), aCListenerS17S1300000_10.s0, ((Aweme) aCListenerS17S1300000_10.l2).getAuthorUid(), ((Aweme) aCListenerS17S1300000_10.l2).getGroupId(), true);
    }

    public ACListenerS17S1300000_10(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
