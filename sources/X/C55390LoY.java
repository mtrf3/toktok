package X;

import android.view.ViewGroup;
import android.widget.SeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.internal.o;

/* renamed from: X.LoY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55390LoY extends C56446MDi {
    @Override // X.C56446MDi
    public final String LJIIJJI() {
        return "DetailSeekBarControl";
    }

    @Override // X.C56446MDi, X.InterfaceC55370LoE
    public final void LIZIZ() {
        LJIIIZ().LIZIZ();
        this.LIZ.setSeekBarShowType(LJIIJ());
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
            return o.LJ(((C46272IEa) event).LJLJI, this.LJIL);
        }
        if (event instanceof C55391LoZ) {
            obj2 = event;
        } else {
            obj2 = null;
        }
        if (o.LJ(event, obj2)) {
            if (o.LJ(((C55391LoZ) event).LJLJJI, this.LJIL)) {
                return true;
            }
            this.LIZ.setVisibility(8);
            LJIIIZ().LIZIZ();
            return false;
        }
        if (event instanceof C46288IEq) {
            obj3 = event;
        } else {
            obj3 = null;
        }
        if (o.LJ(event, obj3)) {
            return o.LJ(((C46288IEq) event).LJLJJI, this.LJIL);
        }
        if (event instanceof C55392Loa) {
            obj4 = event;
        } else {
            obj4 = null;
        }
        if (!o.LJ(event, obj4)) {
            if (event instanceof C46361IHl) {
                obj5 = event;
            } else {
                obj5 = null;
            }
            if (o.LJ(event, obj5)) {
                return o.LJ(((C46361IHl) event).LJLJJI, this.LJIL);
            }
            if (event instanceof C2QA) {
                obj6 = event;
            }
            if (!o.LJ(event, obj6)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C56446MDi, X.InterfaceC56456MDs
    public final void onStopTrackingTouch(SeekBar seekBar) {
        super.onStopTrackingTouch(seekBar);
        C2U8.LIZ(new C55323LnT(false, this.LJIILJJIL, this.LJIL));
        this.LJIJJ = false;
    }

    @Override // X.C56446MDi, X.InterfaceC55370LoE
    public final void LIZ(float f, boolean z) {
        if (!this.LJIJJ) {
            C2U8.LIZ(new C55323LnT(true, this.LJIILJJIL, this.LJIL));
            this.LJIJJ = true;
        }
        super.LIZ(f, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55390LoY(C56448MDk c56448MDk, ViewGroup viewGroup, C71898SJq c71898SJq, C5EL c5el, ScrollSwitchStateManager scrollSwitchStateManager, IDR baseListFragmentPanel, VideoSeekBarMaskView videoSeekBarMaskView) {
        super(c56448MDk, viewGroup, c71898SJq, c5el, scrollSwitchStateManager, videoSeekBarMaskView);
        o.LJIIIZ(baseListFragmentPanel, "baseListFragmentPanel");
        this.LJIL = baseListFragmentPanel;
        C56463MDz.LJII(c56448MDk, viewGroup, c71898SJq, c5el, false);
    }
}
