package X;

import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.format.DateUtils;
import com.bytedance.common.push.ActivityLifecycleObserver;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.newmedia.redbadge.RedBadgePushProcessService;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QQQ implements WeakHandler.IHandler {
    public static volatile QQQ LJLLJ;
    public final Context LJLIL;
    public final WeakHandler LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public QQV LJLJJLL;
    public QQV LJLJL;
    public volatile boolean LJLJLJ;
    public boolean LJLJLLL;
    public final ARunnableS47S0100000_11 LJLL = new ARunnableS47S0100000_11(this, 11);
    public final QQT LJLLI;
    public final QQU LJLLILLLL;

    public final void LIZLLL() {
        String jSONObject;
        try {
            C66875QMl LIZ = C66875QMl.LIZ(this.LJLIL);
            int i = this.LJLJJI;
            C66873QMj LIZIZ = LIZ.LIZ.LIZIZ();
            LIZIZ.LIZIZ.put("red_badge_launch_times", Integer.valueOf(i));
            LIZIZ.LIZ();
            C66875QMl LIZ2 = C66875QMl.LIZ(this.LJLIL);
            int i2 = this.LJLJJL;
            C66873QMj LIZIZ2 = LIZ2.LIZ.LIZIZ();
            LIZIZ2.LIZIZ.put("red_badge_show_times", Integer.valueOf(i2));
            LIZIZ2.LIZ();
            C66875QMl LIZ3 = C66875QMl.LIZ(this.LJLIL);
            QQV qqv = this.LJLJJLL;
            String str = "";
            if (qqv == null) {
                jSONObject = "";
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("launch", qqv.LIZ);
                    jSONObject2.put("leave", qqv.LIZIZ);
                    jSONObject2.put("badge", qqv.LIZJ);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject2.toString();
            }
            C66873QMj LIZIZ3 = LIZ3.LIZ.LIZIZ();
            LIZIZ3.LIZIZ.put("red_badge_last_time_paras", jSONObject);
            LIZIZ3.LIZ();
            C66875QMl LIZ4 = C66875QMl.LIZ(this.LJLIL);
            QQV qqv2 = this.LJLJL;
            if (qqv2 != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("launch", qqv2.LIZ);
                    jSONObject3.put("leave", qqv2.LIZIZ);
                    jSONObject3.put("badge", qqv2.LIZJ);
                } catch (Throwable unused2) {
                }
                str = jSONObject3.toString();
            }
            C66873QMj LIZIZ4 = LIZ4.LIZ.LIZIZ();
            LIZIZ4.LIZIZ.put("red_badge_last_last_time_paras", str);
            LIZIZ4.LIZ();
        } catch (Throwable unused3) {
        }
    }

    public final void onPause() {
        if (this.LJLIL == null) {
            return;
        }
        if (this.LJLJLLL) {
            this.LJLILLLLZI.postDelayed(this.LJLL, 30000L);
            this.LJLILLLLZI.sendEmptyMessage(2);
        }
        if (QSB.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPause AppAlive = ");
            LIZ.append(this.LJLJLLL);
            X1D.LIZIZ(LIZ);
        }
    }

    public QQQ(Context context) {
        boolean z;
        this.LJLLI = new QQT(this, this.LJLILLLLZI);
        this.LJLLILLLL = new QQU(this, this.LJLILLLLZI);
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LJLIL = LLLLL;
        QP5.LIZ().getClass();
        this.LJLILLLLZI = new WeakHandler(QP5.LJLJI.getLooper(), this);
        try {
            this.LJLJJI = C66875QMl.LIZ(LLLLL).LIZ.LIZLLL("red_badge_launch_times", 0);
            this.LJLJJL = C66875QMl.LIZ(LLLLL).LIZ.LIZLLL("red_badge_show_times", 0);
            String LJ = C66875QMl.LIZ(LLLLL).LIZ.LJ("red_badge_last_time_paras");
            if (!C38354F3m.LJ(LJ)) {
                this.LJLJJLL = QQV.LIZ(LJ);
            }
            String LJ2 = C66875QMl.LIZ(LLLLL).LIZ.LJ("red_badge_last_last_time_paras");
            if (!C38354F3m.LJ(LJ2)) {
                this.LJLJL = QQV.LIZ(LJ2);
            }
            QQV qqv = this.LJLJJLL;
            if (qqv != null) {
                if (!DateUtils.isToday(qqv.LIZ)) {
                    this.LJLJJI = 0;
                    z = true;
                } else {
                    z = false;
                }
                if (!DateUtils.isToday(this.LJLJJLL.LIZJ)) {
                    this.LJLJJL = 0;
                } else if (z) {
                }
                LIZLLL();
            }
        } catch (Throwable unused) {
        }
        try {
            context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.LIZIZ(context, "is_desktop_red_badge_show", "boolean"), true, this.LJLLI);
            context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.LIZIZ(context, "desktop_red_badge_args", "string"), true, this.LJLLILLLL);
        } catch (Throwable unused2) {
        }
        this.LJLJI = C66875QMl.LIZ(this.LJLIL).LIZ.LIZJ("is_desktop_red_badge_show", false);
    }

    public static QQQ LIZJ(Context context) {
        if (LJLLJ == null) {
            synchronized (QQQ.class) {
                if (LJLLJ == null) {
                    LJLLJ = new QQQ(context);
                }
            }
        }
        return LJLLJ;
    }

    public final void LIZ(String str) {
        long j;
        boolean LIZJ;
        int nextInt;
        int i;
        if (str == null || this.LJLIL == null || !this.LJLJI) {
            return;
        }
        try {
            if (QSB.LIZ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("handleMessage = ");
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("show") <= 0) {
                return;
            }
            String optString = jSONObject.optString("content_type");
            String optString2 = jSONObject.optString("content");
            try {
                j = new JSONObject(str).optLong("rule_id");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                j = 0;
            }
            if (C38354F3m.LJ(optString) || C38354F3m.LJ(optString2)) {
                return;
            }
            C66874QMk c66874QMk = QQO.LIZ().LIZ;
            if (c66874QMk.LIZIZ) {
                LIZJ = !ActivityLifecycleObserver.getIns().isBackGround();
            } else {
                LIZJ = c66874QMk.LIZJ("current_app_foreground", false);
            }
            if (LIZJ) {
                return;
            }
            if ("desktop_red_badge".equals(optString)) {
                try {
                    nextInt = CastIntegerProtector.parseInt(optString2);
                } catch (Throwable unused) {
                    nextInt = new Random().nextInt(5) + 1;
                }
                if (nextInt > 0) {
                    if (nextInt > 15) {
                        nextInt = 15;
                    }
                    FZL.LIZJ().LIZ(nextInt, this.LJLIL);
                    this.LJLJLJ = true;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("content", optString2);
                    long j2 = nextInt;
                    QQS LIZ2 = QP8.LIZ();
                    if (LIZ2 != null) {
                        LIZ2.onEvent(this.LJLIL, "event_v1", "red_badge", "desktop_red_badge", j2, 0L, jSONObject2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("badge_number", nextInt);
                    if (this.LJLJI) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    bundle.putInt("red_badge_is_open", i);
                    bundle.putString("show_type", "request");
                    bundle.putLong("rule_id", j);
                    QQS LIZ3 = QP8.LIZ();
                    if (LIZ3 != null) {
                        LIZ3.LJIIIIZZ(bundle);
                    }
                } else {
                    FZL.LIZJ().LIZ(0, this.LJLIL);
                    this.LJLJLJ = false;
                }
                LIZIZ(2);
                return;
            }
            if (!"notification".equals(optString)) {
                return;
            }
            QP8.LIZ().LJII();
            Intent intent = new Intent("com.ss.android.message");
            QP8.LIZ().LJJLIIIJLLLLLLLZ();
            intent.putExtra("message_data", optString2);
            intent.setPackage(this.LJLIL.getPackageName());
            C16880lQ.LLLL(this.LJLIL, intent);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("content", optString2);
            QQS LIZ4 = QP8.LIZ();
            if (LIZ4 == null) {
                return;
            }
            LIZ4.onEvent(this.LJLIL, "event_v1", "red_badge", "notification", 0L, 0L, jSONObject3);
        } catch (Throwable unused2) {
        }
    }

    public final void LIZIZ(int i) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.LJLJJLL == null) {
                this.LJLJJLL = new QQV(0);
            }
            if (this.LJLJL == null) {
                this.LJLJL = new QQV(0);
            }
            if (!DateUtils.isToday(this.LJLJJLL.LIZ)) {
                this.LJLJJI = 0;
            }
            if (!DateUtils.isToday(this.LJLJJLL.LIZJ)) {
                this.LJLJJL = 0;
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        QQV qqv = this.LJLJL;
                        QQV qqv2 = this.LJLJJLL;
                        qqv.LIZJ = qqv2.LIZJ;
                        qqv2.LIZJ = currentTimeMillis;
                        this.LJLJJL++;
                    }
                } else {
                    this.LJLJJLL.LIZIZ = currentTimeMillis;
                }
            } else {
                QQV qqv3 = this.LJLJL;
                QQV qqv4 = this.LJLJJLL;
                qqv3.LIZ = qqv4.LIZ;
                qqv3.LIZIZ = qqv4.LIZIZ;
                qqv4.LIZ = currentTimeMillis;
                qqv4.LIZIZ = currentTimeMillis + 900000;
                this.LJLJJI++;
            }
            LIZLLL();
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
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        FZL.LIZJ().LIZ(0, this.LJLIL);
                        this.LJLJLJ = false;
                        return;
                    }
                    LIZIZ(1);
                    return;
                }
                LIZIZ(1);
                if (QSB.LIZ()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("isAllowRedBadgeShow = ");
                    LIZ.append(this.LJLJI);
                    X1D.LIZIZ(LIZ);
                }
                if (!this.LJLJI) {
                    return;
                }
                Intent intent = new Intent(this.LJLIL, (Class<?>) RedBadgePushProcessService.class);
                intent.putExtra("app_exit", true);
                C16880lQ.LLLL(this.LJLIL, intent);
                return;
            }
            LIZIZ(0);
            FZL.LIZJ().LIZ(0, this.LJLIL);
            this.LJLJLJ = false;
            if (QSB.LIZ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("isAllowRedBadgeShow = ");
                LIZ2.append(this.LJLJI);
                X1D.LIZIZ(LIZ2);
            }
            if (!this.LJLJI) {
                return;
            }
            Intent intent2 = new Intent(this.LJLIL, (Class<?>) RedBadgePushProcessService.class);
            intent2.putExtra("app_entrance", true);
            C16880lQ.LLLL(this.LJLIL, intent2);
        } catch (Throwable unused) {
        }
    }
}
