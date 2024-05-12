package X;

import Y.ARunnableS28S0200000_9;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LFv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53963LFv implements LDY {
    public final /* synthetic */ C68322mC<View> LJLIL;
    public final /* synthetic */ TextView LJLILLLLZI;
    public final /* synthetic */ C53957LFp LJLJI;

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        Integer num;
        SY9 sy9;
        o.LJIIIZ(to, "to");
        if (o.LJ(to, "FRIENDS_FEED")) {
            if (!C53219Kud.LIZ) {
                TextView textView = this.LJLILLLLZI;
                if (textView != null) {
                    Context context = textView.getContext();
                    Drawable[] compoundDrawables = this.LJLILLLLZI.getCompoundDrawables();
                    o.LJIIIIZZ(compoundDrawables, "tabTextView.compoundDrawables");
                    Object LJJJJI = ORY.LJJJJI(2, compoundDrawables);
                    if ((LJJJJI instanceof SY9) && (sy9 = (SY9) LJJJJI) != null) {
                        num = sy9.LJIILJJIL;
                    } else {
                        num = null;
                    }
                    o.LJIIIIZZ(context, "context");
                    if (!o.LJ(num, C79045V0n.LJI(R.attr.dj, context))) {
                        TextView textView2 = this.LJLILLLLZI;
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_info_circle;
                        c2068389v.LIZIZ = C7MY.LIZIZ(14);
                        c2068389v.LIZJ = C7MY.LIZIZ(14);
                        c2068389v.LIZLLL = C79045V0n.LJI(R.attr.dj, context);
                        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, c2068389v.LIZ(context), (Drawable) null);
                        this.LJLILLLLZI.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
                        C1DH.LJJIJIIJIL(10L, new ARunnableS28S0200000_9(context, this.LJLJI, 51));
                    }
                }
                View view = this.LJLIL.element;
                if (view != null) {
                    C16880lQ.LJIIJ(ViewOnClickListenerC53964LFw.LJLIL, view);
                    return;
                }
                return;
            }
            return;
        }
        View view2 = this.LJLIL.element;
        if (view2 != null) {
            C16880lQ.LJIIJ(null, view2);
        }
        TextView textView3 = this.LJLILLLLZI;
        if (textView3 == null) {
            return;
        }
        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public C53963LFv(C68322mC<View> c68322mC, TextView textView, C53957LFp c53957LFp) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = textView;
        this.LJLJI = c53957LFp;
    }
}
