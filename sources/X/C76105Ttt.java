package X;

import android.os.Handler;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Ttt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76105Ttt implements C0A3 {
    public final /* synthetic */ C76104Tts LJLIL;

    public C76105Ttt(C76104Tts c76104Tts) {
        this.LJLIL = c76104Tts;
    }

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        int LJJJLL;
        o.LJIIIZ(view, "view");
        if (this.LJLIL.LIZJ.getLayoutManager() != null && (LJJJLL = C0A2.LJJJLL(view)) >= 0) {
            this.LJLIL.LJ.remove(Integer.valueOf(LJJJLL));
            this.LJLIL.LJFF.remove(Integer.valueOf(LJJJLL));
        }
        this.LJLIL.LIZ();
    }

    @Override // X.C0A3
    public final void LJJIFFI(View view) {
        int LJJJLL;
        o.LJIIIZ(view, "view");
        if (this.LJLIL.LIZJ.getLayoutManager() != null && (LJJJLL = C0A2.LJJJLL(view)) >= 0) {
            this.LJLIL.LJ.put(Integer.valueOf(LJJJLL), new C75295Tgp(LJJJLL, view));
        }
        this.LJLIL.LIZ();
        if (this.LJLIL.LJIIJ) {
            Handler LIZ = C15610jN.LIZ();
            C76104Tts c76104Tts = this.LJLIL;
            LIZ.removeCallbacks(c76104Tts.LJIIL);
            LIZ.postDelayed(c76104Tts.LJIIL, 200L);
        }
    }
}
