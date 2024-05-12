package X;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: X.18j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C280918j extends ListView implements C02K, C02Q, AdapterView.OnItemClickListener {
    public static final int[] LJLILLLLZI = {R.attr.background, R.attr.divider};
    public C281318n LJLIL;

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // X.C02Q
    public final void LIZ(C281318n c281318n) {
        this.LJLIL = c281318n;
    }

    @Override // X.C02K
    public final boolean LIZIZ(C281618q c281618q) {
        return this.LJLIL.LJIILLIIL(c281618q, null, 0);
    }

    public C280918j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(context, attributeSet, LJLILLLLZI, R.attr.listViewStyle, 0);
        if (LJIILIIL.LJIIJJI(0)) {
            setBackgroundDrawable(LJIILIIL.LJ(0));
        }
        if (LJIILIIL.LJIIJJI(1)) {
            setDivider(LJIILIIL.LJ(1));
        }
        LJIILIIL.LJIILJJIL();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        LIZIZ((C281618q) getAdapter().getItem(i));
    }
}
