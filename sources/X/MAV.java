package X;

import Y.AfS61S0100000_9;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MAV extends MAZ {
    public long LIZ;

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        o.LJIIIZ(context, "context");
        super.onEnabled(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] appWidgetIds) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appWidgetIds, "appWidgetIds");
        super.onDeleted(context, appWidgetIds);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        AbstractC73672Svk LIZ;
        super.onUpdate(context, appWidgetManager, iArr);
        if (context != null) {
            C55902Lwo.LJIIIZ(context);
        }
        if (System.currentTimeMillis() - this.LIZ < 1800000000) {
            return;
        }
        this.LIZ = System.currentTimeMillis();
        if (1 == C55902Lwo.LIZIZ()) {
            if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                LIZ = AbstractC73672Svk.LJJIJIL(1).LJJIII(C78845Uwz.LJLIL, false);
            } else {
                LIZ = C35970E9u.LIZ();
            }
            LIZ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS61S0100000_9(context, 0));
        }
    }
}
