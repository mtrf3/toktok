package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CuN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32819CuN {
    /* JADX WARN: Multi-variable type inference failed */
    public static C32826CuU LIZ(C32804Cu8 info, DataChannel dataChannel) {
        int i;
        int i2;
        String str;
        ZBT zbt;
        o.LJIIIZ(info, "info");
        if ((info instanceof ZBT) && (zbt = (ZBT) info) != null) {
            i = zbt.LJII();
            i2 = zbt.LIZLLL();
        } else {
            i = 0;
            i2 = 0;
        }
        C73026SlK c73026SlK = new C73026SlK(EnumC32737Ct3.SPECIAL_GIFT_COMBO, (EnumC76934UHi) info.LJIILL.LJLJI);
        Gift gift = info.LJIILLIIL;
        Room room = info.LJIIZILJ;
        C32822CuQ c32822CuQ = info.LJIJ;
        HashMap LJIIJ = V16.LJIIJ(room, dataChannel);
        boolean z = info.LJIJI;
        long j = info.LJIIIIZZ;
        int i3 = info.LJIJJ;
        if (info instanceof C32826CuU) {
            str = ((C32826CuU) info).LJJIII;
        } else if (info instanceof C32823CuR) {
            str = "lynx";
        } else {
            str = "";
        }
        return new C32826CuU(c73026SlK, gift, room, c32822CuQ, LJIIJ, z, j, i3, str, C61878OQg.INSTANCE, i, i2);
    }
}
