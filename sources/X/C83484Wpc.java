package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83484Wpc {
    public final /* synthetic */ C46193IAz LIZ;

    public C83484Wpc(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    public final void LIZ(C83483Wpb c83483Wpb, boolean z) {
        String string = C78688UuS.LJJIII(this.LIZ).getResources().getString(R.string.exd);
        o.LJIIIIZZ(string, "context.resources.getString(R.string.done)");
        if (z) {
            if (c83483Wpb != null) {
                c83483Wpb.LJI.LJLJJLL = true;
            }
            T5R t5r = new T5R(string);
            t5r.LIZ(42);
            if (c83483Wpb != null) {
                View view = c83483Wpb.LJIILIIL;
                if (!(view instanceof TextView)) {
                    view = null;
                }
                TextView textView = (TextView) view;
                if (textView != null) {
                    textView.setText(t5r);
                }
            }
        } else if (c83483Wpb != null) {
            c83483Wpb.LJI.LJLJJLL = false;
            View view2 = c83483Wpb.LJIILIIL;
            if (!(view2 instanceof TextView)) {
                view2 = null;
            }
            TextView textView2 = (TextView) view2;
            if (textView2 != null) {
                textView2.setText(string);
            }
        }
        if (C58B.LIZ() && c83483Wpb != null) {
            View view3 = c83483Wpb.LJIILIIL;
            if (!(view3 instanceof TextView) || view3 == null) {
                return;
            }
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
            c110614Vt.LIZJ = C61328O5c.LIZJ(6);
            view3.setBackground(c110614Vt.LIZ(C78688UuS.LJJIII(this.LIZ)));
        }
    }
}
