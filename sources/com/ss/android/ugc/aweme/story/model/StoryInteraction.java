package com.ss.android.ugc.aweme.story.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryInteraction implements Serializable {
    public final String LJLIL;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversationId;

    @InterfaceC65349Pkn("emoji_content")
    public final String emojiContent;

    @InterfaceC65349Pkn("message_id")
    public final long messageId;

    @InterfaceC65349Pkn("type")
    public final int type;

    public static /* synthetic */ StoryInteraction copy$default(StoryInteraction storyInteraction, int i, String str, String str2, long j, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = storyInteraction.type;
        }
        if ((i2 & 2) != 0) {
            str = storyInteraction.emojiContent;
        }
        if ((i2 & 4) != 0) {
            str2 = storyInteraction.conversationId;
        }
        if ((i2 & 8) != 0) {
            j = storyInteraction.messageId;
        }
        if ((i2 & 16) != 0) {
            str3 = storyInteraction.LJLIL;
        }
        return storyInteraction.copy(i, str, str2, j, str3);
    }

    public final StoryInteraction copy(int i, String str, String str2, long j, String str3) {
        return new StoryInteraction(i, str, str2, j, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryInteraction)) {
            return false;
        }
        StoryInteraction storyInteraction = (StoryInteraction) obj;
        return this.type == storyInteraction.type && o.LJ(this.emojiContent, storyInteraction.emojiContent) && o.LJ(this.conversationId, storyInteraction.conversationId) && this.messageId == storyInteraction.messageId && o.LJ(this.LJLIL, storyInteraction.LJLIL);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = this.type * 31;
        String str = this.emojiContent;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str2 = this.conversationId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.messageId, (i3 + hashCode2) * 31, 31);
        String str3 = this.LJLIL;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return LIZJ + i2;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryInteraction(type=");
        LIZ.append(this.type);
        LIZ.append(", emojiContent=");
        LIZ.append(this.emojiContent);
        LIZ.append(", conversationId=");
        LIZ.append(this.conversationId);
        LIZ.append(", messageId=");
        LIZ.append(this.messageId);
        LIZ.append(", messageContent=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getEmojiContent() {
        return this.emojiContent;
    }

    public final String getMessageContent() {
        return this.LJLIL;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    public final int getType() {
        return this.type;
    }

    public StoryInteraction(int i, String str, String str2, long j, String str3) {
        this.type = i;
        this.emojiContent = str;
        this.conversationId = str2;
        this.messageId = j;
        this.LJLIL = str3;
    }

    public /* synthetic */ StoryInteraction(int i, String str, String str2, long j, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, j, (i2 & 16) != 0 ? null : str3);
    }
}
