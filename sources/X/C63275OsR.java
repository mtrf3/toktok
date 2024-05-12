package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: X.OsR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63275OsR implements Handler.Callback {
    public static volatile C63275OsR LJLJJI;
    public static boolean LJLJJL;
    public final C63656Oya LJLILLLLZI = new C63656Oya();
    public final List<C63670Oyo> LJLJI = new CopyOnWriteArrayList();
    public final Handler LJLIL = new Handler(C06M.LIZ("ReportManager-Thread").getLooper(), this);

    public static C63275OsR LIZIZ() {
        if (LJLJJI == null) {
            synchronized (C63275OsR.class) {
                if (LJLJJI == null) {
                    LJLJJI = new C63275OsR();
                }
            }
        }
        return LJLJJI;
    }

    public C63275OsR() {
        LJLJJL = true;
    }

    public static double LIZ() {
        C47922IrO.LIZ();
        JSONObject jSONObject = C63314Ot4.LJIILIIL;
        if (jSONObject != null) {
            return jSONObject.optDouble("dbReportRate");
        }
        if (C63314Ot4.LJIIJJI == null) {
            try {
                C63291Osh.LIZ().getClass();
                C63314Ot4.LJIIJJI = Float.valueOf(C63291Osh.LIZLLL.LIZJ(Float.valueOf(0.02f)).floatValue());
            } catch (Exception e) {
                C63322OtC.LJ("CloudConfig getDBReportRate error", e);
                return 0.019999999552965164d;
            }
        }
        return C63314Ot4.LJIIJJI.floatValue();
    }

    public final void LJFF() {
        Integer valueOf;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReportManager reportBatch:");
        List<C63670Oyo> list = this.LJLJI;
        if (list == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((CopyOnWriteArrayList) list).size());
        }
        LIZ.append(valueOf);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        List<C63670Oyo> list2 = this.LJLJI;
        if (list2 != null && !((CopyOnWriteArrayList) list2).isEmpty()) {
            this.LJLILLLLZI.LJIILIIL(this.LJLJI);
            ((CopyOnWriteArrayList) this.LJLJI).clear();
        }
    }

    public final void LJIIIIZZ() {
        if (C63308Osy.LJI().LIZLLL().LJJJIL) {
            return;
        }
        LIZJ(EnumC63665Oyj.COUNTER, "db_op_start", 1L, null, LIZ());
    }

    public static void LJIIIZ(String str) {
        if (C63308Osy.LJI().LIZLLL().LJJJIL) {
            C63272OsO.LJFF(-1, str, null, true);
        }
    }

    public final void LJ(List list) {
        if (list == null || list.isEmpty() || C63308Osy.LJI().LIZLLL().LJJIJIIJI <= 0) {
            return;
        }
        double d = 1.0f;
        if (d == 1.0d || Math.random() < d) {
            ((CopyOnWriteArrayList) this.LJLJI).addAll(list);
            if (((CopyOnWriteArrayList) this.LJLJI).size() >= 100) {
                LJFF();
                this.LJLIL.removeMessages(0);
            } else {
                if (this.LJLIL.hasMessages(0)) {
                    return;
                }
                this.LJLIL.sendEmptyMessageDelayed(0, Math.max(C63308Osy.LJI().LIZLLL().LJJIJIIJI, 1000L));
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message != null && message.what == 0) {
            LJFF();
            return true;
        }
        return true;
    }

    public final void LJI(long j, String str) {
        boolean z;
        long j2 = 0;
        if (j > 0) {
            j2 = System.currentTimeMillis() - j;
        }
        HashMap hashMap = null;
        if (j2 > 1000) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" cost ");
            LIZ.append(j2);
            LIZ.append("ms");
            C63322OtC.LJI("ReportManager ", X1D.LIZIZ(LIZ), null);
        }
        if (C63308Osy.LJI().LIZLLL().LJJJIL) {
            if (C63337OtR.LIZJ(0.005f, "im_sdk_db_op_cost")) {
                C63323OtD LIZJ = C63144OqK.LIZJ("im_sdk_db_op_cost");
                if (str == null) {
                    str = "unknown";
                }
                LIZJ.LIZ(str, "tag");
                LIZJ.LIZ(Long.valueOf(j2), "cost_time");
                if (C16880lQ.LLJJJJ() == Looper.myLooper() && C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
                    z = true;
                } else {
                    z = false;
                }
                LIZJ.LIZ(Boolean.valueOf(z), "is_main_thread");
                LIZJ.LJFF();
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap = C03660Ck.LIZJ("db_op_method", str);
        }
        LIZJ(EnumC63665Oyj.TIMER, "db_op_cost", j2, hashMap, LIZ());
    }

    public final void LIZLLL(EnumC63665Oyj enumC63665Oyj, String str, java.util.Map map) {
        LIZJ(enumC63665Oyj, str, 1L, map, 1.0d);
    }

    public final void LJII(int i, String str, Throwable th) {
        if (C63308Osy.LJI().LIZLLL().LJJJIL) {
            C63272OsO.LJFF(i, str, th, false);
        } else {
            LIZJ(EnumC63665Oyj.COUNTER, "db_op_fail", 1L, null, LIZ());
        }
    }

    public final void LIZJ(EnumC63665Oyj enumC63665Oyj, String str, long j, java.util.Map map, double d) {
        if (C63308Osy.LJI().LIZLLL().LJJIJIIJI <= 0) {
            return;
        }
        if (d == 1.0d || Math.random() < d) {
            C63670Oyo c63670Oyo = new C63670Oyo(enumC63665Oyj, str, j, map);
            if (!C63308Osy.LJI().LIZIZ().LJJ()) {
                LJ(Collections.singletonList(c63670Oyo));
            }
        }
    }
}
