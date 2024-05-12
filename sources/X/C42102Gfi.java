package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gfi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42102Gfi extends F9E implements InterfaceC42095Gfb {
    public final List<String> LJLIL;
    public final List<String> LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final List<String> LJLJJL;

    public C42102Gfi() {
        this(null, null, null, null, null, 31);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public C42102Gfi(List propLinkedAnchors, List propAnchors, String mvName, String activityAnchor, List allAnchors, int i) {
        propLinkedAnchors = (i & 1) != 0 ? C61878OQg.INSTANCE : propLinkedAnchors;
        propAnchors = (i & 2) != 0 ? C61878OQg.INSTANCE : propAnchors;
        mvName = (i & 4) != 0 ? "" : mvName;
        activityAnchor = (i & 8) != 0 ? "" : activityAnchor;
        allAnchors = (i & 16) != 0 ? C61878OQg.INSTANCE : allAnchors;
        o.LJIIIZ(propLinkedAnchors, "propLinkedAnchors");
        o.LJIIIZ(propAnchors, "propAnchors");
        o.LJIIIZ(mvName, "mvName");
        o.LJIIIZ(activityAnchor, "activityAnchor");
        o.LJIIIZ(allAnchors, "allAnchors");
        this.LJLIL = propLinkedAnchors;
        this.LJLILLLLZI = propAnchors;
        this.LJLJI = mvName;
        this.LJLJJI = activityAnchor;
        this.LJLJJL = allAnchors;
    }
}
