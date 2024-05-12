package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class WLP<STATE, ACTION> extends AbstractC56012Ht<STATE, ACTION> {
    public View LJLIL;

    public abstract void LLJILJIL();

    public abstract void LLJILJILJ();

    public abstract void LLJJ();

    public abstract void LLJJI();

    public WLP() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("zxzzz_");
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        X1D.LIZIZ(LIZ);
    }

    public void initView() {
        View requireView = requireView();
        o.LJIIIIZZ(requireView, "requireView()");
        this.LJLIL = requireView;
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // X.AbstractC56012Ht
    public void onHide() {
        super.onHide();
    }

    @Override // X.AbstractC56012Ht
    public void onShow() {
        super.onShow();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        initView();
        LLJJ();
        LLJILJILJ();
        LLJILJIL();
    }

    @Override // X.AbstractC56012Ht, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public static void LLJJIII(WLP wlp, String msg) {
        wlp.getClass();
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        LLJJI();
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.lk, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) LLLLIILL;
    }
}
