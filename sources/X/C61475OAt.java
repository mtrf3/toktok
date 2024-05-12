package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;

/* renamed from: X.OAt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61475OAt extends AbstractC60811Ntn {
    @Override // X.AbstractC60800Ntc
    public final void LJJJLZIJ(SparkContext sparkContext, C0D5 c0d5) {
        ViewGroup.LayoutParams layoutParams;
        View view = (View) c0d5.LIZIZ;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        View view2 = (View) c0d5.LIZIZ;
        if (view2 == null) {
            return;
        }
        view2.setLayoutParams(layoutParams);
    }
}
