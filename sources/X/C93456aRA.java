package X;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aRA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93456aRA extends Property<View, PointF> {
    public C93456aRA(Class cls) {
        super(cls, "position");
    }

    @Override // android.util.Property
    public final PointF get(View view) {
        View view2 = view;
        o.LJIIIZ(view2, "view");
        return new PointF(view2.getLeft(), view2.getTop());
    }

    @Override // android.util.Property
    public final void set(View view, PointF pointF) {
        View view2 = view;
        PointF topLeft = pointF;
        o.LJIIIZ(view2, "view");
        o.LJIIIZ(topLeft, "topLeft");
        int LJJIIZ = O6R.LJJIIZ(topLeft.x);
        int LJJIIZ2 = O6R.LJJIIZ(topLeft.y);
        int width = view2.getWidth() + LJJIIZ;
        int height = view2.getHeight() + LJJIIZ2;
        view2.setLeft(LJJIIZ);
        view2.setTop(LJJIIZ2);
        view2.setRight(width);
        view2.setBottom(height);
    }
}
