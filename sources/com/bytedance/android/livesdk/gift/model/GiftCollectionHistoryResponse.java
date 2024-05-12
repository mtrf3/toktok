package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class GiftCollectionHistoryResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data extends F9E {

        @InterfaceC65349Pkn("anchor_info")
        public CollectionUser anchorInfo;

        @InterfaceC65349Pkn("history_description")
        public CollectionDescription historyDescription;

        @InterfaceC65349Pkn("history_rounds")
        public List<EffectList> historyRounds;

        @InterfaceC65349Pkn("is_host")
        public Boolean isHost;

        @InterfaceC65349Pkn("title_text")
        public String titleText;

        @Override // X.F9E
        public final Object[] getObjects() {
            CollectionUser collectionUser = this.anchorInfo;
            List<EffectList> list = this.historyRounds;
            Boolean bool = this.isHost;
            String str = this.titleText;
            CollectionDescription collectionDescription = this.historyDescription;
            return new Object[]{collectionUser, collectionUser, list, list, list, bool, bool, str, str, collectionDescription, collectionDescription};
        }
    }

    /* loaded from: classes17.dex */
    public static final class EffectList extends F9E {

        @InterfaceC65349Pkn("effects")
        public List<CollectionEffect> effects;

        @InterfaceC65349Pkn("round")
        public String round;

        @Override // X.F9E
        public final Object[] getObjects() {
            String str = this.round;
            List<CollectionEffect> list = this.effects;
            return new Object[]{str, str, list, list, list};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        Data data = this.data;
        return new Object[]{data, data};
    }
}
