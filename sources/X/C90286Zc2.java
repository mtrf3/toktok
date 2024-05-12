package X;

/* renamed from: X.Zc2, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90286Zc2 {
    public static boolean LIZ(byte[] bArr, int i) {
        int LIZ;
        int i2 = 0;
        while (i2 < i && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 < i) {
            while (i2 < i) {
                int i3 = i2 + 1;
                byte b = bArr[i2];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i || b < -62) {
                            return false;
                        }
                        i2 = i3 + 1;
                        if (bArr[i3] > -65) {
                            return false;
                        }
                    } else {
                        if (b < -16) {
                            if (i3 >= i - 1) {
                                LIZ = C90389Zdh.LIZ(i3, bArr, i);
                            } else {
                                int i4 = i3 + 1;
                                byte b2 = bArr[i3];
                                if (b2 > -65) {
                                    return false;
                                }
                                if (b == -32) {
                                    if (b2 < -96) {
                                        return false;
                                    }
                                } else if (b == -19 && b2 >= -96) {
                                    return false;
                                }
                                i2 = i4 + 1;
                                if (bArr[i4] > -65) {
                                    return false;
                                }
                            }
                        } else if (i3 >= i - 2) {
                            LIZ = C90389Zdh.LIZ(i3, bArr, i);
                        } else {
                            int i5 = i3 + 1;
                            byte b3 = bArr[i3];
                            if (b3 > -65 || (((b << 28) + (b3 + 112)) >> 30) != 0) {
                                return false;
                            }
                            int i6 = i5 + 1;
                            if (bArr[i5] > -65) {
                                return false;
                            }
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                                return false;
                            }
                        }
                        if (LIZ != 0) {
                            return false;
                        }
                    }
                }
                i2 = i3;
            }
        }
        return true;
    }
}
