package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class CZA<T, VH extends RecyclerView.ViewHolder> extends AbstractC31414CUo<T, VH> {
    public final int LIZIZ;
    public final Boolean LIZJ;

    @Override // X.AbstractC31414CUo
    public void LIZ(VH vh, T t) {
    }

    public abstract VH LJI(View view, ViewGroup viewGroup);

    @Override // X.AbstractC31414CUo
    public void LJFF(VH vh) {
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            vh.itemView.setTag(R.id.bq7, null);
        }
    }

    public CZA(int i, Boolean bool) {
        this.LIZIZ = i;
        this.LIZJ = bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r0 != null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r0 != null) goto L5;
     */
    @Override // X.AbstractC31414CUo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final VH LIZJ(android.view.LayoutInflater r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            java.lang.Class r1 = r4.getClass()
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.CZB r3 = X.CZB.LIZ
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, X.CZF> r0 = X.CZB.LIZLLL
            java.lang.Object r0 = r0.get(r1)
            X.CZF r0 = (X.CZF) r0
            if (r0 != 0) goto L29
        L18:
            int r1 = r4.LIZIZ
            java.lang.Boolean r0 = r4.LIZJ
            boolean r0 = r0.booleanValue()
            android.view.View r0 = r3.LIZIZ(r1, r6, r0)
        L24:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r4.LJI(r0, r6)
            return r0
        L29:
            int r2 = r0.LJLIL
            boolean r1 = r0.LJLILLLLZI
            boolean r0 = r0.LJLJI
            if (r0 == 0) goto L56
            com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptSwitchSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptSwitchSetting.INSTANCE
            boolean r0 = r0.enableViewHolderLayoutPreload()
            if (r0 == 0) goto L56
            android.view.View r0 = r3.LIZJ(r2, r1)
            if (r0 == 0) goto L4d
            if (r1 == 0) goto L44
            r6.addView(r0)
        L44:
            if (r0 != 0) goto L24
        L46:
            android.view.View r0 = X.C29306Beo.LJIIIIZZ(r2, r6, r1)
            if (r0 != 0) goto L24
            goto L18
        L4d:
            X.Vsf r0 = X.CZB.LJ
            if (r0 == 0) goto L46
            android.view.View r0 = r0.inflate(r2, r6, r1)
            goto L44
        L56:
            X.Vsf r0 = X.CZB.LJ
            if (r0 == 0) goto L46
            android.view.View r0 = r0.inflate(r2, r6, r1)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZA.LIZJ(android.view.LayoutInflater, android.view.ViewGroup):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    @Override // X.AbstractC31414CUo
    public void LIZIZ(VH vh, T t, List<Object> list) {
        LIZ(vh, t);
    }
}
