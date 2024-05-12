package com.ss.android.ugc.aweme.account.login;

import X.C113554cx;
import X.C35936E8m;
import X.C58096Mr6;
import X.C63026OoQ;
import X.C68972R5c;
import X.FMX;
import X.OSZ;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.lobby.internal.IGoogleOnetapLogger;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class GoogleOneTapLogger implements IGoogleOnetapLogger {
    public static IGoogleOnetapLogger LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IGoogleOnetapLogger.class, false);
        if (LIZ != null) {
            return (IGoogleOnetapLogger) LIZ;
        }
        if (C58096Mr6.LJLIIIL == null) {
            synchronized (IGoogleOnetapLogger.class) {
                if (C58096Mr6.LJLIIIL == null) {
                    C58096Mr6.LJLIIIL = new GoogleOneTapLogger();
                }
            }
        }
        return C58096Mr6.LJLIIIL;
    }

    @Override // com.bytedance.lobby.internal.IGoogleOnetapLogger
    public final void LIZIZ(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        bundle.putString("login_panel_type", "google_onetap");
        C68972R5c.LJI(bundle, C113554cx.LJJLIIIIJ(new OSZ("enter_type", "google_onetap"), new OSZ("enter_from", bundle.getString("enter_from", "")), new OSZ("enter_method", bundle.getString("enter_method", ""))), null);
    }

    @Override // com.bytedance.lobby.internal.IGoogleOnetapLogger
    public final void LIZJ(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        bundle.putString("login_panel_type", bundle.getString("login_panel_type", ""));
        Boolean bool = Boolean.TRUE;
        String string = bundle.getString("enter_from", "");
        o.LJIIIIZZ(string, "bundle.getString(Mob.Key.ENTER_FROM, \"\")");
        String string2 = bundle.getString("enter_method", "");
        o.LJIIIIZZ(string2, "bundle.getString(Mob.Key.ENTER_METHOD, \"\")");
        C68972R5c.LJIIIIZZ(bool, "google_onetap", new C63026OoQ(string, string2, "click_sign_up", "signup", "", bundle), false, null, 24);
    }

    @Override // com.bytedance.lobby.internal.IGoogleOnetapLogger
    public final void LIZ(Long l, int i, int i2) {
        long longValue = l.longValue();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - longValue, "duration");
        c35936E8m.LIZ(i2, "is_success");
        c35936E8m.LIZ(i, "is_signin");
        FMX.LJIIL("google_onetap_login_req", c35936E8m.LIZ);
    }
}
