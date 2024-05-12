package X;

/* loaded from: classes9.dex */
public final class JQV extends QZV {
    public final /* synthetic */ JQT LIZ;
    public final /* synthetic */ Integer LIZIZ;

    @Override // X.QZV
    public final void LJIIZILJ() {
        JQX LJIJI = this.LIZ.LJIJI(1);
        if (LJIJI != null) {
            LJIJI.LJLLLL();
        }
        JQU LJIJJLI = this.LIZ.LJIJJLI();
        Integer num = this.LIZIZ;
        if (LJIJJLI.LIZJ) {
            LJIJJLI.LIZJ = false;
            LJIJJLI.removeMessages(1);
        } else {
            LJIJJLI.LIZIZ = true;
            LJIJJLI.obtainMessage(1, num).sendToTarget();
        }
    }

    public JQV(JQT jqt, Integer num) {
        this.LIZ = jqt;
        this.LIZIZ = num;
    }
}
