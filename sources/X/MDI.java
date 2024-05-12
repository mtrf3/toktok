package X;

/* loaded from: classes10.dex */
public final class MDI extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final MDI LJLIL = new MDI();

    public MDI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateUnsubscribeStatus main thread adapter notify combineAdapter = ");
        LIZ.append(MDJ.LIZLLL);
        LIZ.append(", singleAdapter = ");
        LIZ.append(MDJ.LJ);
        C221018lt.LJFF("SNUnsubscribeDataHelper", X1D.LIZIZ(LIZ));
        C56818MRq c56818MRq = MDJ.LIZLLL;
        if (c56818MRq != null) {
            c56818MRq.notifyDataSetChanged();
        }
        C56818MRq c56818MRq2 = MDJ.LJ;
        if (c56818MRq2 != null) {
            c56818MRq2.notifyDataSetChanged();
        }
        return C76800UCe.LIZ;
    }
}
