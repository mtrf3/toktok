package com.ss.android.ugc.aweme.relation.fragment.muflist;

import X.C10K;
import X.C221018lt;
import X.C221108m2;
import X.C57778Mly;
import X.C61878OQg;
import X.C62822Ol8;
import X.C72457Sc9;
import X.C77134UPa;
import X.EnumC72446Sby;
import X.EnumC72449Sc1;
import X.EnumC72462ScE;
import X.EnumC72482ScY;
import X.InterfaceC72447Sbz;
import X.UPZ;
import X.X1D;
import Y.ACallableS115S0100000_12;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public final class MufListPageViewModel extends AssemViewModel<C72457Sc9> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public String LJLIL = "";
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 889));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 888));
    public final List<IMUser> LJLJJI = new ArrayList();
    public final C62822Ol8 LJLJJL;

    public static EnumC72482ScY hv0() {
        boolean LIZJ = UPZ.LIZ.LIZJ();
        boolean LIZJ2 = C77134UPa.LIZ.LIZJ();
        if (LIZJ) {
            if (LIZJ2) {
                return EnumC72482ScY.ALL_AUTH;
            }
            return EnumC72482ScY.CONTACT_ONLY;
        }
        if (LIZJ2) {
            return EnumC72482ScY.FACEBOOK_ONLY;
        }
        return EnumC72482ScY.ZERO_AUTH;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C72457Sc9 defaultState() {
        EnumC72462ScE enumC72462ScE = EnumC72462ScE.UNINITIALIZED;
        return new C72457Sc9(-1, null, EnumC72449Sc1.NOT_APPENDED, enumC72462ScE, new C57778Mly(0), "", C61878OQg.INSTANCE, hv0(), EnumC72446Sby.UNINITIALIZED);
    }

    public final InterfaceC72447Sbz iv0() {
        return (InterfaceC72447Sbz) this.LJLJI.getValue();
    }

    public MufListPageViewModel() {
        C10K.LIZJ(new ACallableS115S0100000_12(this, 2));
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 887));
    }

    public final void gv0() {
        EnumC72482ScY hv0 = hv0();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VM checkAuthState authState: ");
        LIZ.append(hv0.name());
        C221018lt.LJFF("MUF-LIST VM", X1D.LIZIZ(LIZ));
        if (getState().LJLJLJ != hv0) {
            setState(new AqS178S0100000_12(hv0, 275));
        }
    }
}
