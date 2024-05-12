package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.widget.Widget;
import kotlin.jvm.internal.AqS31S0210000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SgJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72715SgJ implements C15X {
    public final /* synthetic */ AqS31S0210000_12 LJLIL;
    public final /* synthetic */ ViewGroup LJLILLLLZI;

    public C72715SgJ(AqS31S0210000_12 aqS31S0210000_12, ViewGroup viewGroup) {
        this.LJLIL = aqS31S0210000_12;
        this.LJLILLLLZI = viewGroup;
    }

    @Override // X.C15X
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        o.LJIIJ(view, "view");
        C72713SgH c72713SgH = (C72713SgH) this.LJLIL.l0;
        if (c72713SgH.LJ == null || c72713SgH.LIZIZ().isDetached() || ((C72713SgH) this.LJLIL.l0).LIZIZ().isRemoving() || ((C72713SgH) this.LJLIL.l0).LJI.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        AqS31S0210000_12 aqS31S0210000_12 = this.LJLIL;
        ((C72713SgH) aqS31S0210000_12.l0).LIZ((Widget) aqS31S0210000_12.l1, this.LJLILLLLZI, view);
    }
}
