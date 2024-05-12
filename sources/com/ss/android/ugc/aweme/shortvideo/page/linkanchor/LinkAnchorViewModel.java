package com.ss.android.ugc.aweme.shortvideo.page.linkanchor;

import X.C221108m2;
import X.C62822Ol8;
import X.C68322mC;
import X.C73318Sq2;
import X.C9V1;
import X.C9V3;
import Y.AObserverS72S0100000_4;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

/* loaded from: classes5.dex */
public final class LinkAnchorViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJL = 0;
    public final MutableLiveData<String> LJLIL;
    public final MutableLiveData<C9V1> LJLILLLLZI;
    public final MutableLiveData<String> LJLJI;
    public final MutableLiveData<Boolean> LJLJJI;
    public final C62822Ol8 LJLJJL;
    public boolean LJLJJLL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        ((C73318Sq2) this.LJLJJL.getValue()).dispose();
    }

    public LinkAnchorViewModel() {
        final MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        MutableLiveData<C9V1> mutableLiveData2 = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData2;
        this.LJLJI = new MutableLiveData<>();
        this.LJLJJI = new MutableLiveData<>();
        this.LJLJJL = C221108m2.LIZIZ(C9V3.LJLIL);
        mutableLiveData.setValue("");
        mutableLiveData2.setValue(C9V1.INITIAL);
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final C68322mC c68322mC = new C68322mC();
        mediatorLiveData.addSource(mutableLiveData, new Observer() { // from class: X.2gA
            public final /* synthetic */ InterfaceC70422pa LJLILLLLZI = C780334l.LJLIL;
            public final /* synthetic */ long LJLJI = 2000;

            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                InterfaceC79150V4o interfaceC79150V4o = C68322mC.this.element;
                if (interfaceC79150V4o != null) {
                    interfaceC79150V4o.LIZIZ(null);
                }
                C68322mC.this.element = (T) XKX.LIZLLL(this.LJLILLLLZI, null, null, new C64572g9(this.LJLJI, mediatorLiveData, mutableLiveData, null), 3);
            }
        });
        mediatorLiveData.observeForever(new AObserverS72S0100000_4(this, 16));
    }
}
