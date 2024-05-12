package X;

import Y.ACallableS56S0300000_7;
import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WXN extends AbstractC48231ut<InterfaceC82352WTs, C82454WXq, WXU, C82458WXu> implements InterfaceC82352WTs, InterfaceC135635Tz, InterfaceC82440WXc {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILZ;
    public final WMH LJLL;
    public final View LJLLI;
    public final ActivityC45651qj LJLLILLLL;
    public final C82622Wbi LJLLJ;
    public final CameraComponentModel LJLLL;
    public String LJLLLL;
    public final C5H3 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final C5H3 LJZL;
    public final C5H3 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public final long LLIIIILZ;
    public boolean LLIIIJ;
    public int LLIIIL;
    public final WXY LLIIIZ;
    public final InterfaceC82441WXd LLIIJI;
    public final WXW LLIIJLIL;
    public final C5H3 LLIIL;
    public long LLIILII;
    public InterfaceC88472Yns<? super MultiEditVideoStatusRecordData, C76800UCe> LLIILZL;
    public InterfaceC65784Pro<C76800UCe> LLIIZ;
    public InterfaceC88472Yns<? super Bitmap, C76800UCe> LLIL;
    public MultiEditVideoStatusRecordData LLILII;
    public final WXO LLILIL;
    public final C5H3 LLILL;
    public final InterfaceC65784Pro<C82454WXq> LLILLIZIL;
    public final LiveEvent<C76800UCe> LLILLJJLI;
    public final LiveEvent<C76800UCe> LLILLL;

    public static /* synthetic */ void LLIFFJFJJ() {
    }

    private final void LLLFZ() {
        this.LLI = true;
        this.LLIIJLIL.LJ();
    }

    private final void LLLI() {
        this.LLFZ = true;
        LJJZZI(WXS.LJLIL);
    }

    @Override // X.InterfaceC82440WXc
    public void LJFF() {
        this.LLIIIJ = false;
        LLILZLL().setEnabled(true);
    }

    public void LLJJIJI() {
    }

    public final void LLJJIJIL() {
        LLLJIL(this, false, 1, null);
        this.LLIIJLIL.LJI();
    }

    @Override // X.InterfaceC82352WTs
    public void p() {
        LLLIIIL(0);
        LLIZ().p();
        this.LLIIJLIL.p();
    }

    static {
        TBT tbt = new TBT(WXN.class, "shootModel", "getShootModel()Lcom/ss/android/ugc/aweme/creative/model/NowsShootModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLILZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WXN.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(WXN.class, "enterShootParam", "getEnterShootParam()Lcom/ss/android/ugc/aweme/services/recording/NowsShootActivityArg;", 0, c65351Pkp), C61845OOz.LIZJ(WXN.class, "switcherApi", "getSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(WXN.class, "dockBarComponentApi", "getDockBarComponentApi()Lcom/ss/android/ugc/aweme/nows/dock/NowDockBarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WXN.class, "nowToolbarApi", "getNowToolbarApi()Lcom/ss/android/ugc/aweme/nows/toolbar/NowSimpleToolbarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WXN.class, "surfaceSizeAdapter", "getSurfaceSizeAdapter()Lcom/ss/android/ugc/aweme/utils/SurfaceSizeAdapter;", 0, c65351Pkp), C61845OOz.LIZJ(WXN.class, "filterComponentAdapter", "getFilterComponentAdapter()Lcom/ss/android/ugc/aweme/filter/adapter/INowsFilterComponentAdapter;", 0, c65351Pkp)};
    }

    private final void LJZI() {
        if (this.LLFZ) {
            LJJZZI(WXQ.LJLIL);
            this.LLFZ = false;
        }
    }

    private final C82390WVe LLF() {
        return (C82390WVe) this.LJLLLLLL.getValue();
    }

    private final InterfaceC82341WTh LLIIIL() {
        return (InterfaceC82341WTh) this.LLF.LIZ(this, LLILZ[4]);
    }

    private final InterfaceC83865Wvl LLILL() {
        return this.LLIIJLIL.LJFF().getMediaController();
    }

    private final InterfaceC82335WTb LLILZIL() {
        return (InterfaceC82335WTb) this.LLFF.LIZ(this, LLILZ[5]);
    }

    private final WSC LLILZLL() {
        return (WSC) this.LJZL.getValue();
    }

    private final WXV LLIZ() {
        return (WXV) this.LLIIL.getValue();
    }

    private final SafeHandler LLLZI() {
        return (SafeHandler) this.LLILL.getValue();
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJZ.LIZ(this, LLILZ[1]);
    }

    @Override // X.InterfaceC82440WXc
    public void LJJIJIIJI() {
        if (this.LLIIII) {
            this.LLIIJLIL.LIZLLL(true);
            LLLIIIL(2);
            LLILZLL().Il(true);
            LLLJIL(this, false, 1, null);
        }
        LJJZZI(WXR.LJLIL);
        HC6.LJIIL(LLIILZL(), this.LLIIIZ.LLFZ(), LLJ(), System.currentTimeMillis());
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<WXU> LJJLIIIJJI() {
        return new AqS164S0100000_14(this, 83);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C82458WXu> LJJLIIIJJIZ() {
        return new AqS164S0100000_14(this, 85);
    }

    public final WX9 LLFFF() {
        return (WX9) this.LL.getValue();
    }

    @Override // X.InterfaceC82352WTs
    public boolean LLFZ() {
        return this.LLIIIZ.LLFZ();
    }

    public final NowsShootActivityArg LLIILZL() {
        return (NowsShootActivityArg) this.LJZI.LIZ(this, LLILZ[2]);
    }

    public final WRX LLIIZ() {
        return (WRX) this.LLFII.LIZ(this, LLILZ[7]);
    }

    public final NowsShootModel LLJ() {
        return (NowsShootModel) this.LJLZ.LIZ(this, LLILZ[0]);
    }

    public final W4L LLJI() {
        return (W4L) this.LLFFF.LIZ(this, LLILZ[6]);
    }

    public final InterfaceC82325WSr LLJJ() {
        return (InterfaceC82325WSr) this.LLD.LIZ(this, LLILZ[3]);
    }

    public final void LLJJIII() {
        if (this.LLIIIL == 4) {
            if (this.LLIFFJFJJ && !C44318HaM.LIZ()) {
                LLJJJIL();
            }
            LLIZ().LIZLLL(this.LLIIIL, this.LLIFFJFJJ);
        }
    }

    public final void LLJJJIL() {
        if (!this.LLIFFJFJJ) {
            return;
        }
        if (this.LLIIIZ.LLFZ()) {
            LLLI();
        } else {
            LLLFZ();
        }
    }

    public final void LLJJL() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        InterfaceC88472Yns<? super MultiEditVideoStatusRecordData, C76800UCe> interfaceC88472Yns;
        int i = this.LLIIIL;
        if (i != 1) {
            if ((i != 3 && i != 4) || (multiEditVideoStatusRecordData = this.LLILII) == null || (interfaceC88472Yns = this.LLIILZL) == null) {
                return;
            }
            interfaceC88472Yns.invoke(multiEditVideoStatusRecordData);
            return;
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLIIZ;
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public final void LLJLIL() {
        int i = this.LLIIIL;
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    return;
                }
                LLIZ().LIZJ();
                return;
            }
            this.LLIIJLIL.LIZJ();
            return;
        }
        this.LLIIJLIL.LIZJ();
        this.LJLLI.setVisibility(8);
    }

    @Override // X.InterfaceC82352WTs
    public LiveData<HK7> LLL() {
        return this.LLIIIZ.LLL();
    }

    @Override // X.InterfaceC82352WTs
    public void LLLIILIL() {
        if (!this.LLIIIJ) {
            this.LLIIIJ = true;
            this.LLIIIZ.LLLIILIL();
            LLILZLL().setEnabled(false);
        }
    }

    @Override // X.InterfaceC82352WTs
    public void LLLLZLLLI() {
        this.LLIIIZ.LLLLZLLLI();
    }

    @Override // X.InterfaceC82352WTs
    public void YF() {
        this.LLIIIZ.S0();
    }

    @Override // X.InterfaceC82352WTs
    public void Zr() {
        LJJZZI(WXT.LJLIL);
        this.LLII = !this.LLII;
        LLJ().frontImageInLargeWindow = !LLJ().frontImageInLargeWindow;
    }

    @Override // X.InterfaceC82352WTs
    public InterfaceC83624Wrs e8() {
        return this.LLIIJLIL.LJFF();
    }

    private final void LJLZ() {
        NowsShootModel LLJ = LLJ();
        LLJ.frontBitmap = null;
        LLJ.backBitmap = null;
        LLJ.frontImagePath = null;
        LLJ.backImagePath = null;
        C43656HBk.LIZ.set(true);
    }

    private final void LLLILZLLLI() {
        M5();
        LLF().G2(1);
        LLILZLL().Il(true);
        InterfaceC82335WTb LLILZIL = LLILZIL();
        if (LLILZIL != null) {
            LLILZIL.LLFII(false);
        }
        InterfaceC82341WTh LLIIIL = LLIIIL();
        if (LLIIIL != null) {
            LLIIIL.GP(false);
        }
    }

    @Override // X.InterfaceC82352WTs
    public void Gl() {
        LLFFF().jz(this.LLILIL);
    }

    @Override // X.InterfaceC82352WTs
    public void LJJJJIZL() {
        if (!LLJJI()) {
            this.LLIIJI.LJJJJIZL();
            return;
        }
        if (this.LLIIIL == 4) {
            if (LLIZ().isRecording()) {
                LLIZ().LJJJJIZL();
                return;
            } else {
                this.LLIIII = true;
                return;
            }
        }
        LLIZ().LJJJJIZL();
    }

    @Override // X.InterfaceC82352WTs
    public void LJL() {
        LLIZ().LJL();
    }

    public final boolean LLJJI() {
        return LLJ().nowsExtra.isDualCamera;
    }

    @Override // X.InterfaceC82352WTs
    public void LLJJJJ() {
        int i;
        String str;
        String str2;
        LiveEvent<C76800UCe> Pu = Pu();
        o.LJII(Pu, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) Pu).LJII(C76800UCe.LIZ);
        LLJ().type = 1;
        this.LLIIII = false;
        boolean LLFZ = this.LLIIIZ.LLFZ();
        if (LLFZ) {
            i = 4;
        } else {
            i = 3;
        }
        LLLIIIL(i);
        if (!LLJJI()) {
            this.LLIIJI.start(this.LLIIIL);
            if (LLFZ) {
                LLLJ(true);
            }
        } else if (LLFZ) {
            LLLJIL(this, false, 1, null);
            LLF().P50();
            LJJZZI(new AqS180S0100000_14(this, 69));
        } else {
            LLIZ().LIZLLL(this.LLIIIL, this.LLIFFJFJJ);
        }
        NowsExtra nowsExtra = LLJ().nowsExtra;
        if (nowsExtra.isDualCamera) {
            str = "combined";
        } else {
            str = "single_video";
        }
        nowsExtra.dualType = str;
        if (LLFZ) {
            str2 = "front_first";
        } else {
            str2 = "back_first";
        }
        nowsExtra.shootOrder = str2;
        nowsExtra.recordTimeLag = (int) ((System.currentTimeMillis() - this.LLIIIILZ) / 1000);
        if (W2U.LIZ() && getShortVideoContext().creativeModel.recordEffectModel.enterFrom != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prop_panel_");
            LIZ.append(getShortVideoContext().creativeModel.recordEffectModel.enterFrom);
            this.LJLLLL = X1D.LIZIZ(LIZ);
        }
        CreativeInfo creativeInfo = getShortVideoContext().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        HC6.LJIIIZ(creativeInfo, LLJ(), LLIILZL(), this.LJLLLL);
    }

    public final void LLJLLIL() {
        if (!LLJJI()) {
            this.LLIIJI.LIZ();
            LLF().G2(2);
            LLILZLL().Il(true);
            this.LJLLI.setVisibility(8);
            return;
        }
        int i = this.LLIIIL;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LLIZ().LIZ();
                return;
            } else {
                this.LLIIJLIL.LIZ();
                LLF().G2(2);
                LLILZLL().Il(true);
                this.LJLLI.setVisibility(8);
                return;
            }
        }
        this.LLIIJLIL.LIZ();
    }

    public final void LLJZIJLIL() {
        LLF().bf();
    }

    @Override // X.InterfaceC82352WTs
    public void M5() {
        LLIZ().M5();
    }

    @Override // X.InterfaceC82352WTs
    public void il0() {
        int i;
        String str;
        String str2;
        LiveEvent<C76800UCe> Pu = Pu();
        o.LJII(Pu, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) Pu).LJII(C76800UCe.LIZ);
        LLJ().type = 0;
        this.LLIIII = false;
        boolean LLFZ = this.LLIIIZ.LLFZ();
        if (LLFZ) {
            if (this.LLIFFJFJJ) {
                LLLI();
            }
            i = 2;
        } else {
            i = 1;
        }
        LLLIIIL(i);
        this.LLII = LLFZ;
        boolean z = LLJ().nowsExtra.isDualCamera;
        if (z) {
            this.LLIIJLIL.start(this.LLIIIL);
        } else {
            this.LLIILII = System.currentTimeMillis();
            this.LLIIJI.start(this.LLIIIL);
        }
        LLJ().firstShootBack = !LLFZ;
        NowsExtra nowsExtra = LLJ().nowsExtra;
        if (z) {
            str = "both_photo";
        } else {
            str = "single_photo";
        }
        nowsExtra.getClass();
        nowsExtra.dualType = str;
        if (LLFZ) {
            str2 = "front_first";
        } else {
            str2 = "back_first";
        }
        nowsExtra.shootOrder = str2;
        nowsExtra.recordTimeLag = (int) ((System.currentTimeMillis() - this.LLIIIILZ) / 1000);
        LLFFF().L6(false);
        if (W2U.LIZ() && getShortVideoContext().creativeModel.recordEffectModel.enterFrom != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prop_panel_");
            LIZ.append(getShortVideoContext().creativeModel.recordEffectModel.enterFrom);
            this.LJLLLL = X1D.LIZIZ(LIZ);
        }
        CreativeInfo creativeInfo = getShortVideoContext().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        HC6.LJIIIZ(creativeInfo, LLJ(), LLIILZL(), this.LJLLLL);
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        C0IB<C81644W2m> zx;
        super.onCreate();
        InterfaceC82325WSr LLJJ = LLJJ();
        if (LLJJ != null && (zx = LLJJ.zx()) != null) {
            zx.LIZIZ(this, new AObjectS89S0100000_14(this, 88));
        }
        if (LLIILZL().getStartNowsRecordTime() != null) {
            LLL().observe(this, new AObserverS82S0100000_14(this, 16));
        } else {
            InterfaceC82325WSr LLJJ2 = LLJJ();
            if (LLJJ2 != null && LLJJ2.Nz()) {
                LLL().observe(this, new AObserverS82S0100000_14(this, 17));
            }
        }
        NowsShootModel LLJ = LLJ();
        C62822Ol8 c62822Ol8 = C43879HJz.LIZ;
        boolean z = ((Keva) c62822Ol8.getValue()).getBoolean("enter_now", true);
        ((Keva) c62822Ol8.getValue()).storeBoolean("enter_now", false);
        LLJ.isFirstStart = z;
    }

    @Override // X.InterfaceC82352WTs
    public LiveEvent<C76800UCe> JD() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC82440WXc
    public boolean LJJIIJ() {
        return this.LLIIII;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C82454WXq> LJLJJLL() {
        return this.LLILLIZIL;
    }

    @Override // X.InterfaceC82352WTs
    public LiveEvent<C76800UCe> Pu() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLJ;
    }

    private final void LLLIIIL(int i) {
        int i2;
        this.LLIIIL = i;
        NowsShootModel LLJ = LLJ();
        int i3 = this.LLIIIL;
        if (i3 == 4 || i3 == 3) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        LLJ.type = i2;
        LJJZZI(new AqS180S0100000_14(this, 62));
    }

    private final void LLLJ(boolean z) {
        if (!C44318HaM.LIZ() || !this.LLIFFJFJJ) {
            return;
        }
        if (z) {
            LLJJJIL();
        } else {
            LLLZI().postDelayed(new ARunnableS50S0100000_14(this, 71), C44317HaL.LJ - 400);
        }
    }

    @Override // X.InterfaceC82352WTs
    public void GO(boolean z) {
        LJJZZI(new AqS18S0010000_14(z, 6));
    }

    @Override // X.InterfaceC82352WTs
    public void Gf(WS3 nowFirstFrameModel) {
        o.LJIIIZ(nowFirstFrameModel, "nowFirstFrameModel");
        NowsShootActivityArg enterShootParam = LLIILZL();
        boolean LLFZ = LLFZ();
        NowsShootModel shootModel = LLJ();
        C82622Wbi diContainer = getDiContainer();
        WRQ cameraApiComponent = LLIIZ().R4();
        o.LJIIIZ(enterShootParam, "enterShootParam");
        o.LJIIIZ(shootModel, "shootModel");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        long j = nowFirstFrameModel.LJLIL;
        long j2 = nowFirstFrameModel.LJLILLLLZI;
        long j3 = nowFirstFrameModel.LJLJI - j2;
        C145995oB c145995oB = new C145995oB();
        HC6.LIZ(c145995oB, enterShootParam, LLFZ, shootModel);
        c145995oB.LIZIZ(j - j2, "first_frame_duration");
        c145995oB.LIZIZ(j3, "first_ui_frame_duration");
        if (HC7.LIZ()) {
            C10K.LIZJ(new ACallableS56S0300000_7(new C43910HLe(diContainer, cameraApiComponent), c145995oB, new AqS157S0100000_7(c145995oB, 149), 16));
            return;
        }
        java.util.Map<String, String> map = c145995oB.LIZ;
        o.LJIIIIZZ(map, "newBuilder.builder()");
        C42318GjC.LIZIZ("tool_performance_record_first_frame", map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r2 != 3) goto L8;
     */
    @Override // X.InterfaceC82440WXc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJI(android.graphics.Bitmap r14) {
        /*
            r13 = this;
            java.lang.String r0 = "bitmap"
            r4 = r14
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            int r2 = r13.LLIIIL
            r5 = 1
            java.lang.String r1 = "shortVideoContext.creativeInfo"
            if (r2 == r5) goto L62
            r0 = 2
            if (r2 == r0) goto L29
            r0 = 3
            if (r2 == r0) goto L62
        L13:
            com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg r3 = r13.LLIILZL()
            X.Wvl r2 = r13.LLILL()
            X.WXY r0 = r13.LLIIIZ
            boolean r1 = r0.LLFZ()
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r0 = r13.LLJ()
            X.HC6.LJIIJ(r3, r2, r1, r0, r5)
            return
        L29:
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r0 = r13.LLJ()
            r0.backBitmap = r4
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r13.getShortVideoContext()
            com.ss.android.ugc.aweme.creative.CreativeInfo r2 = r0.creativeInfo
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r1)
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r3 = r13.LLJ()
            r6 = 0
            r8 = 16
            r7 = r5
            X.C43656HBk.LIZ(r2, r3, r4, r5, r6, r7, r8)
            X.Pro<X.UCe> r0 = r13.LLIIZ
            if (r0 == 0) goto L4b
            r0.invoke()
        L4b:
            r13.LJZI()
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r0 = r13.LLJ()
            com.ss.android.ugc.aweme.creative.model.NowsExtra r1 = r0.nowsExtra
            r1.getClass()
            java.lang.String r0 = "both_photo"
            r1.dualType = r0
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r0 = r13.LLJ()
            r0.type = r6
            goto L13
        L62:
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r0 = r13.LLJ()
            r0.frontBitmap = r4
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r13.getShortVideoContext()
            com.ss.android.ugc.aweme.creative.CreativeInfo r6 = r0.creativeInfo
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r1)
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r7 = r13.LLJ()
            r9 = 0
            r12 = 32
            r8 = r4
            r10 = r5
            r11 = r9
            X.C43656HBk.LIZ(r6, r7, r8, r9, r10, r11, r12)
            kotlin.jvm.internal.AqS180S0100000_14 r1 = new kotlin.jvm.internal.AqS180S0100000_14
            r0 = 68
            r1.<init>(r4, r0)
            r13.LJJZZI(r1)
            r13.LJZI()
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WXN.LJI(android.graphics.Bitmap):void");
    }

    @Override // X.InterfaceC82440WXc
    public void LJJIFFI(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        LJJZZI(new AqS180S0100000_14(bitmap, 63));
    }

    @Override // X.InterfaceC82352WTs
    public void Lw(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        String str;
        int i = 2;
        if (!LLJJI()) {
            LJZI();
            if (multiEditVideoStatusRecordData == null || getShortVideoContext().cameraComponentModel.mTotalRecordingTime < 500) {
                if (this.LLIIIL == 3) {
                    i = 1;
                }
                LLLIIIL(i);
                LLLILZLLLI();
                this.LLIIJI.start(this.LLIIIL);
                NowsExtra nowsExtra = LLJ().nowsExtra;
                nowsExtra.getClass();
                nowsExtra.dualType = "single_photo";
                return;
            }
            this.LLILII = multiEditVideoStatusRecordData;
            InterfaceC88472Yns<? super MultiEditVideoStatusRecordData, C76800UCe> interfaceC88472Yns = this.LLIILZL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(multiEditVideoStatusRecordData);
            }
            this.LLIIJI.LIZIZ();
            LLJ().type = 2;
            InterfaceC83865Wvl mediaController = LLILL();
            NowsShootActivityArg enterShootParam = LLIILZL();
            boolean LLFZ = this.LLIIIZ.LLFZ();
            o.LJIIIZ(mediaController, "mediaController");
            o.LJIIIZ(enterShootParam, "enterShootParam");
            C145995oB c145995oB = new C145995oB();
            HC6.LIZLLL(c145995oB, mediaController, enterShootParam);
            c145995oB.LJI("multi_camera_window", CardStruct.IStatusCode.DEFAULT);
            if (LLFZ) {
                str = "4";
            } else {
                str = "5";
            }
            c145995oB.LJI("multi_camera_mode", str);
            java.util.Map<String, String> map = c145995oB.LIZ;
            o.LJIIIIZZ(map, "newBuilder.builder()");
            C42318GjC.LIZIZ("tool_performance_video_record", map);
            return;
        }
        if (this.LLIIIL == 4) {
            if (multiEditVideoStatusRecordData == null || getShortVideoContext().cameraComponentModel.mTotalRecordingTime < 500) {
                LLLIIIL(2);
                LLLILZLLLI();
                this.LLIIJLIL.LIZLLL(false);
                NowsExtra nowsExtra2 = LLJ().nowsExtra;
                nowsExtra2.getClass();
                nowsExtra2.dualType = "both_photo";
                LLJ().type = 0;
                return;
            }
            this.LLILII = multiEditVideoStatusRecordData;
            InterfaceC88472Yns<? super MultiEditVideoStatusRecordData, C76800UCe> interfaceC88472Yns2 = this.LLIILZL;
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(multiEditVideoStatusRecordData);
            }
            LLIZ().LIZIZ();
            HC6.LJIIJ(LLIILZL(), LLILL(), this.LLIIIZ.LLFZ(), LLJ(), true);
            HC6.LJI(LLILL(), LLIILZL(), this.LLIIIZ.LLFZ());
            return;
        }
        if (multiEditVideoStatusRecordData == null || getShortVideoContext().cameraComponentModel.mTotalRecordingTime < 500) {
            LLLIIIL(1);
            LLLILZLLLI();
            this.LLIIJLIL.start(1);
            NowsExtra nowsExtra3 = LLJ().nowsExtra;
            nowsExtra3.getClass();
            nowsExtra3.dualType = "both_photo";
            LLJ().type = 0;
            return;
        }
        this.LLILII = multiEditVideoStatusRecordData;
        LLF().G2(1);
        InterfaceC82335WTb LLILZIL = LLILZIL();
        if (LLILZIL != null) {
            LLILZIL.LLFII(false);
        }
        InterfaceC82341WTh LLIIIL = LLIIIL();
        if (LLIIIL != null) {
            LLIIIL.GP(false);
        }
        LLILZLL().Il(true);
        LLIZ().LIZIZ();
        LLJ().type = 1;
        HC6.LJI(LLILL(), LLIILZL(), this.LLIIIZ.LLFZ());
    }

    @Override // X.InterfaceC82352WTs
    public void l8(float f) {
        this.LLIIIZ.l8(f);
    }

    @Override // X.InterfaceC82352WTs
    public void of0(boolean z) {
        LiveEvent<C76800UCe> JD = JD();
        o.LJII(JD, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) JD).LJII(C76800UCe.LIZ);
        this.LLIIIZ.V0();
        this.LLILII = null;
        if (!z) {
            LLIZ().M5();
        }
        if (LLJJI()) {
            this.LLIIJLIL.b();
        } else {
            this.LLIIJI.b();
        }
        if (LLJJ() == null) {
            this.LJLLI.setVisibility(0);
        }
        LLFFF().L6(true);
        LLJ().frontImageInLargeWindow = false;
        LJJZZI(WXP.LJLIL);
        LJLZ();
    }

    @Override // X.InterfaceC82352WTs
    public void t0(boolean z) {
        LJJZZI(new AqS18S0010000_14(z, 4));
        InterfaceC82341WTh LLIIIL = LLIIIL();
        if (LLIIIL != null) {
            LLIIIL.t0(z);
        }
    }

    @Override // X.InterfaceC82352WTs
    public void v90(boolean z) {
        this.LLIFFJFJJ = z;
        this.LLIIIZ.U0(z);
        LJJZZI(new AqS18S0010000_14(z, 5));
    }

    private final void LLLFFI(Bitmap bitmap, long j) {
        boolean z;
        int i = this.LLIIIL;
        if (i != 1) {
            if (i == 2) {
                LLJ().frontBitmap = bitmap;
            }
        } else {
            LLJ().backBitmap = bitmap;
        }
        CreativeInfo creativeInfo = getShortVideoContext().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        NowsShootModel LLJ = LLJ();
        if (this.LLIIIL == 1) {
            z = true;
        } else {
            z = false;
        }
        C43656HBk.LIZ(creativeInfo, LLJ, bitmap, z, false, true, 16);
        C60903NvH.LJIIJJI().LJJIII().getNowUIService().mobTakePhoto(getShortVideoContext(), System.currentTimeMillis() - this.LLIILII, j, getDiContainer(), null);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLIIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        LJZI();
        LLJ().type = 0;
    }

    @Override // X.InterfaceC82440WXc
    public void LJJJJZ(Bitmap bitmap, long j) {
        o.LJIIIZ(bitmap, "bitmap");
        if (!LLJJI()) {
            LLLFFI(bitmap, j);
            return;
        }
        int i = this.LLIIIL;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    LLJ().frontBitmap = bitmap;
                    CreativeInfo creativeInfo = getShortVideoContext().creativeInfo;
                    o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
                    C43656HBk.LIZ(creativeInfo, LLJ(), bitmap, false, true, false, 32);
                    LLF().Ik();
                    LJJZZI(new AqS180S0100000_14(bitmap, 67));
                    LJZI();
                    return;
                }
                LJJZZI(new AqS180S0100000_14(bitmap, 66));
                LLLJIL(this, false, 1, null);
                return;
            }
            LLJ().frontBitmap = bitmap;
            CreativeInfo creativeInfo2 = getShortVideoContext().creativeInfo;
            o.LJIIIIZZ(creativeInfo2, "shortVideoContext.creativeInfo");
            C43656HBk.LIZ(creativeInfo2, LLJ(), bitmap, false, true, false, 32);
            LJJZZI(new AqS180S0100000_14(bitmap, 65));
            LJZI();
            LLLJIL(this, false, 1, null);
            return;
        }
        LLJ().backBitmap = bitmap;
        CreativeInfo creativeInfo3 = getShortVideoContext().creativeInfo;
        o.LJIIIIZZ(creativeInfo3, "shortVideoContext.creativeInfo");
        C43656HBk.LIZ(creativeInfo3, LLJ(), bitmap, true, false, true, 16);
        LJJZZI(new AqS180S0100000_14(bitmap, 64));
        if (C52290Kfe.LIZ()) {
            return;
        }
        LLLJIL(this, false, 1, null);
    }

    @Override // X.InterfaceC82352WTs
    public void LLILII(float f, float f2) {
        LLIZ().LLILII(f, f2);
    }

    public static /* synthetic */ void LLLJIL(WXN wxn, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        wxn.LLLJ(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WXN(WMH parentScene, View gestureLayout, ActivityC45651qj activity, C82622Wbi diContainer, CameraComponentModel cameraComponentModel) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(gestureLayout, "gestureLayout");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(cameraComponentModel, "cameraComponentModel");
        this.LJLL = parentScene;
        this.LJLLI = gestureLayout;
        this.LJLLILLLL = activity;
        this.LJLLJ = diContainer;
        this.LJLLL = cameraComponentModel;
        this.LJLLLL = "";
        this.LJLLLLLL = C269113v.LIZ(this, C82390WVe.class);
        this.LJLZ = UCI.LJI(getDiContainer(), NowsShootModel.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), NowsShootActivityArg.class, null);
        this.LJZL = C269113v.LIZ(this, WSC.class);
        this.LL = C269113v.LIZ(this, WX9.class);
        this.LLD = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LLF = UCI.LJII(getDiContainer(), InterfaceC82341WTh.class, null);
        this.LLFF = UCI.LJII(getDiContainer(), InterfaceC82335WTb.class, null);
        this.LLFFF = UCI.LJII(getDiContainer(), W4L.class, null);
        this.LLFII = UCI.LJI(getDiContainer(), WRX.class, null);
        this.LLIIIILZ = System.currentTimeMillis();
        C82622Wbi diContainer2 = getDiContainer();
        o.LJIIIZ(diContainer2, "diContainer");
        WY8 wy8 = new WY8(activity, diContainer2, cameraComponentModel);
        this.LLIIIZ = wy8;
        C82622Wbi diContainer3 = getDiContainer();
        o.LJIIIZ(diContainer3, "diContainer");
        C82438WXa c82438WXa = new C82438WXa(diContainer3, wy8);
        c82438WXa.LJLJJLL = this;
        this.LLIIJI = c82438WXa;
        C82622Wbi diContainer4 = getDiContainer();
        o.LJIIIZ(diContainer4, "diContainer");
        C82445WXh c82445WXh = new C82445WXh(activity, diContainer4, wy8);
        c82445WXh.LJLJJL = this;
        this.LLIIJLIL = c82445WXh;
        this.LLIIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 84));
        this.LLIILII = -1L;
        this.LLILIL = new WXO(this);
        this.LLILL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 145));
        this.LLILLIZIL = WXX.LJLIL;
        this.LLILLJJLI = new C29901Fi();
        this.LLILLL = new C29901Fi();
    }
}
