package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GsG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42880GsG extends FrameLayout implements InterfaceC42882GsI {
    public final List<View> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public C42880GsG() {
        throw null;
    }

    public final void LIZJ() {
        int i = this.LJLILLLLZI;
        if (i == -1) {
            return;
        }
        View LIZIZ = LIZIZ(i);
        if (LIZIZ != null) {
            LIZIZ.setVisibility(4);
        }
        setVisibility(4);
        this.LJLILLLLZI = -1;
    }

    @Override // X.InterfaceC42882GsI
    public final void LIZ(int i) {
        LIZLLL(i);
    }

    public final View LIZIZ(int i) {
        if (i < 0 || i >= ((ArrayList) this.LJLIL).size()) {
            return null;
        }
        return (View) ListProtector.get(this.LJLIL, i);
    }

    public final void LIZLLL(int i) {
        if (i >= 0 && this.LJLJI != i) {
            this.LJLJI = i;
            View view = (View) ListProtector.get(this.LJLIL, 0);
            if (view instanceof C42883GsJ) {
                ((C42883GsJ) view).LIZ(this.LJLJI);
            }
            KeyEvent.Callback callback = (View) ListProtector.get(this.LJLIL, 1);
            if (callback instanceof InterfaceC42882GsI) {
                ((InterfaceC42882GsI) callback).LIZ(this.LJLJI);
            }
            View view2 = (View) ListProtector.get(this.LJLIL, 2);
            if (view2 instanceof IAY) {
                ((IAY) view2).LIZ(this.LJLJI);
            }
            View view3 = (View) ListProtector.get(this.LJLIL, 3);
            if (view3 instanceof IAY) {
                ((IAY) view3).LIZ(this.LJLJI);
            }
            View view4 = (View) ListProtector.get(this.LJLIL, 4);
            if (view4 instanceof IAY) {
                ((IAY) view4).LIZ(this.LJLJI);
            }
        }
    }

    public void setBuilder(C42881GsH c42881GsH) {
        if (c42881GsH == null) {
            c42881GsH = C42881GsH.LIZ(getContext());
        }
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).add(c42881GsH.LIZIZ);
        ((ArrayList) this.LJLIL).add(c42881GsH.LIZJ);
        ((ArrayList) this.LJLIL).add(c42881GsH.LIZLLL);
        ((ArrayList) this.LJLIL).add(null);
        ((ArrayList) this.LJLIL).add(null);
        if (c42881GsH.LJ < 0) {
            C60903NvH.LJIIJJI().getUiService().getClass();
            c42881GsH.LJ = 0;
        }
        LIZLLL(c42881GsH.LJ);
        removeAllViews();
        for (int i = 0; i < ((ArrayList) this.LJLIL).size(); i++) {
            View view = (View) ListProtector.get(this.LJLIL, i);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }

    public void setStatus(int i) {
        View LIZIZ;
        int i2 = this.LJLILLLLZI;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0 && (LIZIZ = LIZIZ(i2)) != null) {
            LIZIZ.setVisibility(4);
        }
        if (i >= 0) {
            setVisibility(0);
            View LIZIZ2 = LIZIZ(i);
            if (LIZIZ2 != null) {
                LIZIZ2.setVisibility(0);
            }
        } else {
            setVisibility(4);
        }
        this.LJLILLLLZI = i;
    }

    public C42880GsG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new ArrayList(5);
        this.LJLILLLLZI = -1;
        this.LJLJI = -1;
    }
}
