package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.os.Build;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.appwidget.CameraWidgetProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MCW implements View.OnClickListener {
    public final /* synthetic */ TuxSheet LJLIL;
    public final /* synthetic */ MCX LJLILLLLZI;

    public MCW(TuxSheet tuxSheet, MCX mcx) {
        this.LJLIL = tuxSheet;
        this.LJLILLLLZI = mcx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AppWidgetManager appWidgetManager;
        this.LJLIL.dismiss();
        MCX mcx = this.LJLILLLLZI;
        ActivityC45651qj activity = mcx.LJLIL;
        String shootWay = mcx.LJLJI;
        String enterFrom = mcx.LJLILLLLZI;
        String creationId = mcx.LJLJJI;
        String scene = mcx.LJLJJL;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(scene, "scene");
        if (Build.VERSION.SDK_INT >= 26 && (appWidgetManager = AppWidgetManager.getInstance(activity)) != null && appWidgetManager.isRequestPinAppWidgetSupported()) {
            ComponentName componentName = new ComponentName(activity, (Class<?>) CameraWidgetProvider.class);
            AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(activity);
            if (appWidgetManager2 != null) {
                appWidgetManager2.requestPinAppWidget(componentName, null, HKC.LIZIZ(shootWay, enterFrom, creationId, scene, activity));
            }
        }
        MCX mcx2 = this.LJLILLLLZI;
        C145075mh.LIZ(mcx2.LJLILLLLZI, mcx2.LJLJI, mcx2.LJLJJI, mcx2.LJLJJL, "add");
    }
}
