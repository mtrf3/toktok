package X;

import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ComponentData;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.LiveProduct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NPu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59318NPu implements InterfaceC36621EYv<LiveAdCardModel> {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ AdCardWidget LJLJI;
    public final /* synthetic */ LiveRoomStruct LJLJJI;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<LiveAdCardModel> interfaceC37276Ek4, Throwable th) {
        AwemeRawAd awemeRawAd;
        C86343Xud LJLZ = this.LJLJI.LJLZ();
        if (LJLZ != null && LJLZ.LJFF) {
            Aweme aweme = this.LJLIL;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
            LIZLLL.LIZJ("card", "refer");
            LIZLLL.LIZIZ("app_tech_problem", "fail_reason");
            LIZLLL.LJI();
        }
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<LiveAdCardModel> interfaceC37276Ek4, C64797Pbt<LiveAdCardModel> c64797Pbt) {
        LiveAdCardModel liveAdCardModel;
        ComponentData componentData;
        CardStruct cardStruct;
        Integer num;
        String str;
        Aweme aweme = this.LJLIL;
        AwemeRawAd awemeRawAd = null;
        String str2 = null;
        AwemeRawAd awemeRawAd2 = null;
        if (aweme == null || !C59406NTe.LJIILIIL(aweme)) {
            Aweme aweme2 = this.LJLIL;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
            LIZLLL.LIZJ("card", "refer");
            LIZLLL.LIZIZ("app_tech_problem", "fail_reason");
            LIZLLL.LJI();
            return;
        }
        if (c64797Pbt != null) {
            liveAdCardModel = c64797Pbt.LIZIZ;
        } else {
            liveAdCardModel = null;
        }
        if (liveAdCardModel == null || !c64797Pbt.LIZIZ() || c64797Pbt.LIZIZ.getComponentData() == null || (componentData = c64797Pbt.LIZIZ.getComponentData()) == null || componentData.getCardInfo() == null) {
            Aweme aweme3 = this.LJLIL;
            if (aweme3 != null) {
                awemeRawAd2 = aweme3.getAwemeRawAd();
            }
            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd2);
            LIZLLL2.LIZJ("card", "refer");
            LIZLLL2.LIZIZ("no_live_product", "fail_reason");
            LIZLLL2.LJI();
            return;
        }
        String componentFailReason = c64797Pbt.LIZIZ.getComponentFailReason();
        if (componentFailReason != null) {
            C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", this.LJLIL.getAwemeRawAd());
            LIZLLL3.LIZJ("card", "refer");
            LIZLLL3.LIZIZ(componentFailReason, "fail_reason");
            LIZLLL3.LJI();
            return;
        }
        LiveProduct liveProductCase = c64797Pbt.LIZIZ.getLiveProductCase();
        Object frontendExtraData = c64797Pbt.LIZIZ.getFrontendExtraData();
        if (liveProductCase != null) {
            if (liveProductCase.getProductStatus() != 1) {
                C58655N0h LIZLLL4 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", this.LJLIL.getAwemeRawAd());
                LIZLLL4.LIZJ("card", "refer");
                LIZLLL4.LIZIZ("sold_out", "fail_reason");
                LIZLLL4.LJI();
                return;
            }
        } else if (frontendExtraData == null) {
            C58655N0h LIZLLL5 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", this.LJLIL.getAwemeRawAd());
            LIZLLL5.LIZJ("card", "refer");
            LIZLLL5.LIZIZ("no_live_product", "fail_reason");
            LIZLLL5.LJI();
            return;
        }
        ComponentData componentData2 = c64797Pbt.LIZIZ.getComponentData();
        if (componentData2 != null) {
            cardStruct = componentData2.getCardInfo();
            if (cardStruct != null && o.LJ(cardStruct.getOnlyTrackEventNotShow(), Boolean.TRUE)) {
                C58655N0h LIZLLL6 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", this.LJLIL.getAwemeRawAd());
                LIZLLL6.LIZJ("card", "refer");
                LIZLLL6.LIZIZ("only_track", "fail_reason");
                LIZLLL6.LJI();
                return;
            }
        } else {
            cardStruct = null;
        }
        JSONObject jSONObject = new JSONObject();
        long j = this.LJLILLLLZI;
        Aweme aweme4 = this.LJLIL;
        jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - j));
        AwemeRawAd awemeRawAd3 = aweme4.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            num = Integer.valueOf(awemeRawAd3.getComponentType());
        } else {
            num = null;
        }
        jSONObject.putOpt("component_type", num);
        FMX.LJIILJJIL("ad_live_card_request", jSONObject);
        if (cardStruct != null) {
            AdCardWidget adCardWidget = this.LJLJI;
            Aweme aweme5 = this.LJLIL;
            LiveRoomStruct liveRoomStruct = this.LJLJJI;
            adCardWidget.LJZ().LJIIIIZZ(cardStruct);
            AwemeRawAd awemeRawAd4 = aweme5.getAwemeRawAd();
            if (awemeRawAd4 == null) {
                awemeRawAd4 = new AwemeRawAd();
            }
            AdLiveEnterRoomConfig LIZ = C59406NTe.LIZ(aweme5, awemeRawAd4);
            LIZ.followStatus = String.valueOf(liveRoomStruct.owner.getFollowStatus());
            InterfaceC59337NQn LJZ = adCardWidget.LJZ();
            String LIZJ = C75792yF.LIZJ(LIZ);
            o.LJIIIIZZ(LIZJ, "toJson(schemaConfig)");
            Object liveProduct = c64797Pbt.LIZIZ.getLiveProduct();
            if (liveProduct != null) {
                str = C75792yF.LIZJ(liveProduct);
            } else {
                str = null;
            }
            if (frontendExtraData != null) {
                str2 = C75792yF.LIZJ(frontendExtraData);
            }
            LJZ.LJFF(LIZJ, str, str2);
            adCardWidget.LJZ().LIZIZ();
            if (cardStruct.getShowSeconds() > 0) {
                adCardWidget.LJZ().LJ(cardStruct.getShowSeconds() * 1000);
            } else {
                adCardWidget.LJZ().LJ(0L);
            }
        }
    }

    public C59318NPu(Aweme aweme, long j, AdCardWidget adCardWidget, LiveRoomStruct liveRoomStruct) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = j;
        this.LJLJI = adCardWidget;
        this.LJLJJI = liveRoomStruct;
    }
}
