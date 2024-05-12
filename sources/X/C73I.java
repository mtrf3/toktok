package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.o;

/* renamed from: X.73I, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73I implements InterfaceC87283bg {
    public final Aweme LJLIL;
    public final NowFeedMobHierarchyData LJLILLLLZI;

    public C73I() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C73I)) {
            return false;
        }
        C73I c73i = (C73I) obj;
        return o.LJ(this.LJLIL, c73i.LJLIL) && o.LJ(this.LJLILLLLZI, c73i.LJLILLLLZI);
    }

    public final int hashCode() {
        Aweme aweme = this.LJLIL;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LJLILLLLZI;
        return hashCode + (nowFeedMobHierarchyData != null ? nowFeedMobHierarchyData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LikeListInitData(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", interactionHierarchyData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C73I(Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = nowFeedMobHierarchyData;
    }
}
