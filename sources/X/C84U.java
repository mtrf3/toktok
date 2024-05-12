package X;

/* renamed from: X.84U, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84U extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final C84U LJLIL = new C84U();

    public C84U() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        return Float.valueOf(((int) Math.rint(((Number) C84V.LIZIZ.getValue()).doubleValue() * 100)) / 100);
    }
}
