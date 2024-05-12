package X;

/* loaded from: classes10.dex */
public final class L1I extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final L1I LJLIL = new L1I();

    public L1I() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (L1F.LIZ() != 1 && L1F.LIZ() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
