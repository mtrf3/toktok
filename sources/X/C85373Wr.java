package X;

import Y.ALAdapterS0S0201000_1;
import Y.AUListenerS65S0101000_1;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Wr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85373Wr implements C3WZ, C3WY {
    public final /* synthetic */ C3WQ LJLIL = new C3WQ();
    public final List<InterfaceC85393Wt> LJLILLLLZI;
    public ValueAnimator LJLJI;

    public final void LIZ() {
        this.LJLIL.LIZ();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLIL.LLIIJLIL(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLIL.LLJILLL(c3wr);
    }

    @Override // X.C3WZ
    public final void LJIILIIL() {
        Iterator<InterfaceC85393Wt> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJIILIIL();
        }
    }

    public C85373Wr() {
        ArrayList arrayList = new ArrayList();
        this.LJLILLLLZI = arrayList;
        arrayList.add(new InterfaceC85393Wt() { // from class: X.3Ws
            @Override // X.InterfaceC85393Wt
            public final void LJIILIIL() {
            }

            @Override // X.InterfaceC85393Wt
            public final void LJIILJJIL() {
            }

            @Override // X.InterfaceC85393Wt
            public final void LJIILL() {
                C85373Wr.this.LIZ();
            }
        });
    }

    public final void LIZIZ(View animatingView) {
        o.LJIIIZ(animatingView, "animatingView");
        ValueAnimator valueAnimator = this.LJLJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        int measuredHeight = animatingView.getMeasuredHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(measuredHeight, 0);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new AUListenerS65S0101000_1(measuredHeight, animatingView, 0));
        ofInt.addListener(new ALAdapterS0S0201000_1(this, animatingView, measuredHeight, 1));
        this.LJLJI = ofInt;
        ofInt.start();
    }
}
