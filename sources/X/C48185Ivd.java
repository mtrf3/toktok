package X;

import java.io.IOException;

/* renamed from: X.Ivd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48185Ivd extends IOException {
    public static final long serialVersionUID = -1098012010869697449L;
    public final int LJLIL;
    public final long LJLILLLLZI;

    public long getLength() {
        return this.LJLILLLLZI;
    }

    public int getMaxSize() {
        return this.LJLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C48185Ivd(int r3, long r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Download file too large: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " exceed maxsize: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            r2.LJLIL = r3
            r2.LJLILLLLZI = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48185Ivd.<init>(int, long):void");
    }
}
