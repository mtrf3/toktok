package X;

import Y.AObjectS84S0100000_2;
import android.os.Looper;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6HI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HI extends AbstractC48231ut<InterfaceC144005ky, C6HT, C6HP, C6HL> implements InterfaceC135635Tz, InterfaceC144005ky {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final C29901Fi<C6HV> LJLLLL;
    public final C5H3 LJLLLLLL;
    public final InterfaceC65784Pro<C6HP> LJLZ;
    public final InterfaceC65784Pro<C6HL> LJZ;

    static {
        TBT tbt = new TBT(C6HI.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C6HI.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6HI.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/bottombar/Video2StickerBottomBarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6HI.class, "video2StickerModel", "getVideo2StickerModel()Lcom/ss/android/ugc/aweme/creative/model/video2sticker/Video2StickerModel;", 0, c65351Pkp)};
    }

    public InterfaceC144005ky LLF() {
        return this;
    }

    private final InterfaceC152085y0 LLIIIL() {
        return (InterfaceC152085y0) this.LJLLI.LIZ(this, LJZI[0]);
    }

    private final Video2StickerModel LLIILZL() {
        return (Video2StickerModel) this.LJLLL.LIZ(this, LJZI[3]);
    }

    public final InterfaceC143985kw LLFFF() {
        return (InterfaceC143985kw) this.LJLLJ.LIZ(this, LJZI[2]);
    }

    public final InterfaceC143655kP LLIFFJFJJ() {
        return (InterfaceC143655kP) this.LJLLILLLL.LIZ(this, LJZI[1]);
    }

    public final C6HJ LLIIZ() {
        return (C6HJ) this.LJLLLLLL.getValue();
    }

    public final void LJZI() {
        if (LLIILZL().videoTimeTrimData.isSingleFrame) {
            LJJZZI(C6HO.LJLIL);
        } else if (!LJJLJ().LJLIL) {
            this.LJLLLL.LJII(new C6HV(1, true));
        } else {
            this.LJLLLL.LJII(new C6HV(2, true));
        }
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLFFF().ac().LIZLLL(this, new AObjectS84S0100000_2(this, 84));
        this.LJLLLL.LIZLLL(this, new AObjectS84S0100000_2(this, 85));
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        if (!LLIIZ().LIZJ().LJLJJI) {
            LLFFF().zh();
        }
    }

    @Override // X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
        LLFFF().kG();
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C6HP> LJJLIIIJJI() {
        return this.LJLZ;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C6HL> LJJLIIIJJIZ() {
        return this.LJZ;
    }

    @Override // X.AbstractC41331jl, X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        LLF();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        super.hide();
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
    }

    public final void LJLZ(C6V2 c6v2) {
        LLIIIL().LIZIZ(new C6V4(10, c6v2));
    }

    @Override // X.InterfaceC144005ky
    public void LK(C6HV vePreviewAction) {
        o.LJIIIZ(vePreviewAction, "vePreviewAction");
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            this.LJLLLL.LJII(vePreviewAction);
        } else {
            this.LJLLLL.LJI(vePreviewAction);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6HI(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC152085y0.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), InterfaceC143985kw.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), Video2StickerModel.class, null);
        this.LJLLLL = new C29901Fi<>();
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 310));
        this.LJLZ = C6HN.LJLIL;
        this.LJZ = new AqS152S0100000_2(this, 309);
    }
}
