package X;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: X.1dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37571dh extends BaseAdapter implements Filterable, InterfaceC262011c {
    public C262111d LJLJL;
    public boolean LJLILLLLZI = true;
    public Cursor LJLJI = null;
    public boolean LJLIL = false;
    public int LJLJJI = -1;
    public C261811a LJLJJL = new ContentObserver() { // from class: X.11a
        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            Cursor cursor;
            AbstractC37571dh abstractC37571dh = AbstractC37571dh.this;
            if (abstractC37571dh.LJLILLLLZI && (cursor = abstractC37571dh.LJLJI) != null && !cursor.isClosed()) {
                abstractC37571dh.LJLIL = abstractC37571dh.LJLJI.requery();
            }
        }
    };
    public C261911b LJLJJLL = new DataSetObserver() { // from class: X.11b
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            AbstractC37571dh abstractC37571dh = AbstractC37571dh.this;
            abstractC37571dh.LJLIL = true;
            abstractC37571dh.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            AbstractC37571dh abstractC37571dh = AbstractC37571dh.this;
            abstractC37571dh.LJLIL = false;
            abstractC37571dh.notifyDataSetInvalidated();
        }
    };

    public abstract void LIZIZ(View view, Cursor cursor);

    public abstract CharSequence LIZLLL(Cursor cursor);

    public abstract View LJ(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.LJLIL && (cursor = this.LJLJI) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.11d] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.LJLJL == null) {
            this.LJLJL = new Filter(this) { // from class: X.11d
                public final InterfaceC262011c LIZ;

                {
                    this.LIZ = this;
                }

                @Override // android.widget.Filter
                public final CharSequence convertResultToString(Object obj) {
                    return ((AbstractC37571dh) this.LIZ).LIZLLL((Cursor) obj);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
                @Override // android.widget.Filter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
                    /*
                        r4 = this;
                        X.11c r2 = r4.LIZ
                        X.1px r2 = (X.ViewOnClickListenerC45171px) r2
                        if (r5 != 0) goto L3c
                        java.lang.String r1 = ""
                    L8:
                        X.195 r0 = r2.LJLLI
                        int r0 = r0.getVisibility()
                        r3 = 0
                        if (r0 != 0) goto L19
                        X.195 r0 = r2.LJLLI
                        int r0 = r0.getWindowVisibility()
                        if (r0 == 0) goto L30
                    L19:
                        r2 = r3
                    L1a:
                        android.widget.Filter$FilterResults r1 = new android.widget.Filter$FilterResults
                        r1.<init>()
                        if (r2 == 0) goto L2a
                        int r0 = r2.getCount()
                        r1.count = r0
                        r1.values = r2
                    L29:
                        return r1
                    L2a:
                        r0 = 0
                        r1.count = r0
                        r1.values = r3
                        goto L29
                    L30:
                        android.app.SearchableInfo r0 = r2.LJLLILLLL     // Catch: java.lang.RuntimeException -> L19
                        android.database.Cursor r2 = r2.LJII(r0, r1)     // Catch: java.lang.RuntimeException -> L19
                        if (r2 == 0) goto L19
                        r2.getCount()     // Catch: java.lang.RuntimeException -> L19
                        goto L1a
                    L3c:
                        r2.getClass()
                        java.lang.String r1 = r5.toString()
                        goto L8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C262111d.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
                }

                @Override // android.widget.Filter
                public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                    InterfaceC262011c interfaceC262011c = this.LIZ;
                    Cursor cursor = ((AbstractC37571dh) interfaceC262011c).LJLJI;
                    Object obj = filterResults.values;
                    if (obj != null && obj != cursor) {
                        ((AbstractC37571dh) interfaceC262011c).LIZJ((Cursor) obj);
                    }
                }
            };
        }
        return this.LJLJL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.11a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.11b] */
    public AbstractC37571dh(Context context) {
    }

    public void LIZJ(Cursor cursor) {
        Cursor cursor2 = this.LJLJI;
        if (cursor == cursor2) {
            return;
        }
        if (cursor2 != null) {
            C261811a c261811a = this.LJLJJL;
            if (c261811a != null) {
                cursor2.unregisterContentObserver(c261811a);
            }
            C261911b c261911b = this.LJLJJLL;
            if (c261911b != null) {
                cursor2.unregisterDataSetObserver(c261911b);
            }
        }
        this.LJLJI = cursor;
        if (cursor != null) {
            C261811a c261811a2 = this.LJLJJL;
            if (c261811a2 != null) {
                cursor.registerContentObserver(c261811a2);
            }
            C261911b c261911b2 = this.LJLJJLL;
            if (c261911b2 != null) {
                cursor.registerDataSetObserver(c261911b2);
            }
            this.LJLJJI = cursor.getColumnIndexOrThrow("_id");
            this.LJLIL = true;
            notifyDataSetChanged();
        } else {
            this.LJLJJI = -1;
            this.LJLIL = false;
            notifyDataSetInvalidated();
        }
        if (cursor2 == null) {
            return;
        }
        cursor2.close();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (this.LJLIL && (cursor = this.LJLJI) != null) {
            cursor.moveToPosition(i);
            return this.LJLJI;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.LJLIL || (cursor = this.LJLJI) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.LJLJI.getLong(this.LJLJJI);
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.LJLIL) {
            this.LJLJI.moveToPosition(i);
            if (view == null) {
                AbstractC44271oV abstractC44271oV = (AbstractC44271oV) this;
                view = C16880lQ.LLLLIILL(abstractC44271oV.LJLL, abstractC44271oV.LJLJLLL, viewGroup, false);
            }
            LIZIZ(view, this.LJLJI);
            return view;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.LJLIL) {
            if (this.LJLJI.moveToPosition(i)) {
                if (view == null) {
                    view = LJ(viewGroup);
                }
                LIZIZ(view, this.LJLJI);
                return view;
            }
            throw new IllegalStateException(KMP.LJ("couldn't move cursor to position ", i));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
