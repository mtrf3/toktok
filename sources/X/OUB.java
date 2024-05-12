package X;

/* loaded from: classes11.dex */
public final class OUB extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final OUB LJLIL = new OUB();

    public OUB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        if (HG3.LJIILL().isNewUser()) {
            return "sign_up";
        }
        return "login";
    }
}
