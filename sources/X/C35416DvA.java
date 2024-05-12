package X;

/* renamed from: X.DvA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35416DvA extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35416DvA LJLIL = new C35416DvA();

    public C35416DvA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (C35408Dv2.LIZ() != 1 && C35408Dv2.LIZ() != 2 && C35408Dv2.LIZ() != 3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
