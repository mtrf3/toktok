package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* renamed from: X.JlW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50106JlW {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(DynamicPatch dynamicPatch) {
        String str;
        String rawData;
        if (dynamicPatch == null || (str = dynamicPatch.schema) == null || str.length() == 0 || (rawData = dynamicPatch.getRawData()) == null || rawData.length() == 0) {
            return 3;
        }
        android.net.Uri parse = UriProtector.parse(dynamicPatch.schema);
        String queryParameter = UriProtector.getQueryParameter(parse, "channel");
        String queryParameter2 = UriProtector.getQueryParameter(parse, "bundle");
        if (queryParameter == null || queryParameter2 == null) {
            return 2;
        }
        if (!O3U.LJIILL(queryParameter)) {
            return 1;
        }
        return 0;
    }
}
