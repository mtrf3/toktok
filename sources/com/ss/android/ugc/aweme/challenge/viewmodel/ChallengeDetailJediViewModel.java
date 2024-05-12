package com.ss.android.ugc.aweme.challenge.viewmodel;

import X.AbstractC73638SvC;
import X.HDR;
import X.T16;
import X.T69;
import com.bytedance.jedi.arch.JediViewModel;

/* loaded from: classes13.dex */
public final class ChallengeDetailJediViewModel extends JediViewModel<ChallengeDetailState> {
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final ChallengeDetailState kv0() {
        return new ChallengeDetailState(null, 1, null);
    }

    public final void Hv0(String str, int i, String str2, boolean z, boolean z2) {
        execute(AbstractC73638SvC.LJI(new HDR(str, i, str2, z2, z)).LJJIIJ(T16.LIZ()), T69.LJLIL);
    }
}
