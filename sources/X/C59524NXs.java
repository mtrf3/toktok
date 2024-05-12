package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;

/* renamed from: X.NXs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59524NXs extends NYN {
    public final /* synthetic */ AdPopUpWebBottomSheetBehavior<C59520NXo> LIZ;
    public final /* synthetic */ C59520NXo LIZIZ;

    public C59524NXs(AdPopUpWebBottomSheetBehavior<C59520NXo> adPopUpWebBottomSheetBehavior, C59520NXo c59520NXo) {
        this.LIZ = adPopUpWebBottomSheetBehavior;
        this.LIZIZ = c59520NXo;
    }

    @Override // X.NYN
    public final void LIZ(View view, float f) {
        NY8 callback = this.LIZIZ.getCallback();
        if (callback != null) {
            callback.LJ(view, f);
        }
    }

    @Override // X.NYN
    public final void LIZIZ(int i, View view) {
        NY8 callback;
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5 || (callback = this.LIZIZ.getCallback()) == null) {
                        return;
                    }
                    callback.LIZ();
                    return;
                }
                NY8 callback2 = this.LIZIZ.getCallback();
                if (callback2 == null) {
                    return;
                }
                callback2.LIZLLL();
                return;
            }
            if (this.LIZIZ.getActionMode().LJ != 0) {
                this.LIZ.setPeekHeight(this.LIZIZ.getActionMode().LJ);
            }
            NY8 callback3 = this.LIZIZ.getCallback();
            if (callback3 == null) {
                return;
            }
            callback3.LIZIZ();
            return;
        }
        if (!C59520NXo.LLIFFJFJJ) {
            this.LIZ.setState(3);
        }
        NY8 callback4 = this.LIZIZ.getCallback();
        if (callback4 == null) {
            return;
        }
        callback4.LIZJ();
    }
}
