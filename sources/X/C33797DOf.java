package X;

/* renamed from: X.DOf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33797DOf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33797DOf LJLIL = new C33797DOf();

    public C33797DOf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33796DOe.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
