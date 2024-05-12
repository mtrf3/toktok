package X;

import Y.AObjectS71S0300000_14;
import Y.AObjectS89S0100000_14;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VEAudioCapture;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WYR extends AbstractC29891Fh<InterfaceC82358WTy> implements InterfaceC82358WTy, InterfaceC135635Tz {
    public static final WYV LJLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC82358WTy LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public C73318Sq2 LJLL;
    public final List<C82492WZc> LJLLI;
    public C82492WZc LJLLILLLL;
    public final C82464WYa LJLLJ;

    static {
        TBT tbt = new TBT(WYR.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt, new TBT(WYR.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(WYR.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new TBT(WYR.class, "svcBottomAndPanelApiComponent", "getSvcBottomAndPanelApiComponent()Lcom/ss/android/ugc/gamora/recorder/voicechange/slideslip/SVCBottomAndPanelApiComponent;", 0), new TBT(WYR.class, "slideSlipBottomStickerApiComponent", "getSlideSlipBottomStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/slideslip/SlideSlipBottomStickerApiComponent;", 0)};
        LJLLL = new WYV();
    }

    private final InterfaceC82129WLd LJJLIIIIJ() {
        return (InterfaceC82129WLd) this.LJLJLLL.LIZ(this, LJLLLL[4]);
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLJL.LIZ(this, LJLLLL[2]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJJLL.LIZ(this, LJLLLL[1]);
    }

    public final InterfaceC82199WNv LJJLIIIJILLIZJL() {
        return (InterfaceC82199WNv) this.LJLJLJ.LIZ(this, LJLLLL[3]);
    }

    public final C29901Fi<Boolean> LJJLIIIJJI() {
        return (C29901Fi) this.LJLJI.getValue();
    }

    public final C29901Fi<Boolean> LJJLIIIJJIZ() {
        return (C29901Fi) this.LJLJJI.getValue();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJJL.LIZ(this, LJLLLL[0]);
    }

    @Override // X.InterfaceC82358WTy
    public LiveEvent<Boolean> U3() {
        return LJJLIIIJJI();
    }

    @Override // X.InterfaceC82358WTy
    public LiveEvent<Boolean> g2() {
        return LJJLIIIJJIZ();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        LiveEvent<Boolean> HD;
        super.onCreate();
        InterfaceC82129WLd LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null && (HD = LJJLIIIIJ.HD()) != null) {
            HD.LIZLLL(this, new AObjectS89S0100000_14(this, 393));
        }
        C82622Wbi diContainer = getDiContainer();
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(InterfaceC82199WNv.class, new AqS180S0100000_14(this, LiveCoverMinSizeSetting.DEFAULT));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, InterfaceC82199WNv.class);
            if (c0i6 != null) {
                ((InterfaceC82199WNv) c0i6).U3().LIZLLL(this, new AObjectS89S0100000_14(this, 394));
            }
        }
        VEAudioCapture LJFF = getCameraApiComponent().e8().t9().getAudioController().LJFF();
        C68322mC c68322mC = new C68322mC();
        getRecordControlApi().Rr0().LIZLLL(this, WYT.LJLIL);
        C78999UzT.LJFF(getRecordControlApi().Pr0().LJJJJZI(WYU.LJLIL), this.LJLL);
        getRecordControlApi().UG().LIZLLL(this, WYS.LJLIL);
        getRecordControlApi().vf0().LIZLLL(this, new AObjectS89S0100000_14(this, 395));
        getRecordControlApi().s10().LIZLLL(this, new AObjectS89S0100000_14(this, 396));
        getRecordControlApi().w90().LIZLLL(this, new AObjectS71S0300000_14(this, (WYR) LJFF, (VEAudioCapture) c68322mC, (C68322mC<C82492WZc>) 3));
        getRecordControlApi().aL().LIZLLL(this, new AObjectS71S0300000_14(this, (WYR) LJFF, (VEAudioCapture) c68322mC, (C68322mC<C82492WZc>) 4));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LJLL.dispose();
        C169586l8.LIZ();
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
            Boolean LIZ = getRecordControlApi().t5().LIZ();
            o.LJIIIIZZ(LIZ, "recordControlApi.hasRecordSegment.value");
            if (LIZ.booleanValue()) {
                LJJLIIIJILLIZJL().b00();
            }
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC82358WTy getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
    }

    public WYR(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = C221108m2.LIZIZ(WU0.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(WU1.LJLIL);
        this.LJLJJL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), InterfaceC82199WNv.class, null);
        this.LJLJLLL = UCI.LJII(getDiContainer(), InterfaceC82129WLd.class, null);
        this.LJLL = new C73318Sq2();
        ArrayList arrayList = new ArrayList();
        this.LJLLI = arrayList;
        this.LJLLILLLL = LJJLI(arrayList);
        this.LJLLJ = new C82464WYa(this);
    }

    public final C82492WZc LJJLI(List<C82492WZc> list) {
        C82492WZc c82492WZc = new C82492WZc(getDiContainer());
        this.LJLLILLLL = c82492WZc;
        list.add(c82492WZc);
        c82492WZc.LJLLLLLL.LJLLLL = true;
        return c82492WZc;
    }
}
