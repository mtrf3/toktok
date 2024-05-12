package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.rank.MultiGuestGiftContributeRankDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* renamed from: X.Ta4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74876Ta4 {
    public static MultiGuestGiftContributeRankDialog LIZ(User user, Room room, EnumC74877Ta5 source, Long l) {
        o.LJIIIZ(source, "source");
        MultiGuestGiftContributeRankDialog multiGuestGiftContributeRankDialog = new MultiGuestGiftContributeRankDialog();
        multiGuestGiftContributeRankDialog.LJLLLL = user;
        multiGuestGiftContributeRankDialog.LJLLLLLL = room;
        multiGuestGiftContributeRankDialog.LJLLL = source;
        multiGuestGiftContributeRankDialog.LJLZ = l;
        return multiGuestGiftContributeRankDialog;
    }
}
