package Y;

import X.AnonymousClass636;
import X.C40342FsQ;
import X.C40343FsR;
import X.C59669NbN;
import X.C59670NbO;
import X.C78966Uyw;
import X.M2K;
import X.OKG;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ACListenerS0S4210000_3 implements View.OnClickListener {
    public final int $t;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public boolean z6;

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

    public static final void onClick$0(ACListenerS0S4210000_3 aCListenerS0S4210000_3, View view) {
        String str;
        final PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) aCListenerS0S4210000_3.l4;
        String str2 = aCListenerS0S4210000_3.s0;
        boolean z = aCListenerS0S4210000_3.z6;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) aCListenerS0S4210000_3.l5;
        String str3 = aCListenerS0S4210000_3.s1;
        String str4 = aCListenerS0S4210000_3.s2;
        String str5 = aCListenerS0S4210000_3.s3;
        poiDetailContentHeaderBaseAssemV3.getClass();
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("PoiDetailContentHeader", "goStoreDetailPage");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        Context context = poiDetailContentHeaderBaseAssemV3.x3().getContext();
        o.LJIIIIZZ(context, "parentView.context");
        SparkContext sparkContext = new SparkContext();
        String LIZIZ = TiktokPoiLynxSettings.LIZIZ("poi_about");
        if (LIZIZ == null) {
            LIZIZ = "";
        }
        sparkContext.LJJIJLIJ(LIZIZ);
        sparkContext.LJJIIJ("is_claimed", poiDetailResponse.LJIIIZ());
        sparkContext.LJJIIJ("poi_id", str2);
        String str6 = poiDetailResponse.cityCode;
        if (str6 == null) {
            str6 = "";
        }
        sparkContext.LJJIIJ("poi_city", str6);
        String str7 = poiDetailResponse.regionCode;
        if (str7 == null) {
            str7 = "";
        }
        sparkContext.LJJIIJ("poi_region_code", str7);
        sparkContext.LJJIFFI(z ? 1 : 0, "enable_location");
        sparkContext.LJII(M2K.class, new M2K() { // from class: X.7rj
            @Override // X.M2J
            public final void release() {
            }

            @Override // X.M2K
            public final C40176Fpk LJIJI() {
                if (!C90193gN.LIZIZ(PoiDetailContentHeaderBaseAssemV3.this.getContext())) {
                    return new C40176Fpk(0, R.anim.g8);
                }
                return new C40176Fpk(0, R.anim.g7);
            }

            @Override // X.M2K
            public final C40176Fpk LJJJI() {
                if (!C90193gN.LIZIZ(PoiDetailContentHeaderBaseAssemV3.this.getContext())) {
                    return new C40176Fpk(R.anim.g6, R.anim.eg);
                }
                return new C40176Fpk(R.anim.g5, R.anim.eg);
            }
        });
        sparkContext.LJJIJIIJI(new C59669NbN());
        sparkContext.LJJIIJ("enter_method", "click_more_details");
        sparkContext.LJJIIJ("enter_from", "poi_detail");
        if (str3 == null) {
            str3 = "";
        }
        sparkContext.LJJIIJ("group_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        sparkContext.LJJIIJ("author_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        sparkContext.LJJIIJ("log_pb", str5);
        if (C78966Uyw.LJJIJ().LIZIZ()) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        sparkContext.LJJIIJ("show_share_entry", str);
        Context context2 = poiDetailContentHeaderBaseAssemV3.x3().getContext();
        if (context2 != null && AnonymousClass636.LJIILJJIL(context2)) {
            sparkContext.LJJIIJ("navigation_bar_bg_color", "000000");
        }
        OKG.LIZLLL(c40342FsQ, context, sparkContext);
    }

    public static final void onClick$1(ACListenerS0S4210000_3 aCListenerS0S4210000_3, View view) {
        String str;
        final PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem = (PoiDetailContentHeaderBaseAssem) aCListenerS0S4210000_3.l4;
        String str2 = aCListenerS0S4210000_3.s0;
        boolean z = aCListenerS0S4210000_3.z6;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) aCListenerS0S4210000_3.l5;
        String str3 = aCListenerS0S4210000_3.s1;
        String str4 = aCListenerS0S4210000_3.s2;
        String str5 = aCListenerS0S4210000_3.s3;
        poiDetailContentHeaderBaseAssem.getClass();
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("PoiDetailContentHeader", "goStoreDetailPage");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        Context context = poiDetailContentHeaderBaseAssem.v3().getContext();
        o.LJIIIIZZ(context, "parentView.context");
        SparkContext sparkContext = new SparkContext();
        String LIZIZ = TiktokPoiLynxSettings.LIZIZ("poi_about");
        if (LIZIZ == null) {
            LIZIZ = "";
        }
        sparkContext.LJJIJLIJ(LIZIZ);
        sparkContext.LJJIIJ("is_claimed", poiDetailResponse.LJIIIZ());
        sparkContext.LJJIIJ("poi_id", str2);
        String str6 = poiDetailResponse.cityCode;
        if (str6 == null) {
            str6 = "";
        }
        sparkContext.LJJIIJ("poi_city", str6);
        String str7 = poiDetailResponse.regionCode;
        if (str7 == null) {
            str7 = "";
        }
        sparkContext.LJJIIJ("poi_region_code", str7);
        sparkContext.LJJIFFI(z ? 1 : 0, "enable_location");
        sparkContext.LJII(M2K.class, new M2K() { // from class: X.7rk
            @Override // X.M2J
            public final void release() {
            }

            @Override // X.M2K
            public final C40176Fpk LJIJI() {
                if (!C90193gN.LIZIZ(PoiDetailContentHeaderBaseAssem.this.getContext())) {
                    return new C40176Fpk(0, R.anim.g8);
                }
                return new C40176Fpk(0, R.anim.g7);
            }

            @Override // X.M2K
            public final C40176Fpk LJJJI() {
                if (!C90193gN.LIZIZ(PoiDetailContentHeaderBaseAssem.this.getContext())) {
                    return new C40176Fpk(R.anim.g6, R.anim.eg);
                }
                return new C40176Fpk(R.anim.g5, R.anim.eg);
            }
        });
        sparkContext.LJJIJIIJI(new C59670NbO());
        sparkContext.LJJIIJ("enter_method", "click_more_details");
        sparkContext.LJJIIJ("enter_from", "poi_detail");
        if (str3 == null) {
            str3 = "";
        }
        sparkContext.LJJIIJ("group_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        sparkContext.LJJIIJ("author_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        sparkContext.LJJIIJ("log_pb", str5);
        if (C78966Uyw.LJJIJ().LIZIZ()) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        sparkContext.LJJIIJ("show_share_entry", str);
        OKG.LIZLLL(c40342FsQ, context, sparkContext);
    }

    public ACListenerS0S4210000_3(Object obj, String str, boolean z, Object obj2, String str2, String str3, String str4, int i) {
        this.$t = i;
        this.l4 = obj;
        this.s0 = str;
        this.z6 = z;
        this.l5 = obj2;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
    }
}
