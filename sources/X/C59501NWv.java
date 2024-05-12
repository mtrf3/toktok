package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NWv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59501NWv extends C45621qg {
    public static boolean LLII = true;
    public AdPopUpWebBottomSheetBehavior<C59501NWv> LLFII;
    public final C62822Ol8 LLFZ;
    public InterfaceC59503NWx LLI;
    public final java.util.Map<Integer, View> LLIFFJFJJ;

    public final NX6 getOnInterceptListener() {
        return null;
    }

    public final void setOnInterceptListener(NX6 nx6) {
    }

    public final void LJIJJLI() {
        this.LLFII.setState(3);
    }

    public final NWN getActionMode() {
        return (NWN) this.LLFZ.getValue();
    }

    public final AdPopUpWebBottomSheetBehavior<C59501NWv> getBehavior() {
        return this.LLFII;
    }

    public final InterfaceC59503NWx getCallback() {
        return this.LLI;
    }

    @Override // X.C45621qg, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBehavior(AdPopUpWebBottomSheetBehavior<C59501NWv> adPopUpWebBottomSheetBehavior) {
        o.LJIIIZ(adPopUpWebBottomSheetBehavior, "<set-?>");
        this.LLFII = adPopUpWebBottomSheetBehavior;
    }

    public final void setCallback(InterfaceC59503NWx interfaceC59503NWx) {
        this.LLI = interfaceC59503NWx;
    }

    public final void setWebViewForDragBehavior(NZQ webView) {
        o.LJIIIZ(webView, "webView");
        this.LLFII.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59501NWv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIFFJFJJ = C62850Ola.LJFF(context, "context");
        AdPopUpWebBottomSheetBehavior<C59501NWv> adPopUpWebBottomSheetBehavior = new AdPopUpWebBottomSheetBehavior<>();
        adPopUpWebBottomSheetBehavior.LJIILLIIL = new C59502NWw(adPopUpWebBottomSheetBehavior, this);
        this.LLFII = adPopUpWebBottomSheetBehavior;
        this.LLFZ = C221108m2.LIZIZ(new AqS157S0200000_10(context, this, 40));
        AdPopUpWebBottomSheetBehavior<C59501NWv> adPopUpWebBottomSheetBehavior2 = this.LLFII;
        adPopUpWebBottomSheetBehavior2.LJI = true;
        LLII = true;
        adPopUpWebBottomSheetBehavior2.setState(5);
        this.LLFII.setPeekHeight(getActionMode().LIZLLL);
    }
}
