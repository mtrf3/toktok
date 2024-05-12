package com.ss.android.ugc.aweme.profile.viewmodel;

import X.InterfaceC88472Yns;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MyProfileGuideViewModel extends JediViewModel<MyProfileGuideState> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final MyProfileGuideState kv0() {
        boolean z = false;
        return new MyProfileGuideState(z, z, z, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, z, 0 == true ? 1 : 0, z, z, z, z, z, z, z, z, z, 1048575, 0 == true ? 1 : 0);
    }

    public final void Hv0(InterfaceC88472Yns<? super MyProfileGuideState, MyProfileGuideState> reducer) {
        o.LJIIIZ(reducer, "reducer");
        setState(reducer);
    }
}
