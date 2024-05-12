package X;

import com.ss.android.ugc.aweme.bytebench.PublishDowngradeOptiStrategy;

/* renamed from: X.Hm3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45043Hm3 {
    public static boolean LIZ() {
        PublishDowngradeOptiStrategy publishDowngradeOptiStrategy;
        InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(EF7.LJIIIZ);
        if (LIZIZ != null) {
            publishDowngradeOptiStrategy = (PublishDowngradeOptiStrategy) LIZIZ.LJIILJJIL(PublishDowngradeOptiStrategy.class);
        } else {
            publishDowngradeOptiStrategy = null;
        }
        if (C00F.LIZ(31744, -1, "publish_type_bytebench_memory_downgrade", true) == 1) {
            if (publishDowngradeOptiStrategy == null) {
                return false;
            }
            return publishDowngradeOptiStrategy.hitEnvironmentV1();
        }
        if (C00F.LIZ(31744, -1, "publish_type_bytebench_memory_downgrade", true) == 2) {
            if (publishDowngradeOptiStrategy == null) {
                return false;
            }
            return publishDowngradeOptiStrategy.hitEnvironmentV2();
        }
        if (C00F.LIZ(31744, -1, "publish_type_bytebench_memory_downgrade", true) != 4 || publishDowngradeOptiStrategy == null) {
            return false;
        }
        return publishDowngradeOptiStrategy.hitEnvironmentV3();
    }
}
