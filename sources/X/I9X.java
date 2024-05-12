package X;

import X.I3X;
import Y.AObjectS117S0200000_7;
import Y.AObjectS70S0300000_7;
import Y.AObjectS86S0100000_7;
import Y.ARunnableS11S0101000_7;
import Y.ARunnableS26S0200000_7;
import Y.ARunnableS43S0100000_7;
import android.graphics.Bitmap;
import com.bytedance.RxLiveEvent;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.vesdk.VEInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AqS107S0101000_7;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class I9X<T extends I3X> extends AbstractC29891Fh<T> implements InterfaceC135635Tz, I3X {
    public static final /* synthetic */ InterfaceC74236TBo[] LLLILZLLLI;
    public static final IA9 LLLIZZ;
    public final C46144I9c LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final CameraComponentModel LJLJJI;
    public final SafeHandler LJLJJL;
    public final C29901Fi<C76800UCe> LJLJJLL;
    public final C29901Fi<C76800UCe> LJLJL;
    public final C29901Fi<C76800UCe> LJLJLJ;
    public final C29901Fi<HYN> LJLJLLL;
    public final C29901Fi<HYN> LJLL;
    public final C29901Fi<HJ3> LJLLI;
    public final C5H3 LJLLILLLL;
    public final C29901Fi<Long> LJLLJ;
    public final C29901Fi<C76800UCe> LJLLL;
    public final C29901Fi<IA8> LJLLLL;
    public final C29901Fi<HashMap<String, String>> LJLLLLLL;
    public final C29901Fi<C76800UCe> LJLZ;
    public final C29901Fi<C76800UCe> LJZ;
    public final C29901Fi<C35362DuI> LJZI;
    public final C40871j1<IAO> LJZL;
    public final C29901Fi<I9L> LL;
    public final C29901Fi<I9L> LLD;
    public final C29901Fi<I9L> LLF;
    public final C29901Fi<C76800UCe> LLFF;
    public final C29901Fi<TimeSpeedModelExtension> LLFFF;
    public final C29901Fi<C76800UCe> LLFII;
    public final C29901Fi<C76800UCe> LLFZ;
    public final C29901Fi<C44302Ha6> LLI;
    public final C29901Fi<C44237HXt> LLIFFJFJJ;
    public final C40871j1<Boolean> LLII;
    public final C40871j1<Boolean> LLIIII;
    public final C40871j1<Boolean> LLIIIILZ;
    public final C40871j1<Boolean> LLIIIJ;
    public final C40871j1<Boolean> LLIIIL;
    public final C40871j1<Boolean> LLIIIZ;
    public final List<C40871j1<Boolean>> LLIIJI;
    public final C40871j1<Boolean> LLIIJLIL;
    public final C29901Fi<C76800UCe> LLIIL;
    public final C29901Fi<C76800UCe> LLIILII;
    public final C29901Fi<C124334uL> LLIILZL;
    public final C40871j1<Long> LLIIZ;
    public final C40871j1<Boolean> LLIL;
    public final java.util.Map<Class<Object>, IA5> LLILII;
    public Class<Object> LLILIL;
    public I3Z LLILL;
    public String LLILLIZIL;
    public boolean LLILLJJLI;
    public final boolean LLILLL;
    public String LLILZ;
    public final C43598H9e LLILZIL;
    public final C5H3 LLILZLL;
    public final C5H3 LLIZ;
    public final C5H3 LLIZLLLIL;
    public final C5H3 LLJ;
    public final C5H3 LLJI;
    public int LLJIJIL;
    public final T LLJILJIL;
    public InterfaceC65784Pro<Boolean> LLJILJILJ;
    public final C73893SzJ<HYI> LLJILLL;
    public final LiveEvent<C76800UCe> LLJJ;
    public final LiveEvent<C76800UCe> LLJJI;
    public final LiveEvent<C76800UCe> LLJJIII;
    public final LiveEvent<HYN> LLJJIJI;
    public final LiveEvent<HYN> LLJJIJIIJIL;
    public final C0IB<Boolean> LLJJIJIL;
    public final C0IB<Boolean> LLJJJ;
    public final C40871j1<Boolean> LLJJJIL;
    public final C0IB<Boolean> LLJJJJ;
    public final C0IB<Boolean> LLJJJJJIL;
    public final C0IB<Boolean> LLJJJJLIIL;
    public final C0IB<Boolean> LLJJL;
    public final C0IB<Boolean> LLJJLIIIJLLLLLLLZ;
    public final C29901Fi<Boolean> LLJL;
    public I3Y LLJLIL;
    public final C5H3 LLJLILLLLZIIL;
    public final LiveEvent<Long> LLJLL;
    public final LiveEvent<C76800UCe> LLJLLIL;
    public final LiveEvent<IA8> LLJLLL;
    public final LiveEvent<HashMap<String, String>> LLJZ;
    public final LiveEvent<C76800UCe> LLJZIJLIL;
    public final LiveEvent<C76800UCe> LLL;
    public final C73893SzJ<I9F> LLLF;
    public final LiveEvent<C35362DuI> LLLFF;
    public final LiveEvent<C76800UCe> LLLFFI;
    public final LiveEvent<C44302Ha6> LLLFZ;
    public final LiveEvent<I9L> LLLI;
    public final LiveEvent<C44237HXt> LLLII;
    public final LiveEvent<I9L> LLLIIII;
    public final LiveEvent<I9L> LLLIIIIL;
    public final LiveEvent<C76800UCe> LLLIIIL;
    public final C0IB<IAO> LLLIIL;
    public final LiveEvent<TimeSpeedModelExtension> LLLIILIL;
    public final LiveEvent<HJ3> LLLIL;
    public final LiveEvent<C76800UCe> LLLILZ;
    public final C82622Wbi LLLILZJ;

    static {
        TBT tbt = new TBT(I9X.class, "activity", "getActivity()Landroidx/appcompat/app/AppCompatActivity;", 0);
        C65352Pkq.LIZ.getClass();
        LLLILZLLLI = new InterfaceC74236TBo[]{tbt, new TBT(I9X.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};
        LLLIZZ = new IA9();
    }

    private final void LJJLJLI() {
        LJJZ(false);
    }

    private final C46155I9n LLIIZ() {
        return (C46155I9n) this.LLIZ.getValue();
    }

    private final I9E LLILL() {
        return (I9E) this.LLJI.getValue();
    }

    private final C46142I9a LLJ() {
        return (C46142I9a) this.LLJ.getValue();
    }

    public final C29S LLIIIL() {
        return (C29S) this.LJLILLLLZI.LIZ(this, LLLILZLLLI[0]);
    }

    public final C40871j1<Boolean> LLILZIL() {
        return (C40871j1) this.LJLLILLLL.getValue();
    }

    public final I9X<T>.c LLILZLL() {
        return (c) this.LLILZLL.getValue();
    }

    public final C46143I9b LLIZ() {
        return (C46143I9b) this.LLIZLLLIL.getValue();
    }

    @Override // X.I3X
    public void LM(I3Y i3y) {
    }

    @Override // X.I3X
    public void Se0(I3Z interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
    }

    @Override // X.I3X
    public void Tf0() {
        Sk0(0);
        this.LJZ.LJII(C76800UCe.LIZ);
    }

    @Override // X.I3X
    public void cu0() {
        LLJJL(false, true);
        this.LLIIL.LJII(C76800UCe.LIZ);
    }

    @Override // X.I3X
    public C0IB<Boolean> dy() {
        return (C0IB) this.LLJLILLLLZIIL.getValue();
    }

    public final InterfaceC82086WJm getCameraApi() {
        return (InterfaceC82086WJm) this.LJLJI.LIZ(this, LLLILZLLLI[1]);
    }

    @Override // X.I3X
    public I3Y io() {
        return null;
    }

    private final boolean LLLJ() {
        return !this.LLIIJI.isEmpty();
    }

    @Override // X.I3X
    public void Fq0() {
        this.LLIILII.LJII(C76800UCe.LIZ);
    }

    @Override // X.I3X
    public long I8() {
        Long LIZ = this.LLIIZ.LIZ();
        o.LJIIIIZZ(LIZ, "this.autoStopTimeInternal.value");
        return LIZ.longValue();
    }

    @Override // X.I3X
    public void JW() {
        this.LJLJLJ.LJII(C76800UCe.LIZ);
    }

    public final void LJJLJ() {
        this.LJLJL.LJII(C76800UCe.LIZ);
    }

    public final void LJJZZIII() {
        if (!this.LJLJJI.isRetakeMode) {
            this.LLJJJIL.LJI(Boolean.FALSE);
        }
    }

    public final void LJLLILLLL() {
        this.LJLJJL.post(new ARunnableS43S0100000_7(this, 43));
    }

    @Override // X.I3X
    public AbstractC73672Svk<HYI> NX() {
        C73893SzJ<HYI> c73893SzJ = this.LLJILLL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.I3X
    public AbstractC73672Svk<I9F> Pr0() {
        C73893SzJ<I9F> c73893SzJ = this.LLLF;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.I3X
    public void Yr() {
        this.LLFII.LJII(C76800UCe.LIZ);
    }

    @Override // X.I3X
    public void nQ() {
        this.LJLZ.LJII(C76800UCe.LIZ);
    }

    @Override // X.I3X
    public void qc0() {
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C43856HJc(this, null), 2);
    }

    private final EnumC82528WaC LJJLIIIJJI() {
        return getCameraApi().getSpeed();
    }

    private final InterfaceC83624Wrs LLJLLIL() {
        return getCameraApi().e8();
    }

    private final int getCameraFacing() {
        return getCameraApi().getCameraFacing();
    }

    private final String n40() {
        return getCameraApi().n40();
    }

    public final InterfaceC83624Wrs LJJLIIIJILLIZJL() {
        return getCameraApi().e8();
    }

    public final void LJJZZI() {
        C46144I9c c46144I9c;
        IAD iad;
        if (w10().invoke().booleanValue() && (iad = (c46144I9c = this.LJLIL).LJIIIZ) != null) {
            iad.LIZ(c46144I9c.LJII);
        }
    }

    public final void LJLLL() {
        BackgroundVideo backgroundVideo;
        C46155I9n LLIIZ = LLIIZ();
        BackgroundVideo backgroundVideo2 = LLIIZ.LIZIZ.curBackgroundVideo;
        if (backgroundVideo2 != null) {
            long maxDuration = backgroundVideo2.getMaxDuration();
            if (maxDuration > 0 && (backgroundVideo = LLIIZ.LIZIZ.curBackgroundVideo) != null && !backgroundVideo.isMultiBgVideo()) {
                long min = LLIIZ.LIZIZ.mTotalRecordingTime + Math.min(LLIIZ.LIZJ.LIZ(LLIIZ.LIZIZ), maxDuration);
                C5NP LIZLLL = C82891Wg3.LIZLLL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("changeShootDuration maxDuration=");
                LIZ.append(min);
                LIZLLL.i(X1D.LIZIZ(LIZ));
                LLIIZ.LIZIZ.mMaxDuration = min;
                LLIIZ.LIZ.vK(new C44302Ha6(min));
            }
        }
    }

    public final void LLIFFJFJJ() {
        C82891Wg3.LIZLLL().d("forceStopRecord() called");
        if (Ue0().LIZ().booleanValue()) {
            Boolean LIZ = Dk().LIZ();
            o.LJIIIIZZ(LIZ, "countDownState.value");
            if (!LIZ.booleanValue()) {
                return;
            }
        }
        C82891Wg3.LIZLLL().d("real forceStopRecord() called");
        I9L i9l = new I9L("forceStopRecord");
        i9l.LIZIZ = true;
        Ec0(i9l);
    }

    public final HC5 LLLLJI() {
        return getCameraApi().Xq();
    }

    @Override // X.I3X
    public void kS() {
        LJJLIIIJILLIZJL().LLLZ(LLILZLL());
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getCameraApi().Wl0().LIZLLL(this, new AObjectS86S0100000_7(this, 68));
        this.LLII.LIZIZ(this, new AObjectS86S0100000_7(this, 69));
        this.LLIL.LIZIZ(this, new AObjectS86S0100000_7(this, 70));
        getCameraApi().mX().LIZLLL(this, new AObjectS86S0100000_7(this, 71));
        getCameraApi().HJ().LIZLLL(this, new AObjectS86S0100000_7(this, 72));
        LJJLIIIJILLIZJL().LIZIZ(new AqS173S0100000_7(this, 147));
        this.LLIIIILZ.LJI(Boolean.FALSE);
        this.LLILLJJLI = true;
        C46144I9c c46144I9c = this.LJLIL;
        if (c46144I9c.LJIIIZ == null) {
            c46144I9c.LJIIIZ = new C83649WsH(getCameraApi());
        }
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        LLIFFJFJJ();
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        this.LLIIIILZ.LJI(Boolean.FALSE);
        this.LLILLJJLI = true;
    }

    @Override // X.I3X
    public void w30() {
        HC5 LLLLJI = LLLLJI();
        InterfaceC83966WxO LJFF = ((XFZ) C83739Wtj.LIZIZ()).LJFF();
        String stackTraceString = android.util.Log.getStackTraceString(new Throwable());
        o.LJIIIIZZ(stackTraceString, "Log.getStackTraceString(Throwable())");
        LJFF.LIZ(stackTraceString);
        HCA LIZIZ = this.LJLJJI.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "cameraComponentModel.curShootingSegments");
        int size = LIZIZ.size();
        for (int i = 0; i < size; i++) {
            LJJLIIIJILLIZJL().LLZZZIL(null, C46161I9t.LJLIL);
        }
        Workspace workspace = this.LJLJJI.mWorkspace;
        o.LJIIIIZZ(workspace, "cameraComponentModel.mWorkspace");
        File y = workspace.y();
        o.LJIIIIZZ(y, "cameraComponentModel.mWorkspace.recordingDirectory");
        C44687HgJ.LJIIL(new File(y.getPath()));
        CameraComponentModel cameraComponentModel = this.LJLJJI;
        if (cameraComponentModel.mRestoreType != 1 && !cameraComponentModel.isRetakeMode) {
            ((C43786HGk) LLLLJI).LIZ.removeFileAndResetData();
        }
        C43786HGk c43786HGk = (C43786HGk) LLLLJI;
        c43786HGk.LIZIZ = false;
        c43786HGk.LIZ = new ExtractFramesModel(c43786HGk.LJIILIIL);
        c43786HGk.LIZJ = AnonymousClass629.LIZ("UUID.randomUUID().toString()");
        ScheduledExecutorService scheduledExecutorService = c43786HGk.LJI;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    @Override // X.I3X
    public void xm() {
        LJJLIIIJILLIZJL().LLLLLLLLL(LLILZLL());
    }

    @Override // X.I3X
    public C0IB<Boolean> AY() {
        return this.LLJJJJJIL;
    }

    @Override // X.I3X
    public /* bridge */ /* synthetic */ LiveEvent B2() {
        return this.LLJL;
    }

    @Override // X.I3X
    public LiveEvent<C76800UCe> Bu0() {
        return this.LLIIL;
    }

    @Override // X.I3X
    public C0IB<Boolean> D80() {
        return this.LLJJJJLIIL;
    }

    @Override // X.I3X
    public C0IB<Boolean> Dk() {
        return this.LLJJL;
    }

    @Override // X.I3X
    public LiveEvent<I9L> Fh0() {
        return this.LLLIIII;
    }

    @Override // X.I3X
    public LiveEvent<C76800UCe> Gg0() {
        return this.LLJZIJLIL;
    }

    @Override // X.I3X
    public C43598H9e J0() {
        return this.LLILZIL;
    }

    @Override // X.I3X
    public LiveEvent<C35362DuI> KG() {
        return this.LLLFF;
    }

    @Override // X.AbstractC29891Fh
    /* renamed from: LLIILZL, reason: merged with bridge method [inline-methods] */
    public T getApiComponent() {
        return this.LLJILJIL;
    }

    @Override // X.I3X
    public LiveEvent<C76800UCe> Li() {
        return this.LLJJI;
    }

    @Override // X.I3X
    public LiveEvent<IA8> Ma0() {
        return this.LLJLLL;
    }

    @Override // X.I3X
    public LiveEvent<I9L> Qr0() {
        return this.LLLI;
    }

    @Override // X.I3X
    public LiveEvent<HJ3> Ra0() {
        return this.LLLIL;
    }

    @Override // X.I3X
    public LiveEvent<TimeSpeedModelExtension> Rr0() {
        return this.LLLIILIL;
    }

    @Override // X.I3X
    public boolean Ry() {
        return this.LLILLL;
    }

    @Override // X.I3X
    public LiveEvent<C76800UCe> UG() {
        return this.LLJLLIL;
    }

    @Override // X.I3X
    public C0IB<Boolean> UY() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.I3X
    public C0IB<Boolean> Ue0() {
        return this.LLJJIJIL;
    }

    @Override // X.I3X
    public C0IB<IAO> Vh() {
        return this.LLLIIL;
    }

    @Override // X.I3X
    public LiveEvent<C76800UCe> Xp() {
        return this.LLIILII;
    }

    @Override // X.I3X
    public LiveEvent<I9L> aL() {
        return this.LLLIIIIL;
    }

    @Override // X.I3X
    public LiveEvent<C44302Ha6> aa0() {
        return this.LLLFZ;
    }

    @Override // X.I3X
    public LiveEvent<C124334uL> ax() {
        return this.LLIILZL;
    }

    @Override // X.I3X
    public LiveEvent<HYN> ck0() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.I3X
    public LiveEvent<C44237HXt> cr() {
        return this.LLLII;
    }

    @Override // X.I3X
    public LiveEvent<C76800UCe> eV() {
        return this.LLJJIII;
    }

    @Override // X.I3X
    public LiveEvent<C76800UCe> fb0() {
        return this.LLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LLLILZJ;
    }

    @Override // X.I3X
    public C0IB<Boolean> isLoading() {
        return this.LLJJJJ;
    }

    @Override // X.I3X
    public C0IB<Boolean> isRecording() {
        return this.LLJJJ;
    }

    @Override // X.I3X
    public LiveEvent<C76800UCe> kX() {
        return this.LLLIIIL;
    }

    @Override // X.I3X
    public LiveEvent<HashMap<String, String>> np0() {
        return this.LLJZ;
    }

    @Override // X.I3X
    public LiveEvent<C76800UCe> qu0() {
        return this.LLLFFI;
    }

    @Override // X.I3X
    public LiveEvent<C76800UCe> s10() {
        return this.LLJJ;
    }

    @Override // X.I3X
    public /* bridge */ /* synthetic */ C0IB t5() {
        return this.LLJJJIL;
    }

    @Override // X.I3X
    public String uf0() {
        return this.LLILZ;
    }

    @Override // X.I3X
    public String ve() {
        return this.LLILLIZIL;
    }

    @Override // X.I3X
    public LiveEvent<C76800UCe> vf0() {
        return this.LLLILZ;
    }

    @Override // X.I3X
    public InterfaceC65784Pro<Boolean> w10() {
        return this.LLJILJILJ;
    }

    @Override // X.I3X
    public LiveEvent<HYN> w90() {
        return this.LLJJIJI;
    }

    @Override // X.I3X
    public LiveEvent<Long> xu() {
        return this.LLJLL;
    }

    @Override // X.I3X
    /* renamed from: I8 */
    public C0IB<Long> mo21I8() {
        return this.LLIIZ;
    }

    /* loaded from: classes8.dex */
    public final class c implements IAF {
        public long LJLIL = -100;
        public int LJLILLLLZI;

        public c() {
        }

        @Override // X.InterfaceC133905Ni
        public final void LIZ(int i, int i2, float f, String str) {
            if (i != VEInfo.TE_RECORD_INFO_RECORDING_CLIP_TIMESTAMP) {
                return;
            }
            long j = f / 1000;
            if (j == this.LJLIL || j == 0) {
                return;
            }
            int i3 = this.LJLILLLLZI + 1;
            this.LJLILLLLZI = i3;
            if (i3 < C82894Wg6.LIZIZ.LJIIIZ()) {
                return;
            }
            this.LJLILLLLZI = 0;
            this.LJLIL = j;
            I9X.this.LJLJJL.post(new IAH(this, j));
        }
    }

    private final long LJJLIIIIJ(long j) {
        long calculateRealTime;
        long LIZLLL;
        if (this.LJLJJI.recordMode == 1) {
            calculateRealTime = TimeSpeedModelExtension.calculateRealTime(j, EnumC82528WaC.NORMAL.value());
            LIZLLL = this.LJLJJI.LIZLLL();
        } else {
            calculateRealTime = TimeSpeedModelExtension.calculateRealTime(j, LJJLIIIJJI().value());
            LIZLLL = this.LJLJJI.LIZLLL();
        }
        return LIZLLL + calculateRealTime;
    }

    private final void LLLFFI(String str) {
        int flashMode;
        if (getCameraApi().ph0()) {
            flashMode = getCameraApi().Nc();
        } else {
            flashMode = getCameraApi().getFlashMode();
        }
        if (getCameraFacing() == 1) {
            if (flashMode != 0) {
                if (flashMode != 1) {
                    if (flashMode != 2) {
                        return;
                    }
                    this.LJLLLL.LJII(new IA8(str));
                    return;
                }
                this.LJLLLL.LJII(new IA8(str));
                return;
            }
            this.LJLLLL.LJII(new IA8(str));
            return;
        }
        if (flashMode != 0) {
            if (flashMode != 1) {
                if (flashMode != 2) {
                    return;
                }
                C29901Fi<IA8> c29901Fi = this.LJLLLL;
                getCameraApi().Al();
                c29901Fi.LJII(new IA8(str));
                return;
            }
            C29901Fi<IA8> c29901Fi2 = this.LJLLLL;
            getCameraApi().Al();
            c29901Fi2.LJII(new IA8(str));
            return;
        }
        this.LJLLLL.LJII(new IA8(str));
    }

    private final boolean LLLILZLLLI(long j) {
        long I8 = I8();
        if (I8 > 0 && I8 < this.LJLJJI.LJ() && j > I8) {
            return true;
        }
        return false;
    }

    @Override // X.I3X
    public void Ah0(HYN event) {
        o.LJIIIZ(event, "event");
        LLJLIL(this, false, false, 3, null);
        this.LJLJJLL.LJII(null);
        if (getCameraApi().e8().getMediaController().O8()) {
            C82891Wg3.LIZLLL().i("startRecording but is pre playing wait for preplay stop");
            getCameraApi().e8().getMediaController().R8().observe(this, new AObjectS117S0200000_7(this, event, 2));
        } else {
            LLLJIL(event);
        }
    }

    @Override // X.I3X
    public void C60(String value) {
        o.LJIIIZ(value, "value");
        this.LLILLIZIL = value;
    }

    @Override // X.I3X
    public void CW(String str) {
        this.LLILZ = str;
    }

    @Override // X.I3X
    public void D2(boolean z) {
        this.LLJL.LJII(Boolean.valueOf(z));
    }

    @Override // X.I3X
    public void DG(Class<Object> actionType) {
        o.LJIIIZ(actionType, "actionType");
        this.LLILIL = actionType;
    }

    @Override // X.I3X
    public void Ec0(I9L event) {
        o.LJIIIZ(event, "event");
        LLJ().onEvent(event);
    }

    @Override // X.I3X
    public void Ej0(boolean z) {
        this.LLIIJLIL.LJI(Boolean.valueOf(z));
    }

    @Override // X.I3X
    public void JE(C46156I9o event) {
        o.LJIIIZ(event, "event");
        Boolean LIZ = this.LLIIIILZ.LIZ();
        Boolean bool = Boolean.TRUE;
        if (o.LJ(LIZ, bool)) {
            return;
        }
        System.currentTimeMillis();
        C43598H9e J0 = J0();
        String str = event.LIZ;
        o.LJIIIIZZ(str, "event.reason");
        J0.LIZ = C43597H9d.L(J0.LIZ, 0L, 0L, str, 3);
        this.LLILLJJLI = false;
        this.LLIIIILZ.LJI(bool);
        if (!this.LLIIIJ.LIZ().booleanValue() || !this.LLIIIL.LIZ().booleanValue() || !this.LLIIIZ.LIZ().booleanValue()) {
            this.LLIIJI.clear();
            LJZI(this, this.LLIIIJ, event, false, 4, null);
            LJLZ(this.LLIIIL, event, true);
            LJLZ(this.LLIIIZ, event, true);
            return;
        }
        if (this.LJLJJI.LJII()) {
            LJJLIIIJILLIZJL().setMusicPath(this.LJLJJI.getMusicPath());
        }
        IA5 ia5 = this.LLILII.get(this.LLILIL);
        if (ia5 != null) {
            ia5.LIZ(event);
        }
    }

    public final void LJJLI(int i) {
        IAA iaa = this.LJLIL.LJ;
        if (iaa != null) {
            InterfaceC83624Wrs LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            new AqS107S0101000_7(this, i, 3);
            iaa.LIZ(LJJLIIIJILLIZJL);
        }
        LLLJL(i);
    }

    public final void LJJLIIIJJIZ(I9L event) {
        o.LJIIIZ(event, "event");
        LJJLIIIJILLIZJL().LLZZZIL(new AqS154S0200000_7(this, event, 40), new AqS138S0200000_7(this, event, 26));
        InterfaceC83966WxO LJFF = ((XFZ) C83739Wtj.LIZIZ()).LJFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StopRecordingCommandEvent, recordState=");
        LIZ.append(event.LIZ);
        LJFF.LIZ(X1D.LIZIZ(LIZ));
        InterfaceC83966WxO LJFF2 = ((XFZ) C83739Wtj.LIZIZ()).LJFF();
        String stackTraceString = android.util.Log.getStackTraceString(new Throwable());
        o.LJIIIIZZ(stackTraceString, "Log.getStackTraceString(Throwable())");
        LJFF2.LIZ(stackTraceString);
    }

    public final void LJJLIIIJLLLLLLLZ(TimeSpeedModelExtension timeSpeedModelExtension) {
        this.LLFFF.LJII(timeSpeedModelExtension);
    }

    public final void LJJLIIJ(HYI event) {
        o.LJIIIZ(event, "event");
        this.LLJILLL.onNext(event);
        if (event instanceof HYK) {
            getCameraApi().bh().LIZIZ(this, new AObjectS117S0200000_7(this, event, 3));
        }
    }

    public final void LJJLL(IAO iao) {
        this.LJZL.LJI(iao);
        if (iao != null) {
            if (iao.LJLILLLLZI > 0 || this.LJLJJI.isRetakeMode) {
                this.LLJJJIL.LJI(Boolean.TRUE);
            }
            IAO.LJLJJL.LIZ(iao);
        }
    }

    @Override // X.I3X
    public void LJJZ(boolean z) {
        LLILZIL().LJI(Boolean.valueOf(z));
    }

    public final void LJLIIL(I9F event) {
        o.LJIIIZ(event, "event");
        this.LLLF.onNext(event);
    }

    public final void LJLJJL(HYN event) {
        o.LJIIIZ(event, "event");
        if (!this.LJLIL.LJIILIIL.invoke().booleanValue()) {
            new RunnableC46146I9e(this).run();
        } else if (!this.LJLIL.LJIIZILJ.invoke().booleanValue()) {
            xm();
        }
        getCameraApi().Eg();
        event.LIZJ.putInt("cameraId", getCameraFacing());
        event.LIZJ.putString("cameraLensInfo", n40());
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set hasStopped to false, cur Speed: ");
        LIZ.append(event.LIZ);
        LIZLLL.d(X1D.LIZIZ(LIZ));
        this.LJLJLLL.LJII(event);
        this.LJLJJI.LIZIZ().begin(event.LIZ, event.LIZJ, event.LIZLLL);
    }

    public final void LJLJJLL(I9L event) {
        List<String> list;
        List<String> list2;
        HCC hcc;
        SavePhotoStickerInfo savePhotoStickerInfo;
        o.LJIIIZ(event, "event");
        if (getCameraApi().Al()) {
            getCameraApi().s9(0);
        }
        getCameraApi().J2(true);
        this.LLD.LJII(event);
        long endFrameTimeUS = LJJLIIIJILLIZJL().getEndFrameTimeUS() / 1000;
        long j = 0;
        if (endFrameTimeUS >= 0) {
            HCA LIZIZ = this.LJLJJI.LIZIZ();
            HJY hjy = event.LIZJ;
            if (hjy != null) {
                list = hjy.LJLIL;
                list2 = hjy.LJLILLLLZI;
                hcc = hjy.LJLJJI;
                savePhotoStickerInfo = hjy.LJLJI;
            } else {
                list = null;
                list2 = null;
                hcc = null;
                savePhotoStickerInfo = null;
            }
            CameraComponentModel cameraComponentModel = this.LJLJJI;
            j = LIZIZ.end(endFrameTimeUS, null, list, list2, hcc, savePhotoStickerInfo, cameraComponentModel.curBackgroundVideo, cameraComponentModel.curDiyPropVideo, ((C43786HGk) getCameraApi().Xq()).LJFF, event.LIZLLL);
            Float value = getCameraApi().Au().getValue();
            if (value != null && (true ^ o.LJ(value, Float.valueOf(-1.0f)))) {
                this.LJLJJI.latestUsedZoomValue = value.floatValue();
            }
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopRecord: video: duration of this segment: ");
            LIZ.append(j);
            LIZLLL.i(X1D.LIZIZ(LIZ));
            CameraComponentModel cameraComponentModel2 = this.LJLJJI;
            cameraComponentModel2.LJIIJ(cameraComponentModel2.LIZLLL() + j);
            C5NP LIZLLL2 = C82891Wg3.LIZLLL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("stopRecord: video: curShootingTotalTime: ");
            LIZ2.append(this.LJLJJI.LIZLLL());
            LIZLLL2.i(X1D.LIZIZ(LIZ2));
            if (j == -1) {
                try {
                    C5NP LIZLLL3 = C82891Wg3.LIZLLL();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("deleteLastFrag for VE without changing segments for client.reason:");
                    LIZ3.append(event.LJFF);
                    LIZ3.append(",recordState:");
                    LIZ3.append(event.LIZ);
                    LIZ3.append(", segments: ");
                    LIZ3.append(this.LJLJJI.LIZIZ().toString());
                    LIZLLL3.w(X1D.LIZIZ(LIZ3));
                    LJJLIIIJILLIZJL().LLZZZIL(null, C46157I9p.LJLIL);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } else {
            LJJLIIJ(new HYG(endFrameTimeUS));
        }
        LLJJIJI(event, j);
        this.LLF.LJII(event);
        hb0(event);
    }

    public final long LJLJLJ(I9L event) {
        List<String> list;
        List<String> list2;
        HCC hcc;
        SavePhotoStickerInfo savePhotoStickerInfo;
        o.LJIIIZ(event, "event");
        System.currentTimeMillis();
        if (getCameraApi().Al()) {
            getCameraApi().s9(0);
        }
        getCameraApi().J2(true);
        this.LLD.LJII(event);
        long endFrameTimeUS = LJJLIIIJILLIZJL().getEndFrameTimeUS() / 1000;
        long j = 0;
        if (endFrameTimeUS >= 0) {
            HCA LIZIZ = this.LJLJJI.LIZIZ();
            HJY hjy = event.LIZJ;
            if (hjy != null) {
                list = hjy.LJLIL;
                list2 = hjy.LJLILLLLZI;
                hcc = hjy.LJLJJI;
                savePhotoStickerInfo = hjy.LJLJI;
            } else {
                list = null;
                list2 = null;
                hcc = null;
                savePhotoStickerInfo = null;
            }
            CameraComponentModel cameraComponentModel = this.LJLJJI;
            j = LIZIZ.end(endFrameTimeUS, null, list, list2, hcc, savePhotoStickerInfo, cameraComponentModel.curBackgroundVideo, cameraComponentModel.curDiyPropVideo, ((C43786HGk) getCameraApi().Xq()).LJFF, event.LIZLLL);
            Float value = getCameraApi().Au().getValue();
            if (value != null && (true ^ o.LJ(value, Float.valueOf(-1.0f)))) {
                this.LJLJJI.latestUsedZoomValue = value.floatValue();
            }
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopRecord: video: duration of this segment: ");
            LIZ.append(j);
            LIZLLL.i(X1D.LIZIZ(LIZ));
            CameraComponentModel cameraComponentModel2 = this.LJLJJI;
            cameraComponentModel2.LJIIJ(cameraComponentModel2.LIZLLL() + j);
            C5NP LIZLLL2 = C82891Wg3.LIZLLL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("stopRecord: video: curShootingTotalTime: ");
            LIZ2.append(this.LJLJJI.LIZLLL());
            LIZLLL2.i(X1D.LIZIZ(LIZ2));
            if (j == -1) {
                try {
                    C5NP LIZLLL3 = C82891Wg3.LIZLLL();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("deleteLastFrag for VE without changing segments for client.reason:");
                    LIZ3.append(event.LJFF);
                    LIZ3.append(",recordState:");
                    LIZ3.append(event.LIZ);
                    LIZ3.append(", segments: ");
                    LIZ3.append(this.LJLJJI.LIZIZ().toString());
                    LIZLLL3.w(X1D.LIZIZ(LIZ3));
                    LJJLIIIJILLIZJL().LLZZZIL(null, C46158I9q.LJLIL);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } else {
            LJJLIIJ(new HYG(endFrameTimeUS));
        }
        this.LLF.LJII(event);
        hb0(event);
        return j;
    }

    public final void LLJJ(C46156I9o c46156I9o) {
        this.LJLJJL.post(new ARunnableS26S0200000_7(c46156I9o, this, 5));
    }

    public final void LLJJI(C46156I9o c46156I9o) {
        if (LLLJ()) {
            return;
        }
        this.LLIIJLIL.LJI(Boolean.FALSE);
        if (this.LLILII.get(this.LLILIL) != null) {
            IA5 ia5 = this.LLILII.get(this.LLILIL);
            o.LJI(ia5);
            ia5.LIZ(c46156I9o);
            return;
        }
        C82891Wg3.LIZLLL().i("RecordControl goNext nextActionMap curActionType is null");
    }

    public final void LLJJIII(InterfaceC88472Yns<? super IA5, C76800UCe> interfaceC88472Yns) {
        if (LLLJ()) {
            return;
        }
        this.LLIIJLIL.LJI(Boolean.FALSE);
        interfaceC88472Yns.invoke(this.LLILII.get(this.LLILIL));
    }

    public boolean LLJJJIL(long j) {
        if (j >= this.LJLJJI.LJ()) {
            return true;
        }
        return false;
    }

    public final void LLJZIJLIL(int i) {
        LJJLIIJ(new HYE(i));
        if (this.LJLIL.LIZJ) {
            this.LJLJJL.post(new ARunnableS11S0101000_7(i, this, 5));
        }
    }

    public final void LLLFZ(boolean z) {
        this.LLIIIILZ.LJI(Boolean.valueOf(z));
    }

    public final void LLLI(boolean z) {
        this.LLII.LJI(Boolean.valueOf(z));
    }

    public final void LLLIIIL(boolean z) {
        this.LLIIII.LJI(Boolean.valueOf(!z));
    }

    public final void LLLJIL(HYN hyn) {
        C82891Wg3.LIZLLL().i("startRecordingAfterPrePlayStopped");
        LLIZ().onEvent(hyn);
        FV(this.LJLJJI.mCurrentDurationMode, true);
        C05L.LIZJ(4, getCameraApi());
        this.LJLL.LJII(hyn);
        this.LLJJJIL.LJI(Boolean.TRUE);
    }

    public final void LLLJL(int i) {
        HYN hyn = new HYN(LJJLIIIJJI());
        hyn.LIZIZ = i;
        Ah0(hyn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d5, code lost:
    
        if (r6 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLL(long r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9X.LLLL(long):boolean");
    }

    public final void LLLLJ(long j) {
        long j2;
        CameraComponentModel cameraComponentModel = this.LJLJJI;
        if (cameraComponentModel.isRetakeMode) {
            j2 = cameraComponentModel.mRetakeTime;
        } else {
            j2 = cameraComponentModel.mTotalRecordingTime;
        }
        if (j > 0) {
            j2 += TimeSpeedModelExtension.calculateRealTime(j, LJJLIIIJJI().value());
        }
        LJJLL(IAO.LLLLZ(j2, this.LJLJJI.LIZIZ(), false));
    }

    @Override // X.I3X
    public void Oe(HashMap<String, String> info) {
        o.LJIIIZ(info, "info");
        this.LJLLLLLL.LJI(info);
    }

    @Override // X.I3X
    public void Ol(String scene) {
        o.LJIIIZ(scene, "scene");
        LLJLIL(this, true, false, 2, null);
        LLLFFI(scene);
    }

    @Override // X.I3X
    public void Pk(boolean z) {
        this.LLIIIJ.LJI(Boolean.valueOf(z));
    }

    @Override // X.I3X
    public void Sk0(int i) {
        LJJLI(i);
    }

    @Override // X.I3X
    public void Ti0(boolean z) {
        InterfaceC136915Yx interfaceC136915Yx = this.LJLJJI.retakeVideoContext;
        boolean z2 = true;
        if (interfaceC136915Yx != null && ((RetakeVideoContext) interfaceC136915Yx).isAddClips) {
            z2 = false;
        }
        cC(z2);
        this.LJLLI.LJII(new HJ3(z));
    }

    @Override // X.I3X
    public void UF(boolean z) {
        this.LLIIIL.LJI(Boolean.valueOf(z));
    }

    @Override // X.I3X
    public void VE(long j) {
        this.LLIIZ.LJI(Long.valueOf(j));
    }

    @Override // X.I3X
    public void Vp0(boolean z) {
        this.LLILLJJLI = z;
    }

    @Override // X.I3X
    public void cC(boolean z) {
        LJLIIL(I9I.LIZ);
        this.LJLJJI.mWorkspace.LJLIL.LLIIII();
        if (z) {
            w30();
        }
        this.LJLJJI.LIZIZ().clear();
        this.LJLJJI.LJIIJ(0L);
    }

    @Override // X.I3X
    public void hb0(I9L event) {
        o.LJIIIZ(event, "event");
        if (!C47261Igj.LJJIJIIJI(5, 8, 4, 6, 7).contains(Integer.valueOf(event.LIZ))) {
            this.LL.LJII(event);
        }
    }

    @Override // X.I3X
    public void hr(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LLJILJILJ = interfaceC65784Pro;
    }

    @Override // X.I3X
    public void ll0(I9L event) {
        o.LJIIIZ(event, "event");
        LLILL().onEvent(event);
    }

    @Override // X.I3X
    public void mc(boolean z) {
        this.LLIL.LJI(Boolean.valueOf(z));
    }

    @Override // X.I3X
    public void mv(IAO event) {
        o.LJIIIZ(event, "event");
        LJJLL(event);
    }

    @Override // X.I3X
    public void nZ(String str) {
        Boolean LIZ = Ue0().LIZ();
        o.LJIIIIZZ(LIZ, "hasStopped.value");
        if (LIZ.booleanValue() && !this.LLIIII.LIZ().booleanValue()) {
            JE(new C46156I9o("click_next"));
            return;
        }
        if (Ue0().LIZ().booleanValue()) {
            return;
        }
        if (str == null) {
            str = "handleGoNext";
        }
        I9L i9l = new I9L(str);
        i9l.LIZ = 4;
        Ec0(i9l);
    }

    @Override // X.I3X
    public void r10(C44237HXt event) {
        o.LJIIIZ(event, "event");
        this.LLIFFJFJJ.LJII(event);
    }

    @Override // X.I3X
    public void vK(C44302Ha6 event) {
        o.LJIIIZ(event, "event");
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMaxRecordDuration ");
        LIZ.append(event.LIZ);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        this.LLI.LJII(event);
    }

    @Override // X.I3X
    public void vi0(boolean z) {
        this.LLIIIZ.LJI(Boolean.valueOf(z));
    }

    public I9X(C82622Wbi diContainer, InterfaceC88472Yns<? super C46144I9c, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LLLILZJ = diContainer;
        C46144I9c c46144I9c = new C46144I9c(null);
        this.LJLIL = c46144I9c;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c46144I9c);
        }
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), C29S.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJJI = getCameraApi().zZ();
        this.LJLJJL = new SafeHandler(this);
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLJJLL = c29901Fi;
        C29901Fi<C76800UCe> c29901Fi2 = new C29901Fi<>();
        this.LJLJL = c29901Fi2;
        C29901Fi<C76800UCe> c29901Fi3 = new C29901Fi<>();
        this.LJLJLJ = c29901Fi3;
        C29901Fi<HYN> c29901Fi4 = new C29901Fi<>();
        this.LJLJLLL = c29901Fi4;
        C29901Fi<HYN> c29901Fi5 = new C29901Fi<>();
        this.LJLL = c29901Fi5;
        C29901Fi<HJ3> c29901Fi6 = new C29901Fi<>();
        this.LJLLI = c29901Fi6;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS157S0100000_7((I9X) this, 283));
        C29901Fi<Long> c29901Fi7 = new C29901Fi<>();
        this.LJLLJ = c29901Fi7;
        C29901Fi<C76800UCe> c29901Fi8 = new C29901Fi<>();
        this.LJLLL = c29901Fi8;
        C29901Fi<IA8> c29901Fi9 = new C29901Fi<>();
        this.LJLLLL = c29901Fi9;
        C29901Fi<HashMap<String, String>> c29901Fi10 = new C29901Fi<>();
        this.LJLLLLLL = c29901Fi10;
        C29901Fi<C76800UCe> c29901Fi11 = new C29901Fi<>();
        this.LJLZ = c29901Fi11;
        C29901Fi<C76800UCe> c29901Fi12 = new C29901Fi<>();
        this.LJZ = c29901Fi12;
        C29901Fi<C35362DuI> c29901Fi13 = new C29901Fi<>();
        this.LJZI = c29901Fi13;
        C40871j1<IAO> c40871j1 = new C40871j1<>(null);
        this.LJZL = c40871j1;
        C29901Fi<I9L> c29901Fi14 = new C29901Fi<>();
        this.LL = c29901Fi14;
        RxLiveEvent rxLiveEvent = new RxLiveEvent();
        this.LLD = rxLiveEvent;
        C29901Fi<I9L> c29901Fi15 = new C29901Fi<>();
        this.LLF = c29901Fi15;
        C29901Fi<C76800UCe> c29901Fi16 = new C29901Fi<>();
        this.LLFF = c29901Fi16;
        C29901Fi<TimeSpeedModelExtension> c29901Fi17 = new C29901Fi<>();
        this.LLFFF = c29901Fi17;
        C29901Fi<C76800UCe> c29901Fi18 = new C29901Fi<>();
        this.LLFII = c29901Fi18;
        C29901Fi<C76800UCe> c29901Fi19 = new C29901Fi<>();
        this.LLFZ = c29901Fi19;
        RxLiveEvent rxLiveEvent2 = new RxLiveEvent();
        this.LLI = rxLiveEvent2;
        C29901Fi<C44237HXt> c29901Fi20 = new C29901Fi<>();
        this.LLIFFJFJJ = c29901Fi20;
        Boolean bool = Boolean.TRUE;
        C40871j1<Boolean> c40871j12 = new C40871j1<>(bool);
        this.LLII = c40871j12;
        Boolean bool2 = Boolean.FALSE;
        C40871j1<Boolean> c40871j13 = new C40871j1<>(bool2);
        this.LLIIII = c40871j13;
        C40871j1<Boolean> c40871j14 = new C40871j1<>(bool2);
        this.LLIIIILZ = c40871j14;
        this.LLIIIJ = new C40871j1<>(bool);
        C40871j1<Boolean> c40871j15 = new C40871j1<>(bool);
        this.LLIIIL = c40871j15;
        C40871j1<Boolean> c40871j16 = new C40871j1<>(bool);
        this.LLIIIZ = c40871j16;
        this.LLIIJI = new ArrayList();
        C40871j1<Boolean> c40871j17 = new C40871j1<>(bool2);
        this.LLIIJLIL = c40871j17;
        this.LLIIL = new C29901Fi<>();
        this.LLIILII = new C29901Fi<>();
        this.LLIILZL = new C29901Fi<>();
        this.LLIIZ = new C40871j1<>(0L);
        C40871j1<Boolean> c40871j18 = new C40871j1<>(bool2);
        this.LLIL = c40871j18;
        this.LLILII = new HashMap();
        this.LLILIL = HKF.class;
        this.LLILLIZIL = "general";
        this.LLILLJJLI = true;
        this.LLILLL = true;
        this.LLILZIL = new C43598H9e();
        this.LLILZLL = C221108m2.LIZIZ(new AqS157S0100000_7((I9X) this, 284));
        this.LLIZ = C221108m2.LIZIZ(new AqS157S0100000_7((I9X) this, 281));
        this.LLIZLLLIL = C221108m2.LIZIZ(new AqS157S0100000_7((I9X) this, 279));
        this.LLJ = C221108m2.LIZIZ(new AqS157S0100000_7((I9X) this, 280));
        this.LLJI = C221108m2.LIZIZ(new AqS157S0100000_7((I9X) this, 282));
        this.LLJILJIL = this;
        this.LLJILJILJ = C46162I9u.LJLIL;
        this.LLJILLL = new C73893SzJ<>();
        this.LLJJ = c29901Fi;
        this.LLJJI = c29901Fi2;
        this.LLJJIII = c29901Fi3;
        this.LLJJIJI = c29901Fi5;
        this.LLJJIJIIJIL = c29901Fi4;
        this.LLJJIJIL = c40871j12;
        this.LLJJJ = c40871j13;
        this.LLJJJIL = new C40871j1<>(bool2);
        this.LLJJJJ = c40871j17;
        this.LLJJJJJIL = c40871j15;
        this.LLJJJJLIIL = c40871j16;
        this.LLJJL = c40871j18;
        this.LLJJLIIIJLLLLLLLZ = c40871j14;
        this.LLJL = new C29901Fi<>();
        this.LLJLILLLLZIIL = C221108m2.LIZIZ(new AqS157S0100000_7((I9X) this, 278));
        this.LLJLL = c29901Fi7;
        this.LLJLLIL = c29901Fi8;
        this.LLJLLL = c29901Fi9;
        this.LLJZ = c29901Fi10;
        this.LLJZIJLIL = c29901Fi11;
        this.LLL = c29901Fi12;
        this.LLLF = new C73893SzJ<>();
        this.LLLFF = c29901Fi13;
        this.LLLFFI = c29901Fi19;
        this.LLLFZ = rxLiveEvent2;
        this.LLLI = c29901Fi14;
        this.LLLII = c29901Fi20;
        this.LLLIIII = rxLiveEvent;
        this.LLLIIIIL = c29901Fi15;
        this.LLLIIIL = c29901Fi16;
        this.LLLIIL = c40871j1;
        this.LLLIILIL = c29901Fi17;
        this.LLLIL = c29901Fi6;
        this.LLLILZ = c29901Fi18;
    }

    private final void LLJJIJI(I9L i9l, long j) {
        long endFrameTimeUS = LJJLIIIJILLIZJL().getEndFrameTimeUS() / 1000;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZJ = V10.LIZJ("handleEventRecordState,durationSDK:", endFrameTimeUS, ",eventState:");
        LIZJ.append(i9l.LIZ);
        LIZJ.append(",reason:");
        LIZJ.append(i9l.LJFF);
        LIZJ.append(",lastRecordFrameNum:");
        LIZJ.append(LJJLIIIJILLIZJL().getLastRecordFrameNum());
        LIZJ.append(",enableNoLastRecordFrame:");
        LIZJ.append(this.LJLIL.LJIILJJIL.invoke().booleanValue());
        LIZLLL.i(X1D.LIZIZ(LIZJ));
        if (i9l.LIZ == 1 && j != -1) {
            ll0(i9l);
            CameraComponentModel cameraComponentModel = this.LJLJJI;
            cameraComponentModel.mHardEncode = this.LJLIL.LJFF.invoke(cameraComponentModel).intValue();
            return;
        }
        long j2 = 10;
        if ((0 <= endFrameTimeUS && j2 >= endFrameTimeUS) || (LJJLIIIJILLIZJL().getLastRecordFrameNum() <= 0 && !this.LJLIL.LJIILJJIL.invoke().booleanValue())) {
            if (i9l.LIZ == 5) {
                LLJJ(new C46156I9o("stop_record"));
                return;
            } else {
                if (j == -1) {
                    return;
                }
                ll0(i9l);
                return;
            }
        }
        LJJLL(IAO.LLLLZ(this.LJLJJI.LIZLLL(), this.LJLJJI.LIZIZ(), false));
        int i = i9l.LIZ;
        if (i != 2) {
            if (i != 7) {
                if (i != 4) {
                    if (i != 5) {
                        return;
                    }
                    LLJJ(new C46156I9o("stop_record"));
                    return;
                }
                LLJJ(new C46156I9o("click_next"));
                return;
            }
            LLJJ(new C46156I9o("stop_record"));
            return;
        }
        LLJJ(new C46156I9o("record_full"));
    }

    private final void LLJJL(boolean z, boolean z2) {
        int flashMode;
        if (getCameraApi().ph0()) {
            flashMode = getCameraApi().Nc();
        } else {
            flashMode = getCameraApi().getFlashMode();
        }
        if (getCameraFacing() != 1 && getCameraApi().Al()) {
            if (flashMode != 3) {
                getCameraApi().s9(flashMode);
                return;
            } else {
                getCameraApi().sp0(z, this.LJLLLL);
                return;
            }
        }
        if (getCameraFacing() == 1 && getCameraApi().Ho() && !z2) {
            if (flashMode != 1) {
                if (flashMode != 2) {
                    if (flashMode != 3) {
                        return;
                    }
                    getCameraApi().sp0(z, this.LJLLLL);
                    return;
                }
                getCameraApi().Q3(true);
                return;
            }
            getCameraApi().Q3(true);
            return;
        }
        if (getCameraFacing() == 1 || getCameraApi().Al() || flashMode != 3) {
            return;
        }
        getCameraApi().sp0(z, this.LJLLLL);
    }

    @Override // X.I3X
    public void Dd(Class<Object> type, IA5 action) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(action, "action");
        this.LLILII.put(type, action);
    }

    @Override // X.I3X
    public void FV(boolean z, boolean z2) {
        EnumC45965I2f enumC45965I2f;
        if (z) {
            enumC45965I2f = EnumC45965I2f.FORM_60S;
        } else {
            enumC45965I2f = EnumC45965I2f.FORM_15S;
        }
        Ul0(enumC45965I2f, z2);
        this.LJLJJI.mDurationSwitchable = !z2;
    }

    public final void LLJI(C46156I9o event, InterfaceC88472Yns<? super IA5, C76800UCe> callback) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(callback, "callback");
        Boolean LIZ = this.LLIIIILZ.LIZ();
        Boolean bool = Boolean.TRUE;
        if (o.LJ(LIZ, bool)) {
            return;
        }
        System.currentTimeMillis();
        C43598H9e J0 = J0();
        String str = event.LIZ;
        o.LJIIIIZZ(str, "event.reason");
        J0.LIZ = C43597H9d.L(J0.LIZ, 0L, 0L, str, 3);
        this.LLILLJJLI = false;
        this.LLIIIILZ.LJI(bool);
        if (!this.LLIIIJ.LIZ().booleanValue() || !this.LLIIIL.LIZ().booleanValue() || !this.LLIIIZ.LIZ().booleanValue()) {
            this.LLIIJI.clear();
            LLF(this.LLIIIJ, false, callback);
            LLF(this.LLIIIL, true, callback);
            LLF(this.LLIIIZ, true, callback);
            return;
        }
        if (this.LJLJJI.LJII()) {
            LJJLIIIJILLIZJL().setMusicPath(this.LJLJJI.getMusicPath());
        }
        callback.invoke(this.LLILII.get(this.LLILIL));
    }

    public final OSZ<C46156I9o, Integer> LLJJIJIL(I9L event, long j) {
        int i;
        o.LJIIIZ(event, "event");
        long endFrameTimeUS = LJJLIIIJILLIZJL().getEndFrameTimeUS() / 1000;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZJ = V10.LIZJ("handleEventRecordState,durationSDK:", endFrameTimeUS, ",eventState:");
        LIZJ.append(event.LIZ);
        LIZJ.append(",reason:");
        LIZJ.append(event.LJFF);
        LIZJ.append(",lastRecordFrameNum:");
        LIZJ.append(LJJLIIIJILLIZJL().getLastRecordFrameNum());
        LIZJ.append(",enableNoLastRecordFrame:");
        LIZJ.append(this.LJLIL.LJIILJJIL.invoke().booleanValue());
        LIZLLL.i(X1D.LIZIZ(LIZJ));
        C46156I9o c46156I9o = null;
        if (event.LIZ == 1 && j != -1) {
            ll0(event);
            CameraComponentModel cameraComponentModel = this.LJLJJI;
            cameraComponentModel.mHardEncode = this.LJLIL.LJFF.invoke(cameraComponentModel).intValue();
            i = -5001;
        } else {
            long j2 = 10;
            if ((0 <= endFrameTimeUS && j2 >= endFrameTimeUS) || (LJJLIIIJILLIZJL().getLastRecordFrameNum() <= 0 && !this.LJLIL.LJIILJJIL.invoke().booleanValue())) {
                if (event.LIZ == 5) {
                    c46156I9o = new C46156I9o("stop_record");
                    i = 0;
                } else if (j != -1) {
                    ll0(event);
                    i = -5002;
                } else {
                    i = -5003;
                }
            } else {
                LJJLL(IAO.LLLLZ(this.LJLJJI.LIZLLL(), this.LJLJJI.LIZIZ(), false));
                int i2 = event.LIZ;
                if (i2 != 2) {
                    if (i2 != 7) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                i = -5004;
                            } else {
                                c46156I9o = new C46156I9o("stop_record");
                            }
                        } else {
                            c46156I9o = new C46156I9o("click_next");
                        }
                    } else {
                        c46156I9o = new C46156I9o("stop_record");
                    }
                } else {
                    c46156I9o = new C46156I9o("record_full");
                }
                i = 0;
            }
        }
        return new OSZ<>(c46156I9o, Integer.valueOf(i));
    }

    @Override // X.I3X
    public void Ul0(EnumC45965I2f form, boolean z) {
        boolean z2;
        o.LJIIIZ(form, "form");
        C29901Fi<C35362DuI> c29901Fi = this.LJZI;
        if (form == EnumC45965I2f.FORM_60S) {
            z2 = true;
        } else {
            z2 = false;
        }
        c29901Fi.LJII(new C35362DuI(z2, z));
    }

    @Override // X.I3X
    public void nr0(boolean z, boolean z2) {
        cC(z);
        if (this.LJLIL.LJIIJ.invoke(this.LJLJJI).booleanValue()) {
            getCameraApi().jP(new C45314HqQ(3));
        }
        if (!z2) {
            LJLLL();
        }
        LJJLL(IAO.LLLLZ(0L, C61878OQg.INSTANCE, true));
        FV(this.LJLJJI.mCurrentDurationMode, false);
        C40871j1<Boolean> c40871j1 = this.LLIIIILZ;
        Boolean bool = Boolean.FALSE;
        c40871j1.LJI(bool);
        this.LJLLL.LJII(C76800UCe.LIZ);
        if (!this.LJLJJI.isRetakeMode) {
            this.LLJJJIL.LJI(bool);
        }
    }

    @Override // X.I3X
    public void zg(Class<Object> actionType, InterfaceC43847HIt interceptor) {
        IA5 ia5;
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(interceptor, "interceptor");
        if (this.LLILII.containsKey(actionType) && (ia5 = this.LLILII.get(actionType)) != null) {
            ia5.LIZIZ(interceptor);
        }
    }

    private final void LJLZ(C40871j1<Boolean> c40871j1, C46156I9o c46156I9o, boolean z) {
        if (!c40871j1.LIZ().booleanValue()) {
            if (z) {
                this.LLIIJLIL.LJI(Boolean.TRUE);
            }
            c40871j1.LIZ.removeObservers(this);
            this.LLIIJI.add(c40871j1);
            c40871j1.LIZIZ(this, new AObjectS70S0300000_7(this, c40871j1, c46156I9o, 0));
        }
    }

    private final void LLF(C40871j1<Boolean> c40871j1, boolean z, InterfaceC88472Yns<? super IA5, C76800UCe> interfaceC88472Yns) {
        if (!c40871j1.LIZ().booleanValue()) {
            if (z) {
                this.LLIIJLIL.LJI(Boolean.TRUE);
            }
            c40871j1.LIZ.removeObservers(this);
            this.LLIIJI.add(c40871j1);
            c40871j1.LIZIZ(this, new AObjectS70S0300000_7(this, c40871j1, interfaceC88472Yns, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.I3X
    public void YL(final long j, final long j2, final long j3) {
        this.LLIILZL.LJII(new F9E(j, j2, j3) { // from class: X.4uL
            public final long LJLIL;
            public final long LJLILLLLZI;
            public final long LJLJI;

            @Override // X.F9E
            public final Object[] getObjects() {
                return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI)};
            }

            {
                this.LJLIL = j;
                this.LJLILLLLZI = j2;
                this.LJLJI = j3;
            }
        });
    }

    public /* synthetic */ I9X(C82622Wbi c82622Wbi, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, (i & 2) != 0 ? null : interfaceC88472Yns);
    }

    @Override // X.I3X
    public int LLLII(String strImagePath, int i, int i2, InterfaceC88472Yns<? super Integer, C76800UCe> callback) {
        o.LJIIIZ(strImagePath, "strImagePath");
        o.LJIIIZ(callback, "callback");
        return getCameraApi().e8().LLLII(strImagePath, i, i2, callback);
    }

    public static /* synthetic */ void LLJLIL(I9X i9x, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            i9x.LLJJL(z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFlashByChecking");
    }

    public static /* synthetic */ void LJZI(I9X i9x, C40871j1 c40871j1, C46156I9o c46156I9o, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            i9x.LJLZ(c40871j1, c46156I9o, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execWaitAsync");
    }

    public static /* synthetic */ void LLFFF(I9X i9x, C40871j1 c40871j1, boolean z, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            i9x.LLF(c40871j1, z, interfaceC88472Yns);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execWaitAsyncWithCallBack");
    }

    @Override // X.I3X
    public void LLLZZIL(String strImagePath, int i, int i2, boolean z, Bitmap.CompressFormat format, InterfaceC88472Yns<? super Integer, C76800UCe> callback, boolean z2) {
        o.LJIIIZ(strImagePath, "strImagePath");
        o.LJIIIZ(format, "format");
        o.LJIIIZ(callback, "callback");
        LLJLIL(this, false, false, 3, null);
        getCameraApi().e8().LLLZZIL(strImagePath, i, i2, z, format, callback, z2);
    }
}
