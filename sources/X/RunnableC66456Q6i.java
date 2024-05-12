package X;

import android.content.Context;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.keva.KevaImpl;
import com.ss.android.legoimpl.StorageTask;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q6i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66456Q6i implements Runnable {
    public static final RunnableC66456Q6i LJLIL = new RunnableC66456Q6i();

    public static void LIZ() {
        Context context;
        C66460Q6m LIZIZ = C66460Q6m.LIZIZ();
        SafeModeActivity.LJLJJLL.getClass();
        SafeModeActivity safeModeActivity = SafeModeActivity.LJLJJL;
        if (safeModeActivity != null) {
            context = C16880lQ.LLLLJ(safeModeActivity);
        } else {
            context = null;
        }
        LIZIZ.getClass();
        PSY.LJ("begin cleanAllData");
        PTM.LJI(context).clearAll();
        PTS pts = (PTS) C66465Q6r.LJIILLIIL.LIZIZ;
        pts.getClass();
        if (C35019Dol.LIZ()) {
            C35007DoZ.LIZIZ.LIZ().edit().clear().commit();
            C35007DoZ.LIZ.LIZ().edit().putLong("clear_timestamp", System.currentTimeMillis()).apply();
        } else {
            int size = ExceptionManager.LIZJ(C66460Q6m.LIZIZ().LJ).LIZ.LIZ().size();
            if (size >= 3) {
                for (String str : PTS.LIZJ) {
                    KevaImpl.getRepo(str, 1).clear();
                }
                String parent = C16880lQ.LLIIJLIL(pts.LIZ).getParent();
                for (String str2 : PTS.LIZIZ) {
                    File file = new File(C16880lQ.LLLZ("%s/shared_prefs/%s.xml", new Object[]{parent, str2}));
                    if (file.exists()) {
                        try {
                            C16880lQ.LLLZZIL(file);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (size >= 4) {
                    try {
                        C22690un.LIZIZ(pts.LIZ, false);
                    } catch (Throwable unused2) {
                        AVInitializerImpl.LIZ().initAVEnv(FKM.LIZ());
                        new StorageTask().LIZLLL(pts.LIZ);
                        C22690un.LIZIZ(pts.LIZ, false);
                    }
                    File file2 = new File(C16880lQ.LLLZ("%s/cache", new Object[]{C16880lQ.LLIIJLIL(pts.LIZ).getParent()}));
                    if (file2.exists()) {
                        C38891fp.LJIILL(file2.getAbsolutePath());
                    }
                }
            }
            C35007DoZ.LIZ.LIZ().edit().putLong("clear_timestamp", System.currentTimeMillis()).apply();
        }
        PSY.LJ("end cleanAllData");
        SafeModeActivity.LJLJJLL.getClass();
        SafeModeActivity safeModeActivity2 = SafeModeActivity.LJLJJL;
        if (safeModeActivity2 != null) {
            C16880lQ.LLLLJ(safeModeActivity2);
        }
        SafeModeReporter.CrashInfo LIZIZ2 = SafeModeReporter.CrashInfo.LIZIZ(SafeModeActivity.LJLIL, SafeModeActivity.LJLILLLLZI);
        int i = SafeModeActivity.LJLJI;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", LIZIZ2.LIZLLL());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        SafeModeReporter.LIZJ("safemode_clean_success_v2", jSONObject);
        SafeModeActivity.LJLJJLL.getClass();
        SafeModeReporter.LJ("reportCleanSuccess", new ExceptionManager.ExceptionRecord(SafeModeActivity.LJLIL, SafeModeActivity.LJLILLLLZI, 0L, ""), "LOG_TYPE_PROTECTOR_REACH_EXCEPTION");
        SafeModeActivity safeModeActivity3 = SafeModeActivity.LJLJJL;
        if (safeModeActivity3 != null) {
            safeModeActivity3.finish();
        }
        SafeModeActivity safeModeActivity4 = SafeModeActivity.LJLJJL;
        if (safeModeActivity4 != null) {
            C78248UnM.LJIIJJI(safeModeActivity4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
