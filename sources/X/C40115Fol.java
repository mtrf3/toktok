package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.ECommerceHybridServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Fol, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40115Fol {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        String str2 = sparkContext.url;
        android.net.Uri uri = UriProtector.parse(str2);
        o.LJIIIIZZ(uri, "uri");
        String uri2 = E98.LIZ(uri, "aweme").toString();
        o.LJIIIIZZ(uri2, "convert(uri, \"aweme\").toString()");
        sparkContext.LJJIJLIJ(uri2);
        List LLIIIZ = ORZ.LLIIIZ(ECommerceHybridServiceImpl.LJIIIIZZ().LJI(sparkContext.url), C47261Igj.LJJIJ(C73342uI.LJLIL));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LLIIIZ).iterator();
        while (it.hasNext()) {
            ISparkRouterInterceptor iSparkRouterInterceptor = (ISparkRouterInterceptor) it.next();
            if (iSparkRouterInterceptor.matchInterceptRules(sparkContext.url)) {
                arrayList.addAll(iSparkRouterInterceptor.provideSparkInterceptActivityCallbacks());
                iSparkRouterInterceptor.handleSparkContext(sparkContext, sparkContext.url);
            }
        }
        if (C40117Fon.LIZ) {
            for (ISparkRouterInterceptor iSparkRouterInterceptor2 : ECommerceHybridServiceImpl.LJIIIIZZ().LIZJ()) {
                if (iSparkRouterInterceptor2.matchInterceptRules(str2)) {
                    arrayList.addAll(iSparkRouterInterceptor2.provideSparkInterceptActivityCallbacks());
                    iSparkRouterInterceptor2.handleSparkContext(sparkContext, str2);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sparkContext.LJJIJIIJI((InterfaceC60850NuQ) it2.next());
        }
    }
}
