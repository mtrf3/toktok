package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.C0R2;
import X.C27474AqM;
import X.C43I;
import X.C71298RyY;
import X.C71843SHn;
import X.EnumC71839SHj;
import X.EnumC71844SHo;
import X.EnumC71845SHp;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MessageCenterViewModel extends AssemViewModel<C71298RyY> {
    public volatile EnumC71844SHo LJLJI;
    public volatile EnumC71844SHo LJLJJI;
    public volatile EnumC71844SHo LJLJJL;
    public C27474AqM LJLJJLL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public volatile int LJLIL = 3;
    public volatile C0R2 LJLILLLLZI = new C0R2(0);
    public String LJLJL = "close";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C71298RyY defaultState() {
        return new C71298RyY(new C43I(EnumC71839SHj.LOADING), false, null);
    }

    public final void hv0(EnumC71839SHj state) {
        o.LJIIIZ(state, "state");
        setStateImmediate(new AqS178S0100000_12(state, 113));
        if (state == EnumC71839SHj.REFRESHING) {
            EnumC71844SHo enumC71844SHo = EnumC71844SHo.REFRESHING;
            this.LJLJI = enumC71844SHo;
            this.LJLJJI = enumC71844SHo;
            this.LJLJJL = enumC71844SHo;
            this.LJLILLLLZI.LIZ.set(0);
        }
    }

    public final void gv0(EnumC71845SHp chunkName, EnumC71844SHo state) {
        EnumC71839SHj enumC71839SHj;
        o.LJIIIZ(chunkName, "chunkName");
        o.LJIIIZ(state, "state");
        int i = C71843SHn.LIZ[chunkName.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LJLJJL = state;
                }
            } else {
                this.LJLJJI = state;
            }
        } else {
            this.LJLJI = state;
        }
        EnumC71844SHo enumC71844SHo = this.LJLJI;
        EnumC71844SHo enumC71844SHo2 = EnumC71844SHo.FAILED;
        if (enumC71844SHo == enumC71844SHo2 || this.LJLJJI == enumC71844SHo2 || this.LJLJJL == enumC71844SHo2) {
            enumC71839SHj = EnumC71839SHj.ERROR;
        } else {
            EnumC71844SHo enumC71844SHo3 = this.LJLJJI;
            EnumC71844SHo enumC71844SHo4 = EnumC71844SHo.SUCCESS;
            if (enumC71844SHo3 == enumC71844SHo4 && this.LJLJJL == enumC71844SHo4) {
                enumC71839SHj = EnumC71839SHj.BOTH;
            } else if (this.LJLJJI == enumC71844SHo4 && this.LJLJJL != enumC71844SHo4) {
                enumC71839SHj = EnumC71839SHj.NOTICE_ONLY;
            } else if (this.LJLJJI != enumC71844SHo4 && this.LJLJJL == enumC71844SHo4) {
                enumC71839SHj = EnumC71839SHj.MESSAGE_ONLY;
            } else {
                EnumC71844SHo enumC71844SHo5 = this.LJLJJI;
                EnumC71844SHo enumC71844SHo6 = EnumC71844SHo.EMPTY;
                if (enumC71844SHo5 == enumC71844SHo6 && this.LJLJJL == enumC71844SHo6) {
                    enumC71839SHj = EnumC71839SHj.EMPTY;
                } else {
                    enumC71839SHj = EnumC71839SHj.BOTH;
                }
            }
        }
        if (this.LJLILLLLZI.LIZJ() == this.LJLIL) {
            setState(new AqS178S0100000_12(enumC71839SHj, 111));
        } else {
            setState(new AqS178S0100000_12(enumC71839SHj, 112));
        }
    }
}
