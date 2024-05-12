package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class MN6 extends AbstractC65781Prl implements InterfaceC65784Pro<LayerDrawable> {
    public static final MN6 LJLIL = new MN6();

    public MN6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LayerDrawable invoke() {
        Context LIZIZ = EF7.LIZIZ();
        C2068389v c2068389v = new C2068389v();
        int i = MN5.LIZIZ;
        int i2 = i - (MN5.LIZ * 2);
        c2068389v.LIZIZ = i2;
        c2068389v.LIZJ = i2;
        c2068389v.LIZ = R.raw.icon_bell_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        SY9 LIZ = c2068389v.LIZ(LIZIZ);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LJII = i;
        c110614Vt.LJI = i;
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eg);
        c110614Vt.LIZJ = Float.valueOf(Float.MAX_VALUE);
        return C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(LIZIZ));
    }
}
