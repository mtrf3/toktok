package X;

/* renamed from: X.Dih, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34643Dih extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34643Dih LJLIL = new C34643Dih();

    public C34643Dih() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C34646Dik.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
