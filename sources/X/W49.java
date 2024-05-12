package X;

import Y.ALAdapterS2S0210000_14;
import Y.AObjectS89S0100000_14;
import Y.ARunnableS50S0100000_14;
import Y.AUListenerS103S0200000_14;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class W49 extends AbstractC163776bl<RecordStickerPanelViewModel> implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJZ;
    public final InterfaceC82086WJm LJLJLJ;
    public final C82631Wbr LJLJLLL;
    public final C82631Wbr LJLL;
    public final W4A LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final AqS164S0100000_14 LJLLJ;
    public C81443Vxn LJLLL;
    public final C82622Wbi LJLLLL;
    public final WMH LJLLLLLL;
    public final int LJLZ;

    static {
        TBT tbt = new TBT(W49.class, "stickerApi", "getStickerApi()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(W49.class, "stickerViewConfigure", "getStickerViewConfigure()Lcom/ss/android/ugc/aweme/sticker/panel/StickerViewConfigure;", 0, c65351Pkp)};
    }

    public final I9W LJJLIIJ() {
        return (I9W) this.LJLJLLL.LIZ(this, LJZ[0]);
    }

    public final W4B LJJLJ() {
        return (W4B) this.LJLLILLLL.getValue();
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJJIZ() {
        C81443Vxn c81443Vxn;
        if (C82894Wg6.LIZIZ.LJIIL() && (c81443Vxn = this.LJLLL) != null) {
            c81443Vxn.hide();
        } else {
            LJJLJ().hide();
        }
    }

    @Override // X.AbstractC165596eh
    public void LJJLIIIJLLLLLLLZ() {
        C81443Vxn c81443Vxn;
        long j;
        int height;
        if (C82894Wg6.LIZIZ.LJIIL() && (c81443Vxn = this.LJLLL) != null) {
            TGD tgd = (TGD) this.LJLL.LIZ(this, LJZ[1]);
            if (tgd != null) {
                j = tgd.LJLJLLL;
            } else {
                j = 300;
            }
            AqS164S0100000_14 aqS164S0100000_14 = new AqS164S0100000_14(this, 267);
            c81443Vxn.LJLJJI = true;
            View requireView = c81443Vxn.requireView();
            if (requireView.getHeight() <= 0) {
                height = c81443Vxn.LJLILLLLZI;
            } else {
                height = requireView.getHeight();
            }
            C78928UyK.LIZIZ(false, false, false, c81443Vxn.LJLJL);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(height, 0.0f);
            o.LJIIIIZZ(ofFloat, "this");
            ofFloat.setDuration(j);
            C173216qz.LJ(ofFloat, "prop_panel_show", true);
            ofFloat.addUpdateListener(new AUListenerS103S0200000_14(c81443Vxn, aqS164S0100000_14, 2));
            ofFloat.addListener(new ALAdapterS2S0210000_14(c81443Vxn, aqS164S0100000_14, 0));
            ofFloat.start();
            c81443Vxn.LJLJI = ofFloat;
            return;
        }
        LJJLJ().LLJI(LJJLIIJ());
        LJJLJ().show();
    }

    public void LJJLJLI() {
        LJJLJ().LLJI((I9W) ((C1EP) this.LJLLLL.LJ(C1EP.class, null)).sO(I9W.class));
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        if (C82894Wg6.LIZIZ.LJIIL()) {
            C81443Vxn c81443Vxn = new C81443Vxn(this.LJLLLL);
            this.LJLLLLLL.add(this.LJLZ, c81443Vxn, "RecordStickerPanelMockScene");
            this.LJLLL = c81443Vxn;
        }
        this.LJLLLLLL.add(this.LJLZ, LJJLJ().getScene(), "RecordStickerPanelScene");
        W4A w4a = this.LJLLI;
        if (w4a.LJI) {
            this.LJLJLJ.ip0().LIZIZ(this, new AObjectS89S0100000_14(this, 435));
        } else {
            if (!w4a.LJFF) {
                return;
            }
            if (w4a.LJ) {
                this.LJLJLJ.ip0().LIZIZ(this, new AObjectS89S0100000_14(this, 436));
            } else {
                SceneExtensionsKt.LIZJ(this.LJLLLLLL, new ARunnableS50S0100000_14(this, 152), 100L);
            }
        }
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLLLLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<RecordStickerPanelViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLLLL;
    }

    public W49(C82622Wbi diContainer, WMH parentScene, int i, AqS180S0100000_14 aqS180S0100000_14) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLLLL = diContainer;
        this.LJLLLLLL = parentScene;
        this.LJLZ = i;
        this.LJLJLJ = (InterfaceC82086WJm) diContainer.LJ(InterfaceC82086WJm.class, null);
        this.LJLJLLL = UCI.LJII(diContainer, I9W.class, null);
        this.LJLL = UCI.LJII(diContainer, TGD.class, null);
        W48 w48 = (W48) this;
        W4A w4a = new W4A(w48);
        this.LJLLI = w4a;
        aqS180S0100000_14.invoke(w4a);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS164S0100000_14(w48, 268));
        this.LJLLJ = new AqS164S0100000_14(w48, 269);
    }
}
