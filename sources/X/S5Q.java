package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S5Q extends AbstractC65781Prl implements InterfaceC88471Ynr<AdProductTileAssem, C43I<? extends Integer>, C76800UCe> {
    public static final S5Q LJLIL = new S5Q();

    public S5Q() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdProductTileAssem adProductTileAssem, C43I<? extends Integer> c43i) {
        Aweme aweme;
        LinearLayoutManager linearLayoutManager;
        int LLILLJJLI;
        AdProductTileAssem selectSubscribe = adProductTileAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            int i = 0;
            if (selectSubscribe.B4()) {
                selectSubscribe.A4(0);
            } else {
                selectSubscribe.A4(8);
            }
            if (selectSubscribe.B4()) {
                AwemeRawAd awemeRawAd = null;
                if (selectSubscribe.getContainerView().getVisibility() == 0) {
                    selectSubscribe.u4().lv0();
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
                } else {
                    VideoItemParams gv0 = selectSubscribe.u4().gv0();
                    if (gv0 != null && (aweme = gv0.getAweme()) != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    }
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
                    LIZLLL.LIZJ("card", "refer");
                    LIZLLL.LIZIZ("AdPlp", WM7.SCENE_SERVICE);
                    LIZLLL.LIZIZ("native_product_tile", "cardType");
                    LIZLLL.LJI();
                }
            }
            selectSubscribe.LLIIIL = true;
        }
        return C76800UCe.LIZ;
    }
}
