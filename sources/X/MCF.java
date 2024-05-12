package X;

import Y.AfS58S0200000_9;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS69S0400000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MCF extends MAZ {
    public abstract void LIZ(Context context, RemoteViews remoteViews);

    public abstract void LIZIZ(Context context, RemoteViews remoteViews);

    public abstract MCQ LJ(MCK mck);

    public abstract int LJFF();

    public abstract int LJI();

    public abstract int LJII();

    public abstract String LJIIIIZZ();

    public boolean LJIIIZ(Context context, AppWidgetManager appWidgetManager, int[] iArr, MCK mck) {
        o.LJIIIZ(context, "context");
        return false;
    }

    public abstract void LJIIJJI(Context context, MCK mck, RemoteViews remoteViews, AqS69S0400000_9 aqS69S0400000_9);

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        o.LJIIIZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIIIZZ());
        LIZ.append(", onDisabled");
        MCT.LIZ("NowAbsWidgetProvider", X1D.LIZIZ(LIZ));
        super.onDisabled(context);
        MAK.LIZ(context, false);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        o.LJIIIZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIIIZZ());
        LIZ.append(", onEnabled");
        MCT.LIZ("NowAbsWidgetProvider", X1D.LIZIZ(LIZ));
        super.onEnabled(context);
        MAK.LIZ(context, false);
        int LJII = LJII();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("widget_kind", "now");
        c188727au.LIZLLL(LJII, "widget_size");
        FMX.LJIIL("widget_added", c188727au.LIZ);
    }

    public final void LIZJ(Context context, Intent intent) {
        String str;
        int[] iArr;
        RemoteViews remoteViews;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIIIZZ());
        LIZ.append(", onReceive: ");
        if (intent == null || (str = intent.getAction()) == null) {
            str = null;
        }
        LIZ.append(str);
        MCT.LIZ("NowAbsWidgetProvider", X1D.LIZIZ(LIZ));
        super.onReceive(context, intent);
        if (context != null && o.LJ(intent.getAction(), "com.ss.android.ugc.tiktok.app.widget.NOW_WIDGET_CHECK_STATE")) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            o.LJIIIIZZ(appWidgetManager, "appWidgetManager");
            try {
                iArr = appWidgetManager.getAppWidgetIds(new ComponentName(context.getPackageName(), getClass().getName()));
                o.LJIIIIZZ(iArr, "{\n            appWidgetM…avaClass.name))\n        }");
            } catch (Exception unused) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJIIIIZZ());
                LIZ2.append(", getWidgetIds: onError");
                String message = X1D.LIZIZ(LIZ2);
                o.LJIIIZ(message, "message");
                iArr = new int[0];
            }
            if (iArr.length == 0) {
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LJIIIIZZ());
            LIZ3.append(", onUpdatePrepared: ");
            String arrays = Arrays.toString(iArr);
            o.LJIIIIZZ(arrays, "toString(this)");
            LIZ3.append(arrays);
            LIZ3.append(", thread: ");
            LIZ3.append(C16880lQ.LLLLIIIILLL().getName());
            MCT.LIZIZ("NowAbsWidgetProvider", X1D.LIZIZ(LIZ3));
            MCK mck = MCI.LIZ;
            if (mck.LIZ) {
                if (mck.LIZIZ.isEmpty()) {
                    remoteViews = new RemoteViews(context.getPackageName(), LJI());
                    LIZ(context, remoteViews);
                    str2 = "camera";
                } else {
                    remoteViews = new RemoteViews(context.getPackageName(), LJFF());
                    LJIIJJI(context, mck, remoteViews, new AqS69S0400000_9(mck, appWidgetManager, iArr, remoteViews, 7));
                    str2 = "now_post";
                }
            } else {
                if (LJIIIZ(context, appWidgetManager, iArr, mck)) {
                    return;
                }
                remoteViews = new RemoteViews(context.getPackageName(), LJI());
                LIZIZ(context, remoteViews);
                str2 = "default";
            }
            appWidgetManager.updateAppWidget(iArr, remoteViews);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LJIIIIZZ());
            LIZ4.append(" set to ");
            LIZ4.append(str2);
            MCT.LIZ("NowAbsWidgetProvider", X1D.LIZIZ(LIZ4));
        }
    }

    public final AbstractC56382MAw LJIIJ(Context context, Aweme aweme) {
        String str;
        long j;
        o.LJIIIZ(context, "context");
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        if (C78996UzQ.LJJIIZI(aweme)) {
            String LJIIIIZZ = LJIIIIZZ();
            if (aweme != null) {
                j = aweme.getCreateTime();
            } else {
                j = 0;
            }
            return new C56383MAx(context, LJIIIIZZ, 1000 * j, str);
        }
        return new C56385MAz(context, LJIIIIZZ(), str);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] appWidgetIds) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appWidgetIds, "appWidgetIds");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIIIZZ());
        LIZ.append(", onDeleted: ");
        LIZ.append(appWidgetIds);
        MCT.LIZ("NowAbsWidgetProvider", X1D.LIZIZ(LIZ));
        super.onDeleted(context, appWidgetIds);
        C56374MAo.LJ("delete", LJIIIIZZ());
    }

    @Override // X.MAZ, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZJ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZJ(context, intent);
        }
    }

    public static void LJIIL(RemoteViews remoteViews, Context context, Aweme aweme) {
        String str;
        long j;
        User author;
        o.LJIIIZ(context, "context");
        if (aweme == null || (author = aweme.getAuthor()) == null || (str = author.getNickname()) == null) {
            str = "";
        }
        remoteViews.setTextViewText(R.id.gw7, str);
        if (aweme != null) {
            j = aweme.getCreateTime();
        } else {
            j = 0;
        }
        remoteViews.setTextViewText(R.id.l8f, C57105Mb7.LJFF(j * 1000, context));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appWidgetManager, "appWidgetManager");
        o.LJIIIZ(appWidgetIds, "appWidgetIds");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIIIZZ());
        LIZ.append(", onUpdate: ");
        String arrays = Arrays.toString(appWidgetIds);
        o.LJIIIIZZ(arrays, "toString(this)");
        LIZ.append(arrays);
        LIZ.append(", thread: ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        MCT.LIZIZ("NowAbsWidgetProvider", X1D.LIZIZ(LIZ));
        MCI.LJ(LJIIIIZZ());
    }

    public final void LIZLLL(C197267og c197267og, Context context, MCK mck, RemoteViews remoteViews, AqS69S0400000_9 aqS69S0400000_9) {
        o.LJIIIZ(context, "context");
        if (c197267og == null) {
            remoteViews.setViewVisibility(R.id.ad2, 8);
            remoteViews.setViewVisibility(R.id.gw7, 0);
            remoteViews.setViewVisibility(R.id.l8f, 0);
            return;
        }
        MCQ LJ = LJ(mck);
        EnumC86195XsF tailStyle = EnumC86195XsF.AVATAR_NUMBER_TAIL;
        Integer valueOf = Integer.valueOf(R.attr.ca);
        int i = LJ.LIZ;
        int i2 = LJ.LIZIZ;
        int i3 = LJ.LIZLLL;
        float f = LJ.LJ;
        Boolean bool = LJ.LJIIIIZZ;
        boolean z = LJ.LJIIJ;
        boolean z2 = LJ.LJIIJJI;
        o.LJIIIZ(tailStyle, "tailStyle");
        new MCR(context, c197267og, new MCQ(i, i2, valueOf, i3, f, 0.5f, R.attr.ch, R.attr.dj, bool, tailStyle, z, z2)).LIZIZ().LJJJLIIL(new AfS58S0200000_9(remoteViews, aqS69S0400000_9, 28), MCP.LJLIL);
    }
}
