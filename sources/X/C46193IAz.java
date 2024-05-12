package X;

import Y.ACallableS56S0300000_7;
import Y.AObjectS136S0100000_7;
import Y.AObjectS24S0000000_7;
import Y.AObjectS85S0100000_6;
import Y.AObjectS86S0100000_7;
import Y.AObjectS87S0100000_12;
import Y.AObserverS71S0200000_7;
import Y.AObserverS75S0100000_7;
import Y.ARunnableS26S0200000_7;
import Y.AfS59S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.creativex.recorder.sticker.types.ar.arcore.ARCoreStickerHandler;
import com.bytedance.creativex.recorder.sticker.types.ar.arcore.SharedARStickerHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.effectconfig.EffectConfigViewModel;
import com.ss.android.ugc.aweme.sticker.presenter.handler.ARStickerHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.MicStickerAudioController;
import com.ss.android.ugc.aweme.sticker.presenter.handler.SavePhotoStickerHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler;
import com.ss.android.ugc.aweme.sticker.senor.presenter.DefaultSenorPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.aweme.sticker.types.lock.LockStickerHandler;
import com.ss.android.ugc.aweme.sticker.types.multi.MultiStickerListViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.DynamicSelectorHandler;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.ProTemplateEffect;
import com.ss.android.ugc.gamora.recorder.voicechange.sticker.SVCStickerHandler;
import com.ss.android.vesdk.VERecorder;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import defpackage.e1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.AqS60S1100000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IDqS432S0100000_7;
import kotlin.jvm.internal.IDqS453S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.IAz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46193IAz extends AbstractC46244ICy<I0N> implements I0N {
    public static final IC9 LLLLIIL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLLLIILL;
    public final IBR LLIIIZ;
    public final C45312HqO LLIIJI;
    public final ShortVideoContext LLIIJLIL;
    public final InterfaceC45540Hu4 LLIIL;
    public StickerVideoStatusHandler LLIILII;
    public IC5 LLIILZL;
    public IB2 LLIIZ;
    public VoiceRecognizeStickerHandler LLIL;
    public MicStickerAudioController LLILII;
    public AudioGraphStickerHandler LLILIL;
    public final InterfaceC115514g7 LLILL;
    public final InterfaceC115514g7 LLILLIZIL;
    public final InterfaceC115514g7 LLILLJJLI;
    public final InterfaceC115514g7 LLILLL;
    public final InterfaceC115514g7 LLILZ;
    public final InterfaceC115514g7 LLILZIL;
    public final InterfaceC115514g7 LLILZLL;
    public final InterfaceC115514g7 LLIZ;
    public final InterfaceC115514g7 LLIZLLLIL;
    public I15 LLJ;
    public int LLJI;
    public List<String> LLJIJIL;
    public java.util.Map<String, String> LLJILJIL;
    public int LLJILJILJ;
    public final C29901Fi<Boolean> LLJILLL;
    public final C29901Fi<Boolean> LLJJ;
    public final C29901Fi<C76800UCe> LLJJI;
    public final C29901Fi<List<Effect>> LLJJIII;
    public final C29901Fi<Boolean> LLJJIJI;
    public final C29901Fi<Boolean> LLJJIJIIJIL;
    public final C29901Fi<Boolean> LLJJIJIL;
    public UploadPicStickerARPresenter LLJJJ;
    public DiyPropVideoStickerHandler LLJJJIL;
    public List<String> LLJJJJ;
    public final MutableLiveData<Effect> LLJJJJJIL;
    public final C29901Fi<Boolean> LLJJJJLIIL;
    public final P4G LLJJL;
    public final IBB LLJJLIIIJLLLLLLLZ;
    public final InterfaceC83962WxK LLJL;
    public final C5H3 LLJLIL;
    public final C5H3 LLJLILLLLZIIL;
    public final C5H3 LLJLL;
    public ArrayList<IB3> LLJLLIL;
    public GreenScreenMaterial LLJLLL;
    public final C74577TOr LLJZ;
    public boolean LLJZIJLIL;
    public final C5H3 LLL;
    public final X0W LLLF;
    public final AbstractC42651GoZ LLLFF;
    public final C29901Fi<Effect> LLLFFI;
    public final C29901Fi<Boolean> LLLFZ;
    public String LLLI;
    public final MutableLiveData<OSZ<Boolean, Boolean>> LLLII;
    public C43916HLk LLLIIII;
    public final C5H3 LLLIIIIL;
    public final C5H3 LLLIIIL;
    public final C5H3 LLLIIL;
    public final C5H3 LLLIILIL;
    public final List<ERP> LLLIL;
    public final IB9 LLLILZ;
    public final C5H3 LLLILZJ;
    public final C43910HLe LLLILZLLLI;
    public final C5H3 LLLIZZ;
    public final C5H3 LLLJ;
    public final C5H3 LLLJIL;
    public final C5H3 LLLJL;
    public final I0O LLLL;
    public final C5H3 LLLLII;
    public boolean LLLLIIIILLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46193IAz(C82622Wbi diContainer, IBR recordStickerLoginExtraInfoStickerHandlerFactory) {
        this(diContainer, recordStickerLoginExtraInfoStickerHandlerFactory, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(recordStickerLoginExtraInfoStickerHandlerFactory, "recordStickerLoginExtraInfoStickerHandlerFactory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46193IAz(C82622Wbi diContainer, IBR recordStickerLoginExtraInfoStickerHandlerFactory, InterfaceC88472Yns<? super ID3, C76800UCe> interfaceC88472Yns) {
        this(diContainer, recordStickerLoginExtraInfoStickerHandlerFactory, interfaceC88472Yns, null, 8, 0 == true ? 1 : 0);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(recordStickerLoginExtraInfoStickerHandlerFactory, "recordStickerLoginExtraInfoStickerHandlerFactory");
    }

    public final int LLLFZ(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public I0N LLLJ() {
        return this;
    }

    static {
        TBT tbt = new TBT(C46193IAz.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLLLIILL = new InterfaceC74236TBo[]{tbt, new TBT(C46193IAz.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new TBT(C46193IAz.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new TBT(C46193IAz.class, "recordModeComponent", "getRecordModeComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0), new TBT(C46193IAz.class, "nowSwitcher", "getNowSwitcher()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0), new TBT(C46193IAz.class, "lighteningControlProgressComponent", "getLighteningControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressComponent;", 0), new TBT(C46193IAz.class, "nowsRecordTabApi", "getNowsRecordTabApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsRecordTabApi;", 0), new TBT(C46193IAz.class, "permissionComponent", "getPermissionComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0), new TBT(C46193IAz.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0)};
        LLLLIIL = new IC9();
    }

    private final IBS LLLI() {
        return new IBS(this);
    }

    private final boolean LLLIIIL() {
        return o.LJ("1", this.LLIIJLIL.filterBusinessSticker);
    }

    private final I37 LLLJIL() {
        return (I37) this.LLILLJJLI.LIZ(this, LLLLIILL[2]);
    }

    private final Bundle LLLJL() {
        return (Bundle) this.LLLIIL.getValue();
    }

    private final C44971Hkt LLLLJ() {
        return (C44971Hkt) this.LLJLL.getValue();
    }

    private final boolean LLLLJI() {
        return ((Boolean) this.LLJLIL.getValue()).booleanValue();
    }

    private final WUU LLLLLJIL() {
        return (WUU) this.LLILZIL.LIZ(this, LLLLIILL[5]);
    }

    private final InterfaceC82325WSr LLLLLZIL() {
        return (InterfaceC82325WSr) this.LLILZ.LIZ(this, LLLLIILL[4]);
    }

    private final InterfaceC81634W2c LLLLZI() {
        return (InterfaceC81634W2c) this.LLILZLL.LIZ(this, LLLLIILL[6]);
    }

    private final I8W LLLLZIL() {
        return (I8W) this.LLIZ.LIZ(this, LLLLIILL[7]);
    }

    private final HYQ LLLLZLL() {
        return (HYQ) this.LLILLL.LIZ(this, LLLLIILL[3]);
    }

    private final C44960Hki LLLLZLLIL() {
        return (C44960Hki) this.LLJLILLLLZIIL.getValue();
    }

    private final C46218IBy LLLZIIL() {
        return (C46218IBy) this.LLL.getValue();
    }

    private final void LLLZLL() {
        getLifecycleOwner();
        this.LLILII = new MicStickerAudioController(this, new C46175IAh(getCameraApiComponent()), getRecordControlApi().Ue0(), this.LJLIL, new AqS157S0100000_7(this, 407), new IDqS453S0100000_7(this, 1));
        getLifecycleOwner();
        MicStickerAudioController micStickerAudioController = this.LLILII;
        o.LJI(micStickerAudioController);
        AudioGraphStickerHandler audioGraphStickerHandler = new AudioGraphStickerHandler(this, micStickerAudioController, new IB0(this));
        this.LLILIL = audioGraphStickerHandler;
        P2(audioGraphStickerHandler);
        this.LJLJJL.F9(new IBA(this));
        LiveEvent<C45314HqQ> kw = getCameraApiComponent().kw();
        getLifecycleOwner();
        kw.LIZLLL(this, new AObjectS86S0100000_7(this, 227));
        this.LLJJIJI.LIZLLL(this, new AObjectS86S0100000_7(this, 229));
        this.LLJJIJIIJIL.LIZLLL(this, new AObjectS86S0100000_7(this, 231));
        this.LLJJIJIL.LIZLLL(this, new AObjectS86S0100000_7(this, 233));
        LiveEvent<TimeSpeedModelExtension> Rr0 = getRecordControlApi().Rr0();
        getLifecycleOwner();
        Rr0.LIZLLL(this, new AObjectS86S0100000_7(this, 235));
        LiveEvent<C76800UCe> UG = getRecordControlApi().UG();
        getLifecycleOwner();
        UG.LIZLLL(this, new AObjectS86S0100000_7(this, 224));
    }

    private final WRP getFilterApiComponent() {
        return (WRP) this.LLILLIZIL.LIZ(this, LLLLIILL[1]);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LLIZLLLIL.LIZ(this, LLLLIILL[8]);
    }

    private final void v() {
        boolean isEmpty = TextUtils.isEmpty(this.LLIIJLIL.effectMetaInfo);
        boolean isEmpty2 = TextUtils.isEmpty(this.LLIIJLIL.effectImage);
        if (isEmpty && isEmpty2) {
            LLLZZ();
            return;
        }
        EffectConfigViewModel effectConfigViewModel = (EffectConfigViewModel) ((ViewModelProvider) getDiContainer().LJ(ViewModelProvider.class, null)).get(EffectConfigViewModel.class);
        C46214IBu c46214IBu = new C46214IBu(this);
        if (!isEmpty) {
            if (!isEmpty2) {
                effectConfigViewModel.LJLIL.setValue(c46214IBu);
                return;
            } else {
                effectConfigViewModel.LJLILLLLZI.setValue(c46214IBu);
                return;
            }
        }
        if (isEmpty2) {
            return;
        }
        effectConfigViewModel.LJLJI.setValue(c46214IBu);
    }

    private final void y() {
        C45312HqO c45312HqO = this.LLIIJI;
        if (c45312HqO.LIZ && c45312HqO.LIZIZ) {
            Context LLLLLIL = C16880lQ.LLLLLIL(this.LJLIL);
            o.LJIIIIZZ(LLLLLIL, "activity.applicationContext");
            LLLLL().LJJJJLL().LJFF().LIZIZ(new TKJ(LLLLLIL));
        }
    }

    @Override // X.I0N
    public void Jh0() {
        I15 i15 = this.LLJ;
        if (i15 != null) {
            i15.LIZJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) != false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC46244ICy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.aweme.sticker.model.FaceStickerBean LLFFF() {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46193IAz.LLFFF():com.ss.android.ugc.aweme.sticker.model.FaceStickerBean");
    }

    @Override // X.AbstractC46244ICy
    public C81663W3f LLIZ() {
        C29S c29s = this.LJLIL;
        THX thx = (THX) getDiContainer().LJ(THX.class, null);
        TEZ LLLLL = LLLLL();
        return new C46224ICe(c29s, thx, this.LJLILLLLZI, LLLLL, (InterfaceC78118UlG) getDiContainer().LJ(InterfaceC78118UlG.class, null), new AqS157S0100000_7(this, 397), new AqS173S0100000_7(this, 205), new AqS189S0100000_7(this, 22));
    }

    public final C79067V1j LLLL() {
        return (C79067V1j) this.LLLIIIIL.getValue();
    }

    public final List<IB3> LLLLLIL() {
        UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LLJJJ;
        if (uploadPicStickerARPresenter != null) {
            return uploadPicStickerARPresenter.LJLZ;
        }
        return null;
    }

    public final ERD LLLLLJLJLL() {
        return (ERD) this.LLLIILIL.getValue();
    }

    public final ES0 LLLLLL() {
        return (ES0) this.LLLIIIL.getValue();
    }

    @Override // X.AbstractC46244ICy, X.I9W, X.InterfaceC82400WVo
    public InterfaceC46204IBk LLZL() {
        return (InterfaceC46204IBk) this.LLLLII.getValue();
    }

    @Override // X.I0N
    public InterfaceC44444HcO Lv() {
        return (InterfaceC44444HcO) this.LLLIZZ.getValue();
    }

    @Override // X.I0N
    public boolean Q30() {
        AudioGraphStickerHandler.LJLJLJ.getClass();
        if (AudioGraphStickerHandler.LJLJJI != null) {
            return true;
        }
        return false;
    }

    @Override // X.I0N
    public InterfaceC46236ICq Sc0() {
        return (InterfaceC46236ICq) this.LLLJIL.getValue();
    }

    @Override // X.I0N
    public boolean Uv() {
        return this.LLIIJLIL.creativeModel.streamVoiceConversionModel.isSVCSelected;
    }

    @Override // X.I0N
    public HXK Y60() {
        return (HXK) this.LLLJL.getValue();
    }

    @Override // X.AbstractC46244ICy, X.I9W
    public T4O ch0() {
        return (T4O) this.LLLILZJ.getValue();
    }

    @Override // X.I0N
    public void cp() {
        AudioGraphStickerHandler audioGraphStickerHandler = this.LLILIL;
        if (audioGraphStickerHandler != null) {
            audioGraphStickerHandler.LJIIZILJ();
        }
    }

    public final WRQ getCameraApiComponent() {
        return (WRQ) this.LLILL.LIZ(this, LLLLIILL[0]);
    }

    @Override // X.I0N
    public I14 oa0() {
        return (I14) this.LLLJ.getValue();
    }

    @Override // X.I0N
    public boolean pA() {
        VoiceRecognizeStickerHandler voiceRecognizeStickerHandler = this.LLIL;
        if (voiceRecognizeStickerHandler == null || voiceRecognizeStickerHandler.LJLILLLLZI == null) {
            return false;
        }
        return true;
    }

    @Override // X.I0N
    public void sG() {
        this.LJLJI.bh().LIZIZ((LifecycleOwner) getDiContainer().LJ(LifecycleOwner.class, null), new AObjectS86S0100000_7(this, 217));
    }

    @Override // X.I0N
    public void wn0() {
        IC5 ic5;
        StickerVideoStatusHandler stickerVideoStatusHandler = this.LLIILII;
        if (stickerVideoStatusHandler != null && ID0.LJIILLIIL(stickerVideoStatusHandler.LJLILLLLZI) && (ic5 = stickerVideoStatusHandler.LJLJL) != null && !ic5.LIZIZ()) {
            stickerVideoStatusHandler.LJLJJL = true;
        }
        IB2 ib2 = this.LLIIZ;
        if (ib2 == null || !V3N.LJJI(ib2.LJLILLLLZI)) {
            return;
        }
        ib2.LJLJJL.invoke();
    }

    private final void LLLZ() {
        TJV LIZ = LLLLL().LJJJJLL().LIZ();
        LiveData LIZIZ = C74310TEk.LIZIZ(LIZ, false, 15);
        getLifecycleOwner();
        LIZIZ.observe(this, new AObserverS71S0200000_7(LIZ, this, 3));
    }

    private final boolean LLLZLZ() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("downgrade_sticker_preview_resolution_tag -> isSupportDowngradePreviewResolution = ");
        LIZ.append(LLLLJI());
        LIZ.append(", disableDowngradeWithFullScreen() = ");
        if (e1.LIZ(31744, "studio_full_screen_without_downgrade_sticker_resolution", true, false) && C143225ji.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        C13860gY.LIZIZ(LIZ, z, LIZ);
        if (LLLLJI() && !this.LLIIJLIL.LJJJI() && !this.LLIIJLIL.cameraComponentModel.duetContext.isDuetSing && (!e1.LIZ(31744, "studio_full_screen_without_downgrade_sticker_resolution", true, false) || !C143225ji.LIZ())) {
            return true;
        }
        return false;
    }

    private final void LLZZJLIL() {
        C78999UzT.LJFF(ua0().LJJJLIIL(new AfS59S0100000_7(this, 22), C73982T1u.LJLIL), this.LJLJLJ);
    }

    public final void LLJZIJLIL() {
        Effect LLIFFJFJJ = LLIFFJFJJ();
        if (LLIFFJFJJ != null) {
            if (TextUtils.equals(LLIFFJFJJ.getEffectId(), this.LLIIJLIL.presetEffectId)) {
                boolean isEmpty = TextUtils.isEmpty(this.LLIIJLIL.effectMetaInfo);
                boolean isEmpty2 = TextUtils.isEmpty(this.LLIIJLIL.effectImage);
                if (isEmpty && isEmpty2) {
                    c();
                    return;
                }
                EffectConfigViewModel effectConfigViewModel = (EffectConfigViewModel) ((ViewModelProvider) getDiContainer().LJ(ViewModelProvider.class, null)).get(EffectConfigViewModel.class);
                C46213IBt c46213IBt = new C46213IBt(this);
                if (!isEmpty) {
                    if (!isEmpty2) {
                        effectConfigViewModel.LJLIL.setValue(c46213IBt);
                        return;
                    } else {
                        effectConfigViewModel.LJLILLLLZI.setValue(c46213IBt);
                        return;
                    }
                }
                if (isEmpty2) {
                    return;
                }
                effectConfigViewModel.LJLJI.setValue(c46213IBt);
                return;
            }
            c();
        }
    }

    public final boolean LLLFFI() {
        if (!C46125I8j.LIZIZ()) {
            return false;
        }
        HVR hvr = HVR.LIZ;
        C29S c29s = this.LJLIL;
        o.LJII(c29s, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        hvr.LIZJ(c29s, new IC7(this), new AObjectS24S0000000_7(1), new AObjectS136S0100000_7(this, 12), TokenCert.Companion.with("bpea-tools_request_camera_audio_permission_audio_effect"));
        return true;
    }

    public final I8E LLLLLLIL() {
        return getRecordAdapterApi().hF().LIZ();
    }

    public final void LLLZZ() {
        I14 oa0 = oa0();
        ShortVideoContext shortVideoContext = this.LLIIJLIL;
        if (shortVideoContext.recordPresetResource != null) {
            z(oa0);
        } else {
            oa0.LIZ(shortVideoContext.presetEffectId);
            oa0.LIZIZ();
        }
    }

    @Override // X.I0N
    public boolean Ri() {
        return C46212IBs.LIZIZ();
    }

    @Override // X.I0N
    public boolean Tb0() {
        return C46212IBs.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        Effect effect = (Effect) LLLLL().LJIIIIZZ().LJIILL().getValue();
        if (effect != null) {
            LLLZI().post(new ARunnableS26S0200000_7(effect, this, 10));
        }
    }

    @Override // X.I0N
    public void mk0() {
        if (LLLZLZ()) {
            LLLLZLLIL().LJIILIIL();
        }
    }

    @Override // X.AbstractC46244ICy, X.AbstractC29891Fh
    public void onCreate() {
        LiveEvent<Boolean> C30;
        LiveEvent<Boolean> B2;
        super.onCreate();
        y();
        LLF().O9(this.LLLF);
        getRecordControlApi().Ue0().LIZIZ(this, new AObjectS86S0100000_7(this, 225));
        this.LL.LIZLLL(this, new AObjectS86S0100000_7(this, 226));
        getRecordControlApi().xu().LIZLLL(this, new AObjectS86S0100000_7(this, 228));
        getRecordControlApi().vf0().LIZLLL(this, new AObjectS86S0100000_7(this, 230));
        getRecordControlApi().ck0().LIZLLL(this, new AObjectS86S0100000_7(this, 232));
        getRecordControlApi().eV().LIZLLL(this, new AObjectS86S0100000_7(this, 234));
        getRecordControlApi().Fh0().LIZLLL(this, new AObjectS86S0100000_7(this, 236));
        C78999UzT.LJFF(getRecordControlApi().Pr0().LJJJLIIL(new AfS59S0100000_7(this, 21), C73982T1u.LJLIL), this.LJLJLJ);
        getRecordControlApi().s10().LIZLLL(this, new AObjectS86S0100000_7(this, 216));
        HYQ LLLLZLL = LLLLZLL();
        if (LLLLZLL != null && (B2 = LLLLZLL.B2()) != null) {
            B2.LIZLLL(this, new AObjectS86S0100000_7(this, 218));
        }
        HYQ LLLLZLL2 = LLLLZLL();
        if (LLLLZLL2 != null && (C30 = LLLLZLL2.C30()) != null) {
            C30.LIZLLL(this, new AObjectS86S0100000_7(this, 219));
        }
        getCameraApiComponent().AJ().LIZIZ(this, new AObjectS86S0100000_7(this, 221));
        if (C43416H2e.LIZ()) {
            if (C69162nY.LIZ()) {
                getRecordControlApi().s10().LIZLLL(this, new AObjectS85S0100000_6(this, 0));
                getRecordControlApi().ck0().LIZLLL(this, new AObjectS85S0100000_6(this, 1));
                getRecordControlApi().kX().LIZLLL(this, new AObjectS85S0100000_6(this, 2));
                getRecordControlApi().UG().LIZLLL(this, new AObjectS85S0100000_6(this, 3));
            } else {
                getRecordControlApi().s10().LIZLLL(this, new AObjectS85S0100000_6(this, 4));
                getRecordControlApi().ck0().LIZLLL(this, new AObjectS85S0100000_6(this, 5));
                getRecordControlApi().Ma0().LIZLLL(this, new AObjectS85S0100000_6(this, 6));
                getRecordControlApi().Bu0().LIZLLL(this, new AObjectS85S0100000_6(this, 7));
                getRecordControlApi().UG().LIZLLL(this, new AObjectS85S0100000_6(this, 8));
            }
        }
        IB9 ib9 = this.LLLILZ;
        Bundle LLLJL = LLLJL();
        long j = 0;
        if (LLLJL != null) {
            j = LLLJL.getLong("extra_start_record_time", 0L);
        }
        ib9.LIZIZ = j;
        LLZZJLIL();
        LLLLL().LJIIIIZZ().LJII().observe(this, new AObserverS75S0100000_7(this, 49));
    }

    @Override // X.AbstractC46244ICy, X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LLF().ja(this.LLLF);
        this.LJLJJL.a(this.LLJL);
        this.LLJILJIL.clear();
        if (C43416H2e.LIZ()) {
            LLLL().LJIIJJI();
        }
        C44971Hkt LLLLJ = LLLLJ();
        LLLLJ.getClass();
        if (!InterfaceC44963Hkl.LJIIL.enableUseDynamicEffectLabel()) {
            return;
        }
        LLLLJ.LJLIL.clear();
        LLLLJ.LIZIZ(null);
    }

    @Override // X.AbstractC46244ICy, X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        this.LJLJJL.t9().getAudioController().LJFF().setAudioDeviceChangeListener(this.LLJJL);
        IBB listener = this.LLJJLIIIJLLLLLLLZ;
        o.LJIIIZ(listener, "listener");
        C82636Wbw.LJ = C82636Wbw.LIZ();
        ArrayList<InterfaceC82637Wbx> arrayList = C82636Wbw.LJI;
        if (!arrayList.contains(listener)) {
            if (C82636Wbw.LJ) {
                listener.LIZLLL();
            }
            if (C82636Wbw.LIZLLL) {
                listener.LIZJ();
            }
            arrayList.add(listener);
        }
        this.LJLJJL.LLZILL(this.LLJL);
    }

    @Override // X.AbstractC46244ICy, X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
        ch0().LIZIZ();
    }

    public final void w() {
        C0IB<Boolean> iz;
        I8W LLLLZIL = LLLLZIL();
        if (LLLLZIL != null && (iz = LLLLZIL.iz()) != null && o.LJ(iz.LIZ(), Boolean.TRUE)) {
            return;
        }
        if (!this.LLLLIIIILLL) {
            if (!this.LLIIJLIL.isDuetMode) {
                return;
            }
        } else {
            this.LLLLIIIILLL = false;
        }
        if (LLLLL().LLJJIJIIJIL() == null && !LLLLL().LJIIIIZZ().LJIIJJI()) {
            v();
        }
    }

    @Override // X.I0N
    public /* bridge */ /* synthetic */ LiveEvent Mu0() {
        return this.LLJJI;
    }

    @Override // X.I0N
    public /* bridge */ /* synthetic */ LiveEvent O80() {
        return this.LLJJJJLIIL;
    }

    @Override // X.I0N
    public LiveEvent<Boolean> Os0() {
        return this.LLLFZ;
    }

    @Override // X.I0N
    public /* bridge */ /* synthetic */ LiveEvent Oy() {
        return this.LLJILLL;
    }

    @Override // X.I0N
    public /* bridge */ /* synthetic */ LiveData P40() {
        return this.LLLII;
    }

    @Override // X.I0N
    public LiveData<Effect> bH() {
        return this.LLJJJJJIL;
    }

    @Override // X.I0N
    public LiveEvent<List<Effect>> eP() {
        return this.LLJJIII;
    }

    @Override // X.I0N
    public I0O fj() {
        return this.LLLL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        LLLJ();
        return this;
    }

    @Override // X.I0N
    public LiveEvent<Effect> im0() {
        return this.LLLFFI;
    }

    @Override // X.I0N
    public int jn0() {
        return this.LLJILJILJ;
    }

    @Override // X.I0N
    public /* bridge */ /* synthetic */ LiveEvent q80() {
        return this.LLJJ;
    }

    @Override // X.I0N
    public String rK() {
        return this.LLLI;
    }

    @Override // X.I0N
    public List<String> sW() {
        return this.LLJIJIL;
    }

    @Override // X.I0N
    public C43916HLk sk() {
        return this.LLLIIII;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r11.LIZJ(r5.LIZIZ.presetEffectId) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0137, code lost:
    
        if (r6 != null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(X.I14 r11) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46193IAz.z(X.I14):void");
    }

    @Override // X.I0N
    public InterfaceC73367Sqp FM(Effect effect) {
        String key;
        o.LJIIIZ(effect, "effect");
        List LJIILJJIL = C30581Hy.LJIILJJIL(LLLLL().LJJJJLL().LIZ());
        TEZ getPinIndex = LLLLL();
        o.LJIIIZ(getPinIndex, "$this$getPinIndex");
        EffectCategoryModel effectCategoryModel = (EffectCategoryModel) ORZ.LJLLLLLL(C78866UxK.LJJIJ(getPinIndex), LJIILJJIL);
        if (effectCategoryModel == null || (key = effectCategoryModel.getKey()) == null || key.length() == 0) {
            return null;
        }
        return StickerStatesStoreViewModel.hv0((StickerStatesStoreViewModel) ((ViewModelProvider) getDiContainer().LJ(ViewModelProvider.class, null)).get(StickerStatesStoreViewModel.class), LLLLL().LJJJJLL().LJ(), key, 4);
    }

    @Override // X.I0N
    public void If0(IC5 ic5) {
        this.LLIILZL = ic5;
    }

    @Override // X.I0N
    public void Ko(boolean z) {
        if (z) {
            AudioGraphStickerHandler audioGraphStickerHandler = this.LLILIL;
            if (audioGraphStickerHandler != null) {
                AudioGraphStickerHandler.LJIILIIL(audioGraphStickerHandler, null, null, true, 3);
            }
            AudioGraphStickerHandler audioGraphStickerHandler2 = this.LLILIL;
            if (audioGraphStickerHandler2 != null) {
                audioGraphStickerHandler2.LJIILL();
                return;
            }
            return;
        }
        IB2 ib2 = this.LLIIZ;
        if (ib2 == null || !V3N.LJJI(ib2.LJLILLLLZI)) {
            return;
        }
        ib2.LJLJJL.invoke();
    }

    @Override // X.AbstractC46244ICy
    public void LJJLIIIJLLLLLLLZ(InterfaceC44448HcS interfaceC44448HcS) {
        o.LJIIIZ(interfaceC44448HcS, "<this>");
        IBU ibu = new IBU();
        ShortVideoContext shortVideoContext = this.LLIIJLIL;
        if (shortVideoContext.LJJJI() || shortVideoContext.LJJIJIIJI()) {
            interfaceC44448HcS.LIZ(ibu);
        }
        C46203IBj c46203IBj = new C46203IBj();
        if (this.LLIIJLIL.LJJIIZ()) {
            interfaceC44448HcS.LIZ(c46203IBj);
        }
        IBM ibm = IBM.LIZ;
        if (this.LLIIJLIL.LJJJI()) {
            interfaceC44448HcS.LIZ(ibm);
        }
        IBY iby = new IBY();
        if (this.LLIIJLIL.LJJIJIIJI()) {
            interfaceC44448HcS.LIZ(iby);
        }
        IBT ibt = new IBT();
        ShortVideoContext shortVideoContext2 = this.LLIIJLIL;
        if (shortVideoContext2.LJJJI() || shortVideoContext2.LJJIJIIJI() || V16.LJJIJLIJ(shortVideoContext2) || shortVideoContext2.LJJIJIIJIL()) {
            interfaceC44448HcS.LIZ(ibt);
        }
        IBN ibn = IBN.LIZ;
        ShortVideoContext shortVideoContext3 = this.LLIIJLIL;
        if (shortVideoContext3.LJJJI() || shortVideoContext3.LJJIJIIJI()) {
            interfaceC44448HcS.LIZ(ibn);
        }
        interfaceC44448HcS.LIZ(C44425Hc5.LIZ);
        C46195IBb c46195IBb = C46195IBb.LIZ;
        ShortVideoContext shortVideoContext4 = this.LLIIJLIL;
        if (shortVideoContext4.LJJJI() || shortVideoContext4.LJJIJIIJI()) {
            interfaceC44448HcS.LIZ(c46195IBb);
        }
        C44449HcT c44449HcT = new C44449HcT(this);
        if (LLLIIIL()) {
            interfaceC44448HcS.LIZ(c44449HcT);
        }
        C44427Hc7 c44427Hc7 = C44427Hc7.LIZ;
        if (V16.LJJIJLIJ(this.LLIIJLIL)) {
            interfaceC44448HcS.LIZ(c44427Hc7);
        }
        C44424Hc4 c44424Hc4 = C44424Hc4.LIZ;
        ShortVideoContext shortVideoContext5 = this.LLIIJLIL;
        if (shortVideoContext5.LJJJI() || shortVideoContext5.cameraComponentModel.isRetakeMode || shortVideoContext5.LJJIJIIJI()) {
            interfaceC44448HcS.LIZ(c44424Hc4);
        }
        interfaceC44448HcS.LIZ(new ET8());
    }

    @Override // X.AbstractC46244ICy
    public InterfaceC84018WyE LJJZZI(boolean z) {
        C29S c29s = this.LJLIL;
        return new DefaultSenorPresenter(c29s, c29s, z, this.LJLLILLLL, true, this.LJLLI.LIZIZ, null, this.LJLJL.LJIIIZ, 64);
    }

    @Override // X.AbstractC46244ICy
    public void LJLJLJ(boolean z) {
        if (z) {
            super.LJLJLJ(z);
            LLF().W9(new IB4(this));
        } else {
            if (ID0.LJIILLIIL(C82398WVm.LIZJ(this))) {
                super.LJLJLJ(z);
            }
            LLF().W9(null);
        }
    }

    public final void LLJJIJIL(List<String> imageList) {
        o.LJIIIZ(imageList, "imageList");
        HC5 Xq = this.LJLJI.Xq();
        if (!HDB.LIZ()) {
            C43786HGk c43786HGk = (C43786HGk) Xq;
            c43786HGk.getClass();
            if (!imageList.isEmpty()) {
                String str = c43786HGk.LJFF;
                if (str == null) {
                    str = "";
                }
                C10K.LIZJ(new ACallableS56S0300000_7(c43786HGk, imageList, new HGI(c43786HGk, str, false), 8));
            }
        } else {
            int size = imageList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(ListProtector.get(imageList, i));
            }
            this.LLJIJIL = arrayList;
        }
        this.LLJILJILJ = imageList.size();
    }

    public final boolean LLZZLLIL(Effect effect) {
        if (C43416H2e.LIZ()) {
            if (((effect instanceof MobileEffect) && ((MobileEffect) effect).getModerationStatus() != 3) || (effect instanceof ProTemplateEffect) || (effect instanceof DraftEffect)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.I0N
    public void Ud0(boolean z) {
        this.LLJJIJIIJIL.LJII(Boolean.valueOf(z));
    }

    @Override // X.I0N
    public boolean Xr(Effect effect) {
        return LLLLL().LJJJJLL().LJIJ().LJJIL(effect);
    }

    @Override // X.I0N
    public void bS(boolean z) {
        this.LLJZIJLIL = z;
        if (ID0.LJJII(C82398WVm.LIZJ(this)) && !this.LLIIJLIL.LJJIJIL()) {
            C46218IBy LLLZIIL = LLLZIIL();
            if (z) {
                LLLZIIL.LIZ.LIZ(IC0.LIZ);
            } else {
                LLLZIIL.LIZ.LIZIZ(IC1.LIZ, null);
            }
        }
    }

    @Override // X.I0N
    public void cF(boolean z) {
        this.LLJJIJIL.LJII(Boolean.valueOf(z));
    }

    @Override // X.I0N
    public void cy(boolean z) {
        this.LLJJ.LJII(Boolean.valueOf(z));
    }

    @Override // X.I0N
    public void fV(boolean z) {
        if (W2U.LIZ()) {
            this.LLJJJJLIIL.LJII(Boolean.valueOf(z));
        }
    }

    @Override // X.I0N
    public void fv(boolean z) {
        this.LLJILLL.LJII(Boolean.valueOf(z));
    }

    public final void g(String categoryName) {
        o.LJIIIZ(categoryName, "categoryName");
        this.LLJILJIL.remove(categoryName);
    }

    @Override // X.I0N
    public void hv(boolean z) {
        if (z) {
            C37143Ehv LIZIZ = LLLLL().LJJJJLL().LIZJ().LIZIZ();
            LIZIZ.LIZ(new IBT());
            LIZIZ.LIZ(new IBX());
            LIZIZ.LIZ(new IBC());
            LIZIZ.LIZIZ();
            return;
        }
        C37143Ehv LIZIZ2 = LLLLL().LJJJJLL().LIZJ().LIZIZ();
        LIZIZ2.LIZLLL(new AqS173S0100000_7(this, 203));
        LIZIZ2.LIZIZ();
    }

    @Override // X.I0N
    public void lw(boolean z) {
        if (z) {
            I15 i15 = this.LLJ;
            if (i15 != null) {
                ((I1F) i15.LJFF.getValue()).show();
                return;
            }
            return;
        }
        I15 i152 = this.LLJ;
        if (i152 == null) {
            return;
        }
        ((I1F) i152.LJFF.getValue()).hide();
    }

    @Override // X.I0N
    public void nj(ArrayList<GreenScreenMaterial> arrayList) {
        if (arrayList != null) {
            ArrayList<IB3> arrayList2 = this.LLJLLIL;
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator<GreenScreenMaterial> it = arrayList.iterator();
            while (it.hasNext()) {
                GreenScreenMaterial next = it.next();
                arrayList3.add(new IB3(next.getType(), next.getLocalPath(), next.getResId(), 0L, next.getAuthorName(), "prop_reuse"));
            }
            arrayList2.addAll(arrayList3);
        }
    }

    @Override // X.I0N
    public void ot0(boolean z) {
        this.LLJJIJI.LJII(Boolean.valueOf(z));
    }

    public final void u(IB3 ib3) {
        String str;
        GreenScreenMaterial greenScreenMaterial = this.LLJLLL;
        greenScreenMaterial.setType(ib3.LJLJJI);
        Effect LLIFFJFJJ = LLIFFJFJJ();
        if (LLIFFJFJJ == null || (str = LLIFFJFJJ.getEffectId()) == null) {
            str = "";
        }
        greenScreenMaterial.setStickerId(str);
        greenScreenMaterial.setResId(ib3.LJLJJL);
        greenScreenMaterial.setAuthorName(ib3.LJLJJLL);
        greenScreenMaterial.setLocalPath(ib3.LJLILLLLZI);
        greenScreenMaterial.setMediasource(ib3.LJLJL);
        this.LLIIJLIL.curGreenScreenMaterial = this.LLJLLL;
    }

    @Override // X.I0N
    public void xb(boolean z) {
        if (LLLZLZ()) {
            C44960Hki LLLLZLLIL = LLLLZLLIL();
            LLLLZLLIL.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onCameraTypeChanged isNow:");
            LIZ.append(z);
            C44960Hki.LJII(X1D.LIZIZ(LIZ));
            if (!z) {
                LLLLZLLIL.LJIIIIZZ(LLLLZLLIL.LJLILLLLZI.LLJJIJIIJIL());
            }
        }
    }

    @Override // X.I0N
    public void yn0(F4V handler) {
        o.LJIIIZ(handler, "handler");
        LJJLIIJ(handler, true);
    }

    @Override // X.AbstractC46244ICy
    public void LJJLJ(FrameLayout stickerPanelContainer, InterfaceC83566Wqw onEffectShow) {
        int i;
        IDqS432S0100000_7 iDqS432S0100000_7;
        F4V f4v;
        o.LJIIIZ(stickerPanelContainer, "stickerPanelContainer");
        o.LJIIIZ(onEffectShow, "onEffectShow");
        super.LJJLJ(stickerPanelContainer, onEffectShow);
        IDH LLLF = LLLF();
        if (LLLF != null) {
            TGD R3 = LLLF.R3();
            TKR tkr = R3.LJLLILLLL.LJLJLJ;
            I0N i0n = (I0N) getDiContainer().LJ(I0N.class, null);
            P2(new C82545WaT(LJLLL(), LLLLL(), this.LJLJJL, C46226ICg.LJLIL, C46225ICf.LJLIL));
            P2(new C46216IBw(C42581GnR.LJLIL));
            InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) getDiContainer().LJIIIIZZ(null, InterfaceC45540Hu4.class);
            F4V LIZLLL = this.LLIIIZ.LIZLLL(this.LJLIL, LLLLL(), LLZL(), (InterfaceC84497XEf) getDiContainer().LJ(InterfaceC84497XEf.class, null), (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null), (I9W) getDiContainer().LJ(I9W.class, null), interfaceC45540Hu4);
            P2(LIZLLL);
            i0n.Oy().LIZLLL(this, new AObjectS87S0100000_12(LIZLLL, 2));
            LLLF.Za().observe(this, new AObjectS86S0100000_7(this, 223));
            P2(new SavePhotoStickerHandler(this.LJLIL, new C173796rv(LLF(), this.LJLJI, this.LLIIJLIL, new C44445HcP(this)), this));
            if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode() && !CommerceToolsMusicService.LIZIZ(false).U40() && AVCommerceServiceImpl.LJIIJ().LIZIZ()) {
                P2(CommerceToolsStickerServiceImpl.LJIIL().LJIIJ(this.LJLIL, new AqS157S0100000_7(this, 410), this.LLIIJLIL));
            }
            P2(CommerceToolsStickerServiceImpl.LJIIL().LJIIIIZZ(this.LJLIL, this.LLIIJLIL));
            P2(new C83328Wn6(C44189HVx.LJLIL, this.LJLIL, LLLLL(), LLF(), tkr));
            C29S c29s = this.LJLIL;
            C0IB<Boolean> c0ib = this.LJLL;
            C83909WwT c83909WwT = new C83909WwT(LLF(), LJLLL());
            ID9 id9 = this.LJLLI;
            if (e1.LIZ(31744, "reduce_sensor_frequency", true, false)) {
                i = 10000;
            } else {
                i = 5000;
            }
            LJJLIIJ(new ARStickerHandler(c29s, c29s, c0ib, c83909WwT, id9, i), true);
            LJJLIIJ(new IBF(this.LJLIL, new C46210IBq(LLF())), true);
            LJJLIIJ(new IB8(C46229ICj.LJLIL), true);
            if (R3.LJLJLJ) {
                LJJLIIJ(new LockStickerHandler(this.LJLIL, getLifecycle(), LLLLL(), new AqS173S0100000_7(this, 207), new AqS157S0100000_7(this, 405)), true);
            }
            I0P i0p = new I0P(i0n, this);
            T4E t4e = new T4E();
            C29S activity = this.LJLIL;
            ShortVideoContext shortVideoContext = this.LLIIJLIL;
            C44451HcV c44451HcV = new C44451HcV(this);
            IBS uploadPicStickerListener = LLLI();
            o.LJIIIZ(activity, "activity");
            o.LJIIIZ(shortVideoContext, "shortVideoContext");
            o.LJIIIZ(uploadPicStickerListener, "uploadPicStickerListener");
            String LJI = shortVideoContext.LJI();
            IB7 ib7 = new IB7(shortVideoContext);
            C47261Igj c47261Igj = new C47261Igj();
            HJF hjf = new HJF(4, shortVideoContext);
            C43720HDw c43720HDw = new C43720HDw(shortVideoContext, new C43718HDu(shortVideoContext));
            HMO hmo = new HMO(activity);
            C44000HOq showErrorToast = C44000HOq.LJLIL;
            boolean LIZ = C46227ICh.LIZ();
            boolean LIZ2 = C53558L0g.LIZ();
            AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(shortVideoContext, 393);
            o.LJIIIZ(showErrorToast, "showErrorToast");
            P2(new BackgroundVideoStickerPresenter(activity, LJI, interfaceC45540Hu4, c44451HcV, uploadPicStickerListener, ib7, c47261Igj, hjf, c43720HDw, i0p, new C45595Hux(hmo), showErrorToast, t4e, LIZ, LIZ2, this, aqS157S0100000_7));
            if (o.LJ(this.LLIIJLIL.shootWay, "direct_shoot")) {
                iDqS432S0100000_7 = new IDqS432S0100000_7(this, 6);
            } else {
                iDqS432S0100000_7 = null;
            }
            C29S c29s2 = this.LJLIL;
            C83534WqQ c83534WqQ = new C83534WqQ();
            IBS LLLI = LLLI();
            IB5 ib5 = new IB5(this.LLIIJLIL);
            IBV ibv = new IBV(this);
            IDqS432S0100000_7 iDqS432S0100000_72 = iDqS432S0100000_7;
            UploadPicStickerARPresenter uploadPicStickerARPresenter = new UploadPicStickerARPresenter(c29s2, interfaceC45540Hu4, c83534WqQ, LLLI, ib5, new C44945HkT(this), ibv, new AqS173S0100000_7(this, 206), C42582GnS.LJLIL, e1.LIZ(31744, "image_album_on_tap", true, false), iDqS432S0100000_72, new IDqS432S0100000_7(this, 4), new IDqS453S0100000_7(this, 0), new IDqS432S0100000_7(this, 5), this.LLJZ, LLLLL().LJJJJLL().LIZ().LJIIIIZZ(), LLLLL(), i0p, this.LLJLLIL, t4e, C44383HbP.LJLIL, IBQ.LJLIL, C46227ICh.LIZ(), new AqS157S0100000_7(this, 408), C41942Gd8.LIZ(), this.LLLFF, new AqS157S0100000_7(this, 409), 818942080, 0);
            uploadPicStickerARPresenter.LJLJJL = new C46208IBo(this);
            uploadPicStickerARPresenter.LJLJJI = new IB6(this.LLIIJLIL);
            uploadPicStickerARPresenter.LJLJJLL = new C83484Wpc(this);
            this.LLJJJ = uploadPicStickerARPresenter;
            if (C43416H2e.LIZ()) {
                P2(LLLL());
                if (C69162nY.LIZ()) {
                    P2(LLLLLJLJLL());
                } else {
                    P2(LLLLLL().LJIIIZ);
                }
            }
            P2(new C83544Wqa(this.LJLIL, LLLLL(), new C83589WrJ(LLF()), new AqS157S0100000_7(stickerPanelContainer, 412), onEffectShow, new AqS157S0100000_7(this, 413), new AqS196S0100000_14(this, 30), C83543WqZ.LJLIL, IBW.LJLIL));
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "image_album_on_tap", true, false) && (f4v = this.LLJJJ) != null) {
                P2(f4v);
            }
            P2(new C84015WyB(this.LJLIL, this.LJLL, C46197IBd.LJLIL, this.LJLLILLLL, this.LJLLI, e1.LIZ(31744, "reduce_sensor_frequency", true, false)));
            getLifecycleOwner();
            StickerVideoStatusHandler stickerVideoStatusHandler = new StickerVideoStatusHandler(this, new ICG(LLF()), this.LLIILZL);
            this.LLIILII = stickerVideoStatusHandler;
            P2(stickerVideoStatusHandler);
            getLifecycleOwner();
            VoiceRecognizeStickerHandler voiceRecognizeStickerHandler = new VoiceRecognizeStickerHandler(this, new C46175IAh(getCameraApiComponent()), getRecordControlApi().Ue0(), this.LJLIL, new AqS157S0100000_7(this, 394));
            P2(voiceRecognizeStickerHandler);
            this.LLIL = voiceRecognizeStickerHandler;
            P2(new C44969Hkr(this.LLIIJLIL));
            LLLZLL();
            IB2 ib2 = new IB2(C46198IBe.LJLIL, new AqS157S0100000_7(this, 398), new AqS157S0100000_7(this, 399), new AqS173S0100000_7(this, 204));
            this.LLIIZ = ib2;
            LJJLIIJ(ib2, false);
            C29S c29s3 = this.LJLIL;
            P2(new ARCoreStickerHandler(c29s3, c29s3, getCameraApiComponent()));
            P2(new SVCStickerHandler(this.LJLIL, getDiContainer()));
            P2(new SharedARStickerHandler(getDiContainer(), this.LJLIL, Y60(), getCameraApiComponent(), getRecordControlApi(), getFilterApiComponent()));
            C29S activity2 = this.LJLIL;
            TEZ stickerDataManager = LLLLL();
            InterfaceC74343TFr stickerMobHelper = this.LJLILLLLZI;
            InterfaceC46204IBk clickController = LLZL();
            InterfaceC84497XEf interfaceC84497XEf = (InterfaceC84497XEf) getDiContainer().LJ(InterfaceC84497XEf.class, null);
            TE0 stickerListViewConfigure = R3.LJLLILLLL;
            o.LJIIIZ(activity2, "activity");
            o.LJIIIZ(stickerDataManager, "stickerDataManager");
            o.LJIIIZ(stickerMobHelper, "stickerMobHelper");
            o.LJIIIZ(clickController, "clickController");
            o.LJIIIZ(stickerListViewConfigure, "stickerListViewConfigure");
            THA tha = new THA(interfaceC84497XEf);
            P2(new T4B(activity2, stickerDataManager, stickerMobHelper, tha, stickerListViewConfigure.LJLJLJ, new MultiStickerListViewModel(this, stickerDataManager, clickController, tha), this));
            C39621Fgn c39621Fgn = new C39621Fgn();
            ((ArrayList) c39621Fgn.LJLIL).add(new ICW(getCameraApiComponent()));
            ((ArrayList) c39621Fgn.LJLIL).add(new ICX(getCameraApiComponent()));
            ((ArrayList) c39621Fgn.LJLIL).add(new ICY(getCameraApiComponent(), C78688UuS.LJIL(this)));
            ((ArrayList) c39621Fgn.LJLIL).add(new C36144EGm(getCameraApiComponent(), C78688UuS.LJIL(this)));
            ((ArrayList) c39621Fgn.LJLIL).add(new C46231ICl(getCameraApiComponent()));
            P2(c39621Fgn);
            List LJJIJIL = C47261Igj.LJJIJIL(new C72706SgA(this.LJLIL, getCameraApiComponent().e8(), (InterfaceC84497XEf) getDiContainer().LJ(InterfaceC84497XEf.class, null), this.LLIIJLIL, new AqS157S0100000_7(this, 411), this));
            UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.LLJJJ;
            if (uploadPicStickerARPresenter2 != null) {
                LJJIJIL.add(uploadPicStickerARPresenter2);
            }
            C29S c29s4 = this.LJLIL;
            TEZ LLLLL = LLLLL();
            String LJI2 = this.LLIIJLIL.LJI();
            C45595Hux c45595Hux = new C45595Hux(new HMO(this.LJLIL));
            C43857HJd c43857HJd = new C43857HJd(this.LJLIL, this.LLIIJLIL);
            ShortVideoContext shortVideoContext2 = this.LLIIJLIL;
            C43720HDw c43720HDw2 = new C43720HDw(shortVideoContext2, new C43717HDt(shortVideoContext2));
            ShortVideoContext shortVideoContext3 = this.LLIIJLIL;
            o.LJIIIZ(shortVideoContext3, "shortVideoContext");
            DiyPropVideoStickerHandler diyPropVideoStickerHandler = new DiyPropVideoStickerHandler(c29s4, LLLLL, LJI2, interfaceC45540Hu4, C83567Wqx.LJLIL, c45595Hux, c43857HJd, c43720HDw2, t4e, new HJF(37, shortVideoContext3), new C47261Igj(), C43935HMd.LJLIL, C83568Wqy.LJLIL);
            P2(diyPropVideoStickerHandler);
            this.LLJJJIL = diyPropVideoStickerHandler;
            P2(new DynamicSelectorHandler(LJJIJIL, this.LJLIL));
            C44962Hkk c44962Hkk = InterfaceC44963Hkl.LJIIL;
            if (c44962Hkk.enableUseDynamicEffectLabel()) {
                C44971Hkt LLLLJ = LLLLJ();
                LLLLJ.getClass();
                if (c44962Hkk.enableUseDynamicEffectLabel()) {
                    LLLLJ.LJLIL.clear();
                    LLLLJ.LIZIZ(null);
                }
                LJJLIIJ(LLLLJ(), true);
            }
            if (LLLZLZ()) {
                C44960Hki LLLLZLLIL = LLLLZLLIL();
                LLLLZLLIL.LJLJLLL = LLLF;
                LLLLZLLIL.LJFF();
                LJJLIIJ(LLLLZLLIL(), true);
            }
            if (HBG.LIZ()) {
                P2(new C46228ICi(getCameraApiComponent().rX().LJ()));
            }
            if (C43416H2e.LIZ() && (ESC.LIZ() || C53560L0i.LIZ())) {
                P2(new C81427VxX(this.LLIIJLIL, LLLLL(), getCameraApiComponent()));
                P2(new C36418ERa());
            }
            P2(new IBG(getCameraApiComponent()));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC46244ICy
    public void LJJLJLI(TEZ stickerDataManager, InterfaceC46204IBk stickerSelectedController) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(stickerSelectedController, "stickerSelectedController");
        super.LJJLJLI(stickerDataManager, stickerSelectedController);
        stickerSelectedController.LIZLLL(new C46239ICt(stickerDataManager, this.LJLILLLLZI));
        stickerSelectedController.LIZLLL(new C46241ICv(stickerDataManager, new AqS173S0100000_7(this, 208)));
    }

    public final void LLJJJIL(String categoryName, String effectId) {
        o.LJIIIZ(categoryName, "categoryName");
        o.LJIIIZ(effectId, "effectId");
        this.LLJILJIL.put(categoryName, effectId);
    }

    public final void LLJJL(IB3 ib3, String str) {
        List<IB3> list;
        String str2 = ib3.LJLILLLLZI;
        if (str2 == null) {
            return;
        }
        if (str2.equals("")) {
            u(new IB3(ib3.LJLILLLLZI, 1, 0L, 56));
            return;
        }
        String str3 = ib3.LJLILLLLZI;
        str3.toString();
        File file = new File(str3);
        if (file.exists()) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.toURI().toURL().toString());
            o.LJIIIIZZ(fileExtensionFromUrl, "getFileExtensionFromUrl(…URI().toURL().toString())");
            String lowerCase = fileExtensionFromUrl.toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            if (!o.LJ(lowerCase, "gif")) {
                return;
            }
            if (this.LLJLLL.getType() == 1) {
                LLF().R9(this.LJLIL, null, null, null);
                List<String> list2 = this.LLJJJJ;
                if (list2 != null) {
                    LLF().oa(list2, C61878OQg.INSTANCE);
                    UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LLJJJ;
                    if (uploadPicStickerARPresenter != null && (list = uploadPicStickerARPresenter.LJLZ) != null) {
                        ((ArrayList) list).clear();
                    }
                }
            }
            InterfaceC83727WtX LLF = LLF();
            C29S c29s = this.LJLIL;
            String str4 = ib3.LJLILLLLZI;
            str4.toString();
            LLF.Q9(c29s, str, str4);
            u(ib3);
            this.LLJI = 0;
        }
    }

    public final List<Effect> LLLILZLLLI(List<? extends Effect> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (Effect effect : list) {
            if (arrayList.size() < i && !ID0.LJII(effect) && !ID0.LJIIJ(effect) && !V3N.LJIILLIIL(effect) && !C44329HaX.LIZ(effect)) {
                arrayList.add(effect);
            }
        }
        return arrayList;
    }

    public final String LLZ(Effect effect, String str) {
        if (effect instanceof ProTemplateEffect) {
            return ((ProTemplateEffect) effect).getEffectPath();
        }
        if (!(effect instanceof DraftEffect)) {
            return str;
        }
        return ((DraftEffect) effect).getEffectPath();
    }

    @Override // X.AbstractC46244ICy, X.I9W
    public void No(InterfaceC83566Wqw onEffectTvShow, FrameLayout stickerPanelContainer) {
        o.LJIIIZ(onEffectTvShow, "onEffectTvShow");
        o.LJIIIZ(stickerPanelContainer, "stickerPanelContainer");
        super.No(onEffectTvShow, stickerPanelContainer);
        this.LJLJI.bh().LIZIZ(this, new AObjectS86S0100000_7(this, 220));
        this.LJLJI.ru0().LIZIZ(this, new AObjectS86S0100000_7(this, 222));
        LLLLL().LJJJJLL().LIZ().LJIIIIZZ().observe(this, new AObserverS75S0100000_7(this, 48));
        if (C43416H2e.LIZ()) {
            if (C69162nY.LIZ()) {
                this.LLLIL.add(LLLLLJLJLL());
                this.LLLIL.add(new ESD());
                this.LLLIL.add(new ES1());
                this.LLLIL.add(new ES3());
                return;
            }
            this.LLLIL.add(LLLLLL().LJIIJ);
        }
    }

    @Override // X.I0N
    public void Sl(boolean z, boolean z2) {
        this.LLLII.setValue(new OSZ<>(Boolean.valueOf(z), Boolean.valueOf(z2)));
    }

    public final void n(boolean z, boolean z2) {
        EnumC63837P3p enumC63837P3p;
        InterfaceC83624Wrs interfaceC83624Wrs = this.LJLJJL;
        if (!z) {
            enumC63837P3p = EnumC63837P3p.DEFAULT;
        } else if (z2) {
            enumC63837P3p = EnumC63837P3p.BLUETOOTH;
        } else {
            enumC63837P3p = EnumC63837P3p.WIRED;
        }
        interfaceC83624Wrs.setAudioCaptureDevice(new IC8(enumC63837P3p));
        this.LJLJJL.setAudioDevice(!z);
    }

    private final void LLJJIJI(InterfaceC44448HcS interfaceC44448HcS, EO7 eo7, InterfaceC88472Yns<? super ShortVideoContext, Boolean> interfaceC88472Yns) {
        if (interfaceC88472Yns.invoke(this.LLIIJLIL).booleanValue()) {
            interfaceC44448HcS.LIZ(eo7);
        }
    }

    private final void LLZLL(Effect effect, int i, int i2) {
        String str;
        if (i != 17) {
            return;
        }
        Effect LLJJIJIIJIL = LLLLL().LLJJIJIIJIL();
        if (LLJJIJIIJIL != null && effect != null && ujb.o.LJJJJIZL(LLJJIJIIJIL.getEffect_id(), effect.getEffect_id(), true)) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZIZ(System.currentTimeMillis() - this.LLLILZ.LIZIZ, "duration");
            c145995oB.LIZ(i2, "status");
            c145995oB.LJI("prop_id", effect.getEffect_id());
            c145995oB.LJI("shoot_way", this.LLIIJLIL.shootWay);
            Bundle LLLJL = LLLJL();
            String str2 = null;
            if (LLLJL != null) {
                str = LLLJL.getString("enter_from");
            } else {
                str = null;
            }
            c145995oB.LJI("enter_from", str);
            Bundle LLLJL2 = LLLJL();
            if (LLLJL2 != null) {
                str2 = LLLJL2.getString("enter_method");
            }
            c145995oB.LJI("enter_method", str2);
            if (ujb.o.LJJJJIZL(this.LLIIJLIL.shootWay, "direct_shoot", false)) {
                c145995oB.LIZLLL("type", "plus");
            }
            GXR.LIZ("tool_performance_prop_reuse_apply_time", c145995oB.LIZ);
        }
        this.LLLILZ.LIZ = false;
    }

    private final void e(InterfaceC44447HcR interfaceC44447HcR, EO7 eo7, InterfaceC88472Yns<? super ShortVideoContext, Boolean> interfaceC88472Yns) {
        if (interfaceC88472Yns.invoke(this.LLIIJLIL).booleanValue()) {
            C44384HbQ.LLIIIZ(interfaceC44447HcR, eo7);
        }
    }

    public final void LLJLIL(String path, String key, C83489Wph c83489Wph) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(key, "key");
        if (path.equals("")) {
            if (this.LLJLLL.getType() == 1) {
                LLF().LLIIIJ(key, path);
            }
            u(new IB3(path, 1, 0L, 56));
        } else {
            CreativeInfo creativeInfo = this.LLIIJLIL.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
            C41944GdA.LIZLLL(path, C41944GdA.LIZIZ(creativeInfo), c83489Wph, C78688UuS.LJIL(this), new AqS60S1100000_7(this, key, 3));
            u(new IB3(path, 1, 0L, 56));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (r0 == 2) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLLIL(java.util.List<X.IB3> r16, java.util.List<X.IB3> r17, X.C83489Wph r18) {
        /*
            r15 = this;
            r13 = r15
            X.WtX r2 = r13.LLF()
            X.29S r1 = r13.LJLIL
            java.lang.String r0 = ""
            r2.Q9(r1, r0, r0)
            X.Wbi r2 = r13.getDiContainer()
            java.lang.Class<androidx.lifecycle.ViewModelProvider> r1 = androidx.lifecycle.ViewModelProvider.class
            r0 = 0
            java.lang.Object r1 = r2.LJ(r1, r0)
            androidx.lifecycle.ViewModelProvider r1 = (androidx.lifecycle.ViewModelProvider) r1
            java.lang.Class<com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerMessageModule> r0 = com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerMessageModule.class
            androidx.lifecycle.ViewModel r10 = r1.get(r0)
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerMessageModule r10 = (com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerMessageModule) r10
            android.content.Context r7 = X.C78688UuS.LJIL(r13)
            kotlin.jvm.internal.AqS77S0400000_7 r9 = new kotlin.jvm.internal.AqS77S0400000_7
            r14 = 3
            r12 = r16
            r3 = r17
            r11 = r3
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.String r0 = "mediaList"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "uploadPicData"
            r6 = r18
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L4a
            X.IBJ r1 = X.IBJ.UNKNOWN
            X.OQg r0 = X.C61878OQg.INSTANCE
            r9.invoke(r1, r0)
        L49:
            return
        L4a:
            boolean r4 = X.C41942Gd8.LIZ()
            X.2mC r5 = new X.2mC
            r5.<init>()
            int[] r2 = X.C44739Hh9.LIZLLL()
            r1 = 2
            if (r2 == 0) goto L77
            int r0 = r2.length
            if (r0 != r1) goto L77
        L5d:
            java.lang.String r0 = "getImportVideoSize().run…20, 1280)\n        }\n    }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r5.element = r2
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X.IBJ r0 = X.IBJ.START
            r9.invoke(r0, r8)
            X.HkO r2 = new X.HkO
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.C10K.LIZJ(r2)
            goto L49
        L77:
            int[] r2 = new int[r1]
            r2 = {x007e: FILL_ARRAY_DATA , data: [720, 1280} // fill-array
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46193IAz.LLJLLIL(java.util.List, java.util.List, X.Wph):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46193IAz(C82622Wbi diContainer, IBR recordStickerLoginExtraInfoStickerHandlerFactory, InterfaceC88472Yns<? super ID3, C76800UCe> interfaceC88472Yns, C45312HqO logicConfig) {
        super(diContainer, interfaceC88472Yns);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(recordStickerLoginExtraInfoStickerHandlerFactory, "recordStickerLoginExtraInfoStickerHandlerFactory");
        o.LJIIIZ(logicConfig, "logicConfig");
        this.LLIIIZ = recordStickerLoginExtraInfoStickerHandlerFactory;
        this.LLIIJI = logicConfig;
        ShortVideoContext shortVideoContext = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        this.LLIIJLIL = shortVideoContext;
        this.LLIIL = (InterfaceC45540Hu4) getDiContainer().LJIIIIZZ(null, InterfaceC45540Hu4.class);
        this.LLILL = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.LLILLIZIL = UCI.LJII(getDiContainer(), WRP.class, null);
        this.LLILLJJLI = UCI.LJI(getDiContainer(), I37.class, null);
        this.LLILLL = UCI.LJII(getDiContainer(), HYQ.class, null);
        this.LLILZ = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LLILZIL = UCI.LJII(getDiContainer(), WUU.class, null);
        this.LLILZLL = UCI.LJII(getDiContainer(), InterfaceC81634W2c.class, null);
        this.LLIZ = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LLIZLLLIL = UCI.LJI(getDiContainer(), WLB.class, null);
        this.LLJILJIL = new LinkedHashMap();
        this.LLJILLL = new C29901Fi<>();
        this.LLJJ = new C29901Fi<>();
        this.LLJJI = new C29901Fi<>();
        this.LLJJIII = new C29901Fi<>();
        this.LLJJIJI = new C29901Fi<>();
        this.LLJJIJIIJIL = new C29901Fi<>();
        this.LLJJIJIL = new C29901Fi<>();
        this.LLJJJJJIL = new MutableLiveData<>();
        this.LLJJJJLIIL = new C29901Fi<>();
        this.LLJJL = new C84102Wza(this);
        this.LLJJLIIIJLLLLLLLZ = new IBB(this);
        this.LLJL = new IBH(this);
        this.LLJLIL = C221108m2.LIZIZ(C44879HjP.LJLIL);
        this.LLJLILLLLZIIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 403));
        this.LLJLL = C221108m2.LIZIZ(C44973Hkv.LJLIL);
        this.LLJLLIL = new ArrayList<>();
        this.LLJLLL = new GreenScreenMaterial(0, 0L, 0L, null, null, null, null, null, 255, null);
        this.LLJZ = new C74577TOr(shortVideoContext);
        this.LLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 406));
        this.LLLF = new IB1(this);
        this.LLLFFI = new C29901Fi<>();
        this.LLLFZ = new C29901Fi<>();
        this.LLLII = new MutableLiveData<>();
        this.LLLIIIIL = C221108m2.LIZIZ(C46202IBi.LJLIL);
        this.LLLIIIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 396));
        this.LLLIIL = C221108m2.LIZIZ(new AqS154S0200000_7(diContainer, this, 56));
        this.LLLIILIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 395));
        this.LLLIL = new ArrayList();
        this.LLLILZ = new IB9(0);
        this.LLLILZJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 402));
        this.LLLILZLLLI = new C43910HLe("preview", C78594Usw.LIZJ(getCameraApiComponent().e8().getCurrentCameraType()), diContainer, shortVideoContext, getCameraApiComponent());
        ViewModelProvider viewModelProvider = (ViewModelProvider) diContainer.LJ(ViewModelProvider.class, null);
        this.LLLFF = (AbstractC42651GoZ) diContainer.LJIIIIZZ(null, AbstractC42651GoZ.class);
        if (!TextUtils.isEmpty(shortVideoContext.effectMetaInfo) || !TextUtils.isEmpty(shortVideoContext.effectImage)) {
            LLLLL().LJIJJ(false);
        }
        EffectConfigViewModel effectConfigViewModel = (EffectConfigViewModel) viewModelProvider.get(EffectConfigViewModel.class);
        C29S activity = this.LJLIL;
        C46201IBh c46201IBh = new C46201IBh();
        effectConfigViewModel.getClass();
        o.LJIIIZ(activity, "activity");
        IBD ibd = new IBD(activity, shortVideoContext, c46201IBh, effectConfigViewModel, this);
        ibd.LIZLLL.LJLIL.observe(ibd.LJ, new AObserverS75S0100000_7(ibd, 93));
        ibd.LIZLLL.LJLILLLLZI.observe(ibd.LJ, new AObserverS75S0100000_7(ibd, 94));
        ibd.LIZLLL.LJLJI.observe(ibd.LJ, new AObserverS75S0100000_7(ibd, 95));
        LLLZ();
        VERecorder LJ = this.LJLJI.rX().LJ();
        IBZ LIZ = IBZ.LIZ();
        if (LJ == null) {
            LIZ.LIZ = null;
        } else {
            LIZ.getClass();
            LIZ.LIZ = new WeakReference<>(LJ);
        }
        LLLLL().LJJJJIZL(new C84132X0e(this));
        LLLLL().LJJIII(C46212IBs.LIZIZ());
        LLLLL().LJIIL(C46212IBs.LIZ());
        LLLJ();
        LLLLL().LJIIIIZZ().LIZLLL().observe(this, new AObserverS75S0100000_7(this, 47));
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LLLIZZ = C221108m2.LIZ(enumC221088m0, new AqS157S0100000_7(this, 401));
        this.LLLJ = C221108m2.LIZ(enumC221088m0, new AqS157S0100000_7(this, LiveChatShowDelayForHotLiveSetting.DEFAULT));
        this.LLLJIL = C221108m2.LIZ(enumC221088m0, new AqS154S0200000_7(diContainer, this, 55));
        this.LLLJL = C221108m2.LIZ(enumC221088m0, new AqS154S0200000_7(diContainer, this, 57));
        C29S c29s = this.LJLIL;
        LLLJ();
        this.LLLL = new I26(diContainer, c29s, this, shortVideoContext, this);
        this.LLLLII = C221108m2.LIZ(enumC221088m0, new AqS157S0100000_7(this, 404));
        this.LLLLIIIILLL = true;
    }

    public final void m(Effect effect, int i, int i2, int i3) {
        if (i == 17) {
            if (i2 == 9) {
                if (i3 == 3) {
                    LLZLL(effect, i, 0);
                }
            } else {
                if (i2 == 3) {
                    return;
                }
                LLZLL(effect, i, 2);
            }
        }
    }

    public /* synthetic */ C46193IAz(C82622Wbi c82622Wbi, IBR ibr, InterfaceC88472Yns interfaceC88472Yns, C45312HqO c45312HqO, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, ibr, (i & 4) != 0 ? null : interfaceC88472Yns, (i & 8) != 0 ? new C45312HqO(false, false) : c45312HqO);
    }

    public static /* synthetic */ void LLZLLIL(C46193IAz c46193IAz, Effect effect, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        c46193IAz.LLZLL(effect, i, i2);
    }
}
