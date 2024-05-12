package com.ss.android.ugc.aweme.nows.player.util;

import X.C196917o7;
import X.C221108m2;
import X.C62822Ol8;
import androidx.lifecycle.ViewModel;
import java.util.Map;

/* loaded from: classes4.dex */
public final class PlayerPositionStore extends ViewModel {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C196917o7.LJLIL);

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((Map) this.LJLIL.getValue()).clear();
    }
}
