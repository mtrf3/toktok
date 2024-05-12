package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K5U extends K6D {
    public EnumC27399Ap9 LIZ = EnumC27399Ap9.PRIMARY;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public View.OnClickListener LJFF;
    public String LJI;
    public TuxTextView LJII;
    public K5T LJIIIIZZ;

    public final void LIZIZ(EnumC27399Ap9 variant) {
        K5T k5t;
        o.LJIIIZ(variant, "variant");
        this.LIZ = variant;
        TuxTextView tuxTextView = this.LJII;
        if (tuxTextView != null && (k5t = this.LJIIIIZZ) != null) {
            if (variant == EnumC27399Ap9.PRIMARY) {
                tuxTextView.setTextColor(k5t.getPrimaryColor$tux_theme_release());
            } else {
                tuxTextView.setTextColor(k5t.getSecondaryColor$tux_theme_release());
            }
        }
    }

    public final void LIZ(int i, int i2, int i3, int i4) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        TuxTextView tuxTextView = this.LJII;
        if (tuxTextView != null) {
            C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(i3), null, Integer.valueOf(i4), null, 26);
            C26338AVi.LJI(tuxTextView, Integer.valueOf(i), null, Integer.valueOf(i2), null, false, 26);
        }
    }
}
