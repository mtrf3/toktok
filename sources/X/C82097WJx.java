package X;

import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS38S0001000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WJx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82097WJx extends AbstractC48231ut<WKZ, C82102WKc, C82105WKf, C82091WJr> implements WKZ, InterfaceC135635Tz {
    public static final WKS LLIIIJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIL;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final C148425s6 LJLLILLLL;
    public final InterfaceC88472Yns<LifecycleOwner, C76800UCe> LJLLJ;
    public final InterfaceC65784Pro<C82102WKc> LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC45999I3n LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final WKP LLFF;
    public boolean LLFFF;
    public final WJA LLFII;
    public C82102WKc LLFZ;
    public final InterfaceC65784Pro<C82105WKf> LLI;
    public final InterfaceC65784Pro<C82091WJr> LLIFFJFJJ;
    public final LiveData<Boolean> LLII;
    public final WKZ LLIIII;
    public final int LLIIIILZ;

    static {
        TBT tbt = new TBT(C82097WJx.class, "tiktokCameraApiComponent", "getTiktokCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIL = new InterfaceC74236TBo[]{tbt, new TBT(C82097WJx.class, "recordModeLogicComponent", "getRecordModeLogicComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeLogicComponent;", 0), new TBT(C82097WJx.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new TBT(C82097WJx.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(C82097WJx.class, "nowsSwitcherApi", "getNowsSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0), new TBT(C82097WJx.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0), new TBT(C82097WJx.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(C82097WJx.class, "activity", "getActivity()Landroid/app/Activity;", 0)};
        LLIIIJ = new WKS();
    }

    private final Activity LLF() {
        return (Activity) this.LLF.LIZ(this, LLIIIL[7]);
    }

    private final C45313HqP LLIFFJFJJ() {
        return (C45313HqP) this.LJLLLLLL.LIZ(this, LLIIIL[1]);
    }

    private final WRQ LLIIIL() {
        return (WRQ) this.LJLLLL.LIZ(this, LLIIIL[0]);
    }

    private final void LLIILZL() {
        C0IB<C08630Vn<Boolean>> fs;
        this.LJZ.Et().LIZIZ(this, new AObjectS89S0100000_14(this, 167));
        I8W recordPermissionApi = getRecordPermissionApi();
        if (recordPermissionApi != null && (fs = recordPermissionApi.fs()) != null) {
            fs.LIZIZ(this, new AObjectS89S0100000_14(this, 168));
        }
        this.LJZ.Ie().LIZIZ(this, new AObjectS89S0100000_14(this, 169));
        getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 170));
        C82622Wbi diContainer = getDiContainer();
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(InterfaceC45925I0r.class, new AqS180S0100000_14(this, 189));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, InterfaceC45925I0r.class);
            if (c0i6 != null) {
                ((InterfaceC45925I0r) c0i6).Bi().observe(this, new AObserverS82S0100000_14(this, 36));
            }
        }
        getRecordControlApi().aa0().LIZLLL(this, new AObjectS89S0100000_14(this, 171));
        LLIFFJFJJ().LJLJL.LIZLLL(this, new AObjectS89S0100000_14(this, 172));
        this.LJZ.Na0().LIZIZ(this, new AObjectS89S0100000_14(this, 173));
        this.LJZ.RH().LIZIZ(this, new AObjectS89S0100000_14(this, 174));
        getCameraApiComponent().oX().LIZLLL(this, new AObjectS89S0100000_14(this, 165));
        LLIIIL().Bk().LIZLLL(this, new AObjectS89S0100000_14(this, 166));
    }

    private final boolean LLIIZ() {
        WI0 LIZJ;
        WI1 LJFF = this.LLFII.LJFF(C6MP.MICROPHONE);
        if (LJFF != null && (LIZJ = LJFF.LIZJ()) != null) {
            return LIZJ.LJLJI;
        }
        return true;
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLZ.LIZ(this, LLIIIL[2]);
    }

    private final InterfaceC82325WSr getNowsSwitcherApi() {
        return (InterfaceC82325WSr) this.LJZL.LIZ(this, LLIIIL[4]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LLD.LIZ(this, LLIIIL[6]);
    }

    public final int LLFFF() {
        return C81184Vtc.LJFF(LLF()) + SFS.LJI(24.0d);
    }

    public final I8W getRecordPermissionApi() {
        return (I8W) this.LL.LIZ(this, LLIIIL[5]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJZI.LIZ(this, LLIIIL[3]);
    }

    public final void LJLZ() {
        if (C53210KuU.LIZ() && !C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
            WJA wja = this.LLFII;
            C6MP c6mp = C6MP.MICROPHONE;
            WI1 LJFF = wja.LJFF(c6mp);
            if (LJFF != null) {
                LJFF.LJFF = true;
            }
            LJZI(c6mp, false);
        }
        new SafeHandler(this).post(new ARunnableS50S0100000_14(this, 102));
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        View view;
        super.onCreate();
        this.LJLLJ.invoke(this);
        this.LJLLILLLL.LIZIZ.LIZ();
        ((ArrayList) HKZ.LIZ).clear();
        show();
        if (L2L.LIZIZ(getDiContainer())) {
            Float LIZ = this.LJZ.Ht().LIZ();
            o.LJIIIIZZ(LIZ, "planCUIApiComponent.delayUIAlpha.value");
            if (LIZ.floatValue() < 1.0f) {
                C82102WKc c82102WKc = this.LLFZ;
                if (c82102WKc != null && (view = c82102WKc.mView) != null) {
                    view.setLayerType(2, null);
                }
                this.LJZ.gC().LIZLLL(this, new AObjectS89S0100000_14(this, 175));
            }
            this.LJZ.Ht().LIZIZ(this, new AObjectS89S0100000_14(this, 176));
        }
        LLIILZL();
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        if (C78605Ut7.LJFF("android.permission.RECORD_AUDIO") && C53210KuU.LIZ()) {
            WJA wja = this.LLFII;
            C6MP c6mp = C6MP.MICROPHONE;
            WI1 LJFF = wja.LJFF(c6mp);
            int i = 1;
            if (LJFF != null && LJFF.LJIIIZ() && !LLIIZ()) {
                if (V16.LJJLIIIJILLIZJL(getShortVideoContext())) {
                    if (getShortVideoContext().cameraComponentModel.isMuted) {
                        i = 2;
                    }
                    C05L.LIZJ(i, getCameraApiComponent());
                } else {
                    WI1 LJFF2 = this.LLFII.LJFF(c6mp);
                    if (LJFF2 == null) {
                        return;
                    }
                    LJFF2.LIZ(new WI0(LJFF2.LIZJ().LJLIL, LJFF2.LIZJ().LJLILLLLZI, true));
                    this.LLFII.LJIIJJI();
                }
            }
        }
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        if (getRecordPermissionApi() == null) {
            super.show();
            return;
        }
        InterfaceC82325WSr nowsSwitcherApi = getNowsSwitcherApi();
        if (nowsSwitcherApi != null && nowsSwitcherApi.j40()) {
            return;
        }
        super.show();
    }

    @Override // X.InterfaceC82118WKs
    public LiveData<Boolean> JP() {
        return this.LLII;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C82105WKf> LJJLIIIJJI() {
        return this.LLI;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C82091WJr> LJJLIIIJJIZ() {
        return this.LLIFFJFJJ;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C82102WKc> LJLJJLL() {
        return this.LJLLL;
    }

    @Override // X.AbstractC41331jl, X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        return this.LLIIII;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC82118WKs
    public int getPanelType() {
        return this.LLIIIILZ;
    }

    @Override // X.InterfaceC82118WKs
    public void Ep0(boolean z) {
        if (z) {
            LJJZZI(WKM.LJLIL);
        } else {
            LJJZZI(WKN.LJLIL);
        }
    }

    public final void M0(int i) {
        LJJZZI(new AqS38S0001000_14(i, 9));
    }

    private final void LJZI(C6MP c6mp, boolean z) {
        WI1 LJFF = this.LLFII.LJFF(c6mp);
        if (LJFF != null) {
            LJFF.LIZ(new WI0(LJFF.LIZJ().LJLIL, LJFF.LIZJ().LJLILLLLZI, z));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C82097WJx(WMH parentScene, C82622Wbi diContainer, C148425s6 toolbarManager, InterfaceC88472Yns<? super LifecycleOwner, C76800UCe> initAssem) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(toolbarManager, "toolbarManager");
        o.LJIIIZ(initAssem, "initAssem");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = toolbarManager;
        this.LJLLJ = initAssem;
        this.LJLLL = new AqS164S0100000_14(this, 187);
        this.LJLLLL = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), C45313HqP.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJZ = (InterfaceC45999I3n) getDiContainer().LJ(InterfaceC45999I3n.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJZL = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LL = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LLD = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LLF = UCI.LJI(getDiContainer(), Activity.class, null);
        WKP wkp = new WKP(new C82040WHs(getShortVideoContext()));
        this.LLFF = wkp;
        getShortVideoContext();
        this.LLFFF = wkp.LIZ() == 1;
        this.LLFII = toolbarManager.LIZ;
        this.LLI = new AqS164S0100000_14(this, 185);
        this.LLIFFJFJJ = new AqS164S0100000_14(this, 186);
        this.LLII = new MutableLiveData();
        this.LLIIII = this;
        this.LLIIIILZ = 4;
    }
}
