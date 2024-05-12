package X;

import Y.ACallableS118S0100000_15;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.a1;
import defpackage.i0;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: X.X9u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84382X9u implements Closeable {
    public final File LJLIL;
    public final File LJLILLLLZI;
    public final File LJLJI;
    public final int LJLJJI;
    public final long LJLJJL;
    public long LJLJL;
    public Writer LJLJLJ;
    public int LJLL;
    public final LinkedHashMap<String, C84383X9v> LJLJLLL = new LinkedHashMap<>(0, 0.75f, true);
    public long LJLLI = 0;
    public final ExecutorService LJLLILLLL = C16880lQ.LLLLZLLIL();
    public final ACallableS118S0100000_15 LJLLJ = new ACallableS118S0100000_15(this, 6);
    public final int LJLJJLL = 1;

    public final synchronized void LJIILL() {
        Writer writer = this.LJLJLJ;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.LJLJI), FileUtils.BUFFER_SIZE);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.LJLJJI));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.LJLJJLL));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C84383X9v c84383X9v : this.LJLJLLL.values()) {
            if (c84383X9v.LIZLLL != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DIRTY ");
                LIZ.append(c84383X9v.LIZ);
                LIZ.append('\n');
                bufferedWriter.write(X1D.LIZIZ(LIZ));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CLEAN ");
                LIZ2.append(c84383X9v.LIZ);
                LIZ2.append(c84383X9v.LIZJ());
                LIZ2.append('\n');
                bufferedWriter.write(X1D.LIZIZ(LIZ2));
            }
        }
        bufferedWriter.close();
        this.LJLJI.renameTo(this.LJLILLLLZI);
        this.LJLJLJ = new BufferedWriter(new FileWriter(this.LJLILLLLZI, true), FileUtils.BUFFER_SIZE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.LJLJLJ == null) {
            return;
        }
        Iterator it = new ArrayList(this.LJLJLLL.values()).iterator();
        while (it.hasNext()) {
            C84384X9w c84384X9w = ((C84383X9v) it.next()).LIZLLL;
            if (c84384X9w != null) {
                c84384X9w.LIZ();
            }
        }
        LJIJI();
        this.LJLJLJ.close();
        this.LJLJLJ = null;
    }

    static {
        C16880lQ.LJLLJ(C84382X9u.class);
        Charset.forName("UTF-8");
    }

    public final boolean LJFF() {
        int i = this.LJLL;
        if (i >= 2000 && i >= this.LJLJLLL.size()) {
            return true;
        }
        return false;
    }

    public final void LJIIJ() {
        LIZJ(this.LJLJI);
        Iterator<C84383X9v> it = this.LJLJLLL.values().iterator();
        while (it.hasNext()) {
            C84383X9v next = it.next();
            int i = 0;
            if (next.LIZLLL == null) {
                while (i < this.LJLJJLL) {
                    this.LJLJL += next.LIZIZ[i];
                    i++;
                }
            } else {
                next.LIZLLL = null;
                while (i < this.LJLJJLL) {
                    LIZJ(next.LIZ(i));
                    LIZJ(next.LIZIZ(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void LJIIL() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.LJLILLLLZI), FileUtils.BUFFER_SIZE);
        try {
            String LJIIJJI = LJIIJJI(bufferedInputStream);
            String LJIIJJI2 = LJIIJJI(bufferedInputStream);
            String LJIIJJI3 = LJIIJJI(bufferedInputStream);
            String LJIIJJI4 = LJIIJJI(bufferedInputStream);
            String LJIIJJI5 = LJIIJJI(bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(LJIIJJI) || !"1".equals(LJIIJJI2) || !Integer.toString(this.LJLJJI).equals(LJIIJJI3) || !Integer.toString(this.LJLJJLL).equals(LJIIJJI4) || !"".equals(LJIIJJI5)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unexpected journal header: [");
                LIZ.append(LJIIJJI);
                LIZ.append(", ");
                LIZ.append(LJIIJJI2);
                LIZ.append(", ");
                LIZ.append(LJIIJJI4);
                LIZ.append(", ");
                LIZ.append(LJIIJJI5);
                LIZ.append("]");
                throw new IOException(X1D.LIZIZ(LIZ));
            }
            while (true) {
                try {
                    try {
                        LJIILIIL(LJIIJJI(bufferedInputStream));
                    } catch (EOFException unused) {
                        bufferedInputStream.close();
                        return;
                    }
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused2) {
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void LJIJI() {
        while (this.LJLJL > this.LJLJJL) {
            LJIJ(this.LJLJLLL.entrySet().iterator().next().getKey());
        }
    }

    public static void LIZIZ(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    LIZIZ(file2);
                }
                if (!C16880lQ.LLLZZIL(file2)) {
                    throw new IOException(C0F0.LIZJ("failed to delete file: ", file2));
                }
            }
            return;
        }
        throw new IllegalArgumentException(C0F0.LIZJ("not a directory: ", file));
    }

    public static void LIZJ(File file) {
        if (!file.exists() || C16880lQ.LLLZZIL(file)) {
        } else {
            throw new IOException();
        }
    }

    public static String LJIIJJI(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                if (read == 10) {
                    int length = sb.length();
                    if (length > 0) {
                        int i = length - 1;
                        if (sb.charAt(i) == '\r') {
                            sb.setLength(i);
                        }
                    }
                    return sb.toString();
                }
                sb.append((char) read);
            } else {
                throw new EOFException();
            }
        }
    }

    public static void LJIJJ(String str) {
        if (!str.contains(" ") && !str.contains("\n") && !str.contains("\r")) {
        } else {
            throw new IllegalArgumentException(a1.LJ("keys must not contain spaces or newlines: \"", str, "\""));
        }
    }

    public final C84384X9w LIZLLL(String str) {
        synchronized (this) {
            if (this.LJLJLJ != null) {
                LJIJJ(str);
                C84383X9v c84383X9v = this.LJLJLLL.get(str);
                if (c84383X9v == null) {
                    c84383X9v = new C84383X9v(this, str);
                    this.LJLJLLL.put(str, c84383X9v);
                } else if (c84383X9v.LIZLLL != null) {
                    return null;
                }
                C84384X9w c84384X9w = new C84384X9w(this, c84383X9v);
                c84383X9v.LIZLLL = c84384X9w;
                Writer writer = this.LJLJLJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DIRTY ");
                LIZ.append(str);
                LIZ.append('\n');
                writer.write(X1D.LIZIZ(LIZ));
                this.LJLJLJ.flush();
                return c84384X9w;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized C39717FiL LJ(String str) {
        if (this.LJLJLJ != null) {
            LJIJJ(str);
            C84383X9v c84383X9v = this.LJLJLLL.get(str);
            if (c84383X9v == null) {
                return null;
            }
            if (!c84383X9v.LIZJ) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.LJLJJLL];
            for (int i = 0; i < this.LJLJJLL; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(c84383X9v.LIZ(i));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
            this.LJLL++;
            Writer writer = this.LJLJLJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("READ ");
            LIZ.append(str);
            LIZ.append('\n');
            writer.append((CharSequence) X1D.LIZIZ(LIZ));
            if (LJFF()) {
                this.LJLLILLLL.submit(this.LJLLJ);
            }
            return new C39717FiL(inputStreamArr);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final void LJIILIIL(String str) {
        String[] split = str.split(" ");
        if (split.length >= 2) {
            String str2 = split[1];
            if (split[0].equals("REMOVE") && split.length == 2) {
                this.LJLJLLL.remove(str2);
                return;
            }
            C84383X9v c84383X9v = this.LJLJLLL.get(str2);
            if (c84383X9v == null) {
                c84383X9v = new C84383X9v(this, str2);
                this.LJLJLLL.put(str2, c84383X9v);
            }
            if (split[0].equals("CLEAN") && split.length == this.LJLJJLL + 2) {
                c84383X9v.LIZJ = true;
                c84383X9v.LIZLLL = null;
                int length = split.length;
                int length2 = split.length;
                if (2 <= length) {
                    if (2 <= length2) {
                        int i = length - 2;
                        int min = Math.min(i, length2 - 2);
                        Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), i);
                        System.arraycopy(split, 2, objArr, 0, min);
                        String[] strArr = (String[]) objArr;
                        if (strArr.length == c84383X9v.LJ.LJLJJLL) {
                            for (int i2 = 0; i2 < strArr.length; i2++) {
                                try {
                                    c84383X9v.LIZIZ[i2] = CastLongProtector.parseLong(strArr[i2]);
                                } catch (NumberFormatException unused) {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("unexpected journal line: ");
                                    LIZ.append(Arrays.toString(strArr));
                                    throw new IOException(X1D.LIZIZ(LIZ));
                                }
                            }
                            return;
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("unexpected journal line: ");
                        LIZ2.append(Arrays.toString(strArr));
                        throw new IOException(X1D.LIZIZ(LIZ2));
                    }
                    throw new ArrayIndexOutOfBoundsException();
                }
                throw new IllegalArgumentException();
            }
            if (split[0].equals("DIRTY") && split.length == 2) {
                c84383X9v.LIZLLL = new C84384X9w(this, c84383X9v);
                return;
            } else if (split[0].equals("READ") && split.length == 2) {
                return;
            } else {
                throw new IOException(i0.LJFF("unexpected journal line: ", str));
            }
        }
        throw new IOException(i0.LJFF("unexpected journal line: ", str));
    }

    public final synchronized void LJIJ(String str) {
        if (this.LJLJLJ != null) {
            LJIJJ(str);
            C84383X9v c84383X9v = this.LJLJLLL.get(str);
            if (c84383X9v != null && c84383X9v.LIZLLL == null) {
                for (int i = 0; i < this.LJLJJLL; i++) {
                    File LIZ = c84383X9v.LIZ(i);
                    if (C16880lQ.LLLZZIL(LIZ)) {
                        long j = this.LJLJL;
                        long[] jArr = c84383X9v.LIZIZ;
                        this.LJLJL = j - jArr[i];
                        jArr[i] = 0;
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("failed to delete ");
                        LIZ2.append(LIZ);
                        throw new IOException(X1D.LIZIZ(LIZ2));
                    }
                }
                this.LJLL++;
                Writer writer = this.LJLJLJ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("REMOVE ");
                LIZ3.append(str);
                LIZ3.append('\n');
                writer.append((CharSequence) X1D.LIZIZ(LIZ3));
                this.LJLJLLL.remove(str);
                if (LJFF()) {
                    this.LJLLILLLL.submit(this.LJLLJ);
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void LIZ(C84384X9w c84384X9w, boolean z) {
        C84383X9v c84383X9v = c84384X9w.LIZ;
        if (c84383X9v.LIZLLL == c84384X9w) {
            if (z && !c84383X9v.LIZJ) {
                for (int i = 0; i < this.LJLJJLL; i++) {
                    if (!c84383X9v.LIZIZ(i).exists()) {
                        c84384X9w.LIZ();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("edit didn't create file ");
                        LIZ.append(i);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ));
                    }
                }
            }
            for (int i2 = 0; i2 < this.LJLJJLL; i2++) {
                File LIZIZ = c84383X9v.LIZIZ(i2);
                if (z) {
                    if (LIZIZ.exists()) {
                        File LIZ2 = c84383X9v.LIZ(i2);
                        LIZIZ.renameTo(LIZ2);
                        long j = c84383X9v.LIZIZ[i2];
                        long length = LIZ2.length();
                        c84383X9v.LIZIZ[i2] = length;
                        this.LJLJL = (this.LJLJL - j) + length;
                    }
                } else {
                    LIZJ(LIZIZ);
                }
            }
            this.LJLL++;
            c84383X9v.LIZLLL = null;
            if (c84383X9v.LIZJ | z) {
                c84383X9v.LIZJ = true;
                Writer writer = this.LJLJLJ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("CLEAN ");
                LIZ3.append(c84383X9v.LIZ);
                LIZ3.append(c84383X9v.LIZJ());
                LIZ3.append('\n');
                writer.write(X1D.LIZIZ(LIZ3));
                if (z) {
                    this.LJLLI++;
                    c84383X9v.getClass();
                }
            } else {
                this.LJLJLLL.remove(c84383X9v.LIZ);
                Writer writer2 = this.LJLJLJ;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("REMOVE ");
                LIZ4.append(c84383X9v.LIZ);
                LIZ4.append('\n');
                writer2.write(X1D.LIZIZ(LIZ4));
            }
            if (this.LJLJL > this.LJLJJL || LJFF()) {
                this.LJLLILLLL.submit(this.LJLLJ);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public C84382X9u(File file, int i, long j) {
        this.LJLIL = file;
        this.LJLJJI = i;
        this.LJLILLLLZI = new File(file, "journal");
        this.LJLJI = new File(file, "journal.tmp");
        this.LJLJJL = j;
    }

    public static C84382X9u LJI(File file, int i, long j) {
        if (j > 0) {
            C84382X9u c84382X9u = new C84382X9u(file, i, j);
            if (c84382X9u.LJLILLLLZI.exists()) {
                try {
                    c84382X9u.LJIIL();
                    c84382X9u.LJIIJ();
                    c84382X9u.LJLJLJ = new BufferedWriter(new FileWriter(c84382X9u.LJLILLLLZI, true), FileUtils.BUFFER_SIZE);
                    return c84382X9u;
                } catch (IOException unused) {
                    c84382X9u.close();
                    LIZIZ(c84382X9u.LJLIL);
                }
            }
            file.mkdirs();
            C84382X9u c84382X9u2 = new C84382X9u(file, i, j);
            c84382X9u2.LJIILL();
            return c84382X9u2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
