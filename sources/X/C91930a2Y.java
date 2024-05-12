package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a2Y, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91930a2Y {
    public static final void LIZ(C252709vu c252709vu, Context context, boolean z) {
        int i;
        Boolean bool;
        if (z) {
            if (context != null) {
                bool = Boolean.valueOf(AnonymousClass636.LJIILJJIL(context));
            } else {
                bool = null;
            }
            if (!o.LJ(bool, Boolean.TRUE)) {
                i = R.drawable.ko;
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(i);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(168)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))));
                ViewGroup viewGroup = (ViewGroup) c252709vu.findViewById(R.id.gwm);
                viewGroup.removeAllViews();
                viewGroup.addView(imageView);
            }
        }
        i = R.drawable.kn;
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(i);
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(168)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))));
        ViewGroup viewGroup2 = (ViewGroup) c252709vu.findViewById(R.id.gwm);
        viewGroup2.removeAllViews();
        viewGroup2.addView(imageView2);
    }

    public static final void LIZIZ(C73306Spq c73306Spq, String str, InterfaceC65784Pro interfaceC65784Pro) {
        String string;
        if (str == null || str.length() == 0) {
            string = EF7.LIZIZ().getString(R.string.f3f);
            o.LJIIIIZZ(string, "{\n        AppContextMana…_error_server_desc)\n    }");
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(". ");
            string = X1D.LIZIZ(LIZ);
        }
        String string2 = EF7.LIZIZ().getString(R.string.f3g);
        o.LJIIIIZZ(string2, "AppContextManager.getApp….ec_pdp_error_server_tle)");
        c73306Spq.LJFF = string2;
        c73306Spq.LIZIZ(string);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_error_robot;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        c73306Spq.LJII = new IDqS418S0100000_31(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 80);
        c73306Spq.LJIIJ = C217288fs.LIZ;
    }
}
