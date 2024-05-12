package com.ss.android.ugc.aweme.discover.model.suggest;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TopHistoryWord {

    @InterfaceC65349Pkn("group_id")
    public final String groupId;

    @InterfaceC65349Pkn("icon_type")
    public final String iconType;

    @InterfaceC65349Pkn("is_top_word")
    public final Integer isTopWord;

    @InterfaceC65349Pkn("log_id")
    public final String logId;

    @InterfaceC65349Pkn("word")
    public final String word;

    /* JADX WARN: Multi-variable type inference failed */
    public TopHistoryWord() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TopHistoryWord copy$default(TopHistoryWord topHistoryWord, String str, Integer num, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topHistoryWord.word;
        }
        if ((i & 2) != 0) {
            num = topHistoryWord.isTopWord;
        }
        if ((i & 4) != 0) {
            str2 = topHistoryWord.iconType;
        }
        if ((i & 8) != 0) {
            str3 = topHistoryWord.groupId;
        }
        if ((i & 16) != 0) {
            str4 = topHistoryWord.logId;
        }
        return topHistoryWord.copy(str, num, str2, str3, str4);
    }

    public final TopHistoryWord copy(String str, Integer num, String str2, String str3, String str4) {
        return new TopHistoryWord(str, num, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopHistoryWord)) {
            return false;
        }
        TopHistoryWord topHistoryWord = (TopHistoryWord) obj;
        return o.LJ(this.word, topHistoryWord.word) && o.LJ(this.isTopWord, topHistoryWord.isTopWord) && o.LJ(this.iconType, topHistoryWord.iconType) && o.LJ(this.groupId, topHistoryWord.groupId) && o.LJ(this.logId, topHistoryWord.logId);
    }

    public int hashCode() {
        String str = this.word;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.isTopWord;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.iconType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.groupId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logId;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopHistoryWord(word=");
        LIZ.append(this.word);
        LIZ.append(", isTopWord=");
        LIZ.append(this.isTopWord);
        LIZ.append(", iconType=");
        LIZ.append(this.iconType);
        LIZ.append(", groupId=");
        LIZ.append(this.groupId);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public TopHistoryWord(String str, Integer num, String str2, String str3, String str4) {
        this.word = str;
        this.isTopWord = num;
        this.iconType = str2;
        this.groupId = str3;
        this.logId = str4;
    }

    public /* synthetic */ TopHistoryWord(String str, Integer num, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? str4 : null);
    }
}
