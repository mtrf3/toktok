package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XBe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84418XBe {
    public int LIZ;
    public String LIZIZ;
    public final Exception LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;

    public final String toString() {
        if (this.LIZJ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ExceptionResult{errorCode=");
            LIZ.append(this.LIZ);
            LIZ.append(", msg='");
            Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", requestUrl='");
            Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", selectedHost='");
            Q89.LIZIZ(LIZ, this.LJ, '\'', ", remoteIp='");
            Q89.LIZIZ(LIZ, this.LJFF, '\'', ", exception=");
            Exception exc = this.LIZJ;
            if (exc != null) {
                LIZ.append(exc.getMessage());
                LIZ.append('}');
                return X1D.LIZIZ(LIZ);
            }
            o.LJIIZILJ();
            throw null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ExceptionResult{errorCode=");
        LIZ2.append(this.LIZ);
        LIZ2.append(", msg='");
        LIZ2.append(this.LIZIZ);
        LIZ2.append(", requestUrl='");
        Q89.LIZIZ(LIZ2, this.LIZLLL, '\'', ", selectedHost='");
        Q89.LIZIZ(LIZ2, this.LJ, '\'', ", remoteIp='");
        return C77800Ug8.LIZJ(LIZ2, this.LJFF, '\'', '}', LIZ2);
    }

    public C84418XBe(Exception exc) {
        int i;
        this.LIZ = -1;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LIZJ = exc;
        if (exc instanceof C84434XBu) {
            this.LIZ = ((C84434XBu) exc).getStatus_code();
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc instanceof HQ4) {
            this.LIZ = ((HQ4) exc).getStatusCode();
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc instanceof XDI) {
            this.LIZ = 10008;
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc instanceof XB9) {
            this.LIZ = 10015;
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc instanceof XB6) {
            this.LIZ = 10013;
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc instanceof XB2) {
            this.LIZ = 10010;
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc instanceof C10850bh) {
            this.LIZ = 10012;
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc != null) {
            if (o.LJ("network unavailable", exc.getMessage())) {
                i = 10011;
            } else {
                i = 10005;
            }
            this.LIZ = i;
            String message = exc.getMessage();
            this.LIZIZ = message;
            if (message != null && message.length() != 0) {
                return;
            }
            this.LIZIZ = exc.toString();
            return;
        }
        this.LIZ = 1;
        this.LIZIZ = C84846XRq.LIZ(1);
    }

    public C84418XBe(int i) {
        this.LIZ = i;
        this.LIZIZ = C84846XRq.LIZ(i);
        this.LIZJ = null;
    }

    public C84418XBe(int i, Exception exc) {
        this.LIZ = i;
        this.LIZIZ = C84846XRq.LIZ(i);
        this.LIZJ = exc;
    }

    public final void LIZ(String str, String str2, String str3) {
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
    }
}
