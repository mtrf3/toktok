package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.6cb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC164296cb extends AbstractC29891Fh<InterfaceC164126cK> implements InterfaceC164126cK, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final C73318Sq2 LJLJJI;
    public final LiveEvent<Boolean> LJLJJL;
    public final LiveEvent<OSZ<Effect, String>> LJLJJLL;
    public final LiveEvent<C76800UCe> LJLJL;
    public final LiveEvent<OSZ<Effect, String>> LJLJLJ;
    public final LiveEvent<C76800UCe> LJLJLLL;
    public final LiveEvent<C76800UCe> LJLL;
    public final C0IB<String> LJLLI;
    public final C0IB<Long> LJLLILLLL;
    public final LiveEvent<C76800UCe> LJLLJ;
    public final C5H3 LJLLL;

    public InterfaceC164126cK LJJLI() {
        return this;
    }

    public abstract C164246cW LJJLIIIIJ();

    private final C81556Vzc LJJLIIIJILLIZJL() {
        return (C81556Vzc) this.LJLLL.getValue();
    }

    private final void LJJLIIIJJIZ() {
        LiveEvent<C76800UCe> bB = bB();
        o.LJII(bB, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) bB).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC164126cK
    public void El0() {
        LiveEvent<C76800UCe> l70 = l70();
        o.LJII(l70, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) l70).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC164126cK
    public void Gh0() {
        LiveEvent<C76800UCe> dD = dD();
        o.LJII(dD, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) dD).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC164126cK
    public void Z2() {
        LiveEvent<C76800UCe> Me = Me();
        o.LJII(Me, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) Me).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC164126cK
    public void Zx() {
        if (C52529KjV.LIZ()) {
            if (!this.LJLILLLLZI.isAdded(LJJLIIIJILLIZJL())) {
                C79234V7u.LIZIZ(this.LJLILLLLZI, this.LJLJI, LJJLIIIJILLIZJL(), "EditStickerPanelScene");
            }
        } else if (!this.LJLILLLLZI.isAdded(LJJLIIIIJ())) {
            this.LJLILLLLZI.add(this.LJLJI, LJJLIIIIJ(), "EditStickerPanelScene");
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LJLJJI.dispose();
    }

    @Override // X.InterfaceC164126cK
    public LiveEvent<Boolean> Dt() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC164126cK
    public LiveEvent<OSZ<Effect, String>> GX() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC164126cK
    public LiveEvent<C76800UCe> Me() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC164126cK
    public LiveEvent<C76800UCe> bB() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC164126cK
    public LiveEvent<C76800UCe> dD() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC164126cK getApiComponent() {
        LJJLI();
        return this;
    }

    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC164126cK
    public C0IB<String> getEnterMethod() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC164126cK
    public C0IB<Long> ji0() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC164126cK
    public LiveEvent<C76800UCe> l70() {
        return this.LJLL;
    }

    @Override // X.InterfaceC164126cK
    public LiveEvent<OSZ<Effect, String>> wl0() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC164126cK
    public void B00(Effect effect) {
        o.LJIIIZ(effect, "effect");
        if (!effect.getTags().contains("weather")) {
            String str = null;
            if (C77117UOj.LJIJ(effect)) {
                LJJLIIIJJI(effect, null);
                return;
            }
            int LJIILJJIL = C77117UOj.LJIILJJIL(effect);
            if (LJIILJJIL == 3 || LJIILJJIL == 4) {
                str = String.valueOf(System.currentTimeMillis() / 1000);
            }
            Ki0(effect, str);
        }
    }

    @Override // X.InterfaceC164126cK
    public void R80(InterfaceC150395vH onStickerSelectListener) {
        o.LJIIIZ(onStickerSelectListener, "onStickerSelectListener");
        C164246cW LJJLIIIIJ = LJJLIIIIJ();
        LJJLIIIIJ.getClass();
        LJJLIIIIJ.LJLLLLLL = onStickerSelectListener;
    }

    @Override // X.InterfaceC164126cK
    public void XW(ProviderEffect effect) {
        o.LJIIIZ(effect, "effect");
        C164336cf.LIZ(effect);
    }

    @Override // X.InterfaceC164126cK
    public void ku0(ProviderEffect effect) {
        o.LJIIIZ(effect, "effect");
        Effect effect2 = new Effect();
        effect2.setEffectId(effect.getId());
        effect2.setName(effect.getTitle());
        effect2.setUnzipPath(effect.getPath());
        effect2.setEffectType(10);
        Ki0(effect2, null);
    }

    private final void LJJLIIIJJI(Effect effect, String str) {
        LiveEvent<OSZ<Effect, String>> GX = GX();
        o.LJII(GX, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<com.ss.android.ugc.effectmanager.effect.model.Effect, kotlin.String?>>");
        ((C29901Fi) GX).LJII(new OSZ(effect, str));
    }

    @Override // X.InterfaceC164126cK
    public void Ki0(Effect effect, String str) {
        o.LJIIIZ(effect, "effect");
        LiveEvent<OSZ<Effect, String>> wl0 = wl0();
        o.LJII(wl0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<com.ss.android.ugc.effectmanager.effect.model.Effect, kotlin.String?>>");
        ((C29901Fi) wl0).LJII(new OSZ(effect, str));
    }

    public AbstractC164296cb(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = new C73318Sq2();
        this.LJLJJL = new C29901Fi();
        this.LJLJJLL = new C29901Fi();
        this.LJLJL = new C29901Fi();
        this.LJLJLJ = new C29901Fi();
        this.LJLJLLL = new C29901Fi();
        this.LJLL = new C29901Fi();
        this.LJLLI = new C40871j1(null);
        this.LJLLILLLL = new C40871j1(-1L);
        this.LJLLJ = new C29901Fi();
        this.LJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 756));
    }

    @Override // X.InterfaceC164126cK
    public void o20(boolean z, String enterMethod, long j) {
        o.LJIIIZ(enterMethod, "enterMethod");
        if (C52529KjV.LIZ() && z) {
            LJJLIIIJILLIZJL().LLJJIJI(this.LJLILLLLZI);
        }
        C60903NvH.LJIIJJI().LJIILIIL().updateCurrentScene("sticker_panel_show", z);
        LiveEvent<Boolean> Dt = Dt();
        o.LJII(Dt, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) Dt).LJII(Boolean.valueOf(z));
        C0IB<String> enterMethod2 = getEnterMethod();
        o.LJII(enterMethod2, "null cannot be cast to non-null type com.bytedance.als.MutableLiveState<kotlin.String?>");
        ((C40871j1) enterMethod2).LJI(enterMethod);
        C0IB<Long> ji0 = ji0();
        o.LJII(ji0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveState<kotlin.Long>");
        ((C40871j1) ji0).LJI(Long.valueOf(j));
        if (C52529KjV.LIZ() && !z) {
            LJJLIIIJILLIZJL().LLJJ(true);
        }
    }
}
