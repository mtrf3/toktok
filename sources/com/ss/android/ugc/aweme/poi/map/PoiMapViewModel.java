package com.ss.android.ugc.aweme.poi.map;

import X.C190977eX;
import X.C73411SrX;
import X.EnumC191017eb;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiMapViewModel extends AssemViewModel<C190977eX> {
    public C73411SrX LJLIL;
    public Long LJLILLLLZI;
    public Long LJLJI;
    public int LJLJJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C190977eX defaultState() {
        return new C190977eX(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C73411SrX c73411SrX = this.LJLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLIL = null;
    }

    public final void gv0(EnumC191017eb status) {
        o.LJIIIZ(status, "status");
        setState(new AqS169S0100000_3(status, 393));
    }
}
