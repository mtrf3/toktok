package com.ss.android.ugc.tools.infosticker.view.internal.base;

import X.AbstractC73638SvC;
import X.C61878OQg;
import X.C73318Sq2;
import X.C73969T1h;
import X.InterfaceC92693kP;
import X.RTW;
import X.T16;
import X.TEN;
import X.TL9;
import Y.AfS64S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class BaseInfoStickerListViewModel extends HumbleViewModel implements TL9 {
    public final MutableLiveData<List<Object>> LJLIL;
    public final MutableLiveData<TEN> LJLILLLLZI;
    public final MutableLiveData<TEN> LJLJI;
    public C73318Sq2 LJLJJI;

    @Override // X.TL9
    public void CD(RTW rtw) {
    }

    @Override // X.TL9
    public LiveData<Object> getExtraData() {
        return null;
    }

    public abstract AbstractC73638SvC<List<Object>> gv0();

    public abstract AbstractC73638SvC<List<Object>> hv0();

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C73318Sq2 c73318Sq2 = this.LJLJJI;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        this.LJLJJI = null;
    }

    @Override // X.TL9
    public final void F9() {
        if (isDestroyed()) {
            return;
        }
        TEN value = this.LJLILLLLZI.getValue();
        if (value != null && (value == TEN.EMPTY || value == TEN.LOADING)) {
            return;
        }
        List<Object> value2 = this.LJLIL.getValue();
        if (value2 != null && (true ^ value2.isEmpty())) {
            return;
        }
        this.LJLILLLLZI.setValue(TEN.LOADING);
        InterfaceC92693kP LJJII = gv0().LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS64S0100000_12(this, 45), new AfS64S0100000_12(this, 46));
        C73318Sq2 c73318Sq2 = this.LJLJJI;
        if (c73318Sq2 == null) {
            c73318Sq2 = new C73318Sq2();
            this.LJLJJI = c73318Sq2;
        }
        c73318Sq2.LIZ(LJJII);
    }

    @Override // X.TL9
    public final void u10() {
        if (isDestroyed()) {
            return;
        }
        TEN value = this.LJLILLLLZI.getValue();
        if (value != null && value != TEN.NONE) {
            return;
        }
        List<Object> value2 = this.LJLIL.getValue();
        if (value2 != null && value2.isEmpty()) {
            return;
        }
        TEN value3 = this.LJLJI.getValue();
        if (value3 != null && (value3 == TEN.EMPTY || value3 == TEN.LOADING)) {
            return;
        }
        this.LJLJI.setValue(TEN.LOADING);
        InterfaceC92693kP LJJII = hv0().LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS64S0100000_12(this, 47), new AfS64S0100000_12(this, 48));
        C73318Sq2 c73318Sq2 = this.LJLJJI;
        if (c73318Sq2 == null) {
            c73318Sq2 = new C73318Sq2();
            this.LJLJJI = c73318Sq2;
        }
        c73318Sq2.LIZ(LJJII);
    }

    @Override // X.TL9
    public final LiveData<List<Object>> e7() {
        return this.LJLIL;
    }

    @Override // X.TL9
    public LiveData<TEN> getLoadMoreState() {
        return this.LJLJI;
    }

    @Override // X.TL9
    public final LiveData<TEN> getPageState() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseInfoStickerListViewModel(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        MutableLiveData<List<Object>> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = new MutableLiveData<>();
        MutableLiveData<TEN> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJI = mutableLiveData2;
        mutableLiveData.setValue(C61878OQg.INSTANCE);
        mutableLiveData2.setValue(TEN.NONE);
    }
}
