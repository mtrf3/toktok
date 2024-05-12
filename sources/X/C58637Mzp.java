package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Mzp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58637Mzp extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final C58637Mzp LJLIL = new C58637Mzp();

    public C58637Mzp() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(Aweme.class);
        if (LIZ != null) {
            return C30581Hy.LJJJJ(Boolean.valueOf(O5Y.LJJIL(((Aweme) LIZ).getAwemeRawAd())));
        }
        throw new C58623Mzb(Aweme.class);
    }
}
