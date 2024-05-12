package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Mzo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58636Mzo extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final C58636Mzo LJLIL = new C58636Mzo();

    public C58636Mzo() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(Aweme.class);
        if (LIZ != null) {
            if (((Aweme) LIZ).isSearchPreciseAd()) {
                return 1;
            }
            return null;
        }
        throw new C58623Mzb(Aweme.class);
    }
}
