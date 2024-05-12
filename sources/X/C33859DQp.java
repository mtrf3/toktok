package X;

/* renamed from: X.DQp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33859DQp extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33859DQp LJLIL = new C33859DQp();

    public C33859DQp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        int intValue = ((Number) C33857DQn.LIZIZ.getValue()).intValue();
        boolean z = true;
        if (1 > intValue || intValue >= 6) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
