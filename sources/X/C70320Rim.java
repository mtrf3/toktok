package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.SkuCommonState;
import kotlin.jvm.internal.o;

/* renamed from: X.Rim, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70320Rim extends AbstractC65781Prl implements InterfaceC88471Ynr<SkuCommonState, Bundle, SkuCommonState> {
    public static final C70320Rim INSTANCE = new C70320Rim();

    public C70320Rim() {
        super(2);
    }

    public final SkuCommonState invoke(SkuCommonState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ SkuCommonState invoke(SkuCommonState skuCommonState, Bundle bundle) {
        SkuCommonState skuCommonState2 = skuCommonState;
        invoke(skuCommonState2, bundle);
        return skuCommonState2;
    }
}
