package X;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl;
import com.ss.android.ugc.aweme.verify.EffectNetworkAllowUrls;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.net.URLDecoder;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HxW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45754HxW implements IAVEffectService {
    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void clearCacheInFTC() {
        Application application = C44172HVg.LIZ;
        o.LJIIIIZZ(application, "application");
        buildEffectPlatform(application, new C45760Hxc(), null);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final InterfaceC88472Yns<EffectPlatformBuilder, C76800UCe> getEffectPlatformDefaultRegionCallback() {
        return C43941HMj.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final String getEffectSDKVersion() {
        return C60903NvH.LJIIJJI().LJIJI().getEffectSDKVersion();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final int checkUrlValid(String str) {
        EffectNetworkAllowUrls effectNetworkAllowUrls;
        if (str == null || str.length() == 0) {
            return EnumC45755HxX.UNDEFINED.getValue();
        }
        String decodedUrl = URLDecoder.decode(str, PVC.LIZ.name());
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            effectNetworkAllowUrls = C2311995n.LIZ;
            EffectNetworkAllowUrls effectNetworkAllowUrls2 = (EffectNetworkAllowUrls) LIZLLL.LJIIIIZZ("tool_effect_network_allowlist", EffectNetworkAllowUrls.class, effectNetworkAllowUrls);
            if (effectNetworkAllowUrls2 != null) {
                effectNetworkAllowUrls = effectNetworkAllowUrls2;
            }
            o.LJIIIIZZ(effectNetworkAllowUrls, "SettingsManager.getInsta…t::class.java) ?: DEFAULT");
        } catch (Exception unused) {
            effectNetworkAllowUrls = C2311995n.LIZ;
        }
        List<String> list = effectNetworkAllowUrls.urls;
        if (list.isEmpty()) {
            return EnumC45755HxX.UNDEFINED.getValue();
        }
        if (!list.isEmpty()) {
            for (String str2 : list) {
                o.LJIIIIZZ(decodedUrl, "decodedUrl");
                if (!s.LJJJLZIJ(decodedUrl, str2, false)) {
                    try {
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                    if (PatternProtector.compile(str2).matcher(decodedUrl).find()) {
                    }
                }
                return EnumC45755HxX.VALID.getValue();
            }
        }
        return EnumC45755HxX.ILLEGAL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final boolean isEffectControlGame(Effect effect) {
        o.LJIIIZ(effect, "effect");
        return V3N.LJIILLIIL(effect);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void provideResourceFinder(IAVEffectService.IAVEffectReadyCallback<IAVEffectService.ResourceFinder> callback) {
        o.LJIIIZ(callback, "callback");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = false;
        c43939HMh.LIZIZ = new AqS157S0100000_7(callback, (IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg>) 734);
        c43939HMh.LIZ = new AqS157S0100000_7(callback, (IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg>) 735);
        c43939HMh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void fetchEffectModel(String[] requirements, IAVEffectService.IAVEffectReadyCallback<String[]> iAVEffectReadyCallback) {
        o.LJIIIZ(requirements, "requirements");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = false;
        c43939HMh.LIZIZ = new AqS154S0200000_7(requirements, (String[]) iAVEffectReadyCallback, (IAVEffectService.IAVEffectReadyCallback<String[]>) 137);
        c43939HMh.LIZ = new AqS157S0100000_7(iAVEffectReadyCallback, (IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg>) 733);
        c43939HMh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void fetchEffectResourcePathById(String effectId, IAVEffectService.OnFetchResult onFetchResult) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(onFetchResult, "onFetchResult");
        C84488XDw.LIZ(C5L7.LIZ(), null).LIZLLL(effectId, null, new C45756HxY(onFetchResult));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void buildEffectPlatform(Context context, IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> callback, InterfaceC88472Yns<? super EffectPlatformBuilder, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        buildEffectPlatform(context, false, callback, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void buildEffectPlatform(Context context, boolean z, IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> callback, InterfaceC88472Yns<? super EffectPlatformBuilder, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = z;
        c43939HMh.LIZIZ = new AqS96S0300000_7(context, callback, interfaceC88472Yns, 30);
        c43939HMh.LIZ = new AqS157S0100000_7(callback, (IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg>) 732);
        c43939HMh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void fetchEffectListResource(List<String> effectIds, java.util.Map<String, String> map, boolean z, InterfaceC84498XEg effectPlatform, IFetchEffectListListener iFetchEffectListListener) {
        o.LJIIIZ(effectIds, "effectIds");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        effectPlatform.LJ(effectIds, true, map, iFetchEffectListListener);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void fetchEffectResource(String effectId, boolean z, java.util.Map<String, String> map, InterfaceC84498XEg effectPlatform, IFetchEffectListener iFetchEffectListener) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        if (z) {
            EffectService companion = EffectService.Companion.getInstance();
            if (companion != null) {
                companion.fetchEffectWithMusicBind(effectPlatform, effectId, map, iFetchEffectListener);
                return;
            }
            return;
        }
        effectPlatform.LIZLLL(effectId, map, iFetchEffectListener);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final InterfaceC42533Gmf getVideoCoverBitmapCache(LifecycleOwner owner, String videoPath, int i, int i2, int i3, float f) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(videoPath, "videoPath");
        TENativeLibsLoader.loadLibrary();
        return new VideoCoverCacheImpl(owner, videoPath, i, i2, i3, f);
    }
}
