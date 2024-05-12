package com.ss.android.ugc.aweme.sticker.panel.info;

import X.AbstractC46187IAt;
import X.C29901Fi;
import X.C2U8;
import X.C3BJ;
import X.C43416H2e;
import X.C46186IAs;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C74437TJh;
import X.C76P;
import X.C79853Bl;
import X.C82622Wbi;
import X.I0N;
import X.InterfaceC115514g7;
import X.InterfaceC135635Tz;
import X.InterfaceC29911Fj;
import X.InterfaceC45925I0r;
import X.InterfaceC74236TBo;
import X.InterfaceC74330TFe;
import X.InterfaceC74393THp;
import X.InterfaceC74443TJn;
import X.TBT;
import X.TEZ;
import X.THU;
import X.THX;
import X.TJI;
import X.TJZ;
import X.UCI;
import X.V1M;
import X.W27;
import X.W2A;
import X.W2B;
import X.W2C;
import X.W2D;
import X.W2E;
import X.W2F;
import X.W2G;
import X.W2H;
import X.W2I;
import X.W2O;
import X.W2P;
import X.W2Q;
import X.W2S;
import X.W3D;
import X.W3E;
import X.W3F;
import X.W3G;
import X.W3H;
import X.W3I;
import X.W3L;
import X.XKX;
import X.XLL;
import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.IDeS153S0200000_15;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.ProTemplateEffect;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class EffectInfoViewModel extends LifecycleAwareViewModel<EffectInfoPanelState> implements InterfaceC74330TFe, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public final C82622Wbi LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final TEZ LJLLJ;
    public final InterfaceC74443TJn LJLLL;
    public final C3BJ<W27> LJLLLL;
    public final C29901Fi<W2O> LJLLLLLL;
    public final InterfaceC29911Fj<AbstractC46187IAt> LJLZ;
    public final LiveEvent<W2O> LJZ;

    static {
        TBT tbt = new TBT(EffectInfoViewModel.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(EffectInfoViewModel.class, "stickerPanelApiComponent", "getStickerPanelApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(EffectInfoViewModel.class, "effectDiscoverApiComponent", "getEffectDiscoverApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/effectdiscover/EffectDiscoverApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(EffectInfoViewModel.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(EffectInfoViewModel.class, "favoriteProcessor", "getFavoriteProcessor()Lcom/ss/android/ugc/aweme/sticker/favorite/FavoriteStickerProcessor;", 0, c65351Pkp)};
    }

    private final THU Lv0() {
        return (THU) this.LJLL.LIZ(this, LJZI[2]);
    }

    private final InterfaceC45925I0r Pv0() {
        return (InterfaceC45925I0r) this.LJLJLLL.LIZ(this, LJZI[1]);
    }

    private final void Sv0() {
        withState(new AqS180S0100000_14(this, 180));
    }

    private final void Tv0() {
        withState(new AqS180S0100000_14(this, 181));
    }

    private final void Uv0() {
        withState(new AqS180S0100000_14(this, 182));
    }

    private final void Vv0() {
        withState(new AqS180S0100000_14(this, 183));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public EffectInfoPanelState kv0() {
        return new EffectInfoPanelState(null, null, null, false, false, false, false, false, false, null, 1023, null);
    }

    public final THX Mv0() {
        return (THX) this.LJLLILLLL.LIZ(this, LJZI[4]);
    }

    public final ShortVideoContext Nv0() {
        return (ShortVideoContext) this.LJLLI.LIZ(this, LJZI[3]);
    }

    public final I0N Ov0() {
        return (I0N) this.LJLJLJ.LIZ(this, LJZI[0]);
    }

    public final void bw0() {
        InterfaceC74393THp LJJJJLL;
        TEZ tez = this.LJLLJ;
        if (tez != null && (LJJJJLL = tez.LJJJJLL()) != null) {
            LJJJJLL.LIZIZ(new TJI("sticker_category:favorite", 0, 0, 0, false, null, 510));
        }
    }

    @Override // X.InterfaceC74330TFe
    public void hide() {
        setStateImmediate(W3I.LJLIL);
    }

    private final void Zv0() {
        if (!Mv0().isLogin()) {
            this.LJLLLLLL.LJII(new W2P(new W3L(this)));
        } else {
            withState(new AqS180S0100000_14(this, 184));
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public void onStart() {
        TEZ LLLLL;
        InterfaceC74393THp LJJJJLL;
        InterfaceC74443TJn LJIJ;
        TJZ LJJJJ;
        MutableLiveData<C74437TJh> mutableLiveData;
        super.onStart();
        I0N Ov0 = Ov0();
        if (Ov0 != null && (LLLLL = Ov0.LLLLL()) != null && (LJJJJLL = LLLLL.LJJJJLL()) != null && (LJIJ = LJJJJLL.LJIJ()) != null && (LJJJJ = LJIJ.LJJJJ()) != null && (mutableLiveData = LJJJJ.LJLJI) != null) {
            mutableLiveData.observe(this, new AObserverS82S0100000_14(this, 35));
        }
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJL;
    }

    public EffectInfoViewModel(C82622Wbi diContainer) {
        TEZ tez;
        InterfaceC74443TJn interfaceC74443TJn;
        InterfaceC74393THp LJJJJLL;
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJL = diContainer;
        this.LJLJLJ = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJLJLLL = UCI.LJII(getDiContainer(), InterfaceC45925I0r.class, null);
        this.LJLL = UCI.LJII(getDiContainer(), THU.class, null);
        this.LJLLI = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), THX.class, null);
        I0N Ov0 = Ov0();
        if (Ov0 != null) {
            tez = Ov0.LLLLL();
        } else {
            tez = null;
        }
        this.LJLLJ = tez;
        if (tez != null && (LJJJJLL = tez.LJJJJLL()) != null) {
            interfaceC74443TJn = LJJJJLL.LJIJ();
        } else {
            interfaceC74443TJn = null;
        }
        this.LJLLL = interfaceC74443TJn;
        XLL LIZ = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLLLL = LIZ;
        C29901Fi<W2O> c29901Fi = new C29901Fi<>();
        this.LJLLLLLL = c29901Fi;
        this.LJLZ = new AObjectS89S0100000_14(this, 163);
        this.LJZ = c29901Fi;
        V1M.LJJIJIIJIL(new IDeS153S0200000_15(LIZ, new W3E(this, null), 0), ViewModelKt.getViewModelScope(this));
    }

    public final void Kv0(W27 event) {
        o.LJIIIZ(event, "event");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new W3D(this, event, null), 3);
    }

    public final boolean Qv0(Effect effect) {
        boolean z;
        boolean z2 = true;
        if (C43416H2e.LIZ() && (((effect instanceof MobileEffect) && ((MobileEffect) effect).getModerationStatus() != 3) || (effect instanceof ProTemplateEffect) || (effect instanceof DraftEffect))) {
            z = true;
        } else {
            z = false;
        }
        String extra = effect.getExtra();
        if (extra != null && extra.length() > 0) {
            if (!z && !new JSONObject(extra).optBoolean("forbid_favorite")) {
                z2 = false;
            }
            return z2;
        }
        return z;
    }

    public final boolean Rv0(Effect effect) {
        if (!C43416H2e.LIZ()) {
            return false;
        }
        if (!(effect instanceof MobileEffect) && !(effect instanceof DraftEffect)) {
            return false;
        }
        return true;
    }

    public final void Wv0(Activity activity) {
        THX Mv0 = Mv0();
        Mv0().LIZJ();
        Mv0.LIZIZ(activity, "favorite_sticker", 242, null, new AqS164S0100000_14(this, 177));
    }

    public final void Yv0(AbstractC46187IAt abstractC46187IAt) {
        if (abstractC46187IAt instanceof C46186IAs) {
            setStateImmediate(W3G.LJLIL);
        }
    }

    public final void aw0(W27 w27) {
        if (w27 instanceof W2G) {
            withState(new AqS180S0100000_14(this, 185));
            Vv0();
            return;
        }
        if (w27 instanceof W2E) {
            Zv0();
            Tv0();
            return;
        }
        if (w27 instanceof W2B) {
            this.LJLLLLLL.LJI(W2Q.LIZ);
            InterfaceC45925I0r Pv0 = Pv0();
            if (Pv0 != null) {
                Pv0.l10(false, false);
            }
            setStateImmediate(W3F.LJLIL);
            Sv0();
            return;
        }
        if (w27 instanceof W2A) {
            withState(new AqS180S0100000_14(this, 186));
            return;
        }
        if (w27 instanceof W2H) {
            withState(new AqS180S0100000_14(this, 187));
            return;
        }
        if (w27 instanceof W2F) {
            bw0();
            return;
        }
        if (w27 instanceof W2C) {
            hide();
        } else if (w27 instanceof W2D) {
            this.LJLLLLLL.LJII(W2S.LIZ);
        } else {
            if (!(w27 instanceof W2I)) {
                return;
            }
            withState(new AqS180S0100000_14(this, 188));
        }
    }

    public final void Xv0(Effect effect, boolean z) {
        NewFaceStickerBean newFaceStickerBean = new NewFaceStickerBean();
        newFaceStickerBean.id = effect.getId();
        newFaceStickerBean.isFavorite = z;
        C2U8.LIZ(new C76P(newFaceStickerBean));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC74330TFe
    public void QM(Effect effect, String str, String str2) {
        THU Lv0;
        LiveEvent<AbstractC46187IAt> rV;
        o.LJIIIZ(effect, "effect");
        if (!((EffectInfoPanelState) lv0()).getWasVisible() && (Lv0 = Lv0()) != null && (rV = Lv0.rV()) != null) {
            rV.LIZLLL(this, this.LJLZ);
        }
        setStateImmediate(new W3H(this, effect, str, str2));
        Uv0();
    }
}
