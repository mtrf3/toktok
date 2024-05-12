package X;

/* loaded from: classes7.dex */
public final class DQI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DQI LJLIL = new DQI();

    public DQI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (DQG.LIZ() != 1 && DQG.LIZ() != 2 && DQG.LIZ() != 3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
