package X;

/* renamed from: X.Ygb, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88021Ygb extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88021Ygb LJLIL = new C88021Ygb();

    public C88021Ygb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C88024Yge.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
