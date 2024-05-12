package X;

import android.graphics.drawable.GradientDrawable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.49U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49U extends AbstractC65781Prl implements InterfaceC65784Pro<GradientDrawable> {
    public static final C49U LJLIL = new C49U();

    public C49U() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final GradientDrawable invoke() {
        C48E c48e;
        GradientDrawable gradientDrawable = new GradientDrawable();
        C4AH c4ah = new C4AH(C1DF.LJIIIIZZ(20), C1DF.LJIIIIZZ(20), C1DF.LJIIIIZZ(20), C1DF.LJIIIIZZ(20));
        Integer LJI = C79045V0n.LJI(R.attr.cv, EF7.LIZIZ());
        if (LJI != null) {
            c48e = new C48E(LJI.intValue());
        } else {
            c48e = null;
        }
        C77413UZt.LJFF(gradientDrawable, new C49V(c4ah, null, c48e, 2));
        return gradientDrawable;
    }
}
