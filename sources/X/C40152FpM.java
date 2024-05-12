package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.FpM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40152FpM extends AbstractC40121For {
    @Override // X.AbstractC40151FpL
    public final boolean LIZJ(android.net.Uri uri) {
        return true;
    }

    @Override // X.AbstractC40151FpL
    public final void LIZ(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        sparkContext.LJJIJIIJI(new C40153FpN());
    }
}
