package X;

import Y.AObjectS86S0100000_7;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.nows.recordcontrol.NowsRecordNextAction;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I9Y extends I9X<I3X> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLLL;
    public final InterfaceC115514g7 LLLJ;
    public final InterfaceC115514g7 LLLJIL;
    public final InterfaceC115514g7 LLLJL;

    static {
        TBT tbt = new TBT(I9Y.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I9Y.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(I9Y.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.I9X
    public boolean LLJJJIL(long j) {
        return j >= LivePlayEnforceIntervalSetting.DEFAULT;
    }

    private final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LLLJ.LIZ(this, LLLL[0]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLLJIL.LIZ(this, LLLL[1]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LLLJL.LIZ(this, LLLL[2]);
    }

    @Override // X.I9X, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getCameraApi().e8().LLLZI(new IAP((InterfaceC81640W2i) getDiContainer().LJIIIIZZ(null, InterfaceC81640W2i.class), getActivity(), EnumC45994I3i.NOWS, new C46153I9l(this)));
        Dd(IAC.class, new NowsRecordNextAction(getShortVideoContext(), (WXN) getDiContainer().LJ(WXN.class, null), J0()));
        DG(IAC.class);
        s10().LIZLLL(this, new AObjectS86S0100000_7(this, 34));
        UG().LIZLLL(this, new AObjectS86S0100000_7(this, 35));
        if (getShortVideoContext().mIsFromDraft && getShortVideoContext().shootMode == 16) {
            HZ2.LIZ((I3X) getDiContainer().LJ(I3X.class, null), false, 3);
        }
    }

    public final void LLLLLIL(int i) {
        if (i != 1022) {
            if (i != 1080) {
                return;
            }
            C43045Guv.LIZLLL(new AqS157S0100000_7(this, 154), 0L);
            return;
        }
        C43045Guv.LIZLLL(new AqS157S0100000_7(this, 153), 0L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I9Y(C82622Wbi diContainer, InterfaceC88472Yns<? super C46144I9c, C76800UCe> interfaceC88472Yns) {
        super(diContainer, interfaceC88472Yns);
        o.LJIIIZ(diContainer, "diContainer");
        this.LLLJ = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LLLJIL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LLLJL = UCI.LJII(getDiContainer(), I0N.class, null);
    }

    public /* synthetic */ I9Y(C82622Wbi c82622Wbi, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, (i & 2) != 0 ? null : interfaceC88472Yns);
    }
}
