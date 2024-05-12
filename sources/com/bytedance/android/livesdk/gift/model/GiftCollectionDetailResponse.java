package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* loaded from: classes17.dex */
public final class GiftCollectionDetailResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class CollectionProcess extends F9E {

        @InterfaceC65349Pkn("collected_num")
        public Long collectedNum;

        @InterfaceC65349Pkn("period_id")
        public Long periodId;

        @InterfaceC65349Pkn("round")
        public Long round;

        @InterfaceC65349Pkn("target_num")
        public Long targetNum;

        @Override // X.F9E
        public final Object[] getObjects() {
            Long l = this.periodId;
            Long l2 = this.round;
            Long l3 = this.targetNum;
            Long l4 = this.collectedNum;
            return new Object[]{l, l, l2, l2, l3, l3, l4, l4};
        }
    }

    /* loaded from: classes17.dex */
    public static final class Data extends F9E {

        @InterfaceC65349Pkn("anchor_info")
        public CollectionUser anchorInfo;

        @InterfaceC65349Pkn("card_description")
        public CollectionDescription cardDescription;

        @InterfaceC65349Pkn("collection_process")
        public CollectionProcess collectionProcess;

        @InterfaceC65349Pkn("effects")
        public List<CollectionEffect> effects;

        @InterfaceC65349Pkn("gift_info")
        public Gift giftInfo;

        @InterfaceC65349Pkn("is_host")
        public Boolean isHost;

        @InterfaceC65349Pkn("jump_text")
        public String jumpText;

        @InterfaceC65349Pkn("rule_url")
        public String ruleUrl;

        @InterfaceC65349Pkn("send_text")
        public String sendText;

        @Override // X.F9E
        public final Object[] getObjects() {
            CollectionUser collectionUser = this.anchorInfo;
            Gift gift = this.giftInfo;
            CollectionProcess collectionProcess = this.collectionProcess;
            List<CollectionEffect> list = this.effects;
            Boolean bool = this.isHost;
            CollectionDescription collectionDescription = this.cardDescription;
            String str = this.jumpText;
            String str2 = this.sendText;
            String str3 = this.ruleUrl;
            return new Object[]{collectionUser, collectionUser, gift, gift, collectionProcess, collectionProcess, list, list, list, bool, bool, collectionDescription, collectionDescription, str, str, str2, str2, str3, str3};
        }
    }

    /* loaded from: classes17.dex */
    public static final class Gift extends F9E {

        @InterfaceC65349Pkn("bg_img")
        public ImageModel bgImg;

        @InterfaceC65349Pkn("diamond_count")
        public Integer diamondCount;

        @InterfaceC65349Pkn("end_time")
        public Long endTime;

        @InterfaceC65349Pkn("gift_id")
        public Long giftId;

        @InterfaceC65349Pkn("gift_type")
        public Integer giftType;

        @InterfaceC65349Pkn("img")
        public ImageModel img;

        @InterfaceC65349Pkn("round")
        public Long round;

        @InterfaceC65349Pkn("round_name")
        public String roundName;

        @InterfaceC65349Pkn("send_icon")
        public ImageModel sendIcon;

        @InterfaceC65349Pkn("start_time")
        public Long startTime;

        @InterfaceC65349Pkn("topic_complete_text")
        public String topicCompleteText;

        @InterfaceC65349Pkn("topic_text")
        public String topicText;

        @Override // X.F9E
        public final Object[] getObjects() {
            Long l = this.giftId;
            ImageModel imageModel = this.img;
            ImageModel imageModel2 = this.sendIcon;
            ImageModel imageModel3 = this.bgImg;
            String str = this.roundName;
            String str2 = this.topicText;
            String str3 = this.topicCompleteText;
            Long l2 = this.startTime;
            Long l3 = this.endTime;
            Long l4 = this.round;
            Integer num = this.giftType;
            Integer num2 = this.diamondCount;
            return new Object[]{l, l, imageModel, imageModel, imageModel2, imageModel2, imageModel3, imageModel3, str, str, str2, str2, str3, str3, l2, l2, l3, l3, l4, l4, num, num, num2, num2};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        Data data = this.data;
        return new Object[]{data, data};
    }
}
