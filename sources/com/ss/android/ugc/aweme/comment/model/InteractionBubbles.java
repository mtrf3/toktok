package com.ss.android.ugc.aweme.comment.model;

import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractionBubbles implements Serializable {
    public final InteractionBubbleCacheState cacheState;
    public final long commentCursor;
    public final List<Comment> commentData;
    public final long likeCursor;
    public final List<User> likeData;
    public final boolean likeHasMore;
    public final long likeOffset;

    /* loaded from: classes4.dex */
    public static final class Builder {
        public InteractionBubbleCacheState cacheState;
        public long commentCursor;
        public List<? extends Comment> commentData;
        public long likeCursor;
        public List<? extends User> likeData;
        public boolean likeHasMore;
        public long likeOffset;

        public final InteractionBubbles build() {
            return new InteractionBubbles(this.commentData, this.commentCursor, this.likeData, this.likeHasMore, this.likeCursor, this.likeOffset, this.cacheState);
        }

        public Builder(InteractionBubbles interactionBubbles) {
            List<Comment> list;
            long j;
            long j2;
            boolean z;
            InteractionBubbleCacheState cacheState;
            if (interactionBubbles != null) {
                list = interactionBubbles.getCommentData();
            } else {
                list = null;
            }
            this.commentData = list;
            if (interactionBubbles != null) {
                j = interactionBubbles.getCommentCursor();
            } else {
                j = 0;
            }
            this.commentCursor = j;
            this.likeData = interactionBubbles != null ? interactionBubbles.getLikeData() : null;
            if (interactionBubbles != null) {
                j2 = interactionBubbles.getLikeCursor();
            } else {
                j2 = 0;
            }
            this.likeCursor = j2;
            if (interactionBubbles != null) {
                z = interactionBubbles.getLikeHasMore();
            } else {
                z = false;
            }
            this.likeHasMore = z;
            this.likeOffset = interactionBubbles != null ? interactionBubbles.getLikeOffset() : 0L;
            this.cacheState = (interactionBubbles == null || (cacheState = interactionBubbles.getCacheState()) == null) ? InteractionBubbleCacheState.NO_CACHE : cacheState;
        }

        public final Builder cacheState(InteractionBubbleCacheState state) {
            o.LJIIIZ(state, "state");
            this.cacheState = state;
            return this;
        }

        public final Builder commentData(List<? extends Comment> list, long j) {
            this.commentData = list;
            this.commentCursor = j;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        
            if (r4 != null) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.ss.android.ugc.aweme.comment.model.InteractionBubbles.Builder handleLike(boolean r6, com.ss.android.ugc.aweme.profile.model.User r7) {
            /*
                r5 = this;
                java.lang.String r0 = "user"
                kotlin.jvm.internal.o.LJIIIZ(r7, r0)
                java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r0 = r5.likeData
                if (r0 == 0) goto L3c
                java.util.List r4 = X.ORZ.LLJILJILJ(r0)
                java.util.Iterator r3 = r4.iterator()
            L11:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L55
                java.lang.Object r2 = r3.next()
                r0 = r2
                com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
                java.lang.String r1 = r0.getUid()
                java.lang.String r0 = r7.getUid()
                boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
                if (r0 == 0) goto L11
            L2c:
                if (r6 == 0) goto L48
                if (r2 != 0) goto L42
                r0 = r4
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.add(r7)
                java.util.List r4 = X.ORZ.LLJI(r4)
            L3a:
                if (r4 != 0) goto L42
            L3c:
                if (r6 == 0) goto L45
                java.util.List r4 = X.C47261Igj.LJJIJ(r7)
            L42:
                r5.likeData = r4
                return r5
            L45:
                X.OQg r4 = X.C61878OQg.INSTANCE
                goto L42
            L48:
                if (r2 == 0) goto L42
                r0 = r4
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.remove(r2)
                java.util.List r4 = X.ORZ.LLJI(r4)
                goto L3a
            L55:
                r2 = 0
                goto L2c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.model.InteractionBubbles.Builder.handleLike(boolean, com.ss.android.ugc.aweme.profile.model.User):com.ss.android.ugc.aweme.comment.model.InteractionBubbles$Builder");
        }

        public final Builder likeData(List<? extends User> list, boolean z, long j, long j2) {
            this.likeData = list;
            this.likeHasMore = z;
            this.likeCursor = j;
            this.likeOffset = j2;
            return this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InteractionBubbles() {
        /*
            r13 = this;
            r1 = 0
            r2 = 0
            r5 = 0
            r11 = 127(0x7f, float:1.78E-43)
            r0 = r13
            r4 = r1
            r6 = r2
            r8 = r2
            r10 = r1
            r12 = r1
            r0.<init>(r1, r2, r4, r5, r6, r8, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.model.InteractionBubbles.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InteractionBubbles copy$default(InteractionBubbles interactionBubbles, List list, long j, List list2, boolean z, long j2, long j3, InteractionBubbleCacheState interactionBubbleCacheState, int i, Object obj) {
        if ((i & 1) != 0) {
            list = interactionBubbles.commentData;
        }
        if ((i & 2) != 0) {
            j = interactionBubbles.commentCursor;
        }
        if ((i & 4) != 0) {
            list2 = interactionBubbles.likeData;
        }
        if ((i & 8) != 0) {
            z = interactionBubbles.likeHasMore;
        }
        if ((i & 16) != 0) {
            j2 = interactionBubbles.likeCursor;
        }
        if ((i & 32) != 0) {
            j3 = interactionBubbles.likeOffset;
        }
        if ((i & 64) != 0) {
            interactionBubbleCacheState = interactionBubbles.cacheState;
        }
        return interactionBubbles.copy(list, j, list2, z, j2, j3, interactionBubbleCacheState);
    }

    public final InteractionBubbles copy(List<? extends Comment> list, long j, List<? extends User> list2, boolean z, long j2, long j3, InteractionBubbleCacheState cacheState) {
        o.LJIIIZ(cacheState, "cacheState");
        return new InteractionBubbles(list, j, list2, z, j2, j3, cacheState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionBubbles)) {
            return false;
        }
        InteractionBubbles interactionBubbles = (InteractionBubbles) obj;
        return o.LJ(this.commentData, interactionBubbles.commentData) && this.commentCursor == interactionBubbles.commentCursor && o.LJ(this.likeData, interactionBubbles.likeData) && this.likeHasMore == interactionBubbles.likeHasMore && this.likeCursor == interactionBubbles.likeCursor && this.likeOffset == interactionBubbles.likeOffset && this.cacheState == interactionBubbles.cacheState;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InteractionBubbles(commentData=");
        LIZ.append(this.commentData);
        LIZ.append(", commentCursor=");
        LIZ.append(this.commentCursor);
        LIZ.append(", likeData=");
        LIZ.append(this.likeData);
        LIZ.append(", likeHasMore=");
        LIZ.append(this.likeHasMore);
        LIZ.append(", likeCursor=");
        LIZ.append(this.likeCursor);
        LIZ.append(", likeOffset=");
        LIZ.append(this.likeOffset);
        LIZ.append(", cacheState=");
        LIZ.append(this.cacheState);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Builder copy() {
        return new Builder(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        List<Comment> list = this.commentData;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.commentCursor, hashCode * 31, 31);
        List<User> list2 = this.likeData;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i2 = (LIZJ + i) * 31;
        boolean z = this.likeHasMore;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return this.cacheState.hashCode() + JBR.LIZJ(this.likeOffset, JBR.LIZJ(this.likeCursor, (i2 + i3) * 31, 31), 31);
    }

    public final InteractionBubbleCacheState getCacheState() {
        return this.cacheState;
    }

    public final long getCommentCursor() {
        return this.commentCursor;
    }

    public final List<Comment> getCommentData() {
        return this.commentData;
    }

    public final long getLikeCursor() {
        return this.likeCursor;
    }

    public final List<User> getLikeData() {
        return this.likeData;
    }

    public final boolean getLikeHasMore() {
        return this.likeHasMore;
    }

    public final long getLikeOffset() {
        return this.likeOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InteractionBubbles(List<? extends Comment> list, long j, List<? extends User> list2, boolean z, long j2, long j3, InteractionBubbleCacheState cacheState) {
        o.LJIIIZ(cacheState, "cacheState");
        this.commentData = list;
        this.commentCursor = j;
        this.likeData = list2;
        this.likeHasMore = z;
        this.likeCursor = j2;
        this.likeOffset = j3;
        this.cacheState = cacheState;
    }

    public /* synthetic */ InteractionBubbles(List list, long j, List list2, boolean z, long j2, long j3, InteractionBubbleCacheState interactionBubbleCacheState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? list2 : null, (i & 8) != 0 ? false : z, (i & 16) != 0 ? 0L : j2, (i & 32) == 0 ? j3 : 0L, (i & 64) != 0 ? InteractionBubbleCacheState.NO_CACHE : interactionBubbleCacheState);
    }
}
