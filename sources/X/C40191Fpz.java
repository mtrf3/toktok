package X;

import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Fpz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40191Fpz extends AbstractC40121For {
    @Override // X.AbstractC40151FpL
    public final void LIZ(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        ((ILiveSparkService) CN1.LIZ(ILiveSparkService.class)).Y90(sparkContext);
    }

    @Override // X.AbstractC40151FpL
    public final boolean LIZLLL(String str) {
        String queryParameter;
        if (str == null || (queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "__live_platform__")) == null) {
            return false;
        }
        return queryParameter.equals("webcast");
    }
}
