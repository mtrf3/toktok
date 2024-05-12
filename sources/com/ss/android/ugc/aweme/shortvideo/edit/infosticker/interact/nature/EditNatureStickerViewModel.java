package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.nature;

import X.C221108m2;
import X.C62822Ol8;
import X.C66Q;
import X.InterfaceC61312at;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.BaseJediViewModel;

/* loaded from: classes3.dex */
public final class EditNatureStickerViewModel extends BaseJediViewModel<EditNatureStickerState> {
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C66Q.LJLIL);
    public final MutableLiveData<Boolean> LJLJL = new MutableLiveData<>(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new EditNatureStickerState(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }
}
