package com.ss.android.ugc.tools.infosticker.view.internal.main;

import X.AbstractC73638SvC;
import X.C164246cW;
import X.C73487Ssl;
import X.C73969T1h;
import X.InterfaceC74451TJv;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.RTW;
import X.T16;
import X.TFO;
import X.TMQ;
import Y.AfS64S0100000_12;
import Y.IDhS105S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InfoStickerListViewModel extends BaseInfoStickerListViewModel implements InterfaceC74451TJv {
    public final MutableLiveData<List<OSZ<EffectCategoryResponse, List<Effect>>>> LJLJJL;
    public TFO LJLJJLL;
    public final TMQ LJLJL;
    public final InterfaceC88472Yns<Effect, Boolean> LJLJLJ;
    public final InterfaceC88472Yns<EffectCategoryResponse, Boolean> LJLJLLL;
    public final boolean LJLL;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC73638SvC<List<Effect>> gv0() {
        if (this.LJLL) {
            TMQ tmq = this.LJLJL;
            TFO tfo = this.LJLJJLL;
            if (tfo != null) {
                return new C73487Ssl(tmq.LIZ(tfo).LJJJ(T16.LJ).LJIJJLI(new AfS64S0100000_12(this, 54)).LJJIJL(new IDhS105S0100000_12(this, 14)).LJJJ(C73969T1h.LIZIZ()));
            }
            "ListMeta not fetched yet".toString();
            throw new IllegalArgumentException("ListMeta not fetched yet");
        }
        TMQ tmq2 = this.LJLJL;
        TFO tfo2 = this.LJLJJLL;
        if (tfo2 != null) {
            return new C73487Ssl(tmq2.LIZ(tfo2).LJIJJLI(new AfS64S0100000_12(this, 55)).LJJIJL(new IDhS105S0100000_12(this, 15)));
        }
        "ListMeta not fetched yet".toString();
        throw new IllegalArgumentException("ListMeta not fetched yet");
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC73638SvC<List<Effect>> hv0() {
        throw new NoSuchMethodException("Category sticker list does not support load more action.");
    }

    @Override // X.InterfaceC74451TJv
    public final LiveData<List<OSZ<EffectCategoryResponse, List<Effect>>>> qq0() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.TL9
    public final void CD(RTW rtw) {
        if (rtw instanceof TFO) {
            this.LJLJJLL = (TFO) rtw;
            F9();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoStickerListViewModel(C164246cW lifecycleOwner, TMQ repository, InterfaceC88472Yns dataFilter, InterfaceC88472Yns categoryFilter, boolean z) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(repository, "repository");
        o.LJIIIZ(dataFilter, "dataFilter");
        o.LJIIIZ(categoryFilter, "categoryFilter");
        this.LJLJL = repository;
        this.LJLJLJ = dataFilter;
        this.LJLJLLL = categoryFilter;
        this.LJLL = z;
        this.LJLJJL = new MutableLiveData<>();
    }
}
