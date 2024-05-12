package com.ss.android.ugc.aweme.following.vm;

import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C72887Sj5;
import X.C72889Sj7;
import X.C72893SjB;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS162S0100000_12;

/* loaded from: classes13.dex */
public final class RelationSearchVM extends AssemViewModel<C72887Sj5> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C72889Sj7.class, "RelationListHierarchyData"), true);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 585));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 583));
    public String LJLJJI = "";
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 584));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C72893SjB.LJLIL);
    public int LJLJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C72887Sj5 defaultState() {
        return new C72887Sj5(0);
    }

    public final String getEnterFrom() {
        return (String) this.LJLJI.getValue();
    }
}
