package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.BmA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29762BmA extends AbstractC65781Prl implements InterfaceC88472Yns<SparkContext, C76800UCe> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29762BmA(String str) {
        super(1);
        this.LJLIL = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SparkContext sparkContext) {
        SparkContext it = sparkContext;
        o.LJIIIZ(it, "it");
        it.LJJ(new C60449Nnx(this.LJLIL));
        return C76800UCe.LIZ;
    }
}
