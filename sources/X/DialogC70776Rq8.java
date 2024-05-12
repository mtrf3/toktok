package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;

/* renamed from: X.Rq8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogC70776Rq8 extends DialogC71430S1q implements InterfaceC71509S4r {
    public final C62822Ol8 LJLJL;
    public final List<InterfaceC70779RqB> LJLJLJ;
    public boolean LJLJLLL;

    @Override // X.InterfaceC71509S4r
    public final void LIZIZ(float f, int i) {
    }

    @Override // X.InterfaceC71509S4r
    public final void LIZJ(int i) {
    }

    public final JJV LJ() {
        return (JJV) this.LJLJL.getValue();
    }

    public DialogC70776Rq8(Context context) {
        super(context);
        this.LJLJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 703));
        this.LJLJLJ = new ArrayList();
        JJV LJ = LJ();
        this.LJLJI = LJ;
        this.LJLIL.setAdapter(LJ);
        AbstractC71431S1r<?> abstractC71431S1r = this.LJLJI;
        if (abstractC71431S1r == null) {
            return;
        }
        abstractC71431S1r.LJLJI = new C70777Rq9(this);
    }

    @Override // X.InterfaceC71509S4r
    public final void LIZ(int i) {
        if (i != 2) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLJJLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC70778RqA) it.next()).LIZIZ();
        }
    }

    public final void LJFF(List list) {
        LJ().LJLJL = list;
        LJ().notifyDataSetChanged();
    }

    public final void LJI(int i, Rect rect) {
        int i2;
        if (((ArrayList) this.LJLJJLL).isEmpty()) {
            ((ArrayList) this.LJLJJLL).add(new C5SN());
        }
        for (InterfaceC70778RqA interfaceC70778RqA : this.LJLJJLL) {
            if (!this.LJLJLLL) {
                interfaceC70778RqA.LJI(this.LJLILLLLZI, this);
            }
            List<? extends JJZ> list = LJ().LJLJL;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            interfaceC70778RqA.LJFF(i2);
        }
        if (!isShowing()) {
            AbstractC71431S1r<?> abstractC71431S1r = this.LJLJI;
            if (abstractC71431S1r == null || i >= abstractC71431S1r.getItemCount()) {
                DialogC71430S1q.LIZLLL(this);
            } else {
                this.LJLIL.LJLI(i);
                AbstractC71431S1r<?> abstractC71431S1r2 = this.LJLJI;
                if (abstractC71431S1r2 != null && i < abstractC71431S1r2.getItemCount()) {
                    abstractC71431S1r2.LJLIL = true;
                    abstractC71431S1r2.getClass();
                    abstractC71431S1r2.LJLILLLLZI = rect;
                }
                DialogC71430S1q.LIZLLL(this);
            }
        }
        Iterator<InterfaceC70778RqA> it = this.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().onPageSelected(i);
        }
    }
}
