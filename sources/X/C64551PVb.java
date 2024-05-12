package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.PVb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64551PVb extends PVP {
    public static final C39745Fin LJ = C39745Fin.LIZIZ("multipart/mixed");
    public static final C39745Fin LJFF;
    public static final byte[] LJI;
    public static final byte[] LJII;
    public static final byte[] LJIIIIZZ;
    public final C64537PUn LIZ;
    public final C39745Fin LIZIZ;
    public final List<C64553PVd> LIZJ;
    public long LIZLLL = -1;

    static {
        C39745Fin.LIZIZ("multipart/alternative");
        C39745Fin.LIZIZ("multipart/digest");
        C39745Fin.LIZIZ("multipart/parallel");
        LJFF = C39745Fin.LIZIZ("multipart/form-data");
        LJI = new byte[]{58, 32};
        LJII = new byte[]{XC5.LJFF, 10};
        LJIIIIZZ = new byte[]{45, 45};
    }

    @Override // X.PVP
    public final long LIZ() {
        long j = this.LIZLLL;
        if (j != -1) {
            return j;
        }
        long LJI2 = LJI(null, true);
        this.LIZLLL = LJI2;
        return LJI2;
    }

    @Override // X.PVP
    public final C39745Fin LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.PVP
    public final void LJ(PVU pvu) {
        LJI(pvu, false);
    }

    public static void LJFF(String str, StringBuilder sb) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\n') {
                if (charAt != '\r') {
                    if (charAt != '\"') {
                        sb.append(charAt);
                    } else {
                        sb.append("%22");
                    }
                } else {
                    sb.append("%0D");
                }
            } else {
                sb.append("%0A");
            }
        }
        sb.append('\"');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long LJI(PVU pvu, boolean z) {
        C64533PUj c64533PUj;
        if (z) {
            pvu = new C64533PUj();
            c64533PUj = pvu;
        } else {
            c64533PUj = 0;
        }
        int size = this.LIZJ.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C64553PVd c64553PVd = (C64553PVd) ListProtector.get(this.LIZJ, i);
            C64606PXe c64606PXe = c64553PVd.LIZ;
            PVP pvp = c64553PVd.LIZIZ;
            pvu.write(LJIIIIZZ);
            pvu.c(this.LIZ);
            pvu.write(LJII);
            if (c64606PXe != null) {
                int length = c64606PXe.LIZ.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    pvu.LLIIIZ(c64606PXe.LJ(i2));
                    pvu.write(LJI);
                    pvu.LLIIIZ(c64606PXe.LJIIJ(i2));
                    pvu.write(LJII);
                }
            }
            C39745Fin LIZIZ = pvp.LIZIZ();
            if (LIZIZ != null) {
                pvu.LLIIIZ("Content-Type: ");
                pvu.LLIIIZ(LIZIZ.LIZ);
                pvu.write(LJII);
            }
            long LIZ = pvp.LIZ();
            if (LIZ != -1) {
                pvu.LLIIIZ("Content-Length: ");
                pvu.LJJZZIII(LIZ);
                pvu.write(LJII);
            } else if (z) {
                c64533PUj.LIZ();
                return -1L;
            }
            byte[] bArr = LJII;
            pvu.write(bArr);
            if (z) {
                j += LIZ;
            } else {
                pvp.LJ(pvu);
            }
            pvu.write(bArr);
        }
        byte[] bArr2 = LJIIIIZZ;
        pvu.write(bArr2);
        pvu.c(this.LIZ);
        pvu.write(bArr2);
        pvu.write(LJII);
        if (z) {
            long j2 = j + c64533PUj.LJLILLLLZI;
            c64533PUj.LIZ();
            return j2;
        }
        return j;
    }

    public C64551PVb(C64537PUn c64537PUn, C39745Fin c39745Fin, List<C64553PVd> list) {
        this.LIZ = c64537PUn;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c39745Fin);
        LIZ.append("; boundary=");
        LIZ.append(c64537PUn.utf8());
        this.LIZIZ = C39745Fin.LIZIZ(X1D.LIZIZ(LIZ));
        this.LIZJ = PVA.LJIILIIL(list);
    }
}
