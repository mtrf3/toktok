package X;

import Y.ARunnableS8S1200000_9;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MAo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56374MAo {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZIZ(int[] targetPxSize, Bitmap scaledBitmap) {
        float LJIIZILJ = C32151Nz.LJIIZILJ(8);
        o.LJIIIZ(targetPxSize, "targetPxSize");
        o.LJIIIZ(scaledBitmap, "originBitmap");
        if (targetPxSize[0] < scaledBitmap.getWidth()) {
            scaledBitmap = ThumbnailUtils.extractThumbnail(scaledBitmap, targetPxSize[0], targetPxSize[1]);
        }
        o.LJIIIIZZ(scaledBitmap, "scaledBitmap");
        return LIZ(LJIIZILJ, scaledBitmap, new int[]{scaledBitmap.getWidth(), scaledBitmap.getHeight()});
    }

    public static void LJ(String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str2, "widgetTypeName");
        LIZLLL.LJIIIZ("action_type", str);
        LIZLLL.LJIIIZ("widget_type", str2);
        FMX.LJIIL("widget_action", LIZLLL.LIZ);
    }

    public static void LJFF(String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str2, "widgetTypeName");
        LIZLLL.LJIIIZ("request_type", str);
        LIZLLL.LJIIIZ("widget_type", str2);
        FMX.LJIIL("widget_request", LIZLLL.LIZ);
    }

    public static Bitmap LIZ(float f, Bitmap bitmap, int[] targetPxSize) {
        o.LJIIIZ(targetPxSize, "targetPxSize");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, targetPxSize[0], targetPxSize[1]);
        RectF rectF = new RectF(new Rect(0, 0, targetPxSize[0], targetPxSize[1]));
        Bitmap roundBitmap = Bitmap.createBitmap(targetPxSize[0], targetPxSize[1], Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(roundBitmap);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        o.LJIIIIZZ(roundBitmap, "roundBitmap");
        return roundBitmap;
    }

    public static void LIZJ(Context context, String url, AbstractC85293Wj abstractC85293Wj) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        W5F LJIIIIZZ = W5U.LJIIIIZZ(url);
        LJIIIIZZ.LIZJ = context;
        LJIIIIZZ.LJIJI = Bitmap.Config.RGB_565;
        LJIIIIZZ.LJIIIZ(abstractC85293Wj);
    }

    public static void LIZLLL(Context context, String str, List targetWidgetProviders) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(targetWidgetProviders, "targetWidgetProviders");
        if (((Boolean) C33814DOw.LIZ.getValue()).booleanValue() && !o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            LJII(context, new Intent(str), targetWidgetProviders);
        } else {
            C38995FSd.LIZIZ().execute(new ARunnableS8S1200000_9(context, str, targetWidgetProviders, 3));
        }
    }

    public static void LJII(Context context, Intent intent, List list) {
        if (((Boolean) C52625Kl3.LIZ.getValue()).booleanValue()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AppWidgetProvider) it.next()).onReceive(context, intent);
            }
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                o.LJIIIIZZ(queryBroadcastReceivers, "context.packageManager.q…dcastReceivers(intent, 0)");
                Iterator<ResolveInfo> it2 = queryBroadcastReceivers.iterator();
                while (it2.hasNext()) {
                    ActivityInfo activityInfo = it2.next().activityInfo;
                    intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
                    context.sendBroadcast(intent);
                }
                return;
            }
            context.sendBroadcast(intent);
        }
    }

    public static void LJI(int i, int i2, String str, String str2, String str3) {
        C188727au LIZ2 = C78928UyK.LIZ(str2, "widgetTypeName", str3, "errorMsg");
        LIZ2.LJIIIZ("request_type", str);
        LIZ2.LJIIIZ("widget_type", str2);
        LIZ2.LJIIIZ("status", str);
        if (i == 0) {
            LIZ2.LIZLLL(i2, "error_code");
            LIZ2.LJI("error_msg", str3);
        }
        FMX.LJIIL("widget_response", LIZ2.LIZ);
    }
}
