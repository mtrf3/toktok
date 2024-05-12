package X;

/* loaded from: classes9.dex */
public final class KPD extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final KPD LJLIL = new KPD();

    public KPD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (KPE.LIZ() != 2 && KPE.LIZ() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
