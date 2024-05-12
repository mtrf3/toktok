package X;

import com.lynx.jsbridge.LynxIntersectionObserverModule;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public final class VO7 extends VO1 {
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ReadableMap LJLJJI;
    public final /* synthetic */ LynxIntersectionObserverModule LJLJJL;

    @Override // X.VO1
    public final void LIZ() {
        VOC LJIIJ = this.LJLJJL.mLynxContext.LIZJ().LJIIJ(this.LJLILLLLZI);
        if (LJIIJ != null) {
            String str = this.LJLJI;
            ReadableMap readableMap = this.LJLJJI;
            if (!str.startsWith("#")) {
                return;
            }
            LynxBaseUI lynxBaseUI = null;
            if (LJIIJ.LIZIZ() == null) {
                LLog.LIZLLL(4, "LynxIntersectionObserver", "relativeTo failed because context is null");
                LJIIJ.LJ = null;
            } else {
                VNU LIZIZ = LJIIJ.LIZIZ();
                String substring = str.substring(1);
                LynxBaseUI lynxBaseUI2 = LJIIJ.LIZLLL;
                if (LIZIZ.LJLLI.get() != null) {
                    lynxBaseUI = VOR.LJII(substring, lynxBaseUI2);
                }
                LJIIJ.LJ = lynxBaseUI;
            }
            if (LJIIJ.LJ == null) {
                LLog.LIZLLL(3, "LynxIntersectionObserver", "Can't find element, finding in element");
                if (LJIIJ.LIZLLL() == null) {
                    LLog.LIZLLL(4, "LynxIntersectionObserver", "relativeTo failed because UIOwner is null");
                } else {
                    LJIIJ.LJ = LJIIJ.LIZLLL().LJI(str.substring(1));
                }
            }
            LJIIJ.LJ(readableMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO7(LynxIntersectionObserverModule lynxIntersectionObserverModule, VNU vnu, int i, String str, ReadableMap readableMap) {
        super(vnu);
        this.LJLJJL = lynxIntersectionObserverModule;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = readableMap;
    }
}
