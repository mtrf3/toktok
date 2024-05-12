package X;

import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.streamedit.DefaultStreamEditSubPanelHelper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.GhZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42217GhZ extends AbstractC42221Ghd {
    public boolean LIZ;
    public final /* synthetic */ DefaultStreamEditSubPanelHelper LIZIZ;

    public C42217GhZ(DefaultStreamEditSubPanelHelper defaultStreamEditSubPanelHelper) {
        this.LIZIZ = defaultStreamEditSubPanelHelper;
    }

    @Override // X.InterfaceC42216GhY
    public final boolean LIZIZ(boolean z) {
        DefaultStreamEditSubPanelHelper defaultStreamEditSubPanelHelper = this.LIZIZ;
        InterfaceC42220Ghc interfaceC42220Ghc = defaultStreamEditSubPanelHelper.LJLJJI;
        if (interfaceC42220Ghc == null) {
            return false;
        }
        if (z) {
            C44428Hc8 stopwatch = (C44428Hc8) defaultStreamEditSubPanelHelper.LJLJLJ.getValue();
            o.LJIIIIZZ(stopwatch, "stopwatch");
            if (stopwatch.LIZIZ) {
                stopwatch.LJ();
            }
            if (this.LIZ) {
                this.LIZ = false;
                interfaceC42220Ghc.LIZIZ();
                C42213GhV c42213GhV = C42210GhS.LLI;
                long LIZIZ = ((C44428Hc8) this.LIZIZ.LJLJLJ.getValue()).LIZIZ(TimeUnit.MILLISECONDS);
                String str = this.LIZIZ.LJLJI;
                c42213GhV.getClass();
                C42213GhV.LIZ(1, LIZIZ, str);
            }
            return false;
        }
        if (!interfaceC42220Ghc.LIZ()) {
            return false;
        }
        this.LIZ = true;
        ((C44428Hc8) this.LIZIZ.LJLJLJ.getValue()).LIZJ();
        ((C44428Hc8) this.LIZIZ.LJLJLJ.getValue()).LIZLLL();
        interfaceC42220Ghc.LIZJ();
        C42213GhV c42213GhV2 = C42210GhS.LLI;
        String str2 = this.LIZIZ.LJLJI;
        c42213GhV2.getClass();
        C42213GhV.LIZ(0, 0L, str2);
        return true;
    }
}
