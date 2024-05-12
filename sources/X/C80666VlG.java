package X;

import android.animation.ArgbEvaluator;
import android.content.res.ColorStateList;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import java.lang.ref.WeakReference;

/* renamed from: X.VlG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80666VlG implements C0C3 {
    public final WeakReference<C80664VlE> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final ArgbEvaluator LJLJJLL = new ArgbEvaluator();
    public final AccelerateInterpolator LJLJL = new AccelerateInterpolator();

    public C80666VlG(C80664VlE c80664VlE) {
        int[] iArr;
        new DecelerateInterpolator(1.6f);
        this.LJLIL = new WeakReference<>(c80664VlE);
        ColorStateList tabTextColors = c80664VlE.getTabTextColors();
        iArr = HorizontalScrollView.SELECTED_STATE_SET;
        this.LJLJJL = tabTextColors.getColorForState(iArr, 0);
        this.LJLJJI = c80664VlE.getTabTextColors().getDefaultColor();
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = i;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        C80664VlE c80664VlE = this.LJLIL.get();
        if (c80664VlE != null && c80664VlE.getSelectedTabPosition() != i && i < c80664VlE.getTabCount()) {
            int i2 = this.LJLJI;
            if (i2 == 0 || (i2 == 2 && this.LJLILLLLZI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c80664VlE.LJIILIIL(c80664VlE.LJIIIZ(i), z, true);
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
        throw new UnsupportedOperationException("Method not decompiled: X.C80666VlG.onPageScrolled(int, float, int):void");
    }
}
