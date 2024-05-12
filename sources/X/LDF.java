package X;

import android.animation.ValueAnimator;
import com.ss.android.ugc.feed.platform.cell.clean.CellCleanComponent;

/* loaded from: classes10.dex */
public final class LDF implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CellCleanComponent LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = true;
    public final /* synthetic */ boolean LJLJI = true;

    public LDF(CellCleanComponent cellCleanComponent) {
        this.LJLIL = cellCleanComponent;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.b4(this.LJLILLLLZI, ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue(), this.LJLJI);
    }
}
