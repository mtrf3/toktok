package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import defpackage.a1;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NXo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59520NXo extends C45621qg {
    public static boolean LLIFFJFJJ = true;
    public AdPopUpWebBottomSheetBehavior<C59520NXo> LLFII;
    public final C62822Ol8 LLFZ;
    public NY8 LLI;

    public final NYU getOnInterceptListener() {
        return null;
    }

    public final void setOnInterceptListener(NYU nyu) {
    }

    public final C59521NXp getActionMode() {
        return (C59521NXp) this.LLFZ.getValue();
    }

    public final AdPopUpWebBottomSheetBehavior<C59520NXo> getBehavior() {
        return this.LLFII;
    }

    public final NY8 getCallback() {
        return this.LLI;
    }

    @Override // X.C45621qg, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBehavior(AdPopUpWebBottomSheetBehavior<C59520NXo> adPopUpWebBottomSheetBehavior) {
        o.LJIIIZ(adPopUpWebBottomSheetBehavior, "<set-?>");
        this.LLFII = adPopUpWebBottomSheetBehavior;
    }

    public final void setCallback(NY8 ny8) {
        this.LLI = ny8;
    }

    public final void setWebViewForDragBehavior(NZQ webView) {
        o.LJIIIZ(webView, "webView");
        this.LLFII.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59520NXo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        AdPopUpWebBottomSheetBehavior<C59520NXo> adPopUpWebBottomSheetBehavior = new AdPopUpWebBottomSheetBehavior<>();
        adPopUpWebBottomSheetBehavior.LJIILLIIL = new C59524NXs(adPopUpWebBottomSheetBehavior, this);
        this.LLFII = adPopUpWebBottomSheetBehavior;
        this.LLFZ = C221108m2.LIZIZ(new AqS157S0200000_10(context, this, 22));
        AdPopUpWebBottomSheetBehavior<C59520NXo> adPopUpWebBottomSheetBehavior2 = this.LLFII;
        adPopUpWebBottomSheetBehavior2.LJI = true;
        LLIFFJFJJ = true;
        adPopUpWebBottomSheetBehavior2.setState(5);
        this.LLFII.setPeekHeight(getActionMode().LIZLLL);
    }
}
