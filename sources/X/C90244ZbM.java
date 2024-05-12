package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.google.android.gms.cast.CastDevice;

/* renamed from: X.ZbM, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90244ZbM {
    public static final C90469Zez LJI = new C90469Zez("ApplicationAnalytics");
    public final C90307ZcN LIZ;
    public final C90260Zbc LIZIZ;
    public final SharedPreferences LJ;
    public C90252ZbU LJFF;
    public final Handler LIZLLL = new HandlerC90301ZcH(C16880lQ.LLJJJJ());
    public final Runnable LIZJ = new Runnable() { // from class: X.ZbJ
        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                C90244ZbM c90244ZbM = C90244ZbM.this;
                C90252ZbU c90252ZbU = c90244ZbM.LJFF;
                if (c90252ZbU != null) {
                    c90244ZbM.LIZ.LIZ(c90244ZbM.LIZIZ.LIZIZ(c90252ZbU).LIZJ(), 223);
                }
                c90244ZbM.LJFF();
            } finally {
                if (LIZ) {
                }
            }
        }
    };

    public static String LIZJ() {
        QH7.LJ("Must be called from the main thread.");
        ZYJ zyj = ZYJ.LJIIIZ;
        QH7.LJIIIIZZ(zyj);
        QH7.LJ("Must be called from the main thread.");
        return zyj.LJ.zza;
    }

    public final void LJFF() {
        Handler handler = this.LIZLLL;
        QH7.LJIIIIZZ(handler);
        Runnable runnable = this.LIZJ;
        QH7.LJIIIIZZ(runnable);
        handler.postDelayed(runnable, LivePreviewNetworkSpeedThresholdSetting.DEFAULT);
    }

    public final boolean LJI() {
        String str;
        if (this.LJFF == null) {
            LJI.getClass();
            return false;
        }
        String LIZJ = LIZJ();
        if (LIZJ == null || (str = this.LJFF.LIZ) == null || !TextUtils.equals(str, LIZJ)) {
            LJI.getClass();
            return false;
        }
        QH7.LJIIIIZZ(this.LJFF);
        return true;
    }

    public static void LIZIZ(C90244ZbM c90244ZbM) {
        C90252ZbU c90252ZbU = c90244ZbM.LJFF;
        SharedPreferences sharedPreferences = c90244ZbM.LJ;
        c90252ZbU.getClass();
        if (sharedPreferences == null) {
            return;
        }
        C90252ZbU.LJIIIIZZ.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", c90252ZbU.LIZ);
        edit.putString("receiver_metrics_id", c90252ZbU.LIZIZ);
        edit.putLong("analytics_session_id", c90252ZbU.LIZJ);
        edit.putInt("event_sequence_number", c90252ZbU.LIZLLL);
        edit.putString("receiver_session_id", c90252ZbU.LJ);
        edit.putInt("device_capabilities", c90252ZbU.LJFF);
        edit.putString("device_model_name", c90252ZbU.LJI);
        edit.putInt("analytics_session_start_type", c90252ZbU.LJII);
        edit.apply();
    }

    public final void LIZLLL(C90613ZhJ c90613ZhJ) {
        C90252ZbU c90252ZbU;
        if (LJI()) {
            if (c90613ZhJ != null) {
                QH7.LJ("Must be called from the main thread.");
                CastDevice castDevice = c90613ZhJ.LJIIIZ;
                if (castDevice != null && !TextUtils.equals(this.LJFF.LIZIZ, castDevice.zzl) && (c90252ZbU = this.LJFF) != null) {
                    c90252ZbU.LIZIZ = castDevice.zzl;
                    c90252ZbU.LJFF = castDevice.zzi;
                    c90252ZbU.LJI = castDevice.zze;
                }
            }
            QH7.LJIIIIZZ(this.LJFF);
            return;
        }
        LJI.getClass();
        LJ(c90613ZhJ);
    }

    public final void LJ(C90613ZhJ c90613ZhJ) {
        C90252ZbU c90252ZbU;
        int LJIIIIZZ;
        LJI.getClass();
        C90252ZbU c90252ZbU2 = new C90252ZbU();
        C90252ZbU.LJIIIZ++;
        this.LJFF = c90252ZbU2;
        c90252ZbU2.LIZ = LIZJ();
        if (c90613ZhJ != null) {
            QH7.LJ("Must be called from the main thread.");
            CastDevice castDevice = c90613ZhJ.LJIIIZ;
            if (castDevice != null && (c90252ZbU = this.LJFF) != null) {
                c90252ZbU.LIZIZ = castDevice.zzl;
                c90252ZbU.LJFF = castDevice.zzi;
                c90252ZbU.LJI = castDevice.zze;
            }
        }
        QH7.LJIIIIZZ(this.LJFF);
        C90252ZbU c90252ZbU3 = this.LJFF;
        if (c90613ZhJ != null) {
            QH7.LJ("Must be called from the main thread.");
            InterfaceC90109ZYb interfaceC90109ZYb = c90613ZhJ.LIZ;
            if (interfaceC90109ZYb != null) {
                try {
                } catch (RemoteException unused) {
                    C90469Zez c90469Zez = ZYQ.LIZIZ;
                    C16880lQ.LJLLJ(InterfaceC90109ZYb.class);
                    c90469Zez.getClass();
                }
                if (interfaceC90109ZYb.LJ() >= 211100000) {
                    LJIIIIZZ = c90613ZhJ.LIZ.LJIIIIZZ();
                    c90252ZbU3.LJII = LJIIIIZZ;
                    QH7.LJIIIIZZ(this.LJFF);
                }
            }
        }
        LJIIIIZZ = 0;
        c90252ZbU3.LJII = LJIIIIZZ;
        QH7.LJIIIIZZ(this.LJFF);
    }

    public final boolean LJII(String str) {
        String str2;
        if (!LJI()) {
            return false;
        }
        QH7.LJIIIIZZ(this.LJFF);
        if (str == null || (str2 = this.LJFF.LJ) == null || !TextUtils.equals(str2, str)) {
            LJI.getClass();
            return false;
        }
        return true;
    }

    public static void LIZ(C90244ZbM c90244ZbM, C90613ZhJ c90613ZhJ, int i) {
        c90244ZbM.LIZLLL(c90613ZhJ);
        c90244ZbM.LIZ.LIZ(c90244ZbM.LIZIZ.LIZ(c90244ZbM.LJFF, i), 228);
        c90244ZbM.LIZLLL.removeCallbacks(c90244ZbM.LIZJ);
        c90244ZbM.LJFF = null;
    }

    public C90244ZbM(SharedPreferences sharedPreferences, C90307ZcN c90307ZcN, Bundle bundle, String str) {
        this.LJ = sharedPreferences;
        this.LIZ = c90307ZcN;
        this.LIZIZ = new C90260Zbc(bundle, str);
    }
}
