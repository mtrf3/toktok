package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InsertRelation extends F9E {

    @InterfaceC65349Pkn("aweme_id")
    public final String awemeId;

    @InterfaceC65349Pkn("relation")
    public final int followStatus;

    public static /* synthetic */ InsertRelation copy$default(InsertRelation insertRelation, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = insertRelation.awemeId;
        }
        if ((i2 & 2) != 0) {
            i = insertRelation.followStatus;
        }
        return insertRelation.copy(str, i);
    }

    public final InsertRelation copy(String awemeId, int i) {
        o.LJIIIZ(awemeId, "awemeId");
        return new InsertRelation(awemeId, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.awemeId, Integer.valueOf(this.followStatus)};
    }

    public InsertRelation(String awemeId, int i) {
        o.LJIIIZ(awemeId, "awemeId");
        this.awemeId = awemeId;
        this.followStatus = i;
    }
}
