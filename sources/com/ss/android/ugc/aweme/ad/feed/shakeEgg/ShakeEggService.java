package com.ss.android.ugc.aweme.ad.feed.shakeEgg;

import X.ActivityC45651qj;
import X.C29S;
import X.C47261Igj;
import X.C58909NAb;
import X.C59125NIj;
import X.C60996Nwm;
import X.C61410O8g;
import X.C61878OQg;
import X.C69432nz;
import X.EnumC59152NJk;
import X.FFL;
import X.InterfaceC55508LqS;
import X.NH3;
import X.NJP;
import X.NLO;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.TopViewGeckoExperiment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ShakeEggService implements IShakeEggService {
    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final boolean LIZ(Aweme aweme) {
        if (LIZIZ(aweme) != null) {
            return !r0.getShaken();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final ShakeModel LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        ShakeModel shakeModel;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (shakeModel = awemeRawAd.getShakeModel()) != null) {
            return shakeModel;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final InterfaceC55508LqS LIZJ(C29S c29s) {
        return new ShakeEgg(c29s);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final void LIZLLL(AwemeRawAd rawAd, List<String> list) {
        IAdLandPagePreloadService LJJI;
        String LJIIL;
        o.LJIIIZ(rawAd, "rawAd");
        if (list != null && (LJJI = AdLandPagePreloadServiceImpl.LJJI()) != null && (LJIIL = LJJI.LJIIL("lynx_feed")) != null) {
            TopViewGeckoExperiment.LIZ.getClass();
            FFL.LJIIIZ().getClass();
            Integer num = null;
            TopViewGeckoExperiment.GeckoOptimizeSetting geckoOptimizeSetting = (TopViewGeckoExperiment.GeckoOptimizeSetting) FFL.LJIJ(true, "splash_gecko_optimize_setting", 31744, TopViewGeckoExperiment.GeckoOptimizeSetting.class, null);
            AwemeSplashInfo splashInfo = rawAd.getSplashInfo();
            if (splashInfo != null) {
                num = Integer.valueOf(splashInfo.getEndTime());
            }
            if (geckoOptimizeSetting == null || !geckoOptimizeSetting.didOptimize || num == null) {
                C58909NAb.LIZ.getClass();
                if (NH3.LIZIZ() != null) {
                    NJP.LJFF(list, LJIIL, "lynx_feed", new NLO(rawAd, list, LJIIL));
                    return;
                }
                return;
            }
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setListener(new NLO(rawAd, list, LJIIL));
            List<String> list2 = geckoOptimizeSetting.longTimeChannel;
            Long l = geckoOptimizeSetting.longTimeBuffer;
            EnumC59152NJk enumC59152NJk = EnumC59152NJk.SPECIFIC_TIME;
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            C59125NIj c59125NIj = new C59125NIj(0, enumC59152NJk, c61878OQg, Long.valueOf((num.intValue() + geckoOptimizeSetting.normalBuffer) * 1000));
            if (list2 == null || list2.isEmpty() || l == null) {
                optionCheckUpdateParams.setCacheConfig(c59125NIj);
                C58909NAb.LIZ.getClass();
                if (NH3.LIZIZ() == null) {
                    return;
                }
                NJP.LJ(list, LJIIL, optionCheckUpdateParams);
                return;
            }
            C59125NIj c59125NIj2 = new C59125NIj(0, enumC59152NJk, c61878OQg, Long.valueOf((l.longValue() + num.intValue()) * 1000));
            for (String str : list) {
                if (list2.contains(str)) {
                    optionCheckUpdateParams.setCacheConfig(c59125NIj2);
                } else {
                    optionCheckUpdateParams.setCacheConfig(c59125NIj);
                }
                C58909NAb.LIZ.getClass();
                if (NH3.LIZIZ() != null) {
                    NJP.LJ(C47261Igj.LJJIJ(str), LJIIL, optionCheckUpdateParams);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final String LJ(ShakeModel shakeModel, ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("width", Integer.valueOf(context.getResources().getDisplayMetrics().widthPixels));
        jSONObject.putOpt("height", Integer.valueOf(C60996Nwm.LIZJ(context) - C61410O8g.LIZIZ(context)));
        jSONObject.putOpt("scale", Float.valueOf(context.getResources().getDisplayMetrics().density));
        if (shakeModel != null) {
            List<String> geckoChannel = shakeModel.getGeckoChannel();
            if (geckoChannel != null) {
                jSONObject.putOpt("gecko_channel", GsonProtectorUtils.toJson(C69432nz.LIZ(), geckoChannel));
            }
            Object frontendData = shakeModel.getFrontendData();
            if (frontendData != null) {
                jSONObject.putOpt("data", GsonProtectorUtils.toJson(C69432nz.LIZ(), frontendData));
            }
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }
}
