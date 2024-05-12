package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.notice.api.ab.GuideOutPushExperiment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110584Vq extends FrameLayout implements GenericLifecycleObserver, C3WY {
    public static final /* synthetic */ int LJLJL = 0;
    public final /* synthetic */ C3WQ LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final boolean LJLJJI;
    public boolean LJLJJL;
    public ViewGroup LJLJJLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C110584Vq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void LIZIZ() {
        this.LJLIL.LIZ();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLIL.LLIIJLIL(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLIL.LLJILLL(c3wr);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    private final int getLayoutRes() {
        if (this.LJLJJI) {
            return R.layout.b0q;
        }
        return R.layout.b14;
    }

    private final C101353yN getMatchedFriendsBanner() {
        return (C101353yN) this.LJLILLLLZI.getValue();
    }

    private final View getSayHelloPanel() {
        return (View) this.LJLJI.getValue();
    }

    public static void LIZ(C110584Vq c110584Vq) {
        c110584Vq.getClass();
        C55888Lwa c55888Lwa = C55888Lwa.LIZIZ;
        Context context = c110584Vq.getContext();
        o.LJIIIIZZ(context, "context");
        c55888Lwa.LIZ.LJJIFFI(context);
        ViewGroup viewGroup = c110584Vq.LJLJJLL;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        c110584Vq.LIZIZ();
    }

    public static void LIZJ(C110584Vq container) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ColorStateList colorStateList;
        int i;
        String str;
        container.getClass();
        o.LJIIIZ(container, "container");
        C101353yN matchedFriendsBanner = container.getMatchedFriendsBanner();
        if (matchedFriendsBanner != null) {
            matchedFriendsBanner.setVisibility(8);
        }
        View sayHelloPanel = container.getSayHelloPanel();
        if (sayHelloPanel != null) {
            sayHelloPanel.setVisibility(8);
        }
        container.LJLJJLL = container;
        if (container.getVisibility() == 0) {
            return;
        }
        container.removeAllViews();
        C16880lQ.LLLZIIL(container.getLayoutRes(), C16880lQ.LLZIL(container.getContext()), container);
        TuxIconView tuxIconView = (TuxIconView) container.findViewById(R.id.ee2);
        TextView textView = (TextView) container.findViewById(R.id.lgh);
        SY4 turnOnBtn = (SY4) container.findViewById(R.id.b20);
        SY4 cancelBtn = (SY4) container.findViewById(R.id.b1z);
        if (C99W.LIZ) {
            turnOnBtn.getClass();
            cancelBtn.getClass();
            cancelBtn.setButtonVariant(5);
        }
        ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            marginLayoutParams = new LinearLayout.LayoutParams(-1, -2);
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            marginLayoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            marginLayoutParams = null;
        }
        container.setBackground(C04270Et.LIZIZ(container.getContext(), R.drawable.a9c));
        int LJIILL = C17N.LJIILL(16.0d);
        container.setPadding(LJIILL, LJIILL, LJIILL, LJIILL);
        if (marginLayoutParams != null) {
            Context context = container.getContext();
            o.LJIIIIZZ(context, "context");
            C26338AVi.LJII(marginLayoutParams, context, Integer.valueOf(C17N.LJIILL(12.0d)), null, Integer.valueOf(C17N.LJIILL(12.0d)), null, 52);
        }
        o.LJIIIIZZ(turnOnBtn, "turnOnBtn");
        o.LJIIIIZZ(cancelBtn, "cancelBtn");
        turnOnBtn.getLayoutParams().height = C17N.LJIILL(32.0d);
        Drawable background = turnOnBtn.getBackground();
        o.LJII(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setCornerRadius(C17N.LJIILL(8.0d));
        cancelBtn.getLayoutParams().height = C17N.LJIILL(32.0d);
        Drawable background2 = cancelBtn.getBackground();
        o.LJII(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background2;
        gradientDrawable.setCornerRadius(C17N.LJIILL(8.0d));
        gradientDrawable.setStroke(0, 0);
        Context context2 = cancelBtn.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.cf, context2);
        if (LJI != null) {
            colorStateList = ColorStateList.valueOf(LJI.intValue());
        } else {
            colorStateList = null;
        }
        gradientDrawable.setColor(colorStateList);
        container.setLayoutParams(marginLayoutParams);
        ViewGroup viewGroup = container.LJLJJLL;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        SharedPreferences LIZLLL = C38776FJs.LJIIL().LIZLLL(container.getContext());
        if (LIZLLL == null) {
            i = 0;
        } else {
            i = LIZLLL.getInt("key_feature12_show_count", 0);
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        if (GuideOutPushExperiment.LIZIZ() && curUser.getFriendCount() > 0 && i % 2 == 1) {
            container.LJLJJL = true;
            if (textView != null) {
                textView.setText(container.getContext().getString(R.string.t6n));
            }
        } else if (((Boolean) GuideOutPushExperiment.LJIIIIZZ.getValue()).booleanValue()) {
            container.LJLJJL = false;
            if (textView != null) {
                textView.setText(container.getContext().getString(R.string.er6));
            }
        }
        turnOnBtn.setText(turnOnBtn.getContext().getString(R.string.er8));
        C16880lQ.LJJIZ(turnOnBtn, new ACListenerS36S0200000_1(turnOnBtn, container, 35));
        cancelBtn.setText(cancelBtn.getContext().getString(R.string.er7));
        C16880lQ.LJJIZ(cancelBtn, new ACListenerS21S0100000_1(container, 170));
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(container, 171));
        }
        C188727au LJIIIIZZ = JBR.LJIIIIZZ("enter_from", "notification_page", "trigger", "dm");
        LJIIIIZZ.LIZLLL(C38776FJs.LJIIL().LIZ(container.getContext(), "key_opt_dm_dialog_show", true) ? 1 : 0, "is_dm_first");
        if (container.LJLJJL) {
            str = "friends";
        } else {
            str = "normal";
        }
        LJIIIIZZ.LJI("pop_up_type", str);
        FMX.LJIIL("show_push_permission_pop_up", LJIIIIZZ.LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C110584Vq(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            X.3WQ r0 = new X.3WQ
            r0.<init>()
            r2.LJLIL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 149(0x95, float:2.09E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLILLLLZI = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 150(0x96, float:2.1E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJI = r0
            boolean r0 = X.C110594Vr.LIZ()
            r2.LJLJJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110584Vq.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
