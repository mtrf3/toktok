package X;

import Y.AObjectS84S0100000_2;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160346Ra extends AbstractC48231ut<InterfaceC45932I0y, C158106Ik, C158146Io, C6PC> implements InterfaceC45932I0y, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final QaStruct LJLLILLLL;
    public final InterfaceC65784Pro<C158146Io> LJLLJ;
    public final InterfaceC65784Pro<C6PC> LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;

    @Override // X.InterfaceC45932I0y
    public void tQ() {
        LLILL(null);
    }

    static {
        TBT tbt = new TBT(C160346Ra.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C160346Ra.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C160346Ra.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C160346Ra.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C160346Ra.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C160346Ra.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C160346Ra.class, "recordQuickExitGestureApi", "getRecordQuickExitGestureApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordQuickExitGestureApi;", 0, c65351Pkp), C61845OOz.LIZJ(C160346Ra.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C160346Ra.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C160346Ra.class, "nowSwitcherApi", "getNowSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp)};
    }

    private final InterfaceC45995I3j LJZI() {
        return (InterfaceC45995I3j) this.LJZL.LIZ(this, LLFFF[5]);
    }

    private final InterfaceC82325WSr LLF() {
        return (InterfaceC82325WSr) this.LLFF.LIZ(this, LLFFF[9]);
    }

    private final InterfaceC160396Rf LLIFFJFJJ() {
        return (InterfaceC160396Rf) this.LL.LIZ(this, LLFFF[6]);
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LLF.LIZ(this, LLFFF[8]);
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLZ.LIZ(this, LLFFF[2]);
    }

    private final InterfaceC82353WTt getGestureApiComponent() {
        return (InterfaceC82353WTt) this.LJZI.LIZ(this, LLFFF[4]);
    }

    private final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJZ.LIZ(this, LLFFF[3]);
    }

    private final I3K getSplitShootApiComponent() {
        return (I3K) this.LLD.LIZ(this, LLFFF[7]);
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.LJLLLLLL.LIZ(this, LLFFF[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLLLL.LIZ(this, LLFFF[0]);
    }

    @Override // X.InterfaceC45932I0y
    public void jg() {
        LJJZZI(C6PK.LJLIL);
    }

    public final boolean LLFFF() {
        return getShortVideoContext().qaPermissionDialogShownStatus;
    }

    public final void LLIIIL() {
        getShortVideoContext().qaStruct = null;
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
        LJZI().ES().LIZLLL(this, new AObjectS84S0100000_2(this, 38));
        I3K splitShootApiComponent = getSplitShootApiComponent();
        if (splitShootApiComponent != null && (pe0 = splitShootApiComponent.pe0()) != null) {
            pe0.LIZIZ(this, new AObjectS84S0100000_2(this, 39));
        }
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS84S0100000_2(this, 40));
        InterfaceC82325WSr LLF = LLF();
        if (LLF != null && (Po = LLF.Po()) != null) {
            Po.LIZLLL(this, new AObjectS84S0100000_2(this, 41));
        }
        getPlanCUIApiComponent().Sy().LIZLLL(this, new AObjectS84S0100000_2(this, 42));
        getPlanCUIApiComponent().pL().LIZLLL(this, new AObjectS84S0100000_2(this, 43));
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C158146Io> LJJLIIIJJI() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C6PC> LJJLIIIJJIZ() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    public final void Ef0(WXA wxa) {
        getGestureApiComponent().ID(wxa, 6, 50);
    }

    @Override // X.InterfaceC45932I0y
    public void I4(QaStruct qaStruct) {
        o.LJIIIZ(qaStruct, "qaStruct");
        LLILL(qaStruct);
    }

    public final void LLIILZL(boolean z) {
        getShortVideoContext().qaPermissionDialogShownStatus = z;
    }

    public final void LLIIZ(QAStickerModel qAStickerModel) {
        getShortVideoContext().qaStickerModel = qAStickerModel;
    }

    public final void LLILL(QaStruct qaStruct) {
        boolean z;
        getShortVideoContext().qaStruct = qaStruct;
        LJJZZI(new AqS168S0100000_2(qaStruct, 91));
        if (qaStruct != null) {
            z = true;
        } else {
            z = false;
        }
        show(z);
    }

    public final void LLILZIL(boolean z) {
        C78928UyK.LIZIZ(z, false, false, getCameraApiComponent());
        getStickerApiComponent().lw(z);
        getPlanCUIApiComponent().kY(z, false);
    }

    @Override // X.InterfaceC45932I0y
    public void show(boolean z) {
        if (z) {
            if (eN()) {
                InterfaceC160396Rf LLIFFJFJJ = LLIFFJFJJ();
                if (LLIFFJFJJ != null) {
                    LLIFFJFJJ.YC(false);
                }
                show();
                return;
            }
            return;
        }
        InterfaceC160396Rf LLIFFJFJJ2 = LLIFFJFJJ();
        if (LLIFFJFJJ2 != null) {
            LLIFFJFJJ2.YC(true);
        }
        hide();
    }

    public final void LJLZ(String str, QAStickerModel qAStickerModel) {
        Long l;
        Float f;
        Float f2;
        Float f3;
        BaseStickerModel baseStickerModel;
        BaseStickerModel baseStickerModel2;
        BaseStickerModel baseStickerModel3;
        BaseStickerModel baseStickerModel4;
        C145995oB LIZIZ = GFJ.LIZIZ(17, "sticker_type");
        LIZIZ.LJI("content_type", "video");
        LIZIZ.LJI("shoot_way", getShortVideoContext().shootWay);
        LIZIZ.LJI("enter_from", getShortVideoContext().enterFrom);
        Float f4 = null;
        if (qAStickerModel != null) {
            l = Long.valueOf(qAStickerModel.getQuestionId());
        } else {
            l = null;
        }
        LIZIZ.LIZJ(l, "question_id");
        LIZIZ.LJI("prop_id", null);
        if (qAStickerModel != null && (baseStickerModel4 = qAStickerModel.getBaseStickerModel()) != null) {
            f = Float.valueOf(qAStickerModel.getBaseStickerModel().getTop() + baseStickerModel4.getTranslateY());
        } else {
            f = null;
        }
        LIZIZ.LIZJ(f, "sticker_Y");
        if (qAStickerModel != null && (baseStickerModel3 = qAStickerModel.getBaseStickerModel()) != null) {
            f2 = Float.valueOf(qAStickerModel.getBaseStickerModel().getLeft() + baseStickerModel3.getTranslateX());
        } else {
            f2 = null;
        }
        LIZIZ.LIZJ(f2, "sticker_X");
        if (qAStickerModel != null && (baseStickerModel2 = qAStickerModel.getBaseStickerModel()) != null) {
            f3 = Float.valueOf(baseStickerModel2.getRotation());
        } else {
            f3 = null;
        }
        LIZIZ.LIZJ(f3, "sticker_angle");
        if (qAStickerModel != null && (baseStickerModel = qAStickerModel.getBaseStickerModel()) != null) {
            f4 = Float.valueOf(baseStickerModel.getScale());
        }
        LIZIZ.LIZJ(f4, "sticker_size");
        FMX.LJIIL(str, LIZIZ.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160346Ra(WMH parentScene, C82622Wbi diContainer, QaStruct qaStruct) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = qaStruct;
        this.LJLLJ = new AqS152S0100000_2(this, 141);
        this.LJLLL = new AqS152S0100000_2(this, 142);
        this.LJLLLL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), InterfaceC82353WTt.class, null);
        this.LJZL = UCI.LJI(getDiContainer(), InterfaceC45995I3j.class, null);
        this.LL = UCI.LJII(getDiContainer(), InterfaceC160396Rf.class, null);
        this.LLD = UCI.LJII(getDiContainer(), I3K.class, null);
        this.LLF = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LLFF = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
    }
}
