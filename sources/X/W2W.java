package X;

import Y.AObjectS88S0100000_13;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionListHandler;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionSceneViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W2W extends AbstractC163776bl<OptionSceneViewModel> implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final C82632Wbs LJLLI;
    public final C82632Wbs LJLLILLLL;
    public final C81633W2b LJLLJ;
    public final AqS164S0100000_14 LJLLL;

    static {
        TBT tbt = new TBT(W2W.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(W2W.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        if (!C52462KiQ.LIZ()) {
            ((I9W) this.LJLLILLLL.LIZ(this, LJLLLL[1])).P2(new OptionListHandler(this, this.LJLJLJ));
        }
        C82632Wbs c82632Wbs = this.LJLLI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLLL;
        ((I3X) c82632Wbs.LIZ(this, interfaceC74236TBoArr[0])).w90().LIZLLL(this, new AObjectS88S0100000_13(this, 0));
        ((I3X) this.LJLLI.LIZ(this, interfaceC74236TBoArr[0])).Qr0().LIZLLL(this, new AObjectS88S0100000_13(this, 1));
        if (!this.LJLJLLL.isAdded(this.LJLLJ)) {
            this.LJLJLLL.add(this.LJLL, this.LJLLJ, "OptionPanelScene");
        }
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<OptionSceneViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public W2W(C82622Wbi diContainer, WMH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.irk;
        this.LJLLI = UCI.LJI(diContainer, InterfaceC45967I2h.class, null);
        this.LJLLILLLL = UCI.LJI(diContainer, I9W.class, null);
        this.LJLLJ = new C81633W2b(diContainer);
        this.LJLLL = new AqS164S0100000_14(this, 18);
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
