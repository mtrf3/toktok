package X;

import java.util.LinkedHashMap;

/* renamed from: X.DzW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35686DzW {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C35614DyM.LJLIL);
    public static final java.util.Map<String, Integer> LIZIZ = C113554cx.LJJLIIIIJ(new OSZ("ITabletDiff.webView", 2), new OSZ("ITabletFeed.isOptShareDialog", 2), new OSZ("ITabletSearch.getDiscoverCoverViewSize", 2), new OSZ("ITabletSearch.getDiscoverBannerHeight", 2), new OSZ("ITabletSearch.setDiscoverBannerPadding", 2), new OSZ("ITabletSearch.getDiscoverBannerMaxCountAndIndex", 2));

    public static boolean LIZ(String str) {
        Integer num = (Integer) ((java.util.Map) LIZ.getValue()).get(str);
        if (num != null && 2 == num.intValue()) {
            return true;
        }
        Integer num2 = (Integer) ((LinkedHashMap) LIZIZ).get(str);
        if (num2 == null || 2 != num2.intValue()) {
            return false;
        }
        return !LF2.LIZIZ(null);
    }
}
