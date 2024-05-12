package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rk3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70399Rk3 extends AbstractC70398Rk2 {
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public String LJFF;

    @Override // X.AbstractC70398Rk2
    public final int LIZ() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70399Rk3(Activity context, SkuPanelViewModel skuStrategyData) {
        super(context, skuStrategyData);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(skuStrategyData, "skuStrategyData");
        this.LIZJ = C221108m2.LIZIZ(new AqS162S0100000_12(skuStrategyData, 1055));
        this.LIZLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1056));
        this.LJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1054));
    }
}
