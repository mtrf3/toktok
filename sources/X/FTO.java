package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FTO extends FTM {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity LIZLLL;
        FTP ftp = (FTP) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (LIZLLL = interfaceC38263Ezz.LIZLLL()) == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "activity ref is released!", 4);
            return;
        }
        Intent intent = new Intent("android.intent.action.SENDTO", android.net.Uri.fromParts("smsto", ftp.getPhoneNumber(), null));
        intent.putExtra("sms_body", ftp.getContent());
        intent.putExtra("pns.sandbox.dataflow_id", 1207964163);
        String LJ = LJ(type);
        if (LJ != null) {
            intent.putExtra("jsb_referer_url", LJ);
        }
        C16880lQ.LIZIZ(LIZLLL, intent);
        XBaseModel LIZJ = ED5.LIZJ(FTN.class, null);
        ((FTN) LIZJ).setCode(1);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
