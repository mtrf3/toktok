package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Fcj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39369Fcj extends AbstractC39368Fci {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        InterfaceC39371Fcl interfaceC39371Fcl = (InterfaceC39371Fcl) xBaseParamModel;
        o.LJIIIZ(type, "type");
        C37990Eva c37990Eva = C37990Eva.LIZ;
        String jsbSecureDataflowId = interfaceC39371Fcl.getJsbSecureDataflowId();
        String str = this.LJLILLLLZI;
        c37990Eva.getClass();
        OSJ LIZ = C37990Eva.LIZ(jsbSecureDataflowId, str);
        Integer num = (Integer) LIZ.getSecond();
        if (num == null) {
            C31626Cb8.LIZ(c37356ElM, 0, (String) LIZ.getThird(), 4);
            return;
        }
        String content = interfaceC39371Fcl.getContent();
        if (content == null || content.length() == 0) {
            C31626Cb8.LIZ(c37356ElM, 0, "content or toastMsg is empty", 4);
            return;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (context = interfaceC38263Ezz.getContext()) == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "Context not provided in host", 4);
            return;
        }
        try {
            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(num.intValue(), "bpea-217");
            LJJIIJ.attachCustomInfo("x-tt-hybrid-referer", LJ(type));
            OHT.LIZ(content, content, context, LJJIIJ);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            C31626Cb8.LIZ(c37356ElM, 0, "copy to clipboard error occur!", 4);
        }
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC39370Fck.class, null);
        ((InterfaceC39370Fck) LIZJ).setCode(1);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
