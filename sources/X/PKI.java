package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PKI implements PLX {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ File LIZJ;

    @Override // X.PLX
    public final void LIZIZ() {
    }

    @Override // X.PLX
    public final PKN LIZJ(int i, PKN pkn) {
        JSONObject jSONObject = pkn.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZJ.getAbsolutePath());
        LIZ.append('.');
        LIZ.append(i);
        PK8.LJIILLIIL(new File(X1D.LIZIZ(LIZ)), jSONObject);
        if (i == 0) {
            PK0.LJIIIZ.clearImportTagsFile();
            PKB.LIZJ().LIZIZ();
        }
        return pkn;
    }

    @Override // X.PLX
    public final PKN LIZLLL(int i, PKN pkn) {
        String LJ;
        String str = "true";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C64264PKa.LJ(PK0.LIZ, pkn.LIZ);
                    }
                } else if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1) {
                    pkn.LJIIJJI("all_thread_stacks", PKW.LIZIZ(this.LIZ));
                    pkn.LJFF("has_all_thread_stack", "true");
                }
            } else {
                JSONArray LIZJ = PIX.LIZJ();
                long uptimeMillis = SystemClock.uptimeMillis();
                JSONObject LIZ = PIX.LIZ();
                JSONArray LIZLLL = PIX.LIZLLL(uptimeMillis);
                pkn.LJIIJJI("history_message", LIZJ);
                pkn.LJIIJJI("current_message", LIZ);
                pkn.LJIIJJI("pending_messages", LIZLLL);
                pkn.LJFF("disable_looper_monitor", String.valueOf(PJA.LIZIZ()));
                pkn.LJIIJJI("alive_pids", PKQ.LIZLLL());
            }
        } else {
            String str2 = this.LIZ;
            if (str2 != null && !str2.isEmpty()) {
                String str3 = this.LIZ;
                if (!TextUtils.isEmpty(str3)) {
                    if ("main".equalsIgnoreCase(str3)) {
                        LJ = PKW.LJ(C16880lQ.LLJJJJ().getThread().getStackTrace());
                    } else {
                        ThreadGroup threadGroup = C16880lQ.LLJJJJ().getThread().getThreadGroup();
                        int activeCount = threadGroup.activeCount();
                        Thread[] threadArr = new Thread[(activeCount / 2) + activeCount];
                        int enumerate = threadGroup.enumerate(threadArr);
                        for (int i2 = 0; i2 < enumerate; i2++) {
                            String name = threadArr[i2].getName();
                            if (!TextUtils.isEmpty(name) && (name.equals(str3) || name.startsWith(str3) || name.endsWith(str3))) {
                                LJ = PKW.LJ(threadArr[i2].getStackTrace());
                                break;
                            }
                        }
                    }
                    pkn.LJIIJJI("java_data", LJ);
                }
                LJ = "";
                pkn.LJIIJJI("java_data", LJ);
            }
            pkn.LJIIJJI("tid", Integer.valueOf(this.LIZIZ));
            if (!PKR.LJII) {
                str = "false";
            }
            pkn.LJFF("crash_after_crash", str);
            C30581Hy.LJJIJLIJ(C78596Usy.LJIJ(PK0.LIZ), CrashType.NATIVE);
        }
        return pkn;
    }

    public PKI(String str, File file, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = file;
    }
}
