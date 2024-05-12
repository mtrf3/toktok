package X;

import com.bytedance.android.livesdkapi.depend.event.LiveGiftShowPinCardEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Uh8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77862Uh8 extends AbstractC77861Uh7 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC77863Uh9 interfaceC77863Uh9 = (InterfaceC77863Uh9) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && interfaceC38263Ezz.getContext() != null) {
            XBaseResultModel xBaseResultModel = (XBaseResultModel) ED5.LIZJ(InterfaceC77864UhA.class, null);
            DataChannelGlobal.LJLJJI.tv0(LiveGiftShowPinCardEvent.class, new C29068Bay(true, interfaceC77863Uh9.getHeight().intValue(), interfaceC77863Uh9.getSchema(), C38350F3i.LJJIZ(interfaceC77863Uh9.getRoomId()), interfaceC77863Uh9.getName(), interfaceC77863Uh9.getCloseTime().intValue(), interfaceC77863Uh9.getContentInfo()));
            c37356ElM.onSuccess(xBaseResultModel, "");
        }
    }
}
