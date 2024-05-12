package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes13.dex */
public final class PollDetailResponse extends BaseResponse {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("offset")
    public int offset;

    @InterfaceC65349Pkn("user_list")
    public List<? extends User> users;

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setOffset(int i) {
        this.offset = i;
    }

    public final void setUsers(List<? extends User> list) {
        this.users = list;
    }
}
