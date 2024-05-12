package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C40127Fox;
import X.E98;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EComCustomThirdPartyBackRouter implements ICustomSparkRouter {
    @Override // com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter
    public final String LIZ(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        Uri uri = UriProtector.parse(str);
        o.LJIIIIZZ(uri, "uri");
        String uri2 = E98.LIZ(uri, "aweme").toString();
        o.LJIIIIZZ(uri2, "convert(uri, \"aweme\").toString()");
        return uri2;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter
    public final boolean LIZIZ(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        C40127Fox.LIZ.getClass();
        if (!C40127Fox.LIZ().enableSparkContainer) {
            return false;
        }
        return ujb.o.LJJJLIIL(str, "aweme://echybrid/intercept_back", false);
    }
}
