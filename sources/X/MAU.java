package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MAU extends MAZ {
    public abstract String LIZ();

    public abstract int LIZIZ();

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        o.LJIIIZ(context, "context");
        super.onDisabled(context);
        C56374MAo.LJ("disabled", LIZ());
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        int i;
        o.LJIIIZ(context, "context");
        super.onEnabled(context);
        C56374MAo.LJ("enable", LIZ());
        MCT.LIZ("AbsStoryWidgetProvider", "onEnabled");
        if (LIZIZ() == 11) {
            i = 0;
        } else if (LIZIZ() == 12) {
            i = 2;
        } else {
            i = -1;
        }
        FMX.LJIILL("widget_added", new OSZ("story", "widget_kind"), new OSZ(Integer.valueOf(i), "widget_size"));
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, getClass()));
        o.LJIIIIZZ(appWidgetIds, "appWidgetManager.getAppW…Name(context, javaClass))");
        Integer LJJIZ = ORY.LJJIZ(appWidgetIds);
        if (LJJIZ != null) {
            int intValue = LJJIZ.intValue();
            StringBuilder LJ = C7MY.LJ("onWidgetInstalled widgetID=", intValue, ", provider=");
            LJ.append(getClass());
            MCT.LIZ("StoryWidgetMgr", X1D.LIZIZ(LJ));
            java.util.Set<Integer> set = C56363MAd.LJI;
            set.add(Integer.valueOf(intValue));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addWidgetID = ");
            LIZ.append(intValue);
            LIZ.append(", current = ");
            LIZ.append(ORZ.LLD(set, ",", null, null, null, 62));
            MCT.LIZ("StoryWidgetMgr", X1D.LIZIZ(LIZ));
            MA1.LJLILLLLZI.LJIIZILJ().storeBoolean("keva_key_has_added_story_widget", true);
            Keva LIZ2 = C56363MAd.LIZ();
            ArrayList arrayList = new ArrayList(C32I.LJJL(set, 10));
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next().intValue()));
            }
            LIZ2.storeStringSet("widgetIDsKey", ORZ.LLJJ(arrayList));
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] appWidgetIds) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appWidgetIds, "appWidgetIds");
        super.onDeleted(context, appWidgetIds);
        C56374MAo.LJ("delete", LIZ());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDeleted -- ");
        LIZ.append(appWidgetIds[0]);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appWidgetManager, "appWidgetManager");
        o.LJIIIZ(appWidgetIds, "appWidgetIds");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdate ");
        String arrays = Arrays.toString(appWidgetIds);
        o.LJIIIIZZ(arrays, "toString(this)");
        LIZ.append(arrays);
        MCT.LIZ("AbsStoryWidgetProvider", X1D.LIZIZ(LIZ));
        C56374MAo.LJ("update", LIZ());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onWidgetUpdate ");
        String arrays2 = Arrays.toString(appWidgetIds);
        o.LJIIIIZZ(arrays2, "toString(this)");
        LIZ2.append(arrays2);
        LIZ2.append(", force to update");
        MCT.LIZ("StoryWidgetMgr", X1D.LIZIZ(LIZ2));
        List LJJZ = ORY.LJJZ(appWidgetIds);
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJJZ) {
            if (!C56363MAd.LJI.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        C56363MAd.LIZLLL(context, ORZ.LLJILJILJ(arrayList));
    }
}
