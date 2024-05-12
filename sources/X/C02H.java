package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.02H, reason: invalid class name */
/* loaded from: classes.dex */
public class C02H extends BaseAdapter {
    public int LJLIL = -1;
    public final /* synthetic */ C281218m LJLILLLLZI;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public final void LIZIZ() {
        C281318n c281318n = this.LJLILLLLZI.LJLJI;
        C281618q c281618q = c281318n.LJIJJLI;
        if (c281618q != null) {
            c281318n.LJIIIIZZ();
            ArrayList<C281618q> arrayList = c281318n.LJIIIZ;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (ListProtector.get(arrayList, i) == c281618q) {
                    this.LJLIL = i;
                    return;
                }
            }
        }
        this.LJLIL = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C281318n c281318n = this.LJLILLLLZI.LJLJI;
        c281318n.LJIIIIZZ();
        int size = c281318n.LJIIIZ.size();
        this.LJLILLLLZI.getClass();
        if (this.LJLIL < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        LIZIZ();
        super.notifyDataSetChanged();
    }

    public C02H(C281218m c281218m) {
        this.LJLILLLLZI = c281218m;
        LIZIZ();
    }

    @Override // android.widget.Adapter
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C281618q getItem(int i) {
        C281318n c281318n = this.LJLILLLLZI.LJLJI;
        c281318n.LJIIIIZZ();
        ArrayList<C281618q> arrayList = c281318n.LJIIIZ;
        this.LJLILLLLZI.getClass();
        int i2 = this.LJLIL;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C281618q) ListProtector.get(arrayList, i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = C16880lQ.LLLLIILL(this.LJLILLLLZI.LJLILLLLZI, R.layout.d9, viewGroup, false);
        }
        ((C02P) view).LJIIIIZZ(getItem(i));
        return view;
    }
}
