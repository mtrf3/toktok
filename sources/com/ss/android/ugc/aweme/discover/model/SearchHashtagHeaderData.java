package com.ss.android.ugc.aweme.discover.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchHashtagHeaderData extends F9E implements Serializable {

    @InterfaceC65349Pkn("hashtag_conclusion")
    public final long hashtagConclusion;

    @InterfaceC65349Pkn("hashtag_name")
    public final String name;

    @InterfaceC65349Pkn("hashtag_view_count")
    public final long viewCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchHashtagHeaderData() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 7
            r0 = r8
            r4 = r2
            r7 = r1
            r0.<init>(r1, r2, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.model.SearchHashtagHeaderData.<init>():void");
    }

    public static /* synthetic */ SearchHashtagHeaderData copy$default(SearchHashtagHeaderData searchHashtagHeaderData, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchHashtagHeaderData.name;
        }
        if ((i & 2) != 0) {
            j = searchHashtagHeaderData.viewCount;
        }
        if ((i & 4) != 0) {
            j2 = searchHashtagHeaderData.hashtagConclusion;
        }
        return searchHashtagHeaderData.copy(str, j, j2);
    }

    public final SearchHashtagHeaderData copy(String name, long j, long j2) {
        o.LJIIIZ(name, "name");
        return new SearchHashtagHeaderData(name, j, j2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name, Long.valueOf(this.viewCount), Long.valueOf(this.hashtagConclusion)};
    }

    public final long getHashtagConclusion() {
        return this.hashtagConclusion;
    }

    public final String getName() {
        return this.name;
    }

    public final long getViewCount() {
        return this.viewCount;
    }

    public SearchHashtagHeaderData(String name, long j, long j2) {
        o.LJIIIZ(name, "name");
        this.name = name;
        this.viewCount = j;
        this.hashtagConclusion = j2;
    }

    public /* synthetic */ SearchHashtagHeaderData(String str, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? 1L : j2);
    }
}
