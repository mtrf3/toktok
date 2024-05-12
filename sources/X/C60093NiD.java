package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.assetpacks.r2;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.NiD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60093NiD extends HSS {
    public boolean LJLJLJ;
    public final boolean LJLJLLL = true;

    @Override // X.S1E
    public final S1E clone() {
        return new C60093NiD();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.VERTICAL_SOLUTION_GAME.getTYPE();
    }

    public final void LJJJJJ() {
        OJP ojp;
        String extra;
        Object LIZ;
        Object LIZ2;
        List list;
        String str;
        AdLandPagePreloadServiceImpl.LJJI().LJI();
        NHG nhg = NHG.LIZ;
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null && extra.length() != 0) {
            try {
                new o();
                AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
                if (anchorCommonStruct2 != null) {
                    str = anchorCommonStruct2.getExtra();
                } else {
                    str = null;
                }
                LIZ = o.LIZ(str);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            j jVar = (j) LIZ;
            if (jVar instanceof m) {
                try {
                    LIZ2 = ((m) jVar).LJIIZILJ();
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th2) {
                    LIZ2 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m12isFailureimpl(LIZ2)) {
                    LIZ2 = null;
                }
                m mVar = (m) LIZ2;
                if (mVar != null) {
                    try {
                        Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), mVar.LJJIJ("gecko_channel"), C65330PkU.LIZJ(C65352Pkq.LJ(List.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)))));
                        if (!(fromJson instanceof List)) {
                            fromJson = null;
                        }
                        list = (List) fromJson;
                    } catch (s unused) {
                    }
                    if (list != null && !list.isEmpty()) {
                        ojp = C78886Uxe.LJJLIIIJL(list);
                        nhg.LJIILL(null, ojp);
                    }
                }
            }
        }
        ojp = null;
        nhg.LJIILL(null, ojp);
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        kotlin.jvm.internal.o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        this.LJLJLJ = true;
        LJJJJJ();
        super.LJ(eventMapBuilder);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String str;
        String str2;
        String str3;
        Object obj;
        String str4;
        String str5;
        int i;
        int i2;
        String str6;
        Object LIZ;
        boolean booleanValue;
        FragmentManager fragmentManager;
        kotlin.jvm.internal.o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (!this.LJLJLJ) {
            LJJJJJ();
        }
        Activity LIZ2 = LJIIIZ().LIZ();
        HSS.LJJIZ(this, eventMapBuilder, 6);
        Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        String str7 = null;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        repo.storeString("anchor_extra", str);
        repo.storeString("group_id", LJJII().getGroupId());
        AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
        if (anchorCommonStruct2 != null) {
            str2 = anchorCommonStruct2.getExtra();
        } else {
            str2 = null;
        }
        C60106NiQ.LIZLLL(str2);
        Bundle bundle = new Bundle();
        AnchorCommonStruct anchorCommonStruct3 = this.LJLJJL;
        String str8 = "";
        if (anchorCommonStruct3 == null || (str3 = anchorCommonStruct3.getSchema()) == null) {
            str3 = "";
        }
        bundle.putBoolean("is_lynx_landing_page", true);
        bundle.putBoolean("hide_nav_bar", true);
        bundle.putBoolean("hide_status_bar", false);
        bundle.putBoolean("bundle_nav_bar_status_padding", this.LJLJLLL);
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
            str4 = awemeRawAd2.getLogExtra();
        } else {
            str4 = null;
        }
        bundle.putString("bundle_download_app_log_extra", str4);
        AwemeRawAd awemeRawAd3 = LJJII().getAwemeRawAd();
        if (awemeRawAd3 != null) {
            str5 = awemeRawAd3.getCreativeIdStr();
        } else {
            str5 = null;
        }
        bundle.putString("aweme_creative_id", str5);
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
        AnchorCommonStruct anchorCommonStruct4 = this.LJLJJL;
        if (anchorCommonStruct4 == null || (str6 = anchorCommonStruct4.getId()) == null) {
            str6 = "";
        }
        bundle.putString("anchor_id", str6);
        bundle.putSerializable("anchor_event_map", (HashMap) LJJIII(eventMapBuilder));
        bundle.putString("enter_from", LJJIIZI());
        String aid2 = LJIIIZ().LJJLL().getAid();
        if (aid2 != null) {
            str8 = aid2;
        }
        bundle.putString("from_group_id", str8);
        bundle.putString("detail_aweme_from", LJJIIZI());
        android.net.Uri parse = UriProtector.parse(str3);
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
        if (!parse.isHierarchical()) {
            booleanValue = false;
        } else {
            try {
                LIZ = Boolean.valueOf(kotlin.jvm.internal.o.LJ(UriProtector.getQueryParameter(parse, "use_game_partnership_sheet"), "1"));
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Boolean bool = Boolean.FALSE;
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = bool;
            }
            booleanValue = ((Boolean) LIZ).booleanValue();
        }
        buildUpon.appendQueryParameter("use_spark", "1");
        String LJIIL = AdLandPagePreloadServiceImpl.LJJI().LJIIL("lynx_feed");
        if (booleanValue) {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(LJJI());
            if (LJJIFFI != null) {
                fragmentManager = LJJIFFI.getSupportFragmentManager();
            } else {
                fragmentManager = null;
            }
            OSZ[] oszArr = new OSZ[2];
            AnchorCommonStruct anchorCommonStruct5 = this.LJLJJL;
            if (anchorCommonStruct5 != null) {
                str7 = anchorCommonStruct5.getExtra();
            }
            oszArr[0] = new OSZ("anchor_extra", String.valueOf(str7));
            String groupId = LJJII().getGroupId();
            groupId.toString();
            oszArr[1] = new OSZ("group_id", groupId);
            java.util.Map<String, String> LJJL = C113554cx.LJJL(oszArr);
            if (C31205CMn.LIZ() != null) {
                ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).y40(fragmentManager, buildUpon.toString(), LJJL);
                return;
            }
            return;
        }
        IAdSparkUtils LJFF = AdSparkUtils.LJFF();
        if (LJFF == null) {
            return;
        }
        String builder = buildUpon.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(builder, "urlBuilder.toString()");
        LJFF.LIZLLL(LIZ2, builder, bundle, LJIIL, C59209NLp.LIZIZ(), false);
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
