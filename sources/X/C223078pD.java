package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.8pD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223078pD implements InterfaceC57784Mm4, InterfaceC222828oo {
    public final Aweme LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryGuideCardSkylightItem(storyCollection=");
        return C770830u.LIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC222828oo
    public final Aweme getStoryCollection() {
        return this.LJLIL;
    }

    public C223078pD(Aweme storyCollection) {
        o.LJIIIZ(storyCollection, "storyCollection");
        this.LJLIL = storyCollection;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C223078pD)) {
            return false;
        }
        return o.LJ(this.LJLIL, ((C223078pD) interfaceC57784Mm4).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return other instanceof C223078pD;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC57784Mm4)) {
            return false;
        }
        return areItemTheSame((InterfaceC57784Mm4) obj);
    }
}
