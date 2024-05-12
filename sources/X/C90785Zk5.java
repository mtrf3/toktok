package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.Zk5, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90785Zk5 implements InterfaceC90422ZeE {
    public final /* synthetic */ C90788Zk8 LIZ;

    public C90785Zk5(C90788Zk8 c90788Zk8) {
        this.LIZ = c90788Zk8;
    }

    @Override // X.InterfaceC90422ZeE
    public final void LIZ(Bitmap bitmap) {
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = width;
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (i - height) / 2;
            RectF rectF = new RectF(0.0f, f2, f, height + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        this.LIZ.LJIIIIZZ(0, bitmap2);
    }
}
