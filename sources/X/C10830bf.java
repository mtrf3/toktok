package X;

import defpackage.q;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.0bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10830bf {
    public final File LIZ;
    public final String LIZIZ;

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[component=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", canonicalPath=");
        File file = this.LIZ;
        String str2 = null;
        if (file != null) {
            str = file.getCanonicalPath();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", absolutePath=");
        File file2 = this.LIZ;
        if (file2 != null) {
            str2 = file2.getAbsolutePath();
        }
        return q.LIZIZ(LIZ, str2, ']', LIZ);
    }

    public C10830bf(String str) {
        File file;
        this.LIZIZ = str;
        if (str != null) {
            file = new File(str).getAbsoluteFile();
        } else {
            file = null;
        }
        this.LIZ = file;
    }

    public final C10830bf LIZ(String component) {
        o.LJIIJ(component, "component");
        if (this.LIZ == null) {
            return null;
        }
        File absoluteFile = new File(this.LIZ.getAbsolutePath(), component).getAbsoluteFile();
        o.LJFF(absoluteFile, "File(file.absolutePath, component).absoluteFile");
        return new C10830bf(absoluteFile.getAbsolutePath());
    }
}
