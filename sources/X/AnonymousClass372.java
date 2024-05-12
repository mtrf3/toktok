package X;

/* renamed from: X.372, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass372 extends AbstractC65781Prl implements InterfaceC88471Ynr<Float, Float, Boolean> {
    public static final AnonymousClass372 LJLIL = new AnonymousClass372();

    public AnonymousClass372() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Float f, Float f2) {
        boolean z;
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        if (Math.abs(floatValue2) > Math.abs(floatValue) && floatValue2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
