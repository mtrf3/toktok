package X;

import Y.ARunnableS48S0100000_12;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Rnt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70637Rnt {
    public DynamicSellingPointsBase LIZ;
    public C2UK LIZIZ;
    public int LJFF;
    public PdpViewModel LJII;
    public long LIZJ = 5000;
    public long LIZLLL = 6000;
    public long LJ = 5000;
    public final java.util.Set<DynamicSellingPoint> LJI = new LinkedHashSet();
    public final Handler LJIIIIZZ = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS48S0100000_12 LJIIIZ = new ARunnableS48S0100000_12(this, 119);

    public final void LIZIZ() {
        Handler handler = this.LJIIIIZZ;
        if (handler != null) {
            handler.removeCallbacks(this.LJIIIZ);
        }
        C2UK c2uk = this.LIZIZ;
        if (c2uk != null) {
            ObjectAnimator objectAnimator = c2uk.LJLIL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimator2 = c2uk.LJLILLLLZI;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
        C2UK c2uk2 = this.LIZIZ;
        if (c2uk2 != null) {
            c2uk2.LJLILLLLZI = null;
            c2uk2.LJLIL = null;
            C45804HyK.LJJIJIIJIL(c2uk2);
        }
        this.LIZIZ = null;
        this.LIZ = null;
        this.LIZJ = 5000L;
        this.LIZLLL = 6000L;
        this.LJ = 5000L;
        this.LJFF = 0;
        this.LJI.clear();
        this.LJII = null;
    }

    public final void LIZ(DynamicSellingPointsBase dynamicSellingPointsBase, C2UK c2uk, PdpViewModel viewModel) {
        C2UK c2uk2;
        o.LJIIIZ(viewModel, "viewModel");
        this.LIZ = dynamicSellingPointsBase;
        this.LIZIZ = c2uk;
        this.LJII = viewModel;
        if (dynamicSellingPointsBase != null) {
            if (dynamicSellingPointsBase.startToShowTime != null) {
                this.LIZJ = r0.intValue() * 1000;
            }
            Integer num = dynamicSellingPointsBase.stayTime;
            if (num != null) {
                this.LJ = num.intValue() * 1000;
                this.LIZLLL = r2 + 1000;
            }
        }
        DynamicSellingPointsBase dynamicSellingPointsBase2 = this.LIZ;
        if (dynamicSellingPointsBase2 != null && dynamicSellingPointsBase2.dynamicSellingPoints != null && (c2uk2 = this.LIZIZ) != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 108, 42), c2uk2);
        }
        C45804HyK.LJJLL(c2uk);
    }

    public final void LIZJ(int i, int i2, int i3, int i4) {
        C2UK c2uk = this.LIZIZ;
        if (c2uk != null) {
            ObjectAnimator objectAnimator = c2uk.LJLIL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimator2 = c2uk.LJLILLLLZI;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ViewGroup.LayoutParams layoutParams = c2uk.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(i, i2, i3, i4);
            c2uk.setLayoutParams(marginLayoutParams);
        }
    }
}
