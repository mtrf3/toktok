package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.o;

/* renamed from: X.77c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1806477c implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;
    public final NowFeedMobHierarchyData LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1806477c)) {
            return false;
        }
        C1806477c c1806477c = (C1806477c) obj;
        return o.LJ(this.LJLIL, c1806477c.LJLIL) && o.LJ(this.LJLILLLLZI, c1806477c.LJLILLLLZI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        Aweme aweme = this.LJLIL;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LJLILLLLZI;
        return hashCode + (nowFeedMobHierarchyData != null ? nowFeedMobHierarchyData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionItem(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", interactionHierarchyData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C1806477c(Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = nowFeedMobHierarchyData;
    }
}
