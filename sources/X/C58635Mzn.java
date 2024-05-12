package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Mzn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58635Mzn extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final C58635Mzn LJLIL = new C58635Mzn();

    public C58635Mzn() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(Aweme.class);
        if (LIZ != null) {
            if (O5Y.LJJJJI((Aweme) LIZ)) {
                return 1;
            }
            return null;
        }
        throw new C58623Mzb(Aweme.class);
    }
}
