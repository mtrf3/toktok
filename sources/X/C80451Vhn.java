package X;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.Vhn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80451Vhn implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C80450Vhm LJLIL;

    public C80451Vhn(C80450Vhm c80450Vhm) {
        this.LJLIL = c80450Vhm;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        long j2 = j;
        View view2 = view;
        int i2 = i;
        View view3 = null;
        if (i2 < 0) {
            C19M c19m = this.LJLIL.LJLJJL;
            if (!c19m.isShowing()) {
                item = null;
            } else {
                item = c19m.LJLJI.getSelectedItem();
            }
        } else {
            item = this.LJLIL.getAdapter().getItem(i2);
        }
        this.LJLIL.LIZIZ(item);
        AdapterView.OnItemClickListener onItemClickListener = this.LJLIL.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view2 == null || i2 < 0) {
                C19M c19m2 = this.LJLIL.LJLJJL;
                if (c19m2.isShowing()) {
                    view3 = c19m2.LJLJI.getSelectedView();
                }
                view2 = view3;
                C19M c19m3 = this.LJLIL.LJLJJL;
                if (!c19m3.isShowing()) {
                    i2 = -1;
                } else {
                    i2 = c19m3.LJLJI.getSelectedItemPosition();
                }
                C19M c19m4 = this.LJLIL.LJLJJL;
                if (!c19m4.isShowing()) {
                    j2 = Long.MIN_VALUE;
                } else {
                    j2 = c19m4.LJLJI.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(this.LJLIL.LJLJJL.LJLJI, view2, i2, j2);
        }
        this.LJLIL.LJLJJL.dismiss();
    }
}
