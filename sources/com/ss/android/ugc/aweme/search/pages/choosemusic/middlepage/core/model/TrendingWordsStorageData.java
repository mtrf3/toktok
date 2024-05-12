package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TrendingWordsStorageData implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("history")
    public final List<String> history;

    @InterfaceC65349Pkn("logId")
    public final String logId;

    @InterfaceC65349Pkn("search_position")
    public final String searchPosition;

    @InterfaceC65349Pkn("words")
    public final List<TrendingWord> words;

    /* JADX WARN: Multi-variable type inference failed */
    public TrendingWordsStorageData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendingWordsStorageData copy$default(TrendingWordsStorageData trendingWordsStorageData, List list, List list2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = trendingWordsStorageData.words;
        }
        if ((i & 2) != 0) {
            list2 = trendingWordsStorageData.history;
        }
        if ((i & 4) != 0) {
            str = trendingWordsStorageData.searchPosition;
        }
        if ((i & 8) != 0) {
            str2 = trendingWordsStorageData.logId;
        }
        return trendingWordsStorageData.copy(list, list2, str, str2);
    }

    public final TrendingWordsStorageData copy(List<TrendingWord> list, List<String> list2, String str, String str2) {
        return new TrendingWordsStorageData(list, list2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingWordsStorageData)) {
            return false;
        }
        TrendingWordsStorageData trendingWordsStorageData = (TrendingWordsStorageData) obj;
        return o.LJ(this.words, trendingWordsStorageData.words) && o.LJ(this.history, trendingWordsStorageData.history) && o.LJ(this.searchPosition, trendingWordsStorageData.searchPosition) && o.LJ(this.logId, trendingWordsStorageData.logId);
    }

    public int hashCode() {
        List<TrendingWord> list = this.words;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.history;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.searchPosition;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrendingWordsStorageData(words=");
        LIZ.append(this.words);
        LIZ.append(", history=");
        LIZ.append(this.history);
        LIZ.append(", searchPosition=");
        LIZ.append(this.searchPosition);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final List<String> getHistory() {
        return this.history;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getSearchPosition() {
        return this.searchPosition;
    }

    public final List<TrendingWord> getWords() {
        return this.words;
    }

    public TrendingWordsStorageData(List<TrendingWord> list, List<String> list2, String str, String str2) {
        this.words = list;
        this.history = list2;
        this.searchPosition = str;
        this.logId = str2;
    }

    public /* synthetic */ TrendingWordsStorageData(List list, List list2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
