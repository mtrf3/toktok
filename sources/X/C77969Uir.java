package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uir, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77969Uir extends CZA<C78018Uje, C78008UjU> {
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;

    public C77969Uir(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(R.layout.da7, Boolean.FALSE);
        this.LIZLLL = interfaceC65784Pro;
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        C78008UjU holder = (C78008UjU) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.LJFF(holder);
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            C16880lQ.LJIIJ(null, holder.LJLIL);
        }
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object item) {
        C78008UjU p0 = (C78008UjU) viewHolder;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(item, "item");
        InterfaceC65784Pro<C76800UCe> onRetryClick = this.LIZLLL;
        o.LJIIIZ(onRetryClick, "onRetryClick");
        C16880lQ.LJIIJ(new C78012UjY(onRetryClick), p0.LJLIL);
    }

    @Override // X.CZA
    public final C78008UjU LJI(View view, ViewGroup viewGroup) {
        if (viewGroup != null) {
            view.getLayoutParams().height = viewGroup.getHeight();
        }
        return new C78008UjU(view);
    }
}
