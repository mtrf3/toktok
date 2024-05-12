package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9fJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242419fJ extends F9E {
    public final List<IMUser> LJLIL;
    public final List<IMUser> LJLILLLLZI;
    public final List<IMUser> LJLJI;
    public final List<IMUser> LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C242419fJ(List<? extends IMUser> recentFriends, List<? extends IMUser> mutualFriends, List<? extends IMUser> followingFriends, List<? extends IMUser> allFriendsList) {
        o.LJIIIZ(recentFriends, "recentFriends");
        o.LJIIIZ(mutualFriends, "mutualFriends");
        o.LJIIIZ(followingFriends, "followingFriends");
        o.LJIIIZ(allFriendsList, "allFriendsList");
        this.LJLIL = recentFriends;
        this.LJLILLLLZI = mutualFriends;
        this.LJLJI = followingFriends;
        this.LJLJJI = allFriendsList;
    }
}
