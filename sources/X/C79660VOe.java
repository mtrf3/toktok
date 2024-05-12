package X;

/* renamed from: X.VOe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79660VOe {
    public static int LIZ(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }
}
