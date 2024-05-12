package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2U extends Y20<Y2Y> {
    @Override // X.Y20
    public final boolean LIZ(Aweme aweme, InterfaceC86772Y3s interfaceC86772Y3s, String targetLang) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(targetLang, "targetLang");
        return o.LJ(C2058886e.LIZIZ(aweme), ((Y2Y) interfaceC86772Y3s).LJLIL);
    }

    public final Y2Y LJ(String str, String str2, String targetLang, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(targetLang, "targetLang");
        Y2Y y2y = new Y2Y(str, str2, targetLang);
        LIZLLL(aweme, y2y, targetLang);
        return y2y;
    }
}
