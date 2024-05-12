package com.ss.android.ugc.aweme.featureeffectvideo.model;

import X.C221108m2;
import X.C251859uX;
import X.C62822Ol8;
import X.C73318Sq2;
import X.EnumC251869uY;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FeatureVideoViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C251859uX.LJLIL);
    public final MutableLiveData<EnumC251869uY> LJLILLLLZI;
    public final MutableLiveData LJLJI;

    public FeatureVideoViewModel() {
        MutableLiveData<EnumC251869uY> mutableLiveData = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = mutableLiveData;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C73318Sq2) this.LJLIL.getValue()).LIZLLL();
    }

    public final void gv0(EnumC251869uY status) {
        o.LJIIIZ(status, "status");
        this.LJLILLLLZI.postValue(status);
    }
}
