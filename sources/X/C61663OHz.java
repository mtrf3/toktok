package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Window;

/* renamed from: X.OHz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61663OHz {
    public static void LIZ(Window window, Rect rect, Bitmap bitmap, PixelCopyOnPixelCopyFinishedListenerC61661OHx pixelCopyOnPixelCopyFinishedListenerC61661OHx, Handler handler, C78862UxG c78862UxG) {
        OHW ohw = new OHW(c78862UxG, "PixelCopy_request", new String[]{"screenShot"}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", 0);
        C78929UyL.LIZIZ(ohw, "android/view/PixelCopy", "request(Landroid/view/Window;Landroid/graphics/Rect;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V", C113554cx.LJJL(new OSZ("source", window), new OSZ("srcRect", rect), new OSZ("dest", bitmap), new OSZ("listener", pixelCopyOnPixelCopyFinishedListenerC61661OHx), new OSZ("listenerThread", handler)));
        C39207Fa7.LIZ(ohw, new OI0(window, rect, bitmap, pixelCopyOnPixelCopyFinishedListenerC61661OHx, handler));
    }
}
