package com.ss.android.ugc.aweme.tag.viewmodel;

import X.C47704Ins;
import X.C55749LuL;
import X.C7BT;
import X.C7BX;
import X.C7DS;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AqS13S2100000_3;

/* loaded from: classes4.dex */
public final class FeedTaggedListViewModel extends AssemViewModel<C7BX> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C7BT.class, null), true);
    public final Set<String> LJLILLLLZI = new LinkedHashSet();
    public boolean LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C7BX defaultState() {
        return new C7BX(null, null);
    }

    public final C7BT gv0() {
        return (C7BT) this.LJLIL.getValue();
    }

    public final void hv0(String str, String str2) {
        C7DS.LIZIZ("click_tagged_user", new AqS13S2100000_3(str, this, str2, 7));
    }
}
