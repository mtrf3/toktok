package X;

import com.google.android.play.core.assetpacks.r2;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S1C extends r2 {
    public static DialogC71377Rzp LJLIL;

    @Override // com.google.android.play.core.assetpacks.r2
    public final void LJIIJJI(C7F9 c7f9) {
        for (S1E s1e : c7f9.LIZJ()) {
            s1e.LJIJJ(s1e.LJIIIZ().LJJLL());
        }
    }

    @Override // com.google.android.play.core.assetpacks.r2
    public final boolean LJIILL(C7F9 chain) {
        o.LJIIIZ(chain, "chain");
        if (chain.LIZIZ() > 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.r2
    public final void LJIIL(S1F tagView, C7F9 chain) {
        o.LJIIIZ(chain, "chain");
        o.LJIIIZ(tagView, "tagView");
        super.LJIIL(tagView, chain);
        try {
            if (chain.LIZIZ() < 2) {
                for (S1E s1e : chain.LIZJ()) {
                    if (s1e instanceof S0Q) {
                        s1e.LJIILL(tagView.LJIIIZ(), s1e.LJIIIZ().LJJLL(), true);
                    }
                }
                return;
            }
            for (S1E s1e2 : chain.LIZJ()) {
                s1e2.LJIILL(tagView.LJIIIZ(), s1e2.LJIIIZ().LJJLL(), false);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
    
        if (r11 == false) goto L28;
     */
    @Override // com.google.android.play.core.assetpacks.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.S1F r22, X.C7F9 r23) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S1C.LJIILIIL(X.S1F, X.7F9):void");
    }
}
