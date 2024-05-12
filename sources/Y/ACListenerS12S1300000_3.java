package Y;

import X.ActivityC45651qj;
import X.C05040Hs;
import X.C43001GuD;
import X.C62395OeF;
import X.C7Y9;
import X.FMX;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ACListenerS12S1300000_3 implements View.OnClickListener {
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

    public static final void onClick$0(ACListenerS12S1300000_3 aCListenerS12S1300000_3, View view) {
        float f;
        int i;
        String str;
        String str2 = aCListenerS12S1300000_3.s0;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) aCListenerS12S1300000_3.l1;
        if (poiDetailResponse != null && (str = poiDetailResponse.collectInfo) != null) {
            str3 = str;
        }
        Double d = ((PoiReviewsApi.PoiReviewSummaryModel) aCListenerS12S1300000_3.l2).score;
        if (d != null) {
            f = (float) d.doubleValue();
        } else {
            f = 0.0f;
        }
        Long l = ((PoiReviewsApi.PoiReviewSummaryModel) aCListenerS12S1300000_3.l2).totalCount;
        if (l != null) {
            i = (int) l.longValue();
        } else {
            i = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "poi_detail");
        linkedHashMap.put("poi_id", str2);
        C43001GuD.LIZJ(str3, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("review_cnt", String.valueOf(i));
        FMX.LJIIL("click_reviews_summary", linkedHashMap);
        SmartRoute buildRoute = SmartRouter.buildRoute(((PoiDetailContentHeaderBaseAssemV3) aCListenerS12S1300000_3.l3).getContext(), "//poi/review_list");
        buildRoute.withParam("poi_id", aCListenerS12S1300000_3.s0);
        C05040Hs.LJ(buildRoute, "enter_from", "poi_detail", "enter_method", "click_reviews_summary");
    }

    public static final void onClick$1(ACListenerS12S1300000_3 aCListenerS12S1300000_3, View view) {
        boolean z;
        MusicReleaseInfo musicReleaseInfo = ((MatchedPGCSoundInfo) aCListenerS12S1300000_3.l1).getMusicReleaseInfo();
        boolean z2 = false;
        if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
            z = true;
        } else {
            z = false;
        }
        String id = ((MatchedPGCSoundInfo) aCListenerS12S1300000_3.l1).getId();
        String str = aCListenerS12S1300000_3.s0;
        String str2 = (String) ((MusicPgcMetaInfoAssem) aCListenerS12S1300000_3.l2).LJLJLLL.getValue();
        if (z && C7Y9.LIZ()) {
            z2 = true;
        }
        C62395OeF.LIZJ(id, str, z, str2, z2);
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        SmartRoute buildRoute = SmartRouter.buildRoute((ActivityC45651qj) aCListenerS12S1300000_3.l3, "aweme://music/detail/");
        buildRoute.withParam("id", ((MatchedPGCSoundInfo) aCListenerS12S1300000_3.l1).getId());
        buildRoute.withParam("process_id", uuid);
        buildRoute.open();
    }

    public ACListenerS12S1300000_3(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
