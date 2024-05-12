package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jdu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49634Jdu extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI = false;

    public C49634Jdu(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        recyclerView.getClass();
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        AbstractC029409q adapter = recyclerView.getAdapter();
        if (adapter instanceof AbstractC51777KTt) {
            if (((AbstractC51777KTt) adapter).LJLIL != null) {
                if (LJJJJIZL == 0) {
                    return;
                } else {
                    LJJJJIZL++;
                }
            }
        } else if (adapter instanceof C42225Ghh) {
            adapter.getClass();
            throw null;
        }
        int i = this.LJLIL;
        int i2 = LJJJJIZL % i;
        if (this.LJLJI) {
            int i3 = this.LJLILLLLZI;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (LJJJJIZL < i) {
                rect.top = i3;
            }
            rect.bottom = i3;
            return;
        }
        int i4 = this.LJLILLLLZI;
        rect.left = (i2 * i4) / i;
        rect.right = i4 - (((i2 + 1) * i4) / i);
        if (LJJJJIZL < i) {
            return;
        }
        rect.top = i4;
    }
}
