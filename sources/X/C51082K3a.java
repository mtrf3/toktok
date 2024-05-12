package X;

import Y.IDrS47S0100000_8;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.K3a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51082K3a implements C48Q {
    public final RecyclerView LIZ;
    public View LIZIZ;
    public View LIZJ;
    public boolean LIZLLL;
    public final IDrS47S0100000_8 LJ;

    @Override // X.C48Q
    public final void LIZ() {
        this.LIZ.LJJLL(this.LJ);
    }

    public final void LIZJ() {
        int i;
        int i2;
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "parentRecyclerView.context");
        Integer LJI = C79045V0n.LJI(R.attr.w5, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        Context context2 = this.LIZ.getContext();
        o.LJIIIIZZ(context2, "parentRecyclerView.context");
        Integer LJI2 = C79045V0n.LJI(R.attr.w4, context2);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        } else {
            i2 = 0;
        }
        View view = this.LIZIZ;
        if (view != null) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "backgroundColor", i, i2);
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.setDuration(200L);
            ofInt.addListener(new C51083K3b(view, i));
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(view, "backgroundColor", i2, i);
            ofInt2.setEvaluator(new ArgbEvaluator());
            ofInt2.setStartDelay(1000L);
            ofInt2.setDuration(200L);
            ofInt2.addListener(new C51084K3c(view, i));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofInt2).after(ofInt);
            animatorSet.start();
        }
        this.LIZLLL = false;
        LIZ();
    }

    public C51082K3a(RecyclerView parentRecyclerView) {
        o.LJIIIZ(parentRecyclerView, "parentRecyclerView");
        this.LIZ = parentRecyclerView;
        this.LJ = new IDrS47S0100000_8(this, 7);
    }

    @Override // X.C48Q
    public final void LIZIZ(View view, View view2) {
        this.LIZJ = view;
        this.LIZIZ = view2;
        this.LIZ.LJIIJJI(this.LJ);
        View view3 = this.LIZJ;
        if (view3 != null && (!this.LIZLLL)) {
            this.LIZLLL = true;
            int[] iArr = {0, 0};
            this.LIZ.getLocationInWindow(iArr);
            int height = this.LIZ.getHeight() + iArr[1];
            int[] iArr2 = {0, 0};
            view3.getLocationInWindow(iArr2);
            int LIZJ = C47959Irz.LIZJ(12, (view3.getHeight() + iArr2[1]) - height);
            if (LIZJ > 0) {
                this.LIZ.LJLIIL(0, LIZJ, C55953Lxd.LJI(), 300, false);
            } else {
                LIZJ();
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LIZLLL = false;
        LIZ();
    }
}
