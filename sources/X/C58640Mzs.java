package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Mzs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58640Mzs extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final C58640Mzs LJLIL = new C58640Mzs();

    public C58640Mzs() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(Aweme.class);
        if (LIZ != null) {
            return C59406NTe.LJI((Aweme) LIZ);
        }
        throw new C58623Mzb(Aweme.class);
    }
}
