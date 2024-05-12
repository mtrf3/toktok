package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;

/* loaded from: classes12.dex */
public final class PO6 implements C0GP {
    public final /* synthetic */ String LJLIL;

    public PO6(String str) {
        this.LJLIL = str;
    }

    @Override // X.C0GP
    public final Bitmap LJIILLIIL(C04750Gp c04750Gp) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = KL2.LJIIIIZZ(EF7.LIZIZ());
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLIL);
            LIZ.append(File.separator);
            LIZ.append(c04750Gp.LIZLLL);
            return BitmapFactory.decodeFile(X1D.LIZIZ(LIZ), options);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
