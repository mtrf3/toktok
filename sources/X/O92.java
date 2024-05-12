package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O92 extends AbstractC65781Prl implements InterfaceC88472Yns<SparkContext, C76800UCe> {
    public static final O92 LJLIL = new O92();

    public O92() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SparkContext sparkContext) {
        SparkContext it = sparkContext;
        o.LJIIIZ(it, "it");
        C60825Nu1 c60825Nu1 = new C60825Nu1(0);
        O93 o93 = new O93(0);
        it.LJJI(c60825Nu1);
        it.LJJIJIL(new O94());
        it.LJJ(new O91(o93));
        it.usePreload = true;
        it.LJII(C60825Nu1.class, c60825Nu1);
        it.LJII(O93.class, o93);
        return C76800UCe.LIZ;
    }
}
