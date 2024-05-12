package X;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.agD, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94389agD extends RecyclerView.ViewHolder {
    public final SparseArray<View> LJLIL;

    public C94389agD(View view) {
        super(view);
        this.LJLIL = new SparseArray<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r2 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends android.view.View> T L(int r4) {
        /*
            r3 = this;
            android.util.SparseArray<android.view.View> r0 = r3.LJLIL
            java.lang.Object r2 = r0.get(r4)
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L18
            android.view.View r0 = r3.itemView
            android.view.View r1 = r0.findViewById(r4)
            if (r1 == 0) goto L18
            android.util.SparseArray<android.view.View> r0 = r3.LJLIL
            r0.put(r4, r1)
        L17:
            return r1
        L18:
            boolean r0 = r2 instanceof android.view.View
            if (r0 != 0) goto L35
        L1c:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "No view found with id "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L35:
            r1 = r2
            if (r2 == 0) goto L1c
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94389agD.L(int):android.view.View");
    }

    public final void M(int i, int i2) {
        TextView textView = (TextView) L(i);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        textView.setTextColor(itemView.getResources().getColor(i2));
    }

    public final void N(int i, boolean z) {
        int i2;
        View L = L(i);
        if (z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        L.setVisibility(i2);
    }
}
