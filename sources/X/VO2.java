package X;

import Y.ARunnableS18S0101000_14;
import com.lynx.jsbridge.LynxIntersectionObserverModule;

/* loaded from: classes15.dex */
public final class VO2 extends VO1 {
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ LynxIntersectionObserverModule LJLJI;

    @Override // X.VO1
    public final void LIZ() {
        VOC LJIIJ = this.LJLJI.mLynxContext.LIZJ().LJIIJ(this.LJLILLLLZI);
        if (LJIIJ != null) {
            LJIIJ.LJIIL.clear();
            C79646VNq c79646VNq = LJIIJ.LIZIZ.get();
            int i = LJIIJ.LIZ;
            c79646VNq.getClass();
            C79411VEp.LJ(new ARunnableS18S0101000_14(i, c79646VNq, 19));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO2(LynxIntersectionObserverModule lynxIntersectionObserverModule, VNU vnu, int i) {
        super(vnu);
        this.LJLJI = lynxIntersectionObserverModule;
        this.LJLILLLLZI = i;
    }
}
