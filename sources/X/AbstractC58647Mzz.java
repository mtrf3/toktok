package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Arrays;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Mzz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC58647Mzz extends N07 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC58624Mzc
    public InterfaceC58549MyP LJJ() {
        return C58649N0b.LIZ(new N01(this), C58627Mzf.LIZ, C58530My6.LJ.getValue(), new N02(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC58647Mzz(Object... contexts) {
        super(Arrays.copyOf(contexts, contexts.length));
        o.LJIIIZ(contexts, "contexts");
    }

    @Override // X.N07
    public final CommonAdData LJJIII(M95 m95) {
        o.LJIIIZ(m95, "<this>");
        CommonAdData commonAdData = (CommonAdData) m95.LIZ(CommonAdData.class);
        if (commonAdData == null) {
            CommonAdData commonAdData2 = (CommonAdData) m95.LIZ(AwemeRawAd.class);
            if (commonAdData2 != null) {
                return commonAdData2;
            }
            Aweme aweme = (Aweme) m95.LIZ(Aweme.class);
            if (aweme != null) {
                return aweme.getAwemeRawAd();
            }
            return null;
        }
        return commonAdData;
    }

    @Override // X.N07
    public final C58600MzE LJJII(InterfaceC58626Mze event, C58620MzY extraInjector) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(extraInjector, "extraInjector");
        N06.LIZ.getClass();
        return new C58600MzE(new C58601MzF(N06.LIZIZ, new AqS176S0100000_10(event, (InterfaceC58626Mze<OSJ<String, String, String>>) 85)), new C58601MzF(N06.LIZJ, new AqS176S0100000_10(event, (InterfaceC58626Mze<OSJ<String, String, String>>) 86)), new C58601MzF(N06.LIZLLL, N03.LJLIL), new C58601MzF(N06.LJFF, new AqS176S0100000_10(this, 87)), new C58601MzF(N06.LJIIIZ, new AqS176S0100000_10(this, 88)), new C58601MzF(N06.LJI, new AqS176S0100000_10(this, 89)), new C58601MzF(N06.LJIIJ, new AqS176S0100000_10(this, 90)), new C58601MzF(N06.LJIIJJI, new AqS176S0100000_10(this, 91)), new C58601MzF(N06.LJIIIIZZ, C58570Myk.INSTANCE), new C58601MzF(N06.LJ, N04.LJLIL), new C58601MzF(N06.LJII, new AqS114S0300000_10(this, (AbstractC58647Mzz) event, (InterfaceC58626Mze<OSJ<String, String, String>>) extraInjector, (C58620MzY) 6)));
    }
}
