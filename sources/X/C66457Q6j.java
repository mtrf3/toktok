package X;

import android.os.AsyncTask;
import android.view.View;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q6j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66457Q6j {
    public static void LIZ() {
        C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
        o.LJFF(c66465Q6r, "SafeModeConfig.getInstance()");
        if (c66465Q6r.LIZIZ != null) {
            PTS.LIZJ(SafeModeActivity.LJLIL, SafeModeActivity.LJLILLLLZI, "LaunchProtectClickCancel");
        }
        C66460Q6m.LIZIZ().getClass();
        C66459Q6l c66459Q6l = new C66459Q6l();
        c66459Q6l.LIZIZ = 2;
        c66459Q6l.LIZ = System.currentTimeMillis();
        C66458Q6k.LIZJ(c66459Q6l);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (C66458Q6k.class) {
            C66458Q6k.LIZ.LJI(currentTimeMillis, "boot_protected_time_stamp");
        }
        C66458Q6k.LIZIZ(false);
        SafeModeActivity safeModeActivity = SafeModeActivity.LJLJJL;
        if (safeModeActivity != null) {
            C16880lQ.LLLLJ(safeModeActivity);
        }
        SafeModeReporter.CrashInfo LIZIZ = SafeModeReporter.CrashInfo.LIZIZ(SafeModeActivity.LJLIL, SafeModeActivity.LJLILLLLZI);
        int i = SafeModeActivity.LJLJI;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", LIZIZ.LIZLLL());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        SafeModeReporter.LIZJ("safemode_dialog_button_exit_v2", jSONObject);
        SafeModeActivity safeModeActivity2 = SafeModeActivity.LJLJJL;
        if (safeModeActivity2 != null) {
            safeModeActivity2.finish();
        }
        SafeModeActivity safeModeActivity3 = SafeModeActivity.LJLJJL;
        if (safeModeActivity3 != null) {
            C78248UnM.LJIIJJI(safeModeActivity3);
        }
    }

    public static void LIZIZ() {
        View findViewById;
        C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
        o.LJFF(c66465Q6r, "SafeModeConfig.getInstance()");
        if (c66465Q6r.LIZIZ != null) {
            PTS.LIZJ(SafeModeActivity.LJLIL, SafeModeActivity.LJLILLLLZI, "LaunchProtectClickSure");
        }
        SafeModeActivity safeModeActivity = SafeModeActivity.LJLJJL;
        if (safeModeActivity != null && (findViewById = safeModeActivity.findViewById(R.id.g94)) != null) {
            findViewById.setVisibility(0);
        }
        C66460Q6m.LIZIZ().getClass();
        C66459Q6l c66459Q6l = new C66459Q6l();
        c66459Q6l.LIZIZ = 1;
        c66459Q6l.LIZ = System.currentTimeMillis();
        C66458Q6k.LIZJ(c66459Q6l);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (C66458Q6k.class) {
            C66458Q6k.LIZ.LJI(currentTimeMillis, "boot_protected_time_stamp");
        }
        C66458Q6k.LIZIZ(true);
        SafeModeActivity safeModeActivity2 = SafeModeActivity.LJLJJL;
        if (safeModeActivity2 != null) {
            C16880lQ.LLLLJ(safeModeActivity2);
        }
        SafeModeReporter.CrashInfo LIZIZ = SafeModeReporter.CrashInfo.LIZIZ(SafeModeActivity.LJLIL, SafeModeActivity.LJLILLLLZI);
        int i = SafeModeActivity.LJLJI;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", LIZIZ.LIZLLL());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        SafeModeReporter.LIZJ("safemode_dialog_button_clean_v2", jSONObject);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(RunnableC66456Q6i.LJLIL);
    }
}
