package X;

/* renamed from: X.Dr7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35165Dr7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35165Dr7 LJLIL = new C35165Dr7();

    public C35165Dr7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        C62822Ol8 c62822Ol8 = C35166Dr8.LIZ;
        if (((Number) c62822Ol8.getValue()).floatValue() >= 1.0f || ((float) Math.random()) <= ((Number) c62822Ol8.getValue()).floatValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
