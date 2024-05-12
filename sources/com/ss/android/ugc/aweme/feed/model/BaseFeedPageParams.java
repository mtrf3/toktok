package com.ss.android.ugc.aweme.feed.model;

import X.M89;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class BaseFeedPageParams {
    public static final Companion Companion = new Companion();
    public int awemeFromPage;
    public String challengeId;
    public String cid;
    public String eventType;
    public boolean isFromPostList;
    public boolean isMyProfile;
    public boolean isShowVote;
    public int pageType;
    public int videoHeight;
    public int videoWidth;
    public boolean isOriginalCaption = true;
    public M89 param = new M89();

    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BaseFeedPageParams newBuilder() {
            return new BaseFeedPageParams();
        }

        public Companion() {
        }
    }

    public static /* synthetic */ void getAwemeFromPage$annotations() {
    }

    public static final BaseFeedPageParams newBuilder() {
        return Companion.newBuilder();
    }

    public final String getFromGroupId() {
        M89 m89 = this.param;
        if (m89 != null) {
            o.LJI(m89);
            return m89.getFromGroupId();
        }
        return null;
    }

    public final String getPreviousPage() {
        M89 m89 = this.param;
        if (m89 != null) {
            o.LJI(m89);
            return m89.getPreviousPage();
        }
        return null;
    }

    public final String getPreviousPagePosition() {
        M89 m89 = this.param;
        if (m89 != null) {
            o.LJI(m89);
            return m89.getPreviousPagePosition();
        }
        return null;
    }

    public final boolean isPlayListCleanMode() {
        M89 m89 = this.param;
        if (m89 != null) {
            o.LJI(m89);
            return m89.isPlaylistCleanMode();
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseFeedPageParams{awemeFromPage=");
        LIZ.append(this.awemeFromPage);
        LIZ.append(", eventType='");
        LIZ.append(this.eventType);
        LIZ.append("', isMyProfile=");
        LIZ.append(this.isMyProfile);
        LIZ.append(", isFromPostList=");
        LIZ.append(this.isFromPostList);
        LIZ.append(", pageType=");
        return b0.LIZJ(LIZ, this.pageType, '}', LIZ);
    }

    public final BaseFeedPageParams setAwemeFromPage(int i) {
        this.awemeFromPage = i;
        return this;
    }

    public final BaseFeedPageParams setChallengeId(String str) {
        this.challengeId = str;
        return this;
    }

    public final BaseFeedPageParams setCid(String str) {
        this.cid = str;
        return this;
    }

    public final BaseFeedPageParams setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public final BaseFeedPageParams setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public final BaseFeedPageParams setIsOriginalCaption(boolean z) {
        this.isOriginalCaption = z;
        return this;
    }

    public final BaseFeedPageParams setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public final BaseFeedPageParams setPageType(int i) {
        this.pageType = i;
        return this;
    }

    public final BaseFeedPageParams setParam(M89 param) {
        o.LJIIIZ(param, "param");
        this.param = param;
        return this;
    }

    public final BaseFeedPageParams setShowVote(boolean z) {
        this.isShowVote = z;
        return this;
    }
}
