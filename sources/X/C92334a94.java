package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.a94, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92334a94 extends AbstractC40122Fos {
    @Override // X.AbstractC40122Fos
    public final String LJI() {
        return "pipo_bnpl";
    }

    @Override // X.AbstractC40122Fos
    public final void LJ(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("merchant_id", C91824a0q.LIZ.LIZ)));
        sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("merchant_user_id", C91824a0q.LIZ.LIZIZ)));
        sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("bnpl_merchant_id", C91824a0q.LIZ())));
        sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("priority_region", C91824a0q.LIZIZ)));
        sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("source_id", C91824a0q.LJFF)));
        super.LJ(sparkContext, str);
    }
}
