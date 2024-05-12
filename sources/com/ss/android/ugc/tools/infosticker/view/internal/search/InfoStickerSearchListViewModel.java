package com.ss.android.ugc.tools.infosticker.view.internal.search;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C73634Sv8;
import X.E8O;
import X.RTW;
import X.TEN;
import X.TLD;
import X.TLL;
import X.TMR;
import Y.AfS58S0100000_6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InfoStickerSearchListViewModel extends HumbleViewModel implements TLL, TLD {
    public boolean LJLIL;

    /* loaded from: classes13.dex */
    public static final class PersonalizedSearchListViewModel extends BaseInfoStickerListViewModel {
        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.TL9
        public final LiveData<Object> getExtraData() {
            return null;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.TL9
        public final LiveData<TEN> getLoadMoreState() {
            return null;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final AbstractC73638SvC<List<InfoStickerEffect>> hv0() {
            return AbstractC73638SvC.LJIILJJIL(new IllegalStateException("Illegal method invoke order, should request data before request more."));
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final AbstractC73638SvC<List<InfoStickerEffect>> gv0() {
            throw null;
        }
    }

    /* loaded from: classes13.dex */
    public static final class RecommendListModel extends BaseInfoStickerListViewModel {
        public TMR<InfoStickerEffect, InfoStickerListModel> LJLJJL;

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.TL9
        public final LiveData<Object> getExtraData() {
            return null;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.TL9
        public final LiveData<TEN> getLoadMoreState() {
            return null;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final AbstractC73638SvC<List<InfoStickerEffect>> hv0() {
            C73634Sv8 LIZIZ;
            TMR<InfoStickerEffect, InfoStickerListModel> tmr = this.LJLJJL;
            if (tmr != null && (LIZIZ = tmr.LIZIZ()) != null) {
                return LIZIZ.LJIILIIL(new AfS58S0100000_6(this, 24)).LJIJI(E8O.LJLIL);
            }
            return AbstractC73638SvC.LJIILJJIL(new IllegalStateException("Illegal method invoke order, should request data before request more."));
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final AbstractC73638SvC<List<InfoStickerEffect>> gv0() {
            throw null;
        }
    }

    public InfoStickerSearchListViewModel() {
        throw null;
    }

    @Override // X.TLD
    public final MutableLiveData AF() {
        return null;
    }

    @Override // X.TL9
    public final void CD(RTW rtw) {
    }

    @Override // X.TLD
    public final MutableLiveData FB() {
        return null;
    }

    @Override // X.TLL
    public final void GI() {
        this.LJLIL = true;
        throw null;
    }

    @Override // X.TLD
    public final MutableLiveData KD() {
        return null;
    }

    @Override // X.TL9
    public final LiveData<List<InfoStickerEffect>> e7() {
        return null;
    }

    @Override // X.TLL
    public final MutableLiveData ga() {
        return null;
    }

    @Override // X.TL9
    public final LiveData<Object> getExtraData() {
        return null;
    }

    @Override // X.TLL
    public final MutableLiveData getKeyword() {
        return null;
    }

    @Override // X.TL9
    public final LiveData<TEN> getLoadMoreState() {
        return null;
    }

    @Override // X.TL9
    public final LiveData<TEN> getPageState() {
        return null;
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.TL9
    public final void F9() {
        if (!this.LJLIL) {
        } else {
            throw null;
        }
    }

    @Override // X.TL9
    public final void u10() {
        if (!this.LJLIL) {
        } else {
            throw null;
        }
    }

    /* loaded from: classes13.dex */
    public static final class SearchStateViewModel extends BaseInfoStickerStateViewModel {
        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
        public final AbstractC73672Svk gv0(Object sticker) {
            o.LJIIIZ(sticker, "sticker");
            throw null;
        }
    }

    @Override // X.TLD
    public final void DR(Object sticker) {
        o.LJIIIZ(sticker, "sticker");
        if (!this.LJLIL) {
        } else {
            throw null;
        }
    }
}
