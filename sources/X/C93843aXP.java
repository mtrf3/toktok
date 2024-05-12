package X;

import com.bytedance.effectcreatormobile.ckeapi.api.resource.IEffectPlatformConfigProvider;

/* renamed from: X.aXP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93843aXP {
    public static final IEffectPlatformConfigProvider LIZ() {
        IEffectPlatformConfigProvider iEffectPlatformConfigProvider;
        C93970aZS LIZ = C93971aZT.LIZ();
        if (LIZ != null && (iEffectPlatformConfigProvider = (IEffectPlatformConfigProvider) LIZ.LIZ(IEffectPlatformConfigProvider.class)) != null) {
            return iEffectPlatformConfigProvider;
        }
        throw new IllegalArgumentException("please implement IEffectPlatformConfigProvider");
    }
}
