package com.ss.android.ugc.aweme.ftc.components.sticker.hint;

import X.C6CU;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCStickerHintTextViewModel extends ViewModel {
    public MutableLiveData<Boolean> LJLIL;
    public MutableLiveData<C6CU> LJLILLLLZI;

    public final MutableLiveData<Boolean> gv0() {
        if (this.LJLIL == null) {
            this.LJLIL = new MutableLiveData<>();
        }
        MutableLiveData<Boolean> mutableLiveData = this.LJLIL;
        o.LJI(mutableLiveData);
        return mutableLiveData;
    }
}
