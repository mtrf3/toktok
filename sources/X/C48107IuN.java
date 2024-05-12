package X;

import android.text.TextUtils;

/* renamed from: X.IuN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48107IuN {
    public final InterfaceC37276Ek4<?> LIZ;
    public final InterfaceC48133Iun LIZIZ;
    public final C48105IuL LIZJ;
    public C48104IuK LIZLLL;
    public long LJ;
    public long LJFF;
    public boolean LJI;

    public static C64598PWw LIZ(InterfaceC48133Iun interfaceC48133Iun) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400102, "okhttp3/Call", "execute", interfaceC48133Iun, new Object[0], "okhttp3.Response", new C65300Pk0(false, "()Lokhttp3/Response;", "-908877405586748330"));
        return LIZJ.LIZ ? (C64598PWw) LIZJ.LIZIZ : interfaceC48133Iun.execute();
    }

    public final void LIZLLL(Exception exc) {
        C48104IuK c48104IuK;
        String str;
        if (this.LIZ == null || (c48104IuK = this.LIZLLL) == null) {
            return;
        }
        try {
            if (c48104IuK.LJLJJI == null && (exc instanceof C64799Pbv)) {
                str = ((C64799Pbv) exc).getRequestLog();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) || this.LIZLLL.LJLJJI == null) {
                return;
            }
            InterfaceC37276Ek4<?> interfaceC37276Ek4 = this.LIZ;
            if (!(interfaceC37276Ek4 instanceof InterfaceC37818Eso)) {
                return;
            }
            ((InterfaceC37818Eso) interfaceC37276Ek4).doCollect();
            Object obj = this.LIZLLL.LJLJJI.LIZ.LJFF;
            if (!(obj instanceof C64672PZs)) {
                return;
            }
        } catch (Throwable unused) {
        }
    }

    public C48107IuN(InterfaceC37276Ek4<?> interfaceC37276Ek4, C48105IuL c48105IuL) {
        this.LIZ = interfaceC37276Ek4;
        this.LIZJ = c48105IuL;
    }

    public final void LIZIZ(int i, Throwable th) {
        C47456Ijs c47456Ijs;
        C48109IuP c48109IuP = C48114IuU.LIZ;
        String str = this.LIZJ.LIZ;
        if (str == null) {
            c48109IuP.getClass();
            c47456Ijs = null;
        } else {
            c47456Ijs = c48109IuP.LIZIZ.get(str);
        }
        long currentTimeMillis = System.currentTimeMillis();
        C48112IuS c48112IuS = new C48112IuS();
        long j = this.LJ;
        c48112IuS.LJ = j;
        c48112IuS.LJFF = this.LJFF;
        c48112IuS.LJII = currentTimeMillis;
        c48112IuS.LJJJ = i;
        if (c47456Ijs != null) {
            c48112IuS.LIZ = c47456Ijs.LJI;
        }
        if (th == null) {
            C64735Pat.LIZLLL(currentTimeMillis - j, j, this.LIZJ.LIZ, this.LIZLLL.LIZIZ("X-TT-LOGID", ""), c48112IuS);
        } else {
            C64735Pat.LIZIZ(currentTimeMillis - j, j, this.LIZJ.LIZ, this.LIZLLL.LIZIZ("X-TT-LOGID", ""), c48112IuS, th);
        }
    }

    public C48107IuN(C64587PWl c64587PWl, C48105IuL c48105IuL) {
        this.LIZIZ = c64587PWl;
        this.LIZJ = c48105IuL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r4 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r25, java.lang.String r26, java.lang.Throwable r27) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48107IuN.LIZJ(int, java.lang.String, java.lang.Throwable):void");
    }
}
