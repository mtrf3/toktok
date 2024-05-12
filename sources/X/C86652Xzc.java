package X;

import Y.ACListenerS35S0100000_15;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Xzc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86652Xzc extends FrameLayout {
    public static final int LJLJLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(406));
    public static final int LJLL = (int) KL2.LIZJ(EF7.LIZIZ(), 32.0f);
    public static final int LJLLI = (int) KL2.LIZJ(EF7.LIZIZ(), 56.0f);
    public static final int LJLLILLLL;
    public static final int LJLLJ;
    public static final int LJLLL;
    public static final int LJLLLL;
    public static final int LJLLLLLL;
    public InterfaceC86653Xzd LJLIL;
    public final TuxTextView LJLILLLLZI;
    public ValueAnimator LJLJI;
    public ObjectAnimator LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final java.util.Map<Integer, View> LJLJLJ;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJLJ;
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

    static {
        int LIZJ;
        if (C8PQ.LIZ()) {
            LIZJ = C7MY.LIZIZ(12);
        } else {
            LIZJ = (int) KL2.LIZJ(EF7.LIZIZ(), 16.0f);
        }
        LJLLILLLL = LIZJ;
        int LIZJ2 = (int) KL2.LIZJ(EF7.LIZIZ(), 56.0f);
        LJLLJ = (int) KL2.LIZJ(EF7.LIZIZ(), 72.0f);
        int LIZJ3 = (int) KL2.LIZJ(EF7.LIZIZ(), 16.0f);
        LJLLL = LIZJ3;
        LJLLLL = C63081OpJ.LJJJJLI(EF7.LIZIZ()) + ((int) KL2.LIZJ(EF7.LIZIZ(), 58.0f));
        LJLLLLLL = Math.min((int) KL2.LIZJ(EF7.LIZIZ(), 320.0f), (C60996Nwm.LJII() - LIZJ3) - LIZJ2);
    }

    public final LinearLayout getToolTipTarget() {
        return (LinearLayout) LIZ(R.id.b5f);
    }

    public final InterfaceC86653Xzd getDelegate() {
        return this.LJLIL;
    }

    public final void setDelegate(InterfaceC86653Xzd interfaceC86653Xzd) {
        this.LJLIL = interfaceC86653Xzd;
    }

    public final void setIsLoading(boolean z) {
        this.LJLJL = z;
    }

    public final void setStyle(EnumC86698Y0w style) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        o.LJIIIZ(style, "style");
        if (LIZ(R.id.b5d) != null && LIZ(R.id.bgr) != null) {
            C7GV.LIZ(2, LIZ(R.id.b5f));
            C7GV.LIZ(2, LIZ(R.id.bgr));
            int i = C86676Y0a.LIZ[style.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    TuxTextView tuxTextView = (TuxTextView) LIZ(R.id.b5d);
                    if (tuxTextView != null) {
                        tuxTextView.setTuxFont(52);
                        tuxTextView.setPaddingRelative((int) KL2.LIZJ(tuxTextView.getContext(), 8.0f), (int) KL2.LIZJ(tuxTextView.getContext(), 8.0f), (int) KL2.LIZJ(tuxTextView.getContext(), 28.0f), (int) KL2.LIZJ(tuxTextView.getContext(), 8.0f));
                    }
                    ViewGroup.LayoutParams layoutParams3 = LIZ(R.id.bgr).getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.width = (int) KL2.LIZJ(EF7.LIZIZ(), 32.0f);
                    }
                    ViewGroup.LayoutParams layoutParams4 = LIZ(R.id.bgr).getLayoutParams();
                    if (layoutParams4 == null) {
                        return;
                    }
                    layoutParams4.height = (int) KL2.LIZJ(EF7.LIZIZ(), 32.0f);
                    return;
                }
                TuxTextView tuxTextView2 = (TuxTextView) LIZ(R.id.b5d);
                if (tuxTextView2 != null) {
                    tuxTextView2.setTuxFont(52);
                }
                View LIZ = LIZ(R.id.b5e);
                if (LIZ != null) {
                    float f = 6.0f;
                    int LIZJ = (int) KL2.LIZJ(LIZ.getContext(), 6.0f);
                    int LIZJ2 = (int) KL2.LIZJ(LIZ.getContext(), 4.0f);
                    Context context = LIZ.getContext();
                    if (true ^ C86R.LIZ()) {
                        f = 24.0f;
                    }
                    LIZ.setPaddingRelative(LIZJ, LIZJ2, (int) KL2.LIZJ(context, f), (int) KL2.LIZJ(LIZ.getContext(), 4.0f));
                }
                View LIZ2 = LIZ(R.id.bgr);
                if (LIZ2 != null && (layoutParams2 = LIZ2.getLayoutParams()) != null) {
                    layoutParams2.width = (int) KL2.LIZJ(EF7.LIZIZ(), 28.0f);
                }
                View LIZ3 = LIZ(R.id.bgr);
                if (LIZ3 == null || (layoutParams = LIZ3.getLayoutParams()) == null) {
                    return;
                }
                layoutParams.height = (int) KL2.LIZJ(EF7.LIZIZ(), 28.0f);
                return;
            }
            TuxTextView tuxTextView3 = (TuxTextView) LIZ(R.id.b5d);
            tuxTextView3.setTuxFont(52);
            tuxTextView3.setMaxWidth(LJLJLLL);
            tuxTextView3.setPaddingRelative(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)), C7MY.LIZIZ(4), C7MY.LIZIZ(24), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            tuxTextView3.setGravity(17);
            ImageView imageView = (ImageView) tuxTextView3.findViewById(R.id.bgr);
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public final void setText(String str) {
        System.out.print((Object) a1.LJ("Testing :: captionText: ", str, " \n"));
        ((TextView) LIZ(R.id.b5d)).setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86652Xzc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout linearLayout;
        this.LJLJLJ = C62850Ola.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.va, this);
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.bgr), new ACListenerS35S0100000_15(this, 188));
        if (C52280KfU.LIZ() && (linearLayout = (LinearLayout) LIZ(R.id.e1t)) != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS35S0100000_15(this, 189));
        }
        this.LJLILLLLZI = (TuxTextView) findViewById(R.id.b4v);
        if (C52247Kex.LIZ()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = C60996Nwm.LJII();
            setLayoutParams(layoutParams);
        }
        TuxIconView tuxIconView = (TuxIconView) LIZ(R.id.bgr);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_closed_caption;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LIZIZ = C7MY.LIZIZ(23);
        c2068389v.LIZJ = C7MY.LIZIZ(23);
        tuxIconView.setTuxIcon(c2068389v);
    }

    public final void LIZIZ(boolean z, boolean z2, boolean z3, boolean z4) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        FrameLayout.LayoutParams layoutParams5;
        FrameLayout.LayoutParams layoutParams6;
        FrameLayout.LayoutParams layoutParams7;
        LinearLayout.LayoutParams layoutParams8;
        FrameLayout.LayoutParams layoutParams9;
        LinearLayout.LayoutParams layoutParams10;
        FrameLayout.LayoutParams layoutParams11;
        if (z) {
            ViewGroup.LayoutParams layoutParams12 = null;
            if (C79004UzY.LJJIJIIJI(getContext())) {
                ViewGroup.LayoutParams layoutParams13 = LIZ(R.id.b5b).getLayoutParams();
                if ((layoutParams13 instanceof FrameLayout.LayoutParams) && (layoutParams9 = (FrameLayout.LayoutParams) layoutParams13) != null) {
                    layoutParams9.gravity = 81;
                    layoutParams9.setMarginEnd(0);
                    layoutParams9.setMarginStart(0);
                    ((LinearLayout) LIZ(R.id.b5e)).setGravity(17);
                    ViewGroup.LayoutParams layoutParams14 = LIZ(R.id.bgr).getLayoutParams();
                    if ((layoutParams14 instanceof FrameLayout.LayoutParams) && (layoutParams11 = (FrameLayout.LayoutParams) layoutParams14) != null) {
                        layoutParams11.gravity = 81;
                    }
                    ViewGroup.LayoutParams layoutParams15 = LIZ(R.id.b5f).getLayoutParams();
                    if ((layoutParams15 instanceof LinearLayout.LayoutParams) && (layoutParams10 = (LinearLayout.LayoutParams) layoutParams15) != null) {
                        layoutParams10.gravity = 81;
                    }
                    LIZ(R.id.b5b).setLayoutParams(layoutParams9);
                }
            } else if (z2) {
                ViewGroup.LayoutParams layoutParams16 = LIZ(R.id.b5b).getLayoutParams();
                if ((layoutParams16 instanceof FrameLayout.LayoutParams) && (layoutParams5 = (FrameLayout.LayoutParams) layoutParams16) != null) {
                    layoutParams5.gravity = 8388659;
                    layoutParams5.topMargin = LJLLLL;
                    ViewGroup.LayoutParams layoutParams17 = LIZ(R.id.b5f).getLayoutParams();
                    if ((layoutParams17 instanceof LinearLayout.LayoutParams) && (layoutParams8 = (LinearLayout.LayoutParams) layoutParams17) != null) {
                        layoutParams8.gravity = 8388659;
                    }
                    ViewGroup.LayoutParams layoutParams18 = LIZ(R.id.bgr).getLayoutParams();
                    if ((layoutParams18 instanceof FrameLayout.LayoutParams) && (layoutParams7 = (FrameLayout.LayoutParams) layoutParams18) != null) {
                        layoutParams7.gravity = 8388659;
                    }
                    if (C52280KfU.LIZ()) {
                        View LIZ = LIZ(R.id.e1t);
                        if (LIZ != null) {
                            layoutParams12 = LIZ.getLayoutParams();
                        }
                        if ((layoutParams12 instanceof FrameLayout.LayoutParams) && (layoutParams6 = (FrameLayout.LayoutParams) layoutParams12) != null) {
                            layoutParams6.gravity = 8388659;
                        }
                    }
                    LIZ(R.id.b5b).setLayoutParams(layoutParams5);
                }
            } else {
                ViewGroup.LayoutParams layoutParams19 = LIZ(R.id.b5b).getLayoutParams();
                if ((layoutParams19 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams19) != null) {
                    if (C52247Kex.LIZ() && (z3 || z4)) {
                        int i2 = LJLLI;
                        layoutParams.setMarginStart(i2);
                        layoutParams.setMarginEnd(i2);
                        ((LinearLayout) LIZ(R.id.b5e)).setGravity(17);
                        i = 1;
                    } else {
                        layoutParams.setMarginStart(LJLLILLLL);
                        layoutParams.setMarginEnd(LJLLJ);
                        ((LinearLayout) LIZ(R.id.b5e)).setGravity(8388611);
                        i = 8388611;
                    }
                    C52247Kex.LIZ();
                    int i3 = i | 80;
                    layoutParams.gravity = i3;
                    ViewGroup.LayoutParams layoutParams20 = LIZ(R.id.b5f).getLayoutParams();
                    if ((layoutParams20 instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams20) != null) {
                        layoutParams4.gravity = i3;
                    }
                    ViewGroup.LayoutParams layoutParams21 = LIZ(R.id.bgr).getLayoutParams();
                    if ((layoutParams21 instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams21) != null) {
                        layoutParams3.gravity = i3;
                    }
                    if (C52280KfU.LIZ()) {
                        View LIZ2 = LIZ(R.id.e1t);
                        if (LIZ2 != null) {
                            layoutParams12 = LIZ2.getLayoutParams();
                        }
                        if ((layoutParams12 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams12) != null) {
                            layoutParams2.gravity = i3;
                        }
                    }
                    LIZ(R.id.b5b).setLayoutParams(layoutParams);
                }
            }
            LIZ(R.id.b5f).setVisibility(0);
            return;
        }
        LIZ(R.id.b5f).setVisibility(8);
        ((ImageView) LIZ(R.id.bgr)).setVisibility(8);
    }

    public final void LIZJ(EnumC86689Y0n state, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(state, "state");
        int i = 0;
        int i2 = 8;
        if (L2D.LIZ() && this.LJLJL && state != EnumC86689Y0n.HIDDEN) {
            C16880lQ.LJIIZILJ((LinearLayout) LIZ(R.id.b5f), null);
            LIZ(R.id.b5f).setClickable(false);
            LIZIZ(true, z3, z, z2);
            LIZ(R.id.b5f).setAlpha(1.0f);
            LIZ(R.id.b5f).setScaleX(1.0f);
            LIZ(R.id.b5f).setScaleY(1.0f);
            ((ImageView) LIZ(R.id.bgr)).setVisibility(8);
            LIZ(R.id.b5e).setVisibility(0);
            LIZ(R.id.b5d).setVisibility(0);
            setText(getContext().getString(R.string.qfw));
            ((TuxTextView) LIZ(R.id.b5d)).setTextColorRes(R.attr.dm);
            TuxTextView tuxTextView = this.LJLILLLLZI;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            ((ImageView) LIZ(R.id.lk7)).setVisibility(8);
            return;
        }
        int i3 = C86676Y0a.LIZJ[state.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                ((TuxTextView) LIZ(R.id.b5d)).setTextColorRes(R.attr.dj);
                if (this.LJLJJL) {
                    C16880lQ.LJIIZILJ((LinearLayout) LIZ(R.id.b5f), new ACListenerS35S0100000_15(this, 88));
                    LIZ(R.id.b5f).setClickable(true);
                } else {
                    C16880lQ.LJIIZILJ((LinearLayout) LIZ(R.id.b5f), null);
                    LIZ(R.id.b5f).setClickable(false);
                }
                LIZIZ(true, z3, z, z2);
                LIZ(R.id.b5f).setAlpha(1.0f);
                LIZ(R.id.b5f).setScaleX(1.0f);
                LIZ(R.id.b5f).setScaleY(1.0f);
                ((ImageView) LIZ(R.id.bgr)).setVisibility(8);
                CharSequence text = ((AppCompatTextView) LIZ(R.id.b5d)).getText();
                if (text == null || text.length() == 0) {
                    LIZ(R.id.b5f).setVisibility(8);
                    LIZ(R.id.b5e).setVisibility(8);
                    LIZ(R.id.b5d).setVisibility(8);
                    TuxTextView tuxTextView2 = this.LJLILLLLZI;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setVisibility(8);
                    }
                    ((ImageView) LIZ(R.id.lk7)).setVisibility(8);
                    return;
                }
                LIZ(R.id.b5f).setVisibility(0);
                LIZ(R.id.b5e).setVisibility(0);
                LIZ(R.id.b5d).setVisibility(0);
                TuxTextView tuxTextView3 = this.LJLILLLLZI;
                if (tuxTextView3 != null) {
                    InterfaceC86653Xzd interfaceC86653Xzd = this.LJLIL;
                    if (interfaceC86653Xzd == null || !interfaceC86653Xzd.LIZ()) {
                        i = 8;
                    }
                    tuxTextView3.setVisibility(i);
                }
                ImageView imageView = (ImageView) LIZ(R.id.lk7);
                InterfaceC86653Xzd interfaceC86653Xzd2 = this.LJLIL;
                if (interfaceC86653Xzd2 != null) {
                    i2 = interfaceC86653Xzd2.LIZIZ();
                }
                imageView.setVisibility(i2);
                return;
            }
            LIZ(R.id.b5f).setVisibility(8);
            LIZ(R.id.b5e).setVisibility(8);
            LIZ(R.id.b5d).setVisibility(8);
            TuxTextView tuxTextView4 = this.LJLILLLLZI;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(8);
            }
            ((ImageView) LIZ(R.id.lk7)).setVisibility(8);
            ((ImageView) LIZ(R.id.bgr)).setVisibility(8);
            return;
        }
        LIZ(R.id.b5f).setVisibility(8);
        LIZ(R.id.b5e).setVisibility(8);
        LIZ(R.id.b5d).setVisibility(8);
        TuxTextView tuxTextView5 = this.LJLILLLLZI;
        if (tuxTextView5 != null) {
            tuxTextView5.setVisibility(8);
        }
        ((ImageView) LIZ(R.id.lk7)).setVisibility(8);
        if ((C52280KfU.LIZ() && this.LJLJJLL) || C79004UzY.LJJIJIIJI(getContext())) {
            ((ImageView) LIZ(R.id.bgr)).setVisibility(8);
        } else {
            ((ImageView) LIZ(R.id.bgr)).setVisibility(0);
        }
    }
}
