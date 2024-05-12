package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IdB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47041IdB {
    public final InterfaceC46330IGg LIZ;
    public final IWH LIZIZ;
    public final IGJ LIZJ;
    public C48233IwP LIZLLL;
    public final IGT LJ;
    public int LJFF;
    public long LJI;

    public final void LIZ() {
        this.LIZIZ.pause();
        InterfaceC46645ISj LIZJ = this.LIZIZ.LIZJ();
        if (LIZJ != null) {
            LIZJ.LJJJZ();
        }
        IGT igt = this.LJ;
        ILD state = ILD.PAUSED;
        igt.getClass();
        o.LJIIIZ(state, "state");
        igt.LJLIL = state;
    }

    public C47041IdB(InterfaceC46330IGg interfaceC46330IGg) {
        this.LIZ = interfaceC46330IGg;
        IWH LJJIJIL = interfaceC46330IGg.LJJIJIL();
        o.LJIIIIZZ(LJJIJIL, "playerManager.simPlayer");
        this.LIZIZ = LJJIJIL;
        IGJ igj = new IGJ();
        this.LIZJ = igj;
        IGT igt = new IGT();
        this.LJ = igt;
        LJJIJIL.LJJJLL(igj);
        igj.LJLIL.add(igt);
    }
}
