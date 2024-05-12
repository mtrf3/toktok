package com.ss.android.ugc.aweme.setting.page.datasave;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C47261Igj;
import X.C48683J8t;
import X.C48684J8u;
import X.C54153LNd;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C82544WaS;
import X.EnumC48682J8s;
import X.HG3;
import X.X1D;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS3S0300100_8;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SpeedModeSettingImpl implements ISpeedModeSetting {
    public final String LIZ = "MultiNetworkDialog";
    public final long LIZIZ = 600000;
    public final long LIZJ = 3000;
    public final int LIZLLL = 10001;
    public final List<String> LJ = C47261Igj.LJJIJIIJI("LiveBgBroadcastActivity", "LivePlayActivity", "StartLiveActivity", "LiveBroadcastSigningActivity", "GiftAdActivity", "LiveSettingActivity", "LiveContainerActivity", "LiveBroadcastActivity");
    public final String LJFF = "to_cellular_toast_show";
    public final String LJI = "network_status";
    public final String LJII = "to_cellular_toast_accept";
    public final String LJIIIIZZ = "to_cellular_toast_refuse";
    public final String LJIIIZ = "duration";
    public final String LJIIJ = "IMultiChannelStorage";
    public final String LJIIJJI = "KEY_ENABLE_MULTI_NETWORK_SWITCH";
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 335));
    public final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 334));

    public static ISpeedModeSetting LJFF() {
        Object LIZ = C58096Mr6.LIZ(ISpeedModeSetting.class, false);
        if (LIZ != null) {
            return (ISpeedModeSetting) LIZ;
        }
        if (C58096Mr6.u6 == null) {
            synchronized (ISpeedModeSetting.class) {
                if (C58096Mr6.u6 == null) {
                    C58096Mr6.u6 = new SpeedModeSettingImpl();
                }
            }
        }
        return C58096Mr6.u6;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting
    public final void LIZLLL() {
        ((Handler) this.LJIIL.getValue()).removeMessages(this.LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting
    public final EnumC48682J8s LJ() {
        int i = ((SharedPreferences) this.LJIILIIL.getValue()).getInt(LJI(), 0);
        if (i != -1) {
            if (i != 1) {
                return EnumC48682J8s.NONE;
            }
            return EnumC48682J8s.ALLOW;
        }
        return EnumC48682J8s.NOT_ALLOW;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting
    public final void LIZ() {
        Boolean bool;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || topActivity.isFinishing()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("toast failed,activity finish ");
            if (topActivity != null) {
                bool = Boolean.valueOf(topActivity.isFinishing());
            } else {
                bool = null;
            }
            LIZ.append(bool);
            X1D.LIZIZ(LIZ);
            return;
        }
        if (this.LJ.contains(C16880lQ.LJLLJ(topActivity.getClass()))) {
            return;
        }
        ((Handler) this.LJIIL.getValue()).post(new ARunnableS27S0200000_8(this, topActivity, 41));
        ((Handler) this.LJIIL.getValue()).sendEmptyMessageDelayed(this.LIZLLL, this.LIZIZ);
    }

    public final String LJI() {
        String serverDeviceId = AppLog.getServerDeviceId();
        String curUserId = HG3.LJIILL().getCurUserId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJIIJJI);
        LIZ.append('_');
        LIZ.append(serverDeviceId);
        LIZ.append('_');
        LIZ.append(curUserId);
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting
    public final void LIZIZ(EnumC48682J8s status) {
        o.LJIIIZ(status, "status");
        int i = C48683J8t.LIZ[status.ordinal()];
        if (i != 1) {
            if (i != 2) {
                ((SharedPreferences) this.LJIILIIL.getValue()).edit().putInt(LJI(), 0).apply();
                return;
            } else {
                ((SharedPreferences) this.LJIILIIL.getValue()).edit().putInt(LJI(), -1).apply();
                return;
            }
        }
        ((SharedPreferences) this.LJIILIIL.getValue()).edit().putInt(LJI(), 1).apply();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting
    public final void LIZJ(C48684J8u c48684J8u) {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || topActivity.isFinishing() || !(topActivity instanceof ActivityC45651qj) || !C54153LNd.LIZ((ActivityC45651qj) topActivity)) {
            return;
        }
        C82544WaS.LIZJ(new ARunnableS3S0300100_8(topActivity, this, c48684J8u, 1));
    }
}
