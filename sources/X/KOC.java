package X;

import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.LynxExposeHelper;

/* loaded from: classes9.dex */
public final class KOC implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ LynxExposeHelper.ExposeView LJLILLLLZI;

    public KOC(String str, LynxExposeHelper.ExposeView exposeView) {
        this.LJLIL = str;
        this.LJLILLLLZI = exposeView;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on scroll schema: ");
        LIZ.append(this.LJLIL);
        C49133JQb.LIZ("LynxExposeHelper", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.LIZIZ(KOD.SCROLL);
    }
}
