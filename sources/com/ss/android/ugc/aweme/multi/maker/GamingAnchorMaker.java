package com.ss.android.ugc.aweme.multi.maker;

import X.C16880lQ;
import X.C188727au;
import X.C211878Tf;
import X.C27739Aud;
import X.C38995FSd;
import X.C40342FsQ;
import X.C40343FsR;
import X.C60096NiG;
import X.C60098NiI;
import X.C60100NiK;
import X.C61200O0e;
import X.C61878OQg;
import X.C65330PkU;
import X.C65340Pke;
import X.C65352Pkq;
import X.C78685UuP;
import X.C78857UxB;
import X.C78886Uxe;
import X.C7F9;
import X.E8L;
import X.EF7;
import X.EKC;
import X.EnumC42934Gt8;
import X.EnumC60097NiH;
import X.HSS;
import X.InterfaceC195747mE;
import X.InterfaceC36348EOi;
import X.InterfaceC37276Ek4;
import X.InterfaceC65349Pkn;
import X.NHG;
import X.OJP;
import X.S1E;
import X.S1F;
import X.X1D;
import Y.ARunnableS1S1110000_6;
import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.assetpacks.r2;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;

/* loaded from: classes11.dex */
public final class GamingAnchorMaker extends HSS {
    public boolean LJLJLJ;
    public final C60100NiK LJLJLLL = new C60100NiK();
    public final AttributionUtil LJLL = new AttributionUtil();
    public AnchorExtra LJLLI;

    /* loaded from: classes11.dex */
    public static final class AnchorExtra {

        @InterfaceC65349Pkn("anchor_control")
        public final int anchorControl;

        @InterfaceC65349Pkn("is_schema_lynx")
        public final boolean isSchemaLynx = true;

        @InterfaceC65349Pkn("gecko_channel")
        public final ArrayList<String> geckoChannel = new ArrayList<>();

        @InterfaceC65349Pkn("game_id")
        public final String gameId = "";

        @InterfaceC65349Pkn("game_name")
        public final String gameName = "";

        @InterfaceC65349Pkn("android_pkg_name")
        public final String androidPkgName = "";

        @InterfaceC65349Pkn("after_sale_anchor")
        public final AfterSaleAnchor afterSaleAnchor = new AfterSaleAnchor();

        @InterfaceC65349Pkn("attribution_related")
        public final AttributionRelated attributionRelated = new AttributionRelated();

        @InterfaceC65349Pkn("global_game_id")
        public final String globalGameId = "";

        @InterfaceC65349Pkn("upload_params")
        public final HashMap<String, String> uploadParams = new HashMap<>();

        @InterfaceC65349Pkn("fe_preload_data")
        public final String fePreloadData = "";

        /* loaded from: classes11.dex */
        public static final class AfterSaleAnchor {

            @InterfaceC65349Pkn("schema")
            public final String schema = "";
        }

        /* loaded from: classes11.dex */
        public static final class AttributionRelated {

            @InterfaceC65349Pkn("attribution_link_type")
            public final int linkType;

            @InterfaceC65349Pkn("adjust_impression_android")
            public final String adjustImpression = "";

            @InterfaceC65349Pkn("adjust_click")
            public final String adjustClick = "";

            @InterfaceC65349Pkn("adjust_click_to_landing_page")
            public final String adjustClickToLandingPage = "";

            @InterfaceC65349Pkn("appsflyer_impression_android")
            public final String appsflyerImpression = "";

            @InterfaceC65349Pkn("appsflyer_click")
            public final String appsflyerClick = "";

            @InterfaceC65349Pkn("appsflyer_click_to_landing_page")
            public final String appsflyerClickToLandingPage = "";
        }
    }

    /* loaded from: classes7.dex */
    public static final class AttributionUtil {
        public static final /* synthetic */ int LJ = 0;
        public boolean LIZ;
        public boolean LIZIZ;
        public final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());
        public ARunnableS1S1110000_6 LIZLLL;

        /* loaded from: classes7.dex */
        public interface AttributionApi {
            @E8L
            @EKC({"x-tt-dataflow-id: 671088641"})
            InterfaceC37276Ek4<String> monitor(@InterfaceC195747mE String str);

