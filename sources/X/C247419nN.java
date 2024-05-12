package X;

import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.touchpoint.core.model.ReferralFeedBanner;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.9nN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247419nN implements AnonymousClass907, C95P {
    public View LIZ;
    public ReferralFeedBanner LIZIZ;
    public VW1 LIZJ;
    public C86783as LIZLLL;
    public TuxTextView LJ;
    public W5G LJFF;
    public W5G LJI;
    public View LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public Context LJIIJJI;
    public int LJIILIIL;
    public int LJIIL = -1;
    public final Handler LJIILJJIL = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS40S0100000_4 LJIILL = new ARunnableS40S0100000_4(this, 158);

    public static final C247289nA LJFF() {
        return (C247289nA) C95J.LIZ(8);
    }

    @Override // X.AnonymousClass907
    public final void LIZIZ() {
        this.LJIILJJIL.removeCallbacks(this.LJIILL);
    }

    @Override // X.AnonymousClass907
    public final void LIZJ() {
        View view = this.LIZ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJII;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJIIIZ;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJIIJ;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.LJIIIIZZ;
        if (view5 != null) {
            view5.setVisibility(0);
        }
    }

    @Override // X.AnonymousClass907
    public final void LIZLLL() {
        int i = this.LJIILIIL;
        if (i > 0) {
            this.LJIILJJIL.postDelayed(this.LJIILL, i * 1000);
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
            int LIZIZ = C7MY.LIZIZ(422);
            int LIZIZ2 = C7MY.LIZIZ(550);
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null && abstractC247499nV.LJIILL()) {
                LIZIZ = C7MY.LIZIZ(281);
                LIZIZ2 = C7MY.LIZIZ(LiveChatShowDelayForHotLiveSetting.DEFAULT);
            }
            VW1 vw1 = this.LIZJ;
            if (vw1 != null) {
                ViewGroup.LayoutParams layoutParams = vw1.getLayoutParams();
                layoutParams.width = LIZIZ;
                layoutParams.height = LIZIZ2;
                vw1.setLayoutParams(layoutParams);
            }
            C86783as c86783as = this.LIZLLL;
            if (c86783as == null || (i = c86783as.LJLIL) <= 0) {
                return;
            }
            int LIZ = C47135Ieh.LIZ(64, LIZIZ - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)) * (i - 1)));
            int i2 = c86783as.LJLIL;
            int i3 = LIZ / i2;
            for (int i4 = 0; i4 < i2; i4++) {
                try {
                    View childAt = c86783as.getChildAt(i4);
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    layoutParams2.width = i3;
                    childAt.setLayoutParams(layoutParams2);
                } catch (Throwable unused) {
                    return;
                }
            }
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
            ViewGroup.LayoutParams layoutParams3 = c86783as.getLayoutParams();
            layoutParams3.width = LIZIZ;
            layoutParams3.height = LJJIIZ;
            c86783as.setLayoutParams(layoutParams3);
        }
    }

    @Override // X.C95P
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        LJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0233, code lost:
    
        if (r4 != null) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0208  */
    @Override // X.AnonymousClass907
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.ViewStub r20, android.content.Context r21, int r22, android.view.View r23, android.view.View r24, android.view.View r25, android.view.View r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247419nN.LIZ(android.view.ViewStub, android.content.Context, int, android.view.View, android.view.View, android.view.View, android.view.View, java.lang.String):void");
    }
}
