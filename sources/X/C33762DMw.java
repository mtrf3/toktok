package X;

/* renamed from: X.DMw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33762DMw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33762DMw LJLIL = new C33762DMw();

    public C33762DMw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33760DMu.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
