package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JFn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48859JFn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ S0A LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C48859JFn(S0A s0a, int i, int i2) {
        this.LJLIL = s0a;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup.LayoutParams layoutParams = this.LJLIL.LIZ(R.id.a3s).getLayoutParams();
        layoutParams.height = O6R.LJJIIZ(CastFloatProtector.parseFloat(it.getAnimatedValue().toString()) * this.LJLILLLLZI);
        if (this.LJLIL.LIZ(R.id.a22).getMeasuredWidth() < this.LJLJI) {
            layoutParams.width = (int) Math.ceil((CastFloatProtector.parseFloat(it.getAnimatedValue().toString()) * (this.LJLJI - this.LJLIL.LIZ(R.id.a22).getMeasuredWidth())) + this.LJLIL.LIZ(R.id.a22).getMeasuredWidth());
        }
        this.LJLIL.LIZ(R.id.a3s).setLayoutParams(layoutParams);
    }
}
