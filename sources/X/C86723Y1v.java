package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS104S0300000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86723Y1v extends AbstractC65781Prl implements InterfaceC88473Ynt<TranslationStatusAssem, Y1Y, Boolean, C76800UCe> {
    public static final C86723Y1v LJLIL = new C86723Y1v();

    public C86723Y1v() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(TranslationStatusAssem translationStatusAssem, Y1Y y1y, Boolean bool) {
        View r4;
        TranslationStatusAssem selectSubscribe = translationStatusAssem;
        Y1Y state = y1y;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        View r42 = selectSubscribe.r4(selectSubscribe.LLIIJLIL);
        if (booleanValue || (r4 = selectSubscribe.r4(state)) == null) {
            selectSubscribe.B4();
        } else if (r42 == null) {
            r4.setVisibility(0);
        } else {
            C150165uu.LIZ(r42, r4, new AqS104S0300000_15(r42, r4, selectSubscribe, 12));
        }
        boolean z = state instanceof Y0N;
        if (z) {
            selectSubscribe.LLIIL = ((Y0N) state).LIZJ;
        }
        selectSubscribe.LLIIJLIL = state;
        if (z) {
            Z9N z9n = Z9N.LIZIZ;
            if (z9n.LLJILLL(selectSubscribe.getContext(), ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme()) && selectSubscribe.getContext() != null && !z9n.LLLLJI()) {
                C26045AKb c26045AKb = new C26045AKb(selectSubscribe.getContainerView());
                c26045AKb.LJIIIIZZ(R.string.dck);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }
}
