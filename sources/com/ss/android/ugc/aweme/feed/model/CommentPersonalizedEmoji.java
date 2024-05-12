package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentPersonalizedEmoji implements Serializable {

    @InterfaceC65349Pkn("emoji")
    public String emoji;

    @InterfaceC65349Pkn("score")
    public Integer score;
    public String source;
    public String strategy;

    public CommentPersonalizedEmoji() {
    }

    public static /* synthetic */ CommentPersonalizedEmoji copy$default(CommentPersonalizedEmoji commentPersonalizedEmoji, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commentPersonalizedEmoji.emoji;
        }
        if ((i & 2) != 0) {
            num = commentPersonalizedEmoji.score;
        }
        if ((i & 4) != 0) {
            str2 = commentPersonalizedEmoji.strategy;
        }
        if ((i & 8) != 0) {
            str3 = commentPersonalizedEmoji.source;
        }
        return commentPersonalizedEmoji.copy(str, num, str2, str3);
    }

    public final CommentPersonalizedEmoji copy(String str, Integer num, String str2, String str3) {
        return new CommentPersonalizedEmoji(str, num, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentPersonalizedEmoji)) {
            return false;
        }
        CommentPersonalizedEmoji commentPersonalizedEmoji = (CommentPersonalizedEmoji) obj;
        return o.LJ(this.emoji, commentPersonalizedEmoji.emoji) && o.LJ(this.score, commentPersonalizedEmoji.score) && o.LJ(this.strategy, commentPersonalizedEmoji.strategy) && o.LJ(this.source, commentPersonalizedEmoji.source);
    }

    public int hashCode() {
        String str = this.emoji;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.score;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.strategy;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentPersonalizedEmoji {emoji: ");
        LIZ.append(this.emoji);
        LIZ.append(", score: ");
        LIZ.append(this.score);
        LIZ.append(", strategy: ");
        LIZ.append(this.strategy);
        LIZ.append(", source: ");
        return JBR.LJFF(LIZ, this.source, " }", LIZ);
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final Integer getScore() {
        return this.score;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getStrategy() {
        return this.strategy;
    }

    public CommentPersonalizedEmoji(String str, Integer num, String str2, String str3) {
        this.emoji = str;
        this.score = num;
        this.strategy = str2;
        this.source = str3;
    }

    public /* synthetic */ CommentPersonalizedEmoji(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, (i & 4) != 0 ? "server" : str2, (i & 8) != 0 ? "" : str3);
    }
}
