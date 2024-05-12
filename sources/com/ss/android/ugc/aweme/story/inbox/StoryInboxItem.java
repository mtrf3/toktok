package com.ss.android.ugc.aweme.story.inbox;

import X.C48339Iy7;
import X.C54838Lfe;
import X.InterfaceC222828oo;
import X.InterfaceC57784Mm4;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoryInboxItem implements InterfaceC57784Mm4, InterfaceC222828oo {
    public final boolean isMe;
    public final int priority;
    public final Aweme storyCollection;

    public static /* synthetic */ StoryInboxItem copy$default(StoryInboxItem storyInboxItem, Aweme aweme, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme = storyInboxItem.getStoryCollection();
        }
        if ((i2 & 2) != 0) {
            i = storyInboxItem.priority;
        }
        if ((i2 & 4) != 0) {
            z = storyInboxItem.isMe;
        }
        return storyInboxItem.copy(aweme, i, z);
    }

    public final Aweme component1() {
        return getStoryCollection();
    }

    public final StoryInboxItem copy(Aweme storyCollection, int i, boolean z) {
        o.LJIIIZ(storyCollection, "storyCollection");
        return new StoryInboxItem(storyCollection, i, z);
    }

    public int hashCode() {
        return getStoryCollection().hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryInboxItem(storyCollection=");
        LIZ.append(getStoryCollection());
        LIZ.append(", priority=");
        LIZ.append(this.priority);
        LIZ.append(", isMe=");
        return C48339Iy7.LIZJ(LIZ, this.isMe, ')', LIZ);
    }

    public final int getPriority() {
        return this.priority;
    }

    @Override // X.InterfaceC222828oo
    public Aweme getStoryCollection() {
        return this.storyCollection;
    }

    public final boolean isMe() {
        return this.isMe;
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        if (!(other instanceof StoryInboxItem)) {
            return false;
        }
        return o.LJ(getStoryCollection(), ((StoryInboxItem) other).getStoryCollection());
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        if (!(other instanceof StoryInboxItem)) {
            return false;
        }
        return o.LJ(C54838Lfe.LJIIIIZZ(getStoryCollection()), C54838Lfe.LJIIIIZZ(((StoryInboxItem) other).getStoryCollection()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC57784Mm4)) {
            return false;
        }
        return areItemTheSame((InterfaceC57784Mm4) obj);
    }

    @Override // X.InterfaceC57784Mm4
    public Object getChangePayload(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return null;
    }

    public StoryInboxItem(Aweme storyCollection, int i, boolean z) {
        o.LJIIIZ(storyCollection, "storyCollection");
        this.storyCollection = storyCollection;
        this.priority = i;
        this.isMe = z;
    }

    public /* synthetic */ StoryInboxItem(Aweme aweme, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aweme, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? false : z);
    }
}
