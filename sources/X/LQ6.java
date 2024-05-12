package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class LQ6 {
    public final Context LIZ;
    public int LIZIZ;
    public C55927LxD LIZJ;

    public final View LIZJ() {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LIZ);
        if (LJJIFFI == null) {
            return null;
        }
        HomeTabViewModel LIZ = HomeTabViewModel.LJLJLLL.LIZ(LJJIFFI);
        View view = LIZ.LJLJI.get(LIZ.LJLILLLLZI.get("Shop"));
        if (!(view instanceof View)) {
            return null;
        }
        return view;
    }

    public final void LIZ() {
        View view;
        View LIZJ = LIZJ();
        if (LIZJ != null) {
            view = LIZJ.findViewById(R.id.mmd);
        } else {
            view = null;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        TuxTextView LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.setVisibility(8);
        }
        this.LIZIZ = 0;
    }

    public final TuxTextView LIZIZ() {
        View LIZJ = LIZJ();
        if (LIZJ != null) {
            return (TuxTextView) LIZJ.findViewById(R.id.mme);
        }
        return null;
    }

    public LQ6(Context context) {
        this.LIZ = context;
    }
}
