package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JmM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50158JmM {
    public final View LIZ;
    public C223338pd LIZIZ;

    public final void LIZ() {
        C223338pd c223338pd = this.LIZIZ;
        if (c223338pd != null && c223338pd.LJLJLJ) {
            c223338pd.LIZJ();
        }
    }

    public C50158JmM(View parentView) {
        o.LJIIIZ(parentView, "parentView");
        this.LIZ = parentView;
        this.LIZIZ = (C223338pd) parentView.findViewById(R.id.jem);
    }
}
