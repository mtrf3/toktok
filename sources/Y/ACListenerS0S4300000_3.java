package Y;

import X.AKT;
import X.C198847rE;
import X.C225248si;
import X.C40342FsQ;
import X.C40343FsR;
import X.C72818Shy;
import X.C8RH;
import X.C8RI;
import X.C8RJ;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.model.OwnerInfoModel;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ACListenerS0S4300000_3 implements View.OnClickListener {
    public final int $t;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS0S4300000_3 aCListenerS0S4300000_3, View view) {
        String uid = ((OwnerInfoModel) aCListenerS0S4300000_3.l4).getUid();
        if (uid != null) {
            PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) aCListenerS0S4300000_3.l5;
            ViewGroup viewGroup = (ViewGroup) aCListenerS0S4300000_3.l6;
            String str = aCListenerS0S4300000_3.s0;
            String str2 = aCListenerS0S4300000_3.s1;
            String str3 = aCListenerS0S4300000_3.s2;
            String str4 = aCListenerS0S4300000_3.s3;
            Context context = viewGroup.getContext();
            o.LJIIIIZZ(context, "ownerContainer.context");
            poiDetailContentHeaderBaseAssemV3.getClass();
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://user/profile");
            buildRoute.withParam("uid", uid);
            buildRoute.open();
            C225248si.LJIIL(str, poiDetailContentHeaderBaseAssemV3.LJLJI, str2, str3, str4);
        }
    }

    public static final void onClick$1(ACListenerS0S4300000_3 aCListenerS0S4300000_3, View view) {
        C72818Shy.LIZLLL("closeReviewSubmitPage", (C8RH) aCListenerS0S4300000_3.l4);
        C8RH c8rh = (C8RH) aCListenerS0S4300000_3.l4;
        String poiId = aCListenerS0S4300000_3.s0;
        c8rh.getClass();
        o.LJIIIZ(poiId, "poiId");
        C8RJ.LJJJLL.getClass();
        C8RI.LIZIZ.put(poiId, Integer.valueOf(System.identityHashCode(c8rh)));
        C8RH c8rh2 = (C8RH) aCListenerS0S4300000_3.l4;
        Activity activity = (Activity) aCListenerS0S4300000_3.l5;
        String str = aCListenerS0S4300000_3.s0;
        String str2 = aCListenerS0S4300000_3.s1;
        String str3 = aCListenerS0S4300000_3.s2;
        String str4 = aCListenerS0S4300000_3.s3;
        c8rh2.getClass();
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ((String) c8rh2.LJLJJLL.getValue());
        sparkContext.LJJIIJ("poi_id", str);
        if (str2 == null) {
            str2 = "";
        }
        String encode = Uri.encode(str2);
        o.LJIIIIZZ(encode, "encode(poiName.orEmpty())");
        sparkContext.LJJIIJ("poi_name", encode);
        if (str3 != null) {
            sparkContext.LJJIIJ("enter_from", str3);
        }
        sparkContext.LJJIIJ("enter_method", "poi_review_toast");
        if (str4 == null) {
            str4 = "";
        }
        String encode2 = Uri.encode(str4);
        o.LJIIIIZZ(encode2, "encode(collectInfo.orEmpty())");
        sparkContext.LJJIIJ("collect_info", encode2);
        sparkContext.LJJIFFI(1, "post_source");
        C40343FsR.LJIILJJIL.getClass();
        C40342FsQ.LIZ(activity, sparkContext).LIZIZ();
        PoiReviewFrequencyControl poiReviewFrequencyControl = PoiReviewFrequencyControl.LIZ;
        String poiId2 = aCListenerS0S4300000_3.s0;
        poiReviewFrequencyControl.getClass();
        o.LJIIIZ(poiId2, "poiId");
        String LIZIZ = PoiReviewFrequencyControl.LIZIZ("ts_poi_write_review_toast", poiId2);
        Keva keva = PoiReviewFrequencyControl.LIZIZ;
        keva.storeLong(LIZIZ, System.currentTimeMillis());
        keva.storeInt(PoiReviewFrequencyControl.LIZIZ("count_poi_write_review_toast", poiId2), 0);
        C198847rE.LIZIZ(aCListenerS0S4300000_3.s2, "poi_review_toast", aCListenerS0S4300000_3.s0, aCListenerS0S4300000_3.s3);
        C8RH c8rh3 = (C8RH) aCListenerS0S4300000_3.l4;
        c8rh3.LJLJI = true;
        c8rh3.LJLILLLLZI = 4;
        ((AKT) aCListenerS0S4300000_3.l6).LIZ();
    }

    public static final void onClick$2(ACListenerS0S4300000_3 aCListenerS0S4300000_3, View view) {
        String uid = ((OwnerInfoModel) aCListenerS0S4300000_3.l4).getUid();
        if (uid != null) {
            PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem = (PoiDetailContentHeaderBaseAssem) aCListenerS0S4300000_3.l5;
            ViewGroup viewGroup = (ViewGroup) aCListenerS0S4300000_3.l6;
            String str = aCListenerS0S4300000_3.s0;
            String str2 = aCListenerS0S4300000_3.s1;
            String str3 = aCListenerS0S4300000_3.s2;
            String str4 = aCListenerS0S4300000_3.s3;
            Context context = viewGroup.getContext();
            o.LJIIIIZZ(context, "ownerContainer.context");
            poiDetailContentHeaderBaseAssem.getClass();
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://user/profile");
            buildRoute.withParam("uid", uid);
            buildRoute.open();
            C225248si.LJIIL(str, poiDetailContentHeaderBaseAssem.LJLJI, str2, str3, str4);
        }
    }

    public ACListenerS0S4300000_3(Object obj, Object obj2, Object obj3, String str, String str2, String str3, String str4, int i) {
        this.$t = i;
        this.l4 = obj;
        this.l5 = obj2;
        this.l6 = obj3;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
    }
}
