package X;

import Y.IDObjectS0S0101000;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sh7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72765Sh7 extends AbstractC030309z {
    public final boolean LJLIL;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final int LJLILLLLZI = R.attr.cl;
    public final int LJLJI = R.attr.go;
    public final int LJLJJI = 62;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1097));
    public final Rect LJLJLLL = new Rect();
    public final Rect LJLL = new Rect();

    public C72765Sh7(C25600zU c25600zU, boolean z) {
        this.LJLIL = z;
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0200000_6(c25600zU, this, 22));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0200000_6(c25600zU, this, 21));
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0200000_12(c25600zU, this, 76));
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas c, RecyclerView parent, C0AC state) {
        InterfaceC57784Mm4 interfaceC57784Mm4;
        C62792Oke c62792Oke;
        PowerCell powerCell;
        o.LJIIIZ(c, "c");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        Iterator<View> it = C78924UyG.LIZLLL(parent).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                View view = (View) iDObjectS0S0101000.next();
                RecyclerView.ViewHolder LJJJJJL = parent.LJJJJJL(view);
                o.LJIIIIZZ(LJJJJJL, "parent.getChildViewHolder(childView)");
                String str = null;
                if ((LJJJJJL instanceof PowerCell) && (powerCell = (PowerCell) LJJJJJL) != null) {
                    interfaceC57784Mm4 = powerCell.getItem();
                } else {
                    interfaceC57784Mm4 = null;
                }
                if ((interfaceC57784Mm4 instanceof C62792Oke) && (c62792Oke = (C62792Oke) interfaceC57784Mm4) != null) {
                    str = c62792Oke.LJLIL;
                }
                if (o.LJ(view.getTag(-100), Boolean.TRUE) && str != null) {
                    this.LJLJLLL.set(parent.getPaddingLeft(), C47135Ieh.LIZ(32, view.getTop()), parent.getWidth() - parent.getPaddingRight(), view.getBottom());
                    c.drawRect(this.LJLJLLL, (Paint) this.LJLJJLL.getValue());
                    c.drawText(str, ((Number) this.LJLJJL.getValue()).floatValue(), ((Number) this.LJLJLJ.getValue()).floatValue() + C47959Irz.LIZJ(8, this.LJLJLLL.top), (Paint) this.LJLJL.getValue());
                }
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC030309z
    public final void LJI(Canvas c, RecyclerView parent, C0AC state) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.ViewHolder LJJJ;
        C62792Oke c62792Oke;
        PowerCell powerCell;
        o.LJIIIZ(c, "c");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        if (!this.LJLIL) {
            return;
        }
        C0A2 layoutManager = parent.getLayoutManager();
        InterfaceC57784Mm4 interfaceC57784Mm4 = null;
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (LJJJ = parent.LJJJ(linearLayoutManager.LLILL(), false)) != null) {
            if ((LJJJ instanceof PowerCell) && (powerCell = (PowerCell) LJJJ) != null) {
                interfaceC57784Mm4 = powerCell.getItem();
            }
            if (!(interfaceC57784Mm4 instanceof C62792Oke) || (c62792Oke = (C62792Oke) interfaceC57784Mm4) == null) {
                return;
            }
            String str = c62792Oke.LJLIL;
            this.LJLL.set(parent.getPaddingLeft(), parent.getPaddingTop(), parent.getRight() - parent.getPaddingRight(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)) + parent.getPaddingTop());
            c.drawRect(this.LJLL, (Paint) this.LJLJJLL.getValue());
            c.drawText(str, ((Number) this.LJLJJL.getValue()).floatValue(), ((Number) this.LJLJLJ.getValue()).floatValue() + C47959Irz.LIZJ(8, parent.getPaddingTop()), (Paint) this.LJLJL.getValue());
        }
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        InterfaceC57784Mm4 interfaceC57784Mm4;
        String str;
        InterfaceC57784Mm4 interfaceC57784Mm42;
        C62792Oke c62792Oke;
        C62792Oke c62792Oke2;
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        List<InterfaceC57784Mm4> listItems = ((SYL) recyclerView).getListItems();
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        String str2 = null;
        if (listItems != null) {
            interfaceC57784Mm4 = (InterfaceC57784Mm4) ORZ.LJLLLLLL(LJJJJIZL, listItems);
        } else {
            interfaceC57784Mm4 = null;
        }
        if ((interfaceC57784Mm4 instanceof C62792Oke) && (c62792Oke2 = (C62792Oke) interfaceC57784Mm4) != null) {
            str = c62792Oke2.LJLIL;
        } else {
            str = null;
        }
        if (listItems != null) {
            interfaceC57784Mm42 = (InterfaceC57784Mm4) ORZ.LJLLLLLL(LJJJJIZL - 1, listItems);
        } else {
            interfaceC57784Mm42 = null;
        }
        if ((interfaceC57784Mm42 instanceof C62792Oke) && (c62792Oke = (C62792Oke) interfaceC57784Mm42) != null) {
            str2 = c62792Oke.LJLIL;
        }
        if (!o.LJ(str, str2)) {
            rect.top = C7MY.LIZIZ(32);
            view.setTag(-100, Boolean.TRUE);
        } else {
            rect.top = 0;
            view.setTag(-100, Boolean.FALSE);
        }
    }
}
