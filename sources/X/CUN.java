package X;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class CUN extends C31413CUn {
    public CQQ LJLJI;
    public final ArrayList<Class<? extends CSH<? extends CRD>>> LJLJJI = new ArrayList<>();

    public final void LJZI(Class cls, CUO cuo) {
        ((C31411CUl) this.LJLILLLLZI).LIZJ(cls);
        if (!this.LJLJJI.contains(cls)) {
            this.LJLJJI.add(cls);
        }
        CQQ cqq = this.LJLJI;
        if (cqq != null) {
            cuo.LIZIZ = cqq;
        }
        LJLZ(cls, cuo);
    }
}
