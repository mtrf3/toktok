package X;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.o;

/* renamed from: X.FgM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39594FgM implements FilenameFilter {
    public static final C39594FgM LIZ = new C39594FgM();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        o.LJFF(name, "name");
        return ujb.o.LJJJJ(name, ".hprof", false);
    }
}
