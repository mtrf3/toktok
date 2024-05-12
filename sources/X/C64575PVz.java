package X;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;

/* renamed from: X.PVz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64575PVz implements InterfaceC48121Iub {
    public static final Charset LIZLLL = Charset.forName("UTF-8");
    public final PW2 LIZ;
    public volatile java.util.Set<String> LIZIZ;
    public volatile PPJ LIZJ;

    public C64575PVz() {
        this(PW2.LIZ);
    }

    public C64575PVz(PW2 pw2) {
        this.LIZIZ = Collections.emptySet();
        this.LIZJ = PPJ.NONE;
        this.LIZ = pw2;
    }

    public static boolean LIZ(C64533PUj c64533PUj) {
        try {
            C64533PUj c64533PUj2 = new C64533PUj();
            long j = c64533PUj.LJLILLLLZI;
            if (j >= 64) {
                j = 64;
            }
            c64533PUj.LIZLLL(c64533PUj2, 0L, j);
            int i = 0;
            while (!c64533PUj2.LLJ()) {
                int LJIJ = c64533PUj2.LJIJ();
                if (Character.isISOControl(LJIJ) && !Character.isWhitespace(LJIJ)) {
                    return false;
                }
                i++;
                if (i >= 16) {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0254  */
    @Override // X.InterfaceC48121Iub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C64598PWw intercept(X.PXZ r22) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64575PVz.intercept(X.PXZ):X.PWw");
    }

    public final void LIZIZ(C64606PXe c64606PXe, int i) {
        String LJIIJ;
        if (this.LIZIZ.contains(c64606PXe.LJ(i))) {
            LJIIJ = "██";
        } else {
            LJIIJ = c64606PXe.LJIIJ(i);
        }
        PW2 pw2 = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c64606PXe.LJ(i));
        LIZ.append(": ");
        LIZ.append(LJIIJ);
        pw2.log(X1D.LIZIZ(LIZ));
    }
}
