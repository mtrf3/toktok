package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.forest.Forest;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O4O implements Closeable {
    public static final LinkedList<O4N> LJLLLL = new LinkedList<>();
    public final ReentrantReadWriteLock LJLIL;
    public boolean LJLILLLLZI;
    public O4L LJLJI;
    public InputStream LJLJJI;
    public volatile O4P LJLJJL;
    public volatile int LJLJJLL;
    public volatile boolean LJLJL;
    public volatile O4M LJLJLJ;
    public volatile File LJLJLLL;
    public volatile O4T LJLL;
    public final AtomicInteger LJLLI;
    public final O4S LJLLILLLL;
    public int LJLLJ;
    public Integer LJLLL;

    public /* synthetic */ O4O() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r0 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File LJIJJ() {
        /*
            r3 = this;
            r2 = 0
            java.io.File r1 = r3.LJLJLLL     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto Lf
            boolean r0 = r1.isFile()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lf
        Lb:
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L11
            goto L19
        Lf:
            r1 = r2
            goto Lb
        L11:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L19:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)
            if (r0 == 0) goto L22
        L1f:
            java.io.File r2 = (java.io.File) r2
            return r2
        L22:
            r2 = r1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O4O.LJIJJ():java.io.File");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        LIZIZ(false);
    }

    public final boolean LIZJ() {
        int decrementAndGet = this.LJLLI.decrementAndGet();
        if (decrementAndGet < 0) {
            C39930Flm.LIZJ("ForestBuffer", C0NY.LIZIZ("unexpected close count, count: ", decrementAndGet, " less than 0"), null, true);
        } else if (decrementAndGet == 0) {
            return true;
        }
        return false;
    }

    public final void LJI() {
        try {
            this.LJLIL.writeLock().lock();
            O4P o4p = this.LJLJJL;
            if (o4p != null) {
                o4p.LJFF(this.LJLJJLL);
            }
            this.LJLL = O4T.Finished;
            O4M o4m = this.LJLJLJ;
            if (o4m != null) {
                this.LJLJLJ = null;
                C61325O4z.LIZLLL(new ARunnableS29S0200000_10(o4m, this, 46));
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean LJIILIIL() {
        if (this.LJLL == O4T.Clear) {
            return true;
        }
        return false;
    }

    public final boolean LJIILL() {
        O4P o4p;
        if ((this.LJLL == O4T.Caching || this.LJLL == O4T.Finished) && (o4p = this.LJLJJL) != null && !o4p.LJFF) {
            return true;
        }
        return false;
    }

    public final boolean LJIJ() {
        O4P o4p;
        if (this.LJLL == O4T.Finished && (o4p = this.LJLJJL) != null && !o4p.LJFF) {
            return true;
        }
        return false;
    }

    public final int LJIIJJI() {
        Object LIZ;
        Integer num;
        int i;
        Object LIZ2;
        int intValue;
        if (LJIJ()) {
            return this.LJLJJLL;
        }
        int i2 = 0;
        Object obj = null;
        if (LJIILL()) {
            Integer num2 = this.LJLLL;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            int i3 = this.LJLJJLL;
            try {
                InputStream inputStream = this.LJLJJI;
                if (inputStream != null) {
                    LIZ2 = Integer.valueOf(inputStream.available());
                } else {
                    LIZ2 = null;
                }
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
            if (m10exceptionOrNullimpl != null) {
                C39930Flm.LIZJ("ForestBuffer", "get size from inputStream failed", m10exceptionOrNullimpl, true);
            }
            if (!C3C5.m12isFailureimpl(LIZ2)) {
                obj = LIZ2;
            }
            Integer num3 = (Integer) obj;
            if (num3 != null && (intValue = num3.intValue()) >= 0) {
                i2 = intValue;
            }
            int i4 = i2 + i3;
            if (i >= i4) {
                return i;
            }
            return i4;
        }
        try {
            File LJIJJ = LJIJJ();
            if (LJIJJ != null) {
                LIZ = Long.valueOf(LJIJJ.length());
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th2) {
            LIZ = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl2 = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl2 != null) {
            C39930Flm.LIZJ("ForestBuffer", "get size from file failed", m10exceptionOrNullimpl2, true);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        Long l = (Long) obj;
        if (l != null) {
            num = Integer.valueOf((int) l.longValue());
        } else {
            num = this.LJLLL;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final byte[] LJIJI() {
        O4P o4p;
        if (!LJIJ() || (o4p = this.LJLJJL) == null) {
            return null;
        }
        return o4p.LJIIIZ();
    }

    public final boolean LJJIIJ() {
        if (LJIILL() || this.LJLLILLLL.LIZIZ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public O4O(java.io.File r5) {
        /*
            r4 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.o.LJIIJ(r5, r0)
            X.O4R r3 = new X.O4R
            r3.<init>(r5)
            boolean r0 = X.C39821Fk1.LIZ
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r2.booleanValue()
            r0 = 0
            if (r1 == 0) goto L23
            r2.booleanValue()
            long r1 = r5.length()
            int r0 = (int) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            r4.<init>(r3, r0)
            r4.LJLJLLL = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O4O.<init>(java.io.File):void");
    }

    public final void LIZ(boolean z) {
        C76800UCe c76800UCe;
        if (LJIJ()) {
            C39930Flm.LIZJ("ForestBuffer", "clear after forest buffer finished", null, true);
        }
        this.LJLL = O4T.Clear;
        O4P o4p = this.LJLJJL;
        if (o4p != null) {
            o4p.LIZJ();
        }
        this.LJLJJL = null;
        if (z) {
            try {
                InputStream inputStream = this.LJLJJI;
                if (inputStream != null) {
                    inputStream.close();
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c76800UCe = null;
                }
                C3C5.m7constructorimpl(c76800UCe);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            this.LJLJJI = null;
            this.LJLJL = true;
        }
    }

    public final void LIZIZ(boolean z) {
        if (this.LJLJL) {
            LIZJ();
            return;
        }
        if (z) {
            this.LJLLI.set(0);
            LJ(false);
        } else {
            if (!LIZJ()) {
                return;
            }
            LJ(true);
        }
    }

    public final void LIZLLL(O4L o4l) {
        O4P o5f;
        Integer num = this.LJLLL;
        if (num != null) {
            int intValue = num.intValue();
            boolean z = true;
            if (this.LJLJJL != null) {
                C39930Flm.LIZJ("ForestBuffer", "create meta when meta is not null", null, true);
            }
            this.LJLJI = o4l;
            Boolean bool = C39821Fk1.LJFF;
            if (o.LJ(bool, Boolean.TRUE)) {
                o5f = new O5F(intValue);
            } else if (o.LJ(bool, Boolean.FALSE)) {
                if (o4l == O4L.FORCE_WRITE_BACK) {
                    z = false;
                }
                o5f = new O5G(z);
            } else {
                int i = O4Z.LIZ[o4l.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (!this.LJLLILLLL.LIZIZ()) {
                            if (intValue >= 2097152) {
                                o5f = new O5G(true);
                            } else {
                                o5f = new O5F(intValue);
                            }
                        } else {
                            o5f = new O5F(intValue);
                        }
                    } else {
                        o5f = new O5G(false);
                    }
                } else {
                    o5f = new O5F(intValue);
                }
            }
            this.LJLJJL = o5f;
            this.LJLL = O4T.Caching;
            return;
        }
        o.LJIIZILJ();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        if (LJIJ() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004b, code lost:
    
        if (LJIJ() == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(boolean r5) {
        /*
            r4 = this;
            java.lang.String r3 = "ForestBuffer"
            boolean r0 = r4.LJLJL
            if (r0 == 0) goto L7
            return
        L7:
            r2 = 1
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.LJLIL     // Catch: java.lang.Throwable -> L3f
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch: java.lang.Throwable -> L3f
            r0.lock()     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r4.LJLJL     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L16
            goto L4e
        L16:
            boolean r0 = r4.LJIJ()     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L28
            boolean r0 = r4.LJIILIIL()     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L28
            java.lang.String r1 = "forest buffer is closed in unfinished state"
            r0 = 0
            X.C39930Flm.LIZJ(r3, r1, r0, r2)     // Catch: java.lang.Throwable -> L3f
        L28:
            r4.LJLJL = r2     // Catch: java.lang.Throwable -> L3f
            X.O4P r0 = r4.LJLJJL     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L31
            r0.LIZLLL()     // Catch: java.lang.Throwable -> L3f
        L31:
            java.io.InputStream r0 = r4.LJLJJI     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L38
            r0.close()     // Catch: java.lang.Throwable -> L3f
        L38:
            boolean r0 = r4.LJIJ()
            if (r0 != 0) goto L57
            goto L54
        L3f:
            r1 = move-exception
            java.lang.String r0 = "close origin input stream failed"
            X.C39930Flm.LIZJ(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L61
            boolean r0 = r4.LJIJ()
            if (r0 != 0) goto L57
            goto L54
        L4e:
            boolean r0 = r4.LJIJ()
            if (r0 != 0) goto L57
        L54:
            r4.LIZ(r2)
        L57:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.LJLIL
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.unlock()
            return
        L61:
            throw r1     // Catch: java.lang.Throwable -> L62
        L62:
            r1 = move-exception
            boolean r0 = r4.LJIJ()
            if (r0 != 0) goto L6c
            r4.LIZ(r2)
        L6c:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.LJLIL
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O4O.LJ(boolean):void");
    }

    public final boolean LJIIL(O4L cacheType) {
        int available;
        o.LJIIJ(cacheType, "cacheType");
        if (LJIILL()) {
            return true;
        }
        O4T o4t = this.LJLL;
        O4T o4t2 = O4T.Initial;
        if (o4t != o4t2 || this.LJLJJLL != 0 || this.LJLJJI != null) {
            C39930Flm.LIZJ("ForestBuffer", "initCache failed since not initial state", null, true);
            return false;
        }
        try {
            this.LJLIL.writeLock().lock();
            if (!LJIILL()) {
                if (this.LJLL != o4t2 || this.LJLJJLL != 0 || this.LJLJJI != null) {
                    C39930Flm.LIZJ("ForestBuffer", "initCache failed since not initial state", null, true);
                    return false;
                }
                InputStream LIZ = this.LJLLILLLL.LIZ();
                if (LIZ != null) {
                    this.LJLJJI = LIZ;
                    Integer num = this.LJLLL;
                    if (num != null) {
                        available = num.intValue();
                    } else {
                        available = LIZ.available();
                        if (available < 4096) {
                            available = 4096;
                        }
                    }
                    this.LJLLL = Integer.valueOf(available);
                    LIZLLL(cacheType);
                } else {
                    throw new IOException("provide input stream failed");
                }
            }
            return true;
        } catch (Throwable th) {
            try {
                LIZ(false);
                C39930Flm.LIZJ("ForestBuffer", "initCacheBuffer failed", th, true);
                return false;
            } finally {
                this.LJLIL.writeLock().unlock();
            }
        }
    }

    public final boolean LJJIII(File file) {
        try {
            this.LJLIL.writeLock().lock();
            File LJIJJ = LJIJJ();
            if (LJIJJ != null && LJIJJ.renameTo(file)) {
                this.LJLJLLL = file;
                return true;
            }
            throw new IOException("cache file is not ready");
        } catch (Throwable th) {
            try {
                C39930Flm.LIZJ("ForestBuffer", "rename file failed", th, true);
                this.LJLIL.writeLock().unlock();
                return false;
            } finally {
                this.LJLIL.writeLock().unlock();
            }
        }
    }

    public final void LJJIJIIJIL(C61295O3v response) {
        o.LJIIJ(response, "response");
        if (LJIILIIL() || LJIJ()) {
            return;
        }
        try {
            this.LJLIL.writeLock().lock();
            if (!LJIILIIL() && !LJIJ()) {
                if (!LJIIL(O4L.FORCE_MEMORY)) {
                    C39930Flm.LIZJ("ForestBuffer", "init cache buffer failed when load to memory", new IOException("init cache buffer failed"), true);
                } else {
                    InputStream inputStream = this.LJLJJI;
                    if (inputStream == null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("response: ");
                        LIZ.append(response.LJZL);
                        LIZ.append(", ");
                        LIZ.append(response.LLFII);
                        LIZ.append(", ");
                        LIZ.append(response.getFilePath());
                        LIZ.append(", buffer: ");
                        LIZ.append(this.LJLL);
                        LIZ.append(", ");
                        LIZ.append(this.LJLJJLL);
                        C39930Flm.LIZJ("ForestBuffer", X1D.LIZIZ(LIZ), new IOException("origin input stream is null"), true);
                    } else {
                        O4P o4p = this.LJLJJL;
                        if (o4p != null) {
                            try {
                                try {
                                    if (!C39821Fk1.LIZJ) {
                                        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                                        for (int read = inputStream.read(bArr); read >= 0; read = inputStream.read(bArr)) {
                                            int i = this.LJLJJLL + read;
                                            int available = inputStream.available();
                                            if (available < 0) {
                                                available = 0;
                                            }
                                            o4p = LJFF(i + available, o4p);
                                            o4p.LJIIL(this.LJLJJLL, 0, bArr, read);
                                            this.LJLJJLL += read;
                                        }
                                    } else {
                                        int available2 = inputStream.available();
                                        if (available2 < 0) {
                                            available2 = 0;
                                        }
                                        O4P LJFF = LJFF(this.LJLJJLL + available2, o4p);
                                        int LJIILIIL = LJFF.LJIILIIL(inputStream, this.LJLJJLL);
                                        while (LJIILIIL >= 0) {
                                            this.LJLJJLL += LJIILIIL;
                                            int available3 = inputStream.available();
                                            if (available3 < 0) {
                                                available3 = 0;
                                            }
                                            LJFF = LJFF(this.LJLJJLL + available3, LJFF);
                                            if (LJFF.LJII - this.LJLJJLL == 0) {
                                                int read2 = inputStream.read();
                                                if (read2 == -1) {
                                                    break;
                                                }
                                                C39930Flm.LIZJ("ForestBuffer", "force fallback", null, true);
                                                this.LJLILLLLZI = true;
                                                LJFF = LJFF(this.LJLJJLL + 1, LJFF);
                                                if (LJFF.LJII - this.LJLJJLL != 0) {
                                                    LJFF.LJIIJJI(this.LJLJJLL, (byte) read2);
                                                    this.LJLJJLL++;
                                                } else {
                                                    throw new IOException("grow makes no difference");
                                                }
                                            }
                                            LJIILIIL = LJFF.LJIILIIL(inputStream, this.LJLJJLL);
                                        }
                                    }
                                    LJI();
                                    LIZIZ(true);
                                    AnonymousClass636.LJFF(inputStream, null);
                                } finally {
                                }
                            } catch (Throwable th) {
                                C39930Flm.LIZJ("ForestBuffer", "read input stream to memory failed", th, true);
                                LIZ(true);
                                LinkedList<O4N> linkedList = LJLLLL;
                                if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
                                    Iterator<O4N> it = linkedList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        OSZ<InputStream, Boolean> LIZ2 = it.next().LIZ(response, th);
                                        if (LIZ2 != null && LJJIL(LIZ2.getFirst(), LIZ2.getSecond().booleanValue())) {
                                            LJJIJIIJIL(response);
                                            break;
                                        }
                                    }
                                }
                                C61325O4z.LJ(new AqS157S0200000_10(response, th, 20));
                            }
                        } else {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("response: ");
                            LIZ3.append(response.LJZL);
                            LIZ3.append(", ");
                            LIZ3.append(response.LLFII);
                            LIZ3.append(", ");
                            LIZ3.append(response.getFilePath());
                            LIZ3.append(", buffer: ");
                            LIZ3.append(this.LJLL);
                            LIZ3.append(", ");
                            LIZ3.append(this.LJLJJLL);
                            C39930Flm.LIZJ("ForestBuffer", X1D.LIZIZ(LIZ3), new IOException("meta is null"), true);
                        }
                    }
                }
            }
        } finally {
            this.LJLIL.writeLock().unlock();
        }
    }

    public final boolean LJJIZ(C61295O3v response) {
        File file;
        o.LJIIJ(response, "response");
        if (LJIJJ() != null) {
            return true;
        }
        O4M o4m = this.LJLJLJ;
        if (o4m != null && (file = o4m.LJLIL) != null) {
            return LJJIIJZLJL(response, file);
        }
        if (LJIJJ() != null) {
            return true;
        }
        return false;
    }

    public O4O(InterfaceC61315O4p interfaceC61315O4p, Integer num) {
        this.LJLLL = num;
        this.LJLIL = new ReentrantReadWriteLock();
        this.LJLL = O4T.Initial;
        this.LJLLI = new AtomicInteger(0);
        this.LJLLILLLL = new O4S(this, interfaceC61315O4p);
        this.LJLLJ = 1;
    }

    public final O4P LJFF(int i, O4P o4p) {
        boolean z;
        O4P o4p2;
        int i2 = o4p.LJII;
        if (i2 >= i) {
            return o4p;
        }
        if (!C39821Fk1.LIZIZ || this.LJLILLLLZI) {
            int i3 = i2 << 1;
            if (i3 - i >= 0) {
                i = i3;
            }
        }
        if (this.LJLJI == O4L.FORCE_MEMORY) {
            z = true;
        } else {
            z = false;
        }
        if (!(o4p instanceof O5F)) {
            o4p2 = null;
        } else {
            o4p2 = o4p;
        }
        O5F o5f = (O5F) o4p2;
        if (o5f != null) {
            if (z) {
                o5f.LJ(i);
                o4p = o5f;
            } else {
                if (i > 2097152) {
                    o4p = new O5G(o5f.LJI, o5f.LJIIIZ, true);
                    o5f.LIZJ();
                    o5f.LIZLLL();
                } else {
                    o4p = o5f;
                }
                o4p.LJ(i);
            }
        } else {
            o4p.LJ(i);
        }
        this.LJLJJL = o4p;
        return o4p;
    }

    public final InputStream LJJ(Forest forest, C61295O3v response) {
        InputStream inputStream;
        boolean z;
        byte[] LJIIIZ;
        o.LJIIJ(forest, "forest");
        o.LJIIJ(response, "response");
        if (LJIILIIL()) {
            try {
                this.LJLIL.writeLock().lock();
                if (LJIILIIL() && (inputStream = this.LJLJJI) != null) {
                    if (this.LJLJJLL == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        inputStream = null;
                    }
                    if (inputStream != null) {
                        C39930Flm.LJ("ForestBuffer", "provide origin input stream", 4);
                        this.LJLJJI = null;
                        return inputStream;
                    }
                }
            } finally {
                this.LJLIL.writeLock().unlock();
            }
        }
        if (LJIJ()) {
            O4P o4p = this.LJLJJL;
            if (o4p != null && (LJIIIZ = o4p.LJIIIZ()) != null) {
                return new ByteArrayInputStream(LJIIIZ);
            }
            try {
                this.LJLIL.readLock().lock();
                File file = this.LJLJLLL;
                if (file != null) {
                    return new FileInputStream(file);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        if (LJIILL()) {
            this.LJLLI.incrementAndGet();
            return new O4Q(forest, response, this, this.LJLLJ);
        }
        return this.LJLLILLLL.LIZ();
    }

    public final boolean LJJIIJZLJL(C61295O3v response, File file) {
        File LJIJJ;
        o.LJIIJ(response, "response");
        boolean z = true;
        try {
            this.LJLIL.writeLock().lock();
            LJIJJ = LJIJJ();
        } finally {
            try {
                z = false;
                return z;
            } finally {
            }
        }
        if (LJIJJ != null) {
            if (!o.LJ(file.getAbsolutePath(), LJIJJ.getAbsolutePath())) {
                throw new IOException("sync a different file when targetFile is ready");
            }
        } else {
            LJJIJIIJIL(response);
            if (LJIJ()) {
                O4P o4p = this.LJLJJL;
                if (o4p != null && o4p.LJIIIIZZ(file)) {
                    this.LJLJLLL = file;
                }
                z = false;
            } else {
                throw new IOException("write file failed since load failed");
            }
        }
        return z;
    }

    public final boolean LJJIL(InputStream inputStream, boolean z) {
        int i;
        if (!LJIILIIL()) {
            return false;
        }
        if (inputStream == null) {
            inputStream = this.LJLLILLLL.LIZ();
        }
        if (inputStream == null) {
            C39930Flm.LIZJ("ForestBuffer", "resume failed because no input stream is available", null, true);
            return false;
        }
        try {
            this.LJLIL.writeLock().lock();
            if (!LJIILIIL()) {
                return false;
            }
            int i2 = this.LJLJJLL;
            Integer num = this.LJLLL;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (i2 < i) {
                i2 = i;
            }
            this.LJLLL = Integer.valueOf(i2);
            this.LJLJJI = inputStream;
            O4L o4l = this.LJLJI;
            if (o4l == null) {
                o4l = O4L.AUTO;
            }
            LIZLLL(o4l);
            O4P o4p = this.LJLJJL;
            if (o4p == null) {
                C39930Flm.LIZJ("ForestBuffer", "resume failed because meta is null", null, true);
                return false;
            }
            O4P LJFF = LJFF(this.LJLJJLL, o4p);
            int i3 = 0;
            while (i3 < this.LJLJJLL) {
                int LJIILIIL = LJFF.LJIILIIL(inputStream, i3);
                if (LJIILIIL == -1) {
                    this.LJLJJLL = i3;
                    LJI();
                    LIZIZ(true);
                    return true;
                }
                i3 += LJIILIIL;
            }
            this.LJLJJLL = i3;
            this.LJLJL = false;
            C39930Flm.LJFF("ForestBuffer", "resume ForestBuffer successfully", true);
            if (!z) {
                this.LJLLJ++;
            }
            this.LJLJJI = inputStream;
            this.LJLIL.writeLock().unlock();
            return true;
        } catch (Throwable th) {
            try {
                C39930Flm.LIZJ("ForestBuffer", "error happens when resuming", th, true);
                try {
                    inputStream.close();
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th2) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                }
                LIZ(true);
                return false;
            } finally {
                this.LJLJJI = inputStream;
                this.LJLIL.writeLock().unlock();
            }
        }
    }

    public final Integer LJJIJIL(int i, int i2, byte[] bArr, int i3) {
        Integer num = null;
        if (!LJIILIIL()) {
            return null;
        }
        try {
            this.LJLIL.writeLock().lock();
            if (!LJIILIIL()) {
                return null;
            }
            if (i == this.LJLJJLL) {
                InputStream inputStream = this.LJLJJI;
                if (inputStream != null) {
                    num = Integer.valueOf(inputStream.read(bArr, i2, i3));
                }
                if (num != null && num.intValue() != -1) {
                    this.LJLJJLL += num.intValue();
                }
                if (num != null) {
                    return Integer.valueOf(num.intValue());
                }
                throw new IOException("origin input stream and meta is null");
            }
            throw new IOException("origin input stream and meta is null");
        } finally {
            this.LJLIL.writeLock().unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [X.O4P] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    public final OSZ<Integer, Integer> LJJIIZI(int i, byte[] bArr, int i2, int i3, C61295O3v c61295O3v) {
        int i4;
        Object LIZ;
        int i5;
        O4P o4p;
        if (LJIJ() || (i4 = i + i3) <= this.LJLJJLL) {
            return new OSZ<>(Integer.valueOf(this.LJLJJLL), 0);
        }
        try {
            this.LJLIL.writeLock().lock();
            if (LJIJ() || i4 <= this.LJLJJLL) {
                OSZ<Integer, Integer> osz = new OSZ<>(Integer.valueOf(this.LJLJJLL), 0);
                this.LJLIL.writeLock().unlock();
                return osz;
            }
            Integer LJJIJIL = LJJIJIL(i, i2, bArr, i3);
            if (LJJIJIL != null) {
                OSZ<Integer, Integer> osz2 = new OSZ<>(Integer.valueOf(i), Integer.valueOf(LJJIJIL.intValue()));
                this.LJLIL.writeLock().unlock();
                return osz2;
            }
            int i6 = this.LJLLJ;
            InputStream inputStream = this.LJLJJI;
            if (inputStream != null) {
                ?? r3 = 0;
                if (this.LJLJJLL >= i) {
                    int i7 = this.LJLJJLL - i;
                    int i8 = i2 + i7;
                    try {
                        r3 = inputStream.read(bArr, i8, i3 - i7);
                        i6 = -1;
                        if (r3 == -1) {
                            LJI();
                            OSZ<Integer, Integer> osz3 = new OSZ<>(Integer.valueOf(this.LJLJJLL), 0);
                            this.LJLIL.writeLock().unlock();
                            return osz3;
                        }
                        try {
                            int i9 = this.LJLJJLL + r3;
                            int available = inputStream.available();
                            if (available < 0) {
                                available = 0;
                            }
                            i5 = i9 + available;
                            o4p = this.LJLJJL;
                        } catch (Throwable th) {
                            C39930Flm.LIZJ("ForestBuffer", "add bytes failed", th, true);
                            LIZ(false);
                        }
                        if (o4p != null) {
                            LJFF(i5, o4p).LJIIL(this.LJLJJLL, i8, bArr, r3);
                            this.LJLJJLL += r3;
                            OSZ<Integer, Integer> osz4 = new OSZ<>(Integer.valueOf(this.LJLJJLL - r3), Integer.valueOf((int) r3));
                            this.LJLIL.writeLock().unlock();
                            return osz4;
                        }
                        throw new IOException("meta is null");
                    } catch (Throwable th2) {
                        LIZ(true);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("read origin input stream failed at ");
                        LIZ2.append(this.LJLJJLL);
                        C39930Flm.LIZJ("ForestBuffer", X1D.LIZIZ(LIZ2), th2, true);
                        LinkedList<O4N> linkedList = LJLLLL;
                        if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
                            Iterator<O4N> it = linkedList.iterator();
                            while (it.hasNext()) {
                                try {
                                    OSZ<InputStream, Boolean> LIZ3 = it.next().LIZ(c61295O3v, th2);
                                    if (LIZ3 != null) {
                                        LIZ = Boolean.valueOf(LJJIL(LIZ3.getFirst(), LIZ3.getSecond().booleanValue()));
                                    } else {
                                        LIZ = r3;
                                    }
                                    C3C5.m7constructorimpl(LIZ);
                                } catch (Throwable th3) {
                                    LIZ = C141335gf.LIZ(th3);
                                    C3C5.m7constructorimpl(LIZ);
                                }
                                if (C3C5.m12isFailureimpl(LIZ)) {
                                    LIZ = r3;
                                }
                                if (o.LJ((Boolean) LIZ, Boolean.TRUE)) {
                                    break;
                                }
                            }
                        }
                        if (LJIILL() && i6 == this.LJLLJ) {
                            OSZ<Integer, Integer> LJJIIZI = LJJIIZI(i, bArr, i2, i3, c61295O3v);
                            this.LJLIL.writeLock().unlock();
                            return LJJIIZI;
                        }
                        throw th2;
                    }
                }
                C39930Flm.LIZJ("ForestBuffer", "read index is larger than ptr", null, true);
                throw new IOException("read index is larger than ptr");
            }
            throw new IOException("origin input stream is null");
        } catch (Throwable th4) {
            this.LJLIL.writeLock().unlock();
            throw th4;
        }
    }

    public final int LJIIJ(int i, byte[] bytes, int i2, int i3, C61295O3v response, O4Q forestInputStream) {
        File file;
        RandomAccessFile randomAccessFile;
        String str;
        C76800UCe c76800UCe;
        OSZ<? extends File, ? extends RandomAccessFile> osz;
        o.LJIIJ(bytes, "bytes");
        o.LJIIJ(response, "response");
        o.LJIIJ(forestInputStream, "forestInputStream");
        if (LJIILIIL()) {
            this.LJLIL.readLock().lock();
            if (LJIILIIL()) {
                this.LJLIL.readLock().unlock();
                Integer LJJIJIL = LJJIJIL(i, i2, bytes, i3);
                if (LJJIJIL != null) {
                    return LJJIJIL.intValue();
                }
            } else {
                this.LJLIL.readLock().unlock();
                forestInputStream.LIZ();
            }
        }
        if (LJIJ() && this.LJLJJLL <= i) {
            return -1;
        }
        OSZ<Integer, Integer> LJJIIZI = LJJIIZI(i, bytes, i2, i3, response);
        if (LJIJ() && this.LJLJJLL <= i) {
            return -1;
        }
        if (LJJIIZI.getFirst().intValue() == i) {
            return LJJIIZI.getSecond().intValue();
        }
        int intValue = LJJIIZI.getFirst().intValue() - i;
        if (i3 <= intValue) {
            intValue = i3;
        }
        if (intValue >= 0) {
            if (LJIILIIL()) {
                this.LJLIL.readLock().lock();
                if (!LJIILIIL()) {
                    this.LJLIL.readLock().unlock();
                    forestInputStream.LIZ();
                } else {
                    this.LJLIL.readLock().unlock();
                    throw new IOException("ForestBuffer is Clear");
                }
            }
            O4P o4p = this.LJLJJL;
            if (o4p != null) {
                OSZ<? extends File, ? extends RandomAccessFile> osz2 = forestInputStream.LJLJJI;
                if (osz2 != null) {
                    file = osz2.getFirst();
                } else {
                    file = null;
                }
                OSZ<? extends File, ? extends RandomAccessFile> osz3 = forestInputStream.LJLJJI;
                if (osz3 != null) {
                    randomAccessFile = osz3.getSecond();
                } else {
                    randomAccessFile = null;
                }
                int LJIIJ = o4p.LJIIJ(i, i2, bytes, intValue);
                if (LJIIJ == i) {
                    osz = null;
                } else {
                    StringBuilder LJ = C7MY.LJ("start load from disk, index: ", i, ", len ");
                    int i4 = LJIIJ - i;
                    LJ.append(i4);
                    C39930Flm.LJI("META", X1D.LIZIZ(LJ), false, 4);
                    File file2 = o4p.LIZ;
                    if (file2 == null || LJIIJ < i || LJIIJ > o4p.LIZLLL) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("check match failed, meta: ");
                        LIZ.append(o4p instanceof O5F);
                        LIZ.append(" file ");
                        if (file2 != null) {
                            str = file2.getName();
                        } else {
                            str = null;
                        }
                        LIZ.append(str);
                        LIZ.append(", ");
                        LIZ.append("index ");
                        LIZ.append(i);
                        C1EU.LIZJ(LIZ, ", len ", intValue, ", startPos ", LJIIJ);
                        LIZ.append(", endPoint ");
                        LIZ.append(o4p.LIZLLL);
                        throw new IOException(X1D.LIZIZ(LIZ));
                    }
                    if (randomAccessFile == null || file == null || file != file2) {
                        try {
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "r");
                            if (randomAccessFile == null) {
                                c76800UCe = null;
                            } else {
                                try {
                                    randomAccessFile.close();
                                    c76800UCe = C76800UCe.LIZ;
                                } catch (Throwable th) {
                                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                }
                            }
                            C3C5.m7constructorimpl(c76800UCe);
                            try {
                                randomAccessFile2.seek(i);
                                randomAccessFile = randomAccessFile2;
                            } catch (Throwable th2) {
                                th = th2;
                                C39930Flm.LIZJ("META", "read from file failed", th, true);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            C39930Flm.LIZJ("META", "read from file failed", th, true);
                            throw th;
                        }
                    }
                    int read = randomAccessFile.read(bytes, i2, i4);
                    if (read == i4) {
                        osz = new OSZ<>(file2, randomAccessFile);
                    } else {
                        throw new IOException("only " + read + " bytes read from file, expected " + i4);
                    }
                }
                forestInputStream.LJLJJI = osz;
                return LJJIIZI.getSecond().intValue() + intValue;
            }
            throw new IOException("meta is null");
        }
        C39930Flm.LIZJ("ForestBuffer", "rest size is less than 0", null, true);
        throw new IOException("rest size is less than 0");
    }
}
