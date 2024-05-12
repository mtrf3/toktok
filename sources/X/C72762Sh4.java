package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Sh4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72762Sh4 extends AbstractC030309z {
    public final Integer LJLIL;
    public final int LJLILLLLZI;
    public final EnumC72764Sh6 LJLJI;

    public C72762Sh4(Integer num, int i, EnumC72764Sh6 direction) {
        o.LJIIIZ(direction, "direction");
        this.LJLIL = num;
        this.LJLILLLLZI = i;
        this.LJLJI = direction;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        if (this.LJLIL != null && RecyclerView.LJJJJIZL(view) == 0) {
            int i = C72763Sh5.LIZ[this.LJLJI.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                rect.top = this.LJLIL.intValue();
                return;
            }
            rect.left = this.LJLIL.intValue();
            return;
        }
        int i2 = C72763Sh5.LIZ[this.LJLJI.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            rect.top = this.LJLILLLLZI;
            return;
        }
        rect.left = this.LJLILLLLZI;
    }
}
