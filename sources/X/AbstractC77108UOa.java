package X;

import Y.ACListenerS23S0100100_5;
import Y.ALAdapterS10S0100000_13;
import Y.ARunnableS49S0100000_13;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.UOa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77108UOa implements InterfaceC30645C0z, InterfaceC30644C0y {
    public final long LIZ;
    public final UOT LIZLLL;
    public final View.OnClickListener LJFF;
    public CountDownTimerC77109UOb LJII;
    public boolean LJIIJJI;
    public final long LIZIZ = 5000;
    public final String LIZJ = "shortTouchCustomPoll";
    public final boolean LJ = true;
    public final int LJI = C15380j0.LIZ(40.0f);
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 424));
    public final String LJIIIZ = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).PE();
    public final C5H3 LJIIJ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 423));

    @Override // X.InterfaceC30642C0w
    public final void F1() {
    }

    @Override // X.InterfaceC30644C0y
    public final void LJ() {
    }

    public abstract C47121t6 LJIIIIZZ();

    public abstract void LJIIIZ();

    public abstract void LJIIJJI();

    public void LJIIL() {
    }

    public final View LJII() {
        return (View) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC30645C0z
    public final void LJJJLL() {
        if (this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = true;
        LJIIJ(false);
        if (this.LIZIZ > 0) {
            if (this.LIZLLL.LJLJI.length() > 0) {
                LJIIL();
            }
            LJII().postDelayed(new ARunnableS49S0100000_13(this, 175), this.LIZIZ);
        } else if (this.LIZLLL.LJLJI.length() > 0) {
            new ALAdapterS10S0100000_13(this, 46);
            LJIIL();
        } else {
            ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).sX(UOS.ID, this.LJIIIZ);
        }
    }

    @Override // X.InterfaceC30642C0w
    public void LLLLZLL() {
        CountDownTimerC77109UOb countDownTimerC77109UOb = this.LJII;
        if (countDownTimerC77109UOb != null) {
            countDownTimerC77109UOb.cancel();
        }
        if (this.LJIIIIZZ.isInitialized()) {
            ((ValueAnimator) this.LJIIIIZZ.getValue()).cancel();
        }
    }

    @Override // X.InterfaceC30642C0w
    public final void LIZIZ() {
        C16880lQ.LJIIJ(new UOZ(this), LJII());
        LJIIIZ();
        LJII().setPivotX(this.LJI / 2.0f);
        LJII().setPivotY(this.LJI / 2.0f);
        this.LJIIJJI = false;
    }

    @Override // X.InterfaceC30642C0w
    public final void LIZLLL() {
        LJIIJJI();
        if (!this.LJ) {
            long j = this.LIZ;
            if (j > 0) {
                CountDownTimerC77109UOb countDownTimerC77109UOb = new CountDownTimerC77109UOb(this, j - C30725C4b.LIZ());
                countDownTimerC77109UOb.start();
                this.LJII = countDownTimerC77109UOb;
            }
        }
        long j2 = this.LIZ;
        if (j2 > 0 && j2 - C30725C4b.LIZ() < 3600000) {
            C29306Beo.LJJLIIIJJI(LJIIIIZZ(), true);
            LJIIIIZZ().setAlpha(0.0f);
            LJIIIIZZ().setText(C31012CFc.LJII((this.LIZ - C30725C4b.LIZ()) / 1000));
            LJIIJ(true);
            return;
        }
        C29306Beo.LJJLIIIJJI(LJIIIIZZ(), false);
    }

    @Override // X.InterfaceC30642C0w
    public final String LIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC30642C0w
    public final String LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC30644C0y
    public final void LJI() {
        LJJJLL();
    }

    public final void LJIIJ(boolean z) {
        if (z) {
            ((ObjectAnimator) this.LJIIIIZZ.getValue()).setFloatValues(0.0f, 1.0f);
        } else {
            ((ObjectAnimator) this.LJIIIIZZ.getValue()).setFloatValues(LJIIIIZZ().getAlpha(), 0.0f);
        }
        ((ObjectAnimator) this.LJIIIIZZ.getValue()).start();
    }

    @Override // X.InterfaceC30644C0y
    public final void LJIILIIL(long j) {
        if (j < 3600) {
            if (LJII().getVisibility() == 8) {
                LJIIJ(true);
            }
            C29306Beo.LJJLJLI(LJIIIIZZ());
            LJIIIIZZ().setText(C31012CFc.LJII(j));
        }
    }

    public AbstractC77108UOa(Context context, long j, UOT uot, ACListenerS23S0100100_5 aCListenerS23S0100100_5) {
        this.LIZ = j;
        this.LIZLLL = uot;
        this.LJFF = aCListenerS23S0100100_5;
    }
}
