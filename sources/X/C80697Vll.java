package X;

import android.animation.ArgbEvaluator;
import android.content.res.ColorStateList;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import java.lang.ref.WeakReference;

/* renamed from: X.Vll, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80697Vll implements C0C3 {
    public final WeakReference<C80695Vlj> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final ArgbEvaluator LJLJJLL = new ArgbEvaluator();
    public final AccelerateInterpolator LJLJL = new AccelerateInterpolator();

    public C80697Vll(C80695Vlj c80695Vlj) {
        int[] iArr;
        new DecelerateInterpolator(1.6f);
        this.LJLIL = new WeakReference<>(c80695Vlj);
        ColorStateList tabTextColors = c80695Vlj.getTabTextColors();
        iArr = HorizontalScrollView.SELECTED_STATE_SET;
        this.LJLJJL = tabTextColors.getColorForState(iArr, 0);
        this.LJLJJI = c80695Vlj.getTabTextColors().getDefaultColor();
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = i;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        C80695Vlj c80695Vlj = this.LJLIL.get();
        if (c80695Vlj != null && c80695Vlj.getSelectedTabPosition() != i && i < c80695Vlj.getTabCount()) {
            int i2 = this.LJLJI;
            if (i2 == 0 || (i2 == 2 && this.LJLILLLLZI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c80695Vlj.LJIIZILJ(c80695Vlj.LJIIJJI(i), z, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0016, code lost:
    
        if (r6 == 2) goto L10;
     */
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r13, float r14, int r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80697Vll.onPageScrolled(int, float, int):void");
    }
}
