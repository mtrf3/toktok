package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.lynx.tasm.base.TraceController;
import java.util.ArrayList;

/* renamed from: X.OJr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61707OJr extends BroadcastReceiver {
    public final /* synthetic */ TraceController LIZ;

    public C61707OJr(TraceController traceController) {
        this.LIZ = traceController;
    }

    public final void LIZ(Context context, Intent intent) {
        String[] strArr;
        if (intent.getAction().endsWith("LYNX_TRACE_START")) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "categories");
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "file");
            int intExtra = intent.getIntExtra("buffer", 40960);
            boolean booleanExtra = intent.getBooleanExtra("system", false);
            if (LLJJIJIIJIL2 == null) {
                LLJJIJIIJIL2 = this.LIZ.generateTracingFilename();
            }
            TraceController traceController = this.LIZ;
            if (LLJJIJIIJIL != null) {
                strArr = LLJJIJIIJIL.split(",");
            } else {
                strArr = null;
            }
            traceController.LIZJ(booleanExtra ? 1 : 0, intExtra, strArr, LLJJIJIIJIL2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Trace started at: ");
            LIZ.append(LLJJIJIIJIL2);
            C16880lQ.LLZILL(Toast.makeText(context, X1D.LIZIZ(LIZ), 0));
            return;
        }
        if (!intent.getAction().endsWith("LYNX_TRACE_STOP")) {
            return;
        }
        this.LIZ.LIZLLL();
        C16880lQ.LLZILL(Toast.makeText(context, "Trace stopped", 0));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
