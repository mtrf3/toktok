package X;

/* loaded from: classes10.dex */
public final class LM1 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final LM1 LJLIL = new LM1();

    public LM1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (C54305LSz.LIZLLL()) {
            i = 1;
        } else if (C54305LSz.LJ()) {
            i = 2;
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
