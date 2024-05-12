package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public class OR7 extends C34T {
    public static final boolean LLLIIL(File file) {
        o.LJIIIZ(file, "<this>");
        Iterator<File> it = C34T.LLLIIII(file, EnumC67182kM.BOTTOM_UP).iterator();
        while (true) {
            boolean z = true;
            while (it.hasNext()) {
                File next = it.next();
                if (C16880lQ.LLLZZIL(next) || !next.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static final String LLLIILIL(File file) {
        String name = file.getName();
        o.LJIIIIZZ(name, "name");
        return s.LJLLILLLL('.', name, "");
    }

    public static final String LLLIL(File file) {
        String name = file.getName();
        o.LJIIIIZZ(name, "name");
        return s.LJLZ(name, ".", name);
    }

    public static final OR8 LLLILZ(OR8 or8) {
        File file = or8.LJLIL;
        List<File> list = or8.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (!o.LJ(name, ".")) {
                if (o.LJ(name, "..")) {
                    if (!arrayList.isEmpty() && !o.LJ(((File) ORZ.LLFF(arrayList)).getName(), "..")) {
                        ListProtector.remove(arrayList, arrayList.size() - 1);
                    } else {
                        arrayList.add(file2);
                    }
                } else {
                    arrayList.add(file2);
                }
            }
        }
        return new OR8(file, arrayList);
    }

    public static final File LLLILZJ(File file, String relative) {
        File file2;
        o.LJIIIZ(file, "<this>");
        o.LJIIIZ(relative, "relative");
        File file3 = new File(relative);
        String path = file3.getPath();
        o.LJIIIIZZ(path, "path");
        if (C63081OpJ.LJJJJIZL(path) > 0) {
            return file3;
        }
        String file4 = file.toString();
        o.LJIIIIZZ(file4, "this.toString()");
        if (file4.length() == 0 || s.LJJL(file4, File.separatorChar)) {
            file2 = new File(C0F0.LIZJ(file4, file3));
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(file4);
            LIZ.append(File.separatorChar);
            LIZ.append(file3);
            file2 = new File(X1D.LIZIZ(LIZ));
        }
        return file2;
    }

    public static final boolean LLLILZLLLI(File file, String other) {
        o.LJIIIZ(other, "other");
        File file2 = new File(other);
        OR8 LLJZ = C63081OpJ.LLJZ(file);
        OR8 LLJZ2 = C63081OpJ.LLJZ(file2);
        if (!o.LJ(LLJZ.LJLIL, LLJZ2.LJLIL) || LLJZ.LJLILLLLZI.size() < LLJZ2.LJLILLLLZI.size()) {
            return false;
        }
        return LLJZ.LJLILLLLZI.subList(0, LLJZ2.LJLILLLLZI.size()).equals(LLJZ2.LJLILLLLZI);
    }

    public static final String LLLIZZ(File file, File file2) {
        OR8 LLLILZ = LLLILZ(C63081OpJ.LLJZ(file));
        OR8 LLLILZ2 = LLLILZ(C63081OpJ.LLJZ(file2));
        if (o.LJ(LLLILZ.LJLIL, LLLILZ2.LJLIL)) {
            int size = LLLILZ2.LJLILLLLZI.size();
            int size2 = LLLILZ.LJLILLLLZI.size();
            int min = Math.min(size2, size);
            int i = 0;
            while (i < min && o.LJ(ListProtector.get(LLLILZ.LJLILLLLZI, i), ListProtector.get(LLLILZ2.LJLILLLLZI, i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = size - 1;
            if (i <= i2) {
                while (!o.LJ(((File) ListProtector.get(LLLILZ2.LJLILLLLZI, i2)).getName(), "..")) {
                    sb.append("..");
                    if (i2 != i) {
                        sb.append(File.separatorChar);
                    }
                    if (i2 != i) {
                        i2--;
                    }
                }
            }
            if (i < size2) {
                if (i < size) {
                    sb.append(File.separatorChar);
                }
                List LJLJJLL = ORZ.LJLJJLL(LLLILZ.LJLILLLLZI, i);
                String separator = File.separator;
                o.LJIIIIZZ(separator, "separator");
                ORZ.LL(LJLJJLL, sb, separator, null, 124);
            }
            String sb2 = sb.toString();
            if (sb2 != null) {
                return sb2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("this and base files have different roots: ");
        LIZ.append(file);
        LIZ.append(" and ");
        LIZ.append(file2);
        LIZ.append('.');
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final boolean LLLIIIIL(File file, File file2, boolean z, InterfaceC88471Ynr<? super File, ? super IOException, ? extends OR9> onError) {
        o.LJIIIZ(onError, "onError");
        if (!file.exists()) {
            if (onError.invoke(file, new C48173IvR(file, null, "The source file doesn't exist.", 2, null)) != OR9.TERMINATE) {
                return true;
            }
            return false;
        }
        try {
            OR4 LLLIIII = C34T.LLLIIII(file, EnumC67182kM.TOP_DOWN);
            OR0 or0 = new OR0(new OR4(LLLIIII.LIZ, LLLIIII.LIZIZ, null, null, new AqS192S0100000_10(onError, 31), Integer.MAX_VALUE));
            while (or0.hasNext()) {
                File next = or0.next();
                if (!next.exists()) {
                    if (onError.invoke(next, new C48173IvR(next, null, "The source file doesn't exist.", 2, null)) == OR9.TERMINATE) {
                        return false;
                    }
                } else {
                    File file3 = new File(file2, LLLIZZ(next, file));
                    if (file3.exists() && (!next.isDirectory() || !file3.isDirectory())) {
                        if (z) {
                            if (file3.isDirectory()) {
                                if (!LLLIIL(file3)) {
                                }
                            } else if (!C16880lQ.LLLZZIL(file3)) {
                            }
                        }
                        if (onError.invoke(file3, new C48172IvQ(next, file3, "The destination file already exists.")) == OR9.TERMINATE) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        LLLIIIL(next, file3, z, 4);
                        if (file3.length() != next.length() && onError.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OR9.TERMINATE) {
                            return false;
                        }
                    }
                }
            }
            return true;
        } catch (C48171IvP unused) {
            return false;
        }
    }

    public static void LLLIIIL(File file, File file2, boolean z, int i) {
        int i2 = 0;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            i2 = FileUtils.BUFFER_SIZE;
        }
        if (file.exists()) {
            if (file2.exists()) {
                if (z) {
                    if (!C16880lQ.LLLZZIL(file2)) {
                        throw new C48172IvQ(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new C48172IvQ(file, file2, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (file2.mkdirs()) {
                    return;
                } else {
                    throw new C48170IvO(file, file2, "Failed to create target directory.");
                }
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    C62848OlY.LIZIZ(fileInputStream, fileOutputStream, i2);
                    AnonymousClass636.LJFF(fileOutputStream, null);
                    AnonymousClass636.LJFF(fileInputStream, null);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass636.LJFF(fileInputStream, th);
                    throw th2;
                }
            }
        } else {
            throw new C48173IvR(file, null, "The source file doesn't exist.", 2, null);
        }
    }
}
