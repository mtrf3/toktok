package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.touchpoint.core.model.ReferralFeedBanner;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.9nK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247389nK implements AnonymousClass907, C95P {
    public View LIZ;
    public ReferralFeedBanner LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public View LJ;
    public View LJFF;
    public View LJI;
    public Context LJII;
    public int LJIIIIZZ = -1;
    public TuxTextView LJIIIZ;
    public LinearLayout LJIIJ;
    public TuxTextView LJIIJJI;
    public TuxTextView LJIIL;
    public W5G LJIILIIL;
    public View LJIILJJIL;
    public TuxTextView LJIILL;

    @Override // X.AnonymousClass907
    public final void LIZIZ() {
    }

    @Override // X.AnonymousClass907
    public final void LIZLLL() {
    }

    public static final C247289nA LJFF() {
        return (C247289nA) C95J.LIZ(8);
    }

    @Override // X.AnonymousClass907
    public final void LIZJ() {
        View view = this.LIZ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJ;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJFF;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.LIZLLL;
        if (view5 != null) {
            view5.setVisibility(0);
        }
    }

    @Override // X.AnonymousClass907
    public final boolean isShowing() {
        View view = this.LIZ;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void LJ() {
        int i;
        C247289nA LJFF = LJFF();
        if (LJFF != null && LJFF.LJIIIIZZ()) {
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null && abstractC247499nV.LJIILL()) {
                i = 65;
            } else {
                i = 100;
            }
            int LIZIZ = C7MY.LIZIZ(i);
            View view = this.LJI;
            if (view != null) {
                C26338AVi.LJIIIZ(view, null, Integer.valueOf(LIZIZ), null, Integer.valueOf(LIZIZ), 21);
            }
        }
    }

    @Override // X.C95P
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0216  */
    @Override // X.AnonymousClass907
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.ViewStub r22, android.content.Context r23, int r24, android.view.View r25, android.view.View r26, android.view.View r27, android.view.View r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247389nK.LIZ(android.view.ViewStub, android.content.Context, int, android.view.View, android.view.View, android.view.View, android.view.View, java.lang.String):void");
    }
}
