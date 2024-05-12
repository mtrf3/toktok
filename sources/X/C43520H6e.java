package X;

/* renamed from: X.H6e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43520H6e extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC43519H6d> {
    public static final C43520H6e LJLIL = new C43520H6e();

    public C43520H6e() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC43519H6d invoke() {
        int LIZ = C43521H6f.LIZ();
        if (LIZ != 0) {
            if (LIZ == 1) {
                return new C87675Yb1();
            }
            throw new IllegalArgumentException("speed test argument not supported");
        }
        return new C87676Yb2();
    }
}
