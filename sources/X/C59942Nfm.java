package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdTopInteractInfoAreaTagAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Nfm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59942Nfm extends AbstractC65781Prl implements InterfaceC88471Ynr<AdTopInteractInfoAreaTagAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C59942Nfm LJLIL = new C59942Nfm();

    public C59942Nfm() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdTopInteractInfoAreaTagAssem adTopInteractInfoAreaTagAssem, C43I<? extends Integer> c43i) {
        AdTopInteractInfoAreaTagAssem selectSubscribe = adTopInteractInfoAreaTagAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            N0D.LIZ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAwemeRawAd(), 2, selectSubscribe.q4().getShowTagNum());
        }
        return C76800UCe.LIZ;
    }
}
