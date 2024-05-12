package X;

/* loaded from: classes7.dex */
public final class EOM extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final EOM LJLIL = new EOM();

    public EOM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        try {
            FFL.LJIIIZ().getClass();
            String[] strArr = (String[]) FFL.LJIIZILJ(0, null, "network_backend_api_caller_opt_list", true);
            if (strArr == null) {
                return new String[0];
            }
            return strArr;
        } catch (Throwable unused) {
            return new String[0];
        }
    }
}
