package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdBesideSponsorLabelTagAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Nfi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59938Nfi extends AbstractC65781Prl implements InterfaceC88471Ynr<AdBesideSponsorLabelTagAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C59938Nfi LJLIL = new C59938Nfi();

    public C59938Nfi() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdBesideSponsorLabelTagAssem adBesideSponsorLabelTagAssem, C43I<? extends Integer> c43i) {
        AdBesideSponsorLabelTagAssem selectSubscribe = adBesideSponsorLabelTagAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            N0D.LIZ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAwemeRawAd(), 1, selectSubscribe.q4().getShowTagNum());
        }
        return C76800UCe.LIZ;
    }
}
