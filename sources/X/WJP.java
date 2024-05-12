package X;

import Y.AObjectS89S0100000_14;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJP extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public int LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82631Wbr LJLJL;
    public final WJO LJLJLJ;

    static {
        TBT tbt = new TBT(WJP.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WJP.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WJP.class, "svcBottomAndPanelApiComponent", "getSvcBottomAndPanelApiComponent()Lcom/ss/android/ugc/gamora/recorder/voicechange/slideslip/SVCBottomAndPanelApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        String musicPath;
        C82622Wbi c82622Wbi = this.LJLJJI;
        if (L2L.LIZ(c82622Wbi)) {
            ((C1EP) c82622Wbi.LJ(C1EP.class, null)).m3(InterfaceC82199WNv.class, new AqS180S0100000_14(this, 284));
            return;
        }
        C0I6 c0i6 = (C0I6) c82622Wbi.LJIIIIZZ(null, InterfaceC82199WNv.class);
        if (c0i6 == null) {
            return;
        }
        InterfaceC82199WNv interfaceC82199WNv = (InterfaceC82199WNv) c0i6;
        if (V16.LJJLIIIJJI(LJIIIZ()) && (musicPath = LJIIIZ().getMusicPath()) != null && musicPath.length() > 0) {
            this.LJLJJL = 4;
            WJO wjo = this.LJLJLJ;
            wjo.LJIIJJI = WI0.L(wjo.LJIIJJI, false);
            WJO wjo2 = this.LJLJLJ;
            wjo2.LJIIJ = R.attr.e7;
            wjo2.LJIIIZ = R.raw.icon_mic_slash_fill;
            wjo2.LJFF = false;
            LJ();
        }
        interfaceC82199WNv.lD().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 431));
    }

    @Override // X.WJB
    public final void LJFF() {
        String musicPath;
        InterfaceC82199WNv interfaceC82199WNv;
        int i = this.LJLJJL;
        if (i == 1 || i == 2) {
            InterfaceC82199WNv interfaceC82199WNv2 = (InterfaceC82199WNv) this.LJLJL.LIZ(this, LJLJLLL[2]);
            if (interfaceC82199WNv2 != null) {
                if (!interfaceC82199WNv2.Po0()) {
                    C82200WNw.LIZIZ(interfaceC82199WNv2, null, 3);
                    C82468WYe.LIZIZ(LJIIIZ());
                    return;
                } else {
                    interfaceC82199WNv2.m5("");
                    C82468WYe.LIZJ(LJIIIZ(), "click_voice_effect_entrance", interfaceC82199WNv2.KK());
                    return;
                }
            }
            return;
        }
        if (i != 4 || (musicPath = LJIIIZ().getMusicPath()) == null || musicPath.length() <= 0 || (interfaceC82199WNv = (InterfaceC82199WNv) this.LJLJL.LIZ(this, LJLJLLL[2])) == null) {
            return;
        }
        interfaceC82199WNv.xt0();
    }

    public final ShortVideoContext LJIIIZ() {
        return (ShortVideoContext) this.LJLJJLL.LIZ(this, LJLJLLL[0]);
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        return V16.LJJLIIIJJI(LJIIIZ());
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public WJP(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = 1;
        this.LJLJJLL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLJL = UCI.LJII(diContainer, InterfaceC82199WNv.class, null);
        WJO wjo = new WJO(LJIIIZ());
        this.LJLJJL = 1;
        wjo.LJIIJ = 0;
        wjo.LJIIIZ = R.raw.icon_audio_editing_microphone;
        wjo.LJFF = false;
        this.LJLJLJ = wjo;
    }
}
