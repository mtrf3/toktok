package X;

import Y.AObjectS89S0100000_14;
import Y.AfS66S0100000_14;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Stack;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vzq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81570Vzq extends AbstractC163776bl<DuetLayoutModeViewModel> implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLD;
    public final WMH LJLJLJ;
    public final C82622Wbi LJLJLLL;
    public final C81571Vzr LJLL;
    public final MutableLiveData<C44243HXz> LJLLI;
    public final C81544VzQ LJLLILLLL;
    public final C82632Wbs LJLLJ;
    public final C82632Wbs LJLLL;
    public final ShortVideoContext LJLLLL;
    public final C82632Wbs LJLLLLLL;
    public final C82632Wbs LJLZ;
    public final C73318Sq2 LJZ;
    public final Stack<Integer> LJZI;
    public final ActivityC45651qj LJZL;
    public boolean LL;

    static {
        TBT tbt = new TBT(C81570Vzq.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLD = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C81570Vzq.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(C81570Vzq.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C81570Vzq.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJJIZ() {
        C81544VzQ c81544VzQ = this.LJLLILLLL;
        if (c81544VzQ.LLIIIZ) {
            return;
        }
        c81544VzQ.LLIIIZ = true;
        C82948Wgy c82948Wgy = c81544VzQ.LL;
        if (c82948Wgy == null) {
            return;
        }
        c82948Wgy.LIZJ(new C30461Hm());
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        this.LJLJLJ.show(this.LJLLILLLL);
        C81544VzQ c81544VzQ = this.LJLLILLLL;
        c81544VzQ.LLIIIZ = false;
        NavigationScene LJIILLIIL = C78923UyF.LJIILLIIL(c81544VzQ);
        Activity activity = c81544VzQ.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        LJIILLIIL.LLJILJILJ((C1AU) activity, c81544VzQ.LLFF);
        C82948Wgy c82948Wgy = c81544VzQ.LL;
        if (c82948Wgy != null) {
            c82948Wgy.LIZIZ(new C30461Hm());
        }
    }

    public final I3X getRecordControlApi() {
        return (I3X) this.LJLLL.LIZ(this, LLD[1]);
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        C79234V7u.LIZIZ(this.LJLJLJ, R.id.iri, this.LJLLILLLL, "DuetLayoutModeScene");
        getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 470));
        getRecordControlApi().UG().LIZLLL(this, new AObjectS89S0100000_14(this, 471));
        getRecordControlApi().Rr0().LIZLLL(this, new AObjectS89S0100000_14(this, 472));
        C82632Wbs c82632Wbs = this.LJLLLLLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLD;
        C78999UzT.LJFF(((I9W) c82632Wbs.LIZ(this, interfaceC74236TBoArr[2])).ua0().LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS66S0100000_14(this, 54), C73982T1u.LJLIL), this.LJZ);
        getRecordControlApi().zg(HKF.class, new C81569Vzp(this));
        ((InterfaceC45999I3n) this.LJLZ.LIZ(this, interfaceC74236TBoArr[3])).LC().LIZLLL(this, new AObjectS89S0100000_14(this, 473));
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLJ;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<DuetLayoutModeViewModel> LJJLIIIJILLIZJL() {
        return this.LJLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLLL;
    }

    public final void LJJLIIJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.LJZL.isFinishing()) {
            return;
        }
        C26227ARb c26227ARb = new C26227ARb(this.LJZL);
        c26227ARb.LIZ(R.string.f0l);
        UC0.LIZJ(c26227ARb, new AqS172S0100000_6(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 138));
        c26227ARb.LJI().LIZLLL();
    }

    public C81570Vzq(WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJLJ = parentScene;
        this.LJLJLLL = diContainer;
        this.LJLL = C81571Vzr.LJLIL;
        MutableLiveData<C44243HXz> mutableLiveData = new MutableLiveData<>();
        this.LJLLI = mutableLiveData;
        this.LJLLILLLL = new C81544VzQ(diContainer, mutableLiveData, new AqS180S0100000_14(this, 372));
        this.LJLLJ = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLLL = UCI.LJI(diContainer, I3X.class, null);
        this.LJLLLL = (ShortVideoContext) diContainer.LJ(ShortVideoContext.class, null);
        this.LJLLLLLL = UCI.LJI(diContainer, I0N.class, null);
        this.LJLZ = UCI.LJI(diContainer, InterfaceC45999I3n.class, null);
        this.LJZ = new C73318Sq2();
        this.LJZI = new Stack<>();
        this.LJZL = (ActivityC45651qj) diContainer.LJ(ActivityC45651qj.class, null);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }
}
