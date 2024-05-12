package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class C0L extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ RecyclerView LJLIL;
    public final /* synthetic */ C0K LJLILLLLZI;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View LJJIJIIJI;
        C0Y c0y;
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView == null || (LJJIJIIJI = recyclerView.LJJIJIIJI(motionEvent.getX(), motionEvent.getY())) == null || (c0y = this.LJLILLLLZI.LJLILLLLZI) == null) {
            return false;
        }
        this.LJLIL.getClass();
        c0y.onItemClick(RecyclerView.LJJJJJ(LJJIJIIJI) - 1);
        return true;
    }

    public C0L(C0K c0k, RecyclerView recyclerView) {
        this.LJLILLLLZI = c0k;
        this.LJLIL = recyclerView;
    }
}
