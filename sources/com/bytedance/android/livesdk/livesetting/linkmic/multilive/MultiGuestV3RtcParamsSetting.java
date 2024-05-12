package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09650Zl;
import X.C221108m2;
import X.C5H3;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import X.N4J;
import android.util.LruCache;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.j;
import com.google.gson.m;

@SettingsKey("muilt_live_pipeline_params")
/* loaded from: classes11.dex */
public final class MultiGuestV3RtcParamsSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final MultiGuestV3RtcParamsSetting INSTANCE = new MultiGuestV3RtcParamsSetting();
    public static final C5H3 cache$delegate = C221108m2.LIZIZ(N4J.LJLIL);
    public static final LruCache<String, RtcParams> configCache = new LruCache<>(6);
    public static volatile InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> loader;

    private final m getCache() {
        return (m) cache$delegate.getValue();
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(MultiGuestV3RtcParamsSetting.class);
    }

    public final RtcParams getRtcParams(String str, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> interfaceC88471Ynr) {
        j LJJIJ;
        if (str == null) {
            return null;
        }
        if (loader == null) {
            loader = interfaceC88471Ynr;
        }
        try {
            LruCache<String, RtcParams> lruCache = configCache;
            RtcParams rtcParams = lruCache.get(str);
            if (rtcParams == null) {
                m cache = INSTANCE.getCache();
                if (cache == null || (LJJIJ = cache.LJJIJ(str)) == null) {
                    return null;
                }
                Object LIZJ = C09650Zl.LIZIZ.LIZJ(LJJIJ, RtcParams.class);
                lruCache.put(str, (RtcParams) LIZJ);
                rtcParams = (RtcParams) LIZJ;
            }
            return rtcParams;
        } catch (Throwable th) {
            InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> interfaceC88471Ynr2 = loader;
            if (interfaceC88471Ynr2 == null) {
                return null;
            }
            interfaceC88471Ynr2.invoke("parse config json error", th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RtcParams getRtcParams$default(MultiGuestV3RtcParamsSetting multiGuestV3RtcParamsSetting, String str, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC88471Ynr = null;
        }
        return multiGuestV3RtcParamsSetting.getRtcParams(str, interfaceC88471Ynr);
    }
}
