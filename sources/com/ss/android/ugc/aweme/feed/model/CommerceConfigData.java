package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class CommerceConfigData implements Serializable {

    @InterfaceC65349Pkn("data")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public ItemCommentEggGroup itemCommentEggGroup;

    @InterfaceC65349Pkn("item_like_egg")
    public ItemLikeEggData itemLikeEggData;

    @InterfaceC65349Pkn("type")
    public int type;

    public ItemCommentEggGroup getItemCommentEggGroup() {
        return this.itemCommentEggGroup;
    }

    public ItemLikeEggData getItemLikeEggData() {
        return this.itemLikeEggData;
    }

    public int getType() {
        return this.type;
    }

    public void setItemCommentEggGroup(ItemCommentEggGroup itemCommentEggGroup) {
        this.itemCommentEggGroup = itemCommentEggGroup;
    }

    public void setItemLikeEggData(ItemLikeEggData itemLikeEggData) {
        this.itemLikeEggData = itemLikeEggData;
    }

    public void setType(int i) {
        this.type = i;
    }
}
