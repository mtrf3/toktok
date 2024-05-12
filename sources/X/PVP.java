package X;

import java.nio.charset.Charset;

/* loaded from: classes12.dex */
public abstract class PVP {
    public long LIZ() {
        return -1L;
    }

    public abstract C39745Fin LIZIZ();

    public abstract void LJ(PVU pvu);

    public static PVJ LIZJ(C39745Fin c39745Fin, String str) {
        Charset charset = PVA.LJIIIIZZ;
        if (c39745Fin != null) {
            Charset LIZ = c39745Fin.LIZ(null);
            if (LIZ == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(c39745Fin);
                LIZ2.append("; charset=utf-8");
                c39745Fin = C39745Fin.LIZJ(X1D.LIZIZ(LIZ2));
            } else {
                charset = LIZ;
            }
        }
        return LIZLLL(c39745Fin, str.getBytes(charset));
    }

    public static PVJ LIZLLL(C39745Fin c39745Fin, byte[] bArr) {
        int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            return new PVJ(length, c39745Fin, bArr);
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
