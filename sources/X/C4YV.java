package X;

import android.app.Activity;
import android.graphics.drawable.LayerDrawable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4YV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YV extends AbstractC65781Prl implements InterfaceC65784Pro<LayerDrawable> {
    public static final C4YV LJLIL = new C4YV();

    public C4YV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LayerDrawable invoke() {
        Activity LIZIZ = FKM.LIZIZ();
        if (LIZIZ != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_bag_fill;
            c2068389v.LIZIZ = C7MY.LIZIZ(32);
            c2068389v.LIZJ = C7MY.LIZIZ(32);
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            SY9 LIZ = c2068389v.LIZ(LIZIZ);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = Integer.valueOf(LIZIZ.getResources().getColor(R.color.m2));
            c110614Vt.LIZJ = C61328O5c.LIZJ(28);
            c110614Vt.LJII = C7MY.LIZIZ(56);
            c110614Vt.LJI = C7MY.LIZIZ(56);
            return C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(LIZIZ));
        }
        return null;
    }
}
