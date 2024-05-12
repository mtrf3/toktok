package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JIo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48938JIo extends AbstractC48937JIn {
    public final /* synthetic */ C48948JIy LJLIL;

    @Override // X.AbstractC48937JIn, X.JUO
    public final void LJIIIZ() {
        this.LJLIL.LJLL.setBackgroundColor(-16777216);
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void LIZIZ() {
        Aweme aweme;
        JON jon;
        if (C46314IFq.LIZIZ() && ((aweme = this.LJLIL.LJLLLLLL) == null || !aweme.isAd())) {
            JHK jhk = EnumC48916JHs.Companion;
            J1C.LJ();
            int i = J1C.LIZIZ;
            jhk.getClass();
            EnumC48916JHs LIZ = JHK.LIZ(i);
            if (LIZ != null && (jon = this.LJLIL.LJLLJ) != null) {
                jon.LIZ(LIZ, false);
            }
            JON jon2 = this.LJLIL.LJLLJ;
            if (jon2 != null) {
                jon2.setVisibility(0);
            }
        }
        this.LJLIL.LJLJLLL.getLiveCore().setMute(J1C.LIZ(C46314IFq.LIZIZ() ? 1 : 0, 0, this.LJLIL.LJLLLLLL));
    }

    public final void LJIIIIZZ() {
        JON jon;
        if (!C46314IFq.LIZIZ() || (jon = this.LJLIL.LJLLJ) == null) {
            return;
        }
        jon.setVisibility(8);
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void LIZ() {
        LJIIIIZZ();
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void onPause() {
        LJIIIIZZ();
    }

    public C48938JIo(C48948JIy c48948JIy) {
        this.LJLIL = c48948JIy;
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void onError(String info) {
        o.LJIIIZ(info, "info");
        LJIIIIZZ();
    }

    @Override // X.AbstractC48937JIn, X.JUO
    public final void LJI(int i, int i2, View view) {
        C48948JIy c48948JIy = this.LJLIL;
        c48948JIy.getClass();
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int width = c48948JIy.LJLL.getWidth();
        int height = c48948JIy.LJLL.getHeight();
        if (width <= 0 || height <= 0 || c48948JIy.LJLJLLL.getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c48948JIy.LJLJLLL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (i > i2) {
            layoutParams2.gravity = 17;
            return;
        }
        float f = i2 / i;
        float f2 = width;
        if (f >= height / f2) {
            layoutParams2.height = height;
        } else {
            layoutParams2.height = (int) (f2 * f);
        }
        layoutParams2.gravity = 17;
        c48948JIy.LJLJLLL.setLayoutParams(layoutParams2);
    }
}
