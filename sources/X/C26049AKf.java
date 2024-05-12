package X;

import android.view.View;

/* renamed from: X.AKf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26049AKf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, String str) {
        if (view == null) {
            return;
        }
        C26048AKe c26048AKe = new C26048AKe(view);
        AKW akw = ((C26044AKa) c26048AKe.LIZ).LJLIL;
        akw.LJII = true;
        int i = AKV.LIZJ + 1;
        AKV.LIZJ = i;
        if (i >= Integer.MAX_VALUE) {
            AKV.LIZJ = 1;
        }
        akw.LJIIIIZZ = AKV.LIZJ;
        c26048AKe.LJI(str);
        c26048AKe.LJII();
    }
}
