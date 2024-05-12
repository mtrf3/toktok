package com.ss.android.ugc.aweme.editSticker.interact.hit;

import X.C6CT;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StickerHintTextViewModel extends ViewModel {
    public MutableLiveData<Boolean> LJLIL;
    public MutableLiveData<C6CT> LJLILLLLZI;

    public final MutableLiveData<Boolean> gv0() {
        if (this.LJLIL == null) {
            this.LJLIL = new MutableLiveData<>();
        }
        MutableLiveData<Boolean> mutableLiveData = this.LJLIL;
        o.LJI(mutableLiveData);
        return mutableLiveData;
    }

    public final MutableLiveData<C6CT> hv0() {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new MutableLiveData<>();
        }
        MutableLiveData<C6CT> mutableLiveData = this.LJLILLLLZI;
        o.LJI(mutableLiveData);
        return mutableLiveData;
    }
}
