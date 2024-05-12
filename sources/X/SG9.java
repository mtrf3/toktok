package X;

import Y.ARunnableS15S0201000_12;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;

/* loaded from: classes13.dex */
public final class SG9 implements InterfaceC78660Uu0 {
    public final /* synthetic */ SG4 LJLIL;
    public final /* synthetic */ SGA LJLILLLLZI;
    public final /* synthetic */ LevelListDrawable LJLJI;

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
        if (bitmap == null) {
            return;
        }
        this.LJLIL.LLD++;
        this.LJLJI.addLevel(1, 1, new BitmapDrawable(this.LJLILLLLZI.LIZ.getResources(), bitmap));
        int i = this.LJLILLLLZI.LIZLLL;
        if (i <= 0) {
            i = bitmap.getHeight();
        }
        int i2 = this.LJLILLLLZI.LIZJ;
        if (i > i2) {
            i = i2;
        }
        this.LJLJI.setBounds(0, 0, O6R.LJJIIZ((i / bitmap.getHeight()) * bitmap.getWidth()), i);
        this.LJLJI.setLevel(1);
        SG4 sg4 = this.LJLIL;
        try {
            Method declaredMethod = TextView.class.getDeclaredMethod("nullLayouts", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sg4, new Object[0]);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        SG4 sg42 = this.LJLIL;
        if (sg42.LLD == sg42.LL) {
            CharSequence text = this.LJLILLLLZI.LIZIZ.getText();
            int i3 = this.LJLILLLLZI.LJ;
            if (sg42.LLFFF) {
                sg42.setEllipsize(null);
                sg42.setMovementMethod(LinkMovementMethod.getInstance());
                sg42.post(new ARunnableS15S0201000_12(i3, sg42, text, 1));
            }
        }
        this.LJLILLLLZI.LIZIZ.requestLayout();
    }

    public SG9(SG4 sg4, SGA sga, LevelListDrawable levelListDrawable) {
        this.LJLIL = sg4;
        this.LJLILLLLZI = sga;
        this.LJLJI = levelListDrawable;
    }
}
