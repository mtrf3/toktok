package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PO8 implements AnonymousClass453, C0GP {
    public final String LJLIL;

    public /* synthetic */ PO8(String str) {
        this.LJLIL = str;
    }

    @Override // X.AnonymousClass453
    public void LIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        C34B.LIZJ(this.LJLIL, msg);
    }

    @Override // X.AnonymousClass453
    public void LIZIZ(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C34B.LJ(this.LJLIL, throwable);
    }

    @Override // X.C0GP
    public Bitmap LJIILLIIL(C04750Gp c04750Gp) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(File.separator);
        LIZ.append(c04750Gp.LJ);
        LIZ.append(c04750Gp.LIZLLL);
        File file = new File(C198227qE.LIZIZ(X1D.LIZIZ(LIZ)));
        if (!file.exists()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2;
        options.inScaled = true;
        options.inDensity = 160;
        return C06310Mp.LJFF(BitmapFactory.decodeStream(new FileInputStream(file), null, options), c04750Gp.LIZ, c04750Gp.LIZIZ, c04750Gp);
    }

    @Override // X.AnonymousClass453
    public void d(String msg) {
        o.LJIIIZ(msg, "msg");
        C34B.LIZIZ(this.LJLIL, msg);
    }

    @Override // X.AnonymousClass453
    public void i(String msg) {
        o.LJIIIZ(msg, "msg");
        C34B.LJI(this.LJLIL, msg);
    }

    @Override // X.AnonymousClass453
    public void e(String str, Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C34B.LIZLLL(this.LJLIL, str, throwable);
    }
}
