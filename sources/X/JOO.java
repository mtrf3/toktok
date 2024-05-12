package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public abstract class JOO extends AbstractC208468Gc {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final Context LJLJLJ;

    public abstract void bindView();

    public abstract boolean c0();

    public abstract void f0();

    public abstract void g0();

    @Override // X.AbstractC208468Gc
    public int[] P() {
        return J7H.LIZ(201);
    }

    public final int Y() {
        Integer LJI = C79045V0n.LJI(R.attr.cj, this.LJLJLJ);
        if (LJI != null) {
            return LJI.intValue();
        }
        return 0;
    }

    public final boolean a0() {
        Animatable LIZ;
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView == null || smartImageView.getController() == null || (LIZ = this.LJLILLLLZI.getController().LIZ()) == null || !LIZ.isRunning()) {
            return false;
        }
        return true;
    }

    public JOO(View view) {
        super(view);
        this.LJLJLJ = view.getContext();
    }

    public static void X(SmartImageView smartImageView) {
        float f;
        ViewGroup viewGroup = (ViewGroup) smartImageView.getParent();
        if (viewGroup instanceof FixedRatioFrameLayout) {
            FixedRatioFrameLayout fixedRatioFrameLayout = (FixedRatioFrameLayout) viewGroup;
            C49098JOs.LIZ.getClass();
            int LIZ = C49098JOs.LIZ();
            if (LIZ != 4 && LIZ != 5 && LIZ != 6) {
                f = 0.625f;
            } else {
                f = 0.6666667f;
            }
            fixedRatioFrameLayout.setWhRatio(f);
        }
        smartImageView.getHierarchy().LJIIL(2).LJIILLIIL(new PointF(0.5f, 0.0f));
    }
}
