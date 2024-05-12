package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* loaded from: classes17.dex */
public final class BattleArmy extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public Long anchorId;

    @InterfaceC65349Pkn("anchor_id_str")
    public String anchorIdStr;

    @InterfaceC65349Pkn("rank_list")
    public List<RankUser> rankList;

    /* loaded from: classes17.dex */
    public static final class RankUser extends F9E {

        @InterfaceC65349Pkn("avatar_thumb")
        public ImageModel avatarThumb;

        @InterfaceC65349Pkn("nickname")
        public String nickname;

        @InterfaceC65349Pkn("score")
        public Long score;

        @InterfaceC65349Pkn("user_id")
        public Long userId;

        @InterfaceC65349Pkn("user_id_str")
        public String userIdStr;

        @Override // X.F9E
        public final Object[] getObjects() {
            Long l = this.userId;
            String str = this.nickname;
            ImageModel imageModel = this.avatarThumb;
            Long l2 = this.score;
            String str2 = this.userIdStr;
            return new Object[]{l, l, str, str, imageModel, imageModel, l2, l2, str2, str2};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.anchorId;
        List<RankUser> list = this.rankList;
        String str = this.anchorIdStr;
        return new Object[]{l, l, list, list, list, str, str};
    }
}
