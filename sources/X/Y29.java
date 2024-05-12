package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y29 extends Y20<C69402nw> {
    @Override // X.Y20
    public final String LIZIZ(Aweme aweme, String targetLang) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(targetLang, "targetLang");
        StringBuilder LIZ = X1D.LIZ();
        Object LJIIJ = C86670Xzu.LJIIJ(aweme);
        if (LJIIJ == null) {
            LJIIJ = aweme.getAid();
        }
        o.LJIIIIZZ(LJIIJ, "aweme.getOriginalClaSubtitleId() ?: aweme.aid");
        LIZ.append(LJIIJ);
        LIZ.append(targetLang);
        return X1D.LIZIZ(LIZ);
    }
}
