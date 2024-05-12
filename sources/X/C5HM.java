package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.5HM, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5HM implements InterfaceC132925Jo {
    public ActivityC45651qj LJLIL;
    public FrameLayout LJLILLLLZI;
    public boolean LJLJI;
    public OSZ<Float, Float> LJLJJI;
    public NLEModel LJLJJL;
    public C5HN LJLJJLL;
    public boolean LJLJL;

    @Override // X.InterfaceC132925Jo
    public final void LIZJ() {
        C5HN c5hn = this.LJLJJLL;
        if (c5hn != null) {
            c5hn.LIZJ();
        }
    }

    @Override // X.InterfaceC132925Jo
    public final void LJIILL() {
        if (!this.LJLJI) {
            return;
        }
        C5HN c5hn = this.LJLJJLL;
        if (c5hn != null) {
            c5hn.LJIILIIL(this.LJLILLLLZI, this);
        }
        this.LJLJI = false;
    }

    @Override // X.InterfaceC132925Jo
    public final void LJIJI() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (activityC45651qj == null || frameLayout == null || this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        C5HN c5hn = this.LJLJJLL;
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
    public final EnumC132175Gr LJIJJLI() {
        return EnumC132175Gr.ANTICLOCKWISE;
    }

    @Override // X.InterfaceC132925Jo
    public final void LIZ(Canvas canvas) {
        C5HN c5hn;
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLJI && (c5hn = this.LJLJJLL) != null) {
            c5hn.LIZ(canvas);
        }
    }

    @Override // X.InterfaceC132925Jo
    public final void LIZIZ(NLEModel nleModel) {
        C5HN c5hn;
        o.LJIIIZ(nleModel, "nleModel");
        this.LJLJJL = nleModel;
        if (this.LJLJI && (c5hn = this.LJLJJLL) != null) {
            c5hn.LIZIZ(nleModel);
        }
    }

    @Override // X.InterfaceC132925Jo
    public final void LIZLLL(long j) {
        C5HN c5hn;
        if (this.LJLJI && (c5hn = this.LJLJJLL) != null) {
            c5hn.LIZLLL(j);
        }
    }

    @Override // X.InterfaceC132925Jo
    public final void LJIIIZ(OSZ<Float, Float> canvasSize) {
        o.LJIIIZ(canvasSize, "canvasSize");
        this.LJLJJI = canvasSize;
    }

    @Override // X.C5HO
    public final boolean LJJJJ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        C5HN c5hn = this.LJLJJLL;
        if (c5hn == null || !c5hn.LJJJJ(event)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132925Jo
    public final void LJIILJJIL(NLETrack track, NLETrackSlot slot) {
        Float f;
        Integer num;
        C5HN c5hn;
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        NLEModel nLEModel = this.LJLJJL;
        Integer num2 = null;
        if (nLEModel != null) {
            f = Float.valueOf(nLEModel.getCanvasRatio());
        } else {
            f = null;
        }
        OSZ<Float, Float> osz = this.LJLJJI;
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            num = Integer.valueOf(frameLayout.getMeasuredWidth());
        } else {
            num = null;
        }
        FrameLayout frameLayout2 = this.LJLILLLLZI;
        if (frameLayout2 != null) {
            num2 = Integer.valueOf(frameLayout2.getMeasuredHeight());
        }
        C5PT LIZIZ = C132865Ji.LIZIZ(this, slot, f, osz, num, num2);
        if (LIZIZ != null && (c5hn = this.LJLJJLL) != null) {
            c5hn.LJIJ(track, slot, LIZIZ);
        }
    }

    @Override // X.C5HO
    public final boolean LJIILLIIL(NLETrack track, NLETrackSlot slot, MotionEvent e) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        C5HN c5hn = this.LJLJJLL;
        if (c5hn != null && this.LJLJI) {
            return c5hn.LJIILLIIL(track, slot, e);
        }
        return false;
    }

    @Override // X.C5HO
    public final boolean LJIIZILJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i) {
        C5HN c5hn = this.LJLJJLL;
        if (c5hn != null && this.LJLJI) {
            return c5hn.LJIIZILJ(nLETrack, nLETrackSlot, i);
        }
        return false;
    }

    @Override // X.C5HO
    public final boolean LJIL(NLETrack track, NLETrackSlot slot, MotionEvent e) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        C5HN c5hn = this.LJLJJLL;
        if (c5hn != null && this.LJLJI) {
            return c5hn.LJIL(track, slot, e);
        }
        return false;
    }

    @Override // X.C5HO
    public final boolean LJJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, float f) {
        C5HN c5hn = this.LJLJJLL;
        if (c5hn != null && this.LJLJI) {
            if (!this.LJLJL) {
                nLETrackSlot.getScale();
                this.LJLJL = true;
            }
            boolean LJJ = c5hn.LJJ(nLETrack, nLETrackSlot, f);
            if (LJJ) {
                nLETrackSlot.getScale();
            }
            return LJJ;
        }
        return false;
    }

    @Override // X.C5HO
    public final boolean LJ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.LJLJL = false;
        C5HN c5hn = this.LJLJJLL;
        if (c5hn == null || !this.LJLJI) {
            return false;
        }
        return c5hn.LJ(z, z2, z3, z4, z5);
    }

    @Override // X.C5HO
    public final boolean LJIIJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i, float f, float f2, float f3, float f4) {
        C5HN c5hn = this.LJLJJLL;
        if (c5hn != null && this.LJLJI) {
            return c5hn.LJIIJ(nLETrack, nLETrackSlot, i, f, f2, f3, f4);
        }
        return false;
    }
}
