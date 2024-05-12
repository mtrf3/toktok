package X;

import Y.ACallableS106S0100000_3;
import Y.ACallableS81S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7G8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7G8 extends FrameLayout implements S1F {
    public final C7G1 LJLIL;
    public InterfaceC72642tA<C50420Jqa> LJLILLLLZI;
    public boolean LJLJI;
    public Drawable LJLJJI;
    public C8IM LJLJJL;
    public C7G9 LJLJJLL;
    public boolean LJLJL;
    public final HashMap<Integer, View> LJLJLJ;
    public InterfaceC65784Pro<C76800UCe> LJLJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7G8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // X.S1F
    public final View LJIIIZ() {
        return this;
    }

    @Override // X.S1F
    public final boolean LIZIZ() {
        if (this.LJLJJL == null) {
            return false;
        }
        rootView().setVisibility(8);
        C8IM c8im = this.LJLJJL;
        if (c8im == null) {
            return true;
        }
        c8im.setVisibility(0);
        return true;
    }

    @Override // X.S1F
    public final void LIZJ() {
        C10K.LIZIZ(new ACallableS106S0100000_3(this, 4), C10K.LJIIIIZZ, null);
        this.LJLJJL = null;
    }

    public final void LJIILL() {
        if (this.LJLJI) {
            return;
        }
        View view = this.LJLJLJ.get(Integer.valueOf(R.layout.aa0));
        this.LJLJLJ.clear();
        if (C78596Usy.LJJIJL(C7GC.LJLIL, DPB.LIZJ()) && view != null) {
            addView(view);
        } else {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            o.LJI(LJIJJ);
            C16970lZ.LIZJ(R.layout.aa0, LJIJJ, this, true);
        }
        this.LJLJI = true;
        C7GV.LIZ(4, rootView());
    }

    public final void LJIILLIIL() {
        if (!this.LJLJI) {
            return;
        }
        setVisibility(8);
        TextView LJIIIIZZ = LJIIIIZZ();
        LJIIIIZZ.setText("");
        ViewGroup.LayoutParams layoutParams = LJIIIIZZ.getLayoutParams();
        layoutParams.width = -2;
        LJIIIIZZ.setLayoutParams(layoutParams);
        LJIILJJIL().setVisibility(8);
        TextView LJI = LJI();
        LJI.setVisibility(8);
        LJI.setText("");
        ViewGroup.LayoutParams layoutParams2 = LJI.getLayoutParams();
        layoutParams2.width = -2;
        LJI.setLayoutParams(layoutParams2);
        LJ().setVisibility(8);
        LJIILIIL().setVisibility(8);
        LJII().setImageResource(R.color.cz);
        View findViewById = findViewById(R.id.a4_);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.anchor_tag_second_icon)");
        ((W5G) findViewById).setImageResource(R.color.cz);
        View findViewById2 = findViewById(R.id.a4_);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.anchor_tag_second_icon)");
        ((ImageView) findViewById2).setVisibility(8);
    }

    public final List<AnchorCommonStruct> getShownAnchors() {
        return this.LJLIL.h4();
    }

    @Override // X.S1F
    public final View LIZLLL() {
        View findViewById = findViewById(R.id.ftv);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.list_button)");
        return findViewById;
    }

    @Override // X.S1F
    public final View LJ() {
        View findViewById = findViewById(R.id.a4p);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.anchor_title_divider)");
        return findViewById;
    }

    @Override // X.S1F
    public final TextView LJI() {
        LJIILL();
        View findViewById = findViewById(R.id.a4a);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.anchor_tag_subtitle)");
        return (TextView) findViewById;
    }

    @Override // X.S1F
    public final SmartImageView LJII() {
        View findViewById = findViewById(R.id.a47);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.anchor_tag_icon)");
        return (SmartImageView) findViewById;
    }

    @Override // X.S1F
    public final TextView LJIIIIZZ() {
        LJIILL();
        View findViewById = findViewById(R.id.a4c);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.anchor_tag_title)");
        return (TextView) findViewById;
    }

    @Override // X.S1F
    public final TextView LJIIJJI() {
        View findViewById = findViewById(R.id.a4r);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.anchor_title_point_divider)");
        return (TextView) findViewById;
    }

    @Override // X.S1F
    public final View LJIIL() {
        View findViewById = findViewById(R.id.a24);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.anchor_divider)");
        return findViewById;
    }

    @Override // X.S1F
    public final TuxIconView LJIILIIL() {
        View findViewById = findViewById(R.id.a48);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.anchor_tag_icon_more)");
        return (TuxIconView) findViewById;
    }

    @Override // X.S1F
    public final TextView LJIILJJIL() {
        View findViewById = findViewById(R.id.a4d);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.anchor_tag_title_suffix)");
        return (TextView) findViewById;
    }

    @Override // X.S1F
    public final View rootView() {
        View findViewById = findViewById(R.id.a49);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.anchor_tag_root)");
        return findViewById;
    }

    @Override // X.S1F
    public final C7G7 LJIIJ() {
        return C7G7.FEED_MULTI_TAG_LAYOUT;
    }

    @Override // X.S1F
    public final boolean LIZ(C188727au c188727au) {
        C8IM c8im;
        C8IM c8im2 = this.LJLJJL;
        if (c8im2 != null && c8im2.getParent() != null && (c8im = this.LJLJJL) != null) {
            return c8im.LJII(c188727au);
        }
        return false;
    }

    @Override // X.S1F
    public final void LJFF(C8IM c8im) {
        this.LJLJJL = c8im;
        C10K.LIZIZ(new ACallableS81S0200000_3(this, c8im, 6), C10K.LJIIIIZZ, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null || valueOf.intValue() != 1 || (interfaceC65784Pro = this.LJLJLLL) == null) {
            return false;
        }
        interfaceC65784Pro.invoke();
        return false;
    }

    public final void setCommodityCard(C7G9 c7g9) {
        this.LJLJJLL = c7g9;
    }

    @Override // X.S1F
    public void setInteceptorTouchAction(InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
        this.LJLJLLL = action;
    }

    public final void setOnInternalEventListener(InterfaceC72642tA<C50420Jqa> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI = listener;
    }

    public final void setRootBackgroundDrawable(Drawable drawable) {
        this.LJLJJI = drawable;
        LJIILL();
        findViewById(R.id.a49).setBackground(this.LJLJJI);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7G8(android.content.Context r3, android.util.AttributeSet r4, int r5) {
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
            java.lang.Class<X.7G1> r1 = X.C7G1.class
            com.ss.android.ugc.aweme.feed.service.IFeedComponentService r0 = X.C47261Igj.LJIL()
            X.S1D r1 = r0.LIZLLL(r1)
            java.lang.String r0 = "getAnchorHandler(IMultiTagHandler::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.LJLIL = r1
            java.util.HashMap r1 = new java.util.HashMap
            r0 = 1
            r1.<init>(r0)
            r2.LJLJLJ = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7G8.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
