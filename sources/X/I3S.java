package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* loaded from: classes8.dex */
public final class I3S implements WSJ {
    public final /* synthetic */ C45850Hz4 LIZ;
    public final /* synthetic */ I3R LIZIZ;

    @Override // X.WSJ
    public final boolean onTabUnselected(WSF wsf, I34 i34) {
        return false;
    }

    public I3S(C45850Hz4 c45850Hz4, I3R i3r) {
        this.LIZ = c45850Hz4;
        this.LIZIZ = i3r;
    }

    @Override // X.WSJ
    public final boolean onTabSelected(WSF wsf, I34 i34) {
        boolean z;
        I37 i37 = this.LIZ.LIZ;
        if (i37 != null) {
            i37.X2("record");
        }
        I3R i3r = this.LIZIZ;
        C82632Wbs c82632Wbs = i3r.LJLJJLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = I3R.LJLLILLLL;
        ((I3X) c82632Wbs.LIZ(i3r, interfaceC74236TBoArr[0])).DG(HU0.class);
        this.LIZ.LIZLLL().shootMode = 15;
        I3R i3r2 = this.LIZIZ;
        InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) i3r2.LJLJL.LIZ(i3r2, interfaceC74236TBoArr[1]);
        I3R i3r3 = this.LIZIZ;
        InterfaceC82325WSr interfaceC82325WSr = (InterfaceC82325WSr) i3r3.LJLL.LIZ(i3r3, interfaceC74236TBoArr[4]);
        if (interfaceC82325WSr != null) {
            z = interfaceC82325WSr.kT(i34.LIZJ);
        } else {
            z = true;
        }
        interfaceC45999I3n.Qt0(z);
        I3R i3r4 = this.LIZIZ;
        ((WLT) i3r4.LJLJLJ.LIZ(i3r4, interfaceC74236TBoArr[2])).s9(0);
        I3R i3r5 = this.LIZIZ;
        ShortVideoContext LIZLLL = this.LIZ.LIZLLL();
        boolean z2 = i34.LIZ;
        i3r5.getClass();
        if (!LIZLLL.LJJJI()) {
            C45964I2e c45964I2e = new C45964I2e(true, true);
            c45964I2e.LJLJJL = z2;
            c45964I2e.LJLJJI = 2;
            c45964I2e.LJLJJLL = false;
            ((InterfaceC45979I2t) i3r5.LJLJLLL.LIZ(i3r5, interfaceC74236TBoArr[3])).configSwitchDuration(c45964I2e);
        }
        HB4.LJIIIZ(15);
        return true;
    }
}
