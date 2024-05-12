package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import X.C221108m2;
import X.C228228xW;
import X.C228258xZ;
import X.C228338xh;
import X.C62822Ol8;
import X.C78404Ups;
import X.HH1;
import X.InterfaceC228388xm;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;

/* loaded from: classes4.dex */
public final class MixVideosManageViewModel extends AssemViewModel<C228228xW> implements InterfaceC228388xm {
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public String LJLJI = "";
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @Override // X.InterfaceC228388xm
    public final String TV() {
        return "manage_video";
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C228228xW defaultState() {
        return new C228228xW(0);
    }

    public MixVideosManageViewModel() {
        C78404Ups.LIZJ(this, C228338xh.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 522));
    }

    @Override // X.InterfaceC228388xm
    public final String Uq() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC228388xm
    public final void Ne0(int i, int i2) {
        if (i == i2) {
            return;
        }
        this.LJLJJI = true;
        List<Aweme> list = getVmDispatcher().getState().LJLIL;
        if (list != null) {
            Collections.swap(list, i, i2);
        }
        setState(C228258xZ.LJLIL);
    }

    public final void gv0(String str, String str2, String str3) {
        HH1.LIZ(str, "mixID", str2, "mixName", str3, "enterFrom");
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLIL = str3;
    }
}
