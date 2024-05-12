package com.ss.android.ugc.aweme.feed.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AwemeCommentConfig implements Serializable {

    @InterfaceC65349Pkn("emoji_recommend_list")
    public List<CommentPersonalizedEmoji> emojiList;

    @InterfaceC65349Pkn("empty_list_text")
    public String emptyListText;

    @InterfaceC65349Pkn("non_zero_input_box_text")
    public String nonZeroInputBoxText;

    @InterfaceC65349Pkn("zero_icon_text")
    public String zeroIconText;

    @InterfaceC65349Pkn("zero_input_box_text")
    public String zeroInputBoxText;

    public AwemeCommentConfig() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AwemeCommentConfig copy$default(AwemeCommentConfig awemeCommentConfig, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeCommentConfig.zeroIconText;
        }
        if ((i & 2) != 0) {
            str2 = awemeCommentConfig.zeroInputBoxText;
        }
        if ((i & 4) != 0) {
            str3 = awemeCommentConfig.nonZeroInputBoxText;
        }
        if ((i & 8) != 0) {
            str4 = awemeCommentConfig.emptyListText;
        }
        if ((i & 16) != 0) {
            list = awemeCommentConfig.emojiList;
        }
        return awemeCommentConfig.copy(str, str2, str3, str4, list);
    }

    public final AwemeCommentConfig copy(String str, String str2, String str3, String str4, List<CommentPersonalizedEmoji> list) {
        return new AwemeCommentConfig(str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeCommentConfig)) {
            return false;
        }
        AwemeCommentConfig awemeCommentConfig = (AwemeCommentConfig) obj;
        return o.LJ(this.zeroIconText, awemeCommentConfig.zeroIconText) && o.LJ(this.zeroInputBoxText, awemeCommentConfig.zeroInputBoxText) && o.LJ(this.nonZeroInputBoxText, awemeCommentConfig.nonZeroInputBoxText) && o.LJ(this.emptyListText, awemeCommentConfig.emptyListText) && o.LJ(this.emojiList, awemeCommentConfig.emojiList);
    }

    public int hashCode() {
        String str = this.zeroIconText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.zeroInputBoxText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nonZeroInputBoxText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.emptyListText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<CommentPersonalizedEmoji> list = this.emojiList;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeCommentConfig(zeroIconText=");
        LIZ.append(this.zeroIconText);
        LIZ.append(", zeroInputBoxText=");
        LIZ.append(this.zeroInputBoxText);
        LIZ.append(", nonZeroInputBoxText=");
        LIZ.append(this.nonZeroInputBoxText);
        LIZ.append(", emptyListText=");
        LIZ.append(this.emptyListText);
        LIZ.append(", emojiList=");
        return C1NE.LIZIZ(LIZ, this.emojiList, ')', LIZ);
    }

    public final List<CommentPersonalizedEmoji> getEmojiList() {
        return this.emojiList;
    }

    public final String getEmptyListText() {
        return this.emptyListText;
    }

    public final String getNonZeroInputBoxText() {
        return this.nonZeroInputBoxText;
    }

    public final String getZeroIconText() {
        return this.zeroIconText;
    }

    public final String getZeroInputBoxText() {
        return this.zeroInputBoxText;
    }

    public AwemeCommentConfig(String str, String str2, String str3, String str4, List<CommentPersonalizedEmoji> list) {
        this.zeroIconText = str;
        this.zeroInputBoxText = str2;
        this.nonZeroInputBoxText = str3;
        this.emptyListText = str4;
        this.emojiList = list;
    }
}
