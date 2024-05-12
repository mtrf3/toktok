package X;

/* renamed from: X.DfZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34449DfZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34449DfZ LJLIL = new C34449DfZ();

    public C34449DfZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34450Dfa.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
