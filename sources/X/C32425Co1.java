package X;

import defpackage.b1;

/* renamed from: X.Co1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32425Co1 extends RuntimeException {
    public final C32420Cnw LJLIL;

    public long getResourceId() {
        return this.LJLIL.LIZIZ;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.toString());
        LIZ.append("\navailable disk space:");
        LIZ.append(C32431Co7.LIZ());
        LIZ.append("KB\n");
        LIZ.append(super.getMessage());
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String runtimeException = super.toString();
        Throwable cause = getCause();
        if (cause != null && cause != this) {
            StringBuilder LIZJ = b1.LIZJ(runtimeException, "\n");
            LIZJ.append(cause.toString());
            return X1D.LIZIZ(LIZJ);
        }
        return runtimeException;
    }

    public C32420Cnw getResourceRequest() {
        return this.LJLIL;
    }

    public C32425Co1(C32420Cnw c32420Cnw) {
        this.LJLIL = c32420Cnw;
    }

    public C32425Co1(String str, C32420Cnw c32420Cnw) {
        super(str);
        this.LJLIL = c32420Cnw;
    }

    public C32425Co1(String str, Throwable th, C32420Cnw c32420Cnw) {
        super(str, th);
        this.LJLIL = c32420Cnw;
    }
}
