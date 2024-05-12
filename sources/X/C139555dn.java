package X;

/* renamed from: X.5dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139555dn {
    public static final OSZ<Integer, Integer> LIZ(int i, int i2, int i3) {
        if (i >= i3) {
            return new OSZ<>(0, 0);
        }
        return new OSZ<>(Integer.valueOf(i), Integer.valueOf(Math.min(i2, i3)));
    }
}
