package djb;

import X.AnonymousClass315;
import X.C0NB;
import X.C32245Cl7;
import X.C78983UzD;
import X.InterfaceC32445CoL;
import X.MB6;
import X.MBA;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes6.dex */
public class IDaS22S0000000_5 extends MB6 implements CoroutineExceptionHandler {
    public final int $t;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        switch (this.$t) {
            case 0:
                handleException$0(this, mba, th);
                return;
            case 1:
                handleException$1(this, mba, th);
                return;
            case 2:
                handleException$2(this, mba, th);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS22S0000000_5(AnonymousClass315 anonymousClass315, int i) {
        super(anonymousClass315);
        this.$t = i;
    }

    public static final void handleException$0(IDaS22S0000000_5 iDaS22S0000000_5, MBA mba, Throwable th) {
        InterfaceC32445CoL interfaceC32445CoL = C32245Cl7.LIZ;
        if (interfaceC32445CoL != null) {
            interfaceC32445CoL.e("GiftPanelLeafV2.coroutine", null, th);
        }
        C78983UzD.LJIJ(th, "GiftPanelLeafV2.coroutine");
    }

    public static final void handleException$1(IDaS22S0000000_5 iDaS22S0000000_5, MBA mba, Throwable th) {
        C0NB.LJ("LiveGiftGuideWidgetV2", String.valueOf(th));
        C78983UzD.LJIILL("LiveGiftGuideWidgetV2.sendGiftCoroutine");
    }

    public static final void handleException$2(IDaS22S0000000_5 iDaS22S0000000_5, MBA mba, Throwable th) {
        C0NB.LJI("LiveGiftPanelPageAdapter.coroutine", th);
        C78983UzD.LJIJ(th, "LiveGiftPanelPageAdapter.coroutine");
    }
}
