package X;

/* renamed from: X.0K0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0K0 {
    public static /* synthetic */ void LIZ(C0K1 c0k1, String str, String str2, boolean z, long j, boolean z2, int i) {
        boolean z3;
        boolean z4 = z2;
        boolean z5 = z;
        long j2 = j;
        if ((i & 4) != 0) {
            z5 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 16) != 0) {
            j2 = -1;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        c0k1.LJFF(j2, str, str2, z5, z3, z4);
    }
}
