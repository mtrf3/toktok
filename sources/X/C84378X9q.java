package X;

import Y.ACallableS118S0100000_15;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.X9q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84378X9q implements Closeable {
    public final File LJLIL;
    public final File LJLILLLLZI;
    public final File LJLJI;
    public final File LJLJJI;
    public final long LJLJJLL;
    public long LJLJLJ;
    public Writer LJLJLLL;
    public int LJLLI;
    public final java.util.Map<String, C84379X9r> LJLL = Collections.synchronizedMap(new LinkedHashMap(0, 0.75f, true));
    public long LJLLILLLL = 0;
    public final PThreadPoolExecutor LJLLJ = new PThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new VBV());
    public final ACallableS118S0100000_15 LJLLL = new ACallableS118S0100000_15(this, 10);
    public final int LJLJJL = 1;
    public final int LJLJL = 1;

    public final synchronized void LJIIL() {
        Writer writer = this.LJLJLLL;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.LJLJI), C84377X9p.LIZ));
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
            for (C84379X9r c84379X9r : this.LJLL.values()) {
                if (c84379X9r.LJFF != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("DIRTY ");
                    LIZ.append(c84379X9r.LIZ);
                    LIZ.append('\n');
                    bufferedWriter.write(X1D.LIZIZ(LIZ));
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("CLEAN ");
                    LIZ2.append(c84379X9r.LIZ);
                    LIZ2.append(c84379X9r.LIZ());
                    LIZ2.append('\n');
                    bufferedWriter.write(X1D.LIZIZ(LIZ2));
                }
            }
            bufferedWriter.close();
            if (this.LJLILLLLZI.exists()) {
                LJIILIIL(this.LJLILLLLZI, this.LJLJJI, true);
            }
            LJIILIIL(this.LJLJI, this.LJLILLLLZI, false);
            C16880lQ.LLLZZIL(this.LJLJJI);
            this.LJLJLLL = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.LJLILLLLZI, true), C84377X9p.LIZ));
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
            C84380X9s c84380X9s = ((C84379X9r) it.next()).LJFF;
            if (c84380X9s != null) {
                c84380X9s.LIZLLL.LIZ(c84380X9s, false);
            }
        }
        LJIILL();
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
        Iterator<C84379X9r> it = this.LJLL.values().iterator();
        while (it.hasNext()) {
            C84379X9r next = it.next();
            int i = 0;
            if (next.LJFF == null) {
                while (i < this.LJLJL) {
                    this.LJLJLJ += next.LIZIZ[i];
                    i++;
                }
            } else {
                next.LJFF = null;
                while (i < this.LJLJL) {
                    LIZIZ(next.LIZJ[i]);
                    LIZIZ(next.LIZLLL[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void LJIIJ() {
        XA0 xa0 = new XA0(new FileInputStream(this.LJLILLLLZI), C84377X9p.LIZ);
        try {
            String LIZIZ = xa0.LIZIZ();
            String LIZIZ2 = xa0.LIZIZ();
            String LIZIZ3 = xa0.LIZIZ();
            String LIZIZ4 = xa0.LIZIZ();
            String LIZIZ5 = xa0.LIZIZ();
            if ("libcore.io.DiskLruCache".equals(LIZIZ) && "1".equals(LIZIZ2) && Integer.toString(this.LJLJJL).equals(LIZIZ3) && Integer.toString(this.LJLJL).equals(LIZIZ4) && "".equals(LIZIZ5)) {
                int i = 0;
                while (true) {
                    try {
                        LJIIJJI(xa0.LIZIZ());
                        i++;
                    } catch (EOFException unused) {
                        this.LJLLI = i - this.LJLL.size();
                        if (xa0.LJLJJL == -1) {
                            LJIIL();
                        } else {
                            this.LJLJLLL = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.LJLILLLLZI, true), C84377X9p.LIZ));
                        }
                        try {
                            xa0.close();
                            return;
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unexpected journal header: [");
                LIZ.append(LIZIZ);
                LIZ.append(", ");
                LIZ.append(LIZIZ2);
                LIZ.append(", ");
                LIZ.append(LIZIZ4);
                LIZ.append(", ");
                LIZ.append(LIZIZ5);
                LIZ.append("]");
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } catch (Throwable th) {
            try {
                xa0.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void LJIILL() {
        while (this.LJLJLJ > this.LJLJJLL) {
            String key = this.LJLL.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.LJLJLLL != null) {
                    C84379X9r c84379X9r = this.LJLL.get(key);
                    if (c84379X9r != null && c84379X9r.LJFF == null) {
                        for (int i = 0; i < this.LJLJL; i++) {
                            File file = c84379X9r.LIZJ[i];
                            if (!file.exists() || C16880lQ.LLLZZIL(file)) {
                                long j = this.LJLJLJ;
                                long[] jArr = c84379X9r.LIZIZ;
                                this.LJLJLJ = j - jArr[i];
                                jArr[i] = 0;
                            } else {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("failed to delete ");
                                LIZ.append(file);
                                throw new IOException(X1D.LIZIZ(LIZ));
                            }
                        }
                        this.LJLLI++;
                        this.LJLJLLL.append((CharSequence) "REMOVE");
                        this.LJLJLLL.append(' ');
                        this.LJLJLLL.append((CharSequence) key);
                        this.LJLJLLL.append('\n');
                        this.LJLL.remove(key);
                        if (LJ()) {
                            this.LJLLJ.submit(this.LJLLL);
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    public static void LIZIZ(File file) {
        if (!file.exists() || C16880lQ.LLLZZIL(file)) {
        } else {
            throw new IOException();
        }
    }

    public final C84380X9s LIZJ(String str) {
        synchronized (this) {
            if (this.LJLJLLL != null) {
                C84379X9r c84379X9r = this.LJLL.get(str);
                if (c84379X9r == null) {
                    c84379X9r = new C84379X9r(this, str);
                    this.LJLL.put(str, c84379X9r);
                } else if (c84379X9r.LJFF != null) {
                    return null;
                }
                C84380X9s c84380X9s = new C84380X9s(this, c84379X9r);
                c84379X9r.LJFF = c84380X9s;
                this.LJLJLLL.append((CharSequence) "DIRTY");
                this.LJLJLLL.append(' ');
                this.LJLJLLL.append((CharSequence) str);
                this.LJLJLLL.append('\n');
                this.LJLJLLL.flush();
                return c84380X9s;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized C84381X9t LIZLLL(String str) {
        if (this.LJLJLLL != null) {
            C84379X9r c84379X9r = this.LJLL.get(str);
            if (c84379X9r == null) {
                return null;
            }
            if (!c84379X9r.LJ) {
                return null;
            }
            for (File file : c84379X9r.LIZJ) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.LJLLI++;
            this.LJLJLLL.append((CharSequence) "READ");
            this.LJLJLLL.append(' ');
            this.LJLJLLL.append((CharSequence) str);
            this.LJLJLLL.append('\n');
            if (LJ()) {
                this.LJLLJ.submit(this.LJLLL);
            }
            return new C84381X9t(c84379X9r.LIZJ);
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
            java.util.Map<java.lang.String, X.X9r> r0 = r7.LJLL
            r0.remove(r1)
            return
        L28:
            java.lang.String r1 = r8.substring(r0, r4)
        L2c:
            java.util.Map<java.lang.String, X.X9r> r0 = r7.LJLL
            java.lang.Object r6 = r0.get(r1)
            X.X9r r6 = (X.C84379X9r) r6
            if (r6 != 0) goto L40
            X.X9r r6 = new X.X9r
            r6.<init>(r7, r1)
            java.util.Map<java.lang.String, X.X9r> r0 = r7.LJLL
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
            r6.LJ = r2
            r0 = 0
            r6.LJFF = r0
            int r1 = r5.length
            X.X9q r0 = r6.LJI
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
            X.X9s r0 = new X.X9s
            r0.<init>(r7, r6)
            r6.LJFF = r0
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
        throw new UnsupportedOperationException("Method not decompiled: X.C84378X9q.LJIIJJI(java.lang.String):void");
    }

    public C84378X9q(File file, long j) {
        this.LJLIL = file;
        this.LJLILLLLZI = new File(file, "journal");
        this.LJLJI = new File(file, "journal.tmp");
        this.LJLJJI = new File(file, "journal.bkp");
        this.LJLJJLL = j;
    }

    public static C84378X9q LJFF(File file, long j) {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    C16880lQ.LLLZZIL(file2);
                } else {
                    LJIILIIL(file2, file3, false);
                }
            }
            C84378X9q c84378X9q = new C84378X9q(file, j);
            if (c84378X9q.LJLILLLLZI.exists()) {
                try {
                    c84378X9q.LJIIJ();
                    c84378X9q.LJI();
                    return c84378X9q;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("DiskLruCache ");
                    LIZ.append(file);
                    LIZ.append(" is corrupt: ");
                    LIZ.append(e.getMessage());
                    LIZ.append(", removing");
                    printStream.println(X1D.LIZIZ(LIZ));
                    c84378X9q.close();
                    C84377X9p.LIZ(c84378X9q.LJLIL);
                }
            }
            file.mkdirs();
            C84378X9q c84378X9q2 = new C84378X9q(file, j);
            c84378X9q2.LJIIL();
            return c84378X9q2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized void LIZ(C84380X9s c84380X9s, boolean z) {
        if (this.LJLJLLL == null) {
            return;
        }
        C84379X9r c84379X9r = c84380X9s.LIZ;
        if (c84379X9r.LJFF == c84380X9s) {
            if (z && !c84379X9r.LJ) {
                for (int i = 0; i < this.LJLJL; i++) {
                    if (c84380X9s.LIZIZ[i]) {
                        if (!c84379X9r.LIZLLL[i].exists()) {
                            c84380X9s.LIZLLL.LIZ(c84380X9s, false);
                            return;
                        }
                    } else {
                        c84380X9s.LIZLLL.LIZ(c84380X9s, false);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Newly created entry didn't create value for index ");
                        LIZ.append(i);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ));
                    }
                }
            }
            for (int i2 = 0; i2 < this.LJLJL; i2++) {
                File file = c84379X9r.LIZLLL[i2];
                if (z) {
                    if (file.exists()) {
                        File file2 = c84379X9r.LIZJ[i2];
                        file.renameTo(file2);
                        long j = c84379X9r.LIZIZ[i2];
                        long length = file2.length();
                        c84379X9r.LIZIZ[i2] = length;
                        this.LJLJLJ = (this.LJLJLJ - j) + length;
                    }
                } else {
                    LIZIZ(file);
                }
            }
            this.LJLLI++;
            c84379X9r.LJFF = null;
            if (c84379X9r.LJ | z) {
                c84379X9r.LJ = true;
                this.LJLJLLL.append((CharSequence) "CLEAN");
                this.LJLJLLL.append(' ');
                this.LJLJLLL.append((CharSequence) c84379X9r.LIZ);
                this.LJLJLLL.append((CharSequence) c84379X9r.LIZ());
                this.LJLJLLL.append('\n');
                if (z) {
                    this.LJLLILLLL++;
                    c84379X9r.getClass();
                }
            } else {
                this.LJLL.remove(c84379X9r.LIZ);
                this.LJLJLLL.append((CharSequence) "REMOVE");
                this.LJLJLLL.append(' ');
                this.LJLJLLL.append((CharSequence) c84379X9r.LIZ);
                this.LJLJLLL.append('\n');
            }
            this.LJLJLLL.flush();
            if (this.LJLJLJ > this.LJLJJLL || LJ()) {
                this.LJLLJ.submit(this.LJLLL);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static void LJIILIIL(File file, File file2, boolean z) {
        if (z) {
            LIZIZ(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }
}
