package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import defpackage.c;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N9X extends c {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        XBaseModel LIZJ = ED5.LIZJ(c.InterfaceC0005c.class, null);
        c.InterfaceC0005c interfaceC0005c = (c.InterfaceC0005c) LIZJ;
        ShopMainFragment.LJZ.getClass();
        String str = ShopMainFragment.LJZI;
        if (str == null) {
            str = "unknown";
        }
        interfaceC0005c.setPreviousPage(str);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
