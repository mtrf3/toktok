package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.6r8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173306r8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, String str2, boolean z, long j) {
        int i2;
        String str3;
        String str4;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("TemplateApiMonitor template_url_request_event, isSuccess");
        LIZ2.append(z);
        LIZ2.append(", code:");
        LIZ2.append(i);
        LIZ2.append(", msg:");
        LIZ2.append(str);
        H78.LIZJ(X1D.LIZIZ(LIZ2));
        C145995oB c145995oB = new C145995oB();
        int i3 = 1;
        if (z) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c145995oB.LIZ(i2, "status");
        c145995oB.LIZ(i, "error_code");
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        c145995oB.LJI("error_msg", str3);
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        c145995oB.LJI("log_id", str4);
        c145995oB.LJI("cost_time", String.valueOf(SystemClock.elapsedRealtime() - j));
        FMX.LJIIL("template_url_request_event", c145995oB.LIZ);
        if (z) {
            i3 = 0;
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("error_code", Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        c6bk.LIZ.put("error_msg", str);
        if (str2 == null) {
            str2 = "";
        }
        c6bk.LIZ.put("log_id", str2);
        c6bk.LIZ.put("cost_time", String.valueOf(SystemClock.elapsedRealtime() - j));
        C09900aA.LJIIJJI("template_url_request_event", i3, c6bk.LJ());
    }

    public static void LIZIZ(boolean z, int i, String str, long j, C173166qu mvMobParams) {
        String str2;
        o.LJIIIZ(mvMobParams, "mvMobParams");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("TemplateApiMonitor, isSuccess");
        LIZ2.append(z);
        LIZ2.append(", code:");
        LIZ2.append(i);
        LIZ2.append(", msg:");
        LIZ2.append(str);
        H78.LIZJ(X1D.LIZIZ(LIZ2));
        int i2 = !z ? 1 : 0;
        mvMobParams.LIZ = i2;
        mvMobParams.LIZIZ(j);
        mvMobParams.LIZIZ = i;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        mvMobParams.LIZJ = str2;
        C173156qt.LIZLLL(mvMobParams, C78855Ux9.LJLJL, false);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("error_code", Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        c6bk.LIZ.put("error_msg", str);
        c6bk.LIZ.put("cost_time", String.valueOf(SystemClock.elapsedRealtime() - j));
        C09900aA.LJIIJJI("merge_templist_load", i2, c6bk.LJ());
    }
}
