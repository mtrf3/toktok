package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class XXQ extends LinearLayout {
    public final ArrayList<C84987XXb> LJLIL;
    public G87 LJLILLLLZI;
    public final int LJLJI;
    public C72H<XYM> LJLJJI;

    public ArrayList<C84987XXb> getMusicItemViews() {
        return this.LJLIL;
    }

    public XXQ(Context context, int i) {
        super(context);
        this.LJLIL = new ArrayList<>(3);
        this.LJLJI = i;
        setOrientation(1);
        int i2 = 0;
        do {
            C84987XXb c84987XXb = new C84987XXb(C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bcp, null, false), this.LJLJI, C52536Kjc.LIZIZ(), C52536Kjc.LIZ());
            ViewGroup viewGroup = c84987XXb.LJLLLL;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, 0, 0);
            this.LJLIL.add(c84987XXb);
            G87 g87 = this.LJLILLLLZI;
            C72H<XYM> c72h = this.LJLJJI;
            c84987XXb.LLIIJLIL = g87;
            c84987XXb.LLIIZ = c72h;
            addView(c84987XXb.itemView);
            i2++;
        } while (i2 < 3);
    }
}
