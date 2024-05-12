package X;

import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.o;

/* renamed from: X.GvB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43061GvB implements FileFilter {
    public static final C43061GvB LIZ = new C43061GvB();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file == null || !file.exists() || file.getName() == null) {
            return false;
        }
        String name = file.getName();
        o.LJIIIIZZ(name, "pathname.name");
        if (!ujb.o.LJJJLIIL(name, "temp_", false)) {
            return false;
        }
        return true;
    }
}
