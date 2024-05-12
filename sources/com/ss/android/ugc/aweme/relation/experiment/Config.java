package com.ss.android.ugc.aweme.relation.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Config extends F9E {

    @InterfaceC65349Pkn("recommend_friends_in_inbox_page")
    public final int recommendFriendsInInboxPage;

    @InterfaceC65349Pkn("recommend_friends_in_others_profile_page")
    public final int recommendFriendsInOthersProfilePage;

    @InterfaceC65349Pkn("recommend_friends_in_others_suggested_list")
    public final int recommendFriendsInOthersSuggestedList;

    @InterfaceC65349Pkn("recommend_friends_in_self_following_list")
    public final int recommendFriendsInSelfFollowingList;

    @InterfaceC65349Pkn("recommend_friends_in_self_suggested_list")
    public final int recommendFriendsInSelfSuggestedList;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Config() {
        /*
            r8 = this;
            r1 = 0
            r6 = 31
            r7 = 0
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.experiment.Config.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.recommendFriendsInInboxPage), Integer.valueOf(this.recommendFriendsInSelfFollowingList), Integer.valueOf(this.recommendFriendsInSelfSuggestedList), Integer.valueOf(this.recommendFriendsInOthersProfilePage), Integer.valueOf(this.recommendFriendsInOthersSuggestedList)};
    }

    public Config(int i, int i2, int i3, int i4, int i5) {
        this.recommendFriendsInInboxPage = i;
        this.recommendFriendsInSelfFollowingList = i2;
        this.recommendFriendsInSelfSuggestedList = i3;
        this.recommendFriendsInOthersProfilePage = i4;
        this.recommendFriendsInOthersSuggestedList = i5;
    }

    public /* synthetic */ Config(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
