package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class XBK implements InterfaceC84458XCs {
    public final C0FT LIZ;
    public final C30941Ji LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final long LJFF;
    public final XC4 LJI;
    public final boolean LJII;

    @Override // X.InterfaceC84458XCs
    public void LIZ(List<String> list) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (X.C10820be.LJFF(r1.LIZ) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.XBL LJ() {
        /*
            r11 = this;
            X.1Ji r3 = r11.LIZIZ
            r3.LIZIZ()
            X.0FT r0 = r11.LIZ     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r0.LIZ     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L25
            X.XBL r1 = (X.XBL) r1     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = r1.LJIILIIL     // Catch: java.lang.Throwable -> L7b
            boolean r0 = X.C10820be.LJ(r0)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L25
            X.0bf r0 = r1.LIZ     // Catch: java.lang.Throwable -> L7b
            boolean r0 = X.C10820be.LJFF(r0)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L25
        L1e:
            X.0FT r0 = r11.LIZ     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r0.LIZ     // Catch: java.lang.Throwable -> L7b
            X.XBL r0 = (X.XBL) r0     // Catch: java.lang.Throwable -> L7b
            goto L77
        L25:
            r11.LJFF()     // Catch: java.lang.Throwable -> L7b
            X.XBQ r0 = X.XBL.LJIJJ     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r11.LIZJ     // Catch: java.lang.Throwable -> L41
            int r5 = r11.LIZLLL     // Catch: java.lang.Throwable -> L41
            int r6 = r11.LJ     // Catch: java.lang.Throwable -> L41
            long r7 = r11.LJFF     // Catch: java.lang.Throwable -> L41
            X.XC4 r9 = r11.LJI     // Catch: java.lang.Throwable -> L41
            boolean r10 = r11.LJII     // Catch: java.lang.Throwable -> L41
            r0.getClass()     // Catch: java.lang.Throwable -> L41
            X.XBL r7 = X.XBQ.LIZ(r4, r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L41
            X.C3C5.m7constructorimpl(r7)     // Catch: java.lang.Throwable -> L41
            goto L49
        L41:
            r0 = move-exception
            X.3C4 r7 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Throwable -> L7b
            X.C3C5.m7constructorimpl(r7)     // Catch: java.lang.Throwable -> L7b
        L49:
            java.lang.Throwable r6 = X.C3C5.m10exceptionOrNullimpl(r7)     // Catch: java.lang.Throwable -> L7b
            r5 = 0
            if (r6 == 0) goto L6a
            X.0e3 r4 = X.C12310e3.LIZIZ     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "DiskLruCacheImpl"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = "DiskLruCache.open fails, ex: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L7b
            r1.append(r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7b
            r4.getClass()     // Catch: java.lang.Throwable -> L7b
            X.C12310e3.LIZIZ(r2, r0, r5)     // Catch: java.lang.Throwable -> L7b
        L6a:
            X.0FT r1 = r11.LIZ     // Catch: java.lang.Throwable -> L7b
            boolean r0 = X.C3C5.m12isFailureimpl(r7)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L73
            r7 = r5
        L73:
            X.C78685UuP.LJJLJ(r1, r7)     // Catch: java.lang.Throwable -> L7b
            goto L1e
        L77:
            r3.LIZLLL()
            return r0
        L7b:
            r0 = move-exception
            r3.LIZLLL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XBK.LJ():X.XBL");
    }

    public void LJFF() {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZJ);
        LIZ.append(" is creating");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("DiskLruCacheImpl", LIZIZ);
    }

    @Override // X.InterfaceC84458XCs
    public void clear() {
        try {
            XBL LJ = LJ();
            if (LJ != null) {
                LJ.LIZLLL();
            }
            XBL LJ2 = LJ();
            if (LJ2 != null) {
                LJ2.LJIIJJI();
            }
        } catch (Exception e) {
            C12310e3.LIZIZ.getClass();
            C12310e3.LIZIZ("DiskLruCacheImpl", "clear: exception", e);
        }
    }

    @Override // X.InterfaceC84458XCs
    public void LIZIZ(String str) {
        XBL.LJIJJ.getClass();
        String LIZJ = XBQ.LIZJ(str);
        XBL LJ = LJ();
        if (LJ != null) {
            LJ.LJIIIZ(LIZJ);
        }
    }

    @Override // X.InterfaceC84458XCs
    public final OSZ<Integer, Long> LIZLLL(long j) {
        long j2;
        C46141rW<Long> c46141rW;
        Long l;
        long j3;
        Double d;
        XBL LJ = LJ();
        if (LJ != null) {
            C12310e3.LIZIZ.getClass();
            C12310e3.LIZ("DiskLruCache", "try to removeUnused");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C30941Ji c30941Ji = LJ.LJI;
            c30941Ji.LIZIZ();
            try {
                LJ.LJII();
                LJ.LIZIZ();
                for (Map.Entry<String, XBR> entry : LJ.LJIIJ.entrySet()) {
                    if (entry.getValue().LJ.size() > 0 && entry.getValue().LJ.get(0).longValue() <= 0 && C10820be.LJFF(entry.getValue().LIZ(0))) {
                        C32621Pu LJI = C10820be.LJI(entry.getValue().LIZ(0));
                        if (LJI != null && (d = LJI.LJLJJL) != null) {
                            j3 = (long) d.doubleValue();
                        } else {
                            j3 = 0;
                        }
                        C12310e3 c12310e3 = C12310e3.LIZIZ;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(entry.getKey());
                        LIZ.append(":modifiedAt:");
                        LIZ.append(j3);
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        c12310e3.getClass();
                        C12310e3.LIZ("DiskLruCache", LIZIZ);
                        entry.getValue().LJ.set(0, Long.valueOf(j3));
                    }
                    if (System.currentTimeMillis() - entry.getValue().LJ.get(0).longValue() > j) {
                        XC4 xc4 = LJ.LJIIZILJ;
                        if (xc4 == null || !xc4.isAllowed(entry.getKey())) {
                            linkedHashSet.add(entry.getKey());
                        } else {
                            C12310e3 c12310e32 = C12310e3.LIZIZ;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(entry.getKey());
                            LIZ2.append(" cannot remove because in allowlist");
                            String LIZIZ2 = X1D.LIZIZ(LIZ2);
                            c12310e32.getClass();
                            C12310e3.LIZ("DiskLruCache", LIZIZ2);
                        }
                    } else {
                        C12310e3 c12310e33 = C12310e3.LIZIZ;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(entry.getKey());
                        LIZ3.append(" not exceeding the usage time");
                        String LIZIZ3 = X1D.LIZIZ(LIZ3);
                        c12310e33.getClass();
                        C12310e3.LIZ("DiskLruCache", LIZIZ3);
                    }
                }
                c30941Ji.LIZLLL();
                Iterator it = linkedHashSet.iterator();
                long j4 = 0;
                int i = 0;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    C12310e3.LIZIZ.getClass();
                    C12310e3.LIZ("DiskLruCache", "remove " + str + " because that have not been used for a period of time.");
                    XBR xbr = LJ.LJIIJ.get(str);
                    if (xbr != null && (c46141rW = xbr.LIZ) != null && (l = c46141rW.get(0)) != null) {
                        j2 = l.longValue();
                    } else {
                        j2 = 0;
                    }
                    if (LJ.LJIILL(str)) {
                        i++;
                        j4 += j2;
                    }
                }
                return new OSZ<>(Integer.valueOf(i), Long.valueOf(j4));
            } catch (Throwable th) {
                c30941Ji.LIZLLL();
                throw th;
            }
        }
        return new OSZ<>(0, 0L);
    }

    @Override // X.InterfaceC84458XCs
    public final boolean has(String key) {
        o.LJIIJ(key, "key");
        XBL.LJIJJ.getClass();
        String LIZJ = XBQ.LIZJ(key);
        XBL LJ = LJ();
        boolean z = false;
        if (LJ != null) {
            C30941Ji c30941Ji = LJ.LJI;
            c30941Ji.LIZIZ();
            try {
                LJ.LIZIZ();
                if (XBL.LJIIZILJ(LIZJ)) {
                    XBR xbr = LJ.LJIIJ.get(LIZJ);
                    if (xbr != null && ((Boolean) xbr.LIZIZ.LIZ).booleanValue()) {
                        z = true;
                        try {
                            C0FT c0ft = LJ.LJ;
                            c0ft.LIZ = Integer.valueOf(((Number) c0ft.LIZ).intValue() + 1);
                            C32641Pw c32641Pw = (C32641Pw) LJ.LJFF.LIZ;
                            if (c32641Pw != null) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("READ ");
                                LIZ.append(LIZJ);
                                LIZ.append('\n');
                                c32641Pw.LIZIZ(X1D.LIZIZ(LIZ));
                            }
                            C32641Pw c32641Pw2 = (C32641Pw) LJ.LJFF.LIZ;
                            if (c32641Pw2 != null) {
                                c32641Pw2.LIZ();
                            }
                            if (LJ.LJIIIIZZ()) {
                                LJ.LJIIJJI.execute(LJ.LJIIL);
                            }
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("keys must match regex [a-z0-9_-]{1,120}: \"");
                    LIZ2.append(LIZJ);
                    LIZ2.append("\"");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                }
            } finally {
                c30941Ji.LIZLLL();
            }
        }
        return z;
    }

    @Override // X.InterfaceC84458XCs
    public final C32611Pt queryToStream(String key) {
        o.LJIIJ(key, "key");
        XBL.LJIJJ.getClass();
        String LIZJ = XBQ.LIZJ(key);
        try {
            XBL LJ = LJ();
            if (LJ != null) {
                C84391XAd LJFF = LJ.LJFF(LIZJ);
                if (LJFF != null) {
                    return LJFF.LIZIZ[0];
                }
            }
        } catch (Exception e) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get key:");
            LIZ.append(key);
            LIZ.append(" exception");
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZIZ("DiskLruCacheImpl", LIZIZ, e);
        }
        return null;
    }

    @Override // X.InterfaceC84458XCs
    public final String queryToValue(String key) {
        o.LJIIJ(key, "key");
        C32611Pt queryToStream = queryToStream(key);
        if (queryToStream != null) {
            return C10820be.LJIIJ(queryToStream);
        }
        return null;
    }

    @Override // X.InterfaceC84458XCs
    public final boolean remove(String key) {
        o.LJIIJ(key, "key");
        XBL.LJIJJ.getClass();
        String LIZJ = XBQ.LIZJ(key);
        try {
            XBL LJ = LJ();
            if (LJ != null) {
                return LJ.LJIILL(LIZJ);
            }
        } catch (Exception e) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("remove key:");
            LIZ.append(key);
            LIZ.append(" exception");
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZIZ("DiskLruCacheImpl", LIZIZ, e);
        }
        return false;
    }

    @Override // X.InterfaceC84458XCs
    public final void removePattern(String str) {
        java.util.Set<String> LJI;
        if (str != null) {
            XBL.LJIJJ.getClass();
            int length = str.length();
            char[] cArr = new char[length];
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                cArr[i] = charAt;
                if (charAt == C10820be.LIZ.charAt(0)) {
                    cArr[i] = '_';
                }
            }
            OJD ojd = new OJD(new String(cArr));
            XBL LJ = LJ();
            if (LJ != null && (LJI = LJ.LJI()) != null) {
                for (String str2 : LJI) {
                    if (ojd.matches(str2)) {
                        remove(str2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r6 == null) goto L22;
     */
    @Override // X.InterfaceC84458XCs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZJ(java.lang.String r11, X.C84426XBm r12) {
        /*
            r10 = this;
            java.lang.String r8 = "DiskLruCacheImpl"
            X.XBQ r0 = X.XBL.LJIJJ
            r0.getClass()
            java.lang.String r3 = X.XBQ.LIZJ(r11)
            r1 = 0
            r7 = 0
            X.XBL r0 = r10.LJ()     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L7d
            if (r0 == 0) goto L75
            X.XBS r9 = r0.LJ(r3)     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L7d
            if (r9 == 0) goto L75
            X.1lQ r6 = new X.1lQ     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L7d
            X.1Pv r0 = r9.LIZJ()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L7d
            r6.<init>(r0)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L7d
            X.XBM.LIZIZ(r12, r6, r1, r7)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L76
            r9.LIZIZ()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L76
            long r1 = r6.LIZIZ     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L76
            goto L72
        L2c:
            r5 = move-exception
            goto L34
        L2e:
            r5 = move-exception
            r6 = r7
            goto L34
        L31:
            r5 = move-exception
            r9 = r7
            r6 = r7
        L34:
            X.0e3 r4 = X.C12310e3.LIZIZ     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r3 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "save key:"
            r3.append(r0)     // Catch: java.lang.Throwable -> L76
            r3.append(r11)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = " exception"
            r3.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = X.X1D.LIZIZ(r3)     // Catch: java.lang.Throwable -> L76
            r4.getClass()     // Catch: java.lang.Throwable -> L76
            X.C12310e3.LIZIZ(r8, r0, r5)     // Catch: java.lang.Throwable -> L76
            if (r9 == 0) goto L70
            r9.LIZ()     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L76
            goto L70
        L57:
            r5 = move-exception
            X.0e3 r4 = X.C12310e3.LIZIZ     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r3 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "abort :"
            r3.append(r0)     // Catch: java.lang.Throwable -> L76
            r3.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = X.X1D.LIZIZ(r3)     // Catch: java.lang.Throwable -> L76
            r4.getClass()     // Catch: java.lang.Throwable -> L76
            X.C12310e3.LIZIZ(r8, r0, r7)     // Catch: java.lang.Throwable -> L76
        L70:
            if (r6 == 0) goto L75
        L72:
            r6.close()     // Catch: java.lang.Exception -> L75
        L75:
            return r1
        L76:
            r0 = move-exception
            if (r6 == 0) goto L7e
            r6.close()     // Catch: java.lang.Exception -> L7e
            goto L7e
        L7d:
            r0 = move-exception
        L7e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XBK.LIZJ(java.lang.String, X.XBm):long");
    }

    @Override // X.InterfaceC84458XCs
    public final long save(String key, String value) {
        XBS xbs;
        C42361lQ c42361lQ;
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        XBL.LJIJJ.getClass();
        String LIZJ = XBQ.LIZJ(key);
        long j = 0;
        try {
            try {
                try {
                    XBL LJ = LJ();
                    if (LJ != null) {
                        xbs = LJ.LJ(LIZJ);
                        if (xbs != null) {
                            try {
                                c42361lQ = new C42361lQ(xbs.LIZJ());
                            } catch (Exception e) {
                                e = e;
                                c42361lQ = null;
                            }
                            try {
                                byte[] LJJJLZIJ = C78857UxB.LJJJLZIJ(value);
                                c42361lQ.LIZIZ(LJJJLZIJ, LJJJLZIJ.length);
                                c42361lQ.LIZ();
                                c42361lQ.close();
                                xbs.LIZIZ();
                                j = c42361lQ.LIZIZ;
                                try {
                                    c42361lQ.close();
                                } catch (Exception unused) {
                                }
                            } catch (Exception e2) {
                                e = e2;
                                C12310e3 c12310e3 = C12310e3.LIZIZ;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("save :");
                                LIZ.append(e);
                                String LIZIZ = X1D.LIZIZ(LIZ);
                                c12310e3.getClass();
                                C12310e3.LIZIZ("DiskLruCacheImpl", LIZIZ, null);
                                if (xbs != null) {
                                    try {
                                        xbs.LIZ();
                                    } catch (Exception e3) {
                                        C12310e3 c12310e32 = C12310e3.LIZIZ;
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append("abort :");
                                        LIZ2.append(e3);
                                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                                        c12310e32.getClass();
                                        C12310e3.LIZIZ("DiskLruCacheImpl", LIZIZ2, null);
                                    }
                                }
                                if (c42361lQ != null) {
                                    try {
                                        c42361lQ.close();
                                    } catch (Exception unused2) {
                                    }
                                }
                                return 0L;
                            }
                        }
                    }
                    return j;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                xbs = null;
                c42361lQ = null;
            }
        } catch (Throwable th2) {
            if (c42361lQ != null) {
                try {
                    c42361lQ.close();
                    throw th2;
                } catch (Exception unused3) {
                    throw th2;
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.1Pv] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.1Pv, X.1lQ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ LJI(java.lang.String r11, X.C84426XBm r12, java.lang.String r13, long r14, X.InterfaceC88471Ynr r16) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XBK.LJI(java.lang.String, X.XBm, java.lang.String, long, X.Ynr):X.OSZ");
    }

    public XBK(String cacheDir, int i, long j, C84385X9x c84385X9x, boolean z, int i2) {
        int i3;
        i = (i2 & 2) != 0 ? 0 : i;
        if ((i2 & 4) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c84385X9x = (i2 & 16) != 0 ? null : c84385X9x;
        z = (i2 & 32) != 0 ? false : z;
        o.LJIIJ(cacheDir, "cacheDir");
        this.LIZJ = cacheDir;
        this.LIZLLL = i;
        this.LJ = i3;
        this.LJFF = j;
        this.LJI = c84385X9x;
        this.LJII = z;
        this.LIZ = new C0FT((Object) null);
        this.LIZIZ = new C30941Ji(0);
    }
}
