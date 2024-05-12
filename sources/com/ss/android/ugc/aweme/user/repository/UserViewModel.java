package com.ss.android.ugc.aweme.user.repository;

import X.AGC;
import X.AXU;
import X.TBT;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.user.repository.UserState;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public final class UserViewModel extends JediViewModel<UserState> {
    public final String LJLJJLL = "follow_user";
    public final String LJLJL = "unfollow_user";

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        if (!AXU.LIZIZ) {
            withState(new AqS170S0100000_4(this, 988));
        }
        disposeOnClear(JediViewModel.wv0(this, new TBT() { // from class: X.ALv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((UserState) obj).getRemoveFollowerError();
            }
        }, null, AGC.LJLIL, 2, null));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final UserState kv0() {
        return new UserState(null, false, null, null, null, 31, null);
    }
}
