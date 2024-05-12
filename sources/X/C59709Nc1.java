package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead.AdInteractiveAssem;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Nc1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59709Nc1 extends AbstractC65781Prl implements InterfaceC88471Ynr<AdInteractiveAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C59709Nc1 LJLIL = new C59709Nc1();

    public C59709Nc1() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdInteractiveAssem adInteractiveAssem, C43I<? extends Integer> c43i) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AdInteractionData adInteractionData;
        UrlModel popupImage;
        AdInteractiveAssem selectSubscribe = adInteractiveAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C53324KwK.LIZ() || c43i != null) {
            selectSubscribe.c4().LIZJ();
            VideoItemParams gv0 = selectSubscribe.a4().gv0();
            if (gv0 != null && (aweme = gv0.getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adInteractionData = awemeRawAd.getAdInteractionData()) != null && (popupImage = adInteractionData.getPopupImage()) != null) {
                W5F LJII = W5U.LJII(C78939UyV.LJ(popupImage));
                LJII.LIZJ = selectSubscribe.getContext();
                LJII.LJIIIIZZ();
            }
        }
        return C76800UCe.LIZ;
    }
}
