package com.ss.android.ugc.gamora.editor.sticker.nature.viewmodel;

import X.C163926c0;
import X.C163946c2;
import X.C164546d0;
import X.InterfaceC92693kP;
import X.XKQ;
import X.XKX;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.gamora.editor.sticker.nature.model.NatureSpeciesModel;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class NatureViewModel extends ViewModel {
    public final C164546d0 LJLIL;
    public final MutableLiveData LJLILLLLZI;
    public final MutableLiveData<Integer> LJLJI;
    public final MutableLiveData LJLJJI;
    public final MutableLiveData<Integer> LJLJJL;
    public final MutableLiveData LJLJJLL;
    public final MutableLiveData<Integer> LJLJL;
    public final MutableLiveData LJLJLJ;
    public final MutableLiveData<List<NatureSpeciesModel>> LJLJLLL;
    public final MutableLiveData LJLL;
    public XKQ LJLLI;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        for (InterfaceC92693kP interfaceC92693kP : (Set) this.LJLIL.LJI.getValue()) {
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
        }
    }

    public NatureViewModel(String creationId) {
        C164546d0 c164546d0 = new C164546d0(creationId);
        o.LJIIIZ(creationId, "creationId");
        this.LJLIL = c164546d0;
        this.LJLILLLLZI = new MutableLiveData();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(0);
        this.LJLJI = mutableLiveData;
        this.LJLJJI = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>(8);
        this.LJLJJL = mutableLiveData2;
        this.LJLJJLL = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>(8);
        this.LJLJL = mutableLiveData3;
        this.LJLJLJ = mutableLiveData3;
        MutableLiveData<List<NatureSpeciesModel>> mutableLiveData4 = new MutableLiveData<>();
        this.LJLJLLL = mutableLiveData4;
        this.LJLL = mutableLiveData4;
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C163926c0(this, null), 3);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C163946c2(this, null), 3);
    }
}
