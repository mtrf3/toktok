package com.bytedance.android.live.liveinteract.linkroom.business.contract;

import X.B5G;
import X.C16880lQ;
import X.C62705OjF;
import X.C73931Szv;
import X.C73933Szx;
import X.InterfaceC73684Svw;
import X.InterfaceC75477Tjl;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;

/* loaded from: classes14.dex */
public abstract class InteractDialogFragmentBaseContract$AbsPresenter<V extends InteractDialogFragmentBaseContract$AbsView> {
    public final V LJLILLLLZI;
    public final String LJLIL = C16880lQ.LJLLJ(getClass());
    public final LinkCrossRoomDataHolder LJLJI = B5G.LIZIZ();

    public void LIZIZ() {
    }

    public void onCreate() {
    }

    public final <R> InterfaceC73684Svw<R> LIZ() {
        InterfaceC75477Tjl interfaceC75477Tjl = this.LJLILLLLZI.LJLIL;
        if (interfaceC75477Tjl != null) {
            return C73933Szx.LIZ(C73931Szv.LIZIZ(interfaceC75477Tjl.getLifecycleOwner(), Lifecycle.Event.ON_DESTROY), new C62705OjF());
        }
        return null;
    }

    public InteractDialogFragmentBaseContract$AbsPresenter(V v) {
        this.LJLILLLLZI = v;
    }
}
