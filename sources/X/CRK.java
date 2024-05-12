package X;

import android.view.View;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class CRK implements View.OnLayoutChangeListener {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ PublicScreenWidget LJLJJI;

    public CRK(PublicScreenWidget publicScreenWidget, View view) {
        this.LJLJJI = publicScreenWidget;
        this.LJLJI = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        if (this.LJLIL == 0 || this.LJLILLLLZI == 0) {
            Object parent = this.LJLJI.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                this.LJLIL = view2.getWidth();
                this.LJLILLLLZI = view2.getHeight();
            }
        }
        int i10 = i3 - i;
        int i11 = i4 - i2;
        C31319CQx c31319CQx = this.LJLJJI.LJLLI;
        if (c31319CQx != null && this.LJLIL > 0 && (i9 = this.LJLILLLLZI) > 0 && i10 > 0 && i11 > 0) {
            Iterator it = ((ArrayList) c31319CQx.LJLIL.LJ).iterator();
            while (it.hasNext()) {
                ((CRP) it.next()).LJIJJLI(i11, i9);
            }
        }
    }
}
