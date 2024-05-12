package X;

import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.AqS38S0001000_14;
import kotlin.jvm.internal.AqS45S1200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.WJw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82096WJw extends AbstractC48231ut<WKT, C82102WKc, C82105WKf, C82091WJr> implements WKT, InterfaceC135635Tz {
    public static final WKR LLIL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILII;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final C148425s6 LJLLILLLL;
    public final InterfaceC88472Yns<LifecycleOwner, C76800UCe> LJLLJ;
    public final InterfaceC65784Pro<C82102WKc> LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC45999I3n LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public final WKP LLII;
    public List<? extends CharSequence> LLIIII;
    public String LLIIIILZ;
    public boolean LLIIIJ;
    public final WJA LLIIIL;
    public int LLIIIZ;
    public C82102WKc LLIIJI;
    public final InterfaceC65784Pro<C82105WKf> LLIIJLIL;
    public final InterfaceC65784Pro<C82091WJr> LLIIL;
    public final LiveData<Boolean> LLIILII;
    public final WKT LLIILZL;
    public final int LLIIZ;

    @Override // X.InterfaceC82062WIo
    public void A40() {
    }

    @Override // X.InterfaceC82062WIo
    public void C10() {
    }

    @Override // X.InterfaceC82062WIo
    public void LJLILLLLZI(List<? extends C81975WFf> items) {
        o.LJIIIZ(items, "items");
    }

    @Override // X.InterfaceC82062WIo
    public int LJLLI() {
        return 0;
    }

    @Override // X.InterfaceC82062WIo
    public void LJLLJ(C81975WFf item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.InterfaceC82062WIo
    public void LJLLLL(int i) {
    }

    @Override // X.InterfaceC82062WIo
    public void LL(C81975WFf item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.InterfaceC82062WIo
    public void LLFF(C81975WFf item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.InterfaceC82062WIo
    public View R3(int i) {
        return null;
    }

    @Override // X.InterfaceC82062WIo
    public void a8(List<? extends C81975WFf> items) {
        o.LJIIIZ(items, "items");
    }

    @Override // X.InterfaceC82062WIo
    public void cn0() {
    }

    @Override // X.InterfaceC82062WIo
    public C81975WFf d7(int i) {
        return null;
    }

    @Override // X.InterfaceC82062WIo
    public int getItemCount() {
        return 1;
    }

    @Override // X.InterfaceC82062WIo
    public void t1(List<? extends C81975WFf> items) {
        o.LJIIIZ(items, "items");
    }

    @Override // X.InterfaceC82062WIo
    public boolean uK() {
        return false;
    }

    static {
        TBT tbt = new TBT(C82096WJw.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLILII = new InterfaceC74236TBo[]{tbt, new TBT(C82096WJw.class, "tiktokCameraApiComponent", "getTiktokCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new TBT(C82096WJw.class, "recordModeLogicComponent", "getRecordModeLogicComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeLogicComponent;", 0), new TBT(C82096WJw.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new TBT(C82096WJw.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(C82096WJw.class, "nowsSwitcherApi", "getNowsSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0), new TBT(C82096WJw.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0), new TBT(C82096WJw.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(C82096WJw.class, "recordStickerLogicComponent", "getRecordStickerLogicComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/RecordStickerLogicComponent;", 0), new TBT(C82096WJw.class, "activity", "getActivity()Landroid/app/Activity;", 0)};
        LLIL = new WKR();
    }

    private final C45313HqP LLJ() {
        return (C45313HqP) this.LJLZ.LIZ(this, LLILII[2]);
    }

    private final C46193IAz LLJI() {
        return (C46193IAz) this.LLFF.LIZ(this, LLILII[8]);
    }

    private final WRQ LLJJ() {
        return (WRQ) this.LJLLLLLL.LIZ(this, LLILII[1]);
    }

    private final boolean LLJJI() {
        EnumC147935rJ enumC147935rJ;
        WI1 LJFF = this.LLIIIL.LJFF(C6MP.MICROPHONE);
        if (LJFF != null) {
            enumC147935rJ = LJFF.LIZ;
        } else {
            enumC147935rJ = null;
        }
        if (enumC147935rJ == EnumC147935rJ.ENABLE_CLICK) {
            return true;
        }
        return false;
    }

    private final void LLJJIII() {
        C0IB<C08630Vn<Boolean>> fs;
        C29901Fi<T4S> c29901Fi;
        this.LJZI.Et().LIZIZ(this, new AObjectS89S0100000_14(this, 77));
        C82622Wbi diContainer = getDiContainer();
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(I27.class, new AqS180S0100000_14(this, 47));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, I27.class);
            if (c0i6 != null) {
                I27 i27 = (I27) c0i6;
                i27.getMusicAdded().LIZLLL(this, new AObjectS89S0100000_14(this, 78));
                i27.getMusicCleared().LIZLLL(this, new AObjectS89S0100000_14(this, 79));
            }
        }
        C46193IAz LLJI = LLJI();
        if (LLJI != null && (c29901Fi = LLJI.LLIFFJFJJ) != null) {
            c29901Fi.LIZLLL(this, new AObjectS89S0100000_14(this, 80));
        }
        I8W recordPermissionApi = getRecordPermissionApi();
        if (recordPermissionApi != null && (fs = recordPermissionApi.fs()) != null) {
            fs.LIZIZ(this, new AObjectS89S0100000_14(this, 81));
        }
        this.LJZI.Ie().LIZIZ(this, new AObjectS89S0100000_14(this, 82));
        getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 83));
        C82622Wbi diContainer2 = getDiContainer();
        if (L2L.LIZ(diContainer2)) {
            ((C1EP) diContainer2.LJ(C1EP.class, null)).m3(InterfaceC45925I0r.class, new AqS180S0100000_14(this, 48));
        } else {
            C0I6 c0i62 = (C0I6) diContainer2.LJIIIIZZ(null, InterfaceC45925I0r.class);
            if (c0i62 != null) {
                ((InterfaceC45925I0r) c0i62).Bi().observe(this, new AObserverS82S0100000_14(this, 15));
            }
        }
        getRecordControlApi().aa0().LIZLLL(this, new AObjectS89S0100000_14(this, 84));
        LLJ().LJLJL.LIZLLL(this, new AObjectS89S0100000_14(this, 85));
        this.LJZI.Na0().LIZIZ(this, new AObjectS89S0100000_14(this, 72));
        this.LJZI.RH().LIZIZ(this, new AObjectS89S0100000_14(this, 73));
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS89S0100000_14(this, 74));
        getCameraApiComponent().oX().LIZLLL(this, new AObjectS89S0100000_14(this, 75));
        LLJJ().Bk().LIZLLL(this, new AObjectS89S0100000_14(this, 76));
    }

    private final boolean LLJJIJI() {
        WI0 LIZJ;
        WI1 LJFF = this.LLIIIL.LJFF(C6MP.MICROPHONE);
        if (LJFF != null && (LIZJ = LJFF.LIZJ()) != null) {
            return LIZJ.LJLJI;
        }
        return true;
    }

    private final boolean LLJJJIL() {
        WI0 LIZJ;
        WI1 LJFF = this.LLIIIL.LJFF(C6MP.VOICE);
        if (LJFF != null && (LIZJ = LJFF.LIZJ()) != null) {
            return LIZJ.LJLJI;
        }
        return true;
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LJLLLL.LIZ(this, LLILII[0]);
    }

    private final InterfaceC82325WSr getNowsSwitcherApi() {
        return (InterfaceC82325WSr) this.LL.LIZ(this, LLILII[5]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LLF.LIZ(this, LLILII[7]);
    }

    public final void LLFFF() {
        WJA wja = this.LLIIIL;
        C6MP c6mp = C6MP.MICROPHONE;
        WI1 LJFF = wja.LJFF(c6mp);
        if ((LJFF == null || !LJFF.LJIIIZ()) && WJR.LIZ().enableMicButton) {
            LLILL(c6mp, true);
            getShortVideoContext().cameraComponentModel.isMuted = false;
            HB4.LJIIIIZZ(false);
        }
    }

    public final void LLIFFJFJJ() {
        ((ArrayList) HKZ.LIZ).clear();
        if (WJR.LIZ().enableMicButton && getShortVideoContext().LJIILL() != null && getShortVideoContext().LJIILL().multiEditVideoRecordData != null) {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = getShortVideoContext().LJIILL().multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData != null) {
                if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData.useMusic) {
                    LLILL(C6MP.MICROPHONE, false);
                    C05L.LIZJ(4, getCameraApiComponent());
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LLIILZL() {
        if (!C78605Ut7.LJFF("android.permission.RECORD_AUDIO") && C53210KuU.LIZ()) {
            LLILZIL(C6MP.VOICE_CHANGE, true);
        }
    }

    public final Activity LLILZLL() {
        return (Activity) this.LLFFF.LIZ(this, LLILII[9]);
    }

    public final int LLIZ() {
        return C81184Vtc.LJFF(LLILZLL()) + SFS.LJI(24.0d);
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJZ.LIZ(this, LLILII[3]);
    }

    public final I8W getRecordPermissionApi() {
        return (I8W) this.LLD.LIZ(this, LLILII[6]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJZL.LIZ(this, LLILII[4]);
    }

    public final void LJLZ() {
        if (!getShortVideoContext().isDuetMode && !C43846HIs.LIZ(getShortVideoContext())) {
            LLILZIL(C6MP.DUET_LAYOUT, true);
            if (!V16.LJJLIIIJILLIZJL(getShortVideoContext()) && (!C78685UuP.LJJJZ(getShortVideoContext().creativeModel.musicBuzModel.musicPath) || !getShortVideoContext().cameraComponentModel.isRetakeMode || !WJR.LIZ().enableMicButton)) {
                LLILZIL(C6MP.MICROPHONE, true);
            }
        }
        if (getShortVideoContext().isDuetMode && C43846HIs.LIZ(getShortVideoContext())) {
            if (!HWY.LIZ()) {
                LLILZIL(C6MP.DUET_LAYOUT, false);
            }
            LLILZIL(C6MP.MICROPHONE, false);
        }
        if (C53210KuU.LIZ() && !C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
            WJA wja = this.LLIIIL;
            C6MP c6mp = C6MP.MICROPHONE;
            WI1 LJFF = wja.LJFF(c6mp);
            if (LJFF != null) {
                LJFF.LJFF = true;
            }
            LLILZIL(c6mp, false);
        }
        new SafeHandler(this).post(new ARunnableS50S0100000_14(this, 69));
    }

    public final void LJZI() {
        if (V16.LJJJIL(getShortVideoContext()) && LLJJIJI()) {
            if (!LLJJI()) {
                C05L.LIZJ(3, getCameraApiComponent());
                getCameraApiComponent().jP(new C45314HqQ(this.LLIIIZ));
                C05L.LIZJ(4, getCameraApiComponent());
                LLILL(C6MP.MICROPHONE, false);
                return;
            }
            C05L.LIZJ(2, getCameraApiComponent());
            LLILL(C6MP.MICROPHONE, false);
        }
    }

    public final void LLF() {
        Effect effect;
        boolean z;
        WI0 LIZJ;
        C46193IAz LLJI = LLJI();
        Boolean bool = null;
        if (LLJI != null) {
            effect = C82398WVm.LIZJ(LLJI);
        } else {
            effect = null;
        }
        boolean z2 = true;
        if (!ID0.LJFF(effect) && ID0.LJI(effect)) {
            z = true;
        } else {
            z = false;
        }
        boolean LJIIJ = ID0.LJIIJ(effect);
        if (z || LJIIJ) {
            z2 = false;
        }
        if (V16.LJJJIL(getShortVideoContext())) {
            if (z2) {
                WJA wja = this.LLIIIL;
                C6MP c6mp = C6MP.MICROPHONE;
                WI1 LJFF = wja.LJFF(c6mp);
                if (LJFF != null && (LIZJ = LJFF.LIZJ()) != null) {
                    bool = Boolean.valueOf(LIZJ.LJLJI);
                }
                if (o.LJ(bool, Boolean.TRUE)) {
                    LLILL(c6mp, false);
                    C05L.LIZJ(2, getCameraApiComponent());
                    return;
                }
                return;
            }
            C05L.LIZJ(2, getCameraApiComponent());
        }
    }

    public final void LLIIIL() {
        int i;
        if (V16.LJJJIL(getShortVideoContext())) {
            if (getShortVideoContext().cameraComponentModel.isMuted) {
                i = 2;
            } else {
                i = 1;
            }
            this.LLIIIZ = i;
            if (!LLJJI()) {
                getCameraApiComponent().jP(new C45314HqQ(3));
                getCameraApiComponent().jP(new C45314HqQ(2));
                C05L.LIZJ(4, getCameraApiComponent());
                LLILL(C6MP.MICROPHONE, true);
                return;
            }
            C05L.LIZJ(2, getCameraApiComponent());
            LLILL(C6MP.MICROPHONE, true);
        }
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
            Float LIZ = this.LJZI.Ht().LIZ();
            o.LJIIIIZZ(LIZ, "planCUIApiComponent.delayUIAlpha.value");
            if (LIZ.floatValue() < 1.0f) {
                C82102WKc c82102WKc = this.LLIIJI;
                if (c82102WKc != null && (view = c82102WKc.mView) != null) {
                    view.setLayerType(2, null);
                }
                this.LJZI.gC().LIZLLL(this, new AObjectS89S0100000_14(this, 86));
            }
            this.LJZI.Ht().LIZIZ(this, new AObjectS89S0100000_14(this, 87));
        }
        LLJJIII();
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        WI1 LJFF;
        super.onStart();
        if (C78605Ut7.LJFF("android.permission.RECORD_AUDIO") && C53210KuU.LIZ()) {
            WJA wja = this.LLIIIL;
            C6MP c6mp = C6MP.MICROPHONE;
            WI1 LJFF2 = wja.LJFF(c6mp);
            int i = 1;
            if (LJFF2 != null && LJFF2.LJIIIZ()) {
                if (!LLJJIJI()) {
                    if (V16.LJJLIIIJILLIZJL(getShortVideoContext())) {
                        if (getShortVideoContext().cameraComponentModel.isMuted) {
                            i = 2;
                        }
                        C05L.LIZJ(i, getCameraApiComponent());
                    } else {
                        WI1 LJFF3 = this.LLIIIL.LJFF(c6mp);
                        if (LJFF3 != null) {
                            LJFF3.LIZ(new WI0(LJFF3.LIZJ().LJLIL, LJFF3.LIZJ().LJLILLLLZI, true));
                            this.LLIIIL.LJIIJJI();
                        }
                    }
                }
                if (LLJJJIL() && V16.LJJLIIIJJI(getShortVideoContext()) && (LJFF = this.LLIIIL.LJFF(C6MP.VOICE_CHANGE)) != null) {
                    LJFF.LIZ(new WI0(LJFF.LIZJ().LJLIL, LJFF.LIZJ().LJLILLLLZI, false));
                    this.LLIIIL.LJIIJJI();
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
        return this.LLIILII;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C82105WKf> LJJLIIIJJI() {
        return this.LLIIJLIL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C82091WJr> LJJLIIIJJIZ() {
        return this.LLIIL;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C82102WKc> LJLJJLL() {
        return this.LJLLL;
    }

    @Override // X.AbstractC41331jl, X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        return this.LLIILZL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC82118WKs
    public int getPanelType() {
        return this.LLIIZ;
    }

    @Override // X.InterfaceC82062WIo
    public void Ak(int i) {
        C6MP c6mp;
        InterfaceC82090WJq interfaceC82090WJq = this.LJLLILLLL.LIZIZ;
        if (i != 0) {
            if (i != 2) {
                if (i != 6) {
                    if (i != 19) {
                        c6mp = C6MP.EMPTY;
                    } else {
                        c6mp = C6MP.FLASH;
                    }
                } else {
                    c6mp = C6MP.BEAUTY;
                }
            } else {
                c6mp = C6MP.M_BEAUTY;
            }
        } else {
            c6mp = C6MP.REVERSE;
        }
        interfaceC82090WJq.LIZIZ(c6mp);
    }

    @Override // X.InterfaceC82118WKs
    public void Ep0(boolean z) {
        if (z) {
            LJJZZI(WKI.LJLIL);
        } else {
            LJJZZI(WKJ.LJLIL);
        }
    }

    @Override // X.InterfaceC82062WIo
    public void Js(boolean z) {
        if (z) {
            LJJZZI(WKK.LJLIL);
        } else {
            LJJZZI(WKL.LJLIL);
        }
    }

    public final boolean LLJJIJIL(CharSequence charSequence) {
        return o.LJ(I38.PHOTO_SHORT.getTag(), charSequence);
    }

    public final void LLJJL(C82028WHg c82028WHg) {
        String str;
        if (c82028WHg.LJLIL == EnumC79548VJw.BIND_VIEW && getShortVideoContext() != null && c82028WHg.LJLILLLLZI != null) {
            ShortVideoContext shortVideoContext = getShortVideoContext();
            if (shortVideoContext != null) {
                C6MP c6mp = c82028WHg.LJLILLLLZI;
                if (c6mp != null) {
                    switch (C6MQ.LIZ[c6mp.ordinal()]) {
                        case 1:
                            str = "flip";
                            break;
                        case 2:
                            str = "speed";
                            break;
                        case 3:
                            str = "mbeauty";
                            break;
                        case 4:
                            str = "filters";
                            break;
                        case 5:
                            str = "beauty";
                            break;
                        case 6:
                            str = "timer";
                            break;
                        case 7:
                            str = "duet_layout";
                            break;
                        case 8:
                            str = "mic";
                            break;
                        case 9:
                            str = "voice_change";
                            break;
                        case 10:
                            str = "wide";
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            str = "cut_music";
                            break;
                        case 12:
                            str = "library";
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            str = "reply";
                            break;
                        case 14:
                            str = "add_yours";
                            break;
                        case 15:
                            str = "flash";
                            break;
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            str = "ai_enhance";
                            break;
                        case 17:
                            str = "shake_free";
                            break;
                        case 18:
                            str = "more";
                            break;
                        case 19:
                            str = "switch";
                            break;
                        default:
                            str = "";
                            break;
                    }
                    ArrayList arrayList = (ArrayList) HKZ.LIZ;
                    if (arrayList.contains(str)) {
                        return;
                    }
                    arrayList.add(str);
                    if (C48331Ixz.LJ() || C48331Ixz.LIZIZ()) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("icon_name", str);
                        c188727au.LJIIIZ("content_type", shortVideoContext.LIZLLL().getContentType());
                        c188727au.LJIIIZ("content_source", shortVideoContext.LIZLLL().getContentSource());
                        c188727au.LJIIIZ("shoot_way", shortVideoContext.shootWay);
                        c188727au.LJIIIZ("enter_from", "video_shoot_page");
                        c188727au.LJIIIZ("creation_id", shortVideoContext.LJI());
                        FMX.LJIIL("shoot_page_icon_show", c188727au.LIZ);
                    }
                    if (!o.LJ(str, "voice_change")) {
                        return;
                    }
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("creation_id", shortVideoContext.LJI());
                    c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
                    c145995oB.LJI("enter_from", "video_shoot_page");
                    c145995oB.LJI("content_source", shortVideoContext.LIZLLL().getContentSource());
                    c145995oB.LJI("content_type", shortVideoContext.LIZLLL().getContentType());
                    FMX.LJIIL("voice_effect_entrance_show", c145995oB.LIZ);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final boolean LLJLIL(boolean z) {
        if (!o.LJ(getShortVideoContext().enterFrom, "effect_qr_scan") && getCameraApiComponent().H1().LIZIZ(getCameraApiComponent().rX().getCameraController(), z)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC82062WIo
    public void M0(int i) {
        LJJZZI(new AqS38S0001000_14(i, 2));
    }

    @Override // X.InterfaceC82062WIo
    public void e4(boolean z) {
        LJJZZI(new AqS18S0010000_14(z, 3));
    }

    private final void LLILL(C6MP c6mp, boolean z) {
        WI1 LJFF = this.LLIIIL.LJFF(c6mp);
        if (LJFF != null) {
            LJFF.LIZ(new WI0(LJFF.LIZJ().LJLIL, WJV.LIZ().LJIIJJI(), z));
        }
        this.LLIIIL.LJIIJJI();
    }

    public final boolean LLIIZ(Activity activity, CharSequence charSequence) {
        if (this.LLIIII == null) {
            List LJJIJIIJI = C47261Igj.LJJIJIIJI(I38.RECORD_COMBINE.getTag(), I38.RECORD_COMBINE_15.getTag(), I38.RECORD_COMBINE_60.getTag(), I38.PHOTO_SHORT.getTag(), I38.RECORD_LIGHTENING_VIDEO.getTag());
            ArrayList arrayList = new ArrayList();
            Iterator it = LJJIJIIJI.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayList.add("RecordCombinePhoto");
            this.LLIIII = arrayList;
            this.LLIIIILZ = I38.PHOTO_SHORT.getTag();
        }
        List<? extends CharSequence> list = this.LLIIII;
        if (list != null) {
            return list.contains(charSequence);
        }
        o.LJIJI("tabs");
        throw null;
    }

    public final void LLILZIL(C6MP c6mp, boolean z) {
        WI1 LJFF = this.LLIIIL.LJFF(c6mp);
        if (LJFF != null) {
            LJFF.LIZ(new WI0(LJFF.LIZJ().LJLIL, LJFF.LIZJ().LJLILLLLZI, z));
        }
    }

    @Override // X.InterfaceC82062WIo
    public void zD(C6MP iconType, String path, OSZ<String, String> kevaPair) {
        o.LJIIIZ(iconType, "iconType");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(kevaPair, "kevaPair");
        LJJZZI(new AqS45S1200000_2(iconType, (C6MP) path, (String) kevaPair, (OSZ<String, String>) 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C82096WJw(WMH parentScene, C82622Wbi diContainer, C148425s6 toolbarManager, InterfaceC88472Yns<? super LifecycleOwner, C76800UCe> initAssem) {
        super(parentScene);
        boolean z;
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(toolbarManager, "toolbarManager");
        o.LJIIIZ(initAssem, "initAssem");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = toolbarManager;
        this.LJLLJ = initAssem;
        this.LJLLL = new AqS164S0100000_14(this, 79);
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), C45313HqP.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJZI = (InterfaceC45999I3n) getDiContainer().LJ(InterfaceC45999I3n.class, null);
        this.LJZL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LL = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LLD = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LLF = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LLFF = UCI.LJII(getDiContainer(), C46193IAz.class, null);
        this.LLFFF = UCI.LJI(getDiContainer(), Activity.class, null);
        WKP wkp = new WKP(new C82040WHs(getShortVideoContext()));
        this.LLII = wkp;
        getShortVideoContext();
        if (wkp.LIZ() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLIIIJ = z;
        this.LLIIIL = toolbarManager.LIZ;
        this.LLIIIZ = 2;
        this.LLIIJLIL = new AqS164S0100000_14(this, 77);
        this.LLIIL = new AqS164S0100000_14(this, 78);
        this.LLIILII = new MutableLiveData();
        this.LLIILZL = this;
        this.LLIIZ = 1;
    }
}
