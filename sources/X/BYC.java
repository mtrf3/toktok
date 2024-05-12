package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BYC extends AbstractC65781Prl implements InterfaceC88472Yns<SparkContext, C76800UCe> {
    public static final BYC LJLIL = new BYC();

    public BYC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SparkContext sparkContext) {
        SparkContext sparkContext2 = sparkContext;
        o.LJIIIZ(sparkContext2, "sparkContext");
        sparkContext2.LJJI(new BYD());
        return C76800UCe.LIZ;
    }
}
