package com.ss.android.ugc.aweme.qna.vm;

import X.C74100T6i;
import X.C74106T6o;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QnaNavigationViewModel extends ViewModel {
    public final MutableLiveData<C74100T6i<C74106T6o>> LJLIL;
    public final MutableLiveData LJLILLLLZI;
    public final MutableLiveData<C74100T6i<C74106T6o>> LJLJI;
    public final MutableLiveData LJLJJI;

    public QnaNavigationViewModel() {
        MutableLiveData<C74100T6i<C74106T6o>> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = mutableLiveData;
        MutableLiveData<C74100T6i<C74106T6o>> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJI = mutableLiveData2;
        this.LJLJJI = mutableLiveData2;
    }

    public final void vg0(String questionId, String str) {
        o.LJIIIZ(questionId, "questionId");
        this.LJLIL.setValue(new C74100T6i<>(new C74106T6o(questionId, str)));
        this.LJLJI.setValue(new C74100T6i<>(new C74106T6o(questionId, str)));
    }
}
