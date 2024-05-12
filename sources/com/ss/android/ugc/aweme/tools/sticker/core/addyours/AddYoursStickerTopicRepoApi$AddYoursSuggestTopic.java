package com.ss.android.ugc.aweme.tools.sticker.core.addyours;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AddYoursStickerTopicRepoApi$AddYoursSuggestTopic implements Serializable {

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("topic_id")
    public final Long topicId;

    @InterfaceC65349Pkn("suggest_topic_type")
    public final Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursStickerTopicRepoApi$AddYoursSuggestTopic() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AddYoursStickerTopicRepoApi$AddYoursSuggestTopic copy$default(AddYoursStickerTopicRepoApi$AddYoursSuggestTopic addYoursStickerTopicRepoApi$AddYoursSuggestTopic, Long l, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            l = addYoursStickerTopicRepoApi$AddYoursSuggestTopic.topicId;
        }
        if ((i & 2) != 0) {
            str = addYoursStickerTopicRepoApi$AddYoursSuggestTopic.text;
        }
        if ((i & 4) != 0) {
            num = addYoursStickerTopicRepoApi$AddYoursSuggestTopic.type;
        }
        return addYoursStickerTopicRepoApi$AddYoursSuggestTopic.copy(l, str, num);
    }

    public final AddYoursStickerTopicRepoApi$AddYoursSuggestTopic copy(Long l, String str, Integer num) {
        return new AddYoursStickerTopicRepoApi$AddYoursSuggestTopic(l, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursStickerTopicRepoApi$AddYoursSuggestTopic)) {
            return false;
        }
        AddYoursStickerTopicRepoApi$AddYoursSuggestTopic addYoursStickerTopicRepoApi$AddYoursSuggestTopic = (AddYoursStickerTopicRepoApi$AddYoursSuggestTopic) obj;
        return o.LJ(this.topicId, addYoursStickerTopicRepoApi$AddYoursSuggestTopic.topicId) && o.LJ(this.text, addYoursStickerTopicRepoApi$AddYoursSuggestTopic.text) && o.LJ(this.type, addYoursStickerTopicRepoApi$AddYoursSuggestTopic.type);
    }

    public int hashCode() {
        Long l = this.topicId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursSuggestTopic(topicId=");
        LIZ.append(this.topicId);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", type=");
        return s0.LIZJ(LIZ, this.type, ')', LIZ);
    }

    public final String getText() {
        return this.text;
    }

    public final Long getTopicId() {
        return this.topicId;
    }

    public final Integer getType() {
        return this.type;
    }

    public AddYoursStickerTopicRepoApi$AddYoursSuggestTopic(Long l, String str, Integer num) {
        this.topicId = l;
        this.text = str;
        this.type = num;
    }

    public /* synthetic */ AddYoursStickerTopicRepoApi$AddYoursSuggestTopic(Long l, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
