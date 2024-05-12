package X;

import com.bef.effectsdk.EffectSDKUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class P8O implements InterfaceC121054p3 {
    @Override // X.InterfaceC121054p3
    public final void LIZ(java.util.Map<String, String> map) {
        String effectSdkVersion;
        if (map != null) {
            try {
                effectSdkVersion = EffectSDKUtils.nativeGetSdkVersion();
            } catch (Throwable unused) {
                effectSdkVersion = "0.0.0";
            }
            o.LJIIIIZZ(effectSdkVersion, "effectSdkVersion");
            map.put("effect_sdk_version", effectSdkVersion);
        }
    }
}
