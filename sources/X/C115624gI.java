package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.4gI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115624gI extends AbstractC65781Prl implements InterfaceC88472Yns<UpvoteStruct, User> {
    public static final C115624gI LJLIL = new C115624gI();

    public C115624gI() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final User invoke(UpvoteStruct upvoteStruct) {
        UpvoteStruct upvoteStruct2 = upvoteStruct;
        if (upvoteStruct2 != null) {
            return upvoteStruct2.getUser();
        }
        return null;
    }
}
