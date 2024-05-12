package X;

/* renamed from: X.IGf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46329IGf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C46329IGf LJLIL = new C46329IGf();

    public C46329IGf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C1DG.LIZ().getConfig().getSimPlayerConfig().perfEventEnabled());
    }
}
