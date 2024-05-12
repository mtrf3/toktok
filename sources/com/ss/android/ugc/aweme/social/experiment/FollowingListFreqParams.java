package com.ss.android.ugc.aweme.social.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FollowingListFreqParams {

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("hidden_suggestcard_day")
    public final Integer hideSuggestCardDay;

    @InterfaceC65349Pkn("unclick_suggestcard_limit")
    public final Integer maxClickSuggestCardCount;

    @InterfaceC65349Pkn("untoplist_suggestcard_day")
    public final Integer unTopListSuggestCardDay;

    /* JADX WARN: Multi-variable type inference failed */
    public FollowingListFreqParams() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowingListFreqParams)) {
            return false;
        }
        FollowingListFreqParams followingListFreqParams = (FollowingListFreqParams) obj;
        return this.group == followingListFreqParams.group && o.LJ(this.maxClickSuggestCardCount, followingListFreqParams.maxClickSuggestCardCount) && o.LJ(this.unTopListSuggestCardDay, followingListFreqParams.unTopListSuggestCardDay) && o.LJ(this.hideSuggestCardDay, followingListFreqParams.hideSuggestCardDay);
    }

    public final int hashCode() {
        int i = this.group * 31;
        Integer num = this.maxClickSuggestCardCount;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unTopListSuggestCardDay;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.hideSuggestCardDay;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowingListFreqParams(group=");
        LIZ.append(this.group);
        LIZ.append(", maxClickSuggestCardCount=");
        LIZ.append(this.maxClickSuggestCardCount);
        LIZ.append(", unTopListSuggestCardDay=");
        LIZ.append(this.unTopListSuggestCardDay);
        LIZ.append(", hideSuggestCardDay=");
        return s0.LIZJ(LIZ, this.hideSuggestCardDay, ')', LIZ);
    }

    public FollowingListFreqParams(int i, Integer num, Integer num2, Integer num3) {
        this.group = i;
        this.maxClickSuggestCardCount = num;
        this.unTopListSuggestCardDay = num2;
        this.hideSuggestCardDay = num3;
    }

    public /* synthetic */ FollowingListFreqParams(int i, Integer num, Integer num2, Integer num3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : num3);
    }
}
