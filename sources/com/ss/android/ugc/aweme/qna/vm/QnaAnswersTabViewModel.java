package com.ss.android.ugc.aweme.qna.vm;

import X.C74100T6i;
import X.InterfaceC74128T7k;
import X.T7A;
import X.T7E;
import X.T7M;
import androidx.lifecycle.MutableLiveData;

/* loaded from: classes13.dex */
public final class QnaAnswersTabViewModel extends QnaViewModel implements InterfaceC74128T7k {
    public final T7A LJLJL;
    public final MutableLiveData LJLJLJ;
    public final MutableLiveData LJLJLLL;
    public final MutableLiveData<C74100T6i<T7E>> LJLL;
    public final MutableLiveData<C74100T6i<T7E>> LJLLI;
    public final MutableLiveData<C74100T6i<T7M>> LJLLILLLL;
    public final MutableLiveData LJLLJ;

    public QnaAnswersTabViewModel() {
        T7A t7a = new T7A();
        this.LJLJL = t7a;
        this.LJLJLJ = t7a.LIZIZ;
        this.LJLJLLL = t7a.LIZJ;
        MutableLiveData<C74100T6i<T7E>> mutableLiveData = new MutableLiveData<>();
        this.LJLL = mutableLiveData;
        this.LJLLI = mutableLiveData;
        MutableLiveData<C74100T6i<T7M>> mutableLiveData2 = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData2;
        this.LJLLJ = mutableLiveData2;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLJL.LJIIIZ.LIZLLL();
    }

    @Override // X.T84
    public final void q00(T7E t7e) {
        this.LJLL.setValue(new C74100T6i<>(t7e));
    }

    @Override // X.InterfaceC74128T7k
    public final void tC(T7M t7m) {
        this.LJLLILLLL.setValue(new C74100T6i<>(t7m));
    }
}
