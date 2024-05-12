package com.ss.android.ugc.aweme.feed.model.story;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class Story extends F9E implements Serializable {

    @InterfaceC65349Pkn("chat_disabled")
    public boolean chatDisable;

    @InterfaceC65349Pkn("expired_at")
    public long expiredAt;
    public boolean isFaked;
    public boolean isLoading;

    @InterfaceC65349Pkn("is_official")
    public boolean isOfficial;
    public boolean isPublishing;

    @InterfaceC65349Pkn("story_style_version")
    public long storyStyleVersion;

    @InterfaceC65349Pkn("total_comments")
    public long totalComments;

    @InterfaceC65349Pkn("viewed")
    public boolean viewed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Story() {
        /*
            r15 = this;
            r1 = 0
            r3 = 0
            r13 = 511(0x1ff, float:7.16E-43)
            r14 = 0
            r0 = r15
            r4 = r1
            r6 = r3
            r7 = r3
            r8 = r1
            r10 = r3
            r11 = r3
            r12 = r3
            r0.<init>(r1, r3, r4, r6, r7, r8, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.story.Story.<init>():void");
    }

    public static /* synthetic */ Story copy$default(Story story, long j, boolean z, long j2, boolean z2, boolean z3, long j3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            j = story.expiredAt;
        }
        if ((i & 2) != 0) {
            z = story.viewed;
        }
        if ((i & 4) != 0) {
            j2 = story.totalComments;
        }
        if ((i & 8) != 0) {
            z2 = story.isOfficial;
        }
        if ((i & 16) != 0) {
            z3 = story.chatDisable;
        }
        if ((i & 32) != 0) {
            j3 = story.storyStyleVersion;
        }
        if ((i & 64) != 0) {
            z4 = story.isLoading;
        }
        if ((i & 128) != 0) {
            z5 = story.isFaked;
        }
        if ((i & 256) != 0) {
            z6 = story.isPublishing;
        }
        return story.copy(j, z, j2, z2, z3, j3, z4, z5, z6);
    }

    public final Story copy(long j, boolean z, long j2, boolean z2, boolean z3, long j3, boolean z4, boolean z5, boolean z6) {
        return new Story(j, z, j2, z2, z3, j3, z4, z5, z6);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.expiredAt), Boolean.valueOf(this.viewed), Long.valueOf(this.totalComments), Boolean.valueOf(this.isOfficial), Boolean.valueOf(this.chatDisable), Long.valueOf(this.storyStyleVersion), Boolean.valueOf(this.isLoading), Boolean.valueOf(this.isFaked), Boolean.valueOf(this.isPublishing)};
    }

    public final boolean getChatDisable() {
        return this.chatDisable;
    }

    public final long getExpiredAt() {
        return this.expiredAt;
    }

    public final long getStoryStyleVersion() {
        return this.storyStyleVersion;
    }

    public final long getTotalComments() {
        return this.totalComments;
    }

    public final boolean getViewed() {
        return this.viewed;
    }

    public final boolean isFaked() {
        return this.isFaked;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isOfficial() {
        return this.isOfficial;
    }

    public final boolean isPublishing() {
        return this.isPublishing;
    }

    public final void setFaked(boolean z) {
        this.isFaked = z;
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setPublishing(boolean z) {
        this.isPublishing = z;
    }

    public final void setViewed(boolean z) {
        this.viewed = z;
    }

    public Story(long j, boolean z, long j2, boolean z2, boolean z3, long j3, boolean z4, boolean z5, boolean z6) {
        this.expiredAt = j;
        this.viewed = z;
        this.totalComments = j2;
        this.isOfficial = z2;
        this.chatDisable = z3;
        this.storyStyleVersion = j3;
        this.isLoading = z4;
        this.isFaked = z5;
        this.isPublishing = z6;
    }

    public /* synthetic */ Story(long j, boolean z, long j2, boolean z2, boolean z3, long j3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) == 0 ? j3 : 0L, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & 256) == 0 ? z6 : false);
    }
}
