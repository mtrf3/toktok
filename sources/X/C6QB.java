package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6QB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QB extends F9E {
    public final List<C6NN> LJLIL;
    public final boolean LJLILLLLZI;
    public final PointF LJLJI;
    public final boolean LJLJJI;

    public C6QB() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), this.LJLJI, Boolean.valueOf(this.LJLJJI)};
    }

    public /* synthetic */ C6QB(int i) {
        this(new ArrayList(), false, new PointF(), true);
    }

    public C6QB(List<C6NN> items, boolean z, PointF anchorPoint, boolean z2) {
        o.LJIIIZ(items, "items");
        o.LJIIIZ(anchorPoint, "anchorPoint");
        this.LJLIL = items;
        this.LJLILLLLZI = z;
        this.LJLJI = anchorPoint;
        this.LJLJJI = z2;
    }

    public static C6QB L(C6QB c6qb, List items, boolean z, PointF anchorPoint, boolean z2, int i) {
        if ((i & 1) != 0) {
            items = c6qb.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c6qb.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            anchorPoint = c6qb.LJLJI;
        }
        if ((i & 8) != 0) {
            z2 = c6qb.LJLJJI;
        }
        c6qb.getClass();
        o.LJIIIZ(items, "items");
        o.LJIIIZ(anchorPoint, "anchorPoint");
        return new C6QB(items, z, anchorPoint, z2);
    }
}
