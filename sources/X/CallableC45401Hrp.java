package X;

import Y.ACallableS55S0300000_6;
import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Hrp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC45401Hrp<V> implements Callable {
    public final /* synthetic */ Bitmap LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C45411Hrz LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public CallableC45401Hrp(Bitmap bitmap, int i, C45411Hrz c45411Hrz, boolean z) {
        this.LJLIL = bitmap;
        this.LJLILLLLZI = i;
        this.LJLJI = c45411Hrz;
        this.LJLJJI = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bitmap.CompressFormat compressFormat;
        String str;
        Context context;
        if (this.LJLIL == null) {
            return new C45405Hrt(0, "bitmap is null.", "");
        }
        int i = this.LJLILLLLZI;
        if (i != 1) {
            if (i != 2) {
                compressFormat = Bitmap.CompressFormat.JPEG;
                str = ".jpg";
            } else {
                compressFormat = Bitmap.CompressFormat.WEBP;
                str = ".webp";
            }
        } else {
            compressFormat = Bitmap.CompressFormat.PNG;
            str = ".png";
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLJI.LJLIL;
        if (interfaceC38263Ezz == null || (context = interfaceC38263Ezz.getContext()) == null) {
            return new C45405Hrt(0, "context is null.", "");
        }
        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LLIIJLIL.getAbsolutePath());
        String LJFF = JBR.LJFF(LIZ, File.separator, "Camera", LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        File file = new File(LJFF, C72545SdZ.LIZLLL(LIZ2, "share_", str, LIZ2));
        C37246Eja c37246Eja = C37247Ejb.LIZIZ;
        String absolutePath = file.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "file.absolutePath");
        c37246Eja.getClass();
        C37246Eja.LIZJ(absolutePath);
        boolean LIZ3 = C42300Giu.LIZ(this.LJLIL, file, 100, compressFormat);
        this.LJLIL.recycle();
        if (this.LJLJJI) {
            C45411Hrz c45411Hrz = this.LJLJI;
            Context LLLLL = C16880lQ.LLLLL(context);
            o.LJIIIIZZ(LLLLL, "cxt.applicationContext");
            c45411Hrz.getClass();
            android.net.Uri LJIIIIZZ = C268613q.LJIIIIZZ(LLLLL, file.getName(), null);
            if (LJIIIIZZ == null) {
                LJIIIIZZ = C268613q.LIZJ(LLLLL, file.getName());
            }
            Context LIZIZ = EF7.LIZIZ();
            if (LJIIIIZZ != null) {
                C10K.LIZIZ(new ACallableS55S0300000_6(LIZIZ, LJIIIIZZ, file, 2), C10K.LJI, null);
            }
        }
        if (LIZ3) {
            String absolutePath2 = file.getAbsolutePath();
            o.LJIIIIZZ(absolutePath2, "file.absolutePath");
            return new C45405Hrt(1, "success", absolutePath2);
        }
        return new C45405Hrt(0, "save image bitmap failed.", "");
    }
}
