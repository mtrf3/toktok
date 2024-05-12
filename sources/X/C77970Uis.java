package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uis, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77970Uis extends CZA<C78016Ujc, C78007UjT> {
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;

    public C77970Uis(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(R.layout.da9, Boolean.FALSE);
        this.LIZLLL = interfaceC65784Pro;
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        C78007UjT holder = (C78007UjT) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.LJFF(holder);
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            C16880lQ.LJIIJ(null, holder.LJLIL);
        }
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object p1) {
        C78007UjT holder = (C78007UjT) viewHolder;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(p1, "p1");
        InterfaceC65784Pro<C76800UCe> onRetryClick = this.LIZLLL;
        o.LJIIIZ(onRetryClick, "onRetryClick");
        C16880lQ.LJIIJ(new C78011UjX(onRetryClick), holder.LJLIL);
    }

    @Override // X.CZA
    public final C78007UjT LJI(View view, ViewGroup viewGroup) {
        if (viewGroup != null) {
            view.getLayoutParams().height = viewGroup.getHeight();
        }
        return new C78007UjT(view);
    }
}
