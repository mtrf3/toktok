package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.YDb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87015YDb extends AbstractC87016YDc {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String str;
        boolean z;
        o.LJIIIZ(type, "type");
        if (C53286Kvi.LIZLLL()) {
            str = "second_tab";
        } else if (!C53286Kvi.LJ()) {
            str = "";
        } else {
            str = "top_tab";
        }
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC87021YDh.class, null);
        InterfaceC87021YDh interfaceC87021YDh = (InterfaceC87021YDh) LIZJ;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        interfaceC87021YDh.setHasShopTab(Boolean.valueOf(z));
        interfaceC87021YDh.setShopTabPosition(str);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
