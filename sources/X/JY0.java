package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem;

/* loaded from: classes9.dex */
public final class JY0 implements InterfaceC49337JXx {
    public final /* synthetic */ SearchCardFeedbackAssem<T> LIZ;
    public final /* synthetic */ View LIZIZ;

    @Override // X.InterfaceC49337JXx
    public final void LIZ() {
        View view;
        JYG jyg;
        if (this.LIZ.c4()) {
            view = this.LIZ.b4();
        } else {
            view = this.LIZIZ;
        }
        if (view != null) {
            JY1 jy1 = this.LIZ;
            String LLLLZIL = jy1.LLLLZIL();
            if (LLLLZIL == null) {
                jyg = null;
            } else {
                jyg = new JYG(LLLLZIL, null, null, C51757KSz.LIZLLL(LLLLZIL), null, null, null, 118, null);
                jy1.n2(jyg);
            }
            C51757KSz.LIZIZ(view, jyg);
        }
    }

    public JY0(SearchCardFeedbackAssem<T> searchCardFeedbackAssem, View view) {
        this.LIZ = searchCardFeedbackAssem;
        this.LIZIZ = view;
    }
}
