package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4Bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C105364Bo<DATA> extends RecyclerView.ViewHolder {
    public void M() {
    }

    public void bind(DATA data, int i) {
    }

    public void L() {
        this.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: X.4Bw
            public final /* synthetic */ float LJLIL = 0.5f;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        C105434Bv.LIZ(this.LJLIL, view, false);
                    }
                } else {
                    C105434Bv.LIZ(this.LJLIL, view, true);
                }
                return false;
            }
        });
    }

    public C105364Bo(View view) {
        super(view);
        M();
        L();
    }
}
