package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public class C0K implements C0A5 {
    public final GestureDetector LJLIL;
    public final C0Y LJLILLLLZI;

    @Override // X.C0A5
    public final void LIZ(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    @Override // X.C0A5
    public final void LIZIZ(boolean z) {
    }

    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.LJLIL.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public C0K(Context context, RecyclerView recyclerView, C0J c0j) {
        this.LJLILLLLZI = c0j;
        this.LJLIL = new GestureDetector(context, new C0L(this, recyclerView));
    }
}
