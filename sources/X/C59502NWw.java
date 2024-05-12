package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;

/* renamed from: X.NWw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59502NWw extends NYN {
    public final /* synthetic */ AdPopUpWebBottomSheetBehavior<C59501NWv> LIZ;
    public final /* synthetic */ C59501NWv LIZIZ;

    public C59502NWw(AdPopUpWebBottomSheetBehavior<C59501NWv> adPopUpWebBottomSheetBehavior, C59501NWv c59501NWv) {
        this.LIZ = adPopUpWebBottomSheetBehavior;
        this.LIZIZ = c59501NWv;
    }

    @Override // X.NYN
    public final void LIZ(View view, float f) {
        InterfaceC59503NWx callback = this.LIZIZ.getCallback();
        if (callback != null) {
            callback.LJ(view, f);
        }
    }

    @Override // X.NYN
    public final void LIZIZ(int i, View view) {
        InterfaceC59503NWx callback;
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6 || (callback = this.LIZIZ.getCallback()) == null) {
                            return;
                        }
                        callback.LJFF();
                        return;
                    }
                    InterfaceC59503NWx callback2 = this.LIZIZ.getCallback();
                    if (callback2 == null) {
                        return;
                    }
                    callback2.LIZ();
                    return;
                }
                InterfaceC59503NWx callback3 = this.LIZIZ.getCallback();
                if (callback3 == null) {
                    return;
                }
                callback3.LIZLLL();
                return;
            }
            if (this.LIZIZ.getActionMode().LJ != 0) {
                if (this.LIZIZ.getActionMode().LIZJ == 3) {
                    this.LIZ.LJII = true;
                } else {
                    this.LIZ.setPeekHeight(this.LIZIZ.getActionMode().LJ);
                }
            }
            InterfaceC59503NWx callback4 = this.LIZIZ.getCallback();
            if (callback4 == null) {
                return;
            }
            callback4.LIZIZ();
            return;
        }
        if (!C59501NWv.LLII) {
            this.LIZ.setState(3);
        }
        InterfaceC59503NWx callback5 = this.LIZIZ.getCallback();
        if (callback5 == null) {
            return;
        }
        callback5.LIZJ();
    }
}
