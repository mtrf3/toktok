package X;

import Y.AObjectS86S0100000_7;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class I0F extends AbstractC29891Fh<InterfaceC45889Hzh> implements InterfaceC45889Hzh, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public final InterfaceC115514g7 activity$delegate;
    public final C0IB<Boolean> albumPageVisibilityState;
    public final InterfaceC45889Hzh apiComponent;
    public final InterfaceC115514g7 bottomTabApiComponent$delegate;
    public final InterfaceC115514g7 cameraApiComponent$delegate;
    public final List<String> cameraTab;
    public ChooseMediaViewModel chooseMediaViewModel;
    public long clickAlbumIconTime;
    public final C82622Wbi diContainer;
    public final C29901Fi<C76800UCe> dismissSuperEntranceEvent;
    public final C29901Fi<C76800UCe> dismissUploadPopEntranceEvent;
    public EditEffectAnchorManager editEffectAnchorManager;
    public final C40871j1<Integer> effectContainerVisibility;
    public final InterfaceC115514g7 exitRecordApi$delegate;
    public final C5H3 fromExteriorRecordScene$delegate;
    public final C5H3 hideEffectEntrance$delegate;
    public final C5H3 hideUploadEntrance$delegate;
    public final InterfaceC115514g7 infiniStickerApi$delegate;
    public int layoutResId;
    public final C29901Fi<C76800UCe> needNoTouchListener;
    public final WMH parentScene;
    public final InterfaceC115514g7 planCUIApiComponent$delegate;
    public final InterfaceC115514g7 recordAdapterApi$delegate;
    public final InterfaceC115514g7 recordControlApi$delegate;
    public final boolean recordDockBarAsyncLayoutEnabled;
    public final C5H3 recordDockBarAsyncUIInflateScene$delegate;
    public final C5H3 recordDockBarScene$delegate;
    public final InterfaceC115514g7 recordPermissionApiComponent$delegate;
    public final InterfaceC115514g7 recordQaStickerApi$delegate;
    public final InterfaceC115514g7 shortVideoContext$delegate;
    public final InterfaceC115514g7 stickerApiComponent$delegate;
    public final InterfaceC115514g7 toolbarApi$delegate;
    public final C40871j1<Integer> uploadVisibility;

    public final void registerObservers() {
        LiveEvent<C76800UCe> ts;
        C0IB<WS0> bottomTabIndexChangeEvent;
        if (L2L.LIZJ(getDiContainer())) {
            Float LIZ = getPlanCUIApiComponent().Ht().LIZ();
            o.LJIIIIZZ(LIZ, "planCUIApiComponent.delayUIAlpha.value");
            if (LIZ.floatValue() < 1.0f) {
                View view = m20getRecordDockBarScene().mView;
                if (view != null) {
                    view.setLayerType(2, null);
                }
                getPlanCUIApiComponent().gC().LIZLLL(this, new AObjectS86S0100000_7(this, 188));
            }
            getPlanCUIApiComponent().Ht().LIZIZ(this, new AObjectS86S0100000_7(this, 189));
        }
        getRecordControlApi().Vh().LIZLLL(this, new AObjectS86S0100000_7(this, 190));
        C82622Wbi diContainer = getDiContainer();
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(InterfaceC45921I0n.class, new AqS173S0100000_7(this, 193));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, InterfaceC45921I0n.class);
            if (c0i6 != null) {
                ((InterfaceC45921I0n) c0i6).YZ().LIZIZ(this, new AObjectS86S0100000_7(this, 191));
            }
        }
        getPlanCUIApiComponent().Et().LIZIZ(this, new AObjectS86S0100000_7(this, 192));
        getPlanCUIApiComponent().Ie().LIZIZ(this, new AObjectS86S0100000_7(this, 193));
        InterfaceC45979I2t bottomTabApiComponent = getBottomTabApiComponent();
        if (bottomTabApiComponent != null && (bottomTabIndexChangeEvent = bottomTabApiComponent.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZIZ(this, new AObjectS86S0100000_7(this, 194));
        }
        getRecordControlApi().Qr0().LIZLLL(this, new AObjectS86S0100000_7(this, 183));
        getRecordControlApi().Gg0().LIZLLL(this, new AObjectS86S0100000_7(this, 184));
        I8W recordPermissionApiComponent = getRecordPermissionApiComponent();
        if (recordPermissionApiComponent != null && (ts = recordPermissionApiComponent.ts()) != null) {
            ts.LIZLLL(this, new AObjectS86S0100000_7(this, 187));
        }
    }

    static {
        TBT tbt = new TBT(I0F.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I0F.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I0F.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(I0F.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I0F.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(I0F.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I0F.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I0F.class, "recordQaStickerApi", "getRecordQaStickerApi()Lcom/ss/android/ugc/aweme/qa_sticker/RecordQaStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(I0F.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I0F.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I0F.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/aweme/infinisticker/RecordInfiniStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(I0F.class, "exitRecordApi", "getExitRecordApi()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I0F.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0, c65351Pkp)};
    }

    private final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.activity$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.bottomTabApiComponent$delegate.LIZ(this, $$delegatedProperties[8]);
    }

    private final boolean getFromExteriorRecordScene() {
        return ((Boolean) this.fromExteriorRecordScene$delegate.getValue()).booleanValue();
    }

    private final boolean getHideEffectEntrance() {
        return ((Boolean) this.hideEffectEntrance$delegate.getValue()).booleanValue();
    }

    private final boolean getHideUploadEntrance() {
        return ((Boolean) this.hideUploadEntrance$delegate.getValue()).booleanValue();
    }

    private final C6UV getInfiniStickerApi() {
        return (C6UV) this.infiniStickerApi$delegate.LIZ(this, $$delegatedProperties[10]);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.recordAdapterApi$delegate.LIZ(this, $$delegatedProperties[12]);
    }

    private final C46003I3r getRecordDockBarAsyncUIInflateScene() {
        return (C46003I3r) this.recordDockBarAsyncUIInflateScene$delegate.getValue();
    }

    private final I8W getRecordPermissionApiComponent() {
        return (I8W) this.recordPermissionApiComponent$delegate.LIZ(this, $$delegatedProperties[9]);
    }

    private final InterfaceC45932I0y getRecordQaStickerApi() {
        return (InterfaceC45932I0y) this.recordQaStickerApi$delegate.LIZ(this, $$delegatedProperties[7]);
    }

    private final InterfaceC82062WIo getToolbarApi() {
        return (InterfaceC82062WIo) this.toolbarApi$delegate.LIZ(this, $$delegatedProperties[6]);
    }

    private final void setupForEditEffect() {
        String string;
        Bundle LIZ = C163796bn.LIZ(this.parentScene);
        if (LIZ != null && (string = LIZ.getString("extra_edit_effect_uid")) != null) {
            this.editEffectAnchorManager = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(string);
        }
    }

    @Override // X.InterfaceC45889Hzh
    public void closeAlbum() {
        C29901Fi c29901Fi = this.chooseMediaViewModel.LJLLL;
        o.LJII(c29901Fi, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        c29901Fi.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC45889Hzh
    public void dismissSuperEntranceEvent() {
        this.dismissSuperEntranceEvent.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC45889Hzh
    public void dismissUploadPopEntranceEvent() {
        this.dismissUploadPopEntranceEvent.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC45889Hzh
    public int getBottomMargin() {
        if (this.recordDockBarAsyncLayoutEnabled) {
            return getRecordDockBarAsyncUIInflateScene().LLIIII;
        }
        return getRecordDockBarScene().LLFII;
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.cameraApiComponent$delegate.LIZ(this, $$delegatedProperties[5]);
    }

    public final HXE getExitRecordApi() {
        return (HXE) this.exitRecordApi$delegate.LIZ(this, $$delegatedProperties[11]);
    }

    @Override // X.InterfaceC45889Hzh
    public LiveEvent<C76800UCe> getNoBlockTouchEvent() {
        if (this.recordDockBarAsyncLayoutEnabled) {
            return getRecordDockBarAsyncUIInflateScene().LJLLILLLL;
        }
        return getRecordDockBarScene().LJLL;
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.planCUIApiComponent$delegate.LIZ(this, $$delegatedProperties[1]);
    }

    public final I3X getRecordControlApi() {
        return (I3X) this.recordControlApi$delegate.LIZ(this, $$delegatedProperties[2]);
    }

    /* renamed from: getRecordDockBarScene, reason: collision with other method in class */
    public final WM7 m20getRecordDockBarScene() {
        if (this.recordDockBarAsyncLayoutEnabled) {
            return getRecordDockBarAsyncUIInflateScene();
        }
        return getRecordDockBarScene();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.shortVideoContext$delegate.LIZ(this, $$delegatedProperties[4]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.stickerApiComponent$delegate.LIZ(this, $$delegatedProperties[3]);
    }

    public final void hideUploadAndEffect() {
        setUploadVisibility(8);
        setEffectContainerVisibility(8);
    }

    private final boolean currentTabIsAlbumTab() {
        if (C1DG.LJIIIIZZ()) {
            return false;
        }
        return ((InterfaceC45979I2t) getDiContainer().LJ(InterfaceC45979I2t.class, null)).getAlbumTabIsSelected();
    }

    private final boolean defaultSelectedAlbumTab() {
        if (C1DG.LJIIIIZZ()) {
            return false;
        }
        return ((InterfaceC45979I2t) getDiContainer().LJ(InterfaceC45979I2t.class, null)).getAlbumTabIsDefaultSelected();
    }

    @Override // X.InterfaceC45889Hzh
    public void dismissLivePopupEvent() {
        ((InterfaceC45979I2t) getDiContainer().LJ(InterfaceC45979I2t.class, null)).hidePopupForLiveTab();
    }

    public final boolean isDuetGreenScreenMode() {
        return getShortVideoContext().isDuetGreenSrceen;
    }

    public final boolean isDuetUploadMode() {
        if (getShortVideoContext().LJJJI() && C43710HDm.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC45889Hzh
    public void manualClickUploadButton() {
        Integer num;
        InterfaceC45932I0y recordQaStickerApi;
        InterfaceC82062WIo toolbarApi = getToolbarApi();
        if (toolbarApi != null) {
            toolbarApi.Js(false);
        }
        this.clickAlbumIconTime = System.currentTimeMillis();
        RecordPageOptionalConfig recordPageOptionalConfig = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            num = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        } else {
            num = null;
        }
        C44108HSu.LIZIZ(num, HRG.START);
        if (getShortVideoContext().qaStruct != null && (recordQaStickerApi = getRecordQaStickerApi()) != null) {
            recordQaStickerApi.jg();
        }
        C6UV infiniStickerApi = getInfiniStickerApi();
        if (infiniStickerApi != null) {
            infiniStickerApi.yc();
        }
        if (C46125I8j.LIZIZ() && !getFromExteriorRecordScene()) {
            openAlbum();
        } else {
            HVR.LJ(getActivity(), new I0D(this), null, new AqS157S0100000_7(this, 375), new AqS157S0100000_7(this, 376), TokenCert.Companion.with((String) C78605Ut7.LJIIJ("bpea-tools_request_storage_permission_manual_click_upload_target33", "bpea-tools_request_storage_permission_manual_click_upload")), 4);
        }
    }

    public final boolean needHideUploadAndEffect() {
        if (getShortVideoContext().LJJIIJZLJL() || V16.LJJJJZ(getShortVideoContext())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().KE(this);
        setupForEditEffect();
        if (this.recordDockBarAsyncLayoutEnabled) {
            getRecordDockBarAsyncUIInflateScene().LJLLL.LIZLLL(this, new AObjectS86S0100000_7(this, 185));
            this.parentScene.add(this.layoutResId, getRecordDockBarAsyncUIInflateScene(), "RecordDockBarScene");
        } else {
            this.parentScene.add(this.layoutResId, getRecordDockBarScene(), "RecordDockBarScene");
            registerObservers();
        }
    }

    @Override // X.InterfaceC45889Hzh
    public void openAlbum() {
        if (!getFromExteriorRecordScene()) {
            CommerceToolsMissionService.LJIIJ().LJII(getActivity(), getShortVideoContext());
        }
        G8G.LIZ.start(OpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
        C60903NvH.LJIIJJI().LJIILIIL().updateCurrentScene("album_panel_show", true);
        getShortVideoContext().uploadMethod = "click_button";
        getShortVideoContext().enterAlbumMethod = "click_button";
        pauseShootPageAndToUploadActivity(true);
        if (!currentTabIsAlbumTab()) {
            HYT hyt = C46002I3q.LLI;
            ActivityC45651qj activity = getActivity();
            ShortVideoContext shortVideoContext = getShortVideoContext();
            C82622Wbi diContainer = getDiContainer();
            EditEffectAnchorManager editEffectAnchorManager = this.editEffectAnchorManager;
            hyt.getClass();
            HYT.LIZ(activity, shortVideoContext, diContainer, editEffectAnchorManager);
        }
    }

    public final void openCameraByAlbumClosed() {
        getCameraApiComponent().jL().LIZIZ(I0E.RECORD_LOCAL_MEDIA_SCENE, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_BY_ALBUM_CLOSE, null));
    }

    @Override // X.InterfaceC45889Hzh
    public C0IB<Boolean> getAlbumPageVisibilityState() {
        return this.albumPageVisibilityState;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC45889Hzh getApiComponent() {
        return this.apiComponent;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.diContainer;
    }

    private final C46002I3q getRecordDockBarScene() {
        return (C46002I3q) this.recordDockBarScene$delegate.getValue();
    }

    public final void pauseShootPageAndToUploadActivity(boolean z) {
        Effect effect;
        C165626ek LIZIZ;
        I0N stickerApiComponent;
        InterfaceC46236ICq Sc0;
        TEZ LLLLL;
        I3Q.LIZ(I3P.UPLOAD);
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (LLLLL = stickerApiComponent2.LLLLL()) != null) {
            effect = LLLLL.LLJJIJIIJIL();
        } else {
            effect = null;
        }
        if (V3N.LJJI(effect)) {
            I0N stickerApiComponent3 = getStickerApiComponent();
            if (stickerApiComponent3 != null && stickerApiComponent3.Q30()) {
                I0N stickerApiComponent4 = getStickerApiComponent();
                if (stickerApiComponent4 != null) {
                    stickerApiComponent4.cp();
                }
            } else {
                getCameraApiComponent().e8().LLZ();
            }
        } else {
            I8E i8e = (I8E) getDiContainer().LJIIIIZZ(null, I8E.class);
            if (i8e != null) {
                i8e.Ps0(null);
            }
        }
        getCameraApiComponent().tn0(new I0K(this, z));
        if (getShortVideoContext().cameraComponentModel.curBackgroundVideo != null && (stickerApiComponent = getStickerApiComponent()) != null && (Sc0 = stickerApiComponent.Sc0()) != null) {
            Sc0.LJI();
        }
        if (z && !C1DG.LJIIIIZZ()) {
            LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), this.parentScene);
            JediViewModel LIZ = LIZIZ.LIZ(ChooseMediaViewModel.class);
            o.LJIIIIZZ(LIZ, "of(parentScene).get(Choo…diaViewModel::class.java)");
            ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) LIZ;
            chooseMediaViewModel.Iv0(this, new TBT() { // from class: X.I06
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getOpeningChooseMediaPageState();
                }
            }, new C73165SnZ(), new AqS173S0100000_7(this, 191));
            chooseMediaViewModel.Iv0(this, new TBT() { // from class: X.I07
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getClosingChooseMediaPageState();
                }
            }, new C73165SnZ(), new AqS138S0200000_7(new C34K(), this, 46));
            chooseMediaViewModel.Iv0(this, new TBT() { // from class: X.I08
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getNotifyCloseRecord();
                }
            }, new C73165SnZ(), new AqS173S0100000_7(this, 192));
            chooseMediaViewModel.LJLLLL.LIZLLL(this, new AObjectS86S0100000_7(this, 186));
        }
    }

    @Override // X.InterfaceC45889Hzh
    public void setEffectContainerVisibility(int i) {
        InterfaceC82129WLd interfaceC82129WLd;
        if (i == 0 && (interfaceC82129WLd = (InterfaceC82129WLd) findReadyComponent(this, InterfaceC82129WLd.class)) != null && interfaceC82129WLd.AO()) {
            return;
        }
        if (getHideEffectEntrance()) {
            Integer LIZ = this.effectContainerVisibility.LIZ();
            if (LIZ == null || LIZ.intValue() != 8) {
                this.effectContainerVisibility.LJI(8);
                return;
            }
            return;
        }
        this.effectContainerVisibility.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC45889Hzh
    public void setNeedNoTouchListener(boolean z) {
        this.needNoTouchListener.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC45889Hzh
    public void setUploadStartAction(InterfaceC88472Yns<? super View, C76800UCe> action) {
        o.LJIIIZ(action, "action");
        C46002I3q recordDockBarScene = getRecordDockBarScene();
        recordDockBarScene.getClass();
        View view = recordDockBarScene.mView;
        o.LJIIIIZZ(view, "view");
        action.invoke(view);
    }

    @Override // X.InterfaceC45889Hzh
    public void setUploadVisibility(int i) {
        if (getHideUploadEntrance()) {
            Integer LIZ = this.uploadVisibility.LIZ();
            if (LIZ == null || LIZ.intValue() != 8) {
                this.uploadVisibility.LJI(8);
                return;
            }
            return;
        }
        this.uploadVisibility.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC45889Hzh
    public void showDockBar(boolean z) {
        if (needHideUploadAndEffect()) {
            hideUploadAndEffect();
            return;
        }
        int i = 0;
        if (z) {
            if (isDuetUploadMode() && isDuetGreenScreenMode()) {
                setUploadVisibility(8);
            } else if (z) {
                if (isDuetUploadMode() && getShortVideoContext().LJIIIIZZ() <= 0) {
                    setUploadVisibility(0);
                } else if (getShortVideoContext().LJIIIIZZ() > 0 || getShortVideoContext().isDuetMode || getShortVideoContext().LJJJI() || getShortVideoContext().cameraComponentModel.isRetakeMode || getShortVideoContext().LJJIJIIJI()) {
                    setUploadVisibility(8);
                } else {
                    setUploadVisibility(0);
                }
            }
            setEffectContainerVisibility(i);
        }
        setUploadVisibility(8);
        i = 4;
        setEffectContainerVisibility(i);
    }

    public final void toUploadActivity(boolean z) {
        HRM.LIZJ(HRM.LIZ, m20getRecordDockBarScene(), getShortVideoContext(), z, this.clickAlbumIconTime, currentTabIsAlbumTab(), defaultSelectedAlbumTab(), null, 64);
    }

    public I0F(WMH parentScene, C82622Wbi diContainer) {
        boolean z;
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.parentScene = parentScene;
        this.diContainer = diContainer;
        this.activity$delegate = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.planCUIApiComponent$delegate = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.recordControlApi$delegate = UCI.LJI(getDiContainer(), I3X.class, null);
        this.stickerApiComponent$delegate = UCI.LJII(getDiContainer(), I0N.class, null);
        this.shortVideoContext$delegate = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.cameraApiComponent$delegate = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.toolbarApi$delegate = UCI.LJII(getDiContainer(), InterfaceC82062WIo.class, null);
        this.recordQaStickerApi$delegate = UCI.LJII(getDiContainer(), InterfaceC45932I0y.class, null);
        this.bottomTabApiComponent$delegate = UCI.LJII(getDiContainer(), InterfaceC45979I2t.class, null);
        this.recordPermissionApiComponent$delegate = UCI.LJII(getDiContainer(), I8W.class, null);
        this.infiniStickerApi$delegate = UCI.LJII(getDiContainer(), C6UV.class, null);
        this.exitRecordApi$delegate = UCI.LJII(getDiContainer(), HXE.class, null);
        this.recordAdapterApi$delegate = UCI.LJI(getDiContainer(), WLB.class, null);
        this.apiComponent = this;
        this.effectContainerVisibility = new C40871j1<>(8);
        this.dismissSuperEntranceEvent = new C29901Fi<>();
        this.dismissUploadPopEntranceEvent = new C29901Fi<>();
        this.uploadVisibility = new C40871j1<>(8);
        this.needNoTouchListener = new C29901Fi<>();
        this.clickAlbumIconTime = -1L;
        this.layoutResId = R.id.iri;
        this.fromExteriorRecordScene$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 372));
        this.hideEffectEntrance$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 373));
        JediViewModel LIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(parentScene), parentScene).LIZ(ChooseMediaViewModel.class);
        o.LJIIIIZZ(LIZ, "of(parentScene).get(Choo…diaViewModel::class.java)");
        this.chooseMediaViewModel = (ChooseMediaViewModel) LIZ;
        this.hideUploadEntrance$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 374));
        if (C00F.LIZ(31744, 0, "creative_tools_record_dock_bar_async_layout_inflater_scene_enabled", true) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.recordDockBarAsyncLayoutEnabled = z;
        this.recordDockBarScene$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 378));
        this.recordDockBarAsyncUIInflateScene$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 377));
        this.albumPageVisibilityState = new C40871j1(Boolean.FALSE);
        String string = C60903NvH.LJ.getString(R.string.pwh);
        o.LJIIIIZZ(string, "getApplication().getStri…ing.record_mode_shot_tag)");
        String string2 = C60903NvH.LJ.getString(R.string.pw7);
        o.LJIIIIZZ(string2, "getApplication().getStri…cord_mode_lightening_tag)");
        this.cameraTab = C47261Igj.LJJIJIIJI(C44269HYz.LIZ, C44269HYz.LIZJ, C44269HYz.LIZIZ, C44269HYz.LIZLLL, "RecordCombinePhoto", "RecordLighteningVideo", string, string2);
    }

    @Override // X.InterfaceC45889Hzh
    public void setEffectContainerAnimation(String type, float f, boolean z) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        o.LJIIIZ(type, "type");
        if (this.recordDockBarAsyncLayoutEnabled) {
            C46003I3r recordDockBarAsyncUIInflateScene = getRecordDockBarAsyncUIInflateScene();
            recordDockBarAsyncUIInflateScene.getClass();
            if (recordDockBarAsyncUIInflateScene.getSceneContext() == null) {
                return;
            }
            float LIZ = C170576mj.LIZ(recordDockBarAsyncUIInflateScene.getSceneContext(), f);
            if (z) {
                if (o.LJ(type, "translationX")) {
                    ViewGroup viewGroup = recordDockBarAsyncUIInflateScene.LL;
                    if (viewGroup != null) {
                        ofFloat2 = ObjectAnimator.ofFloat(viewGroup, "translationX", 0.0f, LIZ);
                        C46026I4o c46026I4o = recordDockBarAsyncUIInflateScene.LLFZ;
                        if (c46026I4o != null) {
                            c46026I4o.setTranslationX(LIZ);
                        } else {
                            o.LJIJI("uploadButton");
                            throw null;
                        }
                    } else {
                        o.LJIJI("effectContainer");
                        throw null;
                    }
                } else {
                    if (!o.LJ(type, "alpha")) {
                        return;
                    }
                    ViewGroup viewGroup2 = recordDockBarAsyncUIInflateScene.LL;
                    if (viewGroup2 != null) {
                        ofFloat2 = ObjectAnimator.ofFloat(viewGroup2, "alpha", 1.0f, LIZ);
                    } else {
                        o.LJIJI("effectContainer");
                        throw null;
                    }
                }
                if (ofFloat2 == null) {
                    return;
                }
                ofFloat2.setDuration(300L);
                ofFloat2.start();
                return;
            }
            if (o.LJ(type, "translationX")) {
                ViewGroup viewGroup3 = recordDockBarAsyncUIInflateScene.LL;
                if (viewGroup3 != null) {
                    viewGroup3.setTranslationX(LIZ);
                    return;
                } else {
                    o.LJIJI("effectContainer");
                    throw null;
                }
            }
            if (!o.LJ(type, "alpha")) {
                return;
            }
            ViewGroup viewGroup4 = recordDockBarAsyncUIInflateScene.LL;
            if (viewGroup4 != null) {
                viewGroup4.setAlpha(f);
                return;
            } else {
                o.LJIJI("effectContainer");
                throw null;
            }
        }
        C46002I3q recordDockBarScene = getRecordDockBarScene();
        recordDockBarScene.getClass();
        if (recordDockBarScene.getSceneContext() == null) {
            return;
        }
        float LIZ2 = C170576mj.LIZ(recordDockBarScene.getSceneContext(), f);
        if (z) {
            if (o.LJ(type, "translationX")) {
                ViewGroup viewGroup5 = recordDockBarScene.LJLLLLLL;
                if (viewGroup5 != null) {
                    ofFloat = ObjectAnimator.ofFloat(viewGroup5, "translationX", 0.0f, LIZ2);
                    C46026I4o c46026I4o2 = recordDockBarScene.LLD;
                    if (c46026I4o2 != null) {
                        c46026I4o2.setTranslationX(LIZ2);
                    } else {
                        o.LJIJI("uploadButton");
                        throw null;
                    }
                } else {
                    o.LJIJI("effectContainer");
                    throw null;
                }
            } else {
                if (!o.LJ(type, "alpha")) {
                    return;
                }
                ViewGroup viewGroup6 = recordDockBarScene.LJLLLLLL;
                if (viewGroup6 != null) {
                    ofFloat = ObjectAnimator.ofFloat(viewGroup6, "alpha", 1.0f, LIZ2);
                } else {
                    o.LJIJI("effectContainer");
                    throw null;
                }
            }
            if (ofFloat == null) {
                return;
            }
            ofFloat.setDuration(300L);
            ofFloat.start();
            return;
        }
        if (o.LJ(type, "translationX")) {
            ViewGroup viewGroup7 = recordDockBarScene.LJLLLLLL;
            if (viewGroup7 != null) {
                viewGroup7.setTranslationX(LIZ2);
                return;
            } else {
                o.LJIJI("effectContainer");
                throw null;
            }
        }
        if (!o.LJ(type, "alpha")) {
            return;
        }
        ViewGroup viewGroup8 = recordDockBarScene.LJLLLLLL;
        if (viewGroup8 != null) {
            viewGroup8.setAlpha(f);
        } else {
            o.LJIJI("effectContainer");
            throw null;
        }
    }

    @Override // X.InterfaceC45889Hzh
    public void setUploadAnimation(String type, float f, boolean z) {
        o.LJIIIZ(type, "type");
        if (this.recordDockBarAsyncLayoutEnabled) {
            C46003I3r recordDockBarAsyncUIInflateScene = getRecordDockBarAsyncUIInflateScene();
            recordDockBarAsyncUIInflateScene.getClass();
            if (recordDockBarAsyncUIInflateScene.getSceneContext() == null) {
                return;
            }
            float LIZ = C170576mj.LIZ(recordDockBarAsyncUIInflateScene.getSceneContext(), f);
            if (z) {
                C46026I4o c46026I4o = recordDockBarAsyncUIInflateScene.LLFZ;
                if (c46026I4o != null) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c46026I4o, type, 0.0f, LIZ);
                    ofFloat.setDuration(300L);
                    ofFloat.start();
                    return;
                }
                o.LJIJI("uploadButton");
                throw null;
            }
            if (o.LJ(type, "translationX")) {
                C46026I4o c46026I4o2 = recordDockBarAsyncUIInflateScene.LLFZ;
                if (c46026I4o2 != null) {
                    c46026I4o2.setTranslationX(LIZ);
                    return;
                } else {
                    o.LJIJI("uploadButton");
                    throw null;
                }
            }
            if (!o.LJ(type, "alpha")) {
                return;
            }
            C46026I4o c46026I4o3 = recordDockBarAsyncUIInflateScene.LLFZ;
            if (c46026I4o3 != null) {
                c46026I4o3.setAlpha(f);
                return;
            } else {
                o.LJIJI("uploadButton");
                throw null;
            }
        }
        C46002I3q recordDockBarScene = getRecordDockBarScene();
        recordDockBarScene.getClass();
        if (recordDockBarScene.getSceneContext() == null) {
            return;
        }
        float LIZ2 = C170576mj.LIZ(recordDockBarScene.getSceneContext(), f);
        if (z) {
            C46026I4o c46026I4o4 = recordDockBarScene.LLD;
            if (c46026I4o4 != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c46026I4o4, type, 0.0f, LIZ2);
                ofFloat2.setDuration(300L);
                ofFloat2.start();
                return;
            }
            o.LJIJI("uploadButton");
            throw null;
        }
        if (o.LJ(type, "translationX")) {
            C46026I4o c46026I4o5 = recordDockBarScene.LLD;
            if (c46026I4o5 != null) {
                c46026I4o5.setTranslationX(LIZ2);
                return;
            } else {
                o.LJIJI("uploadButton");
                throw null;
            }
        }
        if (!o.LJ(type, "alpha")) {
            return;
        }
        C46026I4o c46026I4o6 = recordDockBarScene.LLD;
        if (c46026I4o6 != null) {
            c46026I4o6.setAlpha(f);
        } else {
            o.LJIJI("uploadButton");
            throw null;
        }
    }

    public static /* synthetic */ void pauseShootPageAndToUploadActivity$default(I0F i0f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            i0f.pauseShootPageAndToUploadActivity(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pauseShootPageAndToUploadActivity");
    }

    public static /* synthetic */ void toUploadActivity$default(I0F i0f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            i0f.toUploadActivity(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toUploadActivity");
    }
}
