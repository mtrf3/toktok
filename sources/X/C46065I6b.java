package X;

import Y.AObjectS86S0100000_7;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.runtime.VEMem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I6b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46065I6b extends AbstractC29891Fh<HXE> implements InterfaceC143795kd, HXE, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final HXE LJLJI;
    public final C40871j1<Drawable> LJLJJI;
    public final C40871j1<OSZ<Float, Float>> LJLJJL;
    public final C29901Fi<C76800UCe> LJLJJLL;
    public final C29901Fi<C76800UCe> LJLJL;
    public final C29901Fi<C76800UCe> LJLJLJ;
    public final C29901Fi<C76800UCe> LJLJLLL;
    public final C29901Fi<C76800UCe> LJLL;
    public final ActivityC45651qj LJLLI;
    public final ShortVideoContext LJLLILLLL;
    public final InterfaceC82086WJm LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final C5H3 LLF;
    public final H9R LLFF;
    public long LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;
    public final C140815fp LLI;

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
        TBT tbt = new TBT(C46065I6b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C46065I6b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46065I6b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46065I6b.class, "nowsSwitcherApi", "getNowsSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(C46065I6b.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46065I6b.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46065I6b.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46065I6b.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46065I6b.class, "recordControlProgressComponent", "getRecordControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0, c65351Pkp)};
    }

    private final I37 LJJLI() {
        return (I37) this.LL.LIZ(this, LLIFFJFJJ[7]);
    }

    private final C46112I7w LJJLIIIIJ() {
        return (C46112I7w) this.LLFII.getValue();
    }

    private final InterfaceC45995I3j LJJLIIIJILLIZJL() {
        return (InterfaceC45995I3j) this.LLD.LIZ(this, LLIFFJFJJ[8]);
    }

    private final C46102I7m LJJLIIIJJI() {
        return (C46102I7m) this.LLFZ.getValue();
    }

    private final WM7 LJJLIIIJLLLLLLLZ() {
        if (C00F.LIZ(31744, 0, "creative_tools_record_exit_async_layout_inflater_scene_enabled", true) != 0) {
            return LJJLIIIJJI();
        }
        return LJJLIIIIJ();
    }

    private final void LJJLJ() {
        this.LJLLILLLL.usedEffectFromDiscoveryPage = false;
        this.LJLJL.LJII(C76800UCe.LIZ);
    }

    private final void LJJZZI() {
        if (this.LJLLILLLL.qaStickerModel != null) {
            C145995oB c145995oB = new C145995oB();
            QAStickerModel qAStickerModel = this.LJLLILLLL.qaStickerModel;
            o.LJIIIIZZ(qAStickerModel, "shortVideoContext.qaStickerModel");
            c145995oB.LJ("is_qa_sticker", o.LJ(qAStickerModel.getBaseStickerModel().getType().toString(), "question_and_answer"));
            c145995oB.LIZJ(Float.valueOf(this.LJLLILLLL.qaStickerModel.getBaseStickerModel().getTranslateY() + this.LJLLILLLL.qaStickerModel.getBaseStickerModel().getTop()), "sticker_Y");
            c145995oB.LIZJ(Float.valueOf(this.LJLLILLLL.qaStickerModel.getBaseStickerModel().getTranslateX() + this.LJLLILLLL.qaStickerModel.getBaseStickerModel().getLeft()), "sticker_X");
            c145995oB.LIZJ(Float.valueOf(this.LJLLILLLL.qaStickerModel.getBaseStickerModel().getRotation()), "sticker_angle");
            c145995oB.LIZIZ((System.currentTimeMillis() - H8W.LIZIZ) / 1000, "qa_adjust_duration");
            QAStickerModel qAStickerModel2 = this.LJLLILLLL.qaStickerModel;
            o.LJIIIIZZ(qAStickerModel2, "shortVideoContext.qaStickerModel");
            c145995oB.LIZJ(Float.valueOf(qAStickerModel2.getBaseStickerModel().getScale()), "sticker_size");
            FMX.LJIIL("exit_shoot_page", c145995oB.LIZ);
        }
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LJZI.LIZ(this, LLIFFJFJJ[5]);
    }

    private final WRP getFilterApiComponent() {
        return (WRP) this.LJZL.LIZ(this, LLIFFJFJJ[6]);
    }

    private final InterfaceC82325WSr getNowsSwitcherApi() {
        return (InterfaceC82325WSr) this.LJLZ.LIZ(this, LLIFFJFJJ[3]);
    }

    private final I8W getRecordPermissionApi() {
        return (I8W) this.LJZ.LIZ(this, LLIFFJFJJ[4]);
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.LJLLLLLL.LIZ(this, LLIFFJFJJ[2]);
    }

    public final InterfaceC46081I6r LJJLIIIJJIZ() {
        return (InterfaceC46081I6r) this.LLF.getValue();
    }

    public final void LJJZZIII() {
        DraftInfoModel draftInfoModel = this.LJLLILLLL.creativeModel.draftInfoModel;
        draftInfoModel.getClass();
        draftInfoModel.saveDraftScene = "clickPopupFromRecord";
        ShortVideoContext shortVideoContext = this.LJLLILLLL;
        shortVideoContext.qaStruct = null;
        shortVideoContext.commentVideoModel = null;
        if (shortVideoContext.duetFromUser == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DuetUser -> current is draft: ");
            LIZ.append(this.LJLLILLLL.creativeModel.draftInfoModel.isDraft);
            H7B.LIZ(X1D.LIZIZ(LIZ));
            H7B.LIZ("DuetUser -> RecordExitComponent -> realSaveDraft -> duetFromUser is null");
            C78983UzD.LJIILL("DuetUser -> RecordExitComponent -> realSaveDraft -> duetFromUser is null");
        }
        this.LJLL.LJII(C76800UCe.LIZ);
        InterfaceC82086WJm interfaceC82086WJm = this.LJLLJ;
        if (interfaceC82086WJm instanceof WRQ) {
            ((WRQ) interfaceC82086WJm).e20().LIZIZ.getClass();
            C43870HJq c43870HJq = new C43870HJq();
            c43870HJq.LIZ = this.LJLLILLLL.cameraComponentModel.mWorkspace.E().getPath();
            c43870HJq.LIZIZ = this.LJLLILLLL.cameraComponentModel.mWorkspace.LJJJJLI().getPath();
            c43870HJq.LJ = this.LJLLJ.e8().getMediaController();
            c43870HJq.LIZLLL = this.LJLLILLLL.enableSingleSegmentConcatUseCopy;
            c43870HJq.LJI = !r1.LJJIJIIJI();
            c43870HJq.LJII = VEMem.getInstance().inLowMemMode();
            c43870HJq.LJFF = C19N.LJ("pre_release_gpu_resource", false);
            c43870HJq.LIZJ = HMI.LIZ(this.LJLLILLLL);
            c43870HJq.LIZ(new C43637HAr(this));
        }
    }

    @Override // X.HXE
    public void LJLIIIL() {
        if (!this.LJLIL.isShowing(LJJLIIIJLLLLLLLZ())) {
            qm("system_back_button", System.currentTimeMillis());
        } else {
            this.LJLJJLL.LJII(C76800UCe.LIZ);
        }
    }

    public final void LJLIIL() {
        DraftInfoModel draftInfoModel = this.LJLLILLLL.creativeModel.draftInfoModel;
        draftInfoModel.getClass();
        draftInfoModel.saveDraftScene = "clickPopupFromRecord";
        if (!C44172HVg.LJIJ.isLogin()) {
            C76857UEj.LJFF(this.LJLLI, "video_shoot_page", new I7T(this));
        } else {
            LJJZZIII();
        }
    }

    public final void LJLJJLL() {
        ARI ari = new ARI(this.LJLLI);
        ari.LJI(R.string.r7e, new AqS173S0100000_7(this, 194));
        ari.LJIIIIZZ(R.string.e79, I7Q.LJLIL);
        C26227ARb LIZ = C3AW.LIZ(this.LJLLI);
        LIZ.LJ(R.string.r7g);
        LIZ.LIZ(R.string.r7f);
        LIZ.LJIIL = ari;
        LIZ.LJII = false;
        LIZ.LJI().LIZLLL();
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJLLLL.LIZ(this, LLIFFJFJJ[1]);
    }

    public final I3X getRecordControlApi() {
        return (I3X) this.LJLLL.LIZ(this, LLIFFJFJJ[0]);
    }

    public final void LJJLIIJ() {
        C165626ek LIZIZ;
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null) {
            C82398WVm.LJI(stickerApiComponent, null);
        }
        WRP filterApiComponent = getFilterApiComponent();
        if (filterApiComponent != null) {
            filterApiComponent.setFilterDisable(true, "build_in");
        }
        I37 LJJLI = LJJLI();
        if (LJJLI != null) {
            LJJLI.Ku(false);
        }
        this.LJLLJ.T6();
        this.LJLJLJ.LJII(C76800UCe.LIZ);
        this.LJLLJ.y90(EnumC82528WaC.NORMAL);
        HZ2.LIZ(getRecordControlApi(), false, 3);
        this.LJLLILLLL.isDuetMode = false;
        getBottomTabApiComponent().showAllTabsAndExitDuetMode();
        getBottomTabApiComponent().showBottomTab(true);
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null) {
            C82398WVm.LJI(stickerApiComponent2, null);
        }
        getBottomTabApiComponent().setCurrentTab("record_mode_duet", true, 0);
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), this.LJLIL);
        LIZIZ.LIZ(ChangeDuetLayoutViewModel.class).setState(C45917I0j.LJLIL);
        VERecorder LJ = this.LJLLJ.rX().LJ();
        LJ.LJII(new String[0], 0, new String[0]);
        LJ.LIZIZ.changeRecordMode(VERecordMode.DEFAULT);
        Bundle bundle = this.LJLLILLLL.nonDuetModeBundle;
        if (bundle != null) {
            bundle.putString("enter_from", "duet_mode_to_normal");
            InterfaceC41645GWb LIZ = HZV.LIZ();
            ActivityC45651qj activityC45651qj = this.LJLLI;
            Intent intent = new Intent();
            intent.putExtras(bundle);
            LIZ.LJIIIIZZ(activityC45651qj, intent);
        }
    }

    public final void LJJLJLI() {
        HXK Y60;
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (Y60 = stickerApiComponent.Y60()) != null) {
            Y60.LIZJ();
        }
        this.LJLLILLLL.LJJIZ(false);
        getPlanCUIApiComponent().kY(true, false);
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null) {
            C82398WVm.LJI(stickerApiComponent2, null);
        }
        C1FP.LIZLLL();
        HZ2.LIZ(getRecordControlApi(), false, 3);
        getPlanCUIApiComponent().pD();
    }

    @Override // X.HXE
    public void clear() {
        LJJLIIIJJIZ().LIZ();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        C0IB<Boolean> x80;
        super.onCreate();
        this.LJLIL.add(R.id.iri, LJJLIIIJLLLLLLLZ(), "RecordExitScene");
        this.LJLLJ.md0().LIZLLL(this, new AObjectS86S0100000_7(this, 199));
        I8W recordPermissionApi = getRecordPermissionApi();
        if (recordPermissionApi != null && (x80 = recordPermissionApi.x80()) != null) {
            x80.LIZIZ(this, new AObjectS86S0100000_7(this, 200));
        }
        getPlanCUIApiComponent().Et().LIZIZ(this, new AObjectS86S0100000_7(this, 201));
    }

    @Override // X.HXE
    public /* bridge */ /* synthetic */ LiveEvent Sg() {
        return this.LJLJL;
    }

    @Override // X.HXE
    public /* bridge */ /* synthetic */ LiveEvent YO() {
        return this.LJLJLJ;
    }

    @Override // X.HXE
    public /* bridge */ /* synthetic */ LiveEvent e2() {
        return this.LJLL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ HXE getApiComponent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // X.HXE
    public long mm() {
        return this.LLFFF;
    }

    @Override // X.HXE
    public /* bridge */ /* synthetic */ LiveEvent xo0() {
        return this.LJLJLLL;
    }

    private final void LJLJLJ(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1622990982) {
                if (hashCode != 1089339861) {
                    if (hashCode != 1670544073 || !str.equals("click_cross")) {
                        return;
                    }
                    C54154LNe.LJ("shoot_2_main", "click_back");
                    return;
                }
                if (!str.equals("slide_left")) {
                    return;
                }
                C54154LNe.LJ("shoot_2_main", "slide_back");
                return;
            }
            if (!str.equals("system_back_button")) {
                return;
            }
            C54154LNe.LJ("shoot_2_main", C54154LNe.LIZIZ(this.LJLLI));
        }
    }

    public final void LJJLL(String str) {
        H8V.LIZ(str, this.LJLLILLLL);
        H8W.LIZIZ = -1L;
        H8W.LIZJ = "";
        if (this.LJLLILLLL.isDuetMode) {
            C41015G7v.LIZ(System.currentTimeMillis(), "duet_mode_creation", "exit");
        } else if (TextUtils.equals(str, "duet_mode")) {
            C41015G7v.LIZ(System.currentTimeMillis(), "duet_mode_discover", "exit");
        }
        if (this.LJLLILLLL.qaStickerModel != null) {
            LJJZZI();
        }
    }

    public final void LJLJJL(boolean z) {
        boolean z2;
        C0IB<Boolean> x80;
        I8W recordPermissionApi = getRecordPermissionApi();
        boolean z3 = false;
        if (recordPermissionApi != null && (x80 = recordPermissionApi.x80()) != null) {
            z2 = o.LJ(x80.LIZ(), Boolean.FALSE);
        } else {
            z2 = false;
        }
        boolean z4 = !z2;
        InterfaceC82325WSr nowsSwitcherApi = getNowsSwitcherApi();
        if (nowsSwitcherApi != null && nowsSwitcherApi.j40()) {
            z3 = true;
        }
        WMH wmh = this.LJLIL;
        if ((z || this.LJLLILLLL.LJJIIJZLJL()) && z4 && !z3) {
            C79234V7u.LJJJ(wmh, "RecordExitScene");
        } else {
            C79234V7u.LJIL(wmh, "RecordExitScene");
        }
    }

    @Override // X.HXE
    public boolean Ol0(View view) {
        boolean z;
        boolean z2;
        o.LJIIIZ(view, "view");
        boolean z3 = false;
        if (this.LJLLILLLL.LJJIIJZLJL()) {
            return false;
        }
        InterfaceC45995I3j LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            z = LJJLIIIJILLIZJL.um0();
        } else {
            z = false;
        }
        if (z && !this.LJLLILLLL.LJJII()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LJLLILLLL.LJIIIIZZ() > 0) {
            z3 = true;
        }
        if (this.LJLLILLLL.LJJIJIIJI()) {
            if (!z3 && this.LJLLILLLL.cameraComponentModel.mRestoreType == 1) {
                LJJLIIIJJIZ().closeRecording();
                return true;
            }
            LJJLIIIJJIZ().LJI(view, z2, new AqS157S0100000_7(this, 383));
            return true;
        }
        if (!z3) {
            LJJLIIIJJIZ().closeRecording();
            return true;
        }
        LJJLIIIJJIZ().LIZIZ(view, z2, new AqS157S0100000_7(this, 384));
        return true;
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    @Override // X.HXE
    public void pY(long j) {
        this.LLFFF = j;
    }

    public C46065I6b(WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = this;
        this.LJLJJI = new C40871j1<>(null);
        this.LJLJJL = new C40871j1<>(null);
        this.LJLJJLL = new C29901Fi<>();
        this.LJLJL = new C29901Fi<>();
        this.LJLJLJ = new C29901Fi<>();
        this.LJLJLLL = new C29901Fi<>();
        this.LJLL = new C29901Fi<>();
        this.LJLLI = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LJLLILLLL = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        this.LJLLJ = (InterfaceC82086WJm) getDiContainer().LJ(InterfaceC82086WJm.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLLLLLL = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJLZ = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LJZ = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJZL = UCI.LJII(getDiContainer(), WRP.class, null);
        this.LL = UCI.LJII(getDiContainer(), I37.class, null);
        this.LLD = UCI.LJII(getDiContainer(), InterfaceC45995I3j.class, null);
        this.LLF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 386));
        this.LLFF = (H9R) getDiContainer().LJ(H9R.class, null);
        this.LLFFF = -1L;
        this.LLFII = C221108m2.LIZIZ(new AqS157S0100000_7(this, 380));
        this.LLFZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 385));
        this.LLI = new C140815fp();
    }

    @Override // X.HXE
    public void qm(String str, long j) {
        LJJLL(str);
        LJJLIIIJJIZ().closeRecording();
        G8A g8a = G8A.LIZIZ;
        if (g8a.LIZIZ() >= 3) {
            g8a.LIZ();
        }
    }

    @Override // X.HXE
    public void rT(String str, long j) {
        pY(j);
        LJLJLJ(str);
        ShortVideoContext shortVideoContext = this.LJLLILLLL;
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        if (cameraComponentModel.mRestoreType == 1 && !cameraComponentModel.isRetakeMode && !shortVideoContext.LJJIFFI()) {
            LJJLIIIJJIZ().LIZLLL(new AqS74S1100000_7(this, str, 4));
        } else if (this.LJLLILLLL.LJIIIIZZ() == 0) {
            ShortVideoContext shortVideoContext2 = this.LJLLILLLL;
            if (shortVideoContext2.usedEffectFromDiscoveryPage) {
                LJJLJ();
                return;
            }
            if (shortVideoContext2.LJJIIJZLJL()) {
                LJLJJLL();
                return;
            }
            ShortVideoContext shortVideoContext3 = this.LJLLILLLL;
            if (shortVideoContext3.isDuetMode) {
                LJJLL(str);
                LJJLIIJ();
                return;
            } else if (shortVideoContext3.LJJIJIIJI()) {
                LJJLIIIJJIZ().LJII(C46090I7a.LJLIL, new AqS74S1100000_7(this, str, 5), new AqS74S1100000_7(this, str, 6));
            } else {
                qm(str, j);
            }
        } else if (this.LJLLILLLL.LJJIJIIJI()) {
            LJJLIIIJJIZ().LIZJ(C46091I7b.LJLIL, new AqS74S1100000_7(this, str, 7), new AqS157S0100000_7(this, 382));
        } else {
            LJJLIIIJJIZ().LJFF(C46092I7c.LJLIL, new AqS74S1100000_7(this, str, 8), new AqS157S0100000_7(this, 381));
        }
        this.LJLJLLL.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
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
