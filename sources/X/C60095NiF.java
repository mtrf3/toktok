package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.assetpacks.r2;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import java.util.List;

/* renamed from: X.NiF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60095NiF extends HSS {
    public boolean LJLJLJ;

    public final void LJJJJJ() {
        String str;
        Iterable iterable;
        OJP ojp;
        o oVar = new o();
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), GsonProtectorUtils.parse(oVar, str).LJIIZILJ().LJJIJ("gecko_channel"), C65330PkU.LIZJ(C65352Pkq.LJ(List.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)))));
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

    @Override // X.S1E
    public final S1E clone() {
        return new C60095NiF();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.TTCM.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        kotlin.jvm.internal.o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        this.LJLJLJ = true;
        eventMapBuilder.LJI("is_ad_signal", HSI.LJII(((HSI) LJIJI()).LIZ, "is_ad_signal"));
        LJJJJJ();
        super.LJ(eventMapBuilder);
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        c188727au.LJI("is_ad_signal", HSI.LJII(((HSI) LJIJI()).LIZ, "is_ad_signal"));
        LJJJ(c188727au);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String schema;
        String str;
        kotlin.jvm.internal.o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        eventMapBuilder.LJI("is_ad_signal", HSI.LJII(((HSI) LJIJI()).LIZ, "is_ad_signal"));
        HSS.LJJIZ(this, eventMapBuilder, 6);
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
            Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
            AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
            if (anchorCommonStruct2 != null) {
                str = anchorCommonStruct2.getExtra();
            } else {
                str = null;
            }
            repo.storeString("anchor_extra", str);
            repo.storeString("group_id", LJJII().getGroupId());
            android.net.Uri parse = UriProtector.parse(schema);
            Uri.Builder buildUpon = parse.buildUpon();
            m mVar = new m();
            mVar.LJJIIZ("sourcePage", "ttcm_app");
            mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(LJJI()) ? 1 : 0));
            mVar.LJJIIJ("topSafeAreaHeight", Integer.valueOf(C63081OpJ.LJJJJLI(LJJI())));
            buildUpon.appendQueryParameter("lynx_landing_page_data", mVar.toString());
            buildUpon.appendQueryParameter("sourcePage", "ttcm_app");
            if (C59294NOw.LIZ()) {
                SparkContext sparkContext = new SparkContext();
                String builder = buildUpon.toString();
                kotlin.jvm.internal.o.LJIIIIZZ(builder, "urlBuilder.toString()");
                sparkContext.LJJIJLIJ(builder);
                sparkContext.LJJIIJZLJL("is_lynx_landing_page", true);
                sparkContext.LJJIIJZLJL("hide_nav_bar", true);
                sparkContext.LJJIIJZLJL("hide_status_bar", false);
                sparkContext.LJJIIJZLJL("bundle_nav_bar_status_padding", true);
                sparkContext.LJJIIJZLJL("need_bottom_out", true);
                if (parse.isHierarchical()) {
                    String queryParameter = UriProtector.getQueryParameter(parse, "fallback_url");
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    sparkContext.LJJIIJ("bundle_origin_url", queryParameter);
                    if (TextUtils.equals(UriProtector.getQueryParameter(parse, "async_layout"), "1")) {
                        sparkContext.LJJIIJZLJL("preset_safe_point", true);
                        sparkContext.LJJIFFI(EnumC59959Ng3.PART_ON_LAYOUT.id(), "thread_strategy");
                    }
                }
                String LJIIL = AdLandPagePreloadServiceImpl.LJJI().LJIIL("lynx_feed");
                if (C59209NLp.LIZIZ()) {
                    sparkContext.LJJIIJ("use_forest", "1");
                    if (LJIIL != null) {
                        sparkContext.LJJIIJ("access_key", LJIIL);
                    }
                } else {
                    AdSparkUtils.LJFF().LIZ(sparkContext, LJIIL);
                }
                C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
                Activity LJJI = LJJI();
                c40342FsQ.getClass();
                C40342FsQ.LIZ(LJJI, sparkContext).LIZIZ();
                return;
            }
            Bundle bundle = new Bundle();
            if (parse.isHierarchical()) {
                bundle.putString("bundle_origin_url", UriProtector.getQueryParameter(parse, "fallback_url"));
                if (TextUtils.equals(UriProtector.getQueryParameter(parse, "async_layout"), "1")) {
                    bundle.putBoolean("preset_safe_point", true);
                    bundle.putInt("thread_strategy", EnumC59959Ng3.PART_ON_LAYOUT.id());
                }
            }
            bundle.putBoolean("is_lynx_landing_page", true);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            bundle.putBoolean("need_bottom_out", true);
            Activity LJJI2 = LJJI();
            String builder2 = buildUpon.toString();
            kotlin.jvm.internal.o.LJIIIIZZ(builder2, "urlBuilder.toString()");
            C57415Mg7.LIZIZ(LJJI2, builder2, null, bundle);
        }
    }

    @Override // X.HSW, X.S1E
    public final void LJII(C7F9 chain, S1F tagView, r2 feedTagPresenter) {
        kotlin.jvm.internal.o.LJIIIZ(chain, "chain");
        kotlin.jvm.internal.o.LJIIIZ(tagView, "tagView");
        kotlin.jvm.internal.o.LJIIIZ(feedTagPresenter, "feedTagPresenter");
        if (!this.LJLJLJ) {
            LJJJJJ();
        }
    }
}
