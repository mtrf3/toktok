package X;

/* renamed from: X.Ijn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC47451Ijn implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    public final void LIZ() {
        if (C47455Ijr.LJ != null) {
            try {
                InterfaceC47447Ijj interfaceC47447Ijj = C47455Ijr.LJ;
                String str = this.LJLIL;
                int i = this.LJLILLLLZI;
                long j = this.LJLJI;
                long j2 = this.LJLJJI;
                C47450Ijm c47450Ijm = new C47450Ijm();
                c47450Ijm.LIZ = str;
                c47450Ijm.LIZIZ = i;
                c47450Ijm.LIZJ = (int) j;
                c47450Ijm.LIZLLL = j2;
                ((C47448Ijk) interfaceC47447Ijj).LIZLLL(c47450Ijm);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47451Ijn(String str, String str2, int i, long j, long j2) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }
}
