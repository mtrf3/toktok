package com.ss.android.ugc.aweme.search.performance.core.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class SearchPressedPrefetchOptConfig extends F9E {

    @InterfaceC65349Pkn("enable_ack")
    public final boolean enableAck;

    @InterfaceC65349Pkn("enable_comment")
    public final boolean enableComment;

    @InterfaceC65349Pkn("enable_hashtag")
    public final boolean enableHashtag;

    @InterfaceC65349Pkn("enable_normal")
    public final boolean enableNormal;

    @InterfaceC65349Pkn("enable_other")
    public final boolean enableOther;

    @InterfaceC65349Pkn("enable_related")
    public final boolean enableRelated;

    @InterfaceC65349Pkn("reuse_last_pre_request")
    public final boolean enableReuseLastPreRequest;

    @InterfaceC65349Pkn("enable_sug")
    public final boolean enableSug;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchPressedPrefetchOptConfig() {
        /*
            r11 = this;
            r1 = 0
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.performance.core.config.SearchPressedPrefetchOptConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableNormal), Boolean.valueOf(this.enableRelated), Boolean.valueOf(this.enableSug), Boolean.valueOf(this.enableHashtag), Boolean.valueOf(this.enableComment), Boolean.valueOf(this.enableOther), Boolean.valueOf(this.enableAck), Boolean.valueOf(this.enableReuseLastPreRequest)};
    }

    public SearchPressedPrefetchOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.enableNormal = z;
        this.enableRelated = z2;
        this.enableSug = z3;
        this.enableHashtag = z4;
        this.enableComment = z5;
        this.enableOther = z6;
        this.enableAck = z7;
        this.enableReuseLastPreRequest = z8;
    }

    public /* synthetic */ SearchPressedPrefetchOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) == 0 ? z8 : false);
    }
}
