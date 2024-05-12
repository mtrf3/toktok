package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ugg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77834Ugg extends AbstractC77833Ugf {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        int i;
        InterfaceC77835Ugh interfaceC77835Ugh = (InterfaceC77835Ugh) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String str = null;
        InterfaceC77836Ugi interfaceC77836Ugi = (InterfaceC77836Ugi) ED5.LIZJ(InterfaceC77836Ugi.class, null);
        C30607Bzn aT = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).aT();
        if (aT != null) {
            Number userType = interfaceC77835Ugh.getUserType();
            if (userType != null) {
                i = userType.intValue();
            } else {
                i = 0;
            }
            String roomId = interfaceC77835Ugh.getRoomId();
            if (roomId == null) {
                roomId = "";
            }
            String taskId = interfaceC77835Ugh.getTaskId();
            if (taskId == null) {
                taskId = "";
            }
            str = aT.LIZ(i, roomId, taskId);
        }
        interfaceC77836Ugi.setData(str);
        c37356ElM.onSuccess(interfaceC77836Ugi, "");
    }
}
