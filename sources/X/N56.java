package X;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import java.util.HashSet;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N56 implements InterfaceC55513LqX {
    public final /* synthetic */ C55495LqF LIZ;

    public N56(C55495LqF c55495LqF) {
        this.LIZ = c55495LqF;
    }

    @Override // X.InterfaceC55513LqX
    public final void LIZ(CommonAdData commonAdData, C58655N0h c58655N0h) {
        String LJI;
        Integer num;
        String str;
        String str2;
        o.LJIIIZ(commonAdData, "commonAdData");
        if (commonAdData instanceof AwemeRawAd) {
            if (TextUtils.equals(c58655N0h.LIZIZ, "click")) {
                NN2.LIZLLL((AwemeRawAd) commonAdData);
            }
            AwemeRawAd awemeRawAd = (AwemeRawAd) commonAdData;
            if (C78977Uz7.LJJJLIIL(awemeRawAd)) {
                c58655N0h.LIZIZ(awemeRawAd.getSplashInfo().anchorId, "anchor_id");
            }
            if (N58.LIZLLL.contains(c58655N0h.LIZIZ)) {
                AwemeSplashInfo splashInfo = awemeRawAd.getSplashInfo();
                if (splashInfo != null) {
                    str2 = splashInfo.getAwesomeSplashId();
                } else {
                    str2 = null;
                }
                if (!(!TextUtils.isEmpty(str2)) && !O5Y.LJJJJ(awemeRawAd) && awemeRawAd.getRollType() != 1) {
                    AdSessionPositionHelper.LJIILL(awemeRawAd, c58655N0h);
                }
            }
            if (O5Y.LJJJJ(awemeRawAd)) {
                this.LIZ.getClass();
                if (TextUtils.equals(c58655N0h.LIZ, "result_ad") || TextUtils.equals(c58655N0h.LIZ, "result_ad_bg")) {
                    if (NPC.LJIIIIZZ()) {
                        c58655N0h.LIZIZ(1, "is_single");
                    }
                    if (O5Y.LJJJJIZL(awemeRawAd)) {
                        c58655N0h.LIZIZ(1, "is_ci");
                    }
                    if (awemeRawAd.isSearchPreciseAd()) {
                        c58655N0h.LIZIZ(1, "precise_ads");
                    }
                    if (SearchAdMainService.LJIIJJI().LIZLLL()) {
                        c58655N0h.LIZIZ(1, "single_column_switch");
                    }
                } else if (N57.LIZ.contains(c58655N0h.LIZ) && N57.LIZIZ.contains(c58655N0h.LIZIZ)) {
                    if (SearchAdMainService.LJIIJJI().LIZLLL()) {
                        c58655N0h.LIZIZ(1, "single_column_switch");
                    }
                    if (NPC.LJIIIIZZ()) {
                        c58655N0h.LIZIZ(1, "is_single");
                    }
                    if (SearchAdMainService.LJIIJJI().LJ()) {
                        c58655N0h.LIZIZ(1, "is_inner");
                        java.util.Map<String, String> searchAdExtraParams = awemeRawAd.getSearchAdExtraParams();
                        if (searchAdExtraParams != null && (str = searchAdExtraParams.get("inner_ad_position")) != null) {
                            num = Integer.valueOf(CastIntegerProtector.parseInt(str));
                        } else {
                            num = null;
                        }
                        c58655N0h.LIZIZ(num, "inner_g_pos");
                    }
                }
            }
            c58655N0h.LIZIZ(awemeRawAd.getType(), "pack_content_type");
            if (o.LJ(c58655N0h.LIZIZ, "receive") && (LJI = C59050NFm.LIZIZ.LJI(awemeRawAd)) != null) {
                N11.LIZ.getClass();
                c58655N0h.LIZIZ(LJI, N11.LIZIZ.LIZ);
            }
        }
        if (N58.LIZIZ.contains(c58655N0h.LIZIZ) && N58.LIZ.contains(c58655N0h.LIZ)) {
            InterfaceC55496LqG interfaceC55496LqG = this.LIZ.LIZIZ;
            if (interfaceC55496LqG != null) {
                long currentPosition = interfaceC55496LqG.getCurrentPosition();
                InterfaceC55496LqG interfaceC55496LqG2 = this.LIZ.LIZIZ;
                if (interfaceC55496LqG2 != null) {
                    int LJIIIIZZ = interfaceC55496LqG2.LJIIIIZZ();
                    if (currentPosition < 0) {
                        InterfaceC55496LqG interfaceC55496LqG3 = this.LIZ.LIZIZ;
                        if (interfaceC55496LqG3 != null) {
                            currentPosition = interfaceC55496LqG3.LJI();
                        } else {
                            o.LJIJI("mainAdSceneCallBack");
                            throw null;
                        }
                    }
                    if (currentPosition >= 0) {
                        if (!((HashSet) N58.LIZJ).contains(c58655N0h.LIZIZ)) {
                            c58655N0h.LIZIZ(Long.valueOf(currentPosition), "duration");
                        }
                        C55495LqF c55495LqF = this.LIZ;
                        c55495LqF.getClass();
                        HomePageDataViewModel homePageDataViewModel = c55495LqF.LJIIIIZZ;
                        if (homePageDataViewModel != null) {
                            Aweme aweme = homePageDataViewModel.LJLJLLL;
                            if (aweme != null && IEW.LIZIZ(aweme)) {
                                c58655N0h.LIZIZ(Integer.valueOf(IEW.LIZIZ), "story_video_type");
                                LJIIIIZZ = IEW.LIZ() + 1;
                            }
                            c58655N0h.LIZIZ(Integer.valueOf(LJIIIIZZ), "play_order");
                        } else {
                            o.LJIJI("homeViewModel");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("mainAdSceneCallBack");
                    throw null;
                }
            } else {
                o.LJIJI("mainAdSceneCallBack");
                throw null;
            }
        }
        this.LIZ.LJJIIZI(new AqS159S0100000_9(c58655N0h, 922), c58655N0h.LIZ, c58655N0h.LIZIZ);
    }
}
