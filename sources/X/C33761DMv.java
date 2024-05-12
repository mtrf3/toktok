package X;

/* renamed from: X.DMv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33761DMv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33761DMv LJLIL = new C33761DMv();

    public C33761DMv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C33760DMu.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
