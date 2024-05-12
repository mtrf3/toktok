package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFM implements C2LI {
    public final View LJLIL;
    public final int LJLILLLLZI;
    public final Context LJLJI;

    @Override // X.C2LI
    public final int LJJIFFI(int i) {
        LLQ Xm0;
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(this.LJLJI)) {
            Context context = this.LJLJI;
            if ((context instanceof ActivityC45651qj) && (Xm0 = LNZ.LIZIZ.getHomeTabViewModel((ActivityC45651qj) context).Xm0()) != null && !Xm0.LJIILLIIL()) {
                LFH.LIZIZ.LIZLLL().LJIIZILJ();
                return Math.max(0, i - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LEZ.LIZLLL()))));
            }
            return i;
        }
        return i;
    }

    public LFM(C62828OlE progressBar, int i) {
        o.LJIIIZ(progressBar, "progressBar");
        this.LJLIL = progressBar;
        this.LJLILLLLZI = i;
        Context context = progressBar.getContext();
        o.LJIIIIZZ(context, "progressBar.context");
        this.LJLJI = context;
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(context)) {
            LFQ.LIZIZ(new LFO(this));
        }
    }
}
