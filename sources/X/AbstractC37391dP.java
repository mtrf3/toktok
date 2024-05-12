package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: X.1dP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37391dP implements AnonymousClass112, C02O, AdapterView.OnItemClickListener {
    public Rect LJLIL;

    @Override // X.C02O
    public final boolean LJ(C281618q c281618q) {
        return false;
    }

    @Override // X.C02O
    public final boolean LJI(C281618q c281618q) {
        return false;
    }

    @Override // X.C02O
    public final void LJIIIIZZ(Context context, C281318n c281318n) {
    }

    public abstract void LJIIJJI(C281318n c281318n);

    public abstract void LJIILIIL(View view);

    public abstract void LJIILJJIL(boolean z);

    public abstract void LJIILL(int i);

    public abstract void LJIILLIIL(int i);

    public abstract void LJIIZILJ(PopupWindow.OnDismissListener onDismissListener);

    public abstract void LJIJ(boolean z);

    public abstract void LJIJI(int i);

    @Override // X.C02O
    public final int getId() {
        return 0;
    }

    public static boolean LJIJJ(C281318n c281318n) {
        int size = c281318n.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c281318n.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static int LJIIL(C02I c02i, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c02i.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = c02i.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c02i.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C02I c02i;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            c02i = (C02I) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            c02i = (C02I) listAdapter;
        }
        C281318n c281318n = c02i.LJLIL;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof ViewOnKeyListenerC39831hL)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        c281318n.LJIILLIIL(menuItem, this, i2);
    }
}
