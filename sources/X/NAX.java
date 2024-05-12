package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NAX extends AbstractC40122Fos {
    @Override // X.AbstractC40122Fos
    public final String LJI() {
        return "ad_autofill";
    }

    @Override // X.AbstractC40122Fos
    public final void LJ(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        super.LJ(sparkContext, str);
        sparkContext.LJJIJIIJI(new NAY());
    }
}
