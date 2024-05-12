package X;

/* loaded from: classes8.dex */
public final class GJ1 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final GJ1 LJLIL = new GJ1();

    public GJ1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) GJ4.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
