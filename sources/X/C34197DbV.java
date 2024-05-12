package X;

/* renamed from: X.DbV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34197DbV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34197DbV LJLIL = new C34197DbV();

    public C34197DbV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C34203Dbb.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
