package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class A9I implements A9L {
    public TuxIconView LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    @Override // X.A9L
    public final void LIZIZ() {
        C42625Go9.LIZJ(this);
    }

    @Override // X.A9L
    public final void LJFF(View view) {
        C42625Go9.LIZIZ(this);
        this.LIZ = (TuxIconView) view.findViewById(R.id.n83);
        view.findViewById(R.id.n84);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPageChanged(A9H event) {
        TuxIconView tuxIconView;
        Float f;
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageChanged(),event.onPageChangeMode =");
        LIZ.append(event.LJLIL);
        LIZ.append(",event.position = ");
        LIZ.append(event.LJLILLLLZI);
        LIZ.append(",event.positionOffsetPixels = ");
        LIZ.append(event.LJLJJI);
        LIZ.append(",event.state = ");
        LIZ.append(event.LJLJJL);
        LPR.LIZIZ(X1D.LIZIZ(LIZ));
        int i = A9G.LIZ[event.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || event.LJLILLLLZI != 1 || this.LIZJ) {
                        return;
                    }
                    LIZ(event, A9F.PAGE_SELECTED);
                    return;
                }
                this.LIZIZ = false;
                this.LIZJ = false;
                return;
            }
            TuxIconView tuxIconView2 = this.LIZ;
            if (tuxIconView2 == null || tuxIconView2.getContext() == null || !this.LIZIZ || this.LIZJ) {
                return;
            }
            LIZ(event, A9F.ACTION_UP);
            return;
        }
        if (event.LJLJI == null || event.LJLJJI == null || (tuxIconView = this.LIZ) == null || tuxIconView.getContext() == null) {
            return;
        }
        Context context = null;
        if (event.LJLJJI != null) {
            f = Float.valueOf(r0.intValue());
        } else {
            f = null;
        }
        float floatValue = f.floatValue();
        TuxIconView tuxIconView3 = this.LIZ;
        if (tuxIconView3 != null) {
            context = tuxIconView3.getContext();
        }
        if (floatValue >= KL2.LIZJ(context, 110.0f)) {
            this.LIZIZ = true;
            TuxIconView tuxIconView4 = this.LIZ;
            if (tuxIconView4 == null) {
                return;
            }
            tuxIconView4.setIconRes(R.raw.icon_tick_circle_fill);
            return;
        }
        this.LIZIZ = false;
        TuxIconView tuxIconView5 = this.LIZ;
        if (tuxIconView5 == null) {
            return;
        }
        tuxIconView5.setIconRes(R.raw.icon_arrow_left_circle_ltr);
    }

    public final void LIZ(A9H event, A9F mode) {
        Context context;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(mode, "mode");
        LPR.LIZ = true;
        IAdSceneService LJII = AdSceneServiceImpl.LJII();
        if (LJII != null && LJII.LIZJ() != null) {
            TuxIconView tuxIconView = this.LIZ;
            if (tuxIconView != null) {
                context = tuxIconView.getContext();
            } else {
                context = null;
            }
            NT2.LJJJJI(context);
        }
        TuxIconView tuxIconView2 = this.LIZ;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_arrow_left_circle_ltr);
        }
        LPR.LIZ = false;
        this.LIZJ = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onClick() mode = ");
        LIZ.append(mode);
        LPR.LIZIZ(X1D.LIZIZ(LIZ));
    }
}
