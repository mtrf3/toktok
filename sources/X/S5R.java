package X;

import Y.AUListenerS90S0100000_1;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileVM;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S5R extends AbstractC65781Prl implements InterfaceC88471Ynr<AdProductTileAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final S5R LJLIL = new S5R();

    public S5R() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdProductTileAssem adProductTileAssem, C43I<? extends C76800UCe> c43i) {
        LinearLayoutManager linearLayoutManager;
        int LLILLJJLI;
        AdProductTileAssem selectSubscribe = adProductTileAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            int i = 0;
            if (!selectSubscribe.LLII) {
                selectSubscribe.getContainerView().setVisibility(0);
                View Y3 = selectSubscribe.Y3();
                Y3.getLayoutParams().height = 0;
                Y3.requestLayout();
                Y3.setVisibility(0);
                ValueAnimator ofInt = ValueAnimator.ofInt(0, C17N.LJIILL(52.0d));
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new AUListenerS90S0100000_1(Y3, 67));
                ofInt.start();
                selectSubscribe.u4().lv0();
            }
            if (selectSubscribe.LLIIIZ) {
                C0A2 layoutManager = selectSubscribe.q4().getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (LLILLJJLI = linearLayoutManager.LLILLJJLI()) >= 0) {
                    while (true) {
                        if (i < selectSubscribe.q4().getState().LJIIIIZZ()) {
                            AdProductTileVM u4 = selectSubscribe.u4();
                            InterfaceC57784Mm4 LJI = selectSubscribe.q4().getState().LJI(i);
                            o.LJII(LJI, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileItem");
                            u4.kv0(i, ((S5M) LJI).LJLIL.getProductId());
                        }
                        if (i == LLILLJJLI) {
                            break;
                        }
                        i++;
                    }
                }
            }
            selectSubscribe.LLII = true;
            selectSubscribe.LLIIIZ = true;
        }
        return C76800UCe.LIZ;
    }
}
