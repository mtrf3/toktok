package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Xvs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86420Xvs extends AbstractC86422Xvu {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC86421Xvt interfaceC86421Xvt = (InterfaceC86421Xvt) xBaseParamModel;
        o.LJIIIZ(type, "type");
        double doubleValue = interfaceC86421Xvt.getOriginLatitude().doubleValue();
        double doubleValue2 = interfaceC86421Xvt.getOriginLongitude().doubleValue();
        Q0A q0a = C66236Pz6.LIZJ;
        TokenCert with = TokenCert.Companion.with("bpea-ecom_address_map_encrypt_location_data");
        with.auth("hyqv");
        q0a.getClass();
        C27433Aph LJFF = Q0A.LJFF(doubleValue, doubleValue2, with);
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC86423Xvv.class, null);
        InterfaceC86423Xvv interfaceC86423Xvv = (InterfaceC86423Xvv) LIZJ;
        interfaceC86423Xvv.setEncryptedLongitude(LJFF.LJLILLLLZI);
        interfaceC86423Xvv.setEncryptedLatitude(LJFF.LJLIL);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
