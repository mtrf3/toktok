package X;

import com.lynx.jsbridge.LynxIntersectionObserverModule;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public final class VO9 extends VO1 {
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ReadableMap LJLJI;
    public final /* synthetic */ LynxIntersectionObserverModule LJLJJI;

    @Override // X.VO1
    public final void LIZ() {
        VOC LJIIJ = this.LJLJJI.mLynxContext.LIZJ().LJIIJ(this.LJLILLLLZI);
        if (LJIIJ != null) {
            ReadableMap readableMap = this.LJLJI;
            LJIIJ.LJ = null;
            LJIIJ.LJIIJJI = true;
            LJIIJ.LJ(readableMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO9(LynxIntersectionObserverModule lynxIntersectionObserverModule, VNU vnu, int i, ReadableMap readableMap) {
        super(vnu);
        this.LJLJJI = lynxIntersectionObserverModule;
        this.LJLILLLLZI = i;
        this.LJLJI = readableMap;
    }
}
