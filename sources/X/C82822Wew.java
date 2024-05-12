package X;

import Y.ACListenerS34S0100000_14;
import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS50S0100000_14;
import Y.AfS66S0100000_14;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wew, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82822Wew extends AbstractC29891Fh<InterfaceC46131I8p> implements InterfaceC135635Tz, InterfaceC46131I8p {
    public static final C82846WfK LLFII;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFZ;
    public static final boolean LLI;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final C29S LJLJLJ;
    public final C73318Sq2 LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public ViewGroup LJLLILLLL;
    public ViewGroup LJLLJ;
    public final C29901Fi<Boolean> LJLLL;
    public final C29901Fi<Boolean> LJLLLL;
    public final C29901Fi<Boolean> LJLLLLLL;
    public EnumC82835Wf9 LJLZ;
    public final C5H3 LJZ;
    public String LJZI;
    public String LJZL;
    public boolean LL;
    public C82830Wf4 LLD;
    public final C5H3 LLF;
    public boolean LLFF;
    public String LLFFF;

    static {
        boolean z = false;
        TBT tbt = new TBT(C82822Wew.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt, new TBT(C82822Wew.class, "stickerCoreApiComponent", "getStickerCoreApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0), new TBT(C82822Wew.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new TBT(C82822Wew.class, "recommendMusicApiComponent", "getRecommendMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/recommend/RecommendMusicApiComponent;", 0), new TBT(C82822Wew.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new TBT(C82822Wew.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};
        LLFII = new C82846WfK();
        if (C52203KeF.LIZ > 0) {
            z = true;
        }
        LLI = z;
    }

    private final C82830Wf4 LJJLJ() {
        ViewGroup viewGroup;
        int i = C82834Wf8.LIZ[qJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (viewGroup = this.LJLLILLLL) != null) {
                    return LJJLJLI(C78688UuS.LJJIII(this), viewGroup, WHL.BOTTOM, false, C17N.LJIILL(8.0d), new C82841WfF(this), new C82826Wf0(LJJZZIII()));
                }
            } else {
                ViewGroup viewGroup2 = this.LJLLJ;
                if (viewGroup2 != null) {
                    return LJJLJLI(C78688UuS.LJJIII(this), viewGroup2, WHL.TOP, true, C17N.LJIILL(12.0d), new C82839WfD(this), new C82827Wf1(LJJZZIII()));
                }
            }
        } else {
            ViewGroup viewGroup3 = this.LJLLILLLL;
            if (viewGroup3 != null) {
                return LJJLJLI(C78688UuS.LJJIII(this), viewGroup3, WHL.BOTTOM, true, C17N.LJIILL(8.0d), new C82840WfE(this), new C82828Wf2(LJJZZIII()));
            }
        }
        return null;
    }

    public final void LJJLI() {
        String str;
        CreativeModel creativeModel;
        ReuseSoundAndEffectModel reuseSoundAndEffectModel;
        this.LLFF = true;
        getShortVideoContext().creativeModel.reuseSoundAndEffectModel.setFromReuseMusic(true);
        I27 LJJZZI = LJJZZI();
        if (LJJZZI != null) {
            LJJZZI.setUiLoadingMusic(true);
        }
        I8N recommendMusicApiComponent = getRecommendMusicApiComponent();
        if (recommendMusicApiComponent != null) {
            recommendMusicApiComponent.Bk0(true);
        }
        if (LJLIIL().LJIIJ.LIZIZ != null) {
            C82823Wex LJLIIL = LJLIIL();
            I19 i19 = LJLIIL.LJIIJ;
            AVMusic aVMusic = i19.LIZIZ;
            if (aVMusic != null) {
                String str2 = i19.LIZJ;
                if (str2 != null) {
                    LJLIIL.LIZ(aVMusic, str2);
                } else {
                    C44172HVg.LJI.LJIILL(LJLIIL.LJIIIZ, aVMusic, 6, false, LJLIIL.LJIILJJIL);
                }
            }
            if (ye() == EnumC82835Wf9.REUSE_SOUND) {
                C82829Wf3 LJJZZIII = LJJZZIII();
                ShortVideoContext shortVideoContext = LJJZZIII.LIZ;
                if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (reuseSoundAndEffectModel = creativeModel.reuseSoundAndEffectModel) != null) {
                    str = reuseSoundAndEffectModel.getSoundId();
                } else {
                    str = null;
                }
                C145995oB LIZ = LJJZZIII.LIZ();
                LIZ.LJI("music_id", str);
                LIZ.LJI("popup_source", "previous_video_music");
                FMX.LJIIL("click_music_popup_use", LIZ.LIZ);
            }
        }
    }

    public InterfaceC46131I8p LJJLIIJ() {
        return this;
    }

    public final void applyEffect() {
        Bundle bundle;
        CreativeModel creativeModel;
        ReuseSoundAndEffectModel reuseSoundAndEffectModel;
        this.LLFF = true;
        getShortVideoContext().creativeModel.reuseSoundAndEffectModel.setFromReuseProp(true);
        aX(true);
        FaceStickerBean.sCurPropSource = "previous_video_reuse";
        Effect effect = LJLIIL().LJIIJ.LIZ;
        if (effect != null) {
            C82823Wex LJLIIL = LJLIIL();
            LJLIIL.getClass();
            String str = null;
            if (LJLIIL.LIZJ.LLLLL().LJJJJLL().LJIJJLI().LIZ(effect, true)) {
                C82398WVm.LJI(LJLIIL.LIZJ, effect);
                InterfaceC46131I8p interfaceC46131I8p = LJLIIL.LIZLLL;
                if (interfaceC46131I8p != null) {
                    interfaceC46131I8p.aX(false);
                }
                LJLIIL.LIZJ.Sl(true, true);
                WRQ wrq = LJLIIL.LJFF;
                if (wrq != null) {
                    Boolean bool = Boolean.TRUE;
                    wrq.cY(bool, bool);
                }
                C10K.LIZJ(new TKD(effect, LJLIIL, TEA.DOWNLOAD_SUCCESS, null));
            } else {
                I0N i0n = LJLIIL.LIZJ;
                List LJJIJ = C47261Igj.LJJIJ(effect);
                OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig = LJLIIL.LIZIZ.greenScreenKitConfig;
                if (oPSDK$GreenScreenKitConfig != null) {
                    bundle = oPSDK$GreenScreenKitConfig.toBundle();
                } else {
                    bundle = null;
                }
                C82398WVm.LJ(i0n, LJJIJ, true, true, LJLIIL.LJIILIIL, true, bundle, 0, 14824);
            }
            if (ye() == EnumC82835Wf9.REUSE_EFFECT) {
                C82829Wf3 LJJZZIII = LJJZZIII();
                ShortVideoContext shortVideoContext = LJJZZIII.LIZ;
                if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (reuseSoundAndEffectModel = creativeModel.reuseSoundAndEffectModel) != null) {
                    str = reuseSoundAndEffectModel.getEffectId();
                }
                C145995oB LIZ = LJJZZIII.LIZ();
                LIZ.LJI("prop_id", str);
                LIZ.LJI("popup_source", "previous_video_prop");
                FMX.LJIIL("apply_prop_popup", LIZ.LIZ);
            }
        }
    }

    private final C82829Wf3 LJJZZIII() {
        return (C82829Wf3) this.LJLLI.getValue();
    }

    private final SafeHandler LJLJJLL() {
        return (SafeHandler) this.LLF.getValue();
    }

    private final void LJLJLJ() {
        this.LJLLLL.LIZLLL(this, new AObjectS89S0100000_14(this, 130));
        this.LJLLLLLL.LIZLLL(this, new AObjectS89S0100000_14(this, 131));
        C73318Sq2 c73318Sq2 = this.LJLJLLL;
        C73893SzJ<I3P> c73893SzJ = I3Q.LIZ;
        c73318Sq2.LIZ(IA2.LIZ(c73893SzJ, c73893SzJ).LJJJJZI(new AfS66S0100000_14(this, 18)));
        getStickerApiComponent().sF().LIZLLL(this, new AObjectS89S0100000_14(this, 132));
        getStickerApiComponent().LLLLL().LJIIIIZZ().LJIILL().observe(this, new AObserverS82S0100000_14(this, 21));
    }

    private final void LJLLL() {
        if (C33936DTo.LIZ == 0) {
            C82830Wf4 LJJLJ = LJJLJ();
            this.LLD = LJJLJ;
            if (LJJLJ != null) {
                LJJLJ.LIZ(qJ());
            }
            LJLJJLL().post(new ARunnableS50S0100000_14(this, 83));
            return;
        }
        this.LLFF = true;
    }

    private final I8N getRecommendMusicApiComponent() {
        return (I8N) this.LJLJJL.LIZ(this, LLFZ[3]);
    }

    public final EnumC82835Wf9 LJJLIIIJJI() {
        int i;
        int i2 = C52203KeF.LIZ;
        if (i2 == 1) {
            long musicStartTime = getShortVideoContext().creativeModel.reuseSoundAndEffectModel.getMusicStartTime() - getShortVideoContext().creativeModel.reuseSoundAndEffectModel.getMusicEndTime();
            C62822Ol8 c62822Ol8 = C52814Ko6.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() > 0) {
                i = ((Number) c62822Ol8.getValue()).intValue() * 1000;
            } else {
                i = Integer.MAX_VALUE;
            }
            if (this.LJZI != null && musicStartTime < i) {
                return EnumC82835Wf9.REUSE_SOUND;
            }
        } else if (i2 == 2) {
            if (this.LJZL != null) {
                return EnumC82835Wf9.REUSE_EFFECT;
            }
        } else if (i2 == 3 && this.LJZI != null && this.LJZL != null) {
            return EnumC82835Wf9.REUSE_SOUND_AND_EFFECT;
        }
        return EnumC82835Wf9.REUSE_NONE;
    }

    public final WRQ LJJLL() {
        return (WRQ) this.LJLJJLL.LIZ(this, LLFZ[4]);
    }

    public final I27 LJJZZI() {
        return (I27) this.LJLJJI.LIZ(this, LLFZ[2]);
    }

    public final C82823Wex LJLIIL() {
        return (C82823Wex) this.LJLL.getValue();
    }

    public final I9W LJLJJL() {
        return (I9W) this.LJLJI.LIZ(this, LLFZ[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJL.LIZ(this, LLFZ[5]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LJLILLLLZI.LIZ(this, LLFZ[0]);
    }

    @Override // X.InterfaceC46131I8p
    public EnumC82835Wf9 qJ() {
        return (EnumC82835Wf9) this.LJZ.getValue();
    }

    private final void LJJLIIIJLLLLLLLZ() {
        int i = C82834Wf8.LIZ[qJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.LLFFF = "not_reuse";
                    return;
                }
                C82823Wex LJLIIL = LJLIIL();
                String str = this.LJZI;
                String str2 = this.LJZL;
                if (str != null) {
                    C44172HVg.LJI.requestMusic(str, new C82831Wf5(LJLIIL.LJIIL, LJLIIL));
                } else {
                    LJLIIL.getClass();
                }
                LJLIIL.LIZIZ(str2);
                this.LLFFF = "music_and_prop";
                return;
            }
            LJLIIL().LIZIZ(this.LJZL);
            this.LLFFF = "prop";
            return;
        }
        C82823Wex LJLIIL2 = LJLIIL();
        String str3 = this.LJZI;
        if (str3 != null) {
            C44172HVg.LJI.requestMusic(str3, new C82831Wf5(LJLIIL2.LJIIL, LJLIIL2));
        } else {
            LJLIIL2.getClass();
        }
        this.LLFFF = "music";
    }

    public final void LJJLIIIIJ() {
        String str;
        CreativeModel creativeModel;
        ReuseSoundAndEffectModel reuseSoundAndEffectModel;
        CreativeModel creativeModel2;
        ReuseSoundAndEffectModel reuseSoundAndEffectModel2;
        LJJLI();
        applyEffect();
        C82829Wf3 LJJZZIII = LJJZZIII();
        ShortVideoContext shortVideoContext = LJJZZIII.LIZ;
        String str2 = null;
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (reuseSoundAndEffectModel2 = creativeModel2.reuseSoundAndEffectModel) != null) {
            str = reuseSoundAndEffectModel2.getSoundId();
        } else {
            str = null;
        }
        ShortVideoContext shortVideoContext2 = LJJZZIII.LIZ;
        if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null && (reuseSoundAndEffectModel = creativeModel.reuseSoundAndEffectModel) != null) {
            str2 = reuseSoundAndEffectModel.getEffectId();
        }
        C145995oB LIZ = LJJZZIII.LIZ();
        LIZ.LJI("prop_id", str2);
        LIZ.LJI("music_id", str);
        LIZ.LJI("popup_source", "previous_video");
        FMX.LJIIL("apply_music_and_prop_popup", LIZ.LIZ);
    }

    public final void LJJLIIIJILLIZJL() {
        int i = C82834Wf8.LIZ[ye().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                I3Q.LIZ(I3P.REUSE_SOUND_AND_EFFECT);
                LJJLIIIIJ();
                return;
            }
            I3Q.LIZ(I3P.REUSE_SOUND_AND_EFFECT);
            applyEffect();
            return;
        }
        LJJLI();
    }

    @Override // X.InterfaceC46131I8p
    public void ZW() {
        String str;
        CreativeModel creativeModel;
        ReuseSoundAndEffectModel reuseSoundAndEffectModel;
        getShortVideoContext().creativeModel.reuseSoundAndEffectModel.setFromReuseProp(false);
        C82829Wf3 LJJZZIII = LJJZZIII();
        C145995oB LIZ = LJJZZIII.LIZ();
        ShortVideoContext shortVideoContext = LJJZZIII.LIZ;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (reuseSoundAndEffectModel = creativeModel.reuseSoundAndEffectModel) != null) {
            str = reuseSoundAndEffectModel.getEffectId();
        } else {
            str = null;
        }
        LIZ.LJI("prop_id", str);
        LIZ.LJI("prop_selected_from", "previous_video_reuse");
        LIZ.LJI("popup_type", LJJZZIII.LIZIZ());
        FMX.LJIIL("click_delete_prop", LIZ.LIZ);
    }

    @Override // X.InterfaceC46131I8p
    public void kt0() {
        String str;
        CreativeModel creativeModel;
        ReuseSoundAndEffectModel reuseSoundAndEffectModel;
        getShortVideoContext().creativeModel.reuseSoundAndEffectModel.setFromReuseMusic(false);
        getShortVideoContext().creativeModel.reuseSoundAndEffectModel.setMusicFromDiscoveryPage(false);
        C82829Wf3 LJJZZIII = LJJZZIII();
        C145995oB LIZ = LJJZZIII.LIZ();
        ShortVideoContext shortVideoContext = LJJZZIII.LIZ;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (reuseSoundAndEffectModel = creativeModel.reuseSoundAndEffectModel) != null) {
            str = reuseSoundAndEffectModel.getSoundId();
        } else {
            str = null;
        }
        LIZ.LJI("music_id", str);
        LIZ.LJI("music_type", "previous_video_reuse");
        LIZ.LJI("popup_type", LJJZZIII.LIZIZ());
        FMX.LJIIL("click_delete_music", LIZ.LIZ);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        if (LJJLIIIJJIZ(getShortVideoContext())) {
            LJJLIIIJLLLLLLLZ();
            LJLJLJ();
            LJLLL();
            return;
        }
        LJLLILLLL("");
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C82823Wex LJLIIL = LJLIIL();
        LJLIIL.LJIIIIZZ = false;
        LJLIIL.LJII = false;
        this.LJLJLLL.LIZLLL();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC46131I8p getApiComponent() {
        LJJLIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC46131I8p
    public LiveEvent<Boolean> ob() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC46131I8p
    public EnumC82835Wf9 ye() {
        return this.LJLZ;
    }

    public C82822Wew(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), I9W.class, null);
        this.LJLJJI = UCI.LJII(getDiContainer(), I27.class, null);
        this.LJLJJL = UCI.LJII(getDiContainer(), I8N.class, null);
        this.LJLJJLL = UCI.LJII(getDiContainer(), WRQ.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJLJ = (C29S) getDiContainer().LJ(C29S.class, null);
        this.LJLJLLL = new C73318Sq2();
        this.LJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 136));
        this.LJLLI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 134));
        this.LJLLL = new C29901Fi<>();
        this.LJLLLL = new C29901Fi<>();
        this.LJLLLLLL = new C29901Fi<>();
        this.LJLZ = EnumC82835Wf9.REUSE_NONE;
        this.LJZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 135));
        this.LJZI = getShortVideoContext().creativeModel.reuseSoundAndEffectModel.getSoundId();
        this.LJZL = getShortVideoContext().creativeModel.reuseSoundAndEffectModel.getEffectId();
        this.LLF = C221108m2.LIZIZ(new AqS164S0100000_14(this, 137));
        this.LLFFF = "not_reuse";
    }

    private final boolean LJJLIIIJJIZ(ShortVideoContext shortVideoContext) {
        String str;
        boolean LIZJ = C78605Ut7.LIZJ(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"});
        if (C1DG.LJIIIIZZ()) {
            return false;
        }
        if (shortVideoContext != null && (V16.LJJIJLIJ(shortVideoContext) || shortVideoContext.isPhotoMvMode || shortVideoContext.mIsFromDraft)) {
            return false;
        }
        if (!LIZJ && C46125I8j.LIZIZ()) {
            return false;
        }
        if (shortVideoContext != null) {
            String str2 = shortVideoContext.newDraftId;
            if (str2 != null && C78685UuP.LJJJZ(str2)) {
                return false;
            }
            str = shortVideoContext.enterFrom;
        } else {
            str = null;
        }
        if (o.LJ(str, "super_entrance") || !LLI || shortVideoContext == null || shortVideoContext.isSpecialPlusIcon != 0 || !"direct_shoot".equals(shortVideoContext.shootWay) || qJ() == EnumC82835Wf9.REUSE_NONE) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC46131I8p
    public void IN(boolean z) {
        this.LJLLLLLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC46131I8p
    public void JX(ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        this.LJLLILLLL = viewGroup;
    }

    public final void LJLLILLLL(String str) {
        String str2;
        String effectId;
        C145995oB c145995oB = new C145995oB();
        ShortVideoContext shortVideoContext = getShortVideoContext();
        AVMusic aVMusic = LJLIIL().LJIIJ.LIZIZ;
        String str3 = "";
        if (aVMusic == null || (str2 = aVMusic.getMusicId()) == null) {
            str2 = "";
        }
        c145995oB.LJI("music_id", str2);
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        Effect effect = LJLIIL().LJIIJ.LIZ;
        if (effect != null && (effectId = effect.getEffectId()) != null) {
            str3 = effectId;
        }
        c145995oB.LJI("prop_id", str3);
        c145995oB.LJI("is_previous_video_auto_apply", str);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LIZLLL("previous_video_reuse_type", this.LLFFF);
        FMX.LJIIL("finish_reuse_logic", c145995oB.LIZ);
    }

    @Override // X.InterfaceC46131I8p
    public void Ss(boolean z) {
        this.LJLLLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC46131I8p
    public void aX(boolean z) {
        this.LJLLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC46131I8p
    public void kb0(EnumC82835Wf9 enumC82835Wf9) {
        o.LJIIIZ(enumC82835Wf9, "<set-?>");
        this.LJLZ = enumC82835Wf9;
    }

    @Override // X.InterfaceC46131I8p
    public void ye0(ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        this.LJLLJ = viewGroup;
    }

    private final C82830Wf4 LJJLJLI(Context context, ViewGroup anchorParentView, WHL position, boolean z, int i, InterfaceC65784Pro<C76800UCe> clickListener, InterfaceC65784Pro<C76800UCe> showListener) {
        C29S context2 = this.LJLJLJ;
        o.LJIIIZ(context2, "context");
        o.LJIIIZ(anchorParentView, "anchorParentView");
        C82833Wf7 c82833Wf7 = new C82833Wf7(context2, anchorParentView);
        o.LJIIIZ(position, "position");
        c82833Wf7.LIZJ = position;
        c82833Wf7.LJ = Boolean.valueOf(z);
        c82833Wf7.LIZLLL = Integer.valueOf(i);
        o.LJIIIZ(clickListener, "clickListener");
        c82833Wf7.LJFF = clickListener;
        o.LJIIIZ(showListener, "showListener");
        c82833Wf7.LJI = showListener;
        Context context3 = c82833Wf7.LIZ;
        ViewGroup viewGroup = c82833Wf7.LIZIZ;
        C82830Wf4 c82830Wf4 = new C82830Wf4(context3, viewGroup);
        WHL whl = c82833Wf7.LIZJ;
        if (whl != null) {
            c82830Wf4.LIZLLL = whl;
        }
        Integer num = c82833Wf7.LIZLLL;
        if (num != null) {
            c82830Wf4.LJ = num.intValue();
        }
        Boolean bool = c82833Wf7.LJ;
        if (bool != null) {
            c82830Wf4.LJFF = bool.booleanValue();
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c82833Wf7.LJFF;
        if (interfaceC65784Pro != null) {
            c82830Wf4.LJI = interfaceC65784Pro;
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = c82833Wf7.LJI;
        if (interfaceC65784Pro2 != null) {
            c82830Wf4.LJII = interfaceC65784Pro2;
        }
        c82830Wf4.LIZIZ = new C53878LCo(context3);
        C142425iQ c142425iQ = new C142425iQ(context3);
        c142425iQ.LIZIZ(viewGroup);
        WHL whl2 = c82830Wf4.LIZLLL;
        if (whl2 != null) {
            c142425iQ.LJI(whl2);
            C53878LCo c53878LCo = c82830Wf4.LIZIZ;
            if (c53878LCo != null) {
                c142425iQ.LIZLLL(c53878LCo);
                c142425iQ.LJIIIIZZ(C04330Ez.LIZIZ(context3, R.color.cy));
                c142425iQ.LJIIJ(null, true);
                c142425iQ.LIZ.LJIIL = c82830Wf4.LJFF;
                c142425iQ.LJII(new AqS164S0100000_14(c82830Wf4, 133));
                int LIZJ = (int) KL2.LIZJ(context3, 16.0f);
                C82682Wcg c82682Wcg = c142425iQ.LIZ;
                c82682Wcg.LJIIIIZZ = LIZJ;
                c82682Wcg.LJFF = c82830Wf4.LJ;
                c82682Wcg.LJIJJLI = true;
                c82682Wcg.LJIIJJI = false;
                c82682Wcg.LJII = -1001L;
                c82830Wf4.LIZJ = c142425iQ.LIZJ();
                C53878LCo c53878LCo2 = c82830Wf4.LIZIZ;
                if (c53878LCo2 != null) {
                    c53878LCo2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS34S0100000_14(c82830Wf4, 22)));
                    return c82830Wf4;
                }
                o.LJIJI("bubbleView");
                throw null;
            }
            o.LJIJI("bubbleView");
            throw null;
        }
        o.LJIJI("position");
        throw null;
    }
}
