package X;

import Y.ARunnableS20S0200000_1;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* loaded from: classes10.dex */
public final class LYB {
    public final ActivityC45651qj LIZ;
    public final View LIZIZ;
    public final RelativeLayout LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final LinearLayout LJI;
    public Runnable LJII;
    public final TuxTextView LJIIIIZZ;
    public final View LJIIIZ;
    public boolean LJIIJ;

    public final void LIZIZ() {
        LinearLayout linearLayout = this.LJI;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.LJI;
        if (linearLayout2 != null) {
            linearLayout2.requestLayout();
        }
        LinearLayout linearLayout3 = this.LJI;
        if (linearLayout3 != null) {
            linearLayout3.post(new ARunnableS20S0200000_1(linearLayout3, this, 62));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LYB(X.ActivityC45651qj r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYB.<init>(X.1qj):void");
    }

    public final void LIZ(Runnable runnable) {
        this.LJII = runnable;
        LiveOuterService.LJJJLL().LJIIJJI();
        String LJII = C55661Lsv.LIZ.LJII("following_hand.webp");
        View view = this.LJIIIZ;
        if (view != null) {
            C55661Lsv.LJIILIIL(view, LJII);
        }
        this.LJIIJ = true;
    }
}
