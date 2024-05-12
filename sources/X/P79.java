package X;

import android.util.Printer;

/* loaded from: classes12.dex */
public final class P79 implements Printer {
    public long LJLIL;
    public int LJLILLLLZI;
    public long LJLJI;

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">>>>> Dispatching to Handler")) {
            this.LJLIL = System.currentTimeMillis();
            return;
        }
        if (!str.startsWith("<<<<< Finished to Handler")) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
        if (currentTimeMillis <= 1000) {
            return;
        }
        int i = this.LJLILLLLZI + 1;
        this.LJLILLLLZI = i;
        C87367YQp.LIZ("te_record_camera_task_time_out_count", i);
        if (currentTimeMillis <= this.LJLJI) {
            return;
        }
        this.LJLJI = currentTimeMillis;
        C87367YQp.LIZ("te_record_camera_max_lag_task_cost", currentTimeMillis);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("task: ");
        LIZ.append(str);
        LIZ.append(", cost: ");
        LIZ.append(currentTimeMillis);
        LIZ.append("ms");
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
    }
}
