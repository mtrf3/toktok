package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Fde, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39426Fde implements IHostContextDepend {
    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isDebuggable() {
        return false;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isMiniAppEnable() {
        if (C38499F9b.LIZ.LIZIZ().checkMiniAppEnable(EF7.LIZIZ())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isTeenMode() {
        return false;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getBoeChannel() {
        String str;
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi != null) {
            str = localTestApi.getBoeLane();
        } else {
            str = null;
        }
        return String.valueOf(str);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getCurrentTelcomCarrier() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getPPEChannel() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getSkinName() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getSkinType() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isBoeEnable() {
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi != null && localTestApi.enableBoe()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isPPEEnable() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getAppName() {
        return EF7.LIZ();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final Application getApplication() {
        return FKM.LIZ();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final Context getApplicationContext() {
        Context LLLLJI = C16880lQ.LLLLJI(getApplication());
        o.LJFF(LLLLJI, "getApplication().applicationContext");
        return LLLLJI;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getDeviceId() {
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
        return com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getLanguage() {
        String locale = C39419FdX.LIZ().toString();
        o.LJIIIIZZ(locale, "getCurrentLocale().toString()");
        return locale;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getPackageName() {
        String packageName = EF7.LIZIZ().getPackageName();
        o.LJIIIIZZ(packageName, "AppContextManager.getApp…tionContext().packageName");
        return packageName;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getRegion() {
        return C85990Xow.LIZIZ();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getUpdateVersion() {
        return String.valueOf(EF7.LJFF());
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getUserAgent() {
        String LIZ;
        LIZ = FLE.LIZ("other");
        return LIZ;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final long getVersionCode() {
        return EF7.LIZJ();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getVersionName() {
        return EF7.LIZLLL();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final int getAppId() {
        return EF7.LJIIIZ;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getChannel() {
        return EF7.LJIILIIL;
    }
}
