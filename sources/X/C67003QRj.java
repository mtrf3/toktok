package X;

import Y.ARunnableS47S0100000_11;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.QRj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67003QRj {
    public static volatile C67003QRj LJIIZILJ;
    public String LIZ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public SharedPreferences LJIIJJI;
    public int LJIILLIIL;
    public int LIZIZ = -1;
    public boolean LIZJ = true;
    public boolean LIZLLL = true;
    public String LJ = "";
    public final C67004QRk LJIIJ = new C67004QRk();
    public int LJIIL = 1;
    public int LJIILIIL = 1;
    public int LJIILJJIL = -1;
    public boolean LJIILL = true;

    public final synchronized boolean LIZIZ() {
        boolean z;
        try {
            if (this.LIZIZ == -1) {
                this.LIZIZ = 1;
            }
            if (this.LIZIZ > 0) {
                z = true;
            } else {
                z = false;
            }
        } catch (Exception unused) {
            return true;
        }
        return Boolean.valueOf(z).booleanValue();
    }

    static {
        new SimpleDateFormat("yyyy-MM-dd");
    }

    public static C67003QRj LJFF() {
        if (LJIIZILJ == null) {
            synchronized (C67003QRj.class) {
                if (LJIIZILJ == null) {
                    LJIIZILJ = new C67003QRj();
                }
            }
        }
        return LJIIZILJ;
    }

    public final SharedPreferences LIZLLL() {
        if (!this.LJI) {
            synchronized (this) {
                if (!this.LJI) {
                    this.LJIIJJI = F9J.LIZIZ(C1791471i.LIZ, 0, "app_setting");
                    this.LJI = true;
                }
            }
        }
        return this.LJIIJJI;
    }

    public final String LJ() {
        if (this.LIZ == null) {
            C67016QRw c67016QRw = C67016QRw.LIZIZ;
            if (c67016QRw != null) {
                this.LIZ = c67016QRw.LIZ.getDefaultUninstallQuestionUrl();
            } else {
                throw new IllegalStateException("Please call holdService to initialize");
            }
        }
        return this.LIZ;
    }

    public final boolean LJI() {
        if (!FCO.LJFF && !this.LJFF) {
            synchronized (this) {
                if (!this.LJFF) {
                    this.LIZLLL = C38776FJs.LJIIL().LIZ(EF7.LIZIZ(), "is_allow_oppo_push", true);
                    this.LJFF = true;
                }
            }
        }
        return this.LIZLLL;
    }

    public C67003QRj() {
        this.LJIILLIIL = !(this.LIZJ ^ true) ? 0 : 1;
    }

    public final void LJIIIIZZ() {
        if (LIZLLL() == null) {
            return;
        }
        SharedPreferences.Editor edit = LIZLLL().edit();
        edit.putInt("keep_notify_count", this.LJIIIIZZ);
        edit.putInt("max_notify_count", this.LJII);
        edit.putInt("notify_fresh_period", this.LJIIIZ);
        edit.putString("notify_message_ids", this.LJIIJ.LIZJ());
        WX6.LIZ(edit);
    }

    public final synchronized boolean LIZ(Context context) {
        boolean z;
        int i;
        try {
            z = false;
            if (this.LJIILJJIL == -1) {
                SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "push_setting");
                if (this.LIZJ) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.LJIILJJIL = LIZIZ.getInt("allow_settings_notify_enable", i);
            }
            if (this.LJIILJJIL > 0) {
                z = true;
            }
        } catch (Exception unused) {
            return true;
        }
        return Boolean.valueOf(z).booleanValue();
    }

    public final boolean LIZJ(Context context) {
        if (!LIZ(context) || this.LJIILLIIL > 0) {
            return true;
        }
        return false;
    }

    public final void LJII(Context context) {
        if (!C38354F3m.LJ(AppLog.getClientId()) && !C38354F3m.LJ(FVR.LIZJ())) {
            QRG LIZ = C67006QRm.LIZ(context);
            boolean LIZJ = LIZJ(context);
            LIZ.getClass();
            QRG.LIZLLL().LJIIIIZZ(LIZJ);
            QRG LIZ2 = C67006QRm.LIZ(context);
            String LJ = LJ();
            LIZ2.getClass();
            ((AliveOnlineSettings) PT6.LIZ(QM0.LIZ, AliveOnlineSettings.class)).LJIIJ(LJ);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("port", AppLog.getHttpMonitorPort());
                AppLogNewUtils.onEventV3("http_monitor_port_ug", jSONObject);
            } catch (Throwable unused) {
            }
            HashMap hashMap = new HashMap();
            AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs(hashMap);
            if (hashMap.size() != 0) {
                IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(6, hashMap, 17);
                if (KL2.LJIILIIL()) {
                    RunnableC39007FSp.LIZIZ(iDRunnableS6S0101000);
                } else {
                    iDRunnableS6S0101000.run();
                }
            }
            QP6.LJ(context);
            QQQ LIZJ2 = QQQ.LIZJ(context);
            String sessionKey = ((RBX) HG3.LJIILL()).getSessionKey();
            LIZJ2.getClass();
            try {
                C66873QMj LIZIZ = C66875QMl.LIZ(LIZJ2.LJLIL).LIZ.LIZIZ();
                LIZIZ.LIZIZ.put("session_key", sessionKey);
                LIZIZ.LIZ();
                RunnableC39007FSp.LIZIZ(new ARunnableS47S0100000_11(LIZJ2, 10));
            } catch (Throwable unused2) {
            }
        }
    }

    public final synchronized void LJIIIZ(Context context, boolean z) {
        try {
            if (this.LIZIZ != z) {
                this.LIZIZ = z ? 1 : 0;
                boolean z2 = false;
                SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, "push_setting").edit();
                edit.putInt("confirm_push", this.LIZIZ);
                WX6.LIZ(edit);
                QSD LIZ = QSD.LIZ();
                if (this.LIZIZ > 0) {
                    z2 = true;
                }
                LIZ.getClass();
                QRG.LIZIZ().getClass();
                QRG.LIZJ().LJFF(z2);
            }
        } catch (Exception unused) {
        }
    }
}
