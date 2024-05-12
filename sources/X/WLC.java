package X;

import Y.ALAdapterS0S0110001_14;
import Y.ALAdapterS11S0100000_14;
import Y.AObjectS89S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WLC extends AbstractC29891Fh<InterfaceC45999I3n> implements InterfaceC45999I3n, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILIL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final Integer LJLJI;
    public final C40871j1<Boolean> LJLJJI;
    public final C40871j1<Boolean> LJLJJL;
    public final C40871j1<Boolean> LJLJJLL;
    public final C40871j1<Boolean> LJLJL;
    public final C29901Fi<OSJ<Integer, Integer, Intent>> LJLJLJ;
    public final C29901Fi<Boolean> LJLJLLL;
    public final C29901Fi<C76800UCe> LJLL;
    public final C29901Fi<Boolean> LJLLI;
    public final C40871j1<Boolean> LJLLILLLL;
    public final C29901Fi<C76800UCe> LJLLJ;
    public final C29901Fi<C76800UCe> LJLLL;
    public final C40871j1<C45966I2g> LJLLLL;
    public final C40871j1<Boolean> LJLLLLLL;
    public final C40871j1<OSZ<Long, AVMusic>> LJLZ;
    public final C29901Fi<C76800UCe> LJZ;
    public final C29901Fi<Effect> LJZI;
    public final C40871j1<Boolean> LJZL;
    public final C40871j1<Boolean> LL;
    public final C40871j1<C44225HXh> LLD;
    public InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, C76800UCe> LLF;
    public InterfaceC88472Yns<? super EnumC157656Gr, ? extends List<? extends C6QO>> LLFF;
    public final C40871j1<Float> LLFFF;
    public final C40871j1<Float> LLFII;
    public final C29901Fi<C76800UCe> LLFZ;
    public boolean LLI;
    public C146695pJ LLIFFJFJJ;
    public final ActivityC45651qj LLII;
    public final InterfaceC82086WJm LLIIII;
    public final InterfaceC115514g7 LLIIIILZ;
    public final InterfaceC115514g7 LLIIIJ;
    public final InterfaceC115514g7 LLIIIL;
    public final InterfaceC115514g7 LLIIIZ;
    public final InterfaceC115514g7 LLIIJI;
    public final InterfaceC115514g7 LLIIJLIL;
    public final InterfaceC115514g7 LLIIL;
    public final InterfaceC115514g7 LLIILII;
    public long LLIILZL;
    public final C5H3 LLIIZ;
    public Animator LLIL;
    public boolean LLILII;

    public InterfaceC45999I3n LJJLI() {
        return this;
    }

    static {
        TBT tbt = new TBT(WLC.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLILIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WLC.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(WLC.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WLC.class, "switcherApi", "getSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(WLC.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(WLC.class, "nowRecordTab", "getNowRecordTab()Lcom/ss/android/ugc/aweme/nows/combination/NowsRecordTabApi;", 0, c65351Pkp), C61845OOz.LIZJ(WLC.class, "surfaceSizeAdapter", "getSurfaceSizeAdapter()Lcom/ss/android/ugc/aweme/utils/SurfaceSizeAdapter;", 0, c65351Pkp), C61845OOz.LIZJ(WLC.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp)};
    }

    private final InterfaceC81634W2c LJJLIIIIJ() {
        return (InterfaceC81634W2c) this.LLIIJLIL.LIZ(this, LLILIL[5]);
    }

    private final C6FZ LJJLIIIJJIZ() {
        return (C6FZ) this.LLIIZ.getValue();
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LLIILII.LIZ(this, LLILIL[7]);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LLIIIJ.LIZ(this, LLILIL[1]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LLIIIILZ.LIZ(this, LLILIL[0]);
    }

    @Override // X.InterfaceC45999I3n
    public void HT() {
        this.LJLLL.LJII(C76800UCe.LIZ);
    }

    public final W4L LJJLIIIJILLIZJL() {
        return (W4L) this.LLIIL.LIZ(this, LLILIL[6]);
    }

    public final InterfaceC82325WSr LJJLIIIJJI() {
        return (InterfaceC82325WSr) this.LLIIIZ.LIZ(this, LLILIL[3]);
    }

    @Override // X.InterfaceC45999I3n
    public void c6() {
        this.LJZ.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC45999I3n
    public boolean ez() {
        NavigationScene LJIL = C78897Uxp.LJIL(this.LJLIL);
        if (LJIL != null) {
            return C79057V0z.LJIIZILJ(LJIL, C82203WNz.class);
        }
        return false;
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIIJI.LIZ(this, LLILIL[4]);
    }

    public final I3K getSplitShootApiComponent() {
        return (I3K) this.LLIIIL.LIZ(this, LLILIL[2]);
    }

    @Override // X.InterfaceC45999I3n
    public void jS() {
        this.LJLLJ.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC45999I3n
    public void pD() {
        this.LJLL.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC45999I3n
    public boolean U6() {
        if (!getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return false;
        }
        String str = null;
        InterfaceC45979I2t interfaceC45979I2t = (InterfaceC45979I2t) getDiContainer().LJIIIIZZ(null, InterfaceC45979I2t.class);
        if (interfaceC45979I2t != null) {
            str = interfaceC45979I2t.getCurrentBottomTag();
        }
        return TextUtils.equals(str, this.LLII.getString(R.string.pwa));
    }

    @Override // X.InterfaceC45999I3n
    public void lM() {
        if (o.LJ(C60903NvH.LJIIJJI().LJJIII().getDefaultShootTabTag(getShortVideoContext()), I38.RECORD_NOW.getTag()) || !((Boolean) C53068KsC.LIZ.getValue()).booleanValue()) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 10));
        ofFloat.addListener(new ALAdapterS11S0100000_14(this, 14));
        ofFloat.start();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        C146695pJ c146695pJ;
        C0IB<C81644W2m> zx;
        super.onCreate();
        H7B.LJ("PlanCUIComponent onCreate");
        getRecordAdapterApi().R90(this);
        getRecordControlApi().Qr0().LIZLLL(this, new AObjectS89S0100000_14(this, 134));
        getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 135));
        this.LLIIII.M70().LIZLLL(this, new AObjectS89S0100000_14(this, 136));
        Integer num = this.LJLJI;
        if (num != null) {
            c146695pJ = (C146695pJ) this.LJLIL.findViewById(num.intValue());
        } else {
            c146695pJ = null;
        }
        this.LLIFFJFJJ = c146695pJ;
        this.LJLJLJ.LIZLLL(this, new AObjectS89S0100000_14(this, 137));
        InterfaceC82325WSr LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null && (zx = LJJLIIIJJI.zx()) != null) {
            zx.LIZIZ(this, new AObjectS89S0100000_14(this, 138));
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().R90(null);
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        H7B.LJ("PlanCUIComponent onResume");
        if (this.LLIILZL != -1) {
            C6FZ.LIZIZ(LJJLIIIJJIZ(), "click_back_in_edit", System.currentTimeMillis() - this.LLIILZL, false, 12);
            this.LLIILZL = -1L;
        }
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ LiveEvent Ai0() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB Cb() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB Et() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB Ht() {
        return this.LLFII;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ LiveEvent Ia() {
        return this.LJZ;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB Ie() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC45999I3n
    public boolean Kp0() {
        return this.LLILII;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ LiveEvent LC() {
        return this.LJZI;
    }

    @Override // X.InterfaceC45999I3n
    public boolean MX() {
        return this.LLI;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB Na0() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB RH() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ LiveEvent Sy() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB Tr() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB Xz() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB ae() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ LiveEvent et() {
        return this.LJLL;
    }

    @Override // X.InterfaceC45999I3n
    public InterfaceC88472Yns<EnumC157656Gr, List<C6QO>> fq() {
        return this.LLFF;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ LiveEvent g2() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ LiveEvent gC() {
        return this.LLFZ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC45999I3n getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB mZ() {
        return this.LL;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ LiveEvent pL() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ LiveEvent qo0() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB so0() {
        return this.LJZL;
    }

    @Override // X.InterfaceC45999I3n
    public InterfaceC88472Yns<InterfaceC65784Pro<C76800UCe>, C76800UCe> tF() {
        return this.LLF;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB uj() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC45999I3n
    public /* bridge */ /* synthetic */ C0IB ys0() {
        return this.LLD;
    }

    @Override // X.InterfaceC45999I3n
    public void Db0(boolean z) {
        this.LJLLLLLL.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC45999I3n
    public void Hh0(Effect effect) {
        this.LJZI.LJII(effect);
    }

    public final void LJJLIIIJLLLLLLLZ(boolean z) {
        String str;
        boolean z2;
        WSF currentBottomTabItemBeforeOnTabChanged;
        InterfaceC45979I2t bottomTabApiComponent = getBottomTabApiComponent();
        if (bottomTabApiComponent != null && (currentBottomTabItemBeforeOnTabChanged = bottomTabApiComponent.getCurrentBottomTabItemBeforeOnTabChanged()) != null) {
            str = currentBottomTabItemBeforeOnTabChanged.LIZIZ;
        } else {
            str = null;
        }
        boolean LJ = o.LJ(str, I38.LIVE.getTag());
        if (z && !LJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LL.LJI(Boolean.valueOf(z2));
        I3K splitShootApiComponent = getSplitShootApiComponent();
        if (splitShootApiComponent != null) {
            splitShootApiComponent.Ju(z2, false);
        }
    }

    @Override // X.InterfaceC45999I3n
    public void Le(C45966I2g event) {
        o.LJIIIZ(event, "event");
        this.LJLLLL.LJI(event);
    }

    @Override // X.InterfaceC45999I3n
    public void MF(boolean z) {
        this.LJLLI.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC45999I3n
    public void Qt0(boolean z) {
        kY(z, false);
        this.LJLJLLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC45999I3n
    public void Rd(InterfaceC88472Yns<? super EnumC157656Gr, ? extends List<? extends C6QO>> interfaceC88472Yns) {
        this.LLFF = interfaceC88472Yns;
    }

    @Override // X.InterfaceC45999I3n
    public void Uw(boolean z) {
        this.LJLJJL.LJI(Boolean.valueOf(z));
        this.LJLJJLL.LJI(Boolean.TRUE);
    }

    @Override // X.InterfaceC45999I3n
    public void Xl(boolean z) {
        float f;
        Animator animator = this.LLIL;
        if (animator != null) {
            animator.cancel();
        }
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 1.0f - f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 11));
        ofFloat.addListener(new ALAdapterS0S0110001_14(this, f, z, 0));
        this.LLIL = ofFloat;
        ofFloat.start();
    }

    @Override // X.InterfaceC45999I3n
    public void ZP(boolean z) {
        this.LJLLILLLL.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC45999I3n
    public void cG(boolean z) {
        this.LJLJL.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC45999I3n
    public void eH(boolean z) {
        this.LLILII = z;
    }

    @Override // X.InterfaceC45999I3n
    public void lJ(boolean z) {
        this.LJZL.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC45999I3n
    public void lX(InterfaceC146705pK listener) {
        o.LJIIIZ(listener, "listener");
        C146695pJ c146695pJ = this.LLIFFJFJJ;
        if (c146695pJ != null) {
            ((ArrayList) c146695pJ.LJLIL).add(listener);
        }
    }

    @Override // X.InterfaceC45999I3n
    public void li(C44225HXh state) {
        o.LJIIIZ(state, "state");
        this.LLD.LJI(state);
    }

    @Override // X.InterfaceC45999I3n
    public void p70(InterfaceC146705pK listener) {
        o.LJIIIZ(listener, "listener");
        C146695pJ c146695pJ = this.LLIFFJFJJ;
        if (c146695pJ != null) {
            ((ArrayList) c146695pJ.LJLIL).remove(listener);
        }
    }

    @Override // X.InterfaceC45999I3n
    public void vW(boolean z) {
        this.LLI = z;
    }

    @Override // X.InterfaceC45999I3n
    public void zf0(InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, C76800UCe> interfaceC88472Yns) {
        this.LLF = interfaceC88472Yns;
    }

    @Override // X.InterfaceC45999I3n
    public void kY(boolean z, boolean z2) {
        String str;
        boolean z3;
        WSF currentBottomTabItemBeforeOnTabChanged;
        InterfaceC45979I2t bottomTabApiComponent = getBottomTabApiComponent();
        if (bottomTabApiComponent != null && (currentBottomTabItemBeforeOnTabChanged = bottomTabApiComponent.getCurrentBottomTabItemBeforeOnTabChanged()) != null) {
            str = currentBottomTabItemBeforeOnTabChanged.LIZIZ;
        } else {
            str = null;
        }
        boolean LJ = o.LJ(str, I38.LIVE.getTag());
        if (z && !LJ) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJLJJI.LJI(Boolean.valueOf(z3));
        I3K splitShootApiComponent = getSplitShootApiComponent();
        if (splitShootApiComponent != null) {
            splitShootApiComponent.Ju(z3, z2);
        }
    }

    @Override // X.InterfaceC45999I3n
    public void rg(long j, AVMusic music) {
        o.LJIIIZ(music, "music");
        this.LJLZ.LJI(new OSZ<>(Long.valueOf(j), music));
    }

    public WLC(WMH parentScene, C82622Wbi diContainer, Integer num) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = num;
        this.LJLJJI = new C40871j1<>(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.LJLJJL = new C46611sH(bool);
        this.LJLJJLL = new C40871j1<>(bool);
        this.LJLJL = new C46611sH(bool);
        this.LJLJLJ = new C29901Fi<>();
        this.LJLJLLL = new C29901Fi<>();
        this.LJLL = new C29901Fi<>();
        this.LJLLI = new C29901Fi<>();
        this.LJLLILLLL = new C40871j1<>(null);
        this.LJLLJ = new C29901Fi<>();
        this.LJLLL = new C29901Fi<>();
        this.LJLLLL = new C40871j1<>(null);
        this.LJLLLLLL = new C40871j1<>(null);
        this.LJLZ = new C40871j1<>(null);
        this.LJZ = new C29901Fi<>();
        this.LJZI = new C29901Fi<>();
        this.LJZL = new C40871j1<>(null);
        this.LL = new C40871j1<>(null);
        this.LLD = new C40871j1<>(null);
        Float valueOf = Float.valueOf(1.0f);
        this.LLFFF = new C40871j1<>(valueOf);
        this.LLFII = new C40871j1<>(valueOf);
        this.LLFZ = new C29901Fi<>();
        this.LLII = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LLIIII = (InterfaceC82086WJm) getDiContainer().LJ(InterfaceC82086WJm.class, null);
        this.LLIIIILZ = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LLIIIJ = UCI.LJI(getDiContainer(), WLB.class, null);
        this.LLIIIL = UCI.LJII(getDiContainer(), I3K.class, null);
        this.LLIIIZ = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LLIIJI = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LLIIJLIL = UCI.LJII(getDiContainer(), InterfaceC81634W2c.class, null);
        this.LLIIL = UCI.LJII(getDiContainer(), W4L.class, null);
        this.LLIILII = UCI.LJII(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LLIILZL = -1L;
        this.LLIIZ = C221108m2.LIZIZ(WLD.LJLIL);
    }

    @Override // X.InterfaceC45999I3n
    public void onActivityResult(int i, int i2, Intent intent) {
        this.LJLJLJ.LJII(new OSJ<>(Integer.valueOf(i), Integer.valueOf(i2), intent));
    }
}
