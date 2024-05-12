package X;

/* renamed from: X.4EZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EZ extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C4EZ LJLIL = new C4EZ();

    public C4EZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        int i = 0;
        if (C106034Ed.LIZ() == 1 || C106034Ed.LIZ() == 2 || C106034Ed.LIZ() == 3) {
            RunnableC106004Ea runnableC106004Ea = new Runnable() { // from class: X.4Ea
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        C106184Es.LIZ(true, null, null, null, 14);
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            };
            int LIZ = C106034Ed.LIZ();
            if (LIZ != 1) {
                if (LIZ != 2) {
                    if (LIZ == 3) {
                        i = 15;
                    }
                } else {
                    i = 10;
                }
            } else {
                i = 5;
            }
            C1DH.LJJIJIIJIL(i * 1000, runnableC106004Ea);
        } else {
            C106184Es.LIZ(true, null, null, null, 14);
        }
        return C76800UCe.LIZ;
    }
}
