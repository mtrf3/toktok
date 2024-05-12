package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public final class V9X extends VR1 implements V9C, Drawable.Callback {
    public final V9H LJLILLLLZI;
    public Drawable LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public final Context LJLJLJ;
    public WeakReference<LynxBaseUI> LJLJLLL;

    @Override // X.VR1
    public final boolean LIZJ() {
        if (this.LJLJI != null) {
            return true;
        }
        return false;
    }

    @Override // X.VR1
    public final void LIZLLL() {
        if (!this.LJLJJI) {
            this.LJLILLLLZI.LIZJ();
            this.LJLJJI = true;
            this.LJLILLLLZI.LJII = true;
        }
    }

    @Override // X.VR1
    public final void LJ() {
        this.LJLILLLLZI.LIZLLL();
        this.LJLJJI = false;
    }

    @Override // X.VR1
    public final int LIZ() {
        return this.LJLJJLL;
    }

    @Override // X.VR1
    public final int LIZIZ() {
        return this.LJLJJL;
    }

    @Override // X.VR1
    public final void LJI(Bitmap.Config config) {
        C79285V9t c79285V9t = this.LJLILLLLZI.LJJIIJ;
        c79285V9t.LJIIIZ = config;
        c79285V9t.LJIJI.LIZJ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // X.V9C
    public final void onCloseableRefReady(C81392Vwy<?> c81392Vwy) {
        Bitmap bitmap;
        if (c81392Vwy != null && c81392Vwy.LJIIJ()) {
            Object LJI = c81392Vwy.LJI();
            if (LJI instanceof W5B) {
                bitmap = ((W5B) LJI).getUnderlyingBitmap();
            } else if (!(LJI instanceof Bitmap)) {
                return;
            } else {
                bitmap = (Bitmap) LJI;
            }
            if (bitmap != null) {
                this.LJLJL = true;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.LJLJLJ.getResources(), bitmap.copy(bitmap.getConfig(), true));
                this.LJLJI = bitmapDrawable;
                bitmapDrawable.setBounds(getBounds());
                this.LJLJI.setCallback(this);
                this.LJLJJL = bitmap.getWidth();
                this.LJLJJLL = bitmap.getHeight();
                invalidateSelf();
            }
        }
    }

    @Override // X.V9C
    public final void onDrawableReady(Drawable drawable) {
        if (!this.LJLJL) {
            this.LJLJI = drawable;
            drawable.setBounds(getBounds());
            this.LJLJI.setCallback(this);
            invalidateSelf();
        }
    }

    public V9X(VNU vnu, String str) {
        this.LJLJLJ = vnu;
        C81705W4v LIZJ = W5I.LIZJ();
        if (vnu instanceof VNU) {
            vnu.getClass();
        }
        V9H v9h = new V9H(vnu, LIZJ, this, true);
        this.LJLILLLLZI = v9h;
        EnumC78943UyZ enumC78943UyZ = EnumC78943UyZ.AUTO;
        C79285V9t c79285V9t = v9h.LJJIIJ;
        c79285V9t.LJIIJ = enumC78943UyZ;
        c79285V9t.LJIJI.LIZJ();
        v9h.LJIILL = new C79706VPy(this, vnu, str);
        v9h.LJJIIJ.LJIIJ(str, true);
    }

    @Override // X.VR1
    public final void LJFF(int i, int i2) {
        if (!this.LJLJJI) {
            this.LJLILLLLZI.LIZJ();
            this.LJLJJI = true;
            this.LJLILLLLZI.LJII = true;
        }
        this.LJLILLLLZI.LIZIZ(i, i2, 0, 0, 0, 0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C79411VEp.LIZIZ(runnable, drawable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C79411VEp.LIZLLL(runnable, drawable, j);
    }
}
