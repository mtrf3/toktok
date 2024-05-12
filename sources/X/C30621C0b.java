package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.C0b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30621C0b extends C40141hq {
    public List<InterfaceC30622C0c> LJFF;

    @Override // X.C40141hq, X.AbstractC28951Br
    public final View LJFF(C0A2 c0a2) {
        int i;
        View LJFF = super.LJFF(c0a2);
        if (LJFF != null) {
            i = ((RecyclerView.LayoutParams) LJFF.getLayoutParams()).getViewAdapterPosition();
            if (i == 0) {
                LJFF = c0a2.LJJIJIL(1);
                i = 1;
            } else if (i == c0a2.LJJJJZ() - 1) {
                i = c0a2.LJJJJZ() - 2;
                LJFF = c0a2.LJJIJIL(i);
            }
        } else {
            i = -1;
        }
        int i2 = i - 1;
        List<InterfaceC30622C0c> list = this.LJFF;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.LJFF).iterator();
            while (it.hasNext()) {
                ((InterfaceC30622C0c) it.next()).LIZ(i2);
            }
        }
        return LJFF;
    }
}
