package X;

/* renamed from: X.Diw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34658Diw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34658Diw LJLIL = new C34658Diw();

    public C34658Diw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C34660Diy.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
