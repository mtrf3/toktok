package X;

import android.graphics.PointF;
import android.util.Property;
import kotlin.jvm.internal.o;

/* renamed from: X.aRB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93457aRB extends Property<C93454aR8, PointF> {
    public C93457aRB(Class cls) {
        super(cls, "rightBottom");
    }

    @Override // android.util.Property
    public final PointF get(C93454aR8 c93454aR8) {
        C93454aR8 viewBounds = c93454aR8;
        o.LJIIIZ(viewBounds, "viewBounds");
        return new PointF(viewBounds.LJ, viewBounds.LJFF);
    }

    @Override // android.util.Property
    public final void set(C93454aR8 c93454aR8, PointF pointF) {
        C93454aR8 viewBounds = c93454aR8;
        PointF rightBottom = pointF;
        o.LJIIIZ(viewBounds, "viewBounds");
        o.LJIIIZ(rightBottom, "rightBottom");
        int LJJIIZ = O6R.LJJIIZ(rightBottom.x);
        int LJJIIZ2 = O6R.LJJIIZ(rightBottom.y);
        viewBounds.LJ = LJJIIZ;
        viewBounds.LJFF = LJJIIZ2;
        viewBounds.LIZIZ++;
        viewBounds.LIZ();
    }
}
