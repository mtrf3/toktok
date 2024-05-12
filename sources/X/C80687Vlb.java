package X;

import android.animation.ArgbEvaluator;
import android.content.res.ColorStateList;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import java.lang.ref.WeakReference;

/* renamed from: X.Vlb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80687Vlb implements C0C3 {
    public final WeakReference<C80684VlY> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final ArgbEvaluator LJLJJLL = new ArgbEvaluator();
    public final AccelerateInterpolator LJLJL = new AccelerateInterpolator();

    public C80687Vlb(C80684VlY c80684VlY) {
        int[] iArr;
        new DecelerateInterpolator(1.6f);
        this.LJLIL = new WeakReference<>(c80684VlY);
        ColorStateList tabTextColors = c80684VlY.getTabTextColors();
        iArr = HorizontalScrollView.SELECTED_STATE_SET;
        this.LJLJJL = tabTextColors.getColorForState(iArr, 0);
        this.LJLJJI = c80684VlY.getTabTextColors().getDefaultColor();
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = i;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        C80684VlY c80684VlY = this.LJLIL.get();
        if (c80684VlY != null && c80684VlY.getSelectedTabPosition() != i && i < c80684VlY.getTabCount()) {
            int i2 = this.LJLJI;
            if (i2 == 0 || (i2 == 2 && this.LJLILLLLZI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c80684VlY.LJIILIIL(c80684VlY.LJIIJ(i), z);
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
        throw new UnsupportedOperationException("Method not decompiled: X.C80687Vlb.onPageScrolled(int, float, int):void");
    }
}
