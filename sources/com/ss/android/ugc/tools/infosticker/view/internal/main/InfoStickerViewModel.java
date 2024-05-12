package com.ss.android.ugc.tools.infosticker.view.internal.main;

import X.C164246cW;
import X.C16880lQ;
import X.C47919IrL;
import X.C69610RTq;
import X.C73318Sq2;
import X.C73969T1h;
import X.C74577TOr;
import X.InterfaceC164626d8;
import X.InterfaceC65784Pro;
import X.InterfaceC74451TJv;
import X.InterfaceC88472Yns;
import X.T16;
import X.TL9;
import X.TLD;
import X.TLJ;
import X.TLK;
import X.TLL;
import X.TLZ;
import X.TMO;
import X.TMQ;
import X.TNB;
import Y.AObserverS80S0100000_12;
import Y.AfS64S0100000_12;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InfoStickerViewModel extends HumbleViewModel implements TLJ {
    public final LinkedBlockingQueue<Effect> LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final C73318Sq2 LJLJJL;
    public final TMO LJLJJLL;
    public final Context LJLJL;
    public final LifecycleOwner LJLJLJ;
    public final TMQ LJLJLLL;
    public final TNB LJLL;
    public final InterfaceC164626d8 LJLLI;
    public final InterfaceC74451TJv<EffectCategoryResponse, Effect> LJLLILLLL;
    public final TLD<Effect> LJLLJ;
    public final TL9<Effect> LJLLL;
    public final TLD<Effect> LJLLLL;
    public final TLK<ProviderEffect> LJLLLLLL;
    public final TLD<ProviderEffect> LJLZ;
    public final TLL<InfoStickerEffect> LJZ;
    public final TLD<InfoStickerEffect> LJZI;
    public final TLZ LJZL;
    public final InterfaceC88472Yns<C69610RTq, TL9<Effect>> LL;
    public final InterfaceC65784Pro<TLD<Effect>> LLD;

    public InfoStickerViewModel() {
        throw null;
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLIL.clear();
        this.LJLJJL.dispose();
        C47919IrL.LIZLLL(this.LJLJJLL);
    }

    public final void gv0() {
        NetworkInfo LLLZIL;
        if (!isDestroyed() && this.LJLILLLLZI && !this.LJLJI) {
            Context context = this.LJLJL;
            if (context != null && (LLLZIL = C16880lQ.LLLZIL((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"), 1)) != null && LLLZIL.isAvailable()) {
                return;
            }
            this.LJLJI = true;
            Effect poll = this.LJLIL.poll();
            if (poll == null) {
                this.LJLJI = false;
            } else {
                this.LJLJJL.LIZ(this.LJLJLLL.LJFF(poll, false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(this, 78), new AfS64S0100000_12(this, 79)));
            }
        }
    }

    @Override // X.TLJ
    public final TLD<Effect> Aj() {
        return this.LJLLJ;
    }

    @Override // X.TLJ
    public final TL9<Effect> I40() {
        return this.LJLLL;
    }

    @Override // X.TLJ
    public final TLD<Effect> LS() {
        return this.LJLLLL;
    }

    @Override // X.TLJ
    public final TLZ Rp() {
        return this.LJZL;
    }

    @Override // X.TLJ
    public final InterfaceC74451TJv<EffectCategoryResponse, Effect> bs0() {
        return this.LJLLILLLL;
    }

    @Override // X.TLJ
    public final TLK<ProviderEffect> gf0() {
        return this.LJLLLLLL;
    }

    @Override // X.TLJ
    public final TLL<InfoStickerEffect> hm0() {
        return this.LJZ;
    }

    @Override // X.TLJ
    public final TLD<ProviderEffect> jN() {
        return this.LJLZ;
    }

    @Override // X.TLJ
    public final TLD<InfoStickerEffect> pd() {
        return this.LJZI;
    }

    @Override // X.TLJ
    public final void Fg(boolean z) {
        this.LJLILLLLZI = z;
        if (z) {
            gv0();
        }
    }

    @Override // X.TLJ
    public final void Nm0(List<? extends Effect> effects) {
        o.LJIIIZ(effects, "effects");
        if (isDestroyed()) {
            return;
        }
        this.LJLIL.addAll(effects);
        if (!this.LJLJJI) {
            C47919IrL.LIZIZ(this.LJLJL);
            C47919IrL.LIZLLL(this.LJLJJLL);
            this.LJLJJI = true;
        }
        gv0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoStickerViewModel(Context context, C164246cW lifecycleOwner, TMQ stickerRepository, TNB stickerProviderRepository, InterfaceC74451TJv interfaceC74451TJv) {
        super(lifecycleOwner);
        InfoStickerStateViewModel infoStickerStateViewModel = new InfoStickerStateViewModel(lifecycleOwner, stickerRepository);
        InfoStickerEmojiListViewModel infoStickerEmojiListViewModel = new InfoStickerEmojiListViewModel(lifecycleOwner, stickerRepository);
        InfoStickerStateViewModel infoStickerStateViewModel2 = new InfoStickerStateViewModel(lifecycleOwner, stickerRepository);
        InfoStickerProviderListViewModel infoStickerProviderListViewModel = new InfoStickerProviderListViewModel(lifecycleOwner, stickerProviderRepository, (C74577TOr) null, 12);
        InfoStickerListMetaViewModel infoStickerListMetaViewModel = new InfoStickerListMetaViewModel(lifecycleOwner, stickerRepository);
        AqS143S0200000_12 aqS143S0200000_12 = new AqS143S0200000_12(lifecycleOwner, stickerRepository, 73);
        AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(lifecycleOwner, stickerRepository, 43);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerRepository, "stickerRepository");
        o.LJIIIZ(stickerProviderRepository, "stickerProviderRepository");
        this.LJLJL = context;
        this.LJLJLJ = lifecycleOwner;
        this.LJLJLLL = stickerRepository;
        this.LJLL = stickerProviderRepository;
        this.LJLLI = null;
        this.LJLLILLLL = interfaceC74451TJv;
        this.LJLLJ = infoStickerStateViewModel;
        this.LJLLL = infoStickerEmojiListViewModel;
        this.LJLLLL = infoStickerStateViewModel2;
        this.LJLLLLLL = infoStickerProviderListViewModel;
        this.LJLZ = infoStickerProviderListViewModel;
        this.LJZ = null;
        this.LJZI = null;
        this.LJZL = infoStickerListMetaViewModel;
        this.LL = aqS143S0200000_12;
        this.LLD = aqS159S0200000_12;
        infoStickerListMetaViewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 51));
        this.LJLIL = new LinkedBlockingQueue<>();
        this.LJLJJL = new C73318Sq2();
        this.LJLJJLL = new TMO(this);
    }
}
