package X;

/* renamed from: X.IGe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46328IGe extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C46328IGe LJLIL = new C46328IGe();

    public C46328IGe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C1DG.LIZ().getConfig().getSimPlayerConfig().perfEventEnabledInPlayRequest());
    }
}
