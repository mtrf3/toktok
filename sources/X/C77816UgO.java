package X;

import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.UgO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77816UgO extends AbstractC77817UgP {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String str;
        Boolean bool;
        InterfaceC77819UgR interfaceC77819UgR = (InterfaceC77819UgR) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC77818UgQ interfaceC77818UgQ = (InterfaceC77818UgQ) ED5.LIZJ(InterfaceC77818UgQ.class, null);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            str = room.getIdStr();
        } else {
            str = null;
        }
        if (!o.LJ(str, interfaceC77819UgR.getRoomID())) {
            C31626Cb8.LIZ(c37356ElM, 0, null, 6);
            return;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus != null) {
            bool = Boolean.valueOf(roomAuthStatus.enableChat);
        } else {
            bool = Boolean.TRUE;
        }
        interfaceC77818UgQ.setChatEnable(bool);
        c37356ElM.onSuccess(interfaceC77818UgQ, "");
    }
}
