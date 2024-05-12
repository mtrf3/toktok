package X;

import com.bytedance.android.live.liveinteract.api.event.MultiCoHostInvitePanelEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.UIj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76961UIj extends AbstractC77459Uad {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC77462Uag interfaceC77462Uag = (InterfaceC77462Uag) xBaseParamModel;
        o.LJIIIZ(type, "type");
        XBaseResultModel xBaseResultModel = (XBaseResultModel) ED5.LIZJ(InterfaceC76962UIk.class, null);
        DataChannelGlobal.LJLJJI.tv0(MultiCoHostInvitePanelEvent.class, new C35595Dy3(interfaceC77462Uag.getUid(), Boolean.valueOf(interfaceC77462Uag.isFriend())));
        c37356ElM.onSuccess(xBaseResultModel, "");
    }
}
