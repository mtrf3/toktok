package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.NiN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60103NiN extends AbstractC40122Fos {
    @Override // X.AbstractC40122Fos
    public final String LJI() {
        return "ecom_influence";
    }

    @Override // X.AbstractC40122Fos
    public final void LJ(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        super.LJ(sparkContext, str);
        sparkContext.LJJ(new C60104NiO());
    }
}
