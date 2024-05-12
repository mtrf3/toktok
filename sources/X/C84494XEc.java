package X;

import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApi;
import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApiResBean;
import kotlin.jvm.internal.o;

/* renamed from: X.XEc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84494XEc {
    public static final C84494XEc LIZ = new C84494XEc();

    public static final C10K<EffectFetchApiResBean> LIZ(String host, String effectId, String sdkVersion) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(sdkVersion, "sdkVersion");
        return ((EffectFetchApi) C60903NvH.LJIIJJI().getNetworkService().createRetrofit(host, true, EffectFetchApi.class)).getEffectMetaWithoutLogin(effectId, sdkVersion, "android");
    }
}
