package com.ss.android.ugc.aweme.favorites.business.collection;

import X.AbstractC54341LUj;
import X.C76800UCe;
import X.LIZ;
import X.M5X;
import X.OSZ;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CollectionDetailAction extends AbstractC54341LUj<C76800UCe> {
    public static final int $stable = 0;
    public static final LIZ Companion = new LIZ();
    public static final String path = "aweme://collection/detail";

    public static final String getPath() {
        Companion.getClass();
        return path;
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        String str = path;
        originalQueryMap.put("gd_label", "collection_video");
        return new OSZ<>(str, originalQueryMap);
    }
}
