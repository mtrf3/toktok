package X;

/* renamed from: X.Pmf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65465Pmf extends AbstractC65466Pmg {
    static {
        boolean z;
        if (C37322Eko.LIZ.intValue() == 1 && C37322Eko.LIZIZ.intValue() >= 15) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {C37322Eko.LIZJ};
        if (z) {
        } else {
            throw new IllegalStateException(C45804HyK.LJIJI("You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.19.0 of the YouTube Data API library.", objArr));
        }
    }

    public C65465Pmf(C65472Pmm c65472Pmm) {
        super(c65472Pmm);
    }
}
