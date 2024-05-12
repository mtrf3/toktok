package com.ss.android.ugc.tools.infosticker.view.internal.main;

import X.C164246cW;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.RTW;
import X.T16;
import X.TEN;
import X.TLZ;
import X.TMQ;
import Y.AfS64S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InfoStickerListMetaViewModel extends HumbleViewModel implements TLZ {
    public final C73318Sq2 LJLIL;
    public final MutableLiveData<List<RTW>> LJLILLLLZI;
    public final MutableLiveData LJLJI;
    public final MutableLiveData<TEN> LJLJJI;
    public final MutableLiveData LJLJJL;
    public final TMQ LJLJJLL;

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.TLZ
    public final void go() {
        if (isDestroyed()) {
            return;
        }
        TEN value = this.LJLJJI.getValue();
        if (value != null && value == TEN.LOADING) {
            return;
        }
        this.LJLJJI.setValue(TEN.LOADING);
        C78999UzT.LJFF(this.LJLJJLL.LIZJ().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(this, 50), new AfS64S0100000_12(this, 51)), this.LJLIL);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLIL.LIZLLL();
    }

    @Override // X.TLZ
    public final LiveData<List<RTW>> N90() {
        return this.LJLJI;
    }

    @Override // X.TLZ
    public final LiveData<TEN> getPageState() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoStickerListMetaViewModel(C164246cW lifecycleOwner, TMQ repository) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(repository, "repository");
        this.LJLJJLL = repository;
        this.LJLIL = new C73318Sq2();
        MutableLiveData<List<RTW>> mutableLiveData = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = mutableLiveData;
        MutableLiveData<TEN> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJJI = mutableLiveData2;
        this.LJLJJL = mutableLiveData2;
    }
}
