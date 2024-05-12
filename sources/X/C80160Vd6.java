package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.xelement.LynxPullRefreshView;
import com.lynx.tasm.base.TraceEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Vd6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80160Vd6 extends C80164VdA {
    public final /* synthetic */ LynxPullRefreshView LLLI;

    @Override // X.C80164VdA
    public final InterfaceC78979Uz9 LJIJ(View contentView) {
        View view;
        o.LJIIJ(contentView, "contentView");
        if (!this.LLLI.LJLJI) {
            super.LJIJ(contentView);
            return this;
        }
        C80157Vd3 c80157Vd3 = this.LLJJJJLIIL;
        if (c80157Vd3 != null && (view = c80157Vd3.LJLIL) != null) {
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            removeView(view);
        }
        this.LLJJJJLIIL = new C80154Vd0(contentView, contentView);
        addView(contentView, getChildCount(), new C80176VdM(-1));
        if (this.LLJZ) {
            this.LLJJJJLIIL.LJFF();
            C80157Vd3 c80157Vd32 = this.LLJJJJLIIL;
            c80157Vd32.LJLJLLL.LIZJ = this.LLIIZ;
            c80157Vd32.LJI(this.LLJL, null, null);
        }
        InterfaceC80161Vd7 interfaceC80161Vd7 = this.LLJJJJ;
        if (interfaceC80161Vd7 != null && interfaceC80161Vd7.getSpinnerStyle().LIZ) {
            InterfaceC80161Vd7 mRefreshHeader = this.LLJJJJ;
            o.LJFF(mRefreshHeader, "mRefreshHeader");
            bringChildToFront(mRefreshHeader.getView());
        }
        InterfaceC80186VdW interfaceC80186VdW = this.LLJJJJJIL;
        if (interfaceC80186VdW != null && interfaceC80186VdW.getSpinnerStyle().LIZ) {
            InterfaceC80186VdW mRefreshFooter = this.LLJJJJJIL;
            o.LJFF(mRefreshFooter, "mRefreshFooter");
            bringChildToFront(mRefreshFooter.getView());
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80160Vd6(LynxPullRefreshView lynxPullRefreshView, Context context) {
        super(context);
        this.LLLI = lynxPullRefreshView;
    }

    @Override // X.C80164VdA, android.view.View
    public final void onMeasure(int i, int i2) {
        TraceEvent.LIZIZ("x-refresh-view.onMeasure");
        super.onMeasure(i, i2);
        TraceEvent.LJ("x-refresh-view.onMeasure");
    }

    @Override // X.C80164VdA, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TraceEvent.LIZIZ("x-refresh-view.onLayout");
        super.onLayout(z, i, i2, i3, i4);
        TraceEvent.LJ("x-refresh-view.onLayout");
    }
}
