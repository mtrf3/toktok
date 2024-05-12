package X;

/* renamed from: X.Dj4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34666Dj4 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34666Dj4 LJLIL = new C34666Dj4();

    public C34666Dj4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34664Dj2.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
