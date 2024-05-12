package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KK0 extends AbstractC65781Prl implements InterfaceC88472Yns<KJU, Object> {
    public static final KK0 LJLIL = new KK0();

    public KK0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(KJU kju) {
        String aid;
        KJU it = kju;
        o.LJIIIZ(it, "it");
        Aweme aweme = (Aweme) it.LIZJ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }
}
