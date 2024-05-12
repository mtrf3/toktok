package X;

import Y.ACListenerS38S0300000_13;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TtF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76065TtF extends AbstractC76213Tvd<C76060TtA> {
    public final C5H3 LJLIL;
    public final /* synthetic */ C76062TtC LJLILLLLZI;

    @Override // X.AbstractC76213Tvd
    public final void LJJJJIZL() {
        View view = (View) this.LJLIL.getValue();
        if (view != null) {
            C16880lQ.LJIIJ(null, view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76065TtF(C76062TtC c76062TtC, View view) {
        super(view);
        this.LJLILLLLZI = c76062TtC;
        this.LJLIL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS163S0100000_13(view, 31));
        Resources resources = view.getResources();
        TextView textView = (TextView) view.findViewById(R.id.mfz);
        if (textView != null) {
            String string = resources.getString(R.string.t0a);
            o.LJIIIIZZ(string, "resource.getString(R.str…om_linkmic_guidance_desc)");
            C67981Qm9.LIZIZ(new Object[]{resources.getString(R.string.kh3)}, 1, string, "format(format, *args)", textView);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.mg0);
        if (textView2 != null) {
            String string2 = resources.getString(R.string.t0a);
            o.LJIIIIZZ(string2, "resource.getString(R.str…om_linkmic_guidance_desc)");
            C67981Qm9.LIZIZ(new Object[]{resources.getString(R.string.kh4)}, 1, string2, "format(format, *args)", textView2);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.mg1);
        if (textView3 == null) {
            return;
        }
        String string3 = resources.getString(R.string.t0a);
        o.LJIIIIZZ(string3, "resource.getString(R.str…om_linkmic_guidance_desc)");
        C67981Qm9.LIZIZ(new Object[]{resources.getString(R.string.kh5)}, 1, string3, "format(format, *args)", textView3);
    }

    @Override // X.AbstractC76213Tvd
    public final void L(int i, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        C76060TtA data = (C76060TtA) obj;
        o.LJIIIZ(data, "data");
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (i == 0) {
                i2 = 8;
            } else {
                i2 = 16;
            }
            marginLayoutParams.topMargin = C87277YNd.LJIIJJI(i2);
        }
        View view = (View) this.LJLIL.getValue();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS38S0300000_13(this.LJLILLLLZI, data, this, 0), view);
        }
    }
}
