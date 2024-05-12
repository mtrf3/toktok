package X;

import Y.AObjectS89S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WXh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82445WXh implements WXW, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final C82622Wbi LJLIL;
    public final boolean LJLILLLLZI;
    public final WXY LJLJI;
    public final C82632Wbs LJLJJI;
    public InterfaceC82440WXc LJLJJL;
    public int LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public int LJLJLLL;
    public final long LJLL;
    public final ARunnableS50S0100000_14 LJLLI;
    public final C62822Ol8 LJLLILLLL;

    static {
        TBT tbt = new TBT(C82445WXh.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.WXW
    public final void b() {
        LJIIJJI(0);
    }

    @Override // X.WXW
    public final void p() {
        this.LJLJJLL = -1;
        this.LJLJLLL = -1;
        C6IA.LJFF(LJII(), this.LJLILLLLZI);
        LJIIIZ().removeCallbacksAndMessages(null);
        LJII().removeCallbacks(this.LJLLI);
    }

    @Override // X.WXW
    public final void LIZ() {
        if (this.LJLJLLL == 1) {
            LJIIJJI(2);
        } else {
            LJIIJJI(3);
        }
    }

    public final void LIZIZ() {
        this.LJLJI.T0(C82444WXg.LJLIL, new AqS180S0100000_14(this, 314));
    }

    @Override // X.WXW
    public final void LIZJ() {
        if (this.LJLJLLL == 1) {
            LJIIJJI(3);
        } else {
            LJIIJJI(2);
        }
    }

    public final InterfaceC82086WJm LJIIIIZZ() {
        return (InterfaceC82086WJm) this.LJLJJI.LIZ(this, LJLLJ[0]);
    }

    public final SafeHandler LJIIIZ() {
        return (SafeHandler) this.LJLJLJ.getValue();
    }

    @Override // X.WXW
    public final void LJ() {
        LJIIIIZZ().s9(2);
    }

    @Override // X.WXW
    public final InterfaceC83624Wrs LJFF() {
        return LJIIIIZZ().e8();
    }

    @Override // X.WXW
    public final void LJI() {
        LJIIIZ().postDelayed(new ARunnableS50S0100000_14(this, 172), C44317HaL.LJ);
    }

    public final View LJII() {
        return LJFF().getViewFunction().getView();
    }

    public final void LJIIJ() {
        if (C44318HaM.LIZ() && this.LJLJI.Y0()) {
            int i = this.LJLJJLL;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LIZIZ();
                return;
            } else {
                LJ();
                LJIIIZ().postDelayed(new ARunnableS50S0100000_14(this, 173), 400L);
                return;
            }
        }
        LIZIZ();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.WXW
    public final void LIZLLL(boolean z) {
        this.LJLJLLL = 2;
        this.LJLJJLL = 2;
        if (z) {
            LJIIIZ().postDelayed(new ARunnableS50S0100000_14(this, 171), C44317HaL.LJ);
        } else {
            LJIIJ();
        }
    }

    public final void LJIIJJI(int i) {
        if (this.LJLJJLL == i) {
            return;
        }
        this.LJLJJLL = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    LJII().setVisibility(8);
                    C6IA.LJFF(LJII(), this.LJLILLLLZI);
                    this.LJLJI.X0();
                    return;
                }
                LJII().setVisibility(8);
                this.LJLJI.LLLIILIL();
                return;
            }
            if (this.LJLJI.Y0()) {
                LJIIIIZZ().s9(1);
            }
            LJIIJ();
            return;
        }
        LJIIIIZZ().Y3();
        this.LJLJI.W0();
    }

    @Override // X.WXW
    public final void start(int i) {
        this.LJLJLLL = i;
        LJIIJJI(1);
    }

    public C82445WXh(ActivityC45651qj activity, C82622Wbi c82622Wbi, WY8 wy8) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = c82622Wbi;
        this.LJLILLLLZI = true;
        this.LJLJI = wy8;
        this.LJLJJI = UCI.LJI(c82622Wbi, InterfaceC82086WJm.class, null);
        this.LJLJJLL = -1;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 310));
        this.LJLJL = LIZIZ;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 312));
        C221108m2.LIZIZ(new AqS164S0100000_14(this, 311));
        this.LJLL = 300L;
        this.LJLLI = new ARunnableS50S0100000_14(this, 174);
        this.LJLLILLLL = C221108m2.LIZIZ(C52291Kff.LJLIL);
        LJIIIIZZ().uB().LIZLLL((LifecycleOwner) LIZIZ.getValue(), new AObjectS89S0100000_14(this, 448));
    }
}
