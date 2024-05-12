package X;

import Y.IDfS293S0100000_29;
import Y.IDhS109S0100000_29;
import java.util.List;

/* renamed from: X.Zti, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91382Zti extends AbstractC91187ZqZ {
    public boolean LIZIZ;
    public final /* synthetic */ C91494ZvW LIZJ;

    @Override // X.AbstractC91187ZqZ
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    public C91382Zti(C91494ZvW c91494ZvW) {
        this.LIZJ = c91494ZvW;
    }

    @Override // X.AbstractC91187ZqZ
    public final AbstractC73672Svk<List<InterfaceC91296ZsK>> LIZIZ(String str) {
        String str2;
        this.LIZIZ = true;
        C91494ZvW c91494ZvW = this.LIZJ;
        if (c91494ZvW.LJLJJI) {
            c91494ZvW.LJLJJI = false;
            str2 = c91494ZvW.LJLJL.LJLJJLL;
        } else {
            str2 = "";
        }
        return C91207Zqt.LIZ().LJJIII(new C91381Zth(str2, str, this), false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new IDhS109S0100000_29(this.LIZJ, 2)).LJIJJ(new IDfS293S0100000_29(this, 2)).LJIJJLI(new IDfS293S0100000_29(this, 3));
    }
}
