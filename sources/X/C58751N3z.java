package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.N3z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58751N3z extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final C58751N3z LJLIL = new C58751N3z();

    public C58751N3z() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        Long adId;
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        AwemeRawAd awemeRawAd = (AwemeRawAd) $receiver.LIZ(AwemeRawAd.class);
        if (awemeRawAd != null && (adId = awemeRawAd.getAdId()) != null) {
            return String.valueOf(adId);
        }
        return null;
    }
}
