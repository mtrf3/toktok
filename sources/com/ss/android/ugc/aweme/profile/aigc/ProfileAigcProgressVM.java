package com.ss.android.ugc.aweme.profile.aigc;

import X.ST9;
import X.STI;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS3S1202000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileAigcProgressVM extends AssemViewModel<STI> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final STI defaultState() {
        return new STI(ST9.IDLE);
    }

    public static void gv0(ProfileAigcProgressVM profileAigcProgressVM, ST9 status, int i, int i2, String str) {
        profileAigcProgressVM.getClass();
        o.LJIIIZ(status, "status");
        profileAigcProgressVM.setState(new AqS3S1202000_12(status, i, i2, str, (Integer) null, 0));
    }
}
