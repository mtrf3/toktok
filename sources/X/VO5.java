package X;

import Y.ARunnableS33S0200000_14;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.jsbridge.LynxIntersectionObserverModule;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public final class VO5 extends VO1 {
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ReadableMap LJLJJI;
    public final /* synthetic */ LynxIntersectionObserverModule LJLJJL;

    @Override // X.VO1
    public final void LIZ() {
        int i;
        C79646VNq LIZJ = this.LJLJJL.mLynxContext.LIZJ();
        if (LIZJ.LJIIJ(this.LJLILLLLZI) == null) {
            if (!this.LJLJI.isEmpty()) {
                i = CastIntegerProtector.parseInt(this.LJLJI);
            } else {
                i = -1;
            }
            C79411VEp.LJ(new ARunnableS33S0200000_14(LIZJ, new VOC(LIZJ, this.LJLILLLLZI, i, this.LJLJJI), 75));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO5(LynxIntersectionObserverModule lynxIntersectionObserverModule, VNU vnu, int i, String str, ReadableMap readableMap) {
        super(vnu);
        this.LJLJJL = lynxIntersectionObserverModule;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = readableMap;
    }
}
