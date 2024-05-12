package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.o;

/* renamed from: X.73H, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73H implements InterfaceC87283bg {
    public final Aweme LJLIL;
    public final NowFeedMobHierarchyData LJLILLLLZI;

    public C73H() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C73H)) {
            return false;
        }
        C73H c73h = (C73H) obj;
        return o.LJ(this.LJLIL, c73h.LJLIL) && o.LJ(this.LJLILLLLZI, c73h.LJLILLLLZI);
    }

    public final int hashCode() {
        Aweme aweme = this.LJLIL;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LJLILLLLZI;
        return hashCode + (nowFeedMobHierarchyData != null ? nowFeedMobHierarchyData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewerListInitData(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", interactionHierarchyData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C73H(Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = nowFeedMobHierarchyData;
    }
}
