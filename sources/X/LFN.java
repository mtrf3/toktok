package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFN implements C90N {
    public final Context LJLIL;
    public final ViewGroup LJLILLLLZI;
    public final int LJLJI = 47;

    @Override // X.C90N
    public final void LJJJI() {
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(this.LJLIL)) {
            LIZ();
        }
    }

    public final void LIZ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        LLQ Xm0;
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            Context context = this.LJLIL;
            if (!(context instanceof ActivityC45651qj) || (Xm0 = LNZ.LIZIZ.getHomeTabViewModel((ActivityC45651qj) context).Xm0()) == null || Xm0.LJIILLIIL()) {
                i = this.LJLJI;
            } else {
                int i2 = this.LJLJI;
                LFH.LIZIZ.LIZLLL().LJIIZILJ();
                i = i2 - LEZ.LIZLLL();
            }
            int LIZIZ = C7MY.LIZIZ(i);
            if (marginLayoutParams.bottomMargin != LIZIZ) {
                marginLayoutParams.bottomMargin = LIZIZ;
                viewGroup.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public LFN(View view) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, "feedView.context");
        this.LJLIL = context;
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(context)) {
            this.LJLILLLLZI = (ViewGroup) view.findViewById(R.id.epl);
            LFQ.LIZIZ(new LFP(this));
        }
    }
}
