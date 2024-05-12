package com.ss.android.ugc.aweme.relation.feed;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class NewUserRecCardProtect extends F9E {

    @InterfaceC65349Pkn("cold_start_count_limit")
    public int coldStartCountLimit;

    @InterfaceC65349Pkn("cold_start_hour_limit")
    public int coldStartHourLimit;

    @InterfaceC65349Pkn("strategy")
    public int strategy;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NewUserRecCardProtect() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.feed.NewUserRecCardProtect.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.strategy), Integer.valueOf(this.coldStartCountLimit), Integer.valueOf(this.coldStartHourLimit)};
    }

    public NewUserRecCardProtect(int i, int i2, int i3) {
        this.strategy = i;
        this.coldStartCountLimit = i2;
        this.coldStartHourLimit = i3;
    }

    public /* synthetic */ NewUserRecCardProtect(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
