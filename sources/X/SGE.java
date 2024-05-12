package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;

/* loaded from: classes13.dex */
public final class SGE implements InterfaceC78660Uu0 {
    public final /* synthetic */ SGD LJLIL;
    public final /* synthetic */ LevelListDrawable LJLILLLLZI;
    public final /* synthetic */ SG5 LJLJI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        Drawable drawable;
        if (bitmap == null) {
            return;
        }
        if (this.LJLIL.LIZLLL == null) {
            drawable = new BitmapDrawable(this.LJLIL.LIZ.getResources(), bitmap);
        } else {
            C80623VkZ c80623VkZ = new C80623VkZ(this.LJLIL.LIZ.getResources(), bitmap, null);
            c80623VkZ.LJII(this.LJLIL.LIZLLL.floatValue());
            drawable = c80623VkZ;
        }
        this.LJLILLLLZI.addLevel(1, 1, drawable);
        int height = bitmap.getHeight();
        int i = this.LJLIL.LIZJ;
        if (height > i) {
            height = i;
        }
        this.LJLILLLLZI.setBounds(0, 0, O6R.LJJIIZ((height / bitmap.getHeight()) * bitmap.getWidth()), height);
        this.LJLILLLLZI.setLevel(1);
        SG5 sg5 = this.LJLJI;
        try {
            Method declaredMethod = TextView.class.getDeclaredMethod("nullLayouts", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sg5, new Object[0]);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        this.LJLIL.LIZIZ.requestLayout();
    }

    public SGE(SGD sgd, LevelListDrawable levelListDrawable, SG5 sg5) {
        this.LJLIL = sgd;
        this.LJLILLLLZI = levelListDrawable;
        this.LJLJI = sg5;
    }
}
