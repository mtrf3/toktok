package X;

import Y.IDObjectS332S0100000_12;
import Y.IDObjectS5S0101000_12;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.SFm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71790SFm extends AbstractC030309z {
    public final Context LJLIL;
    public final C26609AcP LJLILLLLZI;

    public C71790SFm(Context context, C26609AcP c26609AcP) {
        this.LJLIL = context;
        this.LJLILLLLZI = c26609AcP;
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas c, RecyclerView parent, C0AC state) {
        o.LJIIIZ(c, "c");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        Iterator it = new IDObjectS332S0100000_12(parent, 13).iterator();
        int i = 0;
        while (true) {
            IDObjectS5S0101000_12 iDObjectS5S0101000_12 = (IDObjectS5S0101000_12) it;
            if (iDObjectS5S0101000_12.hasNext()) {
                Object next = iDObjectS5S0101000_12.next();
                int i2 = i + 1;
                if (i >= 0) {
                    View view = (View) next;
                    if (i != parent.getChildCount() - 1) {
                        float bottom = view.getBottom() + this.LJLILLLLZI.LIZIZ;
                        Paint paint = new Paint();
                        Context context = this.LJLIL;
                        this.LJLILLLLZI.getClass();
                        paint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.dv, context));
                        c.drawRect(view.getLeft(), bottom, view.getRight(), bottom + this.LJLILLLLZI.LIZ, paint);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        if (C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view) != c0ac.LIZIZ() - 1) {
            rect.bottom = this.LJLILLLLZI.LIZJ;
        }
    }
}
