package X;

import Y.ARunnableS27S0200000_8;
import Y.ARunnableS44S0100000_8;
import android.text.TextUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Ito, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48072Ito extends AbstractRunnableC48101IuH {
    public final Socket LJLLLLLL;
    public final InterfaceC48068Itk LJLZ;
    public final ExecutorService LJZ;
    public volatile C48071Itn LJZI;
    public boolean LJZL;
    public volatile boolean LL;

    public final void LJIIIIZZ() {
        if (this.LJLLL.compareAndSet(0, 1)) {
            C48107IuN c48107IuN = this.LJLJJLL;
            this.LJLJJLL = null;
            if (c48107IuN != null) {
                InterfaceC37276Ek4<?> interfaceC37276Ek4 = c48107IuN.LIZ;
                if (interfaceC37276Ek4 != null) {
                    interfaceC37276Ek4.cancel();
                } else {
                    InterfaceC48133Iun interfaceC48133Iun = c48107IuN.LIZIZ;
                    if (interfaceC48133Iun != null) {
                        interfaceC48133Iun.cancel();
                    }
                }
            }
        }
        LJIIIZ();
    }

    public final void LJIIIZ() {
        C48071Itn c48071Itn = this.LJZI;
        this.LJZI = null;
        if (c48071Itn != null) {
            c48071Itn.LJIIIIZZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cancel fetch task, ");
            LIZ.append(C48841JEv.LJIIL(new RuntimeException()));
            C48841JEv.LJIJI("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ), this.LJLJL);
        }
    }

    public final boolean LJIIL() {
        C48076Its c48076Its = this.LJLJLLL.LIZJ;
        String LIZ = C47455Ijr.LIZ(c48076Its.LIZIZ, c48076Its.LIZJ, c48076Its.LJIIIIZZ, c48076Its.LJII);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("auth-------rece>");
        LIZ2.append(this.LJLJLLL.LIZJ.LIZLLL);
        C48841JEv.LJIIIIZZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ2), null);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("auth-------base>");
        LIZ3.append(LIZ);
        C48841JEv.LJIIIIZZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ3), null);
        return LIZ.equals(c48076Its.LIZLLL);
    }

    public final boolean LJIILIIL() {
        if (this.LJLJLLL == null || this.LJLJLLL.LIZJ == null) {
            return false;
        }
        return TextUtils.equals(this.LJLJLLL.LIZJ.LJIIIIZZ, "music");
    }

    public final void LJIILL() {
        if (C47463Ijz.LIZJ == 1) {
            C48059Itb LIZIZ = C48059Itb.LIZIZ();
            LIZIZ.getClass();
            C48100IuG.LJII(new ARunnableS44S0100000_8(LIZIZ, 125));
            return;
        }
        C48059Itb.LIZIZ().LIZ(LIZJ(), this.LJLJLJ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47935Irb c47935Irb;
        try {
            this.LJLJLLL = C48077Itt.LIZ(this.LJLLLLLL.getInputStream());
            if (!LJIIL()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Illegal url. Extra:");
                LIZ.append(this.LJLJLLL.LIZJ);
                C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ), null);
                return;
            }
            C48841JEv.LJIIIIZZ("TAG_PROXY_ProxyTask", "-----legal------", null);
            OutputStream outputStream = this.LJLLLLLL.getOutputStream();
            if (LJIILIIL()) {
                this.LJLJLLL.LIZIZ.add(new C48099IuF("cache_scene", "music"));
                C48084Iu0 c48084Iu0 = C48095IuB.LIZ;
                c48084Iu0.LIZIZ.incrementAndGet();
                if (c48084Iu0.LIZIZ.get() > C47455Ijr.LJIJJ) {
                    return;
                }
            } else if (this.LJLJLLL.LIZJ.LIZ != 1 && (c47935Irb = C47455Ijr.LIZ) != null) {
                this.LJLIL = c47935Irb;
                this.LJLJL = this.LJLJLLL.LIZJ.LIZIZ;
                this.LJLJLJ = this.LJLJLLL.LIZJ.LIZJ;
                this.LJLL = new C48091Iu7(this.LJLJLLL.LIZJ.LJII);
                this.LJLJJL = this.LJLJLLL.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("request from MediaPlayer:    ");
                LIZ2.append(this.LJLJLLL.toString());
                C48841JEv.LJIILIIL("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ2), this.LJLJL);
                C48075Itr c48075Itr = new C48075Itr(outputStream, this.LJLJLLL.LIZJ.LJ, this.LJLJL);
                InterfaceC48068Itk interfaceC48068Itk = this.LJLZ;
                if (interfaceC48068Itk != null) {
                    C48067Itj c48067Itj = (C48067Itj) interfaceC48068Itk;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("startExecute, ProxyTask: ");
                    LIZ3.append(this);
                    C48841JEv.LJIIIIZZ("TAG_PROXY_ProxyServer", X1D.LIZIZ(LIZ3), null);
                    synchronized (c48067Itj.LIZ.LJI) {
                        java.util.Set<C48072Ito> set = c48067Itj.LIZ.LJI.get(LIZJ());
                        if (set != null) {
                            set.add(this);
                        }
                    }
                }
                try {
                    this.LJLIL.LIZIZ(this.LJLJLJ);
                    try {
                        LJIIJ(c48075Itr);
                    } catch (C47941Irh e) {
                        C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", C48841JEv.LJIIL(e), this.LJLJL);
                    }
                    if (this.LJZL) {
                        this.LJLIL.LIZ(this.LJLJL);
                    }
                    this.LJLIL.LIZLLL(this.LJLJLJ);
                    LJIIIIZZ();
                    C48100IuG.LIZIZ(this.LJLLLLLL);
                    C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", "close socket vid: " + this.LJLJL + ", " + c48075Itr.LIZJ, null);
                    InterfaceC48068Itk interfaceC48068Itk2 = this.LJLZ;
                    if (interfaceC48068Itk2 != null) {
                        ((C48067Itj) interfaceC48068Itk2).LIZ(this);
                        return;
                    }
                    return;
                } catch (C47940Irg unused) {
                    C48100IuG.LIZIZ(this.LJLLLLLL);
                    InterfaceC48068Itk interfaceC48068Itk3 = this.LJLZ;
                    if (interfaceC48068Itk3 != null) {
                        ((C48067Itj) interfaceC48068Itk3).LIZ(this);
                        return;
                    }
                    return;
                }
            }
            C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", "cache is null", this.LJLJL);
        } catch (C48086Iu2 e2) {
            C48100IuG.LIZIZ(this.LJLLLLLL);
            C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", C48841JEv.LJIIL(e2), this.LJLJL);
        } catch (IOException e3) {
            C48100IuG.LIZIZ(this.LJLLLLLL);
            C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", C48841JEv.LJIIL(e3), this.LJLJL);
        }
    }

    public C48072Ito(C48083Itz c48083Itz) {
        super(null, c48083Itz.LIZ);
        this.LL = true;
        this.LJZ = c48083Itz.LIZIZ;
        this.LJLLLLLL = c48083Itz.LIZJ;
        this.LJLZ = c48083Itz.LIZLLL;
    }

    public final void LJIIJ(C48075Itr c48075Itr) {
        C48090Iu6 LIZIZ;
        C48089Iu5 c48089Iu5 = null;
        String str = null;
        boolean z = true;
        boolean z2 = false;
        while (this.LJLL.LIZ()) {
            LIZ();
            if (z && C47455Ijr.LJIIZILJ && this.LJLL.LIZ != null && this.LJLL.LIZ.size() >= 2) {
                this.LJLL.LIZIZ();
            }
            if (z2) {
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
                LJIILLIIL(c48075Itr, LIZIZ.LIZ);
                c48075Itr.LIZ();
                return;
            } catch (C47487IkN e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ContentLengthNotMatchException: ");
                LIZ.append(C48841JEv.LJIIL(e));
                C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ), this.LJLJL);
                this.LJZL = true;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" ContentLengthNotMatchException: ");
                LIZ2.append(C48841JEv.LJIIL(e));
                C47455Ijr.LIZJ(5, X1D.LIZIZ(LIZ2), this.LJLJL);
                return;
            } catch (C47941Irh e2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("CancelException: ");
                LIZ3.append(C48841JEv.LJIIL(e2));
                C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ3), this.LJLJL);
                C47455Ijr.LIZJ(-1, "Task was cancel.", this.LJLJL);
                throw e2;
            } catch (C48085Iu1 e3) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("RandomAccessFileWrapper");
                LIZ4.append(C48841JEv.LJIIL(e3));
                C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ4), this.LJLJL);
                this.LL = false;
                c48089Iu5 = new C48089Iu5(4, "RandomAccessFileWrapper.FileException", e3);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(" RandomAccessFileWrapper.FileException：");
                LIZ5.append(C48841JEv.LJIIL(e3));
                C47455Ijr.LIZJ(4, X1D.LIZIZ(LIZ5), this.LJLJL);
                this.LJLLI++;
                z = false;
            } catch (C48092Iu8 e4) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("SocketWriteException: ");
                LIZ6.append(C48841JEv.LJIIL(e4));
                C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ6), this.LJLJL);
                return;
            } catch (C48094IuA e5) {
                if (!C47455Ijr.LJIILLIIL && LIZIZ.LIZIZ) {
                    LIZIZ.LIZJ.LIZJ.addLast(LIZIZ);
                    LIZIZ.LIZIZ = false;
                }
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("RequestException: ");
                LIZ7.append(C48841JEv.LJIIL(e5));
                C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ7), this.LJLJL);
                int i = e5.errorCode;
                c48089Iu5 = new C48089Iu5(i, "RequestException", e5);
                if (i == 416) {
                    this.LJZL = true;
                } else if (i == 403 && C47455Ijr.LJIILLIIL) {
                    z2 = true;
                }
                this.LJLLI++;
                z = false;
            } catch (IOException e6) {
                if (!"Canceled".equalsIgnoreCase(e6.getMessage())) {
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append("IOException: ");
                    LIZ8.append(C48841JEv.LJIIL(e6));
                    C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ8), this.LJLJL);
                    c48089Iu5 = new C48089Iu5(2, "IOException", e6);
                }
                this.LJLLI++;
                z = false;
            } catch (Exception e7) {
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append("OtherException: ");
                LIZ9.append(C48841JEv.LJIIL(e7));
                C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ9), this.LJLJL);
                c48089Iu5 = new C48089Iu5(0, "OtherException", e7);
                this.LJLLI++;
                z = false;
            }
        }
        if (c48089Iu5 != null) {
            int i2 = c48089Iu5.LIZ;
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append(c48089Iu5.LIZIZ);
            LIZ10.append(C48841JEv.LJIIL(c48089Iu5.LIZJ));
            LIZ10.append(", url:");
            LIZ10.append(str);
            C47455Ijr.LIZJ(i2, X1D.LIZIZ(LIZ10), this.LJLJL);
        } else {
            C47455Ijr.LIZJ(6, "After retry all url, no exception...", this.LJLJL);
        }
        C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", "execute() called and return false", this.LJLJL);
        C47455Ijr.LIZIZ(1, str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:13|(4:15|(1:17)|18|(1:20))|(2:22|(2:24|25))|26|(15:(2:28|(2:137|(2:142|(2:144|(2:146|(2:148|(18:150|35|36|37|39|40|41|42|43|(1:45)|46|(7:49|50|51|52|(4:54|(1:101)(2:56|(2:58|(2:62|(4:69|2ff|80|81)(3:66|67|68)))(2:99|100))|96|97)(2:102|103)|82|47)|108|109|(1:111)(1:122)|112|113|(3:115|116|118)(1:121))(2:151|152))(2:153|154))(2:155|156))(2:157|158))(1:141)))(2:159|(1:161))|39|40|41|42|43|(0)|46|(1:47)|108|109|(0)(0)|112|113|(0)(0))|34|35|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0420, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x037b A[Catch: all -> 0x0422, TryCatch #2 {all -> 0x0422, blocks: (B:40:0x023b, B:42:0x023e, B:43:0x0243, B:45:0x024b, B:46:0x0255, B:47:0x027c, B:49:0x0280, B:51:0x0287, B:52:0x028d, B:54:0x0299, B:56:0x029d, B:58:0x02a1, B:60:0x02e4, B:62:0x02ee, B:67:0x03ce, B:68:0x0408, B:69:0x02fa, B:70:0x02ff, B:82:0x033c, B:93:0x0410, B:100:0x0411, B:96:0x02a9, B:97:0x02e3, B:102:0x0336, B:106:0x0413, B:107:0x0418, B:109:0x0342, B:111:0x037b, B:112:0x038a, B:125:0x041a, B:126:0x041f, B:72:0x0300, B:78:0x032d, B:79:0x0333, B:88:0x040a, B:89:0x040d), top: B:39:0x023b, inners: #0, #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x039e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024b A[Catch: all -> 0x0422, TryCatch #2 {all -> 0x0422, blocks: (B:40:0x023b, B:42:0x023e, B:43:0x0243, B:45:0x024b, B:46:0x0255, B:47:0x027c, B:49:0x0280, B:51:0x0287, B:52:0x028d, B:54:0x0299, B:56:0x029d, B:58:0x02a1, B:60:0x02e4, B:62:0x02ee, B:67:0x03ce, B:68:0x0408, B:69:0x02fa, B:70:0x02ff, B:82:0x033c, B:93:0x0410, B:100:0x0411, B:96:0x02a9, B:97:0x02e3, B:102:0x0336, B:106:0x0413, B:107:0x0418, B:109:0x0342, B:111:0x037b, B:112:0x038a, B:125:0x041a, B:126:0x041f, B:72:0x0300, B:78:0x032d, B:79:0x0333, B:88:0x040a, B:89:0x040d), top: B:39:0x023b, inners: #0, #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0280 A[Catch: all -> 0x0422, TRY_LEAVE, TryCatch #2 {all -> 0x0422, blocks: (B:40:0x023b, B:42:0x023e, B:43:0x0243, B:45:0x024b, B:46:0x0255, B:47:0x027c, B:49:0x0280, B:51:0x0287, B:52:0x028d, B:54:0x0299, B:56:0x029d, B:58:0x02a1, B:60:0x02e4, B:62:0x02ee, B:67:0x03ce, B:68:0x0408, B:69:0x02fa, B:70:0x02ff, B:82:0x033c, B:93:0x0410, B:100:0x0411, B:96:0x02a9, B:97:0x02e3, B:102:0x0336, B:106:0x0413, B:107:0x0418, B:109:0x0342, B:111:0x037b, B:112:0x038a, B:125:0x041a, B:126:0x041f, B:72:0x0300, B:78:0x032d, B:79:0x0333, B:88:0x040a, B:89:0x040d), top: B:39:0x023b, inners: #0, #5, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(X.C48075Itr r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48072Ito.LJIILLIIL(X.Itr, java.lang.String):void");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public final void LJIIZILJ(X.C48075Itr r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48072Ito.LJIIZILJ(X.Itr, java.lang.String):void");
    }

    public final byte[] LJIIJJI(C48111IuR c48111IuR, C48075Itr c48075Itr, String str) {
        if (c48111IuR != null) {
            C48841JEv.LJIILIIL("TAG_PROXY_ProxyTask", "get header from db", this.LJLJL);
            return C48100IuG.LIZLLL(c48111IuR, c48075Itr.LIZJ).getBytes(C48100IuG.LIZIZ);
        }
        C48104IuK LIZIZ = LIZIZ(0, -1, str, "HEAD");
        C48100IuG.LIZ(LIZIZ, false, false);
        C48111IuR LJIIL = C48100IuG.LJIIL(LIZIZ, this.LJLILLLLZI, this.LJLJLJ, this.LJLJLLL.LIZJ.LIZ);
        C48841JEv.LJIJI("TAG_PROXY_ProxyTask", "get header from network", this.LJLJL);
        return C48100IuG.LIZLLL(LJIIL, c48075Itr.LIZJ).getBytes(C48100IuG.LIZIZ);
    }

    public final void LJIILJJIL(int i, int i2, int i3, int i4, boolean z) {
        InterfaceC47447Ijj interfaceC47447Ijj = C47455Ijr.LJ;
        if (interfaceC47447Ijj != null) {
            C48100IuG.LJIIIIZZ(new ARunnableS27S0200000_8(this, interfaceC47447Ijj, z, i, i2, i3, i4, 71));
        }
    }
}
