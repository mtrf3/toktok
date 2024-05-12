package X;

import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LW7 extends Exception {
    public final FriendsFeedResponse LJLIL;

    public final FriendsFeedResponse getResponse() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LW7(FriendsFeedResponse response, String message) {
        super(message);
        o.LJIIIZ(response, "response");
        o.LJIIIZ(message, "message");
        this.LJLIL = response;
    }
}
