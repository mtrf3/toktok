package X;

import Y.IDComparatorS30S0000000_2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6oN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171596oN {
    public static final C171596oN LIZ = new C171596oN();
    public static boolean LIZIZ;
    public static List<File> LIZJ;
    public static long LIZLLL;

    public final synchronized void LIZIZ() {
        File file = new File(C152285yK.LIZ);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            o.LJIIIIZZ(listFiles, "file.listFiles()");
            List<File> LLJILJILJ = ORZ.LLJILJILJ(ORY.LJJLIIIJJIZ(new IDComparatorS30S0000000_2(76), listFiles));
            LIZJ = LLJILJILJ;
            Iterator<File> it = LLJILJILJ.iterator();
            while (it.hasNext()) {
                LIZLLL += it.next().length();
            }
            LIZIZ = true;
        } else {
            throw new IllegalStateException("worksapce folder not exist");
        }
    }

    public final synchronized void LIZ(String path) {
        o.LJIIIZ(path, "path");
        if (!LIZIZ) {
            LIZIZ();
        }
        File file = new File(path);
        if (file.exists()) {
            List<File> list = LIZJ;
            if (list != null) {
                ((ArrayList) list).add(file);
                LIZLLL += file.length();
                while (LIZLLL > 1048576000) {
                    List<File> list2 = LIZJ;
                    if (list2 != null) {
                        File file2 = (File) ListProtector.get(list2, 0);
                        long length = file2.length();
                        C152275yJ.LIZ.getClass();
                        C152275yJ.LJIIIIZZ(file2);
                        LIZLLL -= length;
                        List<File> list3 = LIZJ;
                        if (list3 != null) {
                            ListProtector.remove(list3, 0);
                        } else {
                            o.LJIJI("files");
                            throw null;
                        }
                    } else {
                        o.LJIJI("files");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("files");
                throw null;
            }
        } else {
            throw new IllegalStateException("file to add not exist");
        }
    }

    public final synchronized boolean LIZJ(String path) {
        o.LJIIIZ(path, "path");
        if (!LIZIZ) {
            LIZIZ();
        }
        List<File> list = LIZJ;
        if (list != null) {
            for (File file : list) {
                if (o.LJ(file.getPath(), path) && file.exists()) {
                    file.setLastModified(System.currentTimeMillis());
                    List<File> list2 = LIZJ;
                    if (list2 != null) {
                        list2.remove(file);
                        List<File> list3 = LIZJ;
                        if (list3 != null) {
                            list3.add(file);
                            return true;
                        }
                        o.LJIJI("files");
                        throw null;
                    }
                    o.LJIJI("files");
                    throw null;
                }
            }
            return false;
        }
        o.LJIJI("files");
        throw null;
    }
}
