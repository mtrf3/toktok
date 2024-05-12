package X;

import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Gir, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42297Gir implements FileFilter {
    public final /* synthetic */ String LIZ;

    public C42297Gir(String str) {
        this.LIZ = str;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        String name = file.getName();
        o.LJIIIIZZ(name, "it.name");
        return s.LJJJLZIJ(name, this.LIZ, false);
    }
}
