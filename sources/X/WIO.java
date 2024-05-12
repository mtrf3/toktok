package X;

import Y.AObserverS76S0200000_13;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WIO extends WFY {
    public final /* synthetic */ WID LIZ;

    @Override // X.WFY, X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
    }

    public WIO(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.WFY, X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
        ((W4F) this.LIZ.LIZ.LJ(W4F.class, null)).CK(!r1.Ps());
    }

    @Override // X.WFY
    public final void LJ(TuxIconView view) {
        o.LJIIIZ(view, "view");
        C83113Wjd c83113Wjd = (C83113Wjd) this.LIZ.LIZ.LJ(C83113Wjd.class, null);
        InterfaceC83142Wk6 f7 = c83113Wjd.f7();
        o.LJII(f7, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource");
        SafeMutableLiveData<Integer> i8 = c83113Wjd.f7().i8();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        ComponentCallbacks2 LJIJJ = C45804HyK.LJIJJ(context);
        o.LJII(LJIJJ, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        i8.observe((LifecycleOwner) LJIJJ, new AObserverS76S0200000_13((C83146WkA) f7, view, 9));
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        o.LJIIIZ(view, "view");
        ((W4F) this.LIZ.LIZ.LJ(W4F.class, null)).CK(!r1.Ps());
    }
}
