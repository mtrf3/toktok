package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;

/* renamed from: X.8FO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FO {
    public static final int[] LIZ = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    public static final int[][] LIZIZ = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, 255, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, LiveTryModeCountDownThresholdSetting.DEFAULT}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, 136, LiveTryModeCountDownThresholdSetting.DEFAULT, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, 218, 130, LiveCoverMinSizeSetting.DEFAULT, 162, 181, 102, LiveTryModeCountDownThresholdSetting.DEFAULT, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, LiveTryModeCountDownThresholdSetting.DEFAULT, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, LiveCoverMinSizeSetting.DEFAULT, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};
    public static final int[] LIZJ = new int[256];
    public static final int[] LIZLLL = new int[255];

    static {
        int i = 0;
        int i2 = 1;
        do {
            LIZLLL[i] = i2;
            LIZJ[i2] = i;
            i2 <<= 1;
            if (i2 >= 256) {
                i2 ^= 301;
            }
            i++;
        } while (i < 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0093, code lost:
    
        throw new java.lang.IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(java.lang.String.valueOf(r13)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(int r13, java.lang.CharSequence r14) {
        /*
            java.lang.String r14 = (java.lang.String) r14
            int r5 = r14.length()
            r3 = 0
            r1 = 0
        L8:
            int[] r0 = X.C8FO.LIZ
            r0 = r0[r1]
            if (r0 != r13) goto L1e
            if (r1 < 0) goto L84
            int[][] r0 = X.C8FO.LIZIZ
            r12 = r0[r1]
            char[] r2 = new char[r13]
            r0 = 0
        L17:
            if (r0 >= r13) goto L25
            r2[r0] = r3
            int r0 = r0 + 1
            goto L17
        L1e:
            int r1 = r1 + 1
            r0 = 16
            if (r1 >= r0) goto L84
            goto L8
        L25:
            r4 = 0
        L26:
            if (r4 >= r5) goto L70
            int r11 = r13 + (-1)
            char r10 = r2[r11]
            char r0 = r14.charAt(r4)
            r10 = r10 ^ r0
        L31:
            int[] r9 = X.C8FO.LIZJ
            int[] r8 = X.C8FO.LIZLLL
            if (r11 <= 0) goto L58
            if (r10 == 0) goto L51
            r7 = r12[r11]
            if (r7 == 0) goto L51
            int r0 = r11 + (-1)
            char r6 = r2[r0]
            r1 = r9[r10]
            r0 = r9[r7]
            int r1 = r1 + r0
            int r0 = r1 % 255
            r0 = r8[r0]
            r0 = r0 ^ r6
            char r0 = (char) r0
            r2[r11] = r0
        L4e:
            int r11 = r11 + (-1)
            goto L31
        L51:
            int r0 = r11 + (-1)
            char r0 = r2[r0]
            r2[r11] = r0
            goto L4e
        L58:
            if (r10 == 0) goto L6d
            r0 = r12[r3]
            if (r0 == 0) goto L6d
            r1 = r9[r10]
            r0 = r9[r0]
            int r1 = r1 + r0
            int r0 = r1 % 255
            r0 = r8[r0]
            char r0 = (char) r0
            r2[r3] = r0
        L6a:
            int r4 = r4 + 1
            goto L26
        L6d:
            r2[r3] = r3
            goto L6a
        L70:
            char[] r1 = new char[r13]
        L72:
            if (r3 >= r13) goto L7f
            int r0 = r13 - r3
            int r0 = r0 + (-1)
            char r0 = r2[r0]
            r1[r3] = r0
            int r3 = r3 + 1
            goto L72
        L7f:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            return r0
        L84:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Illegal number of error correction codewords specified: "
            java.lang.String r0 = java.lang.String.valueOf(r13)
            java.lang.String r0 = r1.concat(r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8FO.LIZ(int, java.lang.CharSequence):java.lang.String");
    }
}
