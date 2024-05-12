package X;

import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Gvn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43099Gvn implements InterfaceC39534FfO {
    public final java.util.Set<String> LIZ;
    public final java.util.Set<String> LIZIZ;
    public long LIZJ;

    @Override // X.InterfaceC39534FfO
    public final void LIZ(File file, boolean z) {
        o.LJIIIZ(file, "file");
        if (!file.isFile()) {
            return;
        }
        int i = 0;
        for (String str : this.LIZ) {
            if (i >= 0) {
                String path = file.getPath();
                o.LJIIIIZZ(path, "file.path");
                if (ujb.o.LJJJLIIL(path, str, false)) {
                    return;
                } else {
                    i++;
                }
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        int i2 = 0;
        for (String str2 : this.LIZIZ) {
            if (i2 >= 0) {
                String path2 = file.getPath();
                o.LJIIIIZZ(path2, "file.path");
                if (s.LJJJLZIJ(path2, str2, false)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        this.LIZJ = file.length() + this.LIZJ;
    }

    public C43099Gvn(java.util.Set prefixAllowList, java.util.Set inclusionAllowList, int i) {
        prefixAllowList = (i & 1) != 0 ? OQY.INSTANCE : prefixAllowList;
        inclusionAllowList = (i & 2) != 0 ? OQY.INSTANCE : inclusionAllowList;
        o.LJIIIZ(prefixAllowList, "prefixAllowList");
        o.LJIIIZ(inclusionAllowList, "inclusionAllowList");
        this.LIZ = prefixAllowList;
        this.LIZIZ = inclusionAllowList;
    }
}
