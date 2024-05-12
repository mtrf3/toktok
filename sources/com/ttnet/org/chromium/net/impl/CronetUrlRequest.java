package com.ttnet.org.chromium.net.impl;

import J.N;
import X.AbstractC66659QEd;
import X.AbstractC66664QEi;
import X.AbstractC66669QEn;
import X.AbstractC66673QEr;
import X.C16880lQ;
import X.C61460OAe;
import X.C66654QDy;
import X.C66655QDz;
import X.C66668QEm;
import X.C66674QEs;
import X.C66675QEt;
import X.C66677QEv;
import X.C66680QEy;
import X.C78939UyV;
import X.IUY;
import X.KMP;
import X.QEJ;
import X.QEO;
import X.QEP;
import X.QEQ;
import X.QER;
import X.X1D;
import Y.ARunnableS12S1100000_11;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import defpackage.i0;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes12.dex */
public final class CronetUrlRequest extends AbstractC66659QEd {
    public final boolean LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final Object LJFF = new Object();
    public final CronetUrlRequestContext LJI;
    public final Executor LJII;
    public final List<String> LJIIIIZZ;
    public final QEQ LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public String LJIILIIL;
    public final HeadersList LJIILJJIL;
    public final Collection<Object> LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final int LJIJI;
    public final boolean LJIJJ;
    public final int LJIJJLI;
    public final C66668QEm LJIL;
    public final long LJJ;
    public final AbstractC66669QEn LJJI;
    public CronetUploadDataStream LJJIFFI;
    public C61460OAe LJJII;
    public int LJJIII;
    public AbstractC66673QEr LJJIIJ;
    public C66654QDy LJJIIJZLJL;
    public String LJJIIZ;
    public int LJJIIZI;
    public String LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public int LJJIJL;
    public long LJJIJLIJ;
    public int LJJIL;
    public String LJJIZ;
    public String LJJJ;
    public QEO LJJJI;

    /* loaded from: classes11.dex */
    public static final class HeadersList extends ArrayList<Map.Entry<String, String>> {
    }

    private void onCanceled() {
        IUY.LIZ(this.LJJIIZ);
        LJJIIJZLJL(new ARunnableS47S0100000_11(this, 69));
    }

    private void onNativeAdapterDestroyed() {
        synchronized (this.LJFF) {
            if (this.LJJIIJ == null) {
                return;
            }
            try {
                this.LJII.execute(new ARunnableS47S0100000_11(this, 65));
            } catch (RejectedExecutionException e) {
                C78939UyV.LJII("Exception posting task to executor", e);
            }
        }
    }

    @Override // X.QEE
    public final void LIZIZ() {
        synchronized (this.LJFF) {
            if (this.LIZIZ == 0) {
                return;
            }
            N.MjbEhTZs(this.LIZIZ, this);
        }
    }

    @Override // X.QEE
    public final void LIZJ() {
        IUY.LIZ(this.LJJIIZ);
        synchronized (this.LJFF) {
            if (this.LIZIZ == 0) {
                return;
            }
            N.M3xsE8SK(this.LIZIZ, this);
        }
    }

    @Override // X.QEE
    public final void LIZLLL() {
        synchronized (this.LJFF) {
            if (LJJIFFI() || !this.LIZJ) {
                return;
            }
            LJIL(2);
        }
    }

