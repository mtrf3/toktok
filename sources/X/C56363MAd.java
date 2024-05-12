package X;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.story.widget.LargeStoryWidget;
import com.ss.android.ugc.aweme.story.widget.SmallStoryWidget;
import com.zhiliaoapp.musically.R;
import djb.IDaS24S0000000_9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS30S0210000_9;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.MAd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56363MAd {
    public static boolean LJFF;
    public static final C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZJ.plus(T2R.LJIIJJI()).plus(new IDaS24S0000000_9(CoroutineExceptionHandler.LJJJJIZL, 0)));
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C56368MAi.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C56366MAg.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C56365MAf.LJLIL);
    public static final String LJ = "";
    public static final java.util.Set<Integer> LJI = new LinkedHashSet();

    public static Keva LIZ() {
        return (Keva) LIZLLL.getValue();
    }

    public static int[] LIZIZ(Context context) {
        int[] LIZJ2 = LIZJ(context, true);
        int[] LIZJ3 = LIZJ(context, false);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(ORY.LJJZ(LIZJ2));
        linkedHashSet.addAll(ORY.LJJZ(LIZJ3));
        return ORZ.LLJ(linkedHashSet);
    }

    public static int[] LIZJ(Context context, boolean z) {
        int[] iArr;
        Class cls;
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (appWidgetManager != null) {
                if (z) {
                    cls = LargeStoryWidget.class;
                } else {
                    cls = SmallStoryWidget.class;
                }
                iArr = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls));
            } else {
                iArr = null;
            }
            if (iArr == null) {
                return new int[0];
            }
            return iArr;
        } catch (Throwable unused) {
            return new int[0];
        }
    }

    public static void LIZLLL(Context context, List list) {
        o.LJIIIZ(context, "context");
        if (LIZIZ(context).length == 0) {
            MCT.LIZ("StoryWidgetMgr-refreshWidgetInternal", "no widget installed");
            return;
        }
        if (LJFF) {
            MCT.LIZ("StoryWidgetMgr-refreshWidgetInternal", "refreshing");
            return;
        }
        LJFF = true;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("forceUpdateToEmpty=[");
        LIZ2.append(ORZ.LLD(list, ",", null, null, null, 62));
        LIZ2.append(']');
        MCT.LIZ("StoryWidgetMgr-refreshWidgetInternal", X1D.LIZIZ(LIZ2));
        boolean z = !((ArrayList) list).isEmpty();
        MB4 mb4 = new MB4();
        XKX.LIZLLL(LIZ, mb4, null, new C56371MAl("StoryWidgetMgr-refreshWidgetInternal", z, context, list, mb4, null), 2).LJJIII(new AqS30S0210000_9(context, mb4, z, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public static void LJ(Context context, C61878OQg c61878OQg, boolean z) {
        int i;
        Class cls;
        int[] iArr;
        ?? LJJZ;
        if (z) {
            i = R.layout.hf;
            cls = LargeStoryWidget.class;
        } else {
            i = R.layout.hh;
            cls = SmallStoryWidget.class;
        }
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetManager == null || (iArr = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls))) == null) {
            iArr = new int[0];
        }
        if (!c61878OQg.isEmpty()) {
            LJJZ = new ArrayList();
            Iterator it = c61878OQg.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (ORY.LJJIJ(((Number) next).intValue(), iArr)) {
                    LJJZ.add(next);
                }
            }
        } else {
            LJJZ = ORY.LJJZ(iArr);
        }
        ?? LIZ2 = X1D.LIZ();
        LIZ2.append("updateSingleWidgetToStoryCamera [");
        LIZ2.append(ORY.LJJJJL(iArr, ",", null, 62));
        LIZ2.append("] ");
        LIZ2.append(LJJZ);
        String message = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(message, "message");
        if (LJJZ.isEmpty()) {
            return;
        }
        int[] LLJ = ORZ.LLJ(LJJZ);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
        Intent LIZ3 = MAE.LIZ(context, "story_s");
        LIZ3.putExtra("extra_jump_type", 6);
        LIZ3.setFlags(268435456);
        LIZ3.addFlags(67108864);
        PendingIntent activity = PendingIntent.getActivity(context, 1, LIZ3, C56378MAs.LIZIZ());
        o.LJIIIIZZ(activity, "getActivity(\n           …NG_INTENT_FLAGS\n        )");
        remoteViews.setOnClickPendingIntent(R.id.bxv, activity);
        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
        if (appWidgetManager2 != null) {
            appWidgetManager2.updateAppWidget(LLJ, remoteViews);
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("updateWidgetToCameraInternal widgetType=", "story_s", " widgetIDs=");
        String arrays = Arrays.toString(LLJ);
        o.LJIIIIZZ(arrays, "toString(this)");
        LIZIZ2.append(arrays);
        String message2 = X1D.LIZIZ(LIZIZ2);
        o.LJIIIZ(message2, "message");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static void LJFF(Context context, List list, boolean z, boolean z2) {
        int i;
        Class cls;
        int[] iArr;
        ?? LJJZ;
        String str;
        if (z) {
            i = R.layout.he;
            cls = LargeStoryWidget.class;
        } else {
            i = R.layout.hg;
            cls = SmallStoryWidget.class;
        }
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetManager != null) {
            iArr = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls));
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = new int[0];
        }
        if (!list.isEmpty()) {
            LJJZ = new ArrayList();
            for (Object obj : list) {
                if (ORY.LJJIJ(((Number) obj).intValue(), iArr)) {
                    LJJZ.add(obj);
                }
            }
        } else {
            LJJZ = ORY.LJJZ(iArr);
        }
        ?? LIZ2 = X1D.LIZ();
        LIZ2.append("updateSpecificWidgetToEmpty [");
        LIZ2.append(ORY.LJJJJL(iArr, ",", null, 62));
        LIZ2.append("] ");
        LIZ2.append(LJJZ);
        String message = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(message, "message");
        if (LJJZ.isEmpty()) {
            return;
        }
        int[] LLJ = ORZ.LLJ(LJJZ);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("StoryWidgetMgr:updateWidgetToEmptyInternal, ");
        String arrays = Arrays.toString(LLJ);
        o.LJIIIIZZ(arrays, "toString(this)");
        LIZ3.append(arrays);
        MCT.LIZ("StoryWidgetMgr", X1D.LIZIZ(LIZ3));
        if (i == R.layout.he) {
            str = "story_l";
        } else {
            str = "story_s";
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
        remoteViews.setViewVisibility(R.id.l7w, 8);
        remoteViews.setViewVisibility(R.id.bxv, 0);
        remoteViews.setImageViewResource(R.id.bxv, R.drawable.b8a);
        if (z2) {
            Intent LIZ4 = MAE.LIZ(context, str);
            LIZ4.putExtra("extra_jump_type", 3);
            LIZ4.setFlags(268435456);
            LIZ4.addFlags(67108864);
            PendingIntent activity = PendingIntent.getActivity(context, 1, LIZ4, C56378MAs.LIZIZ());
            o.LJIIIIZZ(activity, "getActivity(\n           …NG_INTENT_FLAGS\n        )");
            remoteViews.setOnClickPendingIntent(R.id.bxv, activity);
        } else {
            Intent LIZ5 = MAE.LIZ(context, str);
            LIZ5.putExtra("extra_jump_type", 0);
            LIZ5.setFlags(268435456);
            LIZ5.addFlags(67108864);
            PendingIntent activity2 = PendingIntent.getActivity(context, 1, LIZ5, C56378MAs.LIZIZ());
            o.LJIIIIZZ(activity2, "getActivity(\n           …NG_INTENT_FLAGS\n        )");
            remoteViews.setOnClickPendingIntent(R.id.bxv, activity2);
        }
        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
        if (appWidgetManager2 != null) {
            appWidgetManager2.updateAppWidget(LLJ, remoteViews);
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("updateWidgetToEmptyInternal widgetType=", str, " widgetIDs=");
        String arrays2 = Arrays.toString(LLJ);
        o.LJIIIIZZ(arrays2, "toString(this)");
        LIZIZ2.append(arrays2);
        String message2 = X1D.LIZIZ(LIZIZ2);
        o.LJIIIZ(message2, "message");
    }

    public static void LJI(Context context, MB4 mb4, int[] iArr, int i, Bitmap bitmap) {
        String str;
        String string;
        int i2;
        long j;
        C56364MAe c56364MAe = mb4.LJLIL;
        if (c56364MAe == null) {
            return;
        }
        if (i == R.layout.he) {
            str = "story_l";
        } else {
            str = "story_s";
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
        remoteViews.setImageViewBitmap(R.id.bxv, bitmap);
        long j2 = c56364MAe.LJLJJI;
        if (j2 < 3600000) {
            if (j2 < 60000) {
                j = 1;
            } else {
                j = j2 / 60000;
            }
            string = context.getString(R.string.hjf, Long.valueOf(j));
        } else {
            string = context.getString(R.string.hje, Long.valueOf(j2 / 3600000));
        }
        o.LJIIIIZZ(string, "if (timeAgoInMs < HOUR_I…_new_hrs, hour)\n        }");
        remoteViews.setTextViewText(R.id.l80, string);
        remoteViews.setViewVisibility(R.id.bxv, 0);
        remoteViews.setViewVisibility(R.id.l7w, 0);
        String str2 = c56364MAe.LJLIL;
        String str3 = c56364MAe.LJLILLLLZI;
        if (C55723Ltv.LIZIZ.LIZ().canShowStoryCell()) {
            i2 = 7;
        } else {
            i2 = 8;
        }
        Intent LIZ2 = MAE.LIZ(context, str);
        LIZ2.putExtra("extra_jump_type", i2);
        LIZ2.putExtra("extra_uid", str2);
        LIZ2.putExtra("extra_story_id", str3);
        LIZ2.setFlags(268435456);
        LIZ2.addFlags(67108864);
        PendingIntent activity = PendingIntent.getActivity(context, 1, LIZ2, C56378MAs.LIZIZ());
        o.LJIIIIZZ(activity, "getActivity(\n           …NG_INTENT_FLAGS\n        )");
        remoteViews.setOnClickPendingIntent(R.id.bxv, activity);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetManager != null) {
            appWidgetManager.updateAppWidget(iArr, remoteViews);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("updateWidgetWithAwemeInternal, widgetTypeName=");
        LIZ3.append(str);
        LIZ3.append(", refreshWidgetContext=");
        LIZ3.append(mb4);
        LIZ3.append(", widgetIDs=");
        String arrays = Arrays.toString(iArr);
        o.LJIIIIZZ(arrays, "toString(this)");
        LIZ3.append(arrays);
        MCT.LIZ("StoryWidgetMgr", X1D.LIZIZ(LIZ3));
    }
}
