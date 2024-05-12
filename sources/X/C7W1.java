package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7W1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7W1 implements InterfaceC74147T8d {
    public final Context LIZ;
    public final LayoutInflater LIZIZ;
    public final int LIZJ;
    public View LIZLLL;
    public YAX LJ;

    @Override // X.InterfaceC74147T8d
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC74147T8d
    public final T6Y LIZ(ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        YAX yax = new YAX(this.LIZ, viewGroup, false);
        this.LJ = yax;
        return yax;
    }

    @Override // X.InterfaceC74147T8d
    public final void LIZIZ(RelativeLayout rootView) {
        TextView textView;
        o.LJIIIZ(rootView, "rootView");
        View LLLLIILL = C16880lQ.LLLLIILL(this.LIZIZ, R.layout.biy, rootView, false);
        this.LIZLLL = LLLLIILL;
        if (LLLLIILL != null && (textView = (TextView) LLLLIILL.findViewById(R.id.kdj)) != null) {
            textView.setText(this.LIZ.getString(this.LIZJ));
        }
        LJ(this.LIZLLL);
        rootView.addView(this.LIZLLL);
    }

    @Override // X.InterfaceC74147T8d
    public final void LIZJ(RelativeLayout rootView) {
        o.LJIIIZ(rootView, "rootView");
        View view = this.LIZLLL;
        if (view != null) {
            C16880lQ.LJLLLLLL(view, rootView);
        }
    }

    public final void LJ(View view) {
        View view2;
        if (view != null) {
            view2 = view.findViewById(R.id.kdb);
        } else {
            view2 = null;
        }
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, this.LIZ);
        C89V c89v = new C89V(KL2.LIZJ(this.LIZ, 4.0f), BlurMaskFilter.Blur.NORMAL, KL2.LIZJ(this.LIZ, 2.0f), AnonymousClass636.LJIIIIZZ(R.attr.ei, this.LIZ));
        if (view2 == null) {
            return;
        }
        view2.setBackground(new C8BK(LJIIIIZZ, c89v));
    }

    public C7W1(Context context, LayoutInflater layoutInflater, int i) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = layoutInflater;
        this.LIZJ = i;
    }
}
