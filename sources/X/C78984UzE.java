package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.UzE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78984UzE extends AbstractC78986UzG {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        int i;
        Activity LIZLLL;
        Integer num;
        o.LJIIIZ(type, "type");
        Number verifyCode = ((InterfaceC78987UzH) xBaseParamModel).getVerifyCode();
        if ((verifyCode instanceof Integer) && (num = (Integer) verifyCode) != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (LIZLLL = interfaceC38263Ezz.LIZLLL()) != null) {
            SecApiImpl.LIZ().popCaptcha(LIZLLL, i, new C78985UzF(c37356ElM));
        }
    }
}
