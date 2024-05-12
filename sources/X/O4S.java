package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes11.dex */
public final class O4S implements InterfaceC61315O4p {
    public volatile boolean LIZ;
    public final /* synthetic */ O4O LIZIZ;
    public final /* synthetic */ InterfaceC61315O4p LIZJ;

    @Override // X.InterfaceC61315O4p
    public final InputStream LIZ() {
        FileInputStream fileInputStream = null;
        try {
            if (this.LIZ && !this.LIZJ.LIZIZ()) {
                File file = this.LIZIZ.LJLJLLL;
                if (file == null) {
                    return null;
                }
                return new FileInputStream(file);
            }
            this.LIZ = true;
            InputStream LIZ = this.LIZJ.LIZ();
            if (LIZ == null) {
                File file2 = this.LIZIZ.LJLJLLL;
                if (file2 != null) {
                    fileInputStream = new FileInputStream(file2);
                }
                return fileInputStream;
            }
            return LIZ;
        } catch (Throwable th) {
            C39930Flm.LIZJ("ForestBuffer", "provide file input stream failed", th, true);
            return null;
        }
    }

    @Override // X.InterfaceC61315O4p
    public final boolean LIZIZ() {
        if (this.LIZJ.LIZIZ() || this.LIZIZ.LJIJJ() != null) {
            return true;
        }
        return false;
    }

    public O4S(O4O o4o, InterfaceC61315O4p interfaceC61315O4p) {
        this.LIZIZ = o4o;
        this.LIZJ = interfaceC61315O4p;
    }
}
