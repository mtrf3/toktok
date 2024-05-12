package X;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.IwJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48227IwJ implements FilenameFilter {
    public static final C48227IwJ LIZ = new C48227IwJ();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String s) {
        o.LJFF(file, "file");
        if (!file.isDirectory()) {
            return false;
        }
        o.LJFF(s, "s");
        if (!s.LJJJLZIJ(s, "kgsl", false)) {
            return false;
        }
        return true;
    }
}
