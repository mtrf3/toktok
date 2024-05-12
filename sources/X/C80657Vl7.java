package X;

import android.animation.ArgbEvaluator;
import android.content.res.ColorStateList;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;

/* renamed from: X.Vl7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80657Vl7 implements C0C3 {
    public final WeakReference<C80655Vl5> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final ArgbEvaluator LJLJJLL = new ArgbEvaluator();
    public final AccelerateInterpolator LJLJL = new AccelerateInterpolator();

    public C80657Vl7(C80655Vl5 c80655Vl5) {
        int[] iArr;
        new DecelerateInterpolator(1.6f);
        this.LJLIL = new WeakReference<>(c80655Vl5);
        ColorStateList tabTextColors = c80655Vl5.getTabTextColors();
        iArr = HorizontalScrollView.SELECTED_STATE_SET;
        this.LJLJJL = tabTextColors.getColorForState(iArr, 0);
        this.LJLJJI = c80655Vl5.getTabTextColors().getDefaultColor();
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = i;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        C80654Vl4 c80654Vl4;
        C80655Vl5 c80655Vl5 = this.LJLIL.get();
        if (c80655Vl5 != null && c80655Vl5.getSelectedTabPosition() != i && i < c80655Vl5.getTabCount()) {
            int i2 = this.LJLJI;
            if (i2 == 0 || (i2 == 2 && this.LJLILLLLZI == 0)) {
                z = true;
            } else {
                z = false;
            }
            if (i < 0 || i >= c80655Vl5.getTabCount()) {
                c80654Vl4 = null;
            } else {
                c80654Vl4 = (C80654Vl4) ListProtector.get(c80655Vl5.LJLIL, i);
            }
            c80655Vl5.LJIIJJI(c80654Vl4, z);
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
        throw new UnsupportedOperationException("Method not decompiled: X.C80657Vl7.onPageScrolled(int, float, int):void");
    }
}
