package X;

import Y.ARunnableS15S0000000_8;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS44S0100000_8;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: X.Itn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48071Itn extends AbstractRunnableC48101IuH {
    public int LJLLLLLL;
    public final InterfaceC48093Iu9 LJLZ;
    public final C48071Itn LJZ;
    public final boolean LJZI;
    public Exception LJZL;
    public final InterfaceC47454Ijq LL;
    public final int LLD;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC47454Ijq interfaceC47454Ijq;
        String str;
        try {
            if (this.LJLL == null && (interfaceC47454Ijq = this.LL) != null) {
                String[] LIZIZ = ((C47453Ijp) interfaceC47454Ijq).LIZIZ();
                if (LIZIZ != null && LIZIZ.length > 0) {
                    this.LJLL = new C48091Iu7(C48100IuG.LJFF(LIZIZ));
                    C47453Ijp c47453Ijp = (C47453Ijp) this.LL;
                    if (c47453Ijp.LIZ == null) {
                        c47453Ijp.LIZIZ();
                    }
                    IY1 iy1 = c47453Ijp.LIZ;
                    if (iy1 != null) {
                        str = iy1.LIZJ;
                    } else {
                        str = null;
                    }
                    this.LJLJL = str;
                    this.LJLJLJ = C48082Ity.LIZ(this.LJLJL);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("lazy preload rawKey:");
                    LIZ.append(this.LJLJL);
                    LIZ.append(", key:");
                    LIZ.append(this.LJLJLJ);
                    C48841JEv.LJIILIIL("TAG_PROXY_DownloadTask", X1D.LIZIZ(LIZ), null);
                    if (TextUtils.isEmpty(this.LJLJLJ)) {
                        return;
                    }
                    String LIZ2 = C48082Ity.LIZ(this.LJLJLJ);
                    File LJ = this.LJLIL.LJ(LIZ2);
                    int LIZ3 = ((C47453Ijp) this.LL).LIZ();
                    if (LIZ3 > 0) {
                        this.LJLLLLLL = LIZ3;
                    }
                    if (LJ != null && LJ.length() >= this.LJLLLLLL) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("lazy no need preload, file size: ");
                        LIZ4.append(LJ.length());
                        LIZ4.append(", need preload size: ");
                        LIZ4.append(this.LJLLLLLL);
                        C48841JEv.LJIILIIL("TAG_PROXY_DownloadTask", X1D.LIZIZ(LIZ4), null);
                        return;
                    }
                    if (C48066Iti.LIZJ().LIZLLL(LIZJ(), LIZ2)) {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("lazy has pending proxy task, skip preload for key: ");
                        LIZ5.append(this.LJLJLJ);
                        C48841JEv.LJIJI("TAG_PROXY_DownloadTask", X1D.LIZIZ(LIZ5), null);
                        return;
                    }
                    InterfaceC48093Iu9 interfaceC48093Iu9 = this.LJLZ;
                    if (interfaceC48093Iu9 != null) {
                        interfaceC48093Iu9.LIZIZ(this);
                    }
                } else {
                    C47455Ijr.LIZIZ(1, "lazy provide lazy url fail, provide empty urls.");
                    return;
                }
            }
            try {
                this.LJLIL.LIZIZ(this.LJLJLJ);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    LJIIJ();
                } catch (C47941Irh e) {
                    C48841JEv.LJIJI("TAG_PROXY_DownloadTask", C48841JEv.LJIIL(e), this.LJLJL);
                    if (this.LJZI) {
                        C48100IuG.LJIIIIZZ(new ARunnableS15S0000000_8(this.LLD, this.LJLJL, 3));
                    }
                }
                this.LJLJJI.set(SystemClock.elapsedRealtime() - elapsedRealtime);
                this.LJLIL.LIZLLL(this.LJLJLJ);
                InterfaceC48093Iu9 interfaceC48093Iu92 = this.LJLZ;
                if (interfaceC48093Iu92 != null) {
                    interfaceC48093Iu92.LIZ(this);
                }
            } catch (C47940Irg unused) {
                InterfaceC48093Iu9 interfaceC48093Iu93 = this.LJLZ;
                if (interfaceC48093Iu93 != null) {
                    interfaceC48093Iu93.LIZ(this);
                }
            }
        } catch (Exception e2) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("lazy provide lazy url fail:");
            LIZ6.append(e2.toString());
            C47455Ijr.LIZIZ(1, X1D.LIZIZ(LIZ6));
        }
    }

    public final void LJIIIIZZ() {
        if (this.LJLLL.compareAndSet(0, 1)) {
            C48107IuN c48107IuN = this.LJLJJLL;
            this.LJLJJLL = null;
            if (c48107IuN != null) {
                InterfaceC37276Ek4<?> interfaceC37276Ek4 = c48107IuN.LIZ;
                if (interfaceC37276Ek4 != null) {
                    interfaceC37276Ek4.cancel();
                    return;
                }
                InterfaceC48133Iun interfaceC48133Iun = c48107IuN.LIZIZ;
                if (interfaceC48133Iun == null) {
                    return;
                }
                interfaceC48133Iun.cancel();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Throwable, X.IuA] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Throwable, X.Iu1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final void LJIIJ() {
        C48090Iu6 LIZIZ;
        ?? e = 0;
        String str = null;
        boolean z = false;
        while (this.LJLL.LIZ()) {
            LIZ();
            if (z) {
                LIZIZ = null;
                while (this.LJLL.LIZ()) {
                    LIZIZ = this.LJLL.LIZIZ();
                }
            } else {
                LIZIZ = this.LJLL.LIZIZ();
            }
            try {
                str = LIZIZ.LIZ;
                this.LJLLILLLL.set(0L);
                this.LJLLJ.set(0L);
                LJIIIZ(this.LJLJL);
                LJIIL(LIZIZ.LIZ);
                C47455Ijr.LIZIZ(0, LIZIZ.LIZ);
                if (this.LJZI) {
                    AbstractRunnableC48101IuH.LJ(this.LLD, this.LJLIL.LIZJ(this.LJLJLJ).getAbsolutePath(), this.LJLJL);
                    return;
                }
                return;
            } catch (C47487IkN e2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ContentLengthNotMatchException: ");
                LIZ.append(C48841JEv.LJIIL(e2));
                C48841JEv.LJIIIZ("TAG_PROXY_DownloadTask", X1D.LIZIZ(LIZ), this.LJLJL);
                this.LJZL = e2;
                return;
            } catch (C47941Irh e3) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CancelException: ");
                LIZ2.append(C48841JEv.LJIIL(e3));
                C48841JEv.LJIIIZ("TAG_PROXY_DownloadTask", X1D.LIZIZ(LIZ2), this.LJLJL);
                throw e3;
            } catch (C48085Iu1 e4) {
                e = e4;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("RandomAccessFileWrapper");
                LIZ3.append(C48841JEv.LJIIL(e));
                C48841JEv.LJIIIZ("TAG_PROXY_DownloadTask", X1D.LIZIZ(LIZ3), this.LJLJL);
                this.LJLLI++;
            } catch (C48094IuA e5) {
                e = e5;
                if (!C47455Ijr.LJIILLIIL && LIZIZ.LIZIZ) {
                    LIZIZ.LIZJ.LIZJ.addLast(LIZIZ);
                    LIZIZ.LIZIZ = false;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("RequestException: ");
                LIZ4.append(C48841JEv.LJIIL(e));
                C48841JEv.LJIIIZ("TAG_PROXY_DownloadTask", X1D.LIZIZ(LIZ4), this.LJLJL);
                if (e.errorCode == 403 && C47455Ijr.LJIILLIIL) {
                    z = true;
                }
                this.LJLLI++;
            } catch (IOException e6) {
                e = e;
                if (!"Canceled".equalsIgnoreCase(e6.getMessage())) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("IOException: ");
                    LIZ5.append(C48841JEv.LJIIL(e6));
                    C48841JEv.LJIIIZ("TAG_PROXY_DownloadTask", X1D.LIZIZ(LIZ5), this.LJLJL);
                    e = e6;
                }
                this.LJLLI++;
            } catch (Exception e7) {
                e = e7;
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("OtherException: ");
                LIZ6.append(C48841JEv.LJIIL(e));
                C48841JEv.LJIIIZ("TAG_PROXY_DownloadTask", X1D.LIZIZ(LIZ6), this.LJLJL);
                this.LJLLI++;
            }
        }
        this.LJZL = e;
        C47455Ijr.LIZIZ(1, str);
        if (this.LJZI) {
            C48100IuG.LJIIIIZZ(new ARunnableS44S0100000_8(e, this.LLD, this.LJLJL, 127));
        }
    }

    public C48071Itn(C48061Itd c48061Itd) {
        super(c48061Itd.LJ, c48061Itd.LJFF);
        int i;
        this.LJLLLLLL = c48061Itd.LJII;
        this.LJLZ = c48061Itd.LJIIIZ;
        this.LJZ = this;
        this.LJLJL = c48061Itd.LIZ;
        this.LJLJLJ = c48061Itd.LIZIZ;
        this.LJLJJL = c48061Itd.LJI;
        this.LJLL = c48061Itd.LIZJ;
        this.LJLJLLL = c48061Itd.LJIIIIZZ;
        this.LJZI = c48061Itd.LJIIJ;
        this.LL = c48061Itd.LIZLLL;
        if (!C79004UzY.LJJIFFI(this.LJLJJL)) {
            for (C48099IuF c48099IuF : this.LJLJJL) {
                if (TextUtils.equals(c48099IuF.LIZ, "cache_scene") && TextUtils.equals(c48099IuF.LIZIZ, "music")) {
                    i = 1;
                    break;
                }
            }
        }
        i = 0;
        this.LLD = i;
    }

    public final void LJIIIZ(String str) {
        if (this.LLD == 1 && C48095IuB.LIZ.LIZ.get() == 2) {
            C48066Iti.LIZJ().LIZ(str);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(3:295|296|(35:298|31|(3:270|271|(5:273|274|(2:276|(3:278|279|280))|285|286))|33|34|35|36|(1:38)(1:265)|39|40|41|42|44|45|(3:233|234|(1:236)(22:237|238|239|48|49|(2:51|(6:52|53|(4:169|170|171|172)|55|56|(2:161|162)(3:(3:59|(2:61|2bc)|123)|124|(4:153|154|155|157)(1:128))))(0)|181|182|183|(3:218|219|(1:221))|185|(1:189)|190|191|192|193|194|(1:196)(1:210)|197|(1:199)(1:209)|200|(3:202|203|204)(1:208)))|47|48|49|(0)(0)|181|182|183|(0)|185|(2:187|189)|190|191|192|193|194|(0)(0)|197|(0)(0)|200|(0)(0)))|182|183|(0)|185|(0)|190|191|192|193|194|(0)(0)|197|(0)(0)|200|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02df, code lost:
    
        r4 = X.X1D.LIZ();
        r4.append("download, more data received, currentCacheFileSize: ");
        r4.append(r1);
        r4.append(", max: ");
        r4.append(r27.LJLLLLLL);
        r4.append(", rawKey: ");
        r4.append(r27.LJLJL);
        r4.append(", key: ");
        r4.append(r27.LJLJLJ);
        X.C48841JEv.LJIJI("TAG_PROXY_DownloadTask", X.X1D.LIZIZ(r4), r27.LJLJL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0418, code lost:
    
        X.C48078Itu.LIZIZ().LIZLLL();
        X.C48078Itu.LIZIZ().LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0426, code lost:
    
        r11.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x037e A[Catch: all -> 0x0403, Exception -> 0x040a, IOException -> 0x0411, TryCatch #48 {all -> 0x0403, blocks: (B:183:0x0357, B:219:0x036a, B:221:0x036e, B:185:0x0371, B:187:0x037e, B:189:0x0387, B:190:0x0391), top: B:182:0x0357 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x036a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x022e A[Catch: all -> 0x04da, Exception -> 0x04dc, IOException -> 0x04f8, TryCatch #2 {IOException -> 0x04f8, blocks: (B:26:0x0125, B:28:0x013c, B:31:0x0156, B:36:0x021f, B:39:0x0230, B:42:0x0240, B:265:0x022e), top: B:25:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x050d A[Catch: all -> 0x0527, TryCatch #3 {all -> 0x0527, blocks: (B:87:0x04e5, B:89:0x04f0, B:91:0x04f4, B:92:0x04f7, B:75:0x0501, B:77:0x050d, B:79:0x051f, B:81:0x0523, B:82:0x0526), top: B:24:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04f0 A[Catch: all -> 0x0527, TryCatch #3 {all -> 0x0527, blocks: (B:87:0x04e5, B:89:0x04f0, B:91:0x04f4, B:92:0x04f7, B:75:0x0501, B:77:0x050d, B:79:0x051f, B:81:0x0523, B:82:0x0526), top: B:24:0x0125 }] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Throwable, X.IuN, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48071Itn.LJIIL(java.lang.String):void");
    }

    public final void LJIIJJI(int i, int i2, int i3, int i4, boolean z) {
        InterfaceC47447Ijj interfaceC47447Ijj = C47455Ijr.LJ;
        if (interfaceC47447Ijj != null) {
            C48100IuG.LJIIIIZZ(new ARunnableS27S0200000_8(this, interfaceC47447Ijj, i2, i3, 72));
        }
    }
}
