package X;

import android.os.SystemClock;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M9Z extends C78588Usq {
    @Override // X.C78588Usq, X.PRT
    public final void LIZIZ(String type) {
        o.LJIIIZ(type, "type");
        if (C56334M9a.LIZ() > 0) {
            ArrayList arrayList = new ArrayList();
            if (((Boolean) C56334M9a.LIZJ.getValue()).booleanValue()) {
                arrayList.add("start_gc_block");
            }
            if (((Boolean) C56334M9a.LIZ.getValue()).booleanValue()) {
                arrayList.add("start_jit_block");
            }
            if (((Boolean) C56334M9a.LIZIZ.getValue()).booleanValue()) {
                arrayList.add("start_log_block");
            }
            if (((Boolean) C56334M9a.LIZLLL.getValue()).booleanValue()) {
                arrayList.add("start_boot_finish");
            }
            if (((Boolean) C56334M9a.LJ.getValue()).booleanValue()) {
                arrayList.add("start_do_frame");
            }
            if (((Boolean) C56334M9a.LJFF.getValue()).booleanValue()) {
                arrayList.add("thread_priority");
            }
            FNI.LIZ(arrayList);
        }
    }

    @Override // X.C78588Usq, X.PRT
    public final void onStop(String type) {
        o.LJIIIZ(type, "type");
        if (C56334M9a.LIZ() > 0) {
            SystemClock.uptimeMillis();
            ArrayList arrayList = new ArrayList();
            if (((Boolean) C56334M9a.LIZJ.getValue()).booleanValue()) {
                arrayList.add("stop_gc_block");
            }
            if (((Boolean) C56334M9a.LIZ.getValue()).booleanValue()) {
                arrayList.add("stop_jit_block");
            }
            if (((Boolean) C56334M9a.LIZIZ.getValue()).booleanValue()) {
                arrayList.add("stop_log_block");
            }
            if (((Boolean) C56334M9a.LIZLLL.getValue()).booleanValue()) {
                arrayList.add("stop_boot_finish");
            }
            if (((Boolean) C56334M9a.LJ.getValue()).booleanValue()) {
                arrayList.add("stop_do_frame");
            }
            if (((Boolean) C56334M9a.LJFF.getValue()).booleanValue()) {
                arrayList.add("reset_thread_priority");
            }
            FNI.LIZIZ(arrayList);
        }
    }
}
