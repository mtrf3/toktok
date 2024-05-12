package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.vesdk.VEInfo;
import java.io.File;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I9Z extends I9X<InterfaceC45967I2h> implements InterfaceC45967I2h {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLLLIIIILLL;
    public final C29901Fi<Boolean> LLLJ;
    public final ShortVideoContext LLLJIL;
    public final InterfaceC115514g7 LLLJL;
    public volatile boolean LLLL;
    public final LiveEvent<Boolean> LLLLII;

    static {
        TBT tbt = new TBT(I9Z.class, "appCompatActivity", "getAppCompatActivity()Landroidx/appcompat/app/AppCompatActivity;", 0);
        C65352Pkq.LIZ.getClass();
        LLLLIIIILLL = new InterfaceC74236TBo[]{tbt};
    }

    public InterfaceC45967I2h LLLLLIL() {
        return this;
    }

    public final C29S LLLLLJIL() {
        return (C29S) this.LLLJL.LIZ(this, LLLLIIIILLL[0]);
    }

    public final void LLLLLL() {
        if (this.LLLL) {
            return;
        }
        this.LLLL = true;
        C43045Guv.LIZLLL(new AqS157S0100000_7(this, 287), 0L);
    }

    @Override // X.I9X, X.I3X
    public void w30() {
        File[] fileArr;
        Workspace workspace = this.LLLJIL.cameraComponentModel.mWorkspace;
        if (workspace != null) {
            fileArr = workspace.LJLIL.LLLZZIL();
        } else {
            fileArr = null;
        }
        if (fileArr != null && fileArr.length != 0) {
            C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(fileArr);
            while (LJJIIJZLJL.hasNext()) {
                C45161Hnx.LIZJ(((File) LJJIIJZLJL.next()).getPath());
            }
        }
        InterfaceC41417GNh LJFF = C1DG.LJFF();
        CreativeInfo creativeInfo = this.LLLJIL.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        if (!LJFF.LJFF(new C41363GLf(creativeInfo, false))) {
            super.w30();
        }
    }

    @Override // X.I9X, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getCameraApi().e8().LLLZI(new IAP((InterfaceC81640W2i) getDiContainer().LJIIIIZZ(null, InterfaceC81640W2i.class), this, EnumC45994I3i.NORMAL, new C46154I9m(this)));
        getCameraApi().e8().LLLLLLLLL(new C46160I9s(this));
    }

    @Override // X.I9X, X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        this.LLLL = false;
    }

    @Override // X.I9X
    /* renamed from: LLIILZL */
    public /* bridge */ /* synthetic */ InterfaceC45967I2h getApiComponent() {
        LLLLLIL();
        return this;
    }

    @Override // X.I9X, X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        LLLLLIL();
        return this;
    }

    @Override // X.InterfaceC45967I2h
    public LiveEvent<Boolean> oy() {
        return this.LLLLII;
    }

    @Override // X.I9X, X.I3X
    public void Ah0(HYN event) {
        o.LJIIIZ(event, "event");
        this.LLLL = false;
        ShortVideoContext shortVideoContext = this.LLLJIL;
        if (shortVideoContext != null && shortVideoContext.LJJJI()) {
            getCameraApi().e8().setRecordMaxDuration(shortVideoContext.cameraComponentModel.mMaxDuration);
        }
        super.Ah0(event);
    }

    public final void LLLLLJLJLL(int i) {
        if (i == 1022) {
            C43045Guv.LIZLLL(new AqS157S0100000_7(this, 285), 0L);
            return;
        }
        if (i == 1080) {
            C43045Guv.LIZLLL(new AqS157S0100000_7(this, 286), 0L);
            AVExternalServiceImpl.LIZ().provideAVPerformance().end("tool_performance_start_record_latency", "recorder_first_frame");
        } else {
            if (i != 1003 && i != VEInfo.TE_RECORD_INFO_VIDEO_SW_ENCODER_INIT) {
                return;
            }
            AVExternalServiceImpl.LIZ().provideAVPerformance().step("tool_performance_start_record_latency", "recorder_init_done");
        }
    }

    @Override // X.InterfaceC45967I2h
    public void Mm(boolean z) {
        this.LLLJ.LJII(Boolean.valueOf(!z));
    }

    @Override // X.I9X, X.I3X
    public void hb0(I9L event) {
        o.LJIIIZ(event, "event");
        if (event.LIZ != 0) {
            super.hb0(event);
        } else {
            super.hb0(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I9Z(C82622Wbi diContainer, InterfaceC88472Yns<? super C46144I9c, C76800UCe> interfaceC88472Yns) {
        super(diContainer, interfaceC88472Yns);
        o.LJIIIZ(diContainer, "diContainer");
        C29901Fi<Boolean> c29901Fi = new C29901Fi<>();
        this.LLLJ = c29901Fi;
        this.LLLJIL = (ShortVideoContext) diContainer.LJ(ShortVideoContext.class, null);
        this.LLLJL = UCI.LJI(getDiContainer(), C29S.class, null);
        this.LLLLII = c29901Fi;
    }

    public /* synthetic */ I9Z(C82622Wbi c82622Wbi, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, (i & 2) != 0 ? null : interfaceC88472Yns);
    }
}
