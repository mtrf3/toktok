package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.TmJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75635TmJ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(EnumC75620Tm4 curState, EnumC75620Tm4 newState, boolean z, String str) {
        o.LJIIIZ(curState, "curState");
        o.LJIIIZ(newState, "newState");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("checkUpdateState, curState = ");
        LIZ2.append(curState);
        LIZ2.append(", newState = ");
        LIZ2.append(newState);
        LIZ2.append(", force = ");
        LIZ2.append(z);
        LIZ2.append(", source=");
        LIZ2.append(str);
        C0NB.LJIIIZ("MultiHostStateHelper", X1D.LIZIZ(LIZ2));
        if (!z && newState.getValue() <= curState.getValue()) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(EnumC75620Tm4 curState, EnumC75620Tm4 newState, boolean z, DataChannel dataChannel, LinkCrossRoomDataHolder linkCrossRoomDataHolder, String str) {
        EnumC75636TmK enumC75636TmK;
        o.LJIIIZ(curState, "curState");
        o.LJIIIZ(newState, "newState");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateState, curState = ");
        LIZ2.append(curState);
        LIZ2.append(", newState = ");
        LIZ2.append(newState);
        LIZ2.append(", force = ");
        LIZ2.append(z);
        LIZ2.append(", source=");
        LIZ2.append(str);
        C0NB.LJIIIZ("MultiHostStateHelper", X1D.LIZIZ(LIZ2));
        if (!LIZ(curState, newState, z, str)) {
            return;
        }
        if (dataChannel != null) {
            dataChannel.rv0(MultiCoHostStateChannel.class, newState);
        }
        if (newState == EnumC75620Tm4.Linked && linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJIIIIZZ(true);
        }
        switch (C75634TmI.LIZ[newState.ordinal()]) {
            case 1:
                enumC75636TmK = EnumC75636TmK.MATCH;
                break;
            case 2:
                enumC75636TmK = EnumC75636TmK.INVITING;
                break;
            case 3:
                enumC75636TmK = EnumC75636TmK.APPLYING;
                break;
            case 4:
                enumC75636TmK = EnumC75636TmK.CONNECTION_START;
                break;
            case 5:
                enumC75636TmK = EnumC75636TmK.CONNECTION_SUCCEED;
                break;
            case 6:
                enumC75636TmK = EnumC75636TmK.CONNECTION_FINISH_SUCCEED;
                break;
            default:
                enumC75636TmK = EnumC75636TmK.DISABLED;
                break;
        }
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJIILIIL(enumC75636TmK);
        }
    }
}
