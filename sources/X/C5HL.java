package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.preview.PreviewPanelViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5HL, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5HL implements InterfaceC132925Jo {
    public ActivityC45651qj LJLIL;
    public FrameLayout LJLILLLLZI;
    public PreviewPanelViewModel LJLJI;
    public boolean LJLJJI;
    public C5HN LJLJJL;
    public float LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;

    @Override // X.InterfaceC132875Jj
    public float LJIIJJI() {
        return 2.0f;
    }

    @Override // X.InterfaceC132925Jo
    public final void LIZJ() {
        C5HN c5hn = this.LJLJJL;
        if (c5hn != null) {
            c5hn.LIZJ();
        }
    }

    @Override // X.InterfaceC132925Jo
    public void LJIILL() {
        C5HN c5hn = this.LJLJJL;
        if (c5hn != null) {
            c5hn.LJIILIIL(this.LJLILLLLZI, this);
        }
        this.LJLJJI = false;
    }

    @Override // X.InterfaceC132925Jo
    public final void LJIJI() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (activityC45651qj == null || frameLayout == null) {
            return;
        }
        this.LJLJJI = true;
        C5HN c5hn = this.LJLJJL;
        if (c5hn == null) {
            return;
        }
        c5hn.LJFF(activityC45651qj, frameLayout, this);
    }

    @Override // X.InterfaceC132875Jj
    public final C5HQ LJIIIIZZ() {
        return C5HQ.DOWN;
    }

    @Override // X.InterfaceC132875Jj
    public final C5HP LJIJJ() {
        return C5HP.RIGHT;
    }

    @Override // X.InterfaceC132875Jj
    public EnumC132175Gr LJIJJLI() {
        return EnumC132175Gr.ANTICLOCKWISE;
    }

    @Override // X.InterfaceC132925Jo
    public void LIZ(Canvas canvas) {
        C5HN c5hn;
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLJJI && (c5hn = this.LJLJJL) != null) {
            c5hn.LIZ(canvas);
        }
    }

    @Override // X.InterfaceC132925Jo
    public void LIZIZ(NLEModel nleModel) {
        C5HN c5hn;
        o.LJIIIZ(nleModel, "nleModel");
        if (this.LJLJJI && (c5hn = this.LJLJJL) != null) {
            c5hn.LIZIZ(nleModel);
        }
    }

    @Override // X.InterfaceC132925Jo
    public void LIZLLL(long j) {
        C5HN c5hn;
        if (this.LJLJJI && (c5hn = this.LJLJJL) != null) {
            c5hn.LIZLLL(j);
        }
    }

    @Override // X.InterfaceC132925Jo
    public final void LJIIIZ(OSZ<Float, Float> canvasSize) {
        o.LJIIIZ(canvasSize, "canvasSize");
    }

    @Override // X.C5HO
    public final boolean LJJJJ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        C5HN c5hn = this.LJLJJL;
        if (c5hn == null || !c5hn.LJJJJ(event)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132925Jo
    public void LJIIL(ActivityC45651qj activity, C87230YLi viewParent) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(viewParent, "viewParent");
        this.LJLIL = activity;
        this.LJLILLLLZI = viewParent;
        this.LJLJI = (PreviewPanelViewModel) C5G0.LIZ(PreviewPanelViewModel.class);
    }

    @Override // X.InterfaceC132925Jo
    public void LJIILJJIL(NLETrack track, NLETrackSlot slot) {
        C5PT kv0;
        C5HN c5hn;
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        PreviewPanelViewModel previewPanelViewModel = this.LJLJI;
        if (previewPanelViewModel != null && (kv0 = previewPanelViewModel.kv0(this, this.LJLILLLLZI, slot)) != null && (c5hn = this.LJLJJL) != null) {
            c5hn.LJIJ(track, slot, kv0);
        }
    }

    public boolean LJIILLIIL(NLETrack track, NLETrackSlot slot, MotionEvent e) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        C5HN c5hn = this.LJLJJL;
        if (c5hn != null && this.LJLJJI) {
            return c5hn.LJIILLIIL(track, slot, e);
        }
        return false;
    }

    public boolean LJIIZILJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i) {
        C5HN c5hn = this.LJLJJL;
        if (c5hn != null && this.LJLJJI) {
            return c5hn.LJIIZILJ(nLETrack, nLETrackSlot, i);
        }
        return false;
    }

    public boolean LJIL(NLETrack track, NLETrackSlot slot, MotionEvent e) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        C5HN c5hn = this.LJLJJL;
        if (c5hn != null && this.LJLJJI) {
            return c5hn.LJIL(track, slot, e);
        }
        return false;
    }

    public boolean LJJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, float f) {
        C5HN c5hn = this.LJLJJL;
        int i = 0;
        if (c5hn == null || !this.LJLJJI) {
            return false;
        }
        if (!this.LJLJL) {
            this.LJLJLJ = 0;
            this.LJLJJLL = nLETrackSlot.getScale();
            this.LJLJL = true;
        }
        boolean LJJ = c5hn.LJJ(nLETrack, nLETrackSlot, f);
        if (LJJ) {
            float scale = nLETrackSlot.getScale() - this.LJLJJLL;
            if (scale > 0.0f) {
                i = 1;
            } else if (scale < 0.0f) {
                i = -1;
            }
            this.LJLJLJ = i;
        }
        return LJJ;
    }

    public boolean LJ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.LJLJL = false;
        C5HN c5hn = this.LJLJJL;
        if (c5hn == null || !this.LJLJJI) {
            return false;
        }
        return c5hn.LJ(z, z2, z3, z4, z5);
    }

    @Override // X.C5HO
    public final boolean LJIIJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i, float f, float f2, float f3, float f4) {
        C5HN c5hn = this.LJLJJL;
        if (c5hn != null && this.LJLJJI) {
            return c5hn.LJIIJ(nLETrack, nLETrackSlot, i, f, f2, f3, f4);
        }
        return false;
    }
}
