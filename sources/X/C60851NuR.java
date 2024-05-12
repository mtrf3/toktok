package X;

import com.bytedance.hybrid.spark.page.SparkActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.NuR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60851NuR extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC60850NuQ, SparkActivity, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60851NuR(boolean z) {
        super(2);
        this.LJLIL = z;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC60850NuQ interfaceC60850NuQ, SparkActivity sparkActivity) {
        InterfaceC60850NuQ receiver = interfaceC60850NuQ;
        SparkActivity baseActivity = sparkActivity;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(baseActivity, "baseActivity");
        receiver.LJIIIZ(baseActivity, this.LJLIL);
        return C76800UCe.LIZ;
    }
}
