package X;

/* renamed from: X.2My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57362My extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, Boolean> {
    public static final C57362My LJLIL = new C57362My();

    public C57362My() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Integer num) {
        boolean z;
        if (num.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
