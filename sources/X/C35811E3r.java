package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.E3r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35811E3r extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C35811E3r LJLIL = new C35811E3r();

    public C35811E3r() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        boolean z;
        if (!C36152EGu.LJ() && ((Boolean) C34597Dhx.LIZ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        ?? LIZJ = E3F.LIZJ("FeedAssmethreadOpt", C37154Ei6.LJLIL, C38017Ew1.LJLIL, z);
        if (LIZJ != 0) {
            return LIZJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
