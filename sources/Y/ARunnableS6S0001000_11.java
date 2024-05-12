package Y;

import X.C16880lQ;
import X.C19U;
import X.C36582EXi;
import X.C40700FyC;
import X.C66460Q6m;
import X.C66461Q6n;
import X.C66465Q6r;
import X.PSY;
import X.PTG;
import X.PTS;
import X.Q5A;
import X.Q5J;
import Y.ARunnableS15S0101000_11;
import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import com.ss.ttlivestreamer.livestreamv2.RenderView;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS6S0001000_11 implements Runnable {
    public final int $t;
    public int i0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS6S0001000_11 aRunnableS6S0001000_11) {
        switch (aRunnableS6S0001000_11.i0) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add("safemode_dialog_show_v2");
                arrayList.add("safemode_dialog_button_exit_v2");
                arrayList.add("safemode_dialog_button_clean_v2");
                arrayList.add("safemode_clean_success_v2");
                arrayList.add("safemode_start_success");
                C19U.LIZLLL(arrayList, "safemode_protect_success_v2_1", "safemode_protect_success_v2_2", "safemode_protect_fail_v2", "safemode_protect_other_crash_v2");
                C19U.LIZLLL(arrayList, "safemode_kill_process_cancel_v2", "safemode_reach_roll_back", "safemode_done_roll_back", "safemode_roll_back_start_success");
                C19U.LIZLLL(arrayList, "safemode_roll_back_protect_fail_same", "safemode_roll_back_protect_fail_other", "safemode_roll_back_protect_success", "safemode_roll_back_protect_success_2");
                C19U.LIZLLL(arrayList, "safemode_reach_boot_protect", "safemode_in_protect_period", "safemode_make_snapshot_fail", "safemode_abort_roll_back");
                C19U.LIZLLL(arrayList, "safemode_roll_back_fail", "safemode_skip_crash", "safemode_handle_exception_error", "safemode_trigger_handle_exception");
                arrayList.add("safemode_stack_calc_exception");
                PSY.LJ("begin reportAllEvent");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    try {
                        Context context = C66460Q6m.LIZIZ().LJ;
                        if (context != null) {
                            File file = new File(new File(C16880lQ.LLIIJLIL(context).getAbsolutePath(), "SafeModeReporter"), str);
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                new PTG().walk(file, arrayList2);
                            } catch (IOException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                File file2 = (File) it2.next();
                                try {
                                    if (file2.exists()) {
                                        PTS.LIZ(str, new JSONObject(FileUtils.readFileToString(file2, Charset.forName("UTF-8"))));
                                        PSY.LJ(C16880lQ.LLLZ("report %s file %s deleteResult %b", new Object[]{str, file2.getAbsolutePath(), Boolean.valueOf(C16880lQ.LLLZZIL(file2))}));
                                    }
                                } catch (IOException e2) {
                                    C16880lQ.LLLLIIL(e2);
                                }
                            }
                        }
                    } catch (JSONException e3) {
                        C16880lQ.LLLLIIL(e3);
                    }
                }
                PSY.LJ("end reportAllEvent");
                try {
                    C66461Q6n LJ = C66461Q6n.LJ("safe_mode_exception_repo");
                    LJ.LIZJ("log_tye", "");
                    String LIZJ = LJ.LIZJ("exception_msg", "");
                    LJ.LIZJ("exception_type", "");
                    ((PTS) C66465Q6r.LJIILLIIL.LIZIZ).LIZLLL(LIZJ, LJ.LIZJ("exception_stack", ""));
                    LJ.LIZ.edit().clear().apply();
                    return;
                } catch (Exception e4) {
                    C16880lQ.LLLLIIL(e4);
                    return;
                }
            case 1:
                C16880lQ.LJLI(Looper.myQueue(), new MessageQueue.IdleHandler() { // from class: X.FL3
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        CopyOnWriteArrayList<InterfaceC65784Pro<C76800UCe>> copyOnWriteArrayList = C38809FKz.LIZIZ;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            Object LJLLJ = ORZ.LJLLJ(copyOnWriteArrayList);
                            copyOnWriteArrayList.remove(LJLLJ);
                            C38805FKv.LIZ.getClass();
                            C38805FKv.LIZLLL().post(new ARunnableS15S0101000_11(3, LJLLJ, 14));
                            return true;
                        }
                        return true;
                    }
                });
                return;
            default:
                try {
                    if (C40700FyC.LIZ(Q5A.class)) {
                        return;
                    }
                    try {
                        Iterator<Q5J> it3 = Q5A.LIZIZ.iterator();
                        while (it3.hasNext()) {
                            it3.next().LIZ(true);
                        }
                        Q5A.LJ.set(false);
                        return;
                    } catch (Throwable th) {
                        Q5A.LJ.set(false);
                        throw th;
                    }
                } catch (Throwable unused) {
                    return;
                }
        }
    }

    public static final void run$1(ARunnableS6S0001000_11 aRunnableS6S0001000_11) {
        switch (aRunnableS6S0001000_11.i0) {
            case 0:
                C36582EXi.LIZ(2);
                return;
            default:
                RenderView.lambda$pushVideoFrame$0();
                return;
        }
    }

    public ARunnableS6S0001000_11(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }
}
