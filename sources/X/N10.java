package X;

import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N10 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N10 LJLIL = new N10();

    public N10() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(Aweme.class);
        if (LIZ != null) {
            AwemeRawAd awemeRawAd = ((Aweme) LIZ).getAwemeRawAd();
            if (awemeRawAd != null) {
                return u.LJIILIIL(awemeRawAd);
            }
            return null;
        }
        throw new C58623Mzb(Aweme.class);
    }
}
