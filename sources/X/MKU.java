package X;

/* loaded from: classes10.dex */
public final class MKU extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final MKU LJLIL = new MKU();

    public MKU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (!C2WG.LIZ().getBoolean("show_guide", false)) {
            C56204M4a.LIZLLL("showGuideIfNeed");
            C2U8.LIZ(new MKV(true));
        }
        return C76800UCe.LIZ;
    }
}
