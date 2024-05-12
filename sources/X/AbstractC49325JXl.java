package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: X.JXl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC49325JXl extends BaseResponse implements InterfaceC65316PkG {
    public String requestId;

    public Aweme getAweme() {
        return null;
    }

    public List<Comment> getCommentList() {
        return null;
    }

    public abstract int getFeedType();

    public List<User> getLikeList() {
        return null;
    }

    public boolean needUpdateComment() {
        return false;
    }

    public void setAweme(Aweme aweme) {
    }

    public void setCommentList(List<Comment> list) {
    }

    public abstract void setFeedType(int i);

    public String getAwemeAuthorId() {
        if (getAweme() != null) {
            return getAweme().getAuthorUid();
        }
        return null;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.requestId = str;
    }
}
