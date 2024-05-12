package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Gvm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43098Gvm implements InterfaceC39534FfO {
    public final C43068GvI LIZ;
    public final C43068GvI LIZIZ;
    public boolean LIZJ;
    public final boolean LIZLLL;
    public final List<File> LJ;

    public final void LIZIZ() {
        for (File file : this.LJ) {
            C16880lQ.LLLZZIL(file);
            C60903NvH.LJIIJJI().LJJIJL().getMonitor().LJFF(file);
        }
        ((ArrayList) this.LJ).clear();
    }

    public C43098Gvm(java.util.Set<String> prefixAllowList, java.util.Set<String> inclusionAllowList) {
        o.LJIIIZ(prefixAllowList, "prefixAllowList");
        o.LJIIIZ(inclusionAllowList, "inclusionAllowList");
        C43068GvI c43068GvI = new C43068GvI(C43104Gvs.LJLIL);
        c43068GvI.addAll(prefixAllowList);
        this.LIZ = c43068GvI;
        C43068GvI c43068GvI2 = new C43068GvI(C43103Gvr.LJLIL);
        c43068GvI2.addAll(inclusionAllowList);
        this.LIZIZ = c43068GvI2;
        this.LIZLLL = true;
        this.LJ = new ArrayList();
    }

    @Override // X.InterfaceC39534FfO
    public final void LIZ(File file, boolean z) {
        o.LJIIIZ(file, "file");
        if (this.LIZLLL && z && file.isDirectory()) {
            return;
        }
        if (!this.LIZJ && file.isDirectory()) {
            return;
        }
        if (file.isFile()) {
            Iterator<T> it = this.LIZ.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i >= 0) {
                        String path = file.getPath();
                        o.LJIIIIZZ(path, "file.path");
                        if (ujb.o.LJJJLIIL(path, (String) next, false)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                } else {
                    Iterator<T> it2 = this.LIZIZ.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (i2 >= 0) {
                            String path2 = file.getPath();
                            o.LJIIIIZZ(path2, "file.path");
                            if (!s.LJJJLZIJ(path2, (String) next2, false)) {
                                i2++;
                            }
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    ListProtector.add(this.LJ, 0, file);
                    return;
                }
            }
        }
        if (file.isDirectory()) {
            Iterator<T> it3 = this.LIZ.iterator();
            int i3 = 0;
            while (it3.hasNext()) {
                Object next3 = it3.next();
                if (i3 >= 0) {
                    String path3 = file.getPath();
                    o.LJIIIIZZ(path3, "file.path");
                    if (ujb.o.LJJJLIIL((String) next3, path3, false)) {
                        return;
                    } else {
                        i3++;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            Iterator<T> it4 = this.LIZ.iterator();
            int i4 = 0;
            while (it4.hasNext()) {
                Object next4 = it4.next();
                if (i4 >= 0) {
                    String path4 = file.getPath();
                    o.LJIIIIZZ(path4, "file.path");
                    if (ujb.o.LJJJLIIL(path4, (String) next4, false)) {
                        return;
                    } else {
                        i4++;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            Iterator<T> it5 = this.LIZIZ.iterator();
            int i5 = 0;
            while (it5.hasNext()) {
                Object next5 = it5.next();
                if (i5 >= 0) {
                    String path5 = file.getPath();
                    o.LJIIIIZZ(path5, "file.path");
                    if (s.LJJJLZIJ(path5, (String) next5, false)) {
                        return;
                    } else {
                        i5++;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            ListProtector.add(this.LJ, 0, file);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C43098Gvm(java.util.Set r2, int r3) {
        /*
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto L6
            X.OQY r2 = X.OQY.INSTANCE
        L6:
            r0 = r3 & 2
            if (r0 == 0) goto L10
            X.OQY r0 = X.OQY.INSTANCE
        Lc:
            r1.<init>(r2, r0)
            return
        L10:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43098Gvm.<init>(java.util.Set, int):void");
    }
}
