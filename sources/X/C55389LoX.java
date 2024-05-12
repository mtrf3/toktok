package X;

import Y.ARunnableS45S0100000_9;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.internal.o;

/* renamed from: X.LoX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55389LoX extends C56446MDi {
    @Override // X.C56446MDi, X.InterfaceC55370LoE
    public final void LIZIZ() {
        LJIILL(true);
    }

    @Override // X.C56446MDi, X.InterfaceC55370LoE
    public final void LIZLLL() {
        LJIILL(false);
    }

    @Override // X.C56446MDi
    public final String LJIIJJI() {
        return "HomeSeekBarControl";
    }

    @Override // X.C56446MDi
    public final boolean LJIILIIL(Object event) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        o.LJIIIZ(event, "event");
        Object obj6 = null;
        if (event instanceof C46272IEa) {
            obj = event;
        } else {
            obj = null;
        }
        if (o.LJ(event, obj)) {
            return C54840Lfg.LJL(((C46272IEa) event).LJLILLLLZI);
        }
        if (event instanceof C55391LoZ) {
            obj2 = event;
        } else {
            obj2 = null;
        }
        if (o.LJ(event, obj2)) {
            return C54840Lfg.LJL(((C55391LoZ) event).LJLILLLLZI);
        }
        if (event instanceof C46288IEq) {
            obj3 = event;
        } else {
            obj3 = null;
        }
        if (o.LJ(event, obj3)) {
            return C54840Lfg.LJL(((C46288IEq) event).LJLILLLLZI);
        }
        if (event instanceof C55392Loa) {
            obj4 = event;
        } else {
            obj4 = null;
        }
        if (o.LJ(event, obj4)) {
            return C54840Lfg.LJL(((C55392Loa) event).LJLILLLLZI);
        }
        if (event instanceof C46361IHl) {
            obj5 = event;
        } else {
            obj5 = null;
        }
        if (o.LJ(event, obj5)) {
            return C54840Lfg.LJL(((C46361IHl) event).LJLILLLLZI);
        }
        if (event instanceof C2QA) {
            obj6 = event;
        }
        if (o.LJ(event, obj6)) {
            return C54840Lfg.LJL(((C2QA) event).LJLJI);
        }
        return false;
    }

    @QD3
    public final void onDislikeAwemeEvent(C55274Lmg event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI == 1) {
            LJIILL(event.LJLIL);
        }
    }

    @QD3
    public final void onFullFeedFragmentLifeCycleEvent(C55026Lig event) {
        o.LJIIIZ(event, "event");
        this.LJIILL = event.LJLIL;
        if (!o.LJ(this.LJIILJJIL, event.LJLILLLLZI) && !o.LJ(this.LJIL, event.LJLJI)) {
            this.LJII.LIZLLL("onFullFeedFragmentLifeCycleEvent");
            C2U8.LIZ(new C55048Lj2(this.LJIILJJIL, false));
        }
        this.LJIILJJIL = event.LJLILLLLZI;
        this.LJIL = event.LJLJI;
        int i = this.LJIILL;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (o.LJ(event.LJLJJI, Boolean.TRUE)) {
                IDR idr = this.LJIL;
                if ((idr instanceof InterfaceC54540Laq) || (idr instanceof InterfaceC54499LaB) || (idr instanceof InterfaceC54489La1)) {
                    this.LIZ.animate().alpha(0.0f).setInterpolator(new SJK()).setDuration(300L).withEndAction(new ARunnableS45S0100000_9(this, 156)).start();
                    this.LIZIZ.animate().alpha(0.0f).setInterpolator(new SJK()).setDuration(300L).withEndAction(new ARunnableS45S0100000_9(this, 157)).start();
                    return;
                }
            }
            this.LIZ.setVisibility(8);
            LJIIIZ().LIZIZ();
            return;
        }
        if (o.LJ(event.LJLJJI, Boolean.TRUE) && LJII(this.LJIILJJIL)) {
            IDR idr2 = this.LJIL;
            if ((idr2 instanceof InterfaceC54540Laq) || (idr2 instanceof InterfaceC54499LaB) || (idr2 instanceof InterfaceC54489La1)) {
                C17N.LJJLIIIJJI(this.LIZ);
                this.LIZ.postDelayed(new ARunnableS45S0100000_9(this, 155), 200L);
                return;
            }
        }
        LJIJ();
    }

    @Override // X.C56446MDi, X.InterfaceC56456MDs
    public final void onStopTrackingTouch(SeekBar seekBar) {
        super.onStopTrackingTouch(seekBar);
        C2U8.LIZ(new C55048Lj2(this.LJIILJJIL, false));
        this.LJIJJ = false;
    }

    @Override // X.C56446MDi, X.InterfaceC55370LoE
    public final void LIZ(float f, boolean z) {
        if (!this.LJIJJ) {
            C2U8.LIZ(new C55048Lj2(this.LJIILJJIL, true));
            this.LJIJJ = true;
        }
        super.LIZ(f, z);
    }

    public C55389LoX(C56448MDk c56448MDk, ViewGroup viewGroup, C71898SJq c71898SJq, ImageView imageView, ScrollSwitchStateManager scrollSwitchStateManager, VideoSeekBarMaskView videoSeekBarMaskView) {
        super(c56448MDk, viewGroup, c71898SJq, imageView, scrollSwitchStateManager, videoSeekBarMaskView);
        C56463MDz.LJII(c56448MDk, viewGroup, c71898SJq, imageView, true);
        LFH.LIZIZ.LIZLLL().LJIIZILJ();
        if (LEZ.LIZ.LIZ()) {
            LFQ.LIZIZ(new C55388LoW(c56448MDk, viewGroup, c71898SJq));
        }
    }
}
