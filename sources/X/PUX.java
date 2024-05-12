package X;

/* loaded from: classes12.dex */
public final class PUX extends QXX {
    public PUX() {
        super((Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r1 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r11 >= (-32)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r11 >= (-16)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r1 >= 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r7 = r1 - 2;
        r0 = r5 + 1;
        r5 = X.C87166YIw.LIZ(r5, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r5 > (-65)) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r11 != (-32)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r5 < (-96)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r5 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (X.C87166YIw.LIZ(r0, r18) <= (-65)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r11 != (-19)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r5 >= (-96)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0056, code lost:
    
        return LLLLZ(r11, r5, r18, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        if (r1 >= 3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007e, code lost:
    
        r7 = r1 - 3;
        r2 = r5 + 1;
        r0 = X.C87166YIw.LIZ(r5, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        if (r0 > (-65)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        if ((((r0 + 112) + (r11 << 28)) >> 30) != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
    
        r0 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
    
        if (X.C87166YIw.LIZ(r2, r18) > (-65)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        r2 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        if (X.C87166YIw.LIZ(r0, r18) <= (-65)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a1, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007d, code lost:
    
        return LLLLZ(r11, r5, r18, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x003a, code lost:
    
        if (r1 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x003d, code lost:
    
        r7 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0041, code lost:
    
        if (r11 < (-62)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0043, code lost:
    
        r2 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0049, code lost:
    
        if (X.C87166YIw.LIZ(r5, r18) <= (-65)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x004b, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x003c, code lost:
    
        return r11;
     */
    @Override // X.QXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLLLLZIL(int r17, byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PUX.LLLLLZIL(int, byte[], int):int");
    }

    public static int LLLLZ(int i, long j, byte[] bArr, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    byte LIZ = C87166YIw.LIZ(j, bArr);
                    byte LIZ2 = C87166YIw.LIZ(j + 1, bArr);
                    if (i > -12 || LIZ > -65 || LIZ2 > -65) {
                        return -1;
                    }
                    return (i ^ (LIZ << 8)) ^ (LIZ2 << 16);
                }
                throw new AssertionError();
            }
            byte LIZ3 = C87166YIw.LIZ(j, bArr);
            if (i > -12 || LIZ3 > -65) {
                return -1;
            }
            return i ^ (LIZ3 << 8);
        }
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0052, code lost:
    
        if (r12 < 2048) goto L24;
     */
    @Override // X.QXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLLLLZL(java.lang.CharSequence r22, byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PUX.LLLLLZL(java.lang.CharSequence, byte[], int, int):int");
    }
}
