package X;

import Y.AUListenerS93S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AKd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26047AKd extends AKV<C26046AKc> {
    public final View LJ;
    public View LJFF;

    @Override // X.AKV
    public final View LIZJ() {
        View view = this.LJFF;
        if (view != null) {
            return view;
        }
        o.LJIJI("root");
        throw null;
    }

    @Override // X.AKV
    public final void LIZ(boolean z) {
        if (!z) {
            View view = this.LJFF;
            if (view != null) {
                view.findViewById(R.id.lbl).setAlpha(1.0f);
                View view2 = this.LJFF;
                if (view2 != null) {
                    view2.findViewById(R.id.lbl).setScaleX(1.0f);
                    View view3 = this.LJFF;
                    if (view3 != null) {
                        view3.findViewById(R.id.lbl).setScaleY(1.0f);
                        return;
                    } else {
                        o.LJIJI("root");
                        throw null;
                    }
                }
                o.LJIJI("root");
                throw null;
            }
            o.LJIJI("root");
            throw null;
        }
    }

    @Override // X.AKV
    public final void LIZIZ(boolean z) {
        ValueAnimator ofFloat;
        float f;
        View view = this.LJFF;
        if (view != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.lbl);
            if (z) {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            }
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(new AUListenerS93S0100000_4(linearLayout, 4));
            ofFloat.start();
            float f2 = 1.0f;
            if (z) {
                f = 0.8f;
            } else {
                f = 1.0f;
                f2 = 0.8f;
            }
            C39661h4 LJIIL = C55953Lxd.LJIIL(linearLayout, C17T.LJIILJJIL, f2);
            LJIIL.LJI(f);
            LJIIL.LJIIIZ();
            C39661h4 LJIIL2 = C55953Lxd.LJIIL(linearLayout, C17T.LJIILL, f2);
            LJIIL2.LJI(f);
            LJIIL2.LJIIIZ();
            return;
        }
        o.LJIJI("root");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26047AKd(Context context, View view, C26046AKc toastBundle) {
        super(view, toastBundle);
        o.LJIIIZ(toastBundle, "toastBundle");
        this.LJ = view;
        setTouchable(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.p3, R.attr.p4, R.attr.tc, R.attr.td, R.attr.te}, R.attr.kv, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr… R.attr.TuxToastStyle, 0)");
        int color = obtainStyledAttributes.getColor(2, 0);
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        int i = obtainStyledAttributes.getInt(0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(4, R.layout._tux_toast_layout);
        obtainStyledAttributes.recycle();
        View LLLZIIL = C16880lQ.LLLZIIL(resourceId, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(layoutId, null)");
        this.LJFF = LLLZIIL;
        setContentView(LLLZIIL);
        View view2 = this.LJFF;
        if (view2 != null) {
            View findViewById = view2.findViewById(R.id.lbl);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = Integer.valueOf(color);
            c110614Vt.LIZJ = Float.valueOf(dimension);
            findViewById.setBackground(c110614Vt.LIZ(context));
            View view3 = this.LJFF;
            if (view3 != null) {
                C26338AVi.LJIIIZ(view3, null, Integer.valueOf(C63081OpJ.LJJJJLI(context)), null, null, 29);
                View view4 = this.LJFF;
                if (view4 != null) {
                    TuxTextView tuxTextView = (TuxTextView) view4.findViewById(R.id.ghd);
                    tuxTextView.setTuxFont(i);
                    tuxTextView.setTextColor(color2);
                    tuxTextView.setText(toastBundle.LJLIL.LIZIZ);
                    View view5 = this.LJFF;
                    if (view5 != null) {
                        TuxIconView tuxIconView = (TuxIconView) view5.findViewById(R.id.e_q);
                        Integer num = toastBundle.LJLIL.LIZJ;
                        if (num == null) {
                            tuxIconView.setVisibility(8);
                            View view6 = this.LJFF;
                            if (view6 != null) {
                                ((TextView) view6.findViewById(R.id.ghd)).setGravity(17);
                            } else {
                                o.LJIJI("root");
                                throw null;
                            }
                        } else {
                            tuxIconView.setIconRes(num.intValue());
                            tuxIconView.setVisibility(0);
                        }
                        Integer num2 = toastBundle.LJLIL.LIZLLL;
                        if (num2 != null) {
                            tuxIconView.setTintColor(num2.intValue());
                            return;
                        }
                        return;
                    }
                    o.LJIJI("root");
                    throw null;
                }
                o.LJIJI("root");
                throw null;
            }
            o.LJIJI("root");
            throw null;
        }
        o.LJIJI("root");
        throw null;
    }
}
