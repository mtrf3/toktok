package X;

import com.bytedance.fresco.heif.HeifDecoder;

/* renamed from: X.W8s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81806W8s implements InterfaceC81843WAd {
    public static final String[] LIZ;
    public static final int LIZIZ;

    static {
        String[] strArr = {"heic", "heix", "hevc", "hevx", "mif1", "msf1"};
        LIZ = strArr;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ftyp");
        LIZ2.append(strArr[0]);
        LIZIZ = C78977Uz7.LJJIII(X1D.LIZIZ(LIZ2)).length;
    }

    @Override // X.InterfaceC81843WAd
    public final int getHeaderSize() {
        return LIZIZ;
    }

    @Override // X.InterfaceC81843WAd
    public final C81828W9o LIZ(int i, byte[] bArr) {
        if (i < LIZIZ || bArr[3] < 8) {
            return null;
        }
        for (String str : LIZ) {
            int length = bArr.length;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ftyp");
            LIZ2.append(str);
            if (C78977Uz7.LJJJJLI(bArr, length, LIZIZ, C78977Uz7.LJJIII(X1D.LIZIZ(LIZ2))) > -1) {
                return HeifDecoder.HEIF_FORMAT;
            }
        }
        return null;
    }
}
