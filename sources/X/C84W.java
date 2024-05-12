package X;

/* renamed from: X.84W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84W extends AbstractC65781Prl implements InterfaceC65784Pro<Double> {
    public static final C84W LJLIL = new C84W();

    public C84W() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Double invoke() {
        double d = 9.0f;
        double doubleValue = 16 - ((Number) C84X.LIZ.getValue()).doubleValue();
        if (doubleValue < 12.0d) {
            doubleValue = 12.0d;
        }
        return Double.valueOf(d / doubleValue);
    }
}
