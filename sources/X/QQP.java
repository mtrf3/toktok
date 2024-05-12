package X;

import Y.ARunnableS15S0100100_11;
import Y.IDBReceiverS6S0100000_6;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.bytedance.common.push.ActivityLifecycleObserver;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QQP implements WeakHandler.IHandler {
    public static volatile QQP LJZI;
    public final boolean LJLIL;
    public final C60016Ngy LJLILLLLZI;
    public final Context LJLJI;
    public final WeakHandler LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public long LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public final IDBReceiverS6S0100000_6 LJLZ;
    public final AtomicBoolean LJZ;

    public final void LIZIZ() {
        boolean LIZJ;
        long j;
        if (!this.LJLJJL) {
            return;
        }
        try {
            this.LJLJJI.removeMessages(0);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < this.LJLLL) {
                this.LJLLL = currentTimeMillis - (this.LJLLLL * 1000);
                C66875QMl.LIZ(this.LJLJI).LIZJ(this.LJLLL);
            }
            C66874QMk c66874QMk = QQO.LIZ().LIZ;
            if (c66874QMk.LIZIZ) {
                LIZJ = !ActivityLifecycleObserver.getIns().isBackGround();
            } else {
                LIZJ = c66874QMk.LIZJ("current_app_foreground", false);
            }
            if (LIZJ && QP8.LIZ().LJJJJJL()) {
                if (QSB.LIZ()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("isApplicationForeground = true now = ");
                    LIZ.append(currentTimeMillis);
                    LIZ.append(" mIsForeground = ");
                    LIZ.append(this.LJLLLLLL);
                    X1D.LIZIZ(LIZ);
                }
                WeakHandler weakHandler = this.LJLJJI;
                weakHandler.sendMessage(weakHandler.obtainMessage(4, Long.valueOf(currentTimeMillis)));
                return;
            }
            if (QSB.LIZ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("isApplicationForeground = false now = ");
                LIZ2.append(currentTimeMillis);
                LIZ2.append(" mIsForeground = ");
                LIZ2.append(this.LJLLLLLL);
                X1D.LIZIZ(LIZ2);
            }
            if (QSB.LIZ()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("mLastLeaveTime = ");
                LIZ3.append(this.LJLLILLLL);
                LIZ3.append(" mLastLaunchTime = ");
                LIZ3.append(this.LJLLI);
                X1D.LIZIZ(LIZ3);
            }
            long j2 = this.LJLLILLLL;
            long j3 = this.LJLLI;
            if (j2 < j3) {
                j = (currentTimeMillis - j3) - 900000;
            } else {
                j = currentTimeMillis - j2;
            }
            if (QSB.LIZ()) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("duration = ");
                LIZ4.append(j / 1000);
                LIZ4.append(" mQueryWaitingDuration = ");
                LIZ4.append(this.LJLJL);
                LIZ4.append(" mNextQueryInterval = ");
                LIZ4.append(this.LJLLLL);
                LIZ4.append(" mLastRequestTime = ");
                LIZ4.append(this.LJLLL);
                X1D.LIZIZ(LIZ4);
            }
            if (j >= this.LJLJL * 1000 && currentTimeMillis - this.LJLLL >= this.LJLLLL * 1000) {
                if (!this.LJZ.get()) {
                    this.LJZ.getAndSet(true);
                    RunnableC39007FSp.LIZIZ(new ARunnableS15S0100100_11(currentTimeMillis, this, 3));
                    return;
                }
                return;
            }
            WeakHandler weakHandler2 = this.LJLJJI;
            weakHandler2.sendMessage(weakHandler2.obtainMessage(4, Long.valueOf(currentTimeMillis)));
        } catch (Throwable unused) {
        }
    }

    public final void LJIIIIZZ() {
        String LJ = C66875QMl.LIZ(this.LJLJI).LIZ.LJ("red_badge_last_valid_response");
        StringBuilder LIZIZ = C25620zW.LIZIZ("tryUseLastValidResponse: lastRes = ", LJ, "  isUseRedBadgeLastValidResponse() = ");
        LIZIZ.append(C66875QMl.LIZ(this.LJLJI).LIZ.LIZJ("red_badge_is_use_last_valid_response", true));
        X1D.LIZIZ(LIZIZ);
        if (C66875QMl.LIZ(this.LJLJI).LIZ.LIZJ("red_badge_is_use_last_valid_response", true) && !TextUtils.isEmpty(LJ)) {
            try {
                int LIZLLL = C66875QMl.LIZ(this.LJLJI).LIZ.LIZLLL("red_badge_show_times", 0);
                if (!DateUtils.isToday(this.LJLLJ) && LIZLLL > 0) {
                    LIZLLL = 0;
                }
                if (LIZLLL >= this.LJLJJLL) {
                    if (QSB.LIZ()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("badge_show_times = ");
                        LIZ.append(LIZLLL);
                        X1D.LIZIZ(LIZ);
                    }
                    QPE.LIZ(this.LJLJI, "event_v1", "red_badge", "outdo_max_show_times", LIZLLL, this.LJLJJLL, null);
                    return;
                }
                JSONObject jSONObject = new JSONObject(LJ);
                if ("success".equals(JSONObjectProtectorUtils.getString(jSONObject, "reason"))) {
                    jSONObject.put("content", jSONObject.optInt("content", 0) + 1);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("tryUseLastValidResponse: res = ");
                    LIZ2.append(jSONObject);
                    X1D.LIZIZ(LIZ2);
                    QPE.LIZIZ(this.LJLJI, "use_last_valid_response", jSONObject);
                    this.LJLLL = System.currentTimeMillis();
                    this.LJLLLL = jSONObject.optInt("next_query_interval", 0) + 600;
                    try {
                        C66875QMl LIZ3 = C66875QMl.LIZ(this.LJLJI);
                        String jSONObject2 = jSONObject.toString();
                        C66873QMj LIZIZ2 = LIZ3.LIZ.LIZIZ();
                        LIZIZ2.LIZIZ.put("red_badge_last_valid_response", jSONObject2);
                        LIZIZ2.LIZ();
                        Intent intent = new Intent("com.ss.android.redbadge.message");
                        intent.putExtra("message_data", jSONObject.toString());
                        intent.setPackage(this.LJLJI.getPackageName());
                        if (Build.VERSION.SDK_INT >= 26 && QM0.LIZ.getApplicationInfo().targetSdkVersion >= 26) {
                            Context context = this.LJLJI;
                            C16880lQ.LLLJL(context, intent, new Q6Q(intent, context), 1);
                        } else {
                            C16880lQ.LLLL(this.LJLJI, intent);
                        }
                    } catch (Throwable unused) {
                    }
                    C66875QMl.LIZ(this.LJLJI).LIZJ(this.LJLLL);
                    C66875QMl LIZ4 = C66875QMl.LIZ(this.LJLJI);
                    int i = this.LJLLLL;
                    C66873QMj LIZIZ3 = LIZ4.LIZ.LIZIZ();
                    LIZIZ3.LIZIZ.put("red_badge_next_query_interval", Integer.valueOf(i));
                    LIZIZ3.LIZ();
                }
                C66875QMl.LIZ(this.LJLJI).LIZJ(this.LJLLL);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public QQP(C60016Ngy c60016Ngy) {
        QP5.LIZ().getClass();
        WeakHandler weakHandler = new WeakHandler(QP5.LJLJI.getLooper(), this);
        this.LJLJJI = weakHandler;
        this.LJLLLLLL = false;
        this.LJLZ = new IDBReceiverS6S0100000_6(this, 1);
        this.LJZ = new AtomicBoolean(false);
        QQW qqw = new QQW(this, weakHandler);
        QQX qqx = new QQX(this, weakHandler);
        QQY qqy = new QQY(this, weakHandler);
        this.LJLILLLLZI = c60016Ngy;
        Context LLLLL = C16880lQ.LLLLL(((QRR) c60016Ngy.LIZ).LIZ);
        this.LJLJI = LLLLL;
        LIZLLL(LLLLL);
        if (LLLLL != null) {
            try {
                LLLLL.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.LIZIZ(LLLLL, "is_desktop_red_badge_show", "boolean"), true, qqw);
                LLLLL.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.LIZIZ(LLLLL, "desktop_red_badge_args", "string"), true, qqx);
                LLLLL.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.LIZIZ(LLLLL, "red_badge_last_time_paras", "string"), true, qqy);
            } catch (Throwable unused) {
            }
        }
        if (this.LJLJJL) {
            C16880lQ.LJJLIIIJILLIZJL(this.LJLZ, this.LJLJI, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            LJ(this.LJLJI);
            this.LJLJJI.sendEmptyMessageDelayed(0, 10000L);
        }
        this.LJLIL = true;
    }

    public static QQP LIZJ(C60016Ngy c60016Ngy) {
        if (LJZI == null) {
            synchronized (QQP.class) {
                if (LJZI == null) {
                    LJZI = new QQP(c60016Ngy);
                }
            }
        }
        return LJZI;
    }

    public static JSONObject LJII(String str) {
        JSONObject jSONObject = new JSONObject();
        if (C38354F3m.LJ(str)) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            try {
                LIZ("launch", jSONObject2);
                LIZ("leave", jSONObject2);
                LIZ("badge", jSONObject2);
                return jSONObject2;
            } catch (Throwable unused) {
                jSONObject = jSONObject2;
                return jSONObject;
            }
        } catch (Throwable unused2) {
        }
    }

    public final void LIZLLL(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.LJLJJL = C66875QMl.LIZ(this.LJLJI).LIZ.LIZJ("is_desktop_red_badge_show", false);
            String LJ = C66875QMl.LIZ(this.LJLJI).LIZ.LJ("desktop_red_badge_args");
            if (C38354F3m.LJ(LJ)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(LJ);
            this.LJLJJLL = jSONObject.optInt("max_show_times", 5);
            this.LJLJL = jSONObject.optInt("query_waiting_duration", 30);
            this.LJLJLJ = jSONObject.optString("strategy");
            if (!this.LJLJJL) {
                this.LJLJJI.removeMessages(0);
                this.LJLJJI.removeMessages(1);
                this.LJLJJI.removeMessages(2);
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJ(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.LJLLL = C66875QMl.LIZ(this.LJLJI).LIZIZ();
            this.LJLLLL = C66875QMl.LIZ(this.LJLJI).LIZ.LIZLLL("red_badge_next_query_interval", 600);
            this.LJLJLLL = C66875QMl.LIZ(this.LJLJI).LIZ.LJ("red_badge_last_time_paras");
            this.LJLL = C66875QMl.LIZ(this.LJLJI).LIZ.LJ("red_badge_last_last_time_paras");
            if (C38354F3m.LJ(this.LJLJLLL)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(this.LJLJLLL);
            this.LJLLI = jSONObject.optLong("launch");
            this.LJLLILLLL = jSONObject.optLong("leave");
            this.LJLLJ = jSONObject.optLong("badge");
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        try {
            int i = message.what;
            if (i == 0) {
                LIZIZ();
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        long longValue = ((Long) message.obj).longValue();
                        long j = this.LJLLLL * 1000;
                        long j2 = this.LJLLL + j;
                        if (longValue <= j2) {
                            j = j2 - longValue;
                        }
                        if (QSB.LIZ()) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("next schedule time = ");
                            LIZ.append(DateFormat.getDateTimeInstance().format(new Date(longValue + j)));
                            X1D.LIZIZ(LIZ);
                        }
                        this.LJLJJI.sendEmptyMessageDelayed(0, j);
                        return;
                    }
                    long longValue2 = ((Long) message.obj).longValue();
                    long j3 = this.LJLLLL * 1000;
                    if (QSB.LIZ()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("next schedule time = ");
                        LIZ2.append(DateFormat.getDateTimeInstance().format(new Date(longValue2 + j3)));
                        X1D.LIZIZ(LIZ2);
                    }
                    this.LJLJJI.sendEmptyMessageDelayed(0, j3);
                    return;
                }
                if (!this.LJLJJL) {
                    return;
                }
                this.LJLLLLLL = false;
                this.LJLJJI.removeMessages(0);
                this.LJLJJI.sendEmptyMessageDelayed(0, this.LJLJL * 1000);
                return;
            }
            if (!this.LJLJJL) {
                return;
            }
            this.LJLLLLLL = true;
            if (this.LJLJJI.hasMessages(0)) {
                return;
            }
            this.LJLJJI.sendEmptyMessageDelayed(0, this.LJLLLL * 1000);
        } catch (Throwable unused) {
        }
    }

    public static void LIZ(String str, JSONObject jSONObject) {
        if (C38354F3m.LJ(str)) {
            return;
        }
        try {
            jSONObject.put(str, jSONObject.optLong(str) / 1000);
        } catch (Throwable unused) {
        }
    }

    public final void LJFF(String str, Bundle bundle) {
        if (C38354F3m.LJ(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_event_v3", 1);
            for (String str2 : bundle.keySet()) {
                jSONObject.put(str2, C16880lQ.LLJJIII(bundle, str2));
            }
        } catch (Throwable unused) {
        }
        QPE.LIZ(this.LJLJI, "event_v3", str, null, 0L, 0L, jSONObject);
    }

    public final void LJI(int i, int i2, String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" red_badge_request_result result: ");
        LIZ.append(str);
        LIZ.append(", ");
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        Bundle LIZ2 = C0H1.LIZ("result", str);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(i);
        LIZ3.append("");
        LIZ2.putString("badge_show_times", X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(i2);
        LIZ4.append("");
        LIZ2.putString("max_badge_show_times", X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(System.currentTimeMillis());
        LIZ5.append("");
        LIZ2.putString("client_utc_time_ms", X1D.LIZIZ(LIZ5));
        LIZ2.putString("exception_str", str2);
        LJFF("red_badge_request_result", LIZ2);
    }
}
