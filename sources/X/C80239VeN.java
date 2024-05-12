package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VeN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80239VeN extends C011902x {
    public Integer LLILIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        V1B.LJLLILLLL(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        V1B.LJLJL(this, f);
    }

    @Override // X.C011902x
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.LLILIL != null) {
            drawable = C07840Sm.LJFF(drawable);
            C07820Sk.LJI(drawable, this.LLILIL.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.LLILIL = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public C80239VeN(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, R.attr.bjy, R.style.a2a), attributeSet, 0);
        Context context2 = getContext();
        TypedArray LIZLLL = C80244VeS.LIZLLL(context2, attributeSet, new int[]{R.attr.b1t}, R.attr.bjy, R.style.a2a, new int[0]);
        if (LIZLLL.hasValue(0)) {
            setNavigationIconTint(LIZLLL.getColor(0, -1));
        }
        LIZLLL.recycle();
        Drawable background = getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        C80418VhG c80418VhG = new C80418VhG();
        c80418VhG.LJIIJJI(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
        c80418VhG.LJIIIIZZ(context2);
        c80418VhG.LJIIJ(C16360ka.LJIIIIZZ(this));
        C16300kU.LJIILLIIL(this, c80418VhG);
    }
}
