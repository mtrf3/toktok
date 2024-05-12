package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.N9x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58905N9x extends AbstractC58906N9y {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        Activity LJIJJ;
        String str;
        InterfaceC58907N9z interfaceC58907N9z = (InterfaceC58907N9z) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            Intent intent = LJIJJ.getIntent();
            if (interfaceC58907N9z.isAuditCountry()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            intent.putExtra("is_audit_country", str);
            LJIJJ.finish();
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(NA0.class, null), "");
    }
}
