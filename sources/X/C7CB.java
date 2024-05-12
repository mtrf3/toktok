package X;

/* renamed from: X.7CB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CB LJLIL = new C7CB();

    public C7CB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C7CN.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
