package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Fq2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40194Fq2 extends AbstractC40121For {
    @Override // X.AbstractC40151FpL
    public final void LIZ(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        sparkContext.LJJ(new C40196Fq4());
    }

    @Override // X.AbstractC40151FpL
    public final boolean LIZJ(android.net.Uri uri) {
        String str;
        if (uri != null) {
            str = UriProtector.getQueryParameter(uri, "tea_drag_list");
        } else {
            str = null;
        }
        return o.LJ(str, "1");
    }
}
