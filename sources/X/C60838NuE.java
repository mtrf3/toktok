package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NuE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60838NuE implements InterfaceC60717NsH {
    public final /* synthetic */ SparkActivity LIZ;

    @Override // X.InterfaceC60717NsH
    public final void LIZ() {
        SparkActivity sparkActivity = this.LIZ;
        sparkActivity.LJLJJL = sparkActivity.LJLLL;
        sparkActivity.LJLJLJ = sparkActivity.LJLLLL;
        sparkActivity.LLIIIILZ();
        Window window = this.LIZ.getWindow();
        o.LJFF(window, "this@SparkActivity.window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.k8q);
            if (viewGroup2 != null) {
                C16880lQ.LJLLL(viewGroup2, viewGroup);
                viewGroup2.removeAllViews();
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public C60838NuE(SparkActivity sparkActivity) {
        this.LIZ = sparkActivity;
    }

    @Override // X.InterfaceC60717NsH
    public final void LIZIZ(View view) {
        o.LJIIJ(view, "view");
        SparkActivity sparkActivity = this.LIZ;
        sparkActivity.LJLLL = sparkActivity.LJLJJL;
        sparkActivity.LJLLLL = sparkActivity.LJLJLJ;
        sparkActivity.LJLJJL = true;
        sparkActivity.LJLJLJ = true;
        sparkActivity.LLIIIILZ();
        Window window = this.LIZ.getWindow();
        o.LJFF(window, "this@SparkActivity.window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.k8q);
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(this.LIZ);
                viewGroup2.setId(R.id.k8q);
                viewGroup.addView(viewGroup2, new ViewGroup.LayoutParams(-1, -1));
            }
            viewGroup2.setVisibility(0);
            viewGroup2.addView(view, new ViewGroup.LayoutParams(-1, -1));
            viewGroup2.requestLayout();
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