            @E8L
            @EKC({"x-tt-dataflow-id: 671088641"})
            InterfaceC37276Ek4<String> monitorWithHeader(@InterfaceC195747mE String str, @InterfaceC36348EOi("User-Agent") String str2);
        }
    }

    public final AnchorExtra LJJJJL() {
        String str;
        if (this.LJLLI == null) {
            AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
            AnchorExtra anchorExtra = null;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getExtra();
            } else {
                str = null;
            }
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LIZLLL(AnchorExtra.class)));
                if (!(fromJson instanceof AnchorExtra)) {
                    fromJson = null;
                }
                anchorExtra = (AnchorExtra) fromJson;
            } catch (s unused) {
            }
            this.LJLLI = anchorExtra;
        }
        return this.LJLLI;
    }

    public final boolean LJJJJZ() {
        String str;
        String str2;
        j jVar;
        m LJIIZILJ;
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
        if (parse != null && (LJIIZILJ = parse.LJIIZILJ()) != null) {
            jVar = LJIIZILJ.LJJIJ("is_schema_lynx");
        } else {
            jVar = null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), jVar, C65330PkU.LIZJ(C65352Pkq.LIZLLL(Boolean.class)));
            if (!(fromJson instanceof Boolean)) {
                fromJson = null;
            }
            obj = fromJson;
        } catch (s unused) {
        }
        return kotlin.jvm.internal.o.LJ(obj, Boolean.TRUE);
    }

    public final boolean LJJJJZI() {
        List<AnchorCommonStruct> anchors = LJJII().getAnchors();
        if (anchors == null) {
            anchors = C61878OQg.INSTANCE;
        }
        if (C211878Tf.LIZ(new ArrayList(anchors)).size() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.S1E
    public final S1E clone() {
        return new GamingAnchorMaker();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.TIKTOK_GAME.getTYPE();
    }

    @Override // X.HSS
    public final boolean LJJIIJZLJL() {
        return LJJJJZ();
    }

    public final String LJJJJJ() {
        if (LJJJJZI()) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        List<AnchorCommonStruct> anchors = LJJII().getAnchors();
        if (anchors == null) {
            anchors = C61878OQg.INSTANCE;
        }
        ArrayList LIZ = C211878Tf.LIZ(new ArrayList(anchors));
        if (LIZ.size() < 1 || ((AnchorCommonStruct) ListProtector.get(LIZ, 0)).getType() != EnumC42934Gt8.TIKTOK_GAME.getTYPE()) {
            return "2";
        }
        return "1";
    }

    public final String LJJJJLL() {
        AnchorExtra LJJJJL = LJJJJL();
        if (LJJJJL != null) {
            int i = LJJJJL.anchorControl;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
                        if (anchorCommonStruct == null) {
                            return null;
                        }
                        return anchorCommonStruct.getSchema();
                    }
                    return LJJJJLI(LJJJJL);
                }
                if (C78857UxB.LJJIZ(EF7.LIZIZ(), LJJJJL.androidPkgName)) {
                    return LJJJJL.afterSaleAnchor.schema;
                }
                AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
                if (anchorCommonStruct2 == null) {
                    return null;
                }
                return anchorCommonStruct2.getSchema();
            }
            if (C78857UxB.LJJIZ(EF7.LIZIZ(), LJJJJL.androidPkgName)) {
                return LJJJJL.afterSaleAnchor.schema;
            }
            return LJJJJLI(LJJJJL);
        }
        AnchorCommonStruct anchorCommonStruct3 = this.LJLJJL;
        if (anchorCommonStruct3 == null) {
            return null;
        }
        return anchorCommonStruct3.getSchema();
    }

    public final void LJJJLL() {
        String str;
        j jVar;
        Iterable iterable;
        OJP ojp;
        m LJIIZILJ;
        if (!LJJJJZ()) {
            return;
        }
        o oVar = new o();
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        j parse = GsonProtectorUtils.parse(oVar, str);
        if (parse != null && (LJIIZILJ = parse.LJIIZILJ()) != null) {
            jVar = LJIIZILJ.LJJIJ("gecko_channel");
        } else {
            jVar = null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), jVar, C65330PkU.LIZJ(C65352Pkq.LJ(List.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)))));
            if (!(fromJson instanceof List)) {
                fromJson = null;
            }
            iterable = (Iterable) fromJson;
        } catch (s unused) {
            iterable = null;
        }
        AdLandPagePreloadServiceImpl.LJJI().LJI();
        NHG nhg = NHG.LIZ;
        if (iterable != null) {
            ojp = C78886Uxe.LJJLIIIJL(iterable);
        } else {
            ojp = null;
        }
        nhg.LJIILL(null, ojp);
    }

    public final boolean LJJJLZIJ() {
        AnchorExtra.AttributionRelated attributionRelated;
        AnchorExtra LJJJJL = LJJJJL();
        if (LJJJJL == null || (attributionRelated = LJJJJL.attributionRelated) == null || 3 != attributionRelated.linkType) {
            return false;
        }
        return true;
    }

    public static String LJJJJLI(AnchorExtra anchorExtra) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://google_play?package_name=");
        LIZ.append(anchorExtra.androidPkgName);
        String uri = UriProtector.parse(X1D.LIZIZ(LIZ)).buildUpon().appendQueryParameter("to_page", "store").build().toString();
        kotlin.jvm.internal.o.LJIIIIZZ(uri, "parse(\"${PREFIX_SCHEMA_G…      .build().toString()");
        return uri;
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        kotlin.jvm.internal.o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        this.LJLJLJ = true;
        LJJJLL();
        super.LJ(eventMapBuilder);
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        LJJJ(c188727au);
        if (!LJJJJZI()) {
            LJJJLIIL("mp_click", LJJJJJ(), "item_play");
        }
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String str;
        String str2;
        AnchorExtra.AfterSaleAnchor afterSaleAnchor;
        kotlin.jvm.internal.o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (!this.LJLJLJ) {
            LJJJLL();
        }
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        AnchorExtra LJJJJL = LJJJJL();
        String str3 = null;
        if (LJJJJL != null) {
            str = LJJJJL.fePreloadData;
        } else {
            str = null;
        }
        C60098NiI c60098NiI = new C60098NiI(str);
        c40342FsQ.getClass();
        C40342FsQ.LJI(c60098NiI);
        AqS141S0200000_10 aqS141S0200000_10 = new AqS141S0200000_10(this, eventMapBuilder, 15);
        String LJJJJLL = LJJJJLL();
        if (LJJJJLL != null && ujb.o.LJJJLIIL(LJJJJLL, "aweme://google_play?package_name=", false)) {
            AnchorExtra LJJJJL2 = LJJJJL();
            if (LJJJJL2 != null && LJJJJL2.anchorControl == 3) {
                AnchorExtra anchorExtra = this.LJLLI;
                if (anchorExtra != null && (afterSaleAnchor = anchorExtra.afterSaleAnchor) != null) {
                    str3 = afterSaleAnchor.schema;
                }
                if (C78685UuP.LJJJZ(str3)) {
                    IBulletService LIZ = BulletService.LIZ();
                    Activity LJJI = LJJI();
                    String uri = UriProtector.parse(str3).buildUpon().appendQueryParameter("extra", LJJJJJL("store")).build().toString();
                    kotlin.jvm.internal.o.LJIIIIZZ(uri, "parse(afterSaleSchema).b…      .build().toString()");
                    LIZ.LJIIIIZZ(LJJI, uri);
                }
            }
            C61200O0e.LIZLLL().LJII(LJJJJLL);
            AttributionUtil attributionUtil = this.LJLL;
            String LIZ2 = C60096NiG.LIZ(LJJJJL(), EnumC60097NiH.TYPE_CLICK, LJJIIZI());
            boolean LJJJLZIJ = LJJJLZIJ();
            if (!attributionUtil.LIZIZ) {
                attributionUtil.LIZIZ = true;
                if (LIZ2.length() != 0) {
                    C38995FSd.LIZLLL().submit(new ARunnableS1S1110000_6(attributionUtil, LIZ2, LJJJLZIJ, 2));
                }
            }
        } else {
            aqS141S0200000_10.invoke(LJJJJLL);
            AttributionUtil attributionUtil2 = this.LJLL;
            String LIZ3 = C60096NiG.LIZ(LJJJJL(), EnumC60097NiH.TYPE_CLICK_LANDING_PAGE, LJJIIZI());
            boolean LJJJLZIJ2 = LJJJLZIJ();
            if (!attributionUtil2.LIZIZ) {
                attributionUtil2.LIZIZ = true;
                if (LIZ3.length() != 0) {
                    C38995FSd.LIZLLL().submit(new ARunnableS1S1110000_6(attributionUtil2, LIZ3, LJJJLZIJ2, 2));
                }
            }
        }
        String LJJJJJ = LJJJJJ();
        if (LJJJJZI()) {
            str2 = "item_play";
        } else {
            str2 = "anchor_list";
        }
        LJJJLIIL("mp_click", LJJJJJ, str2);
    }

    @Override // X.HSS, X.S1E
    public final void LJIJJ(Aweme aweme) {
        AttributionUtil attributionUtil = this.LJLL;
        ARunnableS1S1110000_6 aRunnableS1S1110000_6 = attributionUtil.LIZLLL;
        if (aRunnableS1S1110000_6 != null) {
            attributionUtil.LIZJ.removeCallbacks(aRunnableS1S1110000_6);
        }
        attributionUtil.LIZLLL = null;
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        C60098NiI c60098NiI = new C60098NiI(null);
        c40342FsQ.getClass();
        C40342FsQ.LJI(c60098NiI);
    }

    public final String LJJJJJL(String str) {
        String str2;
        String str3;
        m mVar = new m();
        try {
            mVar.LJJIIZ("enter_from", LJJIIZI());
            mVar.LJJIIZ("from_source", str);
            mVar.LJJIIZ("from_group_id", LJJII().getAid());
            mVar.LJJIIZ("from_author_id", LJJII().getAuthorUid());
            AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
            if (anchorCommonStruct != null) {
                str2 = anchorCommonStruct.getId();
            } else {
                str2 = null;
            }
            mVar.LJJIIZ("scene_id", str2);
            if (LJJJJZI()) {
                str3 = "item_play";
            } else {
                str3 = "anchor_list";
            }
            mVar.LJJIIZ("position", str3);
            mVar.LJJIIZ("anchor_type", LJJJJJ());
        } catch (Exception unused) {
        }
        String jVar = mVar.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(jVar, "jsonObject.toString()");
        return jVar;
    }

    @Override // X.HSW, X.S1E
    public final void LJII(C7F9 chain, S1F tagView, r2 feedTagPresenter) {
        kotlin.jvm.internal.o.LJIIIZ(chain, "chain");
        kotlin.jvm.internal.o.LJIIIZ(tagView, "tagView");
        kotlin.jvm.internal.o.LJIIIZ(feedTagPresenter, "feedTagPresenter");
        C60100NiK c60100NiK = this.LJLJLLL;
        c60100NiK.getClass();
        c60100NiK.LIZ = new HashMap<>();
        c60100NiK.LIZIZ = new HashMap<>();
        LJJJLIIL("mp_show", LJJJJJ(), "item_play");
        if (!this.LJLJLJ) {
            LJJJLL();
        }
        if (LJJJJZI()) {
            AttributionUtil attributionUtil = this.LJLL;
            String LIZ = C60096NiG.LIZ(LJJJJL(), EnumC60097NiH.TYPE_IMPRESSION, LJJIIZI());
            boolean LJJJLZIJ = LJJJLZIJ();
            if (attributionUtil.LIZLLL != null) {
                return;
            }
            ARunnableS1S1110000_6 aRunnableS1S1110000_6 = new ARunnableS1S1110000_6(attributionUtil, LIZ, LJJJLZIJ, 1);
            attributionUtil.LIZLLL = aRunnableS1S1110000_6;
            attributionUtil.LIZJ.postDelayed(aRunnableS1S1110000_6, 3000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119 A[LOOP:0: B:48:0x0113->B:50:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLIIL(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.maker.GamingAnchorMaker.LJJJLIIL(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.HSW, X.S1E
    public final void LJIILIIL(C7F9 chain, Dialog dialog, boolean z, boolean z2) {
        kotlin.jvm.internal.o.LJIIIZ(chain, "chain");
        LJJJLIIL("mp_show", LJJJJJ(), "anchor_list");
        AttributionUtil attributionUtil = this.LJLL;
        String LIZ = C60096NiG.LIZ(LJJJJL(), EnumC60097NiH.TYPE_IMPRESSION, LJJIIZI());
        boolean LJJJLZIJ = LJJJLZIJ();
        if (attributionUtil.LIZ) {
            return;
        }
        attributionUtil.LIZ = true;
        if (LIZ.length() == 0) {
            return;
        }
        C38995FSd.LIZLLL().submit(new ARunnableS1S1110000_6(attributionUtil, LIZ, LJJJLZIJ, 2));
    }
}
