package X;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

/* loaded from: classes29.dex */
public class ZX6 {
    public final BitmapDrawable LIZ;
    public final Rect LIZJ;
    public Interpolator LIZLLL;
    public long LJ;
    public final Rect LJFF;
    public int LJI;
    public long LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public ZX5 LJIIL;
    public float LIZIZ = 1.0f;
    public float LJII = 1.0f;
    public float LJIIIIZZ = 1.0f;

    public ZX6(BitmapDrawable bitmapDrawable, Rect rect) {
        this.LIZ = bitmapDrawable;
        this.LJFF = rect;
        Rect rect2 = new Rect(rect);
        this.LIZJ = rect2;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.LIZIZ * 255.0f));
            bitmapDrawable.setBounds(rect2);
        }
    }
}
