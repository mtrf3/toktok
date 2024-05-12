package com.ss.android.ugc.aweme.discover.model;

import X.C79004UzY;
import X.InterfaceC65349Pkn;
import X.InterfaceC65784Pro;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import java.util.List;

/* loaded from: classes9.dex */
public class SearchUser {

    @InterfaceC65349Pkn("ad_item")
    public Aweme adItem;

    @InterfaceC65349Pkn("items")
    public List<Aweme> awemeCards;

    @InterfaceC65349Pkn("challenges")
    public List<Challenge> challengeList;

    @InterfaceC65349Pkn("dynamic_patch")
    public DynamicPatch dynamicPatch;

    @InterfaceC65349Pkn("effects")
    public List<NewFaceSticker> effectCards;
    public InterfaceC65784Pro<List<Aweme>> fullAwemeListFetcher;
    public LogPbBean logPb;
    public GlobalDoodleConfig mGlobalDoodleConfig;

    @InterfaceC65349Pkn("mix_cursor")
    public Long mixCursor;

    @InterfaceC65349Pkn("mix_has_more")
    public Boolean mixHasMore;

    @InterfaceC65349Pkn("mix_list")
    public List<MixStruct> playlists;

    @InterfaceC65349Pkn("position")
    public List<Position> position;

    @InterfaceC65349Pkn("product")
    public ProductGroup productGroup;
    public int rank;

    @InterfaceC65349Pkn("remark_position")
    public List<Position> remarkPosition;

    @InterfaceC65349Pkn("horizontal_data")
    public SearchUserHorizontalData searchUserHorizontalData;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("uniqid_position")
    public List<Position> uniqidPosition;

    @InterfaceC65349Pkn("user_info")
    public User user;

    public int cardType() {
        if (!C79004UzY.LJJIFFI(this.awemeCards)) {
            return 1;
        }
        if (!C79004UzY.LJJIFFI(this.effectCards)) {
            return 3;
        }
        return 0;
    }

    public List<Aweme> getFullAwemeList() {
        InterfaceC65784Pro<List<Aweme>> interfaceC65784Pro = this.fullAwemeListFetcher;
        if (interfaceC65784Pro != null) {
            return interfaceC65784Pro.invoke();
        }
        return null;
    }

    public boolean hasMedia() {
        boolean z;
        ProductGroup productGroup;
        if (C79004UzY.LJJIFFI(this.awemeCards) && C79004UzY.LJJIFFI(this.effectCards) && ((productGroup = this.productGroup) == null || C79004UzY.LJJIFFI(productGroup.productList))) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public int hashCode() {
        int i;
        DynamicPatch dynamicPatch = this.dynamicPatch;
        int i2 = 0;
        if (dynamicPatch != null) {
            i = dynamicPatch.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 6;
        User user = this.user;
        if (user != null && user.getUid() != null) {
            i2 = this.user.getUid().hashCode();
        }
        return i3 + i2;
    }

    public boolean isDynamicCard() {
        if (this.dynamicPatch != null) {
            return true;
        }
        return false;
    }

    public boolean isStar() {
        if (this.awemeCards != null) {
            return true;
        }
        return false;
    }

    public int getType() {
        if (isDynamicCard()) {
            return 999;
        }
        return 0;
    }

    public boolean isAladdin() {
        if (cardType() != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchUser)) {
            return false;
        }
        SearchUser searchUser = (SearchUser) obj;
        if (!equals(this.dynamicPatch, searchUser.dynamicPatch) || !equals(this.awemeCards, searchUser.awemeCards)) {
            return false;
        }
        User user = this.user;
        if (user != null && searchUser.user != null) {
            return TextUtils.equals(user.getUid(), searchUser.user.getUid());
        }
        return equals(user, searchUser.user);
    }

    public SearchUser setUser(User user) {
        this.user = user;
        return this;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
