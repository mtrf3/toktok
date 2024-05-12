package X;

import X.XDH;
import Y.ARunnableS51S0100000_15;
import defpackage.q;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class XDF<T, R extends XDH<T>> extends XCZ {
    public String LJI;
    public final boolean LJII;
    public final X62 LJIIIIZZ;
    public final G0J LJIIIZ;
    public final XCN LJIIJ;
    public final String LJIIJJI;

    public abstract XD6 LJI();

    public int LJII() {
        return 10002;
    }

    public int LJIIIIZZ() {
        return 1;
    }

    public abstract R LJIILJJIL(G0J g0j, String str);

    /* JADX WARN: Code restructure failed: missing block: B:65:0x010a, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append('[');
        r1.append(LIZIZ());
        r1.append("][Net response returned null!]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0127, code lost:
    
        throw new X.C84434XBu(-2, X.X1D.LIZIZ(r1));
     */
    @Override // X.XCZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZ() {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XDF.LIZ():void");
    }

    @Override // X.XCZ
    public final void LIZJ() {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15((XDF) this, 701), 64));
    }

    public final OSZ<R, String> LJIILIIL(VNB vnb, G0J g0j) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        String LIZLLL = C79045V0n.LIZLLL(vnb.LIZJ);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (LIZLLL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long currentTimeMillis3 = System.currentTimeMillis();
            R LJIILJJIL = LJIILJJIL(g0j, LIZLLL);
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[FetchList][ID: ");
            LIZ.append(this.LJIIJJI);
            LIZ.append("][");
            LIZ.append(LIZIZ());
            LIZ.append("][String - ");
            LIZ.append(currentTimeMillis2);
            LIZ.append("][Json - ");
            LIZ.append(System.currentTimeMillis() - currentTimeMillis3);
            LIZ.append(']');
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZ("JKL", LIZIZ);
            return new OSZ<>(LJIILJJIL, LIZLLL);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[LogId:");
        LIZ2.append(this.LJI);
        LIZ2.append("][net response returned empty response!][LogId:");
        LIZ2.append(this.LJI);
        LIZ2.append("][errorMsg: ");
        throw new C84434XBu(-2, q.LIZIZ(LIZ2, vnb.LJ, ']', LIZ2));
    }

    public final void LJIIIZ(long j, long j2, long j3) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[FetchList][ID: ");
        LIZ.append(this.LJIIJJI);
        LIZ.append("][");
        LIZ.append(LIZIZ());
        LIZ.append(']');
        LIZ.append("[Net - ");
        LIZ.append(j2 - j);
        LIZ.append(']');
        LIZ.append("[Json - ");
        LIZ.append(j3 - j2);
        LIZ.append(']');
        LIZ.append("[Disk - ");
        LIZ.append(System.currentTimeMillis() - j3);
        LIZ.append(']');
        LIZ.append("[Total - ");
        LIZ.append(System.currentTimeMillis() - j);
        LIZ.append(']');
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZLLL("JKL", LIZIZ);
    }

    public void LJIIJ(String str, String str2, C84418XBe exceptionResult) {
        o.LJIIJ(exceptionResult, "exceptionResult");
        if (this.LJIIJJI != null) {
            XCZ.LJFF(new AqS162S0200000_15((XDF) this, exceptionResult, 24));
        }
    }

    public /* synthetic */ XDF(X62 x62, G0J g0j, XCN xcn, String str) {
        this(x62, g0j, xcn, str, null);
    }

    public void LJIIL(long j, long j2, long j3, R result) {
        o.LJIIJ(result, "result");
        Object responseData = result.getResponseData();
        if (responseData != null && this.LJIIJJI != null) {
            XCZ.LJFF(new AqS162S0200000_15(this, responseData, 25));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDF(X62 x62, G0J g0j, XCN callbackManager, String str, XCG xcg) {
        super(str, callbackManager);
        boolean z;
        o.LJIIJ(callbackManager, "callbackManager");
        this.LJIIIIZZ = x62;
        this.LJIIIZ = g0j;
        this.LJIIJ = callbackManager;
        this.LJIIJJI = str;
        this.LJI = "";
        if (xcg != null && xcg.LJJIL == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LJII = z;
    }

    public void LJIIJJI(long j, long j2, long j3, String json, R r) {
        o.LJIIJ(json, "json");
        LJIIL(j, j2, j3, r);
    }
}
