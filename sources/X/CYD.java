package X;

import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CYD<T> implements InterfaceC73592SuS {
    public final /* synthetic */ OnlineAudienceRankWidget LJLIL;

    public CYD(OnlineAudienceRankWidget onlineAudienceRankWidget) {
        this.LJLIL = onlineAudienceRankWidget;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        FollowPair it = (FollowPair) obj;
        o.LJIIIZ(it, "it");
        Room room = this.LJLIL.LLIFFJFJJ;
        if (room != null && it.LIZ == room.getOwnerUserId()) {
            return true;
        }
        return false;
    }
}
