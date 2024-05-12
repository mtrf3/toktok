package X;

import Y.AObjectS89S0100000_14;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WTv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82355WTv extends AbstractC48231ut<InterfaceC45932I0y, Object, H8B, C53421Kxt> implements InterfaceC45932I0y, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final QaStruct LJLLILLLL;
    public final InterfaceC45932I0y LJLLJ;
    public final InterfaceC65784Pro<H8B> LJLLL;
    public final InterfaceC65784Pro<C53421Kxt> LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;

    @Override // X.InterfaceC45932I0y
    public void jg() {
    }

    @Override // X.InterfaceC45932I0y
    public void tQ() {
        LLFFF(null);
    }

    static {
        TBT tbt = new TBT(C82355WTv.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82355WTv.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C82355WTv.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82355WTv.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82355WTv.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82355WTv.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82355WTv.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82355WTv.class, "nowSwitcherApi", "getNowSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp)};
    }

    private final InterfaceC82325WSr LJLZ() {
        return (InterfaceC82325WSr) this.LLF.LIZ(this, LLFF[7]);
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LLD.LIZ(this, LLFF[6]);
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJZI.LIZ(this, LLFF[3]);
    }

    private final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJZL.LIZ(this, LLFF[4]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLLLLLL.LIZ(this, LLFF[0]);
    }

    private final I3K getSplitShootApiComponent() {
        return (I3K) this.LL.LIZ(this, LLFF[5]);
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.LJZ.LIZ(this, LLFF[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLZ.LIZ(this, LLFF[1]);
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        LJJZZI(C82356WTw.LJLIL);
        super.hide();
    }

    public final boolean LJZI() {
        return getShortVideoContext().qaPermissionDialogShownStatus;
    }

    @Override // X.InterfaceC45932I0y
    public boolean eN() {
        if (getShortVideoContext().qaStruct != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        LiveEvent<WSA> Po;
        C0IB<String> pe0;
        super.onCreate();
        getRecordControlApi().Vh().LIZIZ(this, new AObjectS89S0100000_14(this, 124));
        I3K splitShootApiComponent = getSplitShootApiComponent();
        if (splitShootApiComponent != null && (pe0 = splitShootApiComponent.pe0()) != null) {
            pe0.LIZIZ(this, new AObjectS89S0100000_14(this, 125));
        }
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS89S0100000_14(this, 126));
        InterfaceC82325WSr LJLZ = LJLZ();
        if (LJLZ != null && (Po = LJLZ.Po()) != null) {
            Po.LIZLLL(this, new AObjectS89S0100000_14(this, 127));
        }
        getPlanCUIApiComponent().Sy().LIZLLL(this, new AObjectS89S0100000_14(this, 128));
        getPlanCUIApiComponent().pL().LIZLLL(this, new AObjectS89S0100000_14(this, 129));
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        LJJZZI(C82357WTx.LJLIL);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<H8B> LJJLIIIJJI() {
        return this.LJLLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C53421Kxt> LJJLIIIJJIZ() {
        return this.LJLLLL;
    }

    @Override // X.AbstractC41331jl, X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC45932I0y
    public void I4(QaStruct qaStruct) {
        o.LJIIIZ(qaStruct, "qaStruct");
        LLFFF(qaStruct);
    }

    public final void LLF(boolean z) {
        getShortVideoContext().qaPermissionDialogShownStatus = z;
    }

    public final void LLFFF(QaStruct qaStruct) {
        boolean z;
        getShortVideoContext().qaStruct = qaStruct;
        LJJZZI(new AqS180S0100000_14(qaStruct, 126));
        if (qaStruct != null) {
            z = true;
        } else {
            z = false;
        }
        show(z);
    }

    public final void LLIFFJFJJ(boolean z) {
        C78928UyK.LIZIZ(z, false, false, getCameraApiComponent());
        getStickerApiComponent().lw(z);
        getPlanCUIApiComponent().kY(z, false);
    }

    @Override // X.InterfaceC45932I0y
    public void show(boolean z) {
        if (z) {
            if (eN()) {
                show();
                return;
            }
            return;
        }
        hide();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82355WTv(WMH parentScene, C82622Wbi diContainer, QaStruct qaStruct) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = qaStruct;
        this.LJLLJ = this;
        this.LJLLL = new AqS164S0100000_14(this, 132);
        this.LJLLLL = new AqS159S0100000_9(this, 520);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJZL = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LL = UCI.LJII(getDiContainer(), I3K.class, null);
        this.LLD = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LLF = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
    }
}
