package com.ss.android.ugc.gamora.recorder.sticker.optionlist;

import X.ActivityC45651qj;
import X.C0JU;
import X.C15280iq;
import X.C29901Fi;
import X.C47261Igj;
import X.C76800UCe;
import X.C81641W2j;
import X.C81642W2k;
import X.C81643W2l;
import X.C81668W3k;
import X.C82398WVm;
import X.C82622Wbi;
import X.C84488XDw;
import X.EnumC44267HYx;
import X.I0N;
import X.InterfaceC135635Tz;
import X.InterfaceC84498XEg;
import X.TID;
import X.TK3;
import android.content.Context;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class OptionSceneViewModel extends LifecycleAwareViewModel<OptionPanelState> implements TK3, InterfaceC135635Tz {
    public static final C81642W2k LJLLILLLL = new C81642W2k();
    public final C82622Wbi LJLJL;
    public final I0N LJLJLJ;
    public Effect LJLJLLL;
    public final C29901Fi<Boolean> LJLL;
    public final LiveEvent<Boolean> LJLLI;

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public OptionPanelState kv0() {
        return new OptionPanelState(null, null, false, 7, null);
    }

    public final void Nv0() {
        I0N i0n;
        Effect effect = this.LJLJLLL;
        if (effect != null && (i0n = this.LJLJLJ) != null) {
            C82398WVm.LJIIIIZZ(i0n, new TID(effect, -1, EnumC44267HYx.MANUAL_SET, null, null, null, null, LiveLayoutPreloadThreadPriority.DEFAULT, true, null));
        }
    }

    public final void Mv0() {
        InterfaceC84498XEg LIZ = C84488XDw.LIZ((Context) getDiContainer().LJ(ActivityC45651qj.class, null), null);
        Effect effect = this.LJLJLLL;
        if (effect != null) {
            EffectManager LJLJJLL = LIZ.LJLJJLL();
            if (LJLJJLL != null && !LJLJJLL.isEffectDownloaded(effect)) {
                C15280iq.LIZIZ("OptionSceneViewModel", "effect content downloading");
                Kv0(LIZ);
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C15280iq.LIZIZ("OptionSceneViewModel", "effect metadate downloading");
        Lv0(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.TK3
    public boolean ND() {
        return ((OptionPanelState) lv0()).isBottomSheetVisible();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.TK3
    public boolean isShowing() {
        return ((UiState) lv0()).getUi() instanceof C81668W3k;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJL;
    }

    public OptionSceneViewModel(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJL = diContainer;
        this.LJLJLJ = (I0N) getDiContainer().LJIIIIZZ(null, I0N.class);
        C29901Fi<Boolean> c29901Fi = new C29901Fi<>();
        this.LJLL = c29901Fi;
        this.LJLLI = c29901Fi;
        Mv0();
    }

    private final void Lv0(InterfaceC84498XEg interfaceC84498XEg) {
        interfaceC84498XEg.LJJJIL(C47261Igj.LJJIJIL("7171145719842083329"), C0JU.LIZ("panel", "default"), new C81643W2l(this, interfaceC84498XEg));
    }

    public final void Kv0(InterfaceC84498XEg interfaceC84498XEg) {
        EffectManager LJLJJLL;
        Effect effect = this.LJLJLLL;
        if (effect != null && (LJLJJLL = interfaceC84498XEg.LJLJJLL()) != null) {
            LJLJJLL.fetchEffect(effect, new C81641W2j(interfaceC84498XEg, effect));
        }
    }

    @Override // X.TK3
    public void LJJLIIIJL(boolean z) {
        setState(new AqS18S0010000_14(z, 29));
    }

    public final void Ov0(boolean z) {
        setStateImmediate(new AqS18S0010000_14(z, 30));
    }

    @Override // X.TK3
    public void hj(boolean z) {
        this.LJLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.TK3
    public void i1(Effect effect) {
        o.LJIIIZ(effect, "effect");
        setState(new AqS180S0100000_14(effect, 238));
    }
}
