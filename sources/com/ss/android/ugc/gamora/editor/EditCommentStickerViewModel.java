package com.ss.android.ugc.gamora.editor;

import X.C1550466q;
import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC61312at;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditCommentStickerViewModel extends BaseJediViewModel<EditCommentStickerState> {
    public MutableLiveData<Boolean> LJLJJLL;
    public final MutableLiveData<Boolean> LJLJL = new MutableLiveData<>(Boolean.TRUE);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C1550466q.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new EditCommentStickerState(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final void LJIILIIL(boolean z) {
        setState(new AqS7S0010000_2(z, 26));
        MutableLiveData<Boolean> mutableLiveData = this.LJLJJLL;
        if (mutableLiveData != null && !o.LJ(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    public final void LJIL(float f) {
        ((LiveData) this.LJLJLJ.getValue()).setValue(Float.valueOf(f));
    }
}
