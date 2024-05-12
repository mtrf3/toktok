package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N9W extends N9U {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        N9V n9v = (N9V) ED5.LIZJ(N9V.class, null);
        ShopMainFragment.LJZ.getClass();
        n9v.setVisible(Boolean.valueOf(ShopMainFragment.LLIIIZ));
        n9v.setStatus(ShopMainFragment.LLIIJI);
        c37356ElM.onSuccess(n9v, "");
    }
}
