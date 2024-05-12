package com.ss.android.ugc.aweme.search.model;

import X.InterfaceC65349Pkn;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes7.dex */
public class SearchHistory {

    @InterfaceC65349Pkn("keyword")
    public String keyword;

    @InterfaceC65349Pkn("int")
    public int type;

    @InterfaceC65349Pkn("uid")
    public String uid;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.keyword, this.uid});
    }

    public SearchHistory() {
    }

    public final String toString() {
        return this.keyword;
    }

    public SearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            try {
                SearchHistory searchHistory = (SearchHistory) obj;
                if (Objects.equals(this.keyword, searchHistory.keyword)) {
                    if (Objects.equals(this.uid, searchHistory.uid)) {
                        return true;
                    }
                }
                return false;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public SearchHistory(String str, int i) {
        this.keyword = str;
        this.type = i;
    }

    public SearchHistory(String str, int i, String str2) {
        this.keyword = str;
        this.type = i;
        this.uid = str2;
    }
}
