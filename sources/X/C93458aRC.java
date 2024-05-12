package X;

import android.graphics.PointF;
import android.util.Property;
import kotlin.jvm.internal.o;

/* renamed from: X.aRC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93458aRC extends Property<C93454aR8, PointF> {
    public C93458aRC(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final PointF get(C93454aR8 c93454aR8) {
        C93454aR8 viewBounds = c93454aR8;
        o.LJIIIZ(viewBounds, "viewBounds");
        return new PointF(viewBounds.LIZJ, viewBounds.LIZLLL);
    }

    @Override // android.util.Property
    public final void set(C93454aR8 c93454aR8, PointF pointF) {
        C93454aR8 viewBounds = c93454aR8;
        PointF topLeft = pointF;
        o.LJIIIZ(viewBounds, "viewBounds");
        o.LJIIIZ(topLeft, "topLeft");
        int LJJIIZ = O6R.LJJIIZ(topLeft.x);
        int LJJIIZ2 = O6R.LJJIIZ(topLeft.y);
        viewBounds.LIZJ = LJJIIZ;
        viewBounds.LIZLLL = LJJIIZ2;
        viewBounds.LIZ++;
        viewBounds.LIZ();
    }
}
