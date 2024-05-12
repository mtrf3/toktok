package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* renamed from: X.VjB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80537VjB extends AbstractC030309z {
    public final Calendar LJLIL = C80561VjZ.LJIIIIZZ(null);
    public final Calendar LJLILLLLZI = C80561VjZ.LJIIIIZZ(null);
    public final /* synthetic */ MaterialCalendar LJLJI;

    public C80537VjB(MaterialCalendar materialCalendar) {
        this.LJLJI = materialCalendar;
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas canvas, RecyclerView recyclerView, C0AC c0ac) {
        int i;
        int width;
        if (!(recyclerView.getAdapter() instanceof C80538VjC) || !(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        C80538VjC c80538VjC = (C80538VjC) recyclerView.getAdapter();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        for (C15070iV<Long, Long> c15070iV : this.LJLJI.LJLJI.e()) {
            Long l = c15070iV.LIZ;
            if (l != null && c15070iV.LIZIZ != null) {
                this.LJLIL.setTimeInMillis(l.longValue());
                this.LJLILLLLZI.setTimeInMillis(c15070iV.LIZIZ.longValue());
                int i2 = this.LJLIL.get(1) - c80538VjC.LJLIL.LJLJJI.start.LJLILLLLZI;
                int i3 = this.LJLILLLLZI.get(1) - c80538VjC.LJLIL.LJLJJI.start.LJLILLLLZI;
                View LJJIJIL = gridLayoutManager.LJJIJIL(i2);
                View LJJIJIL2 = gridLayoutManager.LJJIJIL(i3);
                int i4 = gridLayoutManager.LLIIIL;
                int i5 = i2 / i4;
                int i6 = i3 / i4;
                for (int i7 = i5; i7 <= i6; i7++) {
                    View LJJIJIL3 = gridLayoutManager.LJJIJIL(gridLayoutManager.LLIIIL * i7);
                    if (LJJIJIL3 != null) {
                        int top = LJJIJIL3.getTop() + this.LJLJI.LJLJL.LIZLLL.LIZ.top;
                        int bottom = LJJIJIL3.getBottom() - this.LJLJI.LJLJL.LIZLLL.LIZ.bottom;
                        if (i7 == i5) {
                            i = (LJJIJIL.getWidth() / 2) + LJJIJIL.getLeft();
                        } else {
                            i = 0;
                        }
                        if (i7 == i6) {
                            width = (LJJIJIL2.getWidth() / 2) + LJJIJIL2.getLeft();
                        } else {
                            width = recyclerView.getWidth();
                        }
                        canvas.drawRect(i, top, width, bottom, this.LJLJI.LJLJL.LJII);
                    }
                }
            }
        }
    }
}
