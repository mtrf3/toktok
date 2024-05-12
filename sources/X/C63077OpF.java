package X;

import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;

/* renamed from: X.OpF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63077OpF {
    public static final LinkedHashMap<String, LinkData> LIZ = new LinkedHashMap<>(12, 0.75f, true);

    public static LinkData LIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getLinkAdData() == null && aweme.needPreloadAdLink()) {
            aweme.setLinkAdData(LIZ.get(aweme.getAid()));
        }
        return aweme.getLinkAdData();
    }
}
