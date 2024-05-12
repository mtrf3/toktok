package X;

import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JY9 implements InterfaceC49224JTo {
    public final Taco LJLIL;
    public final JYE LJLILLLLZI;
    public final /* synthetic */ JU8 LJLJI = new JU8();
    public final int[] LJLJJI = new int[2];
    public final AqS155S0200000_8 LJLJJL;

    @Override // X.InterfaceC49224JTo
    public final void LLLLLILLIL() {
        this.LJLJI.LJLIL = null;
    }

    @Override // X.InterfaceC49224JTo
    public final void LLIIJI(JU3 eventDispatcher) {
        o.LJIIIZ(eventDispatcher, "eventDispatcher");
        JU8 ju8 = this.LJLJI;
        ju8.getClass();
        ju8.LJLIL = eventDispatcher;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.JYC, T] */
    public JY9(Taco taco, JYE jye) {
        this.LJLIL = taco;
        this.LJLILLLLZI = jye;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new JYC(0, 0);
        jye.LIZIZ.getViewTreeObserver().addOnGlobalLayoutListener(new JYA(this, c68322mC));
        jye.LIZ.LJIIJJI(new JYB(this, c68322mC));
        this.LJLJJL = new AqS155S0200000_8(this, (JY9) c68322mC, (C68322mC<JYC>) 43);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(androidx.recyclerview.widget.RecyclerView r12, int r13, X.JYC r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JY9.LIZ(androidx.recyclerview.widget.RecyclerView, int, X.JYC):void");
    }
}
