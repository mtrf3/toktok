package com.ss.android.ugc.tools.infosticker.view.internal.provider;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C45927I0t;
import X.C73340SqO;
import X.C73634Sv8;
import X.C74577TOr;
import X.InterfaceC83485Wpd;
import X.ORZ;
import X.OSZ;
import X.RTW;
import X.TEA;
import X.TEN;
import X.TL9;
import X.TLD;
import X.TLK;
import X.TMR;
import X.TNB;
import X.TNC;
import X.TND;
import X.TNE;
import X.TNF;
import X.TOJ;
import X.WM7;
import Y.AObserverS80S0100000_12;
import Y.AfS64S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InfoStickerProviderListViewModel extends HumbleViewModel implements TLK, TLD {
    public final MutableLiveData<String> LJLIL;
    public final TrendListViewModel LJLILLLLZI;
    public final ProviderStateViewModel LJLJI;
    public SearchListViewModel LJLJJI;
    public ProviderStateViewModel LJLJJL;
    public boolean LJLJJLL;
    public String LJLJL;
    public final MutableLiveData<List<ProviderEffect>> LJLJLJ;
    public final MutableLiveData<TEN> LJLJLLL;
    public final MutableLiveData<TEN> LJLL;
    public final MutableLiveData<Object> LJLLI;
    public final MutableLiveData<Map<ProviderEffect, OSZ<TEA, Integer>>> LJLLILLLL;
    public final MutableLiveData<C45927I0t<List<ProviderEffect>>> LJLLJ;
    public final MutableLiveData<C45927I0t<List<ProviderEffect>>> LJLLL;
    public final MutableLiveData<String> LJLLLL;
    public final AObserverS80S0100000_12 LJLLLLLL;
    public final AObserverS80S0100000_12 LJLZ;
    public final AObserverS80S0100000_12 LJZ;
    public final AObserverS80S0100000_12 LJZI;
    public final AObserverS80S0100000_12 LJZL;
    public final AObserverS80S0100000_12 LL;
    public final AObserverS80S0100000_12 LLD;
    public final LifecycleOwner LLF;
    public final TNB LLFF;
    public final InterfaceC83485Wpd LLFFF;

    /* loaded from: classes13.dex */
    public static final class SearchListViewModel extends BaseInfoStickerListViewModel {
        public TMR<ProviderEffect, ProviderEffectModel> LJLJJL;
        public long LJLJJLL;
        public final MutableLiveData<Object> LJLJL;
        public final TNB LJLJLJ;
        public final String LJLJLLL;
        public final InterfaceC83485Wpd LJLL;

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final AbstractC73638SvC<List<ProviderEffect>> gv0() {
            TMR<ProviderEffect, ProviderEffectModel> LIZIZ = this.LJLJLJ.LIZIZ(this.LJLJLLL);
            this.LJLJJL = LIZIZ;
            this.LJLJJLL = System.currentTimeMillis();
            InterfaceC83485Wpd interfaceC83485Wpd = this.LJLL;
            if (interfaceC83485Wpd != null) {
                interfaceC83485Wpd.LJIL(this.LJLJLLL);
            }
            return LIZIZ.LIZIZ().LJIILIIL(new AfS64S0100000_12(this, 56)).LJIJI(TNC.LJLIL);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final AbstractC73638SvC<List<ProviderEffect>> hv0() {
            C73634Sv8 LIZIZ;
            TMR<ProviderEffect, ProviderEffectModel> tmr = this.LJLJJL;
            if (tmr != null && (LIZIZ = tmr.LIZIZ()) != null) {
                return LIZIZ.LJIILIIL(new AfS64S0100000_12(this, 57)).LJIJI(TND.LJLIL);
            }
            return AbstractC73638SvC.LJIILJJIL(new IllegalStateException("Illegal method invoke order, should request data before request more."));
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.TL9
        public final LiveData<Object> getExtraData() {
            return this.LJLJL;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchListViewModel(LifecycleOwner lifecycleOwner, TNB repository, InterfaceC83485Wpd interfaceC83485Wpd, String keyWord) {
            super(lifecycleOwner);
            o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
            o.LJIIIZ(repository, "repository");
            o.LJIIIZ(keyWord, "keyWord");
            this.LJLJLJ = repository;
            this.LJLJLLL = keyWord;
            this.LJLL = interfaceC83485Wpd;
            this.LJLJL = new MutableLiveData<>();
        }
    }

    /* loaded from: classes13.dex */
    public static final class TrendListViewModel extends BaseInfoStickerListViewModel {
        public TMR<ProviderEffect, ProviderEffectModel> LJLJJL;
        public long LJLJJLL;
        public final MutableLiveData<Object> LJLJL;
        public final TNB LJLJLJ;
        public final InterfaceC83485Wpd LJLJLLL;

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final AbstractC73638SvC<List<ProviderEffect>> gv0() {
            TMR<ProviderEffect, ProviderEffectModel> LIZ = this.LJLJLJ.LIZ();
            this.LJLJJL = LIZ;
            this.LJLJJLL = System.currentTimeMillis();
            return LIZ.LIZIZ().LJIILIIL(new AfS64S0100000_12(this, 58)).LJIJI(TNE.LJLIL);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final AbstractC73638SvC<List<ProviderEffect>> hv0() {
            C73634Sv8 LIZIZ;
            TMR<ProviderEffect, ProviderEffectModel> tmr = this.LJLJJL;
            if (tmr != null && (LIZIZ = tmr.LIZIZ()) != null) {
                return LIZIZ.LJIILIIL(new AfS64S0100000_12(this, 59)).LJIJI(TNF.LJLIL);
            }
            return AbstractC73638SvC.LJIILJJIL(new IllegalStateException("Illegal method invoke order, should request data before request more."));
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.TL9
        public final LiveData<Object> getExtraData() {
            return this.LJLJL;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrendListViewModel(WM7 lifecycleOwner, TNB repository, InterfaceC83485Wpd interfaceC83485Wpd) {
            super(lifecycleOwner);
            o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
            o.LJIIIZ(repository, "repository");
            this.LJLJLJ = repository;
            this.LJLJLLL = interfaceC83485Wpd;
            this.LJLJL = new MutableLiveData<>();
        }
    }

    @Override // X.TL9
    public final void CD(RTW rtw) {
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.TL9
    public final void F9() {
        if (this.LJLJJLL) {
            this.LJLILLLLZI.F9();
            return;
        }
        SearchListViewModel searchListViewModel = this.LJLJJI;
        if (searchListViewModel == null) {
            return;
        }
        searchListViewModel.F9();
    }

    public final void iv0() {
        if (this.LJLJJLL) {
            return;
        }
        hv0(this.LJLJJI, this.LJLJJL);
        gv0(this.LJLILLLLZI, this.LJLJI);
        this.LJLIL.setValue(C73340SqO.LJIIIZ(this.LJLILLLLZI.LJLJL.getValue()));
        this.LJLJJLL = true;
    }

    @Override // X.TL9
    public final void u10() {
        if (this.LJLJJLL) {
            this.LJLILLLLZI.u10();
            return;
        }
        SearchListViewModel searchListViewModel = this.LJLJJI;
        if (searchListViewModel == null) {
            return;
        }
        searchListViewModel.u10();
    }

    @Override // X.TLD
    public final MutableLiveData AF() {
        return this.LJLLILLLL;
    }

    @Override // X.TLD
    public final MutableLiveData FB() {
        return this.LJLLJ;
    }

    @Override // X.TLD
    public final MutableLiveData KD() {
        return this.LJLLL;
    }

    @Override // X.TLK
    public final MutableLiveData LLZZJLIL() {
        return this.LJLLLL;
    }

    @Override // X.TL9
    public final LiveData<List<ProviderEffect>> e7() {
        return this.LJLJLJ;
    }

    @Override // X.TLK
    public final MutableLiveData ga() {
        return this.LJLIL;
    }

    @Override // X.TL9
    public final LiveData<Object> getExtraData() {
        return this.LJLLI;
    }

    @Override // X.TL9
    public final LiveData<TEN> getLoadMoreState() {
        return this.LJLL;
    }

    @Override // X.TL9
    public final LiveData<TEN> getPageState() {
        return this.LJLJLLL;
    }

    /* loaded from: classes13.dex */
    public static final class ProviderStateViewModel extends BaseInfoStickerStateViewModel {
        public final TNB LJLJJL;

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
        public final AbstractC73672Svk gv0(Object obj) {
            ProviderEffect sticker = (ProviderEffect) obj;
            o.LJIIIZ(sticker, "sticker");
            return this.LJLJJL.LIZJ(sticker).LJJIJL(TOJ.LJLIL);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderStateViewModel(LifecycleOwner lifecycleOwner, TNB repository) {
            super(lifecycleOwner);
            o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
            o.LJIIIZ(repository, "repository");
            this.LJLJJL = repository;
        }
    }

    @Override // X.TLD
    public final void DR(Object sticker) {
        o.LJIIIZ(sticker, "sticker");
        if (this.LJLJJLL) {
            this.LJLJI.DR(sticker);
            return;
        }
        ProviderStateViewModel providerStateViewModel = this.LJLJJL;
        if (providerStateViewModel == null) {
            return;
        }
        providerStateViewModel.DR(sticker);
    }

    @Override // X.TLK
    public final void J4(String str) {
        Object obj;
        MutableLiveData<Object> mutableLiveData;
        MutableLiveData<C45927I0t<List<Object>>> mutableLiveData2;
        MutableLiveData<C45927I0t<List<Object>>> mutableLiveData3;
        MutableLiveData<C45927I0t<List<Object>>> mutableLiveData4;
        if (str == null || str.length() == 0) {
            iv0();
        } else if (this.LJLJJLL || !o.LJ(this.LJLJL, str)) {
            if (this.LJLJJLL) {
                hv0(this.LJLILLLLZI, this.LJLJI);
            }
            if (true ^ o.LJ(this.LJLJL, str)) {
                if (!this.LJLJJLL) {
                    hv0(this.LJLJJI, this.LJLJJL);
                }
                ProviderStateViewModel providerStateViewModel = this.LJLJJL;
                if (providerStateViewModel != null && (mutableLiveData4 = providerStateViewModel.LJLILLLLZI) != null) {
                    mutableLiveData4.removeObserver(this.LL);
                }
                ProviderStateViewModel providerStateViewModel2 = this.LJLJJL;
                if (providerStateViewModel2 != null && (mutableLiveData3 = providerStateViewModel2.LJLJI) != null) {
                    mutableLiveData3.removeObserver(this.LLD);
                }
                SearchListViewModel searchListViewModel = this.LJLJJI;
                if (searchListViewModel != null) {
                    searchListViewModel.onDestroy();
                }
                ProviderStateViewModel providerStateViewModel3 = this.LJLJJL;
                if (providerStateViewModel3 != null) {
                    providerStateViewModel3.onDestroy();
                }
                SearchListViewModel searchListViewModel2 = new SearchListViewModel(this.LLF, this.LLFF, this.LLFFF, str);
                searchListViewModel2.F9();
                this.LJLJJI = searchListViewModel2;
                ProviderStateViewModel providerStateViewModel4 = new ProviderStateViewModel(this.LLF, this.LLFF);
                this.LJLJJL = providerStateViewModel4;
                MutableLiveData<C45927I0t<List<Object>>> mutableLiveData5 = providerStateViewModel4.LJLILLLLZI;
                if (mutableLiveData5 != null) {
                    mutableLiveData5.observe(this.LLF, this.LL);
                }
                ProviderStateViewModel providerStateViewModel5 = this.LJLJJL;
                if (providerStateViewModel5 != null && (mutableLiveData2 = providerStateViewModel5.LJLJI) != null) {
                    mutableLiveData2.observe(this.LLF, this.LLD);
                }
            } else {
                MutableLiveData<String> mutableLiveData6 = this.LJLIL;
                SearchListViewModel searchListViewModel3 = this.LJLJJI;
                if (searchListViewModel3 != null && (mutableLiveData = searchListViewModel3.LJLJL) != null) {
                    obj = mutableLiveData.getValue();
                } else {
                    obj = null;
                }
                mutableLiveData6.setValue(C73340SqO.LJIIIZ(obj));
            }
            gv0(this.LJLJJI, this.LJLJJL);
            this.LJLJJLL = false;
            this.LJLJL = str;
        }
        this.LJLLLL.setValue(str);
    }

    public final void gv0(TL9<ProviderEffect> tl9, TLD<ProviderEffect> tld) {
        MutableLiveData<Map<Object, OSZ<TEA, Integer>>> mutableLiveData;
        if (tl9 != null) {
            MutableLiveData<List<Object>> mutableLiveData2 = ((BaseInfoStickerListViewModel) tl9).LJLIL;
            if (mutableLiveData2 != null) {
                mutableLiveData2.observe(this.LLF, this.LJLLLLLL);
            }
            MutableLiveData<TEN> mutableLiveData3 = ((BaseInfoStickerListViewModel) tl9).LJLILLLLZI;
            if (mutableLiveData3 != null) {
                mutableLiveData3.observe(this.LLF, this.LJLZ);
            }
            LiveData<TEN> loadMoreState = tl9.getLoadMoreState();
            if (loadMoreState != null) {
                loadMoreState.observe(this.LLF, this.LJZ);
            }
            LiveData<Object> extraData = tl9.getExtraData();
            if (extraData != null) {
                extraData.observe(this.LLF, this.LJZI);
            }
        }
        if (tld != null && (mutableLiveData = ((BaseInfoStickerStateViewModel) tld).LJLIL) != null) {
            mutableLiveData.observe(this.LLF, this.LJZL);
        }
    }

    public final void hv0(TL9<ProviderEffect> tl9, TLD<ProviderEffect> tld) {
        MutableLiveData<Map<Object, OSZ<TEA, Integer>>> mutableLiveData;
        if (tl9 != null) {
            MutableLiveData<List<Object>> mutableLiveData2 = ((BaseInfoStickerListViewModel) tl9).LJLIL;
            if (mutableLiveData2 != null) {
                mutableLiveData2.removeObserver(this.LJLLLLLL);
            }
            MutableLiveData<TEN> mutableLiveData3 = ((BaseInfoStickerListViewModel) tl9).LJLILLLLZI;
            if (mutableLiveData3 != null) {
                mutableLiveData3.removeObserver(this.LJLZ);
            }
            LiveData<TEN> loadMoreState = tl9.getLoadMoreState();
            if (loadMoreState != null) {
                loadMoreState.removeObserver(this.LJZ);
            }
            LiveData<Object> extraData = tl9.getExtraData();
            if (extraData != null) {
                extraData.removeObserver(this.LJZI);
            }
        }
        if (tld != null && (mutableLiveData = ((BaseInfoStickerStateViewModel) tld).LJLIL) != null) {
            mutableLiveData.removeObserver(this.LJZL);
        }
    }

    public final void jv0(MutableLiveData<C45927I0t<List<ProviderEffect>>> mutableLiveData, List<ProviderEffect> list) {
        List arrayList;
        List<ProviderEffect> LIZIZ;
        C45927I0t<List<ProviderEffect>> value = mutableLiveData.getValue();
        if (value != null && (LIZIZ = value.LIZIZ()) != null) {
            arrayList = ORZ.LLJILJILJ(LIZIZ);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.addAll(list);
        mutableLiveData.setValue(new C45927I0t<>(arrayList));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoStickerProviderListViewModel(WM7 lifecycleOwner, TNB repository, InterfaceC83485Wpd interfaceC83485Wpd, String defaultSearchTerm) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(repository, "repository");
        o.LJIIIZ(defaultSearchTerm, "defaultSearchTerm");
        this.LLF = lifecycleOwner;
        this.LLFF = repository;
        this.LLFFF = interfaceC83485Wpd;
        this.LJLIL = new MutableLiveData<>();
        this.LJLILLLLZI = new TrendListViewModel(lifecycleOwner, repository, interfaceC83485Wpd);
        ProviderStateViewModel providerStateViewModel = new ProviderStateViewModel(lifecycleOwner, repository);
        this.LJLJI = providerStateViewModel;
        this.LJLJL = "";
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLJLLL = new MutableLiveData<>();
        this.LJLL = new MutableLiveData<>();
        this.LJLLI = new MutableLiveData<>();
        this.LJLLILLLL = new MutableLiveData<>();
        this.LJLLJ = new MutableLiveData<>();
        this.LJLLL = new MutableLiveData<>();
        this.LJLLLL = new MutableLiveData<>();
        this.LJLLLLLL = new AObserverS80S0100000_12(this, 34);
        this.LJLZ = new AObserverS80S0100000_12(this, 36);
        this.LJZ = new AObserverS80S0100000_12(this, 35);
        this.LJZI = new AObserverS80S0100000_12(this, 32);
        this.LJZL = new AObserverS80S0100000_12(this, 38);
        AObserverS80S0100000_12 aObserverS80S0100000_12 = new AObserverS80S0100000_12(this, 37);
        this.LL = aObserverS80S0100000_12;
        AObserverS80S0100000_12 aObserverS80S0100000_122 = new AObserverS80S0100000_12(this, 33);
        this.LLD = aObserverS80S0100000_122;
        if (defaultSearchTerm.length() == 0) {
            iv0();
        } else {
            J4(defaultSearchTerm);
        }
        providerStateViewModel.LJLILLLLZI.observe(lifecycleOwner, aObserverS80S0100000_12);
        providerStateViewModel.LJLJI.observe(lifecycleOwner, aObserverS80S0100000_122);
    }

    public /* synthetic */ InfoStickerProviderListViewModel(WM7 wm7, TNB tnb, C74577TOr c74577TOr, int i) {
        this(wm7, tnb, (i & 4) != 0 ? null : c74577TOr, (i & 8) != 0 ? "" : null);
    }
}
