package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.o;

/* renamed from: X.OHw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61660OHw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Window window, View view, InterfaceC88471Ynr interfaceC88471Ynr) {
        Bitmap bitmap;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap bitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888, true);
            o.LJIIIIZZ(bitmap2, "bitmap");
            PixelCopyOnPixelCopyFinishedListenerC61661OHx pixelCopyOnPixelCopyFinishedListenerC61661OHx = new PixelCopyOnPixelCopyFinishedListenerC61661OHx(interfaceC88471Ynr, bitmap2);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            try {
                C61663OHz c61663OHz = C61662OHy.LIZ;
                int i = iArr[0];
                Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
                Handler handler = new Handler(C16880lQ.LLJJJJ());
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476435970, "bpea-take_shot_to_pick_color");
                c61663OHz.getClass();
                C61663OHz.LIZ(window, rect, bitmap2, pixelCopyOnPixelCopyFinishedListenerC61661OHx, handler, LJJIIJ);
                return;
            } catch (Q0C unused) {
                pixelCopyOnPixelCopyFinishedListenerC61661OHx.onPixelCopyFinished(1);
                return;
            }
        }
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(1048576);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache != null && !drawingCache.isRecycled()) {
            bitmap = Bitmap.createBitmap(drawingCache);
        } else {
            bitmap = null;
        }
        view.destroyDrawingCache();
        view.setDrawingCacheEnabled(false);
        if (bitmap != null) {
            z = true;
        }
        interfaceC88471Ynr.invoke(bitmap, Boolean.valueOf(z));
    }

    public static int LIZIZ(int i, int i2, Bitmap bitmap) {
        o.LJIIIZ(bitmap, "<this>");
        if (i < 0) {
            i = 0;
        } else if (i >= bitmap.getWidth()) {
            i = bitmap.getWidth() - 1;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= bitmap.getHeight()) {
            i2 = bitmap.getHeight() - 1;
        }
        OSZ osz = new OSZ(Integer.valueOf(i), Integer.valueOf(i2));
        return bitmap.getPixel(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue());
    }
}
