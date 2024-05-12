package X;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HUA implements FilenameFilter {
    public static final HUA LIZ = new HUA();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        o.LJIIIIZZ(name, "name");
        return ujb.o.LJJJJ(name, "_frag_v", false);
    }
}
