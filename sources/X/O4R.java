package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes11.dex */
public final class O4R implements InterfaceC61315O4p {
    public final /* synthetic */ File LIZ;

    @Override // X.InterfaceC61315O4p
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC61315O4p
    public final InputStream LIZ() {
        try {
            return new FileInputStream(this.LIZ);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error occurs when getting input stream from file: ");
            LIZ.append(this.LIZ.getPath());
            C39930Flm.LIZJ("ForestBuffer", X1D.LIZIZ(LIZ), e, true);
            return null;
        }
    }

    public O4R(File file) {
        this.LIZ = file;
    }
}
