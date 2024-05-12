package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.7G6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7G6 extends FrameLayout implements S1F {
    public final C7G1 LJLIL;
    public InterfaceC72642tA<C50420Jqa> LJLILLLLZI;
    public boolean LJLJI;
    public Drawable LJLJJI;

    @Override // X.S1F
    public final boolean LIZ(C188727au c188727au) {
        return false;
    }

    @Override // X.S1F
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.S1F
    public final void LIZJ() {
    }

    @Override // X.S1F
    public final void LJFF(C8IM c8im) {
    }

    @Override // X.S1F
    public final View LJIIIZ() {
        return this;
    }

    @Override // X.S1F
    public void setInteceptorTouchAction(InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
    }

    public final void LJIILL() {
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
        return C7G7.BUBBLE_MULTI_TAG_LAYOUT;
    }

    public final void setOnInternalEventListener(InterfaceC72642tA<C50420Jqa> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI = listener;
    }

    public final void setRootBackgroundDrawable(Drawable drawable) {
        this.LJLJJI = drawable;
        if (!this.LJLJI) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            C16970lZ.LIZJ(R.layout.p4, C45804HyK.LJIJJ(context), this, true);
            this.LJLJI = true;
        }
        findViewById(R.id.a49).setBackground(this.LJLJJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7G6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        S1D LIZLLL = C47261Igj.LJIL().LIZLLL(C7G1.class);
        o.LJIIIIZZ(LIZLLL, "getAnchorHandler(IMultiTagHandler::class.java)");
        this.LJLIL = LIZLLL;
    }
}