    @Override // X.QEE
    public final void LJ() {
        synchronized (this.LJFF) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                if (LJJIFFI()) {
                    return;
                }
                N.MhCyx70S(this.LIZIZ, this);
                return;
            }
            throw new IllegalStateException("No redirect to follow.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [long] */
    /* JADX WARN: Type inference failed for: r3v13, types: [long] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // X.QEE
    public final void LJIIJJI() {
        int i;
        synchronized (this.LJFF) {
            try {
                try {
                    LJIJJLI();
                    try {
                    } catch (RuntimeException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    this.LIZIZ = N.MnXVOzVo(this, this.LJI.LJJJJZ(), this.LJIIJ, this.LJIIJJI, this.LJJIIZI, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIIL, this.LJJ);
                    this.LJI.LIZJ.incrementAndGet();
                    if (this.LJIILIIL == null || N.MfdvbiJC(this.LIZIZ, this, this.LJIILIIL)) {
                        Iterator<Map.Entry<String, String>> it = this.LJIILJJIL.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            Map.Entry<String, String> next = it.next();
                            if (next.getKey().equalsIgnoreCase("Content-Type") && !next.getValue().isEmpty()) {
                                z = true;
                            }
                            if (next.getKey().equalsIgnoreCase("Tt-Map-Key") && !next.getValue().isEmpty()) {
                                this.LJJIIZ = next.getValue();
                            }
                            if (!N.MtJFji5x(this.LIZIZ, this, next.getKey(), next.getValue())) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Invalid header ");
                                LIZ.append(next.getKey());
                                LIZ.append("=");
                                LIZ.append(next.getValue());
                                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                            }
                        }
                        N.M4C6WZaz(this.LIZIZ, this, this.LJJIJIIJI, this.LJJIJIIJIL, this.LJJIJIL);
                        N.MaFGwSbC(this.LIZIZ, this, this.LJJIJL);
                        ?? r3 = 0;
                        if (this.LJJIJLIJ > 0) {
                            long j = this.LIZIZ;
                            N.ML2WrLQ6(j, this, this.LJJIJLIJ);
                            r3 = j;
                        }
                        int i2 = r3;
                        if (this.LJJIL > 0) {
                            ?? r32 = this.LIZIZ;
                            N.MC7pScOk(r32, this, this.LJJIL);
                            i2 = r32;
                        }
                        i = i2;
                        if (this.LJJIZ != null) {
                            i = i2;
                            if (this.LJJJ != null) {
                                ?? r33 = this.LIZIZ;
                                N.Mor7A21H(r33, this, this.LJJIZ, this.LJJJ);
                                i = r33;
                            }
                        }
                        CronetUploadDataStream cronetUploadDataStream = this.LJJIFFI;
                        if (cronetUploadDataStream != null) {
                            try {
                                if (z) {
                                    this.LIZJ = true;
                                    cronetUploadDataStream.LLLZIL(new ARunnableS47S0100000_11(this, 66));
                                    return;
                                }
                                throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                            } catch (RuntimeException e2) {
                                e = e2;
                                LJIL(i);
                                throw e;
                            }
                        }
                        this.LIZJ = true;
                        String str = this.LJJIIZ;
                        if (str != null && !TextUtils.isEmpty(str)) {
                            ((ConcurrentHashMap) IUY.LIZ).put(str, this);
                        }
                        N.Mv2a151P(this.LIZIZ, this);
                        return;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Invalid http method ");
                    LIZ2.append(this.LJIILIIL);
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                } catch (RuntimeException e3) {
                    e = e3;
                    i = 1;
                    LJIL(i);
                    throw e;
                }
            } catch (RuntimeException e4) {
                e = e4;
                i = 1;
            } catch (Throwable th3) {
                th = th3;
                while (true) {
                    try {
                        break;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                throw th;
            }
        }
    }

    public final C66680QEy LJIJI() {
        Map<String, List<String>> emptyMap;
        boolean z;
        long j;
        long j2;
        C61460OAe c61460OAe = this.LJJII;
        if (c61460OAe != null) {
            emptyMap = c61460OAe.LIZ();
            z = this.LJJII.LIZLLL;
        } else {
            emptyMap = Collections.emptyMap();
            z = false;
        }
        long longValue = this.LJJIIJZLJL.LJIILLIIL.longValue();
        if (!z || longValue != 0) {
            HeadersList headersList = this.LJIILJJIL;
            if (headersList == null) {
                j = 0;
            } else {
                Iterator<Map.Entry<String, String>> it = headersList.iterator();
                j = 0;
                while (it.hasNext()) {
                    Map.Entry<String, String> next = it.next();
                    if (next.getKey() != null) {
                        j += r0.length();
                    }
                    if (next.getValue() != null) {
                        j += next.getValue().length();
                    }
                }
            }
            Math.max(0L, longValue - j);
        }
        long longValue2 = this.LJJIIJZLJL.LJIIZILJ.longValue();
        if (!z || longValue2 != 0) {
            if (emptyMap == null) {
                j2 = 0;
            } else {
                j2 = 0;
                for (Map.Entry<String, List<String>> entry : emptyMap.entrySet()) {
                    if (entry.getKey() != null) {
                        j2 += r0.length();
                    }
                    if (entry.getValue() != null) {
                        while (entry.getValue().iterator().hasNext()) {
                            j2 += r6.next().length();
                        }
                    }
                }
            }
            Math.max(0L, longValue2 - j2);
        }
        if (this.LJJIIJZLJL.LIZ() != null && C66654QDy.LIZIZ(this.LJJIIJZLJL.LJIIJJI) != null) {
            Duration.ofMillis(C66654QDy.LIZIZ(this.LJJIIJZLJL.LJIIJJI).getTime() - this.LJJIIJZLJL.LIZ().getTime());
        } else {
            Duration.ofSeconds(0L);
        }
        if (this.LJJIIJZLJL.LIZ() != null && C66654QDy.LIZIZ(this.LJJIIJZLJL.LJIIL) != null) {
            Duration.ofMillis(C66654QDy.LIZIZ(this.LJJIIJZLJL.LJIIL).getTime() - this.LJJIIJZLJL.LIZ().getTime());
        } else {
            Duration.ofSeconds(0L);
        }
        return new C66680QEy();
    }

    public final void LJIJJ() {
        if (!this.LIZ) {
            if (C16880lQ.LLLLIIIILLL() == this.LJI.LJ) {
                throw new C66677QEv();
            }
        }
    }

    public final void LJIJJLI() {
        synchronized (this.LJFF) {
            if (this.LIZJ || LJJIFFI()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    public final boolean LJJIFFI() {
        if (this.LIZJ && this.LIZIZ == 0) {
            return true;
        }
        return false;
    }

    public final void LJJII() {
        if (this.LJJIIJZLJL != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    AbstractC66669QEn abstractC66669QEn = this.LJJI;
                    LJIJI();
                    abstractC66669QEn.LIZIZ();
                } catch (RuntimeException e) {
                    C78939UyV.LJII("Error while trying to log CronetTrafficInfo: ", e);
                }
            }
            C66655QDz c66655QDz = new C66655QDz(this.LJIIJ, this.LJIILL, this.LJJIIJZLJL, this.LJJIII, this.LJJII, this.LJJIIJ);
            this.LJI.LJJJLIIL(c66655QDz);
            C66668QEm c66668QEm = this.LJIL;
            if (c66668QEm != null) {
                try {
                    c66668QEm.getExecutor().execute(new ARunnableS30S0200000_11(this, c66655QDz, 22));
                } catch (RejectedExecutionException e2) {
                    C78939UyV.LJII("Exception posting task to executor", e2);
                }
            }
        }
    }

    @Override // X.QEE
    public final String LJFF() {
        return this.LJJIJ;
    }

    private void onSucceeded(long j) {
        this.LJJII.LJI.set(j);
        IUY.LIZ(this.LJJIIZ);
        LJJIIJZLJL(new ARunnableS47S0100000_11(this, 68));
    }

    @Override // X.QEE
    public final void LJI(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.isDirect()) {
                synchronized (this.LJFF) {
                    if (this.LJ) {
                        this.LJ = false;
                        if (LJJIFFI()) {
                            return;
                        }
                        if (N.MJbYA4in(this.LIZIZ, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                            return;
                        }
                        this.LJ = true;
                        throw new IllegalArgumentException("Unable to call native read");
                    }
                    throw new IllegalStateException("Unexpected read attempt.");
                }
            }
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
        throw new IllegalArgumentException("ByteBuffer is already full.");
    }

    @Override // X.QEE
    public final void LJIIIIZZ(int i) {
        this.LJJIIZI = i;
    }

    @Override // X.QEE
    public final void LJIIIZ(int i) {
        this.LJJIL = i | this.LJJIL;
    }

    @Override // X.QEE
    public final void LJIIJ(long j) {
        synchronized (this.LJFF) {
            this.LJJIJLIJ = j;
            if (this.LIZIZ != 0) {
                N.ML2WrLQ6(this.LIZIZ, this, j);
            }
        }
    }

    @Override // X.AbstractC66659QEd
    public final void LJIILIIL(String str) {
        LJIJJLI();
        if (str != null) {
            this.LJIILIIL = str;
            return;
        }
        throw new NullPointerException("Method is required.");
    }

    @Override // X.AbstractC66659QEd
    public final void LJIILJJIL(int i) {
        this.LJJIJL = i;
    }

    @Override // X.AbstractC66659QEd
    public final void LJIILL(int i) {
        this.LJJIJIIJI = i;
    }

    @Override // X.AbstractC66659QEd
    public final void LJIILLIIL(int i) {
        this.LJJIJIIJIL = i;
    }

    @Override // X.AbstractC66659QEd
    public final void LJIIZILJ(int i) {
        this.LJJIJIL = i;
    }

    public final void LJIL(int i) {
        boolean z;
        this.LJJIII = i;
        if (this.LIZIZ == 0) {
            return;
        }
        this.LJI.LIZJ.decrementAndGet();
        long j = this.LIZIZ;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        N.MIb9tt7_(j, this, z);
        this.LIZIZ = 0L;
    }

    public final void LJJ(AbstractC66673QEr abstractC66673QEr) {
        synchronized (this.LJFF) {
            if (LJJIFFI()) {
                return;
            }
            this.LJJIIJ = abstractC66673QEr;
            LJIL(1);
            try {
                this.LJII.execute(new ARunnableS30S0200000_11(this, abstractC66673QEr, 23));
            } catch (RejectedExecutionException e) {
                C78939UyV.LJII("Exception posting task to executor", e);
            }
        }
    }

    public final void LJJI(final QEJ qej) {
        QEJ qej2 = new QEJ(qej) { // from class: com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener
            public final QEJ LIZ;

            {
                this.LIZ = qej;
            }

            @Override // X.QEJ
            public final void onStatus(int i) {
                this.LIZ.onStatus(i);
            }
        };
        synchronized (this.LJFF) {
            if (this.LIZIZ != 0) {
                N.MmSvKAJE(this.LIZIZ, this, qej2);
            } else {
                LJJIIJZLJL(new ARunnableS47S0100000_11(qej2, 67));
            }
        }
    }

    public final void LJJIII(Exception exc) {
        C66674QEs c66674QEs = new C66674QEs("Exception received from UrlRequest.Callback", exc);
        C78939UyV.LJII("Exception in CalledByNative method", exc);
        LJJ(c66674QEs);
    }

    public final void LJJIIJ(Throwable th) {
        C78939UyV.LJII("Exception in upload method", th);
        synchronized (this.LJFF) {
            if (this.LIZIZ == 0) {
                return;
            }
            N.MzKjGz9N(this.LIZIZ, this);
        }
    }

    public final void LJJIIJZLJL(Runnable runnable) {
        try {
            this.LJII.execute(runnable);
        } catch (RejectedExecutionException e) {
            C78939UyV.LJII("Exception posting task to executor", e);
            LJJ(new C66675QEt("Exception posting task to executor", e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String[] addSecurityFactor(java.lang.String r10, java.lang.String[] r11) {
        /*
            r9 = this;
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r8 = 0
            r2 = 0
        L7:
            int r0 = r11.length
            if (r2 >= r0) goto L1c
            r1 = r11[r2]
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            int r0 = r2 + 1
            r0 = r11[r0]
            r5.put(r1, r0)
            int r2 = r2 + 2
            goto L7
        L1c:
            com.ttnet.org.chromium.net.impl.CronetUrlRequestContext r0 = r9.LJI
            X.QDw r0 = r0.LJJIIJZLJL
            r7 = 0
            r6 = 2
            if (r0 != 0) goto L28
        L24:
            r1 = r7
        L25:
            if (r1 != 0) goto L78
            return r7
        L28:
            X.QDx r3 = X.C66653QDx.LIZIZ()
            r3.getClass()
            X.QE0 r0 = X.QE0.LIZ()
            boolean r0 = r0.loggerDebug()
            if (r0 == 0) goto L52
            X.QE0 r2 = X.QE0.LIZ()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onCallToAddSecurityFactor info url = "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "CronetAppProviderManager"
            r2.loggerD(r0, r1)
        L52:
            java.lang.Object r0 = r3.LIZ     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L57
            goto L24
        L57:
            X.EXy r4 = new X.EXy     // Catch: java.lang.Throwable -> L24
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "onCallToAddSecurityFactor"
            java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L24
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r8] = r0     // Catch: java.lang.Throwable -> L24
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            r1 = 1
            r2[r1] = r0     // Catch: java.lang.Throwable -> L24
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L24
            r0[r8] = r10     // Catch: java.lang.Throwable -> L24
            r0[r1] = r5     // Catch: java.lang.Throwable -> L24
            X.EXy r0 = r4.LIZJ(r3, r2, r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r0.LIZ     // Catch: java.lang.Throwable -> L24
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L24
            goto L25
        L78:
            int r0 = r1.size()
            int r0 = r0 * 2
            java.lang.String[] r4 = new java.lang.String[r0]
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L88:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            r4[r8] = r0
            int r1 = r8 + 1
            java.lang.Object r0 = r2.getValue()
            r4[r1] = r0
            int r8 = r8 + 2
            goto L88
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequest.addSecurityFactor(java.lang.String, java.lang.String[]):java.lang.String[]");
    }

    private void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        LJJIIJZLJL(new ARunnableS15S0101000_11(i, versionSafeCallbacks$UrlRequestStatusListener, 6));
    }

    @Override // X.QEE
    public final void LIZ(String str, String str2) {
        synchronized (this.LJFF) {
            if (this.LIZIZ == 0) {
                return;
            }
            N.M2jrbUOP(this.LIZIZ, this, str, str2);
        }
    }

    @Override // X.QEE
    public final void LJII(String str, String str2) {
        this.LJJIZ = str;
        this.LJJJ = str2;
    }

    @Override // X.AbstractC66659QEd
    public final void LJIIL(String str, String str2) {
        LJIJJLI();
        if (str != null) {
            if (str2 != null) {
                this.LJIILJJIL.add(new AbstractMap.SimpleImmutableEntry(str, str2));
                return;
            }
            throw new NullPointerException("Invalid header value.");
        }
        throw new NullPointerException("Invalid header name.");
    }

    @Override // X.AbstractC66659QEd
    public final void LJIJ(AbstractC66664QEi abstractC66664QEi, Executor executor) {
        if (abstractC66664QEi != null) {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = "POST";
            }
            this.LJJIFFI = new CronetUploadDataStream(abstractC66664QEi, executor, this);
            return;
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        C61460OAe c61460OAe = this.LJJII;
        if (c61460OAe != null) {
            c61460OAe.LJI.set(j);
        }
        IUY.LIZ(this.LJJIIZ);
        if (i == 10 || i == 3) {
            LJJ(new o0(i0.LJFF("Exception in CronetUrlRequest: ", str), i, i2, i3));
            return;
        }
        switch (i) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                i = 11;
                break;
            default:
                C78939UyV.LJII(KMP.LJ("Unknown error code: ", i), new Object[0]);
                break;
        }
        LJJ(new NetworkExceptionImpl(i0.LJFF("Exception in CronetUrlRequest: ", str), i, i2));
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.LJJII.LJI.set(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            LJJ(new C66675QEt("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.LJJJI == null) {
            this.LJJJI = new QEO(this);
        }
        byteBuffer.position(i2 + i);
        QEO qeo = this.LJJJI;
        qeo.LJLIL = byteBuffer;
        LJJIIJZLJL(qeo);
    }

    public final C61460OAe LJJIIZ(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        HeadersList headersList = new HeadersList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            headersList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new C61460OAe(new ArrayList(this.LJIIIIZZ), i, str, headersList, z, str2, str3, j);
    }

    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j, String str4) {
        this.LJJII = LJJIIZ(i, str, strArr, z, str2, str3, j);
        LJJIIJZLJL(new ARunnableS12S1100000_11(this, str4, 3));
    }

    private void onRedirectReceived(String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j, String str5) {
        C61460OAe LJJIIZ = LJJIIZ(i, str2, strArr, z, str3, str4, j);
        ((ArrayList) this.LJIIIIZZ).add(str);
        LJJIIJZLJL(new QEP(this, LJJIIZ, str, str5));
    }

    public CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, QER qer, Executor executor, boolean z, boolean z2, int i2, boolean z3, int i3, long j) {
        ArrayList arrayList = new ArrayList();
        this.LJIIIIZZ = arrayList;
        this.LJIILJJIL = new HeadersList();
        if (str != null) {
            if (qer != null) {
                if (executor != null) {
                    this.LIZ = false;
                    this.LJI = cronetUrlRequestContext;
                    this.LJJI = cronetUrlRequestContext.LJJIJIIJIL;
                    this.LJIIJ = str;
                    arrayList.add(str);
                    int i4 = 1;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                i4 = 4;
                                if (i == 4) {
                                    i4 = 5;
                                }
                            } else {
                                i4 = 3;
                            }
                        } else {
                            i4 = 2;
                        }
                    }
                    this.LJIIJJI = i4;
                    this.LJIIIZ = new QEQ(qer);
                    this.LJII = executor;
                    this.LJIILL = null;
                    this.LJIILLIIL = z;
                    this.LJIIZILJ = false;
                    this.LJIJ = z2;
                    this.LJIJI = i2;
                    this.LJIJJ = z3;
                    this.LJIJJLI = i3;
                    this.LJIL = null;
                    this.LJIIL = 0;
                    this.LJJ = j;
                    return;
                }
                throw new NullPointerException("Executor is required");
            }
            throw new NullPointerException("Listener is required");
        }
        throw new NullPointerException("URL is required");
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, long j16, String str, long j17, long j18, String str2, String str3, String str4, String str5, boolean z2, boolean z3) {
        synchronized (this.LJFF) {
            if (this.LJJIIJZLJL == null) {
                C66654QDy c66654QDy = new C66654QDy(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15, j16, str, j17, j18, str2, str3);
                this.LJJIIJZLJL = c66654QDy;
                this.LJJIJ = str5;
                this.LJIIIZ.LJFF(str5, new C66655QDz(this.LJIIJ, this.LJIILL, c66654QDy, this.LJJIII, this.LJJII, this.LJJIIJ));
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
        C66655QDz c66655QDz = new C66655QDz(this.LJIIJ, this.LJIILL, this.LJJIIJZLJL, this.LJJIII, this.LJJII, this.LJJIIJ);
        LJJIIJZLJL(new ARunnableS30S0200000_11(this, c66655QDz, 24));
        this.LJI.LJJJLIIL(c66655QDz);
    }
}
