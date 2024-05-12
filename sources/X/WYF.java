package X;

import Y.AObserverS82S0100000_14;
import Y.AfS27S1100000_14;
import Y.AfS66S0100000_14;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendStickerApi;
import defpackage.e1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WYF extends AbstractC29891Fh<HNU> implements HNU, InterfaceC135635Tz {
    public static final WYP LL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLD;
    public final C82622Wbi LJLIL;
    public final TEZ LJLILLLLZI;
    public final InterfaceC46204IBk LJLJI;
    public WYM LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final MutableLiveData<C45927I0t<C46132I8q>> LJLJLLL;
    public final MutableLiveData<Effect> LJLL;
    public ViewGroup LJLLI;
    public final LiveData<C45927I0t<C46132I8q>> LJLLILLLL;
    public final C73318Sq2 LJLLJ;
    public WYH LJLLL;
    public String LJLLLL;
    public Effect LJLLLLLL;
    public boolean LJLZ;
    public final C5H3 LJZ;
    public final C5H3 LJZI;
    public final InterfaceC88471Ynr<Effect, Boolean, C76800UCe> LJZL;

    static {
        TBT tbt = new TBT(WYF.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLD = new InterfaceC74236TBo[]{tbt, new TBT(WYF.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(WYF.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new TBT(WYF.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
        LL = new WYP();
    }

    public HNU LJJLIIIJJIZ() {
        return this;
    }

    private final InterfaceC73367Sqp LJJLJ() {
        return (InterfaceC73367Sqp) this.LJZI.getValue();
    }

    private final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLJLJ.LIZ(this, LLD[3]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJJLL.LIZ(this, LLD[1]);
    }

    public final EffectCategoryModel LJJLIIIJLLLLLLLZ() {
        return (EffectCategoryModel) this.LJZ.getValue();
    }

    public final WYM LJJLIIJ() {
        WYM wym = this.LJLJJI;
        if (wym != null) {
            return wym;
        }
        o.LJIJI("repository");
        throw null;
    }

    public final InterfaceC82086WJm getCameraApi() {
        return (InterfaceC82086WJm) this.LJLJL.LIZ(this, LLD[2]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LJLJJL.LIZ(this, LLD[0]);
    }

    private final boolean LJJLIIIJJI() {
        HCA LIZIZ = getShortVideoContext().cameraComponentModel.LIZIZ();
        if ((LIZIZ.isEmpty() || LIZIZ.get(LIZIZ.size() - 1) == null) && !getShortVideoContext().LJJIJIIJI() && !getShortVideoContext().isDuetMode && this.LJLILLLLZI.LLJJIJIIJIL() == null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLJLI(new WYM(this.LJLILLLLZI));
        getCameraApi().e8().LLLZI(new WYG(this));
        C73318Sq2 c73318Sq2 = this.LJLLJ;
        C73893SzJ<I3P> c73893SzJ = I3Q.LIZ;
        c73318Sq2.LIZ(IA2.LIZ(c73893SzJ, c73893SzJ).LJJJJZI(new AfS66S0100000_14(this, 25)));
        this.LJLL.observe(this, new AObserverS82S0100000_14(this, 45));
        C73318Sq2 c73318Sq22 = this.LJLLJ;
        C73849Syb<WYN> c73849Syb = LJJLIIJ().LIZIZ;
        c73318Sq22.LIZ(C42193GhB.LIZJ(c73849Syb, c73849Syb).LJJJJZI(new AfS66S0100000_14(this, 26)));
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
        if (e1.LIZ(31744, "enable_recommend_prop", true, false) && !getShortVideoContext().cameraComponentModel.enterRecordWithSticker && extractAVMusic != null && TextUtils.isEmpty(getShortVideoContext().presetEffectId) && TextUtils.isEmpty(getShortVideoContext().fromPropId) && !getShortVideoContext().LJJJI()) {
            String musicId = extractAVMusic.getMusicId();
            o.LJIIIIZZ(musicId, "currentMusic.musicId");
            kd(musicId);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LJLLJ.LIZLLL();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ HNU getApiComponent() {
        LJJLIIIJJIZ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.HNU
    public LiveData<C45927I0t<C46132I8q>> zu() {
        return this.LJLLILLLL;
    }

    private final void LJJLIIIIJ(Effect effect) {
        C82398WVm.LJ(getStickerApiComponent(), C47261Igj.LJJIJIL(effect), true, !getShortVideoContext().LJJIJIIJIL(), new WYI(this), false, null, 0, 16360);
    }

    public final void LJJLIIIJILLIZJL(Effect effect) {
        if (!this.LJLZ) {
            return;
        }
        LJJLIIIIJ(effect);
    }

    public final void LJJLJLI(WYM wym) {
        o.LJIIIZ(wym, "<set-?>");
        this.LJLJJI = wym;
    }

    @Override // X.HNU
    public void dc0(ViewGroup view) {
        o.LJIIIZ(view, "view");
        this.LJLLI = view;
    }

    @Override // X.HNU
    public void kd(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        this.LJLLLL = musicId;
        if (!LJJLIIIJJI()) {
            return;
        }
        WYM LJJLIIJ = LJJLIIJ();
        LJJLIIJ.getClass();
        LJJLIIJ.LIZIZ.onNext(WYO.LIZ);
        ((RecommendStickerApi) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, RecommendStickerApi.class)).fetchRecommendSticker(musicId, C00F.LIZ(31744, -1, "recommend_prop_threshold", true), C60903NvH.LJIIJJI().LJIJI().getEffectSDKVersion()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS27S1100000_14(LJJLIIJ, musicId, 0), new AfS27S1100000_14(LJJLIIJ, musicId, 1));
    }

    public WYF(C82622Wbi diContainer, TEZ stickerManager, InterfaceC46204IBk stickerSelect) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(stickerManager, "stickerManager");
        o.LJIIIZ(stickerSelect, "stickerSelect");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = stickerManager;
        this.LJLJI = stickerSelect;
        this.LJLJJL = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        MutableLiveData<C45927I0t<C46132I8q>> mutableLiveData = new MutableLiveData<>();
        this.LJLJLLL = mutableLiveData;
        this.LJLL = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData;
        this.LJLLJ = new C73318Sq2();
        this.LJLLLL = "";
        this.LJZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 965));
        this.LJZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 966));
        this.LJZL = new AqS196S0100000_14(this, 29);
    }

    public final void LJJLI(String str, String str2, String str3) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", getShortVideoContext().LJI());
        c145995oB.LJI("shoot_way", getShortVideoContext().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("prop_id", str3);
        c145995oB.LJI("music_id", str2);
        FMX.LJIIL(str, c145995oB.LIZ);
    }

    public final void LJJLL(Effect effect, TEA tea, Integer num) {
        if (effect != null) {
            LJJLJ().LIZIZ(effect, tea, num, true);
        }
    }
}
