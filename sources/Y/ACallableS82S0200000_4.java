package Y;

import X.C03880Dg;
import X.C116414hZ;
import X.C16880lQ;
import X.C244459ib;
import X.C250839st;
import X.C250859sv;
import X.C26383AXb;
import X.C65300Pk0;
import X.C76800UCe;
import X.C79045V0n;
import X.ST7;
import X.ST9;
import X.STC;
import X.STD;
import X.ViewOnClickListenerC26389AXh;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ACallableS82S0200000_4 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS82S0200000_4 aCallableS82S0200000_4) {
        ViewGroup.LayoutParams layoutParams;
        MusProfileEditFragment musProfileEditFragment = (MusProfileEditFragment) aCallableS82S0200000_4.l0;
        C244459ib c244459ib = (C244459ib) aCallableS82S0200000_4.l1;
        if (!musProfileEditFragment.Rl()) {
            View view = musProfileEditFragment.LLIIZ;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, R.id.zu);
            View view2 = musProfileEditFragment.LLIIZ;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
        }
        musProfileEditFragment.Ym().setVisibility(0);
        C116414hZ c116414hZ = (C116414hZ) musProfileEditFragment.Ym().findViewById(R.id.k_h);
        TuxIconView icon = (TuxIconView) musProfileEditFragment.Ym().findViewById(R.id.e_q);
        TextView textView = (TextView) musProfileEditFragment.Ym().findViewById(R.id.text);
        ST9 st9 = c244459ib.LIZ;
        int i = c244459ib.LIZIZ;
        int i2 = STC.LIZ[st9.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            o.LJIIIIZZ(icon, "icon");
                            musProfileEditFragment.Zm(icon);
                            c116414hZ.setVisibility(4);
                            icon.setVisibility(0);
                            ST7.LIZIZ(icon, R.raw.icon_hourglass, Integer.valueOf(R.attr.gx));
                            textView.setText(textView.getResources().getString(R.string.cw, Integer.valueOf(c244459ib.LIZLLL)));
                        }
                    } else {
                        o.LJIIIIZZ(icon, "icon");
                        musProfileEditFragment.Zm(icon);
                        c116414hZ.setVisibility(4);
                        icon.setVisibility(0);
                        ST7.LIZIZ(icon, R.raw.icon_color_ai, null);
                        icon.setIconRes(R.raw.icon_color_ai);
                        textView.setText(R.string.cm);
                    }
                } else {
                    c116414hZ.setVisibility(4);
                    icon.setVisibility(0);
                    ST7.LIZIZ(icon, R.raw.icon_exclamation_mark_circle, Integer.valueOf(R.attr.e7));
                    textView.setText(R.string.co);
                }
            } else {
                c116414hZ.setVisibility(4);
                icon.setVisibility(0);
                ST7.LIZIZ(icon, R.raw.icon_tick_fill, Integer.valueOf(R.attr.e8));
                ViewGroup.LayoutParams layoutParams3 = icon.getLayoutParams();
                layoutParams3.height = musProfileEditFragment.getResources().getDimensionPixelOffset(R.dimen.a8l);
                layoutParams3.width = musProfileEditFragment.getResources().getDimensionPixelOffset(R.dimen.a8m);
                icon.setLayoutParams(layoutParams3);
                textView.setText(R.string.cl);
            }
        } else {
            c116414hZ.setVisibility(0);
            icon.setVisibility(4);
            Context context = c116414hZ.getContext();
            o.LJIIIIZZ(context, "spinner.context");
            Integer LJI = C79045V0n.LJI(R.attr.bx, context);
            if (LJI != null) {
                c116414hZ.LIZ(R.raw.icon_spinner_normal, LJI.intValue());
            }
            textView.setText(musProfileEditFragment.getResources().getString(R.string.cn, Integer.valueOf(i)));
        }
        if (!((HashSet) musProfileEditFragment.LLLF).contains(st9.name())) {
            ((HashSet) musProfileEditFragment.LLLF).add(st9.name());
            STD.LJFF("show", st9, Integer.valueOf(((HashSet) musProfileEditFragment.LLLF).size()));
        }
        C16880lQ.LJIIJ(new ACListenerS30S0300000_4(st9, musProfileEditFragment, c244459ib, 7), musProfileEditFragment.Ym());
        return null;
    }

    public static final Object call$1(ACallableS82S0200000_4 aCallableS82S0200000_4) {
        ViewOnClickListenerC26389AXh viewOnClickListenerC26389AXh;
        ((C26383AXb) aCallableS82S0200000_4.l0).LIZLLL = new ViewOnClickListenerC26389AXh((Context) aCallableS82S0200000_4.l1, ((C26383AXb) aCallableS82S0200000_4.l0).LIZJ);
        C26383AXb c26383AXb = (C26383AXb) aCallableS82S0200000_4.l0;
        ViewOnClickListenerC26389AXh viewOnClickListenerC26389AXh2 = c26383AXb.LIZLLL;
        if (viewOnClickListenerC26389AXh2 != null) {
            viewOnClickListenerC26389AXh2.setOnDismissListener(new IDDListenerS144S0100000_4(c26383AXb, 11));
        }
        ViewOnClickListenerC26389AXh viewOnClickListenerC26389AXh3 = ((C26383AXb) aCallableS82S0200000_4.l0).LIZLLL;
        if (viewOnClickListenerC26389AXh3 != null && !viewOnClickListenerC26389AXh3.isShowing() && (viewOnClickListenerC26389AXh = ((C26383AXb) aCallableS82S0200000_4.l0).LIZLLL) != null && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/contentlanguage/ContentLanguageGuideDialog", "show", viewOnClickListenerC26389AXh, new Object[0], "void", new C65300Pk0(false, "()V", "-6715636668185207747")).LIZ) {
            viewOnClickListenerC26389AXh.show();
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS82S0200000_4 aCallableS82S0200000_4) {
        Object value = ((C250839st) aCallableS82S0200000_4.l0).LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-searchUserService>(...)");
        return ((ISearchUserService) value).LIZLLL((C250859sv) aCallableS82S0200000_4.l1);
    }

    public ACallableS82S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
