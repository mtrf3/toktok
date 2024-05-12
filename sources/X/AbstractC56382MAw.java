package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import kotlin.jvm.internal.o;

/* renamed from: X.MAw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC56382MAw implements MB2 {
    public final Context LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public abstract void LIZ(Intent intent);

    public final void LIZIZ(RemoteViews remoteViews, int i) {
        Intent LIZ = MAE.LIZ(this.LIZIZ, this.LIZJ);
        LIZ.setFlags(268435456);
        LIZ.addFlags(67108864);
        LIZ(LIZ);
        Bundle bundle = new Bundle();
        bundle.putString("enter_to", this.LIZLLL);
        LIZ.putExtra("extra_now_event_log_info", bundle);
        Context context = this.LIZIZ;
        MB2.LIZ.getClass();
        PendingIntent activity = PendingIntent.getActivity(context, MB1.LIZIZ.getAndIncrement(), LIZ, C56378MAs.LIZIZ());
        o.LJIIIIZZ(activity, "getActivity(\n           …NG_INTENT_FLAGS\n        )");
        remoteViews.setOnClickPendingIntent(i, activity);
    }

    public AbstractC56382MAw(Context context, String widgetType, String str) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(widgetType, "widgetType");
        this.LIZIZ = context;
        this.LIZJ = widgetType;
        this.LIZLLL = str;
    }
}
