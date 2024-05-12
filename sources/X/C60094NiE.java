package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.android.play.core.assetpacks.r2;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.NiE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60094NiE extends HSS {
    public C188727au LJLJLJ;
    public boolean LJLJLLL;
    public final boolean LJLL = true;
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(C26376AWu.LJLIL);

    public String LJJJJJL() {
        return null;
    }

    public boolean LJJJJLI() {
        return false;
    }

    @Override // X.HSS
    public final boolean LJJIJ() {
        Integer num;
        Iterable iterable = (Iterable) this.LJLLI.getValue();
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            num = Integer.valueOf(anchorCommonStruct.getType());
        } else {
            num = null;
        }
        return !ORZ.LJLJJI(num, iterable);
    }

    public final List<String> LJJJJJ() {
        String str;
        boolean z;
        String str2;
        List<String> list;
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        boolean z2 = true;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        o oVar = new o();
        AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
        if (anchorCommonStruct2 != null) {
            str2 = anchorCommonStruct2.getExtra();
        } else {
            str2 = null;
        }
        j parse = GsonProtectorUtils.parse(oVar, str2);
        if (!(parse instanceof m)) {
            return null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), parse.LJIIZILJ().LJJIJ("gecko_channel"), C65330PkU.LIZJ(C65352Pkq.LJ(List.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)))));
            if (!(fromJson instanceof List)) {
                fromJson = null;
            }
            list = (List) fromJson;
        } catch (s unused) {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        return list;
    }

    public final boolean LJJJJLL() {
        String str;
        String str2;
        List<String> LJJJJJ;
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        Object obj = null;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        o oVar = new o();
        AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
        if (anchorCommonStruct2 != null) {
            str2 = anchorCommonStruct2.getExtra();
        } else {
            str2 = null;
        }
        j parse = GsonProtectorUtils.parse(oVar, str2);
        if (!(parse instanceof m)) {
            return false;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), parse.LJIIZILJ().LJJIJ("is_schema_lynx"), C65330PkU.LIZJ(C65352Pkq.LIZLLL(Boolean.class)));
            if (!(fromJson instanceof Boolean)) {
                fromJson = null;
            }
            obj = fromJson;
        } catch (s unused) {
        }
        if (kotlin.jvm.internal.o.LJ(obj, Boolean.TRUE) && (LJJJJJ = LJJJJJ()) != null && !LJJJJJ.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.S1E
    public S1E clone() {
        return new C60094NiE();
    }

    @Override // X.HSS, X.S1E
    public int type() {
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            return anchorCommonStruct.getType();
        }
        return super.type();
    }

    public final void LJJJJZ() {
        OJP ojp;
        if (!LJJJJLL()) {
            return;
        }
        AdLandPagePreloadServiceImpl.LJJI().LJI();
        NHG nhg = NHG.LIZ;
        List<String> LJJJJJ = LJJJJJ();
        if (LJJJJJ != null) {
            ojp = C78886Uxe.LJJLIIIJL(LJJJJJ);
        } else {
            ojp = null;
        }
        nhg.LJIILL(LJJJJJL(), ojp);
    }

    public boolean LJJJJL() {
        return this.LJLL;
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        kotlin.jvm.internal.o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        this.LJLJLLL = true;
        LJJJJZ();
        super.LJ(eventMapBuilder);
    }

    @Override // X.HSS, X.S1E
    public EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        String str = "";
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) next;
            WikipediaExtra wikipediaExtra = null;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), anchorCommonStruct.getExtra(), C65330PkU.LIZJ(C65352Pkq.LJI(WikipediaExtra.class)));
                if (!(fromJson instanceof WikipediaExtra)) {
                    fromJson = null;
                }
                wikipediaExtra = (WikipediaExtra) fromJson;
            } catch (s unused) {
            }
            if (wikipediaExtra == null) {
                if (C78857UxB.LJJJIL(anchorCommonStruct.getSchema()) && C78857UxB.LJJJIL(anchorCommonStruct.getKeyword()) && anchorCommonStruct.getGeneralType() == 1) {
                    arrayList.add(next);
                }
            } else {
                Integer status = wikipediaExtra.getStatus();
                if (status != null && status.intValue() == 2 && kotlin.jvm.internal.o.LJ(LJJII().getAuthorUid(), ((RBX) HG3.LJIILL()).getCurUserId()) && !LJJIIJ(anchorCommonStruct.getId())) {
                    LJJJIL(anchorCommonStruct.getId());
                    str = wikipediaExtra.getWarningMsg();
                    z = true;
                }
                if (C78857UxB.LJJJIL(anchorCommonStruct.getSchema())) {
                    if (C78857UxB.LJJJIL(anchorCommonStruct.getKeyword())) {
                        if (anchorCommonStruct.getGeneralType() == 1) {
                            Integer status2 = wikipediaExtra.getStatus();
                            if (status2 != null && status2.intValue() == 2) {
                            }
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        if (z) {
            Aweme LJJII = LJJII();
            if (TextUtils.isEmpty(str)) {
                str = EF7.LIZIZ().getString(R.string.txg);
            }
            LJJII.setAnchorWikiOfflineText(str);
        }
        if (arrayList.size() == 0) {
            return EnumC26289ATl.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        arrayList2.remove(anchorCommonStruct2);
        LJJIJL(anchorCommonStruct2);
        LJJ(anchorCommonStruct2);
        this.LJLJJL = anchorCommonStruct2;
        if (arrayList.size() == 1) {
            return EnumC26289ATl.DONE;
        }
        return EnumC26289ATl.PROCEED;
    }

    @Override // X.S1E
    public void LJIIIIZZ(C188727au eventMapBuilder) {
        boolean z;
        String str;
        String subType;
        String str2;
        Object obj;
        String str3;
        String str4;
        int i;
        int i2;
        String str5;
        String str6;
        String str7;
        kotlin.jvm.internal.o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (!this.LJLJLLL) {
            LJJJJZ();
        }
        this.LJLJLJ = eventMapBuilder;
        Activity LIZ = LJIIIZ().LIZ();
        HSS.LJJIZ(this, eventMapBuilder, 6);
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null && anchorCommonStruct.getType() == EnumC42934Gt8.VERTICAL_SOLUTION_GAME.getTYPE()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
            AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
            if (anchorCommonStruct2 != null) {
                str6 = anchorCommonStruct2.getExtra();
            } else {
                str6 = null;
            }
            repo.storeString("anchor_extra", str6);
            repo.storeString("group_id", LJJII().getGroupId());
            AnchorCommonStruct anchorCommonStruct3 = this.LJLJJL;
            if (anchorCommonStruct3 != null) {
                str7 = anchorCommonStruct3.getExtra();
            } else {
                str7 = null;
            }
            C60106NiQ.LIZLLL(str7);
        }
        String str8 = "";
        if (LJJJJLL()) {
            Bundle bundle = new Bundle();
            AnchorCommonStruct anchorCommonStruct4 = this.LJLJJL;
            if (anchorCommonStruct4 == null || (str2 = anchorCommonStruct4.getSchema()) == null) {
                str2 = "";
            }
            bundle.putBoolean("is_lynx_landing_page", true);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("bundle_nav_bar_status_padding", LJJJJL());
            bundle.putBoolean("need_bottom_out", true);
            String authorUid = LJIIIZ().LJJLL().getAuthorUid();
            if (authorUid == null) {
                authorUid = "";
            }
            bundle.putString("author_id", authorUid);
            String aid = LJIIIZ().LJJLL().getAid();
            if (aid == null) {
                aid = "";
            }
            bundle.putString("group_id", aid);
            AwemeRawAd awemeRawAd = LJJII().getAwemeRawAd();
            if (awemeRawAd == null || (obj = awemeRawAd.getGroupId()) == null) {
                obj = "";
            }
            bundle.putString("aweme_group_id", obj.toString());
            AwemeRawAd awemeRawAd2 = LJJII().getAwemeRawAd();
            if (awemeRawAd2 != null) {
                str3 = awemeRawAd2.getLogExtra();
            } else {
                str3 = null;
            }
            bundle.putString("bundle_download_app_log_extra", str3);
            AwemeRawAd awemeRawAd3 = LJJII().getAwemeRawAd();
            if (awemeRawAd3 != null) {
                str4 = awemeRawAd3.getCreativeIdStr();
            } else {
                str4 = null;
            }
            bundle.putString("aweme_creative_id", str4);
            AwemeRawAd awemeRawAd4 = LJJII().getAwemeRawAd();
            if (awemeRawAd4 != null) {
                i = awemeRawAd4.getChargeType();
            } else {
                i = 0;
            }
            bundle.putInt("charge_type", i);
            AwemeRawAd awemeRawAd5 = LJJII().getAwemeRawAd();
            if (awemeRawAd5 != null) {
                i2 = awemeRawAd5.getSystemOrigin();
            } else {
                i2 = 0;
            }
            bundle.putInt("ad_system_origin", i2);
            AnchorCommonStruct anchorCommonStruct5 = this.LJLJJL;
            if (anchorCommonStruct5 == null || (str5 = anchorCommonStruct5.getId()) == null) {
                str5 = "";
            }
            bundle.putString("anchor_id", str5);
            bundle.putSerializable("anchor_event_map", (HashMap) LJJIII(eventMapBuilder));
            bundle.putString("enter_from", LJJIIZI());
            String aid2 = LJIIIZ().LJJLL().getAid();
            if (aid2 != null) {
                str8 = aid2;
            }
            bundle.putString("from_group_id", str8);
            bundle.putString("detail_aweme_from", LJJIIZI());
            android.net.Uri parse = UriProtector.parse(str2);
            if (parse.isHierarchical()) {
                bundle.putString("bundle_origin_url", UriProtector.getQueryParameter(parse, "fallback_url"));
                if (TextUtils.equals(UriProtector.getQueryParameter(parse, "async_layout"), "1")) {
                    bundle.putBoolean("preset_safe_point", true);
                    bundle.putInt("thread_strategy", EnumC59959Ng3.PART_ON_LAYOUT.id());
                }
            }
            Uri.Builder buildUpon = parse.buildUpon();
            m mVar = new m();
            mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(LJJI()) ? 1 : 0));
            mVar.LJJIIJ("topSafeAreaHeight", Integer.valueOf(C63081OpJ.LJJJJLI(LJJI())));
            buildUpon.appendQueryParameter("lynx_landing_page_data", mVar.toString());
            if (C59294NOw.LIZ()) {
                buildUpon.appendQueryParameter("use_spark", "1");
                String LJJJJJL = LJJJJJL();
                if (LJJJJJL == null) {
                    IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                    if (LJJI != null) {
                        LJJJJJL = LJJI.LJIIL("lynx_feed");
                    } else {
                        LJJJJJL = null;
                    }
                }
                IAdSparkUtils LJFF = AdSparkUtils.LJFF();
                if (LJFF != null) {
                    String builder = buildUpon.toString();
                    kotlin.jvm.internal.o.LJIIIIZZ(builder, "urlBuilder.toString()");
                    LJFF.LIZLLL(LIZ, builder, bundle, LJJJJJL, C59209NLp.LIZIZ(), LJJJJLI());
                    return;
                }
                return;
            }
            String builder2 = buildUpon.toString();
            kotlin.jvm.internal.o.LJIIIIZZ(builder2, "urlBuilder.toString()");
            C57415Mg7.LIZIZ(LIZ, builder2, null, bundle);
            return;
        }
        AnchorCommonStruct anchorCommonStruct6 = this.LJLJJL;
        if (anchorCommonStruct6 == null) {
            return;
        }
        EventBus.LIZJ().LJIILJJIL(this);
        String schema = anchorCommonStruct6.getSchema();
        if (schema == null) {
            str = "";
        } else {
            Uri.Builder appendQueryParameter = UriProtector.parse(schema).buildUpon().appendQueryParameter("entrance_from", LJJIIZI());
            if (LJJII() != null && LJJII().getCcTemplateInfo() != null && LJJII().getCcTemplateInfo().isMatchThePolicy()) {
                appendQueryParameter.appendQueryParameter("music_copyright", LJJII().getCcTemplateInfo().getMusicCopyrightStr());
            }
            str = appendQueryParameter.build().toString();
            kotlin.jvm.internal.o.LJIIIIZZ(str, "schemaWithCommonParamsBuilder.build().toString()");
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(LIZ, str);
        buildRoute.withParam("anchor_event_map", (HashMap) LJJIII(eventMapBuilder));
        String authorUid2 = LJIIIZ().LJJLL().getAuthorUid();
        if (authorUid2 == null) {
            authorUid2 = "";
        }
        buildRoute.withParam("author_id", authorUid2);
        String aid3 = LJIIIZ().LJJLL().getAid();
        if (aid3 == null) {
            aid3 = "";
        }
        buildRoute.withParam("group_id", aid3);
        buildRoute.withParam("anchor_id", anchorCommonStruct6.getId());
        buildRoute.withParam("enter_from", LJJIIZI());
        String aid4 = LJIIIZ().LJJLL().getAid();
        if (aid4 == null) {
            aid4 = "";
        }
        buildRoute.withParam("from_group_id", aid4);
        buildRoute.withParam("previous_page", LJJIIZI());
        buildRoute.withParam("detail_aweme_from", LJJIIZI());
        AnchorCommonStruct anchorCommonStruct7 = this.LJLJJL;
        if (anchorCommonStruct7 != null && C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC42934Gt8.CAPCUT.getTYPE()), Integer.valueOf(EnumC42934Gt8.VIA_MAKER.getTYPE())).contains(Integer.valueOf(anchorCommonStruct7.getType()))) {
            m mVar2 = new m();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String LIZJ = C31461Li.LIZJ("capcut_back_tt", "", "getInstance().getStringV…BackTTAbtest::class.java)");
            if (LIZJ.length() > 0) {
                if (EF7.LJII == 1) {
                    linkedHashMap.put("back_tiktok_t_group", LIZJ);
                } else if (EF7.LJII == 2) {
                    linkedHashMap.put("back_tiktok_m_group", LIZJ);
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                mVar2.LJJIIZ((String) entry.getKey(), (String) entry.getValue());
            }
            buildRoute.withParam("jump_capcut_params", C27739Aud.LJI(mVar2));
        }
        AnchorCommonStruct anchorCommonStruct8 = this.LJLJJL;
        if (anchorCommonStruct8 != null && (subType = anchorCommonStruct8.subType()) != null) {
            str8 = subType;
        }
        buildRoute.withParam("anchor_subtype", str8);
        buildRoute.withParam("anchor_click_time", SystemClock.elapsedRealtime());
        buildRoute.open();
    }

    @QD3
    public final void onWebViewFinish(C25741A8j event) {
        java.util.Map LJJJLIIL;
        kotlin.jvm.internal.o.LJIIIZ(event, "event");
        if (LJJIJ()) {
            C188727au LJJIJIIJI = LJJIJIIJI();
            LJJIJIIJI.LJ(event.LJLIL, "duration");
            FMX.LJIIL("anchor_stay_time", LJJIJIIJI.LIZ);
        }
        C188727au LJJIJIIJI2 = LJJIJIIJI();
        C188727au c188727au = this.LJLJLJ;
        if (c188727au == null || (LJJJLIIL = c188727au.LIZ) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        LJJIJIIJI2.LJII(new HashMap(LJJJLIIL));
        LJJIJIIJI2.LJ(event.LJLIL, "duration");
        FMX.LJIIL("multi_anchor_stay_time", LJJIJIIJI2.LIZ);
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.HSW, X.S1E
    public final void LJII(C7F9 chain, S1F tagView, r2 feedTagPresenter) {
        kotlin.jvm.internal.o.LJIIIZ(chain, "chain");
        kotlin.jvm.internal.o.LJIIIZ(tagView, "tagView");
        kotlin.jvm.internal.o.LJIIIZ(feedTagPresenter, "feedTagPresenter");
        if (!this.LJLJLLL) {
            LJJJJZ();
        }
    }
}
