package X;

import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectService;

/* loaded from: classes7.dex */
public final class EQX {
    public static final /* synthetic */ EQX LIZ = new EQX();

    public static TTEPEffectService LIZ() {
        return (TTEPEffectService) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getNetworkService().createRetrofitWithInterceptors("https://effecthouse.tiktok.com", true, TTEPEffectService.class, C47261Igj.LJJIJ(new EPRequestInterceptor()));
    }
}
