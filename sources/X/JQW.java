package X;

/* loaded from: classes9.dex */
public final class JQW extends QZV {
    public final /* synthetic */ JQT LIZ;
    public final /* synthetic */ Integer LIZIZ;

    @Override // X.QZV
    public final void LJIIZILJ() {
        C49133JQb.LIZ("TLVideoPlayController", "1st holder finish");
        JQX LJIJI = this.LIZ.LJIJI(0);
        if (LJIJI != null) {
            LJIJI.LJLLLL();
        }
        C49133JQb.LIZIZ("TLVideoPlayController", "start play second");
        JQX LJIJI2 = this.LIZ.LJIJI(1);
        if (LJIJI2 != null) {
            JQT jqt = this.LIZ;
            Integer num = this.LIZIZ;
            jqt.LJJIJIL(LJIJI2, num, new JQV(jqt, num));
        }
    }

    public JQW(JQT jqt, Integer num) {
        this.LIZ = jqt;
        this.LIZIZ = num;
    }
}
