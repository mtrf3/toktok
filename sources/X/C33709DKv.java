package X;

/* renamed from: X.DKv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33709DKv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33709DKv LJLIL = new C33709DKv();

    public C33709DKv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33706DKs.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
