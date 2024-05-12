package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class BEQ extends FrameLayout {
    public final String LJLIL;
    public final List<View> LJLILLLLZI;
    public int LJLJI;

    public final void LIZIZ() {
        setStatus(1);
    }

    public final void LIZJ() {
        setStatus(2);
    }

    public final void LIZLLL() {
        setStatus(0);
    }

    public final void LIZ() {
        int i = this.LJLJI;
        if (i == -1) {
            return;
        }
        ((View) ListProtector.get(this.LJLILLLLZI, i)).setVisibility(4);
        this.LJLJI = -1;
    }

    private void setStatus(int i) {
        int i2 = this.LJLJI;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0) {
            ((View) ListProtector.get(this.LJLILLLLZI, i2)).setVisibility(4);
        }
        if (ListProtector.get(this.LJLILLLLZI, i) == null) {
            return;
        }
        ((View) ListProtector.get(this.LJLILLLLZI, i)).setVisibility(0);
        this.LJLJI = i;
        C012403c.LJ("setStatus    ", i, this.LJLIL);
    }

    public void setBuilder(BEP bep) {
        if (bep == null) {
            bep = BEP.LIZ(getContext());
        }
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLILLLLZI).add(bep.LIZIZ);
        ((ArrayList) this.LJLILLLLZI).add(bep.LIZJ);
        ((ArrayList) this.LJLILLLLZI).add(bep.LIZLLL);
        removeAllViews();
        for (int i = 0; i < ((ArrayList) this.LJLILLLLZI).size(); i++) {
            View view = (View) ListProtector.get(this.LJLILLLLZI, i);
            if (view != null) {
                view.setVisibility(4);
                if (view.getParent() != null) {
                    C16880lQ.LJLLL(view, (ViewGroup) view.getParent());
                }
                addView(view);
            }
        }
    }

    public BEQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C16880lQ.LJLLJ(BEQ.class);
        this.LJLILLLLZI = new ArrayList(3);
        this.LJLJI = -1;
        setBuilder(null);
    }
}
