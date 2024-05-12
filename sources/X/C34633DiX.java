package X;

/* renamed from: X.DiX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34633DiX extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34633DiX LJLIL = new C34633DiX();

    public C34633DiX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34631DiV.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
