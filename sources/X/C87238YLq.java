package X;

import Y.ALAdapterS12S0100000_15;
import Y.AUListenerS75S0101000_15;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.YLq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87238YLq extends WN5 {
    public final InterfaceC65784Pro<C76800UCe> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public boolean LJ = true;

    @Override // X.WMU
    public final void LIZJ(Class cls, Class cls2) {
    }

    @Override // X.WN5
    public final boolean LJ() {
        return true;
    }

    public C87238YLq(AqS165S0100000_15 aqS165S0100000_15, AqS165S0100000_15 aqS165S0100000_152) {
        this.LIZJ = aqS165S0100000_15;
        this.LIZLLL = aqS165S0100000_152;
    }

    @Override // X.WN5
    public final Animator LJFF(C82158WMg from, C82158WMg c82158WMg) {
        o.LJIIIZ(from, "from");
        float measuredHeight = from.LIZIZ.getMeasuredHeight();
        View view = from.LIZIZ;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        C173216qz.LJ(ofFloat, "music_panel_hide", false);
        ofFloat.addUpdateListener(new C87239YLr(view, measuredHeight));
        ofFloat.addListener(new ALAdapterS12S0100000_15(this, 16));
        return ofFloat;
    }

    @Override // X.WN5
    public final Animator LJI(C82158WMg c82158WMg, C82158WMg to) {
        o.LJIIIZ(to, "to");
        View view = to.LIZIZ;
        int measuredHeight = view.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        C173216qz.LJ(ofFloat, "music_panel_show", this.LJ);
        this.LJ = false;
        ofFloat.addUpdateListener(new AUListenerS75S0101000_15(measuredHeight, view, 0));
        ofFloat.addListener(new ALAdapterS12S0100000_15(this, 17));
        return ofFloat;
    }
}
