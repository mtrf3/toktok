package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C221108m2;
import X.C62822Ol8;
import X.I5J;
import X.I5K;
import X.InterfaceC61312at;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AqS2S0000001_7;

/* loaded from: classes8.dex */
public final class CutVideoBottomBarViewModel extends BaseJediViewModel<CutVideoBottomBarState> {
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(I5J.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(I5K.LJLIL);

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new CutVideoBottomBarState(null, null, null, null, null, null, null, null, 255, null);
    }

    public final void Mv0(float f) {
        setState(new AqS2S0000001_7(f, 0));
    }
}
