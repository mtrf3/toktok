package X;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9o8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247889o8 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C247889o8 INSTANCE = new C247889o8();

    public C247889o8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        File file;
        Context LJ;
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null && (LJ = abstractC247499nV.LJ()) != null) {
            file = C16880lQ.LLIIIL(LJ);
        } else {
            file = null;
        }
        File file2 = new File(file, "feedbanner");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        String absolutePath = file2.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "file.absolutePath");
        if (s.LJJL(absolutePath, File.separatorChar)) {
            return file2.getAbsolutePath();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(file2.getAbsolutePath());
        LIZ.append(File.separatorChar);
        return X1D.LIZIZ(LIZ);
    }
}
