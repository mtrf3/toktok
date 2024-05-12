package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Cle, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32278Cle extends C32804Cu8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32278Cle(Gift gift, Room room, C32822CuQ c32822CuQ, HashMap hashMap) {
        super(new C73026SlK(EnumC32737Ct3.SEND_BECOME_GIFT, EnumC76934UHi.ANCHOR), gift, room, c32822CuQ, "guest_prioritized_request", hashMap, true, 0, 0L, 0L, null, null, 0, null, null, 32640);
        o.LJIIIZ(room, "room");
    }
}
