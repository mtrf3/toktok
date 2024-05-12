package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.02I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C02I extends BaseAdapter {
    public final C281318n LJLIL;
    public int LJLILLLLZI = -1;
    public boolean LJLJI;
    public final boolean LJLJJI;
    public final LayoutInflater LJLJJL;
    public final int LJLJJLL;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public final void LIZIZ() {
        C281318n c281318n = this.LJLIL;
        C281618q c281618q = c281318n.LJIJJLI;
        if (c281618q != null) {
            c281318n.LJIIIIZZ();
            ArrayList<C281618q> arrayList = c281318n.LJIIIZ;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (ListProtector.get(arrayList, i) == c281618q) {
                    this.LJLILLLLZI = i;
                    return;
                }
            }
        }
        this.LJLILLLLZI = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<C281618q> LJIIJJI;
        if (this.LJLJJI) {
            C281318n c281318n = this.LJLIL;
            c281318n.LJIIIIZZ();
            LJIIJJI = c281318n.LJIIIZ;
        } else {
            LJIIJJI = this.LJLIL.LJIIJJI();
        }
        if (this.LJLILLLLZI < 0) {
            return LJIIJJI.size();
        }
        return LJIIJJI.size() - 1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        LIZIZ();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C281618q getItem(int i) {
        ArrayList<C281618q> LJIIJJI;
        if (this.LJLJJI) {
            C281318n c281318n = this.LJLIL;
            c281318n.LJIIIIZZ();
            LJIIJJI = c281318n.LJIIIZ;
        } else {
            LJIIJJI = this.LJLIL.LJIIJJI();
        }
        int i2 = this.LJLILLLLZI;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C281618q) ListProtector.get(LJIIJJI, i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = C16880lQ.LLLLIILL(this.LJLJJL, this.LJLJJLL, viewGroup, false);
        }
        int i3 = getItem(i).LIZIZ;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).LIZIZ;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.LJLIL.LJIIL() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        C02P c02p = (C02P) view;
        if (this.LJLJI) {
            listMenuItemView.setForceShowIcon(true);
        }
        c02p.LJIIIIZZ(getItem(i));
        return view;
    }

    public C02I(C281318n c281318n, LayoutInflater layoutInflater, boolean z, int i) {
        this.LJLJJI = z;
        this.LJLJJL = layoutInflater;
        this.LJLIL = c281318n;
        this.LJLJJLL = i;
        LIZIZ();
    }
}
