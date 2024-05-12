package X;

import Y.AObjectS89S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WHi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82030WHi extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82631Wbr LJLJJLL;
    public final C82031WHj LJLJL;
    public final C82632Wbs LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;

    static {
        TBT tbt = new TBT(C82030WHi.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82030WHi.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82030WHi.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZ() {
        Effect effect;
        if (this.LJLJLLL) {
            C82631Wbr c82631Wbr = this.LJLJJLL;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLI;
            InterfaceC82400WVo interfaceC82400WVo = (InterfaceC82400WVo) c82631Wbr.LIZ(this, interfaceC74236TBoArr[1]);
            if (interfaceC82400WVo != null) {
                effect = C82398WVm.LIZJ(interfaceC82400WVo);
            } else {
                effect = null;
            }
            if (ID0.LIZLLL(effect)) {
                C5S1 c5s1 = new C5S1((Context) this.LJLJLJ.LIZ(this, interfaceC74236TBoArr[2]));
                c5s1.LIZLLL(((ContextThemeWrapper) this.LJLJLJ.LIZ(this, interfaceC74236TBoArr[2])).getResources().getString(R.string.pvm));
                c5s1.LJ();
            }
        }
    }

    @Override // X.WJB
    public final void LJFF() {
        Effect effect;
        TEZ LLLLL;
        if (C76917UGr.LJLIL) {
            return;
        }
        C60903NvH.LJIIJJI().LJJI().sceneReport("swap_camera");
        C82632Wbs c82632Wbs = this.LJLJLJ;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLI;
        new C61995OUt((Context) c82632Wbs.LIZ(this, interfaceC74236TBoArr[2])).LIZIZ(12, LiveTryModeCountDownThresholdSetting.DEFAULT);
        I0N i0n = (I0N) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[1]);
        if (i0n != null && (LLLLL = i0n.LLLLL()) != null) {
            effect = LLLLL.LLJJIJIIJIL();
        } else {
            effect = null;
        }
        if (V3N.LJIL(effect)) {
            LJIIIZ().qm0();
        } else {
            LJIIIZ().Gm0(false);
            LJIIIZ().z6(false, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.SWITCH_CAMERA_TOOL_BAR, null), null);
        }
    }

    public final InterfaceC82086WJm LJIIIZ() {
        return (InterfaceC82086WJm) this.LJLJJL.LIZ(this, LJLLI[0]);
    }

    @Override // X.WJB
    public final void LIZLLL() {
        LJIIIZ().VO().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 428));
        LJIIIZ().oX().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 429));
        LJIIIZ().Hv().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 430));
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    @Override // X.WJB
    public final void LIZIZ(C82028WHg event) {
        o.LJIIIZ(event, "event");
        super.LIZIZ(event);
        if (C52533KjZ.LIZ() > 0) {
            return;
        }
        View view = event.LJLJI;
        EnumC79548VJw enumC79548VJw = event.LJLIL;
        if (enumC79548VJw == EnumC79548VJw.CLICK) {
            view.animate().rotationBy(180.0f).setDuration(200L).withStartAction(new ARunnableS50S0100000_14(view, 145)).withEndAction(new ARunnableS50S0100000_14(view, 146));
        } else {
            if (enumC79548VJw != EnumC79548VJw.BIND_VIEW || !this.LJLL) {
                return;
            }
            view.animate().rotationBy(180.0f).setDuration(200L).withStartAction(new ARunnableS50S0100000_14(view, 147)).withEndAction(new ARunnableS50S0100000_14(view, 148));
            this.LJLL = false;
        }
    }

    public C82030WHi(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLJJLL = UCI.LJII(diContainer, I0N.class, null);
        this.LJLJL = new C82031WHj();
        this.LJLJLJ = UCI.LJI(diContainer, Activity.class, null);
    }
}
