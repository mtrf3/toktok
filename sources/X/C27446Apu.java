package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import kotlin.jvm.internal.o;

/* renamed from: X.Apu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27446Apu extends AbstractC65781Prl implements InterfaceC88471Ynr<SkuState, Bundle, SkuState> {
    public static final C27446Apu INSTANCE = new C27446Apu();

    public C27446Apu() {
        super(2);
    }

    public final SkuState invoke(SkuState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ SkuState invoke(SkuState skuState, Bundle bundle) {
        SkuState skuState2 = skuState;
        invoke(skuState2, bundle);
        return skuState2;
    }
}
