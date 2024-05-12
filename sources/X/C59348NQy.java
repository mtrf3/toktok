package X;

/* renamed from: X.NQy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59348NQy {
    public final C59349NQz LIZ;

    public C59348NQy(C59349NQz c59349NQz) {
        this.LIZ = c59349NQz;
    }

    public static C59348NQy LIZ(NR2 nr2) {
        C59349NQz c59349NQz = (C59349NQz) nr2;
        if (!c59349NQz.LIZLLL) {
            if (!c59349NQz.LJ) {
                return new C59348NQy(c59349NQz);
            }
            throw new IllegalStateException("Viewability session should not be finished");
        }
        throw new IllegalStateException("Viewability session should not be started");
    }
}
