package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CuT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32825CuT extends C32804Cu8 {
    public final String LJJIII;
    public final InterfaceC32497CpB LJJIIJ;
    public final boolean LJJIIJZLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32825CuT(Gift gift, Room room, C32822CuQ toUser, String source, HashMap<String, String> hashMap, boolean z, String str, InterfaceC32497CpB interfaceC32497CpB, boolean z2) {
        super(new C73026SlK(EnumC32737Ct3.FAST_GIFT, EnumC76934UHi.ANCHOR), gift, room, toUser, source, hashMap, z, 0, 0L, 0L, null, null, 0, null, null, 32640);
        o.LJIIIZ(gift, "gift");
        o.LJIIIZ(room, "room");
        o.LJIIIZ(toUser, "toUser");
        o.LJIIIZ(source, "source");
        this.LJJIII = str;
        this.LJJIIJ = interfaceC32497CpB;
        this.LJJIIJZLJL = z2;
    }
}
