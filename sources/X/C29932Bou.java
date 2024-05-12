package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Bou, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29932Bou {
    public static final void LIZ(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        android.net.Uri parse = UriProtector.parse(sparkContext.url);
        o.LJIIIIZZ(parse, "Uri.parse(this)");
        if (o.LJ(UriProtector.getQueryParameter(parse, "need_cpc"), "1")) {
            sparkContext.LJII(InterfaceC60142Nj0.class, new C29933Bov());
        }
        if (o.LJ(UriProtector.getQueryParameter(parse, "show_title_bar"), "1") || o.LJ(UriProtector.getQueryParameter(parse, "show_title_bar"), "true")) {
            sparkContext.LJII(InterfaceC60142Nj0.class, new C29931Bot(parse, sparkContext));
        }
    }
}
