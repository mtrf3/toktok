package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N43 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N43 LJLIL = new N43();

    public N43() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        AwemeRawAd awemeRawAd = (AwemeRawAd) $receiver.LIZ(AwemeRawAd.class);
        if (awemeRawAd != null) {
            return awemeRawAd.getAdvId();
        }
        return null;
    }
}
