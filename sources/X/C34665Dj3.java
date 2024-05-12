package X;

/* renamed from: X.Dj3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34665Dj3 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34665Dj3 LJLIL = new C34665Dj3();

    public C34665Dj3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C34664Dj2.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
