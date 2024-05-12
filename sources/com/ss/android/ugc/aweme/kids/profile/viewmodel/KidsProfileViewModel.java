package com.ss.android.ugc.aweme.kids.profile.viewmodel;

import X.AbstractC72372sj;
import X.InterfaceC72332sf;
import X.InterfaceC72342sg;
import X.XKQ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KidsProfileViewModel extends ViewModel {
    public final InterfaceC72342sg LJLIL;
    public XKQ LJLILLLLZI;
    public final MutableLiveData<InterfaceC72332sf> LJLJI;
    public final MutableLiveData<List<AbstractC72372sj>> LJLJJI;
    public final MutableLiveData<Integer> LJLJJL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        XKQ xkq;
        super.onCleared();
        XKQ xkq2 = this.LJLILLLLZI;
        if ((xkq2 == null || !xkq2.isCancelled()) && (xkq = this.LJLILLLLZI) != null) {
            xkq.LIZIZ(null);
        }
    }

    public KidsProfileViewModel(InterfaceC72342sg profileRepository) {
        o.LJIIIZ(profileRepository, "profileRepository");
        this.LJLIL = profileRepository;
        this.LJLJI = new MutableLiveData<>();
        this.LJLJJI = new MutableLiveData<>();
        this.LJLJJL = new MutableLiveData<>();
    }
}
