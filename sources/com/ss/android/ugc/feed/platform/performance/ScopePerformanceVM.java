package com.ss.android.ugc.feed.platform.performance;

import X.C221108m2;
import X.C221138m5;
import X.C62822Ol8;
import X.KU3;
import X.KU4;
import X.KU8;
import androidx.lifecycle.ViewModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class ScopePerformanceVM extends ViewModel {
    public static final /* synthetic */ int LJLJI = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(KU3.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(KU8.LJLIL);

    public final List<KU4> gv0() {
        return (List) this.LJLILLLLZI.getValue();
    }

    public final ConcurrentHashMap<KU4, List<C221138m5<?>>> hv0() {
        return (ConcurrentHashMap) this.LJLIL.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        hv0().clear();
        gv0().clear();
    }
}
