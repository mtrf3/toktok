package com.ss.android.ugc.aweme.profile.popup;

import X.C188727au;
import X.C8E0;
import X.C8E3;
import X.C8EI;
import X.C8EN;
import X.FMX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AvatarAndNicknamePopupViewModel extends AssemViewModel<C8E3> {
    public C8EN LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C8E3 defaultState() {
        return new C8E3(C8E0.NO_SHEET, null);
    }

    public final void gv0(C8E0 pageValue) {
        o.LJIIIZ(pageValue, "pageValue");
        setState(new AqS169S0100000_3(pageValue, 406));
    }

    public final void hv0(C8EI clickWhat) {
        o.LJIIIZ(clickWhat, "clickWhat");
        C8EN c8en = this.LJLIL;
        if (c8en == null || c8en.LIZIZ(clickWhat)) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("click_what", C8EN.LIZJ(clickWhat));
        c8en.LIZ(c188727au);
        FMX.LJIIL("click_update_avatar_sheet", c188727au.LIZ);
    }

    public final void iv0(C8EI clickWhat) {
        o.LJIIIZ(clickWhat, "clickWhat");
        C8EN c8en = this.LJLIL;
        if (c8en == null || c8en.LIZIZ(clickWhat)) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("click_what", C8EN.LIZJ(clickWhat));
        c8en.LIZ(c188727au);
        FMX.LJIIL("click_update_avatar_success", c188727au.LIZ);
    }

    public final void jv0(C8EI clickWhat) {
        o.LJIIIZ(clickWhat, "clickWhat");
        C8EN c8en = this.LJLIL;
        if (c8en == null || c8en.LIZIZ(clickWhat)) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("click_what", C8EN.LIZJ(clickWhat));
        c8en.LIZ(c188727au);
        FMX.LJIIL("click_update_nickname_sheet", c188727au.LIZ);
    }
}
