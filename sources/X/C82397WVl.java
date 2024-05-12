package X;

import Y.AObjectS89S0100000_14;
import Y.AObserverS80S0100000_12;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.WVl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82397WVl extends AbstractC29891Fh<InterfaceC45315HqR> implements InterfaceC135635Tz, InterfaceC45315HqR {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC45315HqR LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public Effect LJLJLLL;
    public int LJLL;
    public boolean LJLLI;

    static {
        TBT tbt = new TBT(C82397WVl.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82397WVl.class, "nowsSwitcherApi", "getNowsSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82397WVl.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82397WVl.class, "slideStickerApiComponent", "getSlideStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/slideslip/SlideSlipBottomStickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82397WVl.class, "nowsShootModel", "getNowsShootModel()Lcom/ss/android/ugc/aweme/creative/model/NowsShootModel;", 0, c65351Pkp), C61845OOz.LIZJ(C82397WVl.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp)};
    }

    private final InterfaceC82325WSr getNowsSwitcherApi() {
        return (InterfaceC82325WSr) this.LJLJJI.LIZ(this, LJLLILLLL[1]);
    }

    public final NowsShootModel LJJLIIIIJ() {
        return (NowsShootModel) this.LJLJL.LIZ(this, LJLLILLLL[4]);
    }

    public final InterfaceC82129WLd LJJLIIIJILLIZJL() {
        return (InterfaceC82129WLd) this.LJLJJLL.LIZ(this, LJLLILLLL[3]);
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLJI.LIZ(this, LJLLILLLL[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJLJ.LIZ(this, LJLLILLLL[5]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LJLJJL.LIZ(this, LJLLILLLL[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIJJI() {
        int i;
        this.LJLJLLL = C82398WVm.LIZJ(getStickerApiComponent());
        if (C78866UxK.LJJJJLL(getStickerApiComponent().LLLLL(), this.LJLJLLL)) {
            TEZ currentChildPosition = getStickerApiComponent().LLLLL();
            o.LJIIIZ(currentChildPosition, "$this$currentChildPosition");
            I2A i2a = (I2A) currentChildPosition.LJIIIIZZ().LJIILIIL().getValue();
            if (i2a != null) {
                i = i2a.LJLILLLLZI;
            } else {
                i = 0;
            }
        } else {
            i = -1;
        }
        this.LJLL = i;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        Ob(LJJLIIIIJ().nowsExtra.isDualCamera);
        getStickerApiComponent().LLZL().LIZLLL(new TKC(this));
        getNowsSwitcherApi().zx().LIZIZ(this, new AObjectS89S0100000_14(this, 110));
        getStickerApiComponent().LLLLL().LJIIIIZZ().LIZ().observe(this, new AObserverS80S0100000_12(this, 22));
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC45315HqR getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C82397WVl(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJLJJLL = UCI.LJII(getDiContainer(), InterfaceC82129WLd.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), NowsShootModel.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLL = -1;
        this.LJLLI = LJJLIIIIJ().nowsExtra.isDualCamera;
    }

    public final boolean LJJLI(Effect effect) {
        if (C44329HaX.LIZ(effect)) {
            return true;
        }
        if (effect != null) {
            if (V3N.LJIILLIIL(effect)) {
                return true;
            }
            if (!C78886Uxe.LJJIJ(effect.getTags()) && effect.getTags().contains("now_camera_disable")) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC45315HqR
    public void Ob(boolean z) {
        this.LJLLI = z;
        if (C82398WVm.LIZJ(getStickerApiComponent()) != null) {
            if (z) {
                LJJLIIIJJI();
                getStickerApiComponent().LLZL().LIZJ(J8V.LJFF());
                InterfaceC82129WLd LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
                if (LJJLIIIJILLIZJL != null) {
                    C82130WLe.LIZ(LJJLIIIJILLIZJL, false, false, false, null, false, 60);
                    return;
                }
                return;
            }
        } else if (z) {
            return;
        }
        Effect effect = this.LJLJLLL;
        if (effect == null || LJJLI(effect)) {
            return;
        }
        InterfaceC46204IBk LLZL = getStickerApiComponent().LLZL();
        Effect effect2 = this.LJLJLLL;
        if (effect2 != null) {
            LLZL.LIZJ(J8V.LJI(effect2, this.LJLL, EnumC44267HYx.RECOVER, null, null, null, null, 0, false, null, 508));
            InterfaceC82129WLd LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL2 == null) {
                return;
            }
            C82130WLe.LIZ(LJJLIIIJILLIZJL2, true, false, false, null, false, 60);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
