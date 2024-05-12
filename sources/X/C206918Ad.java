package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8Ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206918Ad extends AbstractC030309z {
    public static final int LJLJJI;
    public static final int LJLJJL;
    public static final int LJLJJLL;
    public final boolean LJLIL = C206928Ae.LIZ();
    public final int LJLILLLLZI;
    public final int LJLJI;

    static {
        int LIZIZ = C7MY.LIZIZ(C206938Af.LIZ);
        LJLJJI = LIZIZ;
        LJLJJL = LIZIZ / 2;
        LJLJJLL = C7MY.LIZIZ(C206948Ag.LIZ);
    }

    public C206918Ad() {
        LFH lfh = LFH.LIZIZ;
        this.LJLILLLLZI = lfh.LIZLLL().LIZ().LJJIIZ(LJLJJI) / 2;
        this.LJLJI = lfh.LIZLLL().LIZ().LJJIIZ(LJLJJLL);
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        if (this.LJLIL) {
            int i = LJLJJL;
            rect.set(i, LJLJJLL, i, 0);
        } else {
            int i2 = this.LJLILLLLZI;
            rect.set(i2, 0, i2, this.LJLJI);
        }
    }
}
