package Y;

import X.C0A6;
import X.C93729aVZ;
import X.C93736aVg;
import X.C93742aVm;
import X.C94194ad4;
import X.C94855anj;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDrS54S0100000_42 extends C0A6 {
    public final int $t;
    public Object l0;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 1:
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
            case 2:
                LJIILJJIL$1(this, i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 1:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
        }
    }

    public IDrS54S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS54S0100000_42 iDrS54S0100000_42, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            C93736aVg.LIZ(((GifsFragment) iDrS54S0100000_42.l0).requireContext());
        }
    }

    public static final void LJIILJJIL$1(IDrS54S0100000_42 iDrS54S0100000_42, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1 && ((C94855anj) iDrS54S0100000_42.l0).LJLJL.hasMessages(0)) {
            ((C94855anj) iDrS54S0100000_42.l0).LJLJL.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIILL$0(IDrS54S0100000_42 iDrS54S0100000_42, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        View view = null;
        if (recyclerView.computeVerticalScrollOffset() > C93742aVm.LIZIZ(6)) {
            C94194ad4 c94194ad4 = (C94194ad4) ((BehaviourPreviewFragment) iDrS54S0100000_42.l0).Al();
            if (c94194ad4 != null) {
                view = c94194ad4.LJLILLLLZI;
            }
            C93729aVZ.LJI(view);
            return;
        }
        C94194ad4 c94194ad42 = (C94194ad4) ((BehaviourPreviewFragment) iDrS54S0100000_42.l0).Al();
        if (c94194ad42 != null) {
            view = c94194ad42.LJLILLLLZI;
        }
        C93729aVZ.LIZJ(view);
    }
}
