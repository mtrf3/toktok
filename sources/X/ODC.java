package X;

import com.bytedance.zoin.zstd.ZstdInputStream;
import defpackage.i0;

/* loaded from: classes11.dex */
public final class ODC {
    public static void LIZ(OEF oef, OEF oef2) {
        ZstdInputStream zstdInputStream;
        OEG oeg = new OEG(oef);
        try {
            zstdInputStream = new ZstdInputStream(oeg);
        } catch (Throwable th) {
            th = th;
            zstdInputStream = null;
        }
        try {
            byte[] bArr = new byte[32768];
            while (true) {
                int read = zstdInputStream.read(bArr);
                if (read != -1) {
                    oef2.LJJI(0, bArr, read);
                } else {
                    C78609UtB.LJJIIZI(oeg);
                    C78609UtB.LJJIIZI(zstdInputStream);
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C78609UtB.LJJIIZI(oeg);
            C78609UtB.LJJIIZI(zstdInputStream);
            throw th;
        }
    }

    public static void LIZIZ(int i, String str, String str2) {
        OC6.LIZ("gecko-debug-tag", str2);
        OD6.LJI(3, str2, i, str);
        throw new C61578OEs(i0.LJFF("unzip file ", str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x018d, code lost:
    
        r0 = X.X1D.LIZ();
        r0.append(r1);
        r0.append(",retry count:");
        r0.append(r26);
        LIZIZ(31, r25, X.X1D.LIZIZ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016f, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("directory traversal, dir:");
        r1.append(r8);
        r1.append(", channel:");
        r1.append(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018c, code lost:
    
        throw new java.lang.RuntimeException(X.X1D.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.OEG r23, java.lang.String r24, java.lang.String r25, int r26) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ODC.LIZJ(X.OEG, java.lang.String, java.lang.String, int):void");
    }
}
