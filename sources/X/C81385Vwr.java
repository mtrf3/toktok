package X;

/* renamed from: X.Vwr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81385Vwr {
    public static void LIZ(C81384Vwq c81384Vwq, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        while (j > 0) {
            long skip = c81384Vwq.skip(j);
            if (skip <= 0) {
                if (c81384Vwq.read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j -= skip;
        }
    }
}
