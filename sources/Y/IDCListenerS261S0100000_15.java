package Y;

import X.AbstractC86878Y7u;
import X.AbstractC87105YGn;
import X.C81276Vv6;
import X.C87098YGg;
import X.C87100YGi;
import X.C87102YGk;
import X.ViewOnTouchListenerC87097YGf;
import X.Y00;
import X.Y91;
import android.animation.Animator;
import android.view.View;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDCListenerS261S0100000_15 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS261S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS261S0100000_15 iDCListenerS261S0100000_15, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C87102YGk c87102YGk;
        C87100YGi c87100YGi;
        C87098YGg stateContext = ((ViewOnTouchListenerC87097YGf) iDCListenerS261S0100000_15.l0).getStateContext();
        if (o.LJ(stateContext.LIZJ, "WidgetShowState")) {
            AbstractC87105YGn abstractC87105YGn = stateContext.LJIILJJIL.get("WidgetShowState");
            if ((abstractC87105YGn instanceof C87100YGi) && (c87100YGi = (C87100YGi) abstractC87105YGn) != null) {
                C87098YGg c87098YGg = c87100YGi.LIZ;
                if (!c87098YGg.LJIIIZ) {
                    return;
                }
                Animator LIZ = C81276Vv6.LIZ(c87100YGi.LIZ.LJFF, c87098YGg.LIZ().y);
                c87100YGi.LIZJ = LIZ;
                LIZ.start();
                return;
            }
            return;
        }
        if (!o.LJ(stateContext.LIZJ, "EggShowState")) {
            return;
        }
        AbstractC87105YGn abstractC87105YGn2 = stateContext.LJIILJJIL.get("EggShowState");
        if (!(abstractC87105YGn2 instanceof C87102YGk) || (c87102YGk = (C87102YGk) abstractC87105YGn2) == null) {
            return;
        }
        c87102YGk.LJII();
    }

    public static final void onLayoutChange$1(IDCListenerS261S0100000_15 iDCListenerS261S0100000_15, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AbstractC86878Y7u abstractC86878Y7u;
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS261S0100000_15);
        VideoShrinkComponent videoShrinkComponent = (VideoShrinkComponent) iDCListenerS261S0100000_15.l0;
        if (videoShrinkComponent.LLFZ == 0) {
            float f = videoShrinkComponent.LLI;
            if (f > 0.0f && (abstractC86878Y7u = videoShrinkComponent.LLD) != null) {
                abstractC86878Y7u.LIZIZ(f, f);
            }
        }
    }

    public static final void onLayoutChange$2(IDCListenerS261S0100000_15 iDCListenerS261S0100000_15, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS261S0100000_15);
        ((Y00) iDCListenerS261S0100000_15.l0).LIZIZ();
    }

    public static final void onLayoutChange$3(IDCListenerS261S0100000_15 iDCListenerS261S0100000_15, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS261S0100000_15);
        ((Y91) iDCListenerS261S0100000_15.l0).LJLJLLL.LIZIZ();
    }
}
