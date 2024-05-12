package X;

import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0200000_13;

/* renamed from: X.TXh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74801TXh {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(boolean z) {
        String str;
        InterfaceC74802TXi LIZIZ = C74800TXg.LIZIZ();
        if (LIZIZ == null || (str = LIZIZ.LIZLLL()) == null) {
            str = "";
        }
        if (str.length() <= 0) {
            if (z) {
                str = "interaction_entrance";
            } else {
                str = "connection_button";
            }
        }
        C75017TcL.LIZ = str;
        return str;
    }

    public static void LIZIZ(Room room, InterfaceC65784Pro interfaceC65784Pro) {
        if (!u.LJJIIJ()) {
            return;
        }
        if (!LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.LINK_MIC)) {
            C30868C9o.LIZJ(R.string.sp2);
            return;
        }
        if (room != null && room.getMosaicStatus() == 1) {
            C30868C9o.LIZJ(R.string.sve);
            DeepLinkEnterMultiLiveRoomDataHandler LIZ2 = C74752TVk.LIZ();
            if (LIZ2 == null) {
                return;
            }
            LIZ2.LIZ = null;
            LIZ2.LJFF = 0;
            LIZ2.LIZLLL = -1;
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public static final void LIZJ(Room room, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        TX2 LIZ2 = TVY.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZIZ("multi_guest_v3_icon", new AqS160S0200000_13(room, (Room) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 27));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        LIZIZ(room, interfaceC65784Pro);
    }
}
