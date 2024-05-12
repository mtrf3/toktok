package com.bytedance.android.live.base.model;

import X.C00F;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class HashtagResponse {

    @InterfaceC65349Pkn("game_hashtag")
    public Hashtag gameHashTag;

    @InterfaceC65349Pkn("game_tag_list")
    public List<GameTag> gameTagList;

    @InterfaceC65349Pkn("hashtag")
    public List<Hashtag> hashtags;

    @InterfaceC65349Pkn("live_voice_hashtag")
    public List<Hashtag> liveVoiceHashtag;

    @InterfaceC65349Pkn("third_party_hashtag")
    public List<Hashtag> obsHashTag;

    /* JADX WARN: Multi-variable type inference failed */
    public HashtagResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public HashtagResponse(List<Hashtag> list, List<GameTag> list2, Hashtag hashtag, List<Hashtag> list3) {
        C00F.LJ(list, "hashtags", list2, "gameTagList", list3, "obsHashTag");
        this.hashtags = list;
        this.gameTagList = list2;
        this.gameHashTag = hashtag;
        this.obsHashTag = list3;
        this.liveVoiceHashtag = new ArrayList();
    }

    public /* synthetic */ HashtagResponse(List list, List list2, Hashtag hashtag, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? null : hashtag, (i & 8) != 0 ? new ArrayList() : list3);
    }
}
