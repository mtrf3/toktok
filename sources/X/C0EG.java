package X;

import Y.IDCallableS414S0100000;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import defpackage.a1;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.0EG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0EG implements Closeable {
    public static final Pattern LJLLLL = PatternProtector.compile("[a-z0-9_-]{1,120}");
    public static final C0EB LJLLLLLL = new OutputStream() { // from class: X.0EB
        @Override // java.io.OutputStream
        public final void write(int i) {
        }
    };
    public final File LJLIL;
    public final File LJLILLLLZI;
    public final File LJLJI;
    public final File LJLJJI;
    public long LJLJLJ;
    public Writer LJLJLLL;
    public int LJLLI;
    public final LinkedHashMap<String, C0EE> LJLL = new LinkedHashMap<>(0, 0.75f, true);
    public long LJLLILLLL = 0;
    public final PThreadPoolExecutor LJLLJ = new PThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("/DiskLruCache"));
    public final IDCallableS414S0100000 LJLLL = new IDCallableS414S0100000(this, 1);
    public final int LJLJJL = 100;
    public final int LJLJL = 1;
    public final long LJLJJLL = 400;

    public final synchronized void LJIIL() {
        Writer writer = this.LJLJLLL;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.LJLJI), C0EI.LIZ));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.LJLJJL));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.LJLJL));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C0EE c0ee : this.LJLL.values()) {
                if (c0ee.LIZLLL != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("DIRTY ");
                    LIZ.append(c0ee.LIZ);
                    LIZ.append('\n');
                    bufferedWriter.write(X1D.LIZIZ(LIZ));
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("CLEAN ");
                    LIZ2.append(c0ee.LIZ);
                    LIZ2.append(c0ee.LIZJ());
                    LIZ2.append('\n');
                    bufferedWriter.write(X1D.LIZIZ(LIZ2));
                }
            }
            bufferedWriter.close();
            if (this.LJLILLLLZI.exists()) {
                LJIILL(this.LJLILLLLZI, this.LJLJJI, true);
            }
            LJIILL(this.LJLJI, this.LJLILLLLZI, false);
            C16880lQ.LLLZZIL(this.LJLJJI);
            this.LJLJLLL = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.LJLILLLLZI, true), C0EI.LIZ));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.LJLJLLL == null) {
            return;
        }
        Iterator it = new ArrayList(this.LJLL.values()).iterator();
        while (it.hasNext()) {
            C0ED c0ed = ((C0EE) it.next()).LIZLLL;
            if (c0ed != null) {
                c0ed.LIZ();
            }
        }
        LJIJ();
        this.LJLJLLL.close();
        this.LJLJLLL = null;
    }

    public final boolean LJ() {
        int i = this.LJLLI;
        if (i >= 2000 && i >= this.LJLL.size()) {
            return true;
        }
        return false;
    }

    public final void LJI() {
        LIZIZ(this.LJLJI);
        Iterator<C0EE> it = this.LJLL.values().iterator();
        while (it.hasNext()) {
            C0EE next = it.next();
            int i = 0;
            if (next.LIZLLL == null) {
                while (i < this.LJLJL) {
                    this.LJLJLJ += next.LIZIZ[i];
                    i++;
                }
            } else {
                next.LIZLLL = null;
                while (i < this.LJLJL) {
                    LIZIZ(next.LIZ(i));
                    LIZIZ(next.LIZIZ(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void LJIIJ() {
        C0EK c0ek = new C0EK(new FileInputStream(this.LJLILLLLZI), C0EI.LIZ);
        try {
            String LIZ = c0ek.LIZ();
            String LIZ2 = c0ek.LIZ();
            String LIZ3 = c0ek.LIZ();
            String LIZ4 = c0ek.LIZ();
            String LIZ5 = c0ek.LIZ();
            if ("libcore.io.DiskLruCache".equals(LIZ) && "1".equals(LIZ2) && Integer.toString(this.LJLJJL).equals(LIZ3) && Integer.toString(this.LJLJL).equals(LIZ4) && "".equals(LIZ5)) {
                int i = 0;
                while (true) {
                    try {
                        LJIIJJI(c0ek.LIZ());
                        i++;
                    } catch (EOFException unused) {
                        this.LJLLI = i - this.LJLL.size();
                        if (c0ek.LJLJJL == -1) {
                            LJIIL();
                        } else {
                            this.LJLJLLL = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.LJLILLLLZI, true), C0EI.LIZ));
                        }
                        try {
                            c0ek.close();
                            return;
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("unexpected journal header: [");
                LIZ6.append(LIZ);
                LIZ6.append(", ");
                LIZ6.append(LIZ2);
                LIZ6.append(", ");
                LIZ6.append(LIZ4);
                LIZ6.append(", ");
                LIZ6.append(LIZ5);
                LIZ6.append("]");
                throw new IOException(X1D.LIZIZ(LIZ6));
            }
        } catch (Throwable th) {
            try {
                c0ek.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void LJIJ() {
        while (this.LJLJLJ > this.LJLJJLL) {
            LJIILIIL(this.LJLL.entrySet().iterator().next().getKey());
        }
    }

    public C0EG(File file) {
        this.LJLIL = file;
        this.LJLILLLLZI = new File(file, "journal");
        this.LJLJI = new File(file, "journal.tmp");
        this.LJLJJI = new File(file, "journal.bkp");
    }

    public static void LIZIZ(File file) {
        if (!file.exists() || C16880lQ.LLLZZIL(file)) {
        } else {
            throw new IOException();
        }
    }

    public static C0EG LJFF(File file) {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                C16880lQ.LLLZZIL(file2);
            } else {
                LJIILL(file2, file3, false);
            }
        }
        C0EG c0eg = new C0EG(file);
        if (c0eg.LJLILLLLZI.exists()) {
            try {
                c0eg.LJIIJ();
                c0eg.LJI();
                return c0eg;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DiskLruCache ");
                LIZ.append(file);
                LIZ.append(" is corrupt: ");
                LIZ.append(e.getMessage());
                LIZ.append(", removing");
                printStream.println(X1D.LIZIZ(LIZ));
                c0eg.close();
                C0EI.LIZ(c0eg.LJLIL);
            }
        }
        file.mkdirs();
        C0EG c0eg2 = new C0EG(file);
        c0eg2.LJIIL();
        return c0eg2;
    }

    public static void LJIJI(String str) {
        if (LJLLLL.matcher(str).matches()) {
        } else {
            throw new IllegalArgumentException(a1.LJ("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final C0ED LIZJ(String str) {
        synchronized (this) {
            if (this.LJLJLLL != null) {
                LJIJI(str);
                C0EE c0ee = this.LJLL.get(str);
                if (c0ee == null) {
                    c0ee = new C0EE(this, str);
                    this.LJLL.put(str, c0ee);
                } else if (c0ee.LIZLLL != null) {
                    return null;
                }
                C0ED c0ed = new C0ED(this, c0ee);
                c0ee.LIZLLL = c0ed;
                Writer writer = this.LJLJLLL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DIRTY ");
                LIZ.append(str);
                LIZ.append('\n');
                writer.write(X1D.LIZIZ(LIZ));
                this.LJLJLLL.flush();
                return c0ed;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized C0EF LIZLLL(String str) {
        InputStream inputStream;
        if (this.LJLJLLL != null) {
            LJIJI(str);
            C0EE c0ee = this.LJLL.get(str);
            if (c0ee == null) {
                return null;
            }
            if (!c0ee.LIZJ) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.LJLJL];
            for (int i = 0; i < this.LJLJL; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(c0ee.LIZ(i));
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < this.LJLJL && (inputStream = inputStreamArr[i2]) != null; i2++) {
                        try {
                            inputStream.close();
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                }
            }
            this.LJLLI++;
            Writer writer = this.LJLJLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("READ ");
            LIZ.append(str);
            LIZ.append('\n');
            writer.append((CharSequence) X1D.LIZIZ(LIZ));
            if (LJ()) {
                this.LJLLJ.submit(this.LJLLL);
            }
            return new C0EF(inputStreamArr);
        }
        throw new IllegalStateException("cache is closed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (r4 == (-1)) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r8) {
        /*
            r7 = this;
            r1 = 32
            int r2 = r8.indexOf(r1)
            java.lang.String r3 = "unexpected journal line: "
            r5 = -1
            if (r2 == r5) goto Ld3
            int r0 = r2 + 1
            int r4 = r8.indexOf(r1, r0)
            if (r4 != r5) goto L28
            java.lang.String r1 = r8.substring(r0)
            r0 = 6
            if (r2 != r0) goto L2c
            java.lang.String r0 = "REMOVE"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L2c
            java.util.LinkedHashMap<java.lang.String, X.0EE> r0 = r7.LJLL
            r0.remove(r1)
            return
        L28:
            java.lang.String r1 = r8.substring(r0, r4)
        L2c:
            java.util.LinkedHashMap<java.lang.String, X.0EE> r0 = r7.LJLL
            java.lang.Object r6 = r0.get(r1)
            X.0EE r6 = (X.C0EE) r6
            if (r6 != 0) goto L40
            X.0EE r6 = new X.0EE
            r6.<init>(r7, r1)
            java.util.LinkedHashMap<java.lang.String, X.0EE> r0 = r7.LJLL
            r0.put(r1, r6)
        L40:
            r1 = 5
            if (r4 == r5) goto La9
            if (r2 != r1) goto La7
            java.lang.String r0 = "CLEAN"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto La7
            r2 = 1
            int r0 = r4 + 1
            java.lang.String r1 = r8.substring(r0)
            java.lang.String r0 = " "
            java.lang.String[] r5 = r1.split(r0)
            r6.LIZJ = r2
            r0 = 0
            r6.LIZLLL = r0
            int r1 = r5.length
            X.0EG r0 = r6.LJ
            int r0 = r0.LJLJL
            if (r1 != r0) goto L8f
            r4 = 0
        L67:
            int r0 = r5.length     // Catch: java.lang.NumberFormatException -> L77
            if (r4 >= r0) goto Lba
            long[] r2 = r6.LIZIZ     // Catch: java.lang.NumberFormatException -> L77
            r0 = r5[r4]     // Catch: java.lang.NumberFormatException -> L77
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L77
            r2[r4] = r0     // Catch: java.lang.NumberFormatException -> L77
            int r4 = r4 + 1
            goto L67
        L77:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r3)
            java.lang.String r0 = java.util.Arrays.toString(r5)
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L8f:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r3)
            java.lang.String r0 = java.util.Arrays.toString(r5)
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La7:
            if (r4 != r5) goto Lbb
        La9:
            if (r2 != r1) goto Lbd
            java.lang.String r0 = "DIRTY"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto Lc9
            X.0ED r0 = new X.0ED
            r0.<init>(r7, r6)
            r6.LIZLLL = r0
        Lba:
            return
        Lbb:
            if (r4 != r5) goto Lc9
        Lbd:
            r0 = 4
            if (r2 != r0) goto Lc9
            java.lang.String r0 = "READ"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto Lc9
            goto Lba
        Lc9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = defpackage.i0.LJFF(r3, r8)
            r1.<init>(r0)
            throw r1
        Ld3:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = defpackage.i0.LJFF(r3, r8)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EG.LJIIJJI(java.lang.String):void");
    }

    public final synchronized void LJIILIIL(String str) {
        if (this.LJLJLLL != null) {
            LJIJI(str);
            C0EE c0ee = this.LJLL.get(str);
            if (c0ee != null && c0ee.LIZLLL == null) {
                for (int i = 0; i < this.LJLJL; i++) {
                    File LIZ = c0ee.LIZ(i);
                    if (!LIZ.exists() || C16880lQ.LLLZZIL(LIZ)) {
                        long j = this.LJLJLJ;
                        long[] jArr = c0ee.LIZIZ;
                        this.LJLJLJ = j - jArr[i];
                        jArr[i] = 0;
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("failed to delete ");
                        LIZ2.append(LIZ);
                        throw new IOException(X1D.LIZIZ(LIZ2));
                    }
                }
                this.LJLLI++;
                Writer writer = this.LJLJLLL;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("REMOVE ");
                LIZ3.append(str);
                LIZ3.append('\n');
                writer.append((CharSequence) X1D.LIZIZ(LIZ3));
                this.LJLL.remove(str);
                if (LJ()) {
                    this.LJLLJ.submit(this.LJLLL);
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void LIZ(C0ED c0ed, boolean z) {
        C0EE c0ee = c0ed.LIZ;
        if (c0ee.LIZLLL == c0ed) {
            if (z && !c0ee.LIZJ) {
                for (int i = 0; i < this.LJLJL; i++) {
                    if (c0ed.LIZIZ[i]) {
                        if (!c0ee.LIZIZ(i).exists()) {
                            c0ed.LIZ();
                            return;
                        }
                    } else {
                        c0ed.LIZ();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Newly created entry didn't create value for index ");
                        LIZ.append(i);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ));
                    }
                }
            }
            for (int i2 = 0; i2 < this.LJLJL; i2++) {
                File LIZIZ = c0ee.LIZIZ(i2);
                if (z) {
                    if (LIZIZ.exists()) {
                        File LIZ2 = c0ee.LIZ(i2);
                        LIZIZ.renameTo(LIZ2);
                        long j = c0ee.LIZIZ[i2];
                        long length = LIZ2.length();
                        c0ee.LIZIZ[i2] = length;
                        this.LJLJLJ = (this.LJLJLJ - j) + length;
                    }
                } else {
                    LIZIZ(LIZIZ);
                }
            }
            this.LJLLI++;
            c0ee.LIZLLL = null;
            if (c0ee.LIZJ | z) {
                c0ee.LIZJ = true;
                Writer writer = this.LJLJLLL;
                if (writer != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("CLEAN ");
                    LIZ3.append(c0ee.LIZ);
                    LIZ3.append(c0ee.LIZJ());
                    LIZ3.append('\n');
                    writer.write(X1D.LIZIZ(LIZ3));
                }
                if (z) {
                    this.LJLLILLLL++;
                    c0ee.getClass();
                }
            } else {
                this.LJLL.remove(c0ee.LIZ);
                Writer writer2 = this.LJLJLLL;
                if (writer2 != null) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("REMOVE ");
                    LIZ4.append(c0ee.LIZ);
                    LIZ4.append('\n');
                    writer2.write(X1D.LIZIZ(LIZ4));
                }
            }
            Writer writer3 = this.LJLJLLL;
            if (writer3 != null) {
                writer3.flush();
            }
            if (this.LJLJLJ > this.LJLJJLL || LJ()) {
                this.LJLLJ.submit(this.LJLLL);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static void LJIILL(File file, File file2, boolean z) {
        if (z) {
            LIZIZ(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }
}
