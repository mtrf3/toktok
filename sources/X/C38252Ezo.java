package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Ezo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38252Ezo extends AbstractC38248Ezk {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        int i;
        InterfaceC38251Ezn interfaceC38251Ezn = (InterfaceC38251Ezn) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (context = interfaceC38263Ezz.getContext()) == null) {
            return;
        }
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC38250Ezm.class, null);
        InterfaceC38250Ezm interfaceC38250Ezm = (InterfaceC38250Ezm) LIZJ;
        if (BAProfilePageServiceImpl.LJIIJJI().LJI(interfaceC38251Ezn.getType().intValue(), context, null, interfaceC38251Ezn.getContent(), interfaceC38251Ezn.getUid(), interfaceC38251Ezn.getExtra())) {
            i = 1;
        } else {
            i = 0;
        }
        interfaceC38250Ezm.setCode(i);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
