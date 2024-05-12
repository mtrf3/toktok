package X;

import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ComponentData;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.LiveProduct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NPt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59317NPt implements InterfaceC36621EYv<LiveAdCardModel> {
    public final /* synthetic */ C59316NPs LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public C59317NPt(C59316NPs c59316NPs, long j) {
        this.LJLIL = c59316NPs;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<LiveAdCardModel> call, Throwable t) {
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        C59316NPs c59316NPs = this.LJLIL;
        if (c59316NPs.LLLLIIL) {
            Aweme aweme = c59316NPs.LJLJLJ;
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
    public final void LJII(InterfaceC37276Ek4<LiveAdCardModel> call, C64797Pbt<LiveAdCardModel> response) {
        AwemeRawAd awemeRawAd;
        ComponentData componentData;
        CardStruct cardStruct;
        int i;
        String str;
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        Aweme aweme = this.LJLIL.LJLJLJ;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        if (!C59406NTe.LJIILIIL(this.LJLIL.LJLJLJ)) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
            LIZLLL.LIZJ("card", "refer");
            LIZLLL.LIZIZ("app_tech_problem", "fail_reason");
            LIZLLL.LJI();
            return;
        }
        if (response.LIZIZ()) {
            LiveAdCardModel liveAdCardModel = response.LIZIZ;
            String str2 = null;
            if (liveAdCardModel != null && (componentData = liveAdCardModel.getComponentData()) != null && componentData.getCardInfo() != null) {
                LiveAdCardModel liveAdCardModel2 = response.LIZIZ;
                if (liveAdCardModel2 == null) {
                    return;
                }
                LiveProduct liveProductCase = liveAdCardModel2.getLiveProductCase();
                Object frontendExtraData = liveAdCardModel2.getFrontendExtraData();
                if (liveProductCase != null) {
                    if (liveProductCase.getProductStatus() != 1) {
                        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
                        LIZLLL2.LIZJ("card", "refer");
                        LIZLLL2.LIZIZ("sold_out", "fail_reason");
                        LIZLLL2.LJI();
                        return;
                    }
                } else if (frontendExtraData == null) {
                    C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
                    LIZLLL3.LIZJ("card", "refer");
                    LIZLLL3.LIZIZ("no_live_product", "fail_reason");
                    LIZLLL3.LJI();
                    return;
                }
                ComponentData componentData2 = liveAdCardModel2.getComponentData();
                if (componentData2 != null) {
                    cardStruct = componentData2.getCardInfo();
                } else {
                    cardStruct = null;
                }
                if (cardStruct != null && o.LJ(cardStruct.getOnlyTrackEventNotShow(), Boolean.TRUE)) {
                    C58655N0h LIZLLL4 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
                    LIZLLL4.LIZJ("card", "refer");
                    LIZLLL4.LIZIZ("only_track", "fail_reason");
                    LIZLLL4.LJI();
                    return;
                }
                C59316NPs c59316NPs = this.LJLIL;
                if (c59316NPs.LLLLJ) {
                    C58655N0h LIZLLL5 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
                    LIZLLL5.LIZJ("card", "refer");
                    LIZLLL5.LIZIZ("comment_block", "fail_reason");
                    LIZLLL5.LJI();
                    return;
                }
                if (c59316NPs.LLLLJI) {
                    C58655N0h LIZLLL6 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
                    LIZLLL6.LIZJ("card", "refer");
                    LIZLLL6.LIZIZ("share_block", "fail_reason");
                    LIZLLL6.LJI();
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - this.LJLILLLLZI));
                    jSONObject.putOpt("component_type", Integer.valueOf(awemeRawAd.getComponentType()));
                    FMX.LJIILJJIL("ad_live_card_request", jSONObject);
                } catch (Exception unused) {
                }
                awemeRawAd.setLiveCardInfo(cardStruct);
                this.LJLIL.LLZLLIL().LIZLLL(this.LJLIL.LJLJLJ);
                if (this.LJLIL.LLZLLIL().LJIIIIZZ() != null) {
                    NSW LJIIIIZZ = this.LJLIL.LLZLLIL().LJIIIIZZ();
                    if (LJIIIIZZ != null) {
                        LJIIIIZZ.LIZ();
                    }
                    C59316NPs c59316NPs2 = this.LJLIL;
                    Aweme aweme2 = c59316NPs2.LJLJLJ;
                    if (aweme2 != null) {
                        AdLiveEnterRoomConfig LIZ = C59406NTe.LIZ(aweme2, awemeRawAd);
                        LIZ.followStatus = String.valueOf(aweme2.getAuthor().getFollowStatus());
                        if (liveAdCardModel2.getLiveProduct() != null) {
                            str = C75792yF.LIZJ(liveAdCardModel2.getLiveProduct());
                        } else {
                            str = null;
                        }
                        if (frontendExtraData != null) {
                            str2 = C75792yF.LIZJ(frontendExtraData);
                        }
                        NSW LJIIIIZZ2 = c59316NPs2.LLZLLIL().LJIIIIZZ();
                        if (LJIIIIZZ2 != null) {
                            String LIZJ = C75792yF.LIZJ(LIZ);
                            o.LJIIIIZZ(LIZJ, "toJson(schemaConfig)");
                            LJIIIIZZ2.LJFF(LIZJ, str, str2);
                        }
                    }
                }
                this.LJLIL.LLZLLIL().LIZJ();
                NQB LLZLLIL = this.LJLIL.LLZLLIL();
                if (cardStruct != null) {
                    i = cardStruct.getShowSeconds() * 1000;
                } else {
                    i = 0;
                }
                LLZLLIL.LJ(Math.max(i, 0), false);
                return;
            }
        }
        C58655N0h LIZLLL7 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
        LIZLLL7.LIZJ("card", "refer");
        LIZLLL7.LIZIZ("no_live_product", "fail_reason");
        LIZLLL7.LJI();
    }
}
