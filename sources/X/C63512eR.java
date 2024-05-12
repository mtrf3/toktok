package X;

/* renamed from: X.2eR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63512eR extends AbstractC65781Prl implements InterfaceC88471Ynr<Float, Float, Boolean> {
    public static final C63512eR LJLIL = new C63512eR();

    public C63512eR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Float f, Float f2) {
        boolean z;
        f.floatValue();
        if (f2.floatValue() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
