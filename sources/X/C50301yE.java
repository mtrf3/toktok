package X;

/* renamed from: X.1yE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50301yE extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C50301yE LJLIL = new C50301yE();

    public C50301yE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        long LIZ = C30725C4b.LIZ();
        C08810Wf c08810Wf = C32021Nm.LIZIZ;
        if (c08810Wf != null) {
            j = c08810Wf.LJII;
        } else {
            j = LIZ;
        }
        return Long.valueOf((LIZ - j) / 1000);
    }
}
