package com.ss.android.ugc.aweme.discover.viewmodel;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C5H3;
import X.C70839Rr9;
import X.C73279SpP;
import X.C73288SpY;
import X.EnumC221088m0;
import X.InterfaceC61312at;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public final class TrendsTabViewModel extends CommonListViewModel<DiscoverSectionItem, TrendsTabState> {
    public final C5H3 LJLJLLL;
    public final C73288SpY LJLL;
    public final List<Aweme> LJLLI;
    public final Map<String, Aweme> LJLLILLLL;

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final InterfaceC88472Yns<TrendsTabState, AbstractC73672Svk<OSZ<List<DiscoverSectionItem>, C70839Rr9>>> Nv0() {
        return new AqS178S0100000_12(this, 107);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final InterfaceC88472Yns<TrendsTabState, AbstractC73672Svk<OSZ<List<DiscoverSectionItem>, C70839Rr9>>> Ov0() {
        return new AqS178S0100000_12(this, 108);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        boolean z = false;
        return new TrendsTabState(z, null, z, 0 == true ? 1 : 0, z, 31, 0 == true ? 1 : 0);
    }

    public TrendsTabViewModel() {
        C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.NONE, C73279SpP.LJLIL);
        this.LJLJLLL = LIZ;
        LIZ.getValue();
        this.LJLL = new C73288SpY();
        this.LJLLI = new ArrayList();
        this.LJLLILLLL = new LinkedHashMap();
    }

    public final void Pv0(boolean z) {
        setState(new AqS14S0010000_9(z, 6));
        refresh();
    }
}
