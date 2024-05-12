package com.ss.android.ugc.aweme.qna.vm;

import X.C74100T6i;
import X.InterfaceC74128T7k;
import X.T7B;
import X.T7E;
import X.T7M;
import androidx.lifecycle.MutableLiveData;

/* loaded from: classes13.dex */
public final class QnaQuestionsTabViewModel extends QnaViewModel implements InterfaceC74128T7k {
    public final T7B LJLJL;
    public final MutableLiveData LJLJLJ;
    public final MutableLiveData LJLJLLL;
    public final MutableLiveData LJLL;
    public final MutableLiveData LJLLI;
    public final MutableLiveData LJLLILLLL;
    public final MutableLiveData<C74100T6i<T7E>> LJLLJ;
    public final MutableLiveData<C74100T6i<T7E>> LJLLL;
    public final MutableLiveData<C74100T6i<T7M>> LJLLLL;
    public final MutableLiveData LJLLLLLL;

    public QnaQuestionsTabViewModel() {
        T7B t7b = new T7B();
        this.LJLJL = t7b;
        this.LJLJLJ = t7b.LIZIZ;
        this.LJLJLLL = t7b.LIZJ;
        this.LJLL = t7b.LIZLLL;
        this.LJLLI = t7b.LJI;
        this.LJLLILLLL = t7b.LJ;
        MutableLiveData<C74100T6i<T7E>> mutableLiveData = new MutableLiveData<>();
        this.LJLLJ = mutableLiveData;
        this.LJLLL = mutableLiveData;
        MutableLiveData<C74100T6i<T7M>> mutableLiveData2 = new MutableLiveData<>();
        this.LJLLLL = mutableLiveData2;
        this.LJLLLLLL = mutableLiveData2;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLJL.LJIILIIL.LIZLLL();
    }

    @Override // X.T84
    public final void q00(T7E t7e) {
        this.LJLLJ.setValue(new C74100T6i<>(t7e));
    }

    @Override // X.InterfaceC74128T7k
    public final void tC(T7M t7m) {
        this.LJLLLL.setValue(new C74100T6i<>(t7m));
    }
}
