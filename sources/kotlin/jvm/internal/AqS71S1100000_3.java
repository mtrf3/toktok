package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C183607Im;
import X.C193897jF;
import X.C195647m4;
import X.C26045AKb;
import X.C2NU;
import X.C38995FSd;
import X.C51029K0z;
import X.C57430MgM;
import X.C68322mC;
import X.C76800UCe;
import X.C7C3;
import X.C8VZ;
import X.FMX;
import X.InterfaceC65784Pro;
import X.Q8U;
import X.X1D;
import Y.ARunnableS7S1100000_6;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.nows.feed.ui.NowPostImageAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.ui.NearbyFeatureNotAvailableAssem;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import com.zhiliaoapp.musically.R;
import defpackage.m0;
import java.util.LinkedHashMap;
import ujb.s;

/* loaded from: classes4.dex */
public class AqS71S1100000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public final void invoke$1() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "learn_more");
        linkedHashMap.put("is_no_new_videos", CardStruct.IStatusCode.DEFAULT);
        FMX.LJIIL("no_videos_page_click", linkedHashMap);
        if (!INVOKESTATIC_com_ss_android_ugc_aweme_ui_NearbyFeatureNotAvailableAssem$addLearnMoreBtnWhenUrlNotNull$2$clickableSpan$1_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable$0(((NearbyFeatureNotAvailableAssem) this.l1).getContext())) {
            C26045AKb c26045AKb = new C26045AKb(((NearbyFeatureNotAvailableAssem) this.l1).getContainerView());
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            return;
        }
        String appLanguage = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage();
        if (s.LJJJLZIJ(this.s0, "%s", false)) {
            str = Q8U.LIZIZ(new Object[]{appLanguage}, 1, this.s0, "format(this, *args)");
        } else {
            str = this.s0;
        }
        Context context = ((NearbyFeatureNotAvailableAssem) this.l1).getContext();
        if (context != null) {
            SmartRoute LIZ = m0.LIZ(context, "aweme://webview", "url", str, "title", "");
            LIZ.withParam("show_separate_line", true);
            LIZ.open();
        }
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_ui_NearbyFeatureNotAvailableAssem$addLearnMoreBtnWhenUrlNotNull$2$clickableSpan$1_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable$0(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS71S1100000_3 aqS71S1100000_3) {
        C7C3 c7c3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try find hierarchy data in ");
        LIZ.append(((C68322mC) aqS71S1100000_3.l1).element);
        LIZ.append(", ");
        LIZ.append(aqS71S1100000_3.s0);
        LIZ.append(", parent is ");
        C7C3 c7c32 = (C7C3) ((C68322mC) aqS71S1100000_3.l1).element;
        if (c7c32 != null) {
            c7c3 = c7c32.LIZ;
        } else {
            c7c3 = null;
        }
        LIZ.append(c7c3);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS71S1100000_3 aqS71S1100000_3) {
        C7C3 c7c3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try find hierarchy data in ");
        LIZ.append(((C68322mC) aqS71S1100000_3.l1).element);
        LIZ.append(", ");
        LIZ.append(aqS71S1100000_3.s0);
        LIZ.append(", , parent is ");
        C7C3 c7c32 = (C7C3) ((C68322mC) aqS71S1100000_3.l1).element;
        if (c7c32 != null) {
            c7c3 = c7c32.LIZ;
        } else {
            c7c3 = null;
        }
        LIZ.append(c7c3);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$10(AqS71S1100000_3 aqS71S1100000_3) {
        String str = ((PoiDetailContentHeaderBaseAssem) aqS71S1100000_3.l1).LJLJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = aqS71S1100000_3.s0;
        if (str2 != null) {
            linkedHashMap.put("poi_id", str2);
        }
        return new C57430MgM(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, linkedHashMap, null, -2, 383);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS71S1100000_3 aqS71S1100000_3) {
        aqS71S1100000_3.invoke$1();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS71S1100000_3 aqS71S1100000_3) {
        String aid = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssemNew) aqS71S1100000_3.l1)).getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        String str = aqS71S1100000_3.s0;
        String str2 = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssemNew) aqS71S1100000_3.l1)).mEventType;
        o.LJIIIIZZ(str2, "item.eventType");
        C183607Im.LIZ(aid, str, str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS71S1100000_3 aqS71S1100000_3) {
        C38995FSd.LIZIZ().execute(new ARunnableS7S1100000_6((InterfaceC65784Pro) aqS71S1100000_3.l1, aqS71S1100000_3.s0, 19));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS71S1100000_3 aqS71S1100000_3) {
        if (o.LJ(aqS71S1100000_3.s0, ((C195647m4) C51029K0z.LJIILLIIL((NowPostImageAssem) aqS71S1100000_3.l1)).LJLIL.getAid())) {
            ((NowPostImageAssem) aqS71S1100000_3.l1).p4().jv0(C193897jF.LIZIZ);
            ((NowPostImageAssem) aqS71S1100000_3.l1).C4(false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS71S1100000_3 aqS71S1100000_3) {
        if (o.LJ(aqS71S1100000_3.s0, ((C195647m4) C51029K0z.LJIILLIIL((NowPostImageAssem) aqS71S1100000_3.l1)).LJLIL.getAid())) {
            ((NowPostImageAssem) aqS71S1100000_3.l1).p4().jv0(C193897jF.LIZIZ);
            ((NowPostImageAssem) aqS71S1100000_3.l1).C4(false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS71S1100000_3 aqS71S1100000_3) {
        if (o.LJ(aqS71S1100000_3.s0, ((C195647m4) C51029K0z.LJIILLIIL((NowPostImageAssem) aqS71S1100000_3.l1)).LJLIL.getAid())) {
            ((NowPostImageAssem) aqS71S1100000_3.l1).p4().jv0(C193897jF.LIZIZ);
            ((NowPostImageAssem) aqS71S1100000_3.l1).C4(false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS71S1100000_3 aqS71S1100000_3) {
        String str = ((PoiDetailContentHeaderBaseAssemV3) aqS71S1100000_3.l1).LJLJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = aqS71S1100000_3.s0;
        if (str2 != null) {
            linkedHashMap.put("poi_id", str2);
        }
        return new C57430MgM(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, linkedHashMap, null, -2, 383);
    }

    public static final Object invoke$9(AqS71S1100000_3 aqS71S1100000_3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(aqS71S1100000_3.s0);
        LIZ.append(((C8VZ) aqS71S1100000_3.l1).hashCode());
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S1100000_3(C8VZ c8vz, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c8vz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S1100000_3(PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiDetailContentHeaderBaseAssemV3;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S1100000_3(PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiDetailContentHeaderBaseAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S1100000_3(NearbyFeatureNotAvailableAssem nearbyFeatureNotAvailableAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = nearbyFeatureNotAvailableAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S1100000_3(UpvoteVideoAssemNew upvoteVideoAssemNew, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = upvoteVideoAssemNew;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S1100000_3(String str, C68322mC c68322mC, int i) {
        super(0);
        this.$t = i;
        this.l1 = c68322mC;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS71S1100000_3(String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S1100000_3(String str, NowPostImageAssem nowPostImageAssem, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = nowPostImageAssem;
    }
}
