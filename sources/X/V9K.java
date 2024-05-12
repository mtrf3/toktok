package X;

import Y.ARunnableS49S0100000_13;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.lynx.tasm.LynxEnv;

/* loaded from: classes14.dex */
public final class V9K extends C81250Vug<V92> {
    public static final Drawable LJIIIZ = new ColorDrawable();
    public final C81392Vwy<W5A> LJI;
    public final Handler LJII;
    public final C80627Vkd LJIIIIZZ;

    @Override // X.C81250Vug
    public final void LJ() {
    }

    @Override // X.C81250Vug
    public final void LJFF() {
        this.LJIIIIZZ.LJIILIIL(LJIIIZ);
        this.LJII.post(new ARunnableS49S0100000_13(this, 78));
    }

    @Override // X.C81250Vug
    public final Drawable LIZJ() {
        return this.LJIIIIZZ;
    }

    public V9K(C81392Vwy<W5A> c81392Vwy) {
        super(null);
        this.LJII = new Handler(C16880lQ.LLJJJJ());
        this.LJI = c81392Vwy;
        this.LJIIIIZZ = new C80627Vkd(new BitmapDrawable(LynxEnv.LJIIIZ().LIZ.getResources(), ((W5B) c81392Vwy.LJI()).getUnderlyingBitmap()));
    }
}
