package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrendingWord implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("word")
    public final String word;

    /* JADX WARN: Multi-variable type inference failed */
    public TrendingWord() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TrendingWord copy$default(TrendingWord trendingWord, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trendingWord.word;
        }
        if ((i & 2) != 0) {
            str2 = trendingWord.id;
        }
        return trendingWord.copy(str, str2);
    }

    public final TrendingWord copy(String str, String str2) {
        return new TrendingWord(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingWord)) {
            return false;
        }
        TrendingWord trendingWord = (TrendingWord) obj;
        return o.LJ(this.word, trendingWord.word) && o.LJ(this.id, trendingWord.id);
    }

    public int hashCode() {
        String str = this.word;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrendingWord(word=");
        LIZ.append(this.word);
        LIZ.append(", id=");
        return q.LIZIZ(LIZ, this.id, ')', LIZ);
    }

    public final String getId() {
        return this.id;
    }

    public final String getWord() {
        return this.word;
    }

    public TrendingWord(String str, String str2) {
        this.word = str;
        this.id = str2;
    }

    public /* synthetic */ TrendingWord(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
