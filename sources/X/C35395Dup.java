package X;

/* renamed from: X.Dup, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35395Dup extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35395Dup LJLIL = new C35395Dup();

    public C35395Dup() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C35393Dun.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
