package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C62814Ol0;
import X.C78266Une;
import X.C84763XOl;
import X.C85990Xow;
import X.C85999Xp5;
import X.EF7;
import X.FVP;
import X.InterfaceC78493UrJ;
import X.InterfaceC78494UrK;
import X.InterfaceC92693kP;
import X.OZ1;
import Y.AfS35S0101000_3;
import Y.AfS36S0101000_5;
import Y.AfS38S0101000_10;
import Y.AfS39S0101000_13;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.Locale;

/* loaded from: classes14.dex */
public class LiveHostAppContext implements IHostAppContext {
    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getBoeLane() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getPpeLane() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isBoe() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isLiveInhouse() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isOffline() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isPpe() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int liveId() {
        return 12;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C78266Une.LIZJ(this);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final Context context() {
        return EF7.LIZIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final Locale currentLocale() {
        return C85999Xp5.LIZJ(EF7.LIZIZ(), null, null);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getServerDeviceId() {
        return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int getShortVersionCode() {
        Long.valueOf(EF7.LJI()).intValue();
        int i = 0;
        try {
            String[] split = EF7.LJII().split("\\.");
            int length = split.length;
            int i2 = 0;
            while (i < length) {
                try {
                    i2 = CastIntegerProtector.parseInt(split[i]) + (i2 * 100);
                    i++;
                } catch (Throwable unused) {
                    i = i2;
                    return i;
                }
            }
            return i2;
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int getUpdateVersionCode() {
        try {
            return C62814Ol0.LJIILL(context(), "UPDATE_VERSION_CODE");
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getVersionCode() {
        return String.valueOf(EF7.LJI());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int getVersionCodeInt() {
        return (int) EF7.LJI();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getVersionName() {
        return EF7.LJII();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isAppForeground() {
        return ActivityLifeObserver.getInstance().isForeground();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isInMusicallyRegion() {
        return !C85990Xow.LJIIIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isLocalTest() {
        return TextUtils.equals(getChannel(), "local_test");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int appId() {
        return 1233;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String appName() {
        return "musical_ly";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getBuildNumber() {
        return EF7.LJIIJJI;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getChannel() {
        return EF7.LJIILIIL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getIapKey() {
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi15r9zfdlMuE3zfC3ZZEA4U0ursaCpeXTw024ezGLKOVz7E+hBgbAhsONpfZ9tTqzEm+nc48hSs0gvhbWxFd8wSelqqJQhpSaVFLwC8VKA/oPDL7MAwbGfnlaAADwer4EOZ29KJFRiWWxolOvw9Vpzfrca6JvxSe87Y2buZp+z9kFxlGfUpyPpTkqh/8IuvZnQRTVnlOtZ1aV0urNjHgwj760LlCGO6Mwta82YTIrHIFO7JKhT5aXcrnrb7WnlojKtM3mNZ6q157D2fGiv+Gsule/ullOmXLvSkW0bJXCoQRnE9HxzmRKNss4ekmX3Vr+jmEcw1esSJ6V6LtY4JAeQIDAQAB";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getSessionId() {
        return FVP.LIZIZ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isAppBackground() {
        return C84763XOl.LJIIJJI;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void openQrScannerPage(Context context) {
        OZ1.LIZIZ.LIZIZ(context, -1, false);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final InterfaceC92693kP registerAppEnterForeBackgroundCallback(InterfaceC78493UrJ interfaceC78493UrJ) {
        return C84763XOl.LJIIJ.LJJJJLL().LJJJJZI(new AfS39S0101000_13(3, interfaceC78493UrJ, 4));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void registerLifeCycleCallback(InterfaceC78494UrK interfaceC78494UrK) {
        interfaceC78494UrK.LIZIZ(C84763XOl.LJIIJJI);
        C84763XOl.LIZ().LJJJJZI(new AfS36S0101000_5(2, interfaceC78494UrK, 16));
        C84763XOl.LJ().LJJJJZI(new AfS36S0101000_5(2, interfaceC78494UrK, 49));
        C84763XOl.LIZLLL().LJJJJZI(new AfS36S0101000_5(2, interfaceC78494UrK, 1));
        C84763XOl.LIZJ().LJJJJZI(new AfS36S0101000_5(1, interfaceC78494UrK, 50));
        C84763XOl.LJFF().LJJJJZI(new AfS38S0101000_10(1, interfaceC78494UrK, 0));
        C84763XOl.LIZIZ().LJJJJZI(new AfS35S0101000_3(2, interfaceC78494UrK, 2));
        C84763XOl.LJIIJ.LJJJJLL().LJJJJZI(new AfS39S0101000_13(2, interfaceC78494UrK, 3));
    }
}
