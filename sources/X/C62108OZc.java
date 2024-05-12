package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OZc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62108OZc extends C62111OZf {
    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "general_qr_code";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return C1DD.LIZLLL(R.string.exq, "AppContextManager.getApp…String(R.string.download)");
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        if (context != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_2pt_arrow_to_bottom;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            c2068389v.LIZIZ = C7MY.LIZIZ(32);
            c2068389v.LIZJ = C7MY.LIZIZ(32);
            SY9 LIZ = c2068389v.LIZ(context);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LJII = C7MY.LIZIZ(48);
            c110614Vt.LJI = C7MY.LIZIZ(48);
            c110614Vt.LIZJ = C61328O5c.LIZJ(24);
            return C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context));
        }
        return null;
    }
}
