package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Clf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32279Clf extends C32804Cu8 {
    public final Z8D LJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32279Clf(Gift gift, Room room, C32822CuQ c32822CuQ, HashMap hashMap, long j, Z8D z8d) {
        super(new C73026SlK(EnumC32737Ct3.GIFT_POLL, EnumC76934UHi.ANCHOR), gift, room, c32822CuQ, "quick_poll", hashMap, false, 0, 0L, j, null, null, 0, null, null, 32128);
        o.LJIIIZ(room, "room");
        this.LJJIII = z8d;
    }
}
