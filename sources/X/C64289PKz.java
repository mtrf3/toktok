package X;

import com.bytedance.crash.nativecrash.NativeImpl;
import java.io.File;

/* renamed from: X.PKz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64289PKz {
    public final PKX LIZ;
    public final C64286PKw LIZIZ;
    public final File LIZJ;

    public C64289PKz(File file) {
        this.LIZJ = file;
        C64286PKw c64286PKw = new C64286PKw(file);
        this.LIZIZ = c64286PKw;
        PKX pkx = new PKX(file);
        this.LIZ = pkx;
        if (c64286PKw.LIZ() && pkx.LJ == null) {
            File file2 = new File(file, "tombstone.txt");
            if (file2.exists()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(file2.getAbsoluteFile());
                LIZ.append(".old");
                file2.renameTo(new File(X1D.LIZIZ(LIZ)));
            }
            NativeImpl.LJIILIIL(file);
            pkx.LIZLLL(new File(file, "tombstone.txt"));
        }
    }
}
