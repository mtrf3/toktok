package X;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HU9 implements FilenameFilter {
    public static final HU9 LIZ = new HU9();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        o.LJIIIIZZ(name, "name");
        return ujb.o.LJJJJ(name, "_frag_a", false);
    }
}
