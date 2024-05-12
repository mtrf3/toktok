package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K5S extends K6D {
    public EnumC27399Ap9 LIZ = EnumC27399Ap9.PRIMARY;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public View.OnClickListener LJFF;
    public int LJI;
    public TuxIconView LJII;
    public K5T LJIIIIZZ;

    public final void LIZ(int i) {
        this.LJI = i;
        TuxIconView tuxIconView = this.LJII;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
        }
    }

    public final void LIZJ(EnumC27399Ap9 variant) {
        K5T k5t;
        o.LJIIIZ(variant, "variant");
        this.LIZ = variant;
        TuxIconView tuxIconView = this.LJII;
        if (tuxIconView != null && (k5t = this.LJIIIIZZ) != null) {
            if (variant == EnumC27399Ap9.PRIMARY) {
                tuxIconView.setTintColor(k5t.getPrimaryColor$tux_theme_release());
            } else {
                tuxIconView.setTintColor(k5t.getSecondaryColor$tux_theme_release());
            }
        }
    }

    public final void LIZIZ(int i, int i2, int i3, int i4) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        TuxIconView tuxIconView = this.LJII;
        if (tuxIconView != null) {
            C26338AVi.LJIIIZ(tuxIconView, Integer.valueOf(i3), null, Integer.valueOf(i4), null, 26);
            C26338AVi.LJI(tuxIconView, Integer.valueOf(i), null, Integer.valueOf(i2), null, false, 26);
        }
    }
}
