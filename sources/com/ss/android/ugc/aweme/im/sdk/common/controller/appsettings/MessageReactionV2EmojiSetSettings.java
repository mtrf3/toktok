package com.ss.android.ugc.aweme.im.sdk.common.controller.appsettings;

import X.C1NE;
import X.C47261Igj;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageReactionV2EmojiSetSettings {
    public static final MessageReactionV2EmojiSetModel LIZ = new MessageReactionV2EmojiSetModel(C47261Igj.LJJIJIIJI("❤️", "😂", "🥰", "😭", "😳", "👍"), C47261Igj.LJJIJIIJI("❤️", "😂", "😡", "😭", "👍", "🤔", "🎉", "🤗", "😳", "😱", "🤪", "🙈"), C47261Igj.LJJIJIIJI("❤️", "😂", "😠", "😢", "😮", "🙏", "👍", "🙈", "🤪", "🎉", "🤔", "🙈"), C47261Igj.LJJIJIIJI("😂", "❤️", "🎉", "😭", "🙏", "👍", "👎", "😠", "🤔", "😮", "🙈", "🤪"), C47261Igj.LJJIJIIJI("❤️", "😂", "😡", "😭", "👍", "🤔", "🎉", "🤗", "😳", "😱", "🤪", "🙈"));

    /* loaded from: classes2.dex */
    public static final class MessageReactionV2EmojiSetModel {

        @InterfaceC65349Pkn("reaction_emoji_set_default")
        public final List<String> reactionEmojiSetDefault;

        @InterfaceC65349Pkn("reaction_emoji_set_v1")
        public final List<String> reactionEmojiSetV1;

        @InterfaceC65349Pkn("reaction_emoji_set_v2")
        public final List<String> reactionEmojiSetV2;

        @InterfaceC65349Pkn("reaction_emoji_set_v3")
        public final List<String> reactionEmojiSetV3;

        @InterfaceC65349Pkn("reaction_emoji_set_v4")
        public final List<String> reactionEmojiSetV4;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageReactionV2EmojiSetModel)) {
                return false;
            }
            MessageReactionV2EmojiSetModel messageReactionV2EmojiSetModel = (MessageReactionV2EmojiSetModel) obj;
            return o.LJ(this.reactionEmojiSetDefault, messageReactionV2EmojiSetModel.reactionEmojiSetDefault) && o.LJ(this.reactionEmojiSetV1, messageReactionV2EmojiSetModel.reactionEmojiSetV1) && o.LJ(this.reactionEmojiSetV2, messageReactionV2EmojiSetModel.reactionEmojiSetV2) && o.LJ(this.reactionEmojiSetV3, messageReactionV2EmojiSetModel.reactionEmojiSetV3) && o.LJ(this.reactionEmojiSetV4, messageReactionV2EmojiSetModel.reactionEmojiSetV4);
        }

        public final int hashCode() {
            List<String> list = this.reactionEmojiSetDefault;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.reactionEmojiSetV1;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.reactionEmojiSetV2;
            int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<String> list4 = this.reactionEmojiSetV3;
            int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<String> list5 = this.reactionEmojiSetV4;
            return hashCode4 + (list5 != null ? list5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MessageReactionV2EmojiSetModel(reactionEmojiSetDefault=");
            LIZ.append(this.reactionEmojiSetDefault);
            LIZ.append(", reactionEmojiSetV1=");
            LIZ.append(this.reactionEmojiSetV1);
            LIZ.append(", reactionEmojiSetV2=");
            LIZ.append(this.reactionEmojiSetV2);
            LIZ.append(", reactionEmojiSetV3=");
            LIZ.append(this.reactionEmojiSetV3);
            LIZ.append(", reactionEmojiSetV4=");
            return C1NE.LIZIZ(LIZ, this.reactionEmojiSetV4, ')', LIZ);
        }

        public MessageReactionV2EmojiSetModel(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
            this.reactionEmojiSetDefault = list;
            this.reactionEmojiSetV1 = list2;
            this.reactionEmojiSetV2 = list3;
            this.reactionEmojiSetV3 = list4;
            this.reactionEmojiSetV4 = list5;
        }
    }
}
