package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: X.3xI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100683xI implements C4CG {
    @Override // X.C4CG
    public final void LIZ(C62846OlW c62846OlW, UrlModel urlModel, String str, int i, int i2, Integer num, Integer num2) {
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJJIIJZLJL = c62846OlW;
        LJII.LJII = i;
        LJII.LJIIIIZZ = i2;
        LJII.LJIJI = Bitmap.Config.ARGB_8888;
        if (num != null) {
            LJII.LJIIJJI = num.intValue();
        }
        if (num2 != null) {
            LJII.LJIILL = num2.intValue();
        }
        LJII.LIZLLL = true;
        LJII.LJ = false;
        LJII.LJFF = 1;
        LJII.LIZLLL(new VA7(str, false, false));
    }

    @Override // X.C4CG
    public final void LIZIZ(C62846OlW c62846OlW, UrlModel urlModel, String str, int i, int i2, Integer num, Integer num2) {
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJJIIJZLJL = c62846OlW;
        LJII.LJII = i;
        LJII.LJIIIIZZ = i2;
        if (num != null) {
            LJII.LJIIJJI = num.intValue();
        }
        if (num2 != null) {
            LJII.LJIILL = num2.intValue();
        }
        C43659HBn.LJIJ(LJII, str, false, null, 6);
    }
}
