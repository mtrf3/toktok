package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.09z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC030309z {
    public void LJFF(Canvas canvas, RecyclerView recyclerView, C0AC c0ac) {
    }

    public void LJI(Canvas canvas, RecyclerView recyclerView, C0AC c0ac) {
    }

    public void LIZLLL(Rect rect, int i, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    public void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        LIZLLL(rect, ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
    }
}
