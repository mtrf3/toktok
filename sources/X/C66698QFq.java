package X;

import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.QFq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66698QFq implements InterfaceC37346ElC<TypedInput> {
    public C64672PZs LJLIL;
    public long LJLILLLLZI = -1;
    public final /* synthetic */ C66704QFw LJLJI;
    public final /* synthetic */ QGB LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ C48153Iv7 LJLJJLL;
    public final /* synthetic */ QGR LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ InterfaceC37276Ek4 LJLJLLL;
    public final /* synthetic */ C66699QFr LJLL;

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, C64797Pbt<TypedInput> c64797Pbt) {
    }

    @Override // X.InterfaceC37346ElC
    public final void LJIIIIZZ(RequestBuilder requestBuilder) {
    }

    public final void LIZ(C64797Pbt c64797Pbt, Exception exc) {
        Exception exc2;
        List<EJ6> list;
        C64802Pby c64802Pby;
        if (exc == null) {
            return;
        }
        if (exc instanceof QG4) {
            QG4 qg4 = (QG4) exc;
            exc2 = qg4.e;
            this.LJLJI.LJIIJJI += qg4.retryCount;
        } else {
            exc2 = exc;
        }
        boolean z = true;
        if (exc instanceof P9F) {
            this.LJLL.LJI(this.LJLJI, this.LJLJL, true);
            return;
        }
        synchronized (QG8.LIZ()) {
        }
        if ((exc2 instanceof C64802Pby) && (c64802Pby = (C64802Pby) exc2) != null && c64802Pby.getStatusCode() == 304) {
            z = false;
        }
        if (exc2 instanceof C64799Pbv) {
            C64799Pbv c64799Pbv = (C64799Pbv) exc2;
            C64668PZo requestInfo = c64799Pbv.getRequestInfo();
            if (requestInfo instanceof C64672PZs) {
                this.LJLIL = (C64672PZs) requestInfo;
            } else {
                C64672PZs c64672PZs = new C64672PZs();
                this.LJLIL = c64672PZs;
                c64672PZs.LJIJI = 0;
                c64672PZs.LJIL = c64799Pbv.getRequestLog();
            }
        }
        if (z) {
            try {
                if (this.LJLIL == null) {
                    InterfaceC37276Ek4 interfaceC37276Ek4 = this.LJLJLLL;
                    if (interfaceC37276Ek4 instanceof InterfaceC48115IuV) {
                        Object requestInfo2 = ((InterfaceC48115IuV) interfaceC37276Ek4).getRequestInfo();
                        if (requestInfo2 instanceof C64672PZs) {
                            this.LJLIL = (C64672PZs) requestInfo2;
                        }
                    }
                }
                if (this.LJLIL == null) {
                    InterfaceC37276Ek4 interfaceC37276Ek42 = this.LJLJLLL;
                    if ((interfaceC37276Ek42 instanceof InterfaceC37818Eso) && c64797Pbt != null) {
                        ((InterfaceC37818Eso) interfaceC37276Ek42).doCollect();
                        this.LJLIL = (C64672PZs) c64797Pbt.LIZ.LJFF;
                    }
                }
                C64672PZs c64672PZs2 = this.LJLIL;
                if (c64797Pbt != null) {
                    list = c64797Pbt.LIZ.LIZLLL;
                } else {
                    list = null;
                }
                C66699QFr.LJIIJ(c64672PZs2, list, this.LJLJJLL, exc2);
                C64672PZs c64672PZs3 = this.LJLIL;
                if (c64672PZs3 != null) {
                    c64672PZs3.LJII = System.currentTimeMillis();
                    C64672PZs c64672PZs4 = this.LJLIL;
                    if (c64672PZs4.LJI <= 0) {
                        c64672PZs4.LJI = this.LJLILLLLZI;
                    }
                    JSONObject jSONObject = c64672PZs4.LJJ;
                    if (jSONObject != null) {
                        try {
                            jSONObject.put("ex", exc2.getMessage());
                        } catch (Throwable unused) {
                        }
                    }
                }
                C66699QFr c66699QFr = this.LJLL;
                C66704QFw c66704QFw = this.LJLJI;
                C64672PZs c64672PZs5 = this.LJLIL;
                c66699QFr.getClass();
                C66699QFr.LJIIJJI(c64797Pbt, c66704QFw, exc2, c64672PZs5);
            } catch (Throwable unused2) {
            }
        }
        try {
            if (this.LJLJL != null) {
                InterfaceC37276Ek4 interfaceC37276Ek43 = this.LJLJLLL;
                if (interfaceC37276Ek43 != null && interfaceC37276Ek43.isCanceled()) {
                    ((W7U) this.LJLJL).LIZ();
                } else {
                    W7U w7u = (W7U) this.LJLJL;
                    w7u.LIZIZ.LJFF(w7u.LIZ, exc2);
                }
            }
        } catch (Throwable unused3) {
        }
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, Throwable th) {
        Exception exc;
        this.LJLILLLLZI = System.currentTimeMillis();
        if (this.LJLJLJ) {
            C64825PcL.LIZ.LIZJ();
        }
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = new Exception(th.getMessage(), th.getCause());
        }
        LIZ(null, exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    @Override // X.InterfaceC37346ElC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.retrofit2.SsHttpCall r14, X.C64797Pbt r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66698QFq.LJ(com.bytedance.retrofit2.SsHttpCall, X.Pbt):void");
    }

    public C66698QFq(C66699QFr c66699QFr, C66704QFw c66704QFw, QG7 qg7, boolean z, QG1 qg1, QGR qgr, boolean z2, InterfaceC37276Ek4 interfaceC37276Ek4) {
        this.LJLL = c66699QFr;
        this.LJLJI = c66704QFw;
        this.LJLJJI = qg7;
        this.LJLJJL = z;
        this.LJLJJLL = qg1;
        this.LJLJL = qgr;
        this.LJLJLJ = z2;
        this.LJLJLLL = interfaceC37276Ek4;
    }
}
