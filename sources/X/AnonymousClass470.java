package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.470, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass470 {
    public final View LIZ;
    public View.OnClickListener LIZIZ;
    public final List<View.OnTouchListener> LIZJ = new ArrayList();

    public AnonymousClass470(View view) {
        this.LIZ = view;
    }

    public final void LIZ(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            C34B.LJIIIIZZ("ContentViewContainer", "ContentViewContainer setOnClick is null");
        }
        this.LIZIZ = onClickListener;
    }

    public final void LIZIZ(int i, Object obj) {
        this.LIZ.setTag(i, obj);
    }
}
