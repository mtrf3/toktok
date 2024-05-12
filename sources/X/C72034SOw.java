package X;

/* renamed from: X.SOw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72034SOw extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, Boolean> {
    public static final C72034SOw LJLIL = new C72034SOw();

    public C72034SOw() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Integer num) {
        Integer num2 = num;
        boolean z = true;
        if (num2 == null || (num2.intValue() != 1 && num2.intValue() != 2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
