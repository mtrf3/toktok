package com.ss.android.ugc.tools.infosticker.view.internal.main;

import X.AbstractC73638SvC;
import X.C69610RTq;
import X.C73634Sv8;
import X.InterfaceC88472Yns;
import X.TFP;
import X.TFQ;
import X.TMQ;
import X.TMR;
import Y.IDhS99S0100000_6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InfoStickerCategoryListViewModel extends BaseInfoStickerListViewModel {
    public TMR<Effect, CategoryEffectModel> LJLJJL;
    public final TMQ LJLJJLL;
    public final C69610RTq LJLJL;
    public final InterfaceC88472Yns<Effect, Boolean> LJLJLJ;

    public InfoStickerCategoryListViewModel() {
        throw null;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC73638SvC<List<Effect>> gv0() {
        TMR<Effect, CategoryEffectModel> LIZIZ = this.LJLJJLL.LIZIZ(this.LJLJL);
        this.LJLJJL = LIZIZ;
        C73634Sv8 next = LIZIZ.next();
        if (this.LJLJLJ == TFQ.LIZ) {
            return next;
        }
        return next.LJIJI(new IDhS99S0100000_6(this, 1));
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC73638SvC<List<Effect>> hv0() {
        C73634Sv8 next;
        TMR<Effect, CategoryEffectModel> tmr = this.LJLJJL;
        if (tmr != null && (next = tmr.next()) != null) {
            if (this.LJLJLJ == TFQ.LIZ) {
                return next;
            }
            return next.LJIJI(new IDhS99S0100000_6(this, 2));
        }
        return AbstractC73638SvC.LJIILJJIL(new IllegalStateException("Illegal method invoke order, should request data before request more."));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoStickerCategoryListViewModel(LifecycleOwner lifecycleOwner, TMQ repository, C69610RTq listMeta) {
        super(lifecycleOwner);
        TFP dataFilter = TFQ.LIZ;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(repository, "repository");
        o.LJIIIZ(listMeta, "listMeta");
        o.LJIIIZ(dataFilter, "dataFilter");
        this.LJLJJLL = repository;
        this.LJLJL = listMeta;
        this.LJLJLJ = dataFilter;
    }
}
