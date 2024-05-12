package X;

import Y.IDeS354S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AY0 extends AbstractC247499nV {
    @Override // X.AbstractC247499nV
    public final int LJIIJJI() {
        return C53946LFe.LIZJ(null, null).LIZIZ;
    }

    @Override // X.AbstractC247499nV
    public final boolean LJIILL() {
        return C53946LFe.LIZJ(null, null).LJFF;
    }

    @Override // X.AbstractC247499nV
    public final int LJIIL() {
        if (((Keva) YAI.LIZIZ.getValue().LIZ.getValue()).getBoolean("use_local_time", false)) {
            return (int) (System.currentTimeMillis() / 1000);
        }
        return C1E4.LJIIZILJ();
    }

    @Override // X.AbstractC247499nV
    public final ActivityC45651qj LIZLLL() {
        Activity[] activities = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activities, "activities");
        for (Activity activity : activities) {
            if (activity instanceof InterfaceC55058LjC) {
                if (!(activity instanceof ActivityC45651qj)) {
                    return null;
                }
                return (ActivityC45651qj) activity;
            }
        }
        return null;
    }

    @Override // X.AbstractC247499nV
    public final Context LJ() {
        return EF7.LIZIZ();
    }

    @Override // X.AbstractC247499nV
    public final String LJI() {
        return C85990Xow.LJ();
    }

    @Override // X.AbstractC247499nV
    public final Activity LJII() {
        return C84763XOl.LJIIIIZZ();
    }

    @Override // X.AbstractC247499nV
    public final String LJIIIIZZ() {
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
        return com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
    }

    @Override // X.AbstractC247499nV
    public final String LJIIIZ() {
        if (C26396AXo.LIZIZ()) {
            return "feed";
        }
        if (C26396AXo.LIZ()) {
            return "follow";
        }
        return "others";
    }

    @Override // X.AbstractC247499nV
    public final String LJIIJ() {
        String lowerCase = C85990Xow.LIZ().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @Override // X.AbstractC247499nV
    public final String LJIILIIL() {
        return HG3.LJIILL().getCurUserId();
    }

    @Override // X.AbstractC247499nV
    public final boolean LJIILJJIL() {
        return AV1.LJIILLIIL();
    }

    @Override // X.AbstractC247499nV
    public final boolean LJIILLIIL() {
        return HG3.LJIILL().isLogin();
    }

    @Override // X.AbstractC247499nV
    public final void LIZJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (LJIILLIIL()) {
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return;
        }
        Bundle LIZ = C0JT.LIZ("is_fullscreen_dialog", false, "is_skippable_dialog", true);
        LIZ.putBoolean("show_login_page_first", true);
        C78450Uqc c78450Uqc = new C78450Uqc();
        c78450Uqc.LIZ = LJIIIIZZ;
        c78450Uqc.LIZLLL = LIZ;
        c78450Uqc.LJ = new IDeS354S0100000_4(interfaceC65784Pro, 0);
        AccountService.LJIJ().LJI().showLoginAndRegisterView(new C78451Uqd(c78450Uqc));
    }

    @Override // X.AbstractC247499nV
    public final void LIZIZ(Activity activity, final C95P listener) {
        o.LJIIIZ(listener, "listener");
        C9XU.LIZIZ(activity, new G27() { // from class: X.9up
            @Override // X.G27
            public final void onConfigurationChanged(Activity activity2, Configuration newConfig) {
                o.LJIIIZ(newConfig, "newConfig");
                C95P.this.onConfigurationChanged(newConfig);
            }
        });
    }

    @Override // X.AbstractC247499nV
    public final int LJFF(int i, Context context) {
        o.LJIIIZ(context, "context");
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            return LJI.intValue();
        }
        return -1;
    }
}
