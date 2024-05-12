package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class XG0 implements V1E {
    public final List<XG1> LIZ = new ArrayList();

    @Override // X.V1E
    public final void LIZ(File file) {
    }

    @Override // X.V1E
    public final void LIZJ(File file) {
    }

    @Override // X.V1E
    public final void LIZIZ(File file) {
        XG1 xg1 = new XG1();
        xg1.LIZ = file.lastModified();
        xg1.LIZIZ = file.length();
        xg1.LIZJ = file.getAbsolutePath();
        ((ArrayList) this.LIZ).add(xg1);
    }
}
