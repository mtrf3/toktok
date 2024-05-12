package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.LiveLandScapeGiftDialog;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Cs1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32673Cs1 extends AbstractC32474Coo {
    public final /* synthetic */ LiveLandScapeGiftDialog LIZ;

    @Override // X.AbstractC32474Coo
    public final void LIZIZ() {
    }

    @Override // X.AbstractC32474Coo
    public final void LIZLLL() {
        C0NB.LIZIZ("LiveNewGiftDialog", "onSyncLoading: ");
        C32733Csz c32733Csz = this.LIZ.LL;
        if (c32733Csz != null) {
            c32733Csz.setVisibility(8);
            C32694CsM.LIZLLL++;
            C32694CsM.LJ = SystemClock.uptimeMillis();
            CVT cvt = this.LIZ.LJZI;
            if (cvt != null) {
                cvt.setVisibility(0);
                LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.LIZ.LJLJJI;
                if (liveNewGiftPanelWidget == null) {
                    return;
                }
                liveNewGiftPanelWidget.LLIIIJ = 2;
                return;
            }
            o.LJIJI("loadingView");
            throw null;
        }
        o.LJIJI("giftPanelErrorView");
        throw null;
    }

    public C32673Cs1(LiveLandScapeGiftDialog liveLandScapeGiftDialog) {
        this.LIZ = liveLandScapeGiftDialog;
    }

    @Override // X.AbstractC32474Coo
    public final void LIZJ(List list) {
        C32733Csz c32733Csz = this.LIZ.LL;
        if (c32733Csz != null) {
            c32733Csz.setVisibility(8);
            CVT cvt = this.LIZ.LJZI;
            if (cvt != null) {
                cvt.setVisibility(8);
                if (list != null) {
                    LiveLandScapeGiftDialog liveLandScapeGiftDialog = this.LIZ;
                    LiveNewGiftPanelWidget liveNewGiftPanelWidget = liveLandScapeGiftDialog.LJLJJI;
                    if (liveNewGiftPanelWidget != null) {
                        liveNewGiftPanelWidget.LLIIIL = 0;
                    }
                    liveLandScapeGiftDialog.xl(list);
                    C32694CsM.LJJIJIIJIL = SystemClock.uptimeMillis();
                    return;
                }
                return;
            }
            o.LJIJI("loadingView");
            throw null;
        }
        o.LJIJI("giftPanelErrorView");
        throw null;
    }

    @Override // X.AbstractC32474Coo
    public final void LIZ(int i, String message) {
        o.LJIIIZ(message, "message");
        C32694CsM.LIZIZ = i;
        C32694CsM.LIZJ = message;
        CVT cvt = this.LIZ.LJZI;
        if (cvt != null) {
            cvt.setVisibility(8);
            C32733Csz c32733Csz = this.LIZ.LL;
            if (c32733Csz != null) {
                c32733Csz.setVisibility(0);
                LiveLandScapeGiftDialog liveLandScapeGiftDialog = this.LIZ;
                LiveNewGiftPanelWidget liveNewGiftPanelWidget = liveLandScapeGiftDialog.LJLJJI;
                if (liveNewGiftPanelWidget != null) {
                    liveNewGiftPanelWidget.LLIIIJ = 0;
                }
                C32733Csz c32733Csz2 = liveLandScapeGiftDialog.LL;
                if (c32733Csz2 != null) {
                    c32733Csz2.LIZ(new AqS155S0100000_5(liveLandScapeGiftDialog, 349));
                    return;
                } else {
                    o.LJIJI("giftPanelErrorView");
                    throw null;
                }
            }
            o.LJIJI("giftPanelErrorView");
            throw null;
        }
        o.LJIJI("loadingView");
        throw null;
    }
}
