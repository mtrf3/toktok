package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public class MusicSearchHistory {

    @InterfaceC65349Pkn("keyword")
    public String keyword;

    @InterfaceC65349Pkn("int")
    public int type;

    public int hashCode() {
        String str = this.keyword;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public MusicSearchHistory() {
    }

    public MusicSearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.keyword;
        String str2 = ((MusicSearchHistory) obj).keyword;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public MusicSearchHistory(String str, int i) {
        this.keyword = str;
        this.type = i;
    }
}
