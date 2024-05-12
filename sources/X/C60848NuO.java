package X;

import com.bytedance.hybrid.spark.page.SparkActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.NuO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60848NuO extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC60850NuQ, SparkActivity, Boolean> {
    public static final C60848NuO LJLIL = new C60848NuO();

    public C60848NuO() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(InterfaceC60850NuQ interfaceC60850NuQ, SparkActivity sparkActivity) {
        InterfaceC60850NuQ receiver = interfaceC60850NuQ;
        SparkActivity baseActivity = sparkActivity;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(baseActivity, "baseActivity");
        return Boolean.valueOf(receiver.LJJIJ(baseActivity));
    }
}
