package com.ss.android.ugc.tools.infosticker.view.internal.main;

import X.AbstractC73638SvC;
import X.C164246cW;
import X.C61878OQg;
import X.C63P;
import X.C73318Sq2;
import X.C73487Ssl;
import X.C73969T1h;
import X.InterfaceC164626d8;
import X.InterfaceC74451TJv;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.OSZ;
import X.RTW;
import X.T16;
import X.TEN;
import X.TFO;
import X.TL9;
import X.TMQ;
import Y.AfS64S0100000_12;
import Y.IDhS105S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InfoStickerListRecommendViewModel extends HumbleViewModel implements TL9, InterfaceC74451TJv {
    public final MutableLiveData<List<Effect>> LJLIL;
    public final MutableLiveData<List<OSZ<EffectCategoryResponse, List<Effect>>>> LJLILLLLZI;
    public final MutableLiveData<TEN> LJLJI;
    public final MutableLiveData<TEN> LJLJJI;
    public final MutableLiveData<AbstractC73638SvC<List<Effect>>> LJLJJL;
    public C73318Sq2 LJLJJLL;
    public TFO LJLJL;
    public final LifecycleOwner LJLJLJ;
    public final TMQ LJLJLLL;
    public final InterfaceC164626d8 LJLL;
    public final InterfaceC88472Yns<Effect, Boolean> LJLLI;
    public final InterfaceC88472Yns<EffectCategoryResponse, Boolean> LJLLILLLL;
    public final boolean LJLLJ;

    @Override // X.TL9
    public final LiveData<Object> getExtraData() {
        return null;
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C73318Sq2 c73318Sq2 = this.LJLJJLL;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        this.LJLJJLL = null;
    }

    @Override // X.TL9
    public final void F9() {
        C73487Ssl c73487Ssl;
        if (isDestroyed()) {
            return;
        }
        TEN value = this.LJLJI.getValue();
        if (value != null && (value == TEN.EMPTY || value == TEN.LOADING)) {
            return;
        }
        List<Effect> value2 = this.LJLIL.getValue();
        if (value2 != null && (true ^ value2.isEmpty())) {
            return;
        }
        this.LJLJI.setValue(TEN.LOADING);
        if (this.LJLLJ) {
            TMQ tmq = this.LJLJLLL;
            TFO tfo = this.LJLJL;
            if (tfo != null) {
                c73487Ssl = new C73487Ssl(tmq.LIZ(tfo).LJJJ(T16.LIZ()).LJIJJLI(new AfS64S0100000_12(this, 66)).LJJIJL(new IDhS105S0100000_12(this, 16)).LJJJ(C73969T1h.LIZIZ()));
            } else {
                "ListMeta not fetched yet".toString();
                throw new IllegalArgumentException("ListMeta not fetched yet");
            }
        } else {
            TMQ tmq2 = this.LJLJLLL;
            TFO tfo2 = this.LJLJL;
            if (tfo2 != null) {
                c73487Ssl = new C73487Ssl(tmq2.LIZ(tfo2).LJIJJLI(new AfS64S0100000_12(this, 68)).LJJIJL(new IDhS105S0100000_12(this, 17)));
            } else {
                "ListMeta not fetched yet".toString();
                throw new IllegalArgumentException("ListMeta not fetched yet");
            }
        }
        InterfaceC92693kP LJJII = c73487Ssl.LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS64S0100000_12(this, 52), new AfS64S0100000_12(this, 53));
        C73318Sq2 c73318Sq2 = this.LJLJJLL;
        if (c73318Sq2 == null) {
            c73318Sq2 = new C73318Sq2();
            this.LJLJJLL = c73318Sq2;
        }
        c73318Sq2.LIZ(LJJII);
    }

    @Override // X.TL9
    public final void u10() {
        if (isDestroyed()) {
            return;
        }
        TEN value = this.LJLJI.getValue();
        if (value != null && value != TEN.NONE) {
            return;
        }
        List<Effect> value2 = this.LJLIL.getValue();
        if (value2 != null && value2.isEmpty()) {
            return;
        }
        TEN value3 = this.LJLJJI.getValue();
        if (value3 != null && (value3 == TEN.EMPTY || value3 == TEN.LOADING)) {
            return;
        }
        this.LJLJJI.setValue(TEN.LOADING);
        throw new NoSuchMethodException("Category sticker list does not support load more action.");
    }

    @Override // X.TL9
    public final LiveData<List<Effect>> e7() {
        return this.LJLIL;
    }

    @Override // X.TL9
    public final LiveData<TEN> getLoadMoreState() {
        return this.LJLJJI;
    }

    @Override // X.TL9
    public final LiveData<TEN> getPageState() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC74451TJv
    public final LiveData<List<OSZ<EffectCategoryResponse, List<Effect>>>> qq0() {
        return this.LJLILLLLZI;
    }

    @Override // X.TL9
    public final void CD(RTW rtw) {
        if (rtw instanceof TFO) {
            this.LJLJL = (TFO) rtw;
            F9();
        }
    }

    public final void gv0(List<? extends Effect> data) {
        TEN ten;
        o.LJIIIZ(data, "data");
        this.LJLIL.setValue(data);
        MutableLiveData<TEN> mutableLiveData = this.LJLJI;
        if (data.isEmpty()) {
            ten = TEN.EMPTY;
        } else {
            ten = TEN.NONE;
        }
        mutableLiveData.setValue(ten);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoStickerListRecommendViewModel(C164246cW c164246cW, TMQ repository, InterfaceC164626d8 recommendRepository, C63P c63p, AqS168S0100000_2 aqS168S0100000_2) {
        super(c164246cW);
        o.LJIIIZ(repository, "repository");
        o.LJIIIZ(recommendRepository, "recommendRepository");
        this.LJLJLJ = c164246cW;
        this.LJLJLLL = repository;
        this.LJLL = recommendRepository;
        this.LJLLI = c63p;
        this.LJLLILLLL = aqS168S0100000_2;
        this.LJLLJ = true;
        MutableLiveData<List<Effect>> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = new MutableLiveData<>();
        this.LJLJI = new MutableLiveData<>();
        MutableLiveData<TEN> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJJI = mutableLiveData2;
        this.LJLJJL = new MutableLiveData<>();
        mutableLiveData.setValue(C61878OQg.INSTANCE);
        mutableLiveData2.setValue(TEN.NONE);
    }
}
