package X;

import kotlin.jvm.internal.AqS157S0100000_7;

/* loaded from: classes8.dex */
public final class HVP implements HPI {
    public final /* synthetic */ ActivityC45651qj LIZ;
    public final /* synthetic */ HPI LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;
    public final /* synthetic */ String[] LIZLLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJ;

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        HVO.LIZIZ(strArr, iArr, this.LIZ, "shoot_page");
        if (C78605Ut7.LIZIZ(iArr)) {
            this.LIZIZ.LIZ(iArr, strArr);
            this.LIZJ.invoke();
        } else {
            HVO.LJFF(this.LIZLLL, this.LIZ, true);
            C78934UyQ.LJLIL.LJ().LJ(this.LIZ);
            this.LJ.invoke();
        }
    }

    public HVP(ActivityC45651qj activityC45651qj, C45542Hu6 c45542Hu6, AqS157S0100000_7 aqS157S0100000_7, AqS157S0100000_7 aqS157S0100000_72, String[] strArr) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = c45542Hu6;
        this.LIZJ = aqS157S0100000_7;
        this.LIZLLL = strArr;
        this.LJ = aqS157S0100000_72;
    }
}
