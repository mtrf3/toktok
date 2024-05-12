package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.YAn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86949YAn extends AbstractC86947YAl {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        InterfaceC86948YAm interfaceC86948YAm = (InterfaceC86948YAm) xBaseParamModel;
        o.LJIIIZ(type, "type");
        interfaceC86948YAm.getTime();
        Boolean start = interfaceC86948YAm.getStart();
        if (start != null) {
            z = start.booleanValue();
        } else {
            z = false;
        }
        Boolean showBubble = interfaceC86948YAm.getShowBubble();
        if (showBubble != null) {
            z2 = showBubble.booleanValue();
        } else {
            z2 = false;
        }
        Number type2 = interfaceC86948YAm.getType();
        if (type2 != null) {
            i = type2.intValue();
        } else {
            i = 0;
        }
        Number taskTime = interfaceC86948YAm.getTaskTime();
        if (taskTime != null) {
            i2 = taskTime.intValue();
        } else {
            i2 = 0;
        }
        String taskId = interfaceC86948YAm.getTaskId();
        if (taskId == null) {
            taskId = "";
        }
        Boolean claimRewards = interfaceC86948YAm.getClaimRewards();
        if (claimRewards != null) {
            z3 = claimRewards.booleanValue();
        } else {
            z3 = false;
        }
        Boolean closeRedPacketPendant = interfaceC86948YAm.getCloseRedPacketPendant();
        if (closeRedPacketPendant != null && closeRedPacketPendant.booleanValue()) {
            C247619nh.LIZ().LJJIJ();
        } else {
            C247679nn.LIZ().LJJI(taskId, i, z, z2, z3, i2);
        }
        InterfaceC86946YAk interfaceC86946YAk = (InterfaceC86946YAk) ED5.LIZJ(InterfaceC86946YAk.class, null);
        interfaceC86946YAk.setCode(1);
        c37356ElM.onSuccess(interfaceC86946YAk, "");
    }
}
