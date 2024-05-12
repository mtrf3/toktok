package X;

/* loaded from: classes7.dex */
public final class EM9 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final EM9 LJLIL = new EM9();

    public EM9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = Runtime.getRuntime().availableProcessors();
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
