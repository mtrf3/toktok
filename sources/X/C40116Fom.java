package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.ECommerceHybridServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Fom, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40116Fom extends AbstractC40121For {
    @Override // X.AbstractC40151FpL
    public final void LIZ(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        C40115Fol.LIZ(sparkContext, "ecom");
    }

    @Override // X.AbstractC40151FpL
    public final void LIZIZ(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        E99.LIZ(sparkContext, "ecom");
    }

    @Override // X.AbstractC40151FpL
    public final boolean LIZJ(android.net.Uri uri) {
        return LIZLLL(String.valueOf(uri));
    }

    @Override // X.AbstractC40151FpL
    public final boolean LIZLLL(String str) {
        if (str == null) {
            return false;
        }
        String queryParameter = UriProtector.getQueryParameter(C17N.LJJJJIZL(str), "target_handler");
        if (queryParameter != null && s.LJJJLZIJ(queryParameter, "ecom", false)) {
            return false;
        }
        Iterator it = ((ArrayList) ORZ.LLIIIZ(ECommerceHybridServiceImpl.LJIIIIZZ().LJI(str), C47261Igj.LJJIJ(C73342uI.LJLIL))).iterator();
        while (it.hasNext()) {
            if (((ISparkRouterInterceptor) it.next()).matchInterceptRules(str)) {
                return true;
            }
        }
        return false;
    }
}
