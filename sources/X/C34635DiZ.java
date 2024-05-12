package X;

/* renamed from: X.DiZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34635DiZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34635DiZ LJLIL = new C34635DiZ();

    public C34635DiZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C33776DNk.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
