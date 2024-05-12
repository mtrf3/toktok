package X;

import android.content.Context;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S34 implements S3E {
    public final S3B LIZ;

    public S34(S3B style) {
        o.LJIIIZ(style, "style");
        this.LIZ = style;
    }

    @Override // X.S3E
    public final void LJI(ViewGroup view) {
        o.LJIIIZ(view, "view");
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d7);
        c110614Vt.LIZJ = Float.valueOf(this.LIZ.LIZ());
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        view.setBackground(c110614Vt.LIZ(context));
    }
}
