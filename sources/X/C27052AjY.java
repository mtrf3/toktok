package X;

import Y.IDAListenerS231S0100000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.AjY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27052AjY extends FrameLayout {
    public View LJLIL;
    public View LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public final Animation LJLJJI;
    public final Animation LJLJJL;
    public Animation LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View view;
        Object obj;
        View view2;
        View view3;
        View view4;
        super.onAttachedToWindow();
        Object parent = getParent();
        View view5 = null;
        if ((parent instanceof View) && (view4 = (View) parent) != null) {
            view = view4.findViewById(R.id.hd9);
        } else {
            view = null;
        }
        this.LJLIL = view;
        ViewParent parent2 = getParent();
        if (parent2 != null) {
            obj = parent2.getParent();
        } else {
            obj = null;
        }
        if ((obj instanceof View) && (view3 = (View) obj) != null) {
            view2 = view3.findViewById(R.id.l9z);
        } else {
            view2 = null;
        }
        if ((view2 instanceof View) && view2 != null) {
            view5 = view2.findViewById(R.id.hd_);
        }
        this.LJLILLLLZI = view5;
    }

    public final int LIZIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                return AnonymousClass636.LJIIIIZZ(R.attr.go, context);
            }
            if (num.intValue() == 2) {
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                return AnonymousClass636.LJIIIIZZ(R.attr.eb, context2);
            }
        }
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        return AnonymousClass636.LJIIIIZZ(R.attr.gu, context3);
    }

    public final void setBillSummaryData(C27042AjO summary) {
        String str;
        o.LJIIIZ(summary, "summary");
        if (((ViewGroup) LIZ(R.id.ktr)).getChildCount() > 0) {
            ((ViewGroup) LIZ(R.id.ktr)).removeAllViews();
        }
        for (C27051AjX c27051AjX : summary.LIZ) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            C27050AjW c27050AjW = new C27050AjW(context, null, 6);
            c27050AjW.setTitleText(c27051AjX.LIZ);
            c27050AjW.setDescText(c27051AjX.LIZIZ);
            c27050AjW.LIZIZ(false);
            c27050AjW.setTitleFont(41);
            c27050AjW.setTitleColor(LIZIZ(c27051AjX.LJI));
            c27050AjW.setDescFont(41);
            c27050AjW.setDescColor(LIZIZ(c27051AjX.LIZLLL));
            C62562cu c62562cu = c27051AjX.LJFF;
            if (c62562cu != null && (str = c27051AjX.LJ) != null) {
                c27050AjW.LIZJ(c62562cu, str);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = (int) KL2.LIZJ(getContext(), 15.0f);
            ((ViewGroup) LIZ(R.id.ktr)).addView(c27050AjW, layoutParams);
        }
    }

    public final void setCloseAction(InterfaceC65784Pro<C76800UCe> f) {
        o.LJIIIZ(f, "f");
        this.LJLJI = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27052AjY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJL = C62850Ola.LJFF(context, "context");
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.b9);
        this.LJLJJI = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.b8);
        this.LJLJJL = loadAnimation2;
        this.LJLJJLL = AnimationUtils.loadAnimation(context, R.anim.b7);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a_h, this, true);
        C252709vu c252709vu = (C252709vu) LIZ(R.id.hd4);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = context.getString(R.string.r_1);
        o.LJIIIIZZ(string, "context.getString(R.stri…op_order_page_headertext)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 1275));
        c235119Kp.LIZIZ(LIZJ);
        c252709vu.setNavActions(c235119Kp);
        ((C252709vu) LIZ(R.id.hd4)).LJIILJJIL(true);
        loadAnimation.setAnimationListener(new IDAListenerS231S0100000_4(this, 2));
        loadAnimation2.setAnimationListener(new IDAListenerS231S0100000_4(this, 3));
        setOnClickListener(new ViewOnClickListenerC13880ga(ViewOnClickListenerC27062Aji.LJLIL));
        setOutlineProvider(new C27056Ajc());
        setClipToOutline(true);
    }
}
