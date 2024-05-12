package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Cul, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32843Cul extends C32804Cu8 {
    public final boolean LJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32843Cul(Gift gift, Room room, C32822CuQ toUser, String source, HashMap<String, String> hashMap, boolean z, boolean z2) {
        super(new C73026SlK(EnumC32737Ct3.GIFT_GUIDE, EnumC76934UHi.ANCHOR), gift, room, toUser, source, hashMap, z, 0, 0L, 0L, null, null, 0, null, null, 32640);
        o.LJIIIZ(gift, "gift");
        o.LJIIIZ(room, "room");
        o.LJIIIZ(toUser, "toUser");
        o.LJIIIZ(source, "source");
        this.LJJIII = z2;
    }
}
