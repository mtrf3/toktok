package X;

import com.ss.android.ugc.aweme.ab.SearchVerticalFragmentSparkOptConfig;

/* renamed from: X.KFd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51397KFd {
    public static SearchVerticalFragmentSparkOptConfig LIZ;

    public static boolean LIZ() {
        Boolean bool;
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            SearchVerticalFragmentSparkOptConfig searchVerticalFragmentSparkOptConfig = LIZ;
            LJIIIZ.getClass();
            SearchVerticalFragmentSparkOptConfig searchVerticalFragmentSparkOptConfig2 = (SearchVerticalFragmentSparkOptConfig) FFL.LJIJ(true, "ecom_search_spark_config", 31744, SearchVerticalFragmentSparkOptConfig.class, searchVerticalFragmentSparkOptConfig);
            LIZ = searchVerticalFragmentSparkOptConfig2;
            if (searchVerticalFragmentSparkOptConfig2 != null && (bool = searchVerticalFragmentSparkOptConfig2.enableShopVerticalSearchSparkOptimization) != null) {
                return bool.booleanValue();
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
