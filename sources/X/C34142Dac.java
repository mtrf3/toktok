package X;

/* renamed from: X.Dac, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34142Dac extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34142Dac LJLIL = new C34142Dac();

    public C34142Dac() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34135DaV.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
