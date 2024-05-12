package X;

import com.bytedance.android.live.liveinteract.api.event.MultiGuestLiveShowPanelEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.NAy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58932NAy extends AbstractC58929NAv {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        XBaseResultModel xBaseResultModel = (XBaseResultModel) ED5.LIZJ(InterfaceC58931NAx.class, null);
        DataChannelGlobal.LJLJJI.rv0(MultiGuestLiveShowPanelEvent.class);
        c37356ElM.onSuccess(xBaseResultModel, "");
    }
}
