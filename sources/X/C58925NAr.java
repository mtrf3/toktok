package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.NAr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58925NAr extends AbstractC58921NAn {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        InterfaceC58922NAo interfaceC58922NAo = (InterfaceC58922NAo) ED5.LIZJ(InterfaceC58922NAo.class, null);
        interfaceC58922NAo.setHavePinCard((Boolean) DataChannelGlobal.LJLJJI.mv0(C29067Bax.class));
        c37356ElM.onSuccess(interfaceC58922NAo, "");
    }
}
