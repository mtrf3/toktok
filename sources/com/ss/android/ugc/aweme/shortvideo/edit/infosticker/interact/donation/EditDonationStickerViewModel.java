package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import X.C1550366p;
import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC61312at;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditDonationStickerViewModel extends BaseJediViewModel<EditDonationStickerState> {
    public MutableLiveData<Boolean> LJLJJLL;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C1550366p.LJLIL);
    public final MutableLiveData<Boolean> LJLJLJ = new MutableLiveData<>(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new EditDonationStickerState(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final void LJIILIIL(boolean z) {
        setState(new AqS7S0010000_2(z, 24));
        MutableLiveData<Boolean> mutableLiveData = this.LJLJJLL;
        if (mutableLiveData != null && !o.LJ(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }
}
