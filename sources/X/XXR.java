package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class XXR extends LinearLayout {
    public final ArrayList<C85022XYk> LJLIL;
    public G88 LJLILLLLZI;
    public final int LJLJI;
    public InterfaceC85019XYh<XYN> LJLJJI;

    public ArrayList<C85022XYk> getMusicItemViews() {
        return this.LJLIL;
    }

    public XXR(Context context, int i) {
        super(context);
        this.LJLIL = new ArrayList<>(3);
        this.LJLJI = i;
        setOrientation(1);
        int i2 = 0;
        do {
            C85022XYk c85022XYk = new C85022XYk(C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bg8, null, false), this.LJLJI);
            ViewGroup viewGroup = c85022XYk.LJLLI;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, 0, 0);
            this.LJLIL.add(c85022XYk);
            G88 g88 = this.LJLILLLLZI;
            InterfaceC85019XYh<XYN> interfaceC85019XYh = this.LJLJJI;
            c85022XYk.LLD = g88;
            c85022XYk.LLF = interfaceC85019XYh;
            addView(c85022XYk.itemView);
            i2++;
        } while (i2 < 3);
    }
}
