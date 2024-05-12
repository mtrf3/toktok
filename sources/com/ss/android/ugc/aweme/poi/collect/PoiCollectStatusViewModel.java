package com.ss.android.ugc.aweme.poi.collect;

import X.C189927cq;
import X.C190187dG;
import X.C73969T1h;
import X.InterfaceC88472Yns;
import X.T16;
import Y.AfS15S0210000_3;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiCollectStatusViewModel extends AssemViewModel<C190187dG> {
    public static final List<PoiCollectStatusViewModel> LJLIL = new ArrayList();
    public static final HashMap<String, String> LJLILLLLZI = new HashMap<>();
    public static final HashMap<String, PoiAnchorData> LJLJI = new HashMap<>();
    public static final HashMap<String, Boolean> LJLJJI = new HashMap<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C190187dG defaultState() {
        return new C190187dG(false);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        List<PoiCollectStatusViewModel> list = LJLIL;
        ((ArrayList) list).remove(this);
        if (((ArrayList) list).isEmpty()) {
            LJLILLLLZI.clear();
            LJLJI.clear();
            LJLJJI.clear();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        ((ArrayList) LJLIL).add(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void gv0(Boolean bool, String poiId, InterfaceC88472Yns interfaceC88472Yns) {
        boolean z;
        o.LJIIIZ(poiId, "poiId");
        if (bool == null) {
            z = getState().LJLIL;
        } else if (!bool.booleanValue()) {
            z = 1;
        } else {
            z = 0;
        }
        PoiListApi.LIZ.getClass();
        C189927cq.LIZ().collectPoi(poiId, !z).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS15S0210000_3(this, interfaceC88472Yns, z, 1));
    }
}
