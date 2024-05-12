package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class LCY {
    public InterfaceC53908LDs LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 938));

    public AbstractC53958LFq LIZJ() {
        return null;
    }

    public final AbstractC53958LFq LIZIZ() {
        return (AbstractC53958LFq) this.LIZIZ.getValue();
    }

    public InterfaceC53908LDs LIZ(LCZ lcz, LCP lcp) {
        KeyEvent.Callback LIZ = lcz.LIZ(lcp);
        o.LJII(LIZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.ui.view.tab.ITopTabView");
        return (InterfaceC53908LDs) LIZ;
    }
}
