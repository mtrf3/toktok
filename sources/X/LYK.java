package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LYK implements InterfaceC57784Mm4, InterfaceC222828oo {
    public final boolean LJLIL;
    public final Aweme LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StorySkylightItem(isSelfStory=");
        LIZ.append(this.LJLIL);
        LIZ.append(", storyCollection=");
        return C770830u.LIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC222828oo
    public final Aweme getStoryCollection() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof LYK)) {
            return false;
        }
        return o.LJ(this.LJLILLLLZI, ((LYK) interfaceC57784Mm4).LJLILLLLZI);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return other instanceof LYK;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC57784Mm4)) {
            return false;
        }
        return areItemTheSame((InterfaceC57784Mm4) obj);
    }

    public LYK(boolean z, Aweme storyCollection) {
        o.LJIIIZ(storyCollection, "storyCollection");
        this.LJLIL = z;
        this.LJLILLLLZI = storyCollection;
    }
}
