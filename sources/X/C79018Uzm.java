package X;

import java.lang.reflect.Array;

/* renamed from: X.Uzm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79018Uzm implements V04 {
    public static byte[][] LIZIZ(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    public static C79007Uzb LIZ(byte[][] bArr, int i) {
        int length = bArr[0].length;
        int i2 = i * 2;
        int length2 = bArr.length + i2;
        C79007Uzb c79007Uzb = new C79007Uzb(length + i2, length2);
        int length3 = c79007Uzb.LJLJJI.length;
        for (int i3 = 0; i3 < length3; i3++) {
            c79007Uzb.LJLJJI[i3] = 0;
        }
        int i4 = (length2 - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    c79007Uzb.LIZIZ(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return c79007Uzb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x030c, code lost:
    
        if (r5 != null) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ac A[LOOP:13: B:213:0x03aa->B:214:0x03ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d2  */
    @Override // X.V04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C79007Uzb LJ(java.lang.String r20, X.V0B r21, int r22, int r23, java.util.Map<X.EnumC79013Uzh, ?> r24) {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79018Uzm.LJ(java.lang.String, X.V0B, int, int, java.util.Map):X.Uzb");
    }
}
