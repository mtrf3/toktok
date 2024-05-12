package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CuU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32826CuU extends C32804Cu8 implements ZBT, ZBV, InterfaceC35372DuS {
    public static final /* synthetic */ int LJJIJ = 0;
    public final String LJJIII;
    public final int LJJIIJ;
    public final List<Long> LJJIIJZLJL;
    public final int LJJIIZ;
    public final int LJJIIZI;

    @Override // X.InterfaceC35372DuS
    public final List<Long> LIZIZ() {
        return this.LJJIIJZLJL;
    }

    @Override // X.ZBT
    public final int LIZLLL() {
        return this.LJJIIZI;
    }

    @Override // X.ZBV
    public final int LJ() {
        return this.LJJIIJ;
    }

    @Override // X.ZBT
    public final int LJII() {
        return this.LJJIIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32826CuU(C73026SlK c73026SlK, Gift gift, Room room, C32822CuQ toUser, HashMap hashMap, boolean z, long j, int i, String giftOrigin, C61878OQg frequentlyUsedGiftIds, int i2, int i3) {
        super(c73026SlK, gift, room, toUser, "fast gift combo view", hashMap, z, 0, j, 0L, null, null, i, null, null, 28288);
        o.LJIIIZ(gift, "gift");
        o.LJIIIZ(room, "room");
        o.LJIIIZ(toUser, "toUser");
        o.LJIIIZ(giftOrigin, "giftOrigin");
        o.LJIIIZ(frequentlyUsedGiftIds, "frequentlyUsedGiftIds");
        this.LJJIII = giftOrigin;
        this.LJJIIJ = 0;
        this.LJJIIJZLJL = frequentlyUsedGiftIds;
        this.LJJIIZ = i2;
        this.LJJIIZI = i3;
    }
}
