package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Qp6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68164Qp6 {
    public final AtomicBoolean LIZ;
    public final C62822Ol8 LIZIZ;
    public final C67959Qln LIZJ;
    public InterfaceC88472Yns<? super C67964Qls, C76800UCe> LIZLLL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJ;

    public C68164Qp6(Context context) {
        String LJI;
        String str;
        o.LJIIIZ(context, "context");
        this.LIZ = new AtomicBoolean(false);
        this.LIZIZ = C221108m2.LIZIZ(C68171QpD.LJLIL);
        C68166Qp8 c68166Qp8 = new C68166Qp8(this);
        this.LIZLLL = C68170QpC.LJLIL;
        this.LJ = C68169QpB.LJLIL;
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI2 = SettingsManager.LJI("google_pay_display_label", "");
            o.LJIIIIZZ(LJI2, "getInstance().getStringV…abelSettings::class.java)");
            if (o.LJ(LJI2, "")) {
                LJI = null;
            } else {
                SettingsManager.LIZLLL().getClass();
                LJI = SettingsManager.LJI("google_pay_display_label", "");
                o.LJIIIIZZ(LJI, "getInstance().getStringV…abelSettings::class.java)");
            }
            C68167Qp9 c68167Qp9 = new C68167Qp9(0);
            String appVersionMinor = DeviceRegisterManager.getAppVersionMinor();
            o.LJIIIIZZ(appVersionMinor, "getAppVersionMinor()");
            c68167Qp9.LIZLLL = appVersionMinor;
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
            c68167Qp9.LIZ = com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
            String v = String.valueOf(DeviceRegisterManager.getAppId());
            o.LJIIIZ(v, "v");
            c68167Qp9.LIZIZ = v;
            if (AppLog.getSwitchToBdtracker()) {
                str = DeviceRegisterManager.getChannel(context);
            } else {
                str = QK9.LIZ;
            }
            o.LJIIIIZZ(str, "if (AppLog.getSwitchToBd…HeaderHelper.getChannel()");
            c68167Qp9.LIZJ = str;
            String str2 = c68167Qp9.LIZ;
            if (str2 != null) {
                C67966Qlu c67966Qlu = new C67966Qlu(str2, c68167Qp9.LIZIZ, str, c68167Qp9.LIZLLL, null);
                C67959Qln c67959Qln = C67959Qln.LIZ;
                C68165Qp7 c68165Qp7 = new C68165Qp7(0);
                Context LLLLL = C16880lQ.LLLLL(context);
                o.LJIIIIZZ(LLLLL, "context.applicationContext");
                c68165Qp7.LIZIZ = LLLLL;
                SettingsManager.LIZLLL().getClass();
                String LJI3 = SettingsManager.LJI("ecom_google_pay_merchant_number", "BCR2DN6T46W27UKN");
                o.LJIIIIZZ(LJI3, "getInstance().getStringV…mberSettings::class.java)");
                c68165Qp7.LJFF = LJI3;
                c68165Qp7.LJII = LJI;
                c68165Qp7.LIZ = Boolean.valueOf(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe());
                c68165Qp7.LJI = c67966Qlu;
                c68165Qp7.LIZLLL = c68166Qp8;
                c67959Qln.LIZLLL(c68165Qp7.LIZ());
                this.LIZJ = c67959Qln;
                return;
            }
            throw new IllegalArgumentException("need to set did");
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GooglePay.init :");
            LIZ.append(e.getMessage());
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
    }
}
