package X;

import Y.ACallableS55S0300000_6;
import Y.AfS18S0001000_6;
import Y.AfS31S0201000_5;
import Y.IDuS77S0200000_6;
import android.content.SharedPreferences;
import android.os.Looper;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import defpackage.e1;

/* renamed from: X.EcA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC36786EcA implements InterfaceC38821FLl {
    public static volatile EU5 LJLILLLLZI;
    public C100023wE LJLIL;

    public abstract void LIZ(IESSettingsProxy iESSettingsProxy);

    public AbstractC36786EcA() {
        new Gson();
    }

    public final void LIZIZ(IESSettingsProxy iESSettingsProxy) {
        SharedPreferences.Editor edit = SharePrefCache.inst().getSharePref().edit();
        if (e1.LIZ(31744, "im_optimize_imconvert", false, false)) {
            AbstractC73547Stj.LJI(new ACallableS55S0300000_6(this, edit, iESSettingsProxy, 0)).LJIILIIL(T16.LIZ()).LJIIJJI();
        } else {
            this.LJLIL = SettingsRequestServiceImpl.LJIILLIIL().LJI(edit, iESSettingsProxy);
        }
        AVExternalServiceImpl.LIZ().configService().updateServerSettings(iESSettingsProxy);
    }

    @Override // X.InterfaceC38821FLl
    public final void change(IESSettingsProxy iESSettingsProxy) {
        boolean z;
        if (((Boolean) DP2.LIZ.getValue()).booleanValue()) {
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                z = true;
            } else {
                z = false;
            }
            AbstractC73672Svk LJJL = AbstractC73672Svk.LJIIJ(new IDuS77S0200000_6(iESSettingsProxy, this, 0)).LJJL(new C73950T0o(C38995FSd.LJFF()));
            if (z) {
                LJJL = LJJL.LJJJ(C73969T1h.LIZIZ());
            }
            LJJL.LJJJLIIL(new AfS31S0201000_5(1, this, iESSettingsProxy, 0), new AfS18S0001000_6(1, 0));
            return;
        }
        LIZIZ(iESSettingsProxy);
        C31094CIg LIZ = C31094CIg.LIZ();
        LIZ.getClass();
        synchronized (C31094CIg.class) {
            LIZ.LIZ = true;
        }
        LIZ(iESSettingsProxy);
    }
}
