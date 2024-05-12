package X;

/* renamed from: X.DqJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35115DqJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35115DqJ LJLIL = new C35115DqJ();

    public C35115DqJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C35116DqK.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
