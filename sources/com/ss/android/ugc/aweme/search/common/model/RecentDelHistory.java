package com.ss.android.ugc.aweme.search.common.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecentDelHistory {

    @InterfaceC65349Pkn("del_time_mills")
    public Long delTimeMills;

    @InterfaceC65349Pkn("word")
    public String word;

    /* JADX WARN: Multi-variable type inference failed */
    public RecentDelHistory() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentDelHistory)) {
            return false;
        }
        RecentDelHistory recentDelHistory = (RecentDelHistory) obj;
        return o.LJ(this.word, recentDelHistory.word) && o.LJ(this.delTimeMills, recentDelHistory.delTimeMills);
    }

    public final int hashCode() {
        String str = this.word;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.delTimeMills;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecentDelHistory(word=");
        LIZ.append(this.word);
        LIZ.append(", delTimeMills=");
        return JBR.LJ(LIZ, this.delTimeMills, ')', LIZ);
    }

    public RecentDelHistory(String str, Long l) {
        this.word = str;
        this.delTimeMills = l;
    }

    public /* synthetic */ RecentDelHistory(String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l);
    }
}
