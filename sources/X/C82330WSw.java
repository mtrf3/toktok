package X;

import Y.AObjectS89S0100000_14;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.WSw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82330WSw extends AbstractC29891Fh<I8E> implements I8E, InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final C82622Wbi LJLIL;
    public final C82330WSw LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final ShortVideoContext LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final C29901Fi<Boolean> LJLLJ;
    public final LiveEvent<Boolean> LJLLL;
    public final C29901Fi<Boolean> LJLLLL;
    public final LiveEvent<Boolean> LJLLLLLL;
    public final int LJLZ;
    public boolean LJZ;
    public final java.util.Map<Integer, Boolean> LJZI;
    public int LJZL;
    public boolean LL;
    public final C82641Wc1 LLD;
    public final WTB LLF;

    private final boolean LJJLIIIIJ(int i) {
        return i >= 0;
    }

    @Override // X.InterfaceC73141SnB
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    /* renamed from: getReceiver, reason: avoid collision after fix types in other method */
    public AML getReceiver2() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    static {
        TBT tbt = new TBT(C82330WSw.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82330WSw.class, "recordControlCoreComponent", "getRecordControlCoreComponent()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82330WSw.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82330WSw.class, "recommendMusicApiComponent", "getRecommendMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/recommend/RecommendMusicApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82330WSw.class, "recordPermissionUIApiComponent", "getRecordPermissionUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82330WSw.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82330WSw.class, "playApiComponent", "getPlayApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82330WSw.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82330WSw.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0, c65351Pkp)};
    }

    private final InterfaceC45999I3n LJJLIIIJJI() {
        return (InterfaceC45999I3n) this.LJLL.LIZ(this, LLFF[6]);
    }

    private final I3X LJJLIIIJJIZ() {
        return (I3X) this.LJLJJI.LIZ(this, LLFF[1]);
    }

    private final I8W LJJLIIIJLLLLLLLZ() {
        return (I8W) this.LJLJLJ.LIZ(this, LLFF[4]);
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LJLLI.LIZ(this, LLFF[7]);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LJLLILLLL.LIZ(this, LLFF[8]);
    }

    private final I3K getSplitShootApiComponent() {
        return (I3K) this.LJLJLLL.LIZ(this, LLFF[5]);
    }

    @Override // X.I8E
    public boolean cm0() {
        Iterator<Boolean> it = this.LJZI.values().iterator();
        while (true) {
            boolean z = true;
            while (it.hasNext()) {
                boolean booleanValue = it.next().booleanValue();
                if (!z || booleanValue) {
                    z = false;
                }
            }
            return z;
        }
    }

    public final WRQ getCameraApiComponent() {
        return (WRQ) this.LJLJI.LIZ(this, LLFF[0]);
    }

    public final I8N getRecommendMusicApiComponent() {
        return (I8N) this.LJLJL.LIZ(this, LLFF[3]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LJLJJLL.LIZ(this, LLFF[2]);
    }

    @Override // X.I8E
    public void vO() {
        I8W LJJLIIIJLLLLLLLZ;
        C0IB<Boolean> iz;
        if (!o.LJ(this.LJLJJL.shootWay, "single_song") || (LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ()) == null || (iz = LJJLIIIJLLLLLLLZ.iz()) == null || !o.LJ(iz.LIZ(), Boolean.TRUE) || !C46125I8j.LIZ() || !LJJLIIIIJ(this.LJZL)) {
            return;
        }
        int i = this.LJZL;
        this.LJZL = -1;
        getCameraApiComponent().Bh(i, this.LJLZ);
        getCameraApiComponent().Rk(this.LJLZ, i);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        C0IB<String> pe0;
        C0IB<C45966I2g> Tr;
        LiveEvent<T4S> CY;
        LiveEvent<Boolean> He0;
        super.onCreate();
        getRecordAdapterApi().Th0(this);
        this.LJZL = -1;
        if (!C46124I8i.LIZIZ(this.LJLJJL)) {
            return;
        }
        getCameraApiComponent().e8().LIZ(this.LLF);
        LJJLIIIJJIZ().s10().LIZLLL(this, new AObjectS89S0100000_14(this, 215));
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (He0 = stickerApiComponent.He0()) != null) {
            He0.LIZLLL(this, new AObjectS89S0100000_14(this, 216));
        }
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (CY = stickerApiComponent2.CY()) != null) {
            CY.LIZLLL(this, new AObjectS89S0100000_14(this, 217));
        }
        InterfaceC45999I3n LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null && (Tr = LJJLIIIJJI.Tr()) != null) {
            Tr.LIZIZ(this, new AObjectS89S0100000_14(this, 218));
        }
        I3K splitShootApiComponent = getSplitShootApiComponent();
        if (splitShootApiComponent != null && (pe0 = splitShootApiComponent.pe0()) != null) {
            pe0.LIZIZ(this, new AObjectS89S0100000_14(this, 219));
        }
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS89S0100000_14(this, 220));
        boolean z = false;
        if (C00F.LIZ(31744, 0, "enable_play_music_by_default_try_effect", true) > 0) {
            if (C00F.LIZ(31744, 0, "enable_play_music_by_default_try_effect", true) == 1) {
                z = true;
            }
            this.LJZ = z;
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().Th0(null);
        if (C00F.LIZ(31744, 0, "auto_play_sound_before_recording", true) > 0 || C00F.LIZ(31744, 0, "enable_play_music_by_default_try_effect", true) > 0) {
            getCameraApiComponent().e8().LLLLLJLJLL(this.LLF);
            getCameraApiComponent().e8().LLLZ(this.LLD);
        }
    }

    @Override // X.I8E
    public LiveEvent<Boolean> WL() {
        return this.LJLLL;
    }

    @Override // X.I8E
    public LiveEvent<Boolean> bl() {
        return this.LJLLLLLL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ I8E getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    public C82330WSw(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJJL = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        this.LJLJJLL = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJLJL = UCI.LJII(getDiContainer(), I8N.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LJLJLLL = UCI.LJII(getDiContainer(), I3K.class, null);
        this.LJLL = UCI.LJII(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), WLB.class, null);
        C29901Fi<Boolean> c29901Fi = new C29901Fi<>();
        this.LJLLJ = c29901Fi;
        this.LJLLL = c29901Fi;
        C29901Fi<Boolean> c29901Fi2 = new C29901Fi<>();
        this.LJLLLL = c29901Fi2;
        this.LJLLLLLL = c29901Fi2;
        this.LJLZ = 1;
        this.LJZ = true;
        this.LJZI = new LinkedHashMap();
        this.LJZL = -1;
        this.LL = true;
        this.LLD = new C82641Wc1((InterfaceC81640W2i) getDiContainer().LJIIIIZZ(null, InterfaceC81640W2i.class), this, EnumC45994I3i.NORMAL, new WT9(this));
        this.LLF = new WTB(this);
    }

    private final Integer LJJLIIIJILLIZJL(String str) {
        VEUtils.VEAudioFileInfo audioFileInfo;
        if (str == null || (audioFileInfo = VEUtils.getAudioFileInfo(str)) == null) {
            return null;
        }
        return Integer.valueOf(audioFileInfo.duration);
    }

    private final boolean LJJLJ(Effect effect) {
        return C46124I8i.LIZ(this.LJLJJL, effect);
    }

    @Override // X.I8E
    public void My(Effect effect) {
        Effect effect2;
        TEZ LLLLL;
        if (!LJJLJ(effect)) {
            return;
        }
        if (!LJJLIIIIJ(this.LJZL)) {
            String musicPath = this.LJLJJL.getMusicPath();
            ShortVideoContext shortVideoContext = this.LJLJJL;
            long j = shortVideoContext.cameraComponentModel.mMusicStart;
            Long valueOf = Long.valueOf(shortVideoContext.LJIILIIL());
            I0N stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (LLLLL = stickerApiComponent.LLLLL()) != null) {
                effect2 = LLLLL.LLJJIJIIJIL();
            } else {
                effect2 = null;
            }
            Yk0(musicPath, j, valueOf, effect2, I8M.LJLIL);
            return;
        }
        getCameraApiComponent().X40(this.LJZL, this.LJLZ, 0L);
        getCameraApiComponent().nu(this.LJZL, this.LJLZ, this.LJZ);
        this.LL = false;
        this.LJLLJ.LJII(Boolean.TRUE);
    }

    @Override // X.I8E
    public void Ps0(Effect effect) {
        if (!LJJLJ(effect) || !LJJLIIIIJ(this.LJZL)) {
            return;
        }
        getCameraApiComponent().Bh(this.LJZL, this.LJLZ);
        this.LJLLJ.LJII(Boolean.FALSE);
    }

    @Override // X.I8E
    public void eF(Effect effect) {
        Effect effect2;
        TEZ LLLLL;
        if (!LJJLJ(effect)) {
            return;
        }
        if (!LJJLIIIIJ(this.LJZL)) {
            String musicPath = this.LJLJJL.getMusicPath();
            ShortVideoContext shortVideoContext = this.LJLJJL;
            long j = shortVideoContext.cameraComponentModel.mMusicStart;
            Long valueOf = Long.valueOf(shortVideoContext.LJIILIIL());
            I0N stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (LLLLL = stickerApiComponent.LLLLL()) != null) {
                effect2 = LLLLL.LLJJIJIIJIL();
            } else {
                effect2 = null;
            }
            Yk0(musicPath, j, valueOf, effect2, I8M.LJLIL);
            return;
        }
        if (!this.LJZ && this.LL) {
            getCameraApiComponent().X40(this.LJZL, this.LJLZ, 0L);
            this.LL = false;
        }
        getCameraApiComponent().nu(this.LJZL, this.LJLZ, this.LJZ);
        this.LJLLJ.LJII(Boolean.TRUE);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    @Override // X.I8E
    public void rP(Effect effect) {
        if (!LJJLJ(effect) || !LJJLIIIIJ(this.LJZL)) {
            return;
        }
        int i = this.LJZL;
        this.LJZL = -1;
        getCameraApiComponent().Bh(i, this.LJLZ);
        getCameraApiComponent().Rk(this.LJLZ, i);
        this.LJLLJ.LJII(Boolean.FALSE);
    }

    public final boolean LJJLIIJ(WS0 ws0, String str) {
        if (!TextUtils.equals((CharSequence) ws0.LIZ, str)) {
            Object obj = ws0.LIZIZ;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            if (TextUtils.equals((CharSequence) obj, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.I8E
    public void wM(int i, boolean z) {
        this.LJZI.put(Integer.valueOf(i), Boolean.valueOf(z));
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
    }

    private final OSZ<Integer, Integer> LJJLI(int i, Integer num, String str) {
        Integer LJJLIIIJILLIZJL = LJJLIIIJILLIZJL(str);
        if (num == null) {
            if (LJJLIIIJILLIZJL == null) {
                return new OSZ<>(-1, -1);
            }
            return new OSZ<>(Integer.valueOf(i), Integer.valueOf(LJJLIIIJILLIZJL.intValue() - i));
        }
        if (LJJLIIIJILLIZJL == null) {
            return new OSZ<>(Integer.valueOf(i), num);
        }
        if (num.intValue() + i <= LJJLIIIJILLIZJL.intValue()) {
            return new OSZ<>(Integer.valueOf(i), num);
        }
        return new OSZ<>(0, Integer.valueOf(Math.min(num.intValue(), LJJLIIIJILLIZJL.intValue())));
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIILLIIL(vm1, vm2, interfaceC88471Ynr);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, InterfaceC88471Ynr<? super PROP1, ? super PROP2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIJJLI(c73139Sn9, c73139Sn92, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <S extends InterfaceC61312at, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C2KE<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIL(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIILL(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, InterfaceC88473Ynt<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIJJ(c73139Sn9, c73139Sn92, c73139Sn93, interfaceC88473Ynt);
    }

    @Override // X.I8E
    public void Yk0(String str, long j, Long l, Effect effect, InterfaceC65784Pro<C76800UCe> doAfterPlay) {
        boolean z;
        I0N stickerApiComponent;
        TEZ LLLLL;
        I8W LJJLIIIJLLLLLLLZ;
        C0IB<Boolean> iz;
        o.LJIIIZ(doAfterPlay, "doAfterPlay");
        if (C16880lQ.LLJJIJIL(getLifecycle().getCurrentState(), Lifecycle.State.RESUMED) < 0) {
            return;
        }
        boolean z2 = true;
        if (o.LJ(this.LJLJJL.shootWay, "single_song") && C46125I8j.LIZ() && (LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ()) != null && (iz = LJJLIIIJLLLLLLLZ.iz()) != null && o.LJ(iz.LIZ(), Boolean.TRUE) && !C78605Ut7.LIZJ(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"})) {
            z = true;
        } else {
            z = false;
        }
        I8N recommendMusicApiComponent = getRecommendMusicApiComponent();
        if (recommendMusicApiComponent == null || !recommendMusicApiComponent.sq()) {
            z2 = false;
        }
        Integer num = null;
        if ((z2 || (stickerApiComponent = getStickerApiComponent()) == null || (LLLLL = stickerApiComponent.LLLLL()) == null || LLLLL.LLJJIJIIJIL() == null) && !z) {
            Ps0(effect);
            return;
        }
        if (TextUtils.isEmpty(str) || !LJJLJ(effect)) {
            Ps0(effect);
            return;
        }
        if (LJJLIIIIJ(this.LJZL)) {
            rP(effect);
        }
        int i = (int) j;
        if (l != null) {
            num = Integer.valueOf((int) l.longValue());
        }
        OSZ<Integer, Integer> LJJLI = LJJLI(i, num, str);
        int intValue = LJJLI.getFirst().intValue();
        int intValue2 = LJJLI.getSecond().intValue();
        if (intValue2 <= 0 || intValue < 0) {
            return;
        }
        C82647Wc7 c82647Wc7 = new C82647Wc7();
        c82647Wc7.LIZ(str);
        c82647Wc7.LIZIZ();
        c82647Wc7.LIZJ(intValue);
        c82647Wc7.LIZLLL(intValue + intValue2);
        EnumC82648Wc8 enumC82648Wc8 = EnumC82648Wc8.External;
        VETrackParams vETrackParams = c82647Wc7.LIZ;
        vETrackParams.trackPriority = enumC82648Wc8;
        int gk = getCameraApiComponent().gk(this.LJLZ, vETrackParams);
        if (!LJJLIIIIJ(gk)) {
            return;
        }
        this.LJZL = gk;
        getCameraApiComponent().nu(gk, this.LJLZ, this.LJZ);
        this.LL = false;
        this.LJLLJ.LJII(Boolean.TRUE);
        doAfterPlay.invoke();
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC88474Ynu<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIILJJIL(vm1, vm2, vm3, vm4, interfaceC88474Ynu);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, InterfaceC88474Ynu<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIJI(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, VM5 extends JediViewModel<S5>, S5 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC88475Ynv<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIILIIL(vm1, vm2, vm3, vm4, vm5, interfaceC88475Ynv);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, M5 extends C73139Sn9<S5, PROP5>, PROP5 extends InterfaceC61312at, S5 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, C73139Sn9<S5, PROP5> c73139Sn95, InterfaceC88475Ynv<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIJ(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, c73139Sn95, interfaceC88475Ynv);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }

    public <S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C73165SnZ<TMF> c73165SnZ, InterfaceC88476Ynw<? super AML, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C73297Sph.LJIIIIZZ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c73165SnZ, interfaceC88476Ynw);
    }
}
