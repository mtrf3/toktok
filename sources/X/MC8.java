package X;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.widget.RemoteViews;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class MC8<V> implements Callable {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int[] LJLJJI;

    public MC8(Context context, int i, String str, int[] iArr) {
        this.LJLIL = context;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = iArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object LIZ;
        PendingIntent pendingIntent;
        try {
            RemoteViews remoteViews = new RemoteViews(this.LJLIL.getPackageName(), this.LJLILLLLZI);
            remoteViews.setViewVisibility(R.id.k0j, 8);
            remoteViews.setViewVisibility(R.id.fu7, 8);
            remoteViews.setViewVisibility(R.id.c5k, 8);
            remoteViews.setViewVisibility(R.id.h3i, 0);
            Context context = this.LJLIL;
            String str = this.LJLJI;
            MCC mcc = (MCC) C95J.LIZ(1000);
            if (mcc != null) {
                pendingIntent = mcc.LIZIZ(context, str);
            } else {
                pendingIntent = null;
            }
            remoteViews.setOnClickPendingIntent(R.id.h3i, pendingIntent);
            AppWidgetManager.getInstance(this.LJLIL).updateAppWidget(this.LJLJJI, remoteViews);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        return C3C5.m6boximpl(LIZ);
    }
}
