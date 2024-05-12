package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.widget.RemoteViews;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.follow.widget.FollowBigWidgetProvider;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lwo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55902Lwo {
    public static long LIZ;
    public static long LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static int LIZIZ = -1;
    public static List<C55906Lws> LIZJ = new ArrayList();
    public static String LIZLLL = "";
    public static int LJ = -1;
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C55905Lwr.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C55904Lwq.LJLIL);

    public static int LIZLLL() {
        int i = LIZIZ;
        if (i <= 0) {
            i = LJ().getInt("follow_anchor_live_num", 0);
        }
        if ("small".equals(LIZLLL)) {
            return Math.min(i, 3);
        }
        return Math.min(i, 4);
    }

    public static Keva LJ() {
        return (Keva) LJIIIIZZ.getValue();
    }

    public static int LIZIZ() {
        Object LIZJ2 = C0F0.LIZIZ().LIZJ(1, "tiktok_live_following_widget_type");
        o.LJIIIIZZ(LIZJ2, "get().getService(ILiveOu…ue(FOLLOW_WIDGET_TYPE, 1)");
        return ((Number) LIZJ2).intValue();
    }

    public static void LJIIIIZZ() {
        Activity LJIIIIZZ2;
        if (System.currentTimeMillis() - LIZ >= 5000 && (LJIIIIZZ2 = C84763XOl.LJIIIIZZ()) != null) {
            LIZ = System.currentTimeMillis();
            LJIIIZ(LJIIIIZZ2);
        }
    }

    public static boolean LIZ(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 26) {
            return AppWidgetManager.getInstance(context).isRequestPinAppWidgetSupported();
        }
        return false;
    }

    public static void LJIIIZ(Context context) {
        o.LJIIIZ(context, "context");
        if (LJI(context, true).length != 0) {
            Intent intent = new Intent();
            intent.setAction("com.ss.android.ugc.aweme.follow.BIG_WIDGET_UPDATE");
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
        }
        if (LJI(context, false).length == 0) {
            return;
        }
        Intent intent2 = new Intent();
        intent2.setAction("com.ss.android.ugc.aweme.follow.SAMLL_WIDGET_UPDATE");
        intent2.setPackage(context.getPackageName());
        context.sendBroadcast(intent2);
    }

    public static void LJIIJ(Context context) {
        if (!LJI) {
            return;
        }
        int LIZLLL2 = LIZLLL();
        if (LIZLLL2 > 0) {
            FollowFeedServiceImpl.LJIILL().LJIIJJI(context);
            LJI = false;
        } else {
            LiveOuterService.LJJJLL().LJJJJLL(true).getClass();
            if (LQM.LJIIIZ) {
                o.LJIIIZ(context, "context");
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                roomsData.fromNewStyle = true;
                enterRoomConfig.mLogData.toplivePosition = LQM.LJIILIIL;
                roomsData.enterFromMerge = "follow_widget";
                roomsData.enterMethod = "live_merge";
                if (o.LJ("follow_widget", "follow_widget")) {
                    LiveOuterService.LJJJLL().LJIIJJI();
                    EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                    roomsData2.widgetType = LIZLLL;
                    roomsData2.widgetAnchorNum = LIZLLL();
                    enterRoomConfig.mRoomsData.anchorPosition = LJ;
                }
                LiveOuterService.LJJJLL().LJJIZ().LJIILL();
                C78461Uqn.LIZIZ(context, enterRoomConfig, "homepage_hot");
                String str = LIZLLL;
                HashMap LIZ2 = C45243HpH.LIZ("enter_from_merge", "follow_widget", "enter_method", "live_merge");
                LIZ2.put("_param_live_platform", "live");
                LIZ2.put("widget_type", str);
                FMX.LJIIL("livesdk_enter_live_merge", LIZ2);
            }
        }
        String str2 = LIZLLL;
        int i = LJ;
        HashMap hashMap = new HashMap();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZLLL2);
        LIZ3.append("");
        hashMap.put("widget_anchor_num", X1D.LIZIZ(LIZ3));
        hashMap.put("widget_type", str2);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(i);
        LIZ4.append("");
        hashMap.put("anchor_position", X1D.LIZIZ(LIZ4));
        FMX.LJIIL("livesdk_widget_enter", hashMap);
    }

    public static int[] LJI(Context context, boolean z) {
        int[] iArr;
        Class cls;
        o.LJIIIZ(context, "context");
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (appWidgetManager != null) {
                if (z) {
                    cls = FollowBigWidgetProvider.class;
                } else {
                    cls = MAW.class;
                }
                iArr = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls));
            } else {
                iArr = null;
            }
            if (iArr == null) {
                return new int[0];
            }
            return iArr;
        } catch (Throwable th) {
            C0NB.LJI("FollowAddWidgetGuideUtil", th);
            return new int[0];
        }
    }

    public static PendingIntent LIZJ(Context context, int i, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        if (z) {
            intent.putExtra("follow_widget_click_type", "medium");
        } else {
            intent.putExtra("follow_widget_click_type", "small");
        }
        intent.putExtra("follow_widget_click_position", i);
        intent.putExtra("follow_widget_enter_from_merge", "follow_widget");
        intent.putExtra("tab", 0);
        if ((!LIZJ.isEmpty()) && LIZJ.size() > i) {
            intent.putExtra("follow_widget_click_room_id", ((C55906Lws) ListProtector.get(LIZJ, i)).LIZ);
            intent.putExtra("follow_widget_click_anchor_id", ((C55906Lws) ListProtector.get(LIZJ, i)).LIZIZ);
        }
        PendingIntent activity = PendingIntent.getActivity(context, i, intent, ((Number) LJIIIZ.getValue()).intValue());
        o.LJIIIIZZ(activity, "getActivity(context, pos…nt, PENDING_INTENT_FLAGS)");
        return activity;
    }

    public static Bitmap LJFF(int i, int i2, Bitmap scaledBitmap, float f) {
        o.LJIIIZ(scaledBitmap, "originBitmap");
        if (i < scaledBitmap.getWidth()) {
            scaledBitmap = ThumbnailUtils.extractThumbnail(scaledBitmap, i, i2);
        }
        o.LJIIIIZZ(scaledBitmap, "scaledBitmap");
        int[] iArr = {scaledBitmap.getWidth(), scaledBitmap.getHeight()};
        Paint LIZIZ2 = C6D8.LIZIZ(true);
        Rect rect = new Rect(0, 0, iArr[0], iArr[1]);
        RectF rectF = new RectF(new Rect(0, 0, iArr[0], iArr[1]));
        Bitmap roundBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(roundBitmap);
        canvas.drawRoundRect(rectF, f, f, LIZIZ2);
        LIZIZ2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(scaledBitmap, rect, rect, LIZIZ2);
        o.LJIIIIZZ(roundBitmap, "roundBitmap");
        return roundBitmap;
    }

    public static void LJII(Context context, int i, int i2, String url, int i3, int i4, float f, RemoteViews remoteViews) {
        o.LJIIIZ(url, "url");
        C55903Lwp c55903Lwp = new C55903Lwp(remoteViews, i3, i, i2, f, context, i4);
        W5F LJIIIIZZ2 = W5U.LJIIIIZZ(url);
        LJIIIIZZ2.LIZJ = context;
        LJIIIIZZ2.LJIJI = Bitmap.Config.RGB_565;
        LJIIIIZZ2.LJIIIZ(c55903Lwp);
    }
}
