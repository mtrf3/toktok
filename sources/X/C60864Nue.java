package X;

import com.bytedance.hybrid.spark.page.SparkActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Nue, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60864Nue extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC60850NuQ, SparkActivity, C76800UCe> {
    public static final C60864Nue LJLIL = new C60864Nue();

    public C60864Nue() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC60850NuQ interfaceC60850NuQ, SparkActivity it) {
        InterfaceC60850NuQ receiver = interfaceC60850NuQ;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(it, "it");
        receiver.finish();
        return C76800UCe.LIZ;
    }
}
