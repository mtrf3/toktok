package X;

import Y.ACListenerS32S0100000_12;
import Y.ARunnableS31S0200000_12;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import o3.IDaS470S0100000_12;
import o3.h0;

/* renamed from: X.Spp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73305Spp extends FrameLayout {
    public KUU LJLIL;
    public InterfaceC73307Spr LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public ARunnableS31S0200000_12 LJLJJL;
    public int LJLJJLL;
    public final float LJLJL;
    public final float LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public InterfaceC217298ft LJLLLL;
    public final IDaS470S0100000_12 LJLLLLLL;
    public final java.util.Map<Integer, View> LJLZ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C73305Spp(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C73305Spp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZLLL() {
        if (!this.LJLJJI) {
            View.inflate(getContext(), R.layout.cl, this);
            float f = this.LJLJL;
            if (f > 0.0f) {
                setTopMarginInner(f);
            }
            float f2 = this.LJLJLJ;
            if (f2 > 0.0f) {
                setButtonTopMarginInner(f2);
            }
            setLayoutVariantInner(this.LJLJJLL);
            ((TuxTextView) LIZ(R.id.lao)).setTuxFont(this.LJLLJ);
            ((TextView) LIZ(R.id.lao)).setTextColor(this.LJLJLLL);
            h0.LJIJJ(LIZ(R.id.lao), true);
            ((TuxTextView) LIZ(R.id.message_tv)).setTuxFont(this.LJLLL);
            ((TextView) LIZ(R.id.message_tv)).setTextColor(this.LJLL);
            ((SY4) LIZ(R.id.b1h)).setButtonVariant(this.LJLLI);
            ((SY4) LIZ(R.id.b1h)).setButtonSize(this.LJLLILLLL);
            LIZ(R.id.kff).setVisibility(4);
            this.LJLJJI = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, android.view.View, X.8pd] */
    public final void LJFF() {
        if (this.LJLILLLLZI == null) {
            final C68322mC c68322mC = new C68322mC();
            ?? findViewById = findViewById(R.id.lv5);
            c68322mC.element = findViewById;
            if (findViewById == 0) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                ?? c223338pd = new C223338pd(context, null, 6);
                c223338pd.setId(R.id.lv5);
                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJJIIZ, LJJIIZ);
                layoutParams.gravity = 17;
                c223338pd.setLayoutParams(layoutParams);
                if (c223338pd.getParent() == null) {
                    addView(c223338pd);
                }
                c68322mC.element = c223338pd;
            }
            LIZIZ(new InterfaceC73307Spr() { // from class: X.9vd
                @Override // X.InterfaceC73307Spr
                public final void hide() {
                    c68322mC.element.setVisibility(4);
                    c68322mC.element.LIZJ();
                }

                @Override // X.InterfaceC73307Spr
                public final void show() {
                    c68322mC.element.setVisibility(0);
                    c68322mC.element.LIZIZ();
                }
            });
        }
        InterfaceC73307Spr interfaceC73307Spr = this.LJLILLLLZI;
        if (interfaceC73307Spr != null) {
            interfaceC73307Spr.show();
        }
        this.LJLJI = true;
        View LIZ = LIZ(R.id.kff);
        if (LIZ != null) {
            LIZ.setVisibility(4);
        }
        this.LJLJJL = null;
        TuxTextView tuxTextView = (TuxTextView) LIZ(R.id.lao);
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, null);
        }
        setTouchDelegate(null);
        InterfaceC217298ft interfaceC217298ft = this.LJLLLL;
        C73308Sps c73308Sps = C73308Sps.LIZ;
        LJ(interfaceC217298ft, c73308Sps);
        this.LJLLLL = c73308Sps;
        setContentDescription(null);
        setImportantForAccessibility(2);
    }

    public final KUU getStatusMonitor() {
        return this.LJLIL;
    }

    private final void setButtonTopMarginInner(float f) {
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.b1h).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.bytedance.tux.widget.FlexLayout.LayoutParams");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("message_tv.bottom+");
        LIZ.append(f);
        LIZ.append("px");
        ((C86981YBt) layoutParams).LIZJ = C86977YBp.LIZ(context, X1D.LIZIZ(LIZ), "layout_top");
    }

    private final void setLayoutVariantInner(int i) {
        LIZ(R.id.lfn).setTag(Integer.valueOf(i));
        LIZ(R.id.lfn).requestLayout();
    }

    private final void setTopMarginInner(float f) {
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.lfn).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.bytedance.tux.widget.FlexLayout.LayoutParams");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(f);
        LIZ.append("px");
        ((C86981YBt) layoutParams).LJII = C86977YBp.LIZ(context, X1D.LIZIZ(LIZ), "layout_height");
    }

    public final void LIZIZ(InterfaceC73307Spr delegate) {
        o.LJIIIZ(delegate, "delegate");
        InterfaceC73307Spr interfaceC73307Spr = this.LJLILLLLZI;
        if (interfaceC73307Spr != null) {
            interfaceC73307Spr.hide();
        }
        this.LJLILLLLZI = delegate;
    }

    public final void LIZJ(View view) {
        o.LJIIIZ(view, "view");
        if (view.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            addView(view, layoutParams);
        }
        LIZIZ(new C73304Spo(view));
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        KUU kuu;
        if (!z && (kuu = this.LJLIL) != null) {
            ((KUS) kuu).LIZJ();
        }
        super.onVisibilityAggregated(z);
    }

    public final void setButtonTopMargin(float f) {
        LIZLLL();
        setButtonTopMarginInner(f);
    }

    public final void setLayoutVariant(int i) {
        if (this.LJLJJI) {
            setLayoutVariantInner(i);
        } else {
            this.LJLJJLL = i;
        }
    }

    public final void setStatus(C73306Spq status) {
        ImageView imageView;
        ARunnableS31S0200000_12 aRunnableS31S0200000_12;
        int i;
        o.LJIIIZ(status, "status");
        InterfaceC217298ft interfaceC217298ft = status.LJIIJ;
        if (!o.LJ(interfaceC217298ft, this.LJLLLL)) {
            LJ(this.LJLLLL, interfaceC217298ft);
            this.LJLLLL = interfaceC217298ft;
        }
        InterfaceC73307Spr interfaceC73307Spr = this.LJLILLLLZI;
        if (interfaceC73307Spr != null) {
            interfaceC73307Spr.hide();
        }
        this.LJLJI = false;
        LIZLLL();
        LIZ(R.id.kff).setVisibility(0);
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.ebu).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.bytedance.tux.widget.FlexLayout.LayoutParams");
        int i2 = status.LIZLLL;
        if (i2 > 0 && (i = status.LJ) > 0) {
            layoutParams.width = i2;
            layoutParams.height = i;
        } else {
            int LIZIZ = C7MY.LIZIZ(72);
            layoutParams.width = LIZIZ;
            layoutParams.height = LIZIZ;
        }
        LIZ(R.id.ebu).setLayoutParams(layoutParams);
        int i3 = status.LIZJ;
        if (i3 != 0) {
            if (i3 != 1) {
                imageView = (ImageView) LIZ(R.id.ebu);
            } else {
                ((ImageView) LIZ(R.id.agh)).setVisibility(0);
                ((ImageView) LIZ(R.id.ebu)).setVisibility(8);
                imageView = (ImageView) LIZ(R.id.agh);
            }
        } else {
            ((ImageView) LIZ(R.id.agh)).setVisibility(8);
            ((ImageView) LIZ(R.id.ebu)).setVisibility(0);
            imageView = (ImageView) LIZ(R.id.ebu);
        }
        Drawable drawable = status.LIZ;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else if (status.LIZIZ != null) {
            ((TuxIconView) LIZ(R.id.ebu)).setTuxIcon(status.LIZIZ);
        } else {
            imageView.setVisibility(8);
        }
        TextUtils.isEmpty(null);
        imageView.setContentDescription(null);
        if (TextUtils.isEmpty(status.LJFF)) {
            LIZ(R.id.lao).setVisibility(8);
        } else {
            ((TextView) LIZ(R.id.lao)).setText(status.LJFF);
            LIZ(R.id.lao).setVisibility(0);
        }
        if (TextUtils.isEmpty(status.LJI)) {
            LIZ(R.id.message_tv).setVisibility(8);
        } else {
            ((TextView) LIZ(R.id.message_tv)).setText(status.LJI);
            LIZ(R.id.message_tv).setVisibility(0);
            if (!(status.LJI instanceof String)) {
                ((TextView) LIZ(R.id.message_tv)).setMovementMethod(AnonymousClass898.LIZ);
            }
        }
        InterfaceC88472Yns<? super SY4, C76800UCe> interfaceC88472Yns = status.LJII;
        if (interfaceC88472Yns != null) {
            View button = LIZ(R.id.b1h);
            o.LJIIIIZZ(button, "button");
            interfaceC88472Yns.invoke(button);
            LIZ(R.id.b1h).setVisibility(0);
        } else {
            LIZ(R.id.b1h).setVisibility(8);
        }
        InterfaceC88472Yns<? super LinearLayout, C76800UCe> interfaceC88472Yns2 = status.LJIIIZ;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.lv4);
        ViewGroup viewGroup2 = viewGroup;
        if (interfaceC88472Yns2 != null) {
            if (viewGroup == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setId(R.id.lv4);
                linearLayout.setOrientation(1);
                C86981YBt c86981YBt = new C86981YBt(-2);
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                c86981YBt.LJ = C86977YBp.LIZ(context, "50%", "center_x");
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                c86981YBt.LJFF = C86977YBp.LIZ(context2, "70%+42dp", "center_y");
                ((ViewGroup) LIZ(R.id.kff)).addView(linearLayout, c86981YBt);
                viewGroup2 = linearLayout;
            }
            viewGroup2.removeAllViews();
            interfaceC88472Yns2.invoke(viewGroup2);
        } else if (viewGroup != null) {
            ViewGroup viewGroup3 = (ViewGroup) LIZ(R.id.kff);
            if (C78996UzQ.LJJIIJZLJL(viewGroup)) {
                C78996UzQ.LJI();
            }
            viewGroup3.removeView(viewGroup);
        }
        InterfaceC88472Yns<? super C73305Spp, C76800UCe> interfaceC88472Yns3 = status.LJIIIIZZ;
        if (interfaceC88472Yns3 != null) {
            aRunnableS31S0200000_12 = new ARunnableS31S0200000_12(this, interfaceC88472Yns3, 3);
        } else {
            aRunnableS31S0200000_12 = null;
        }
        this.LJLJJL = aRunnableS31S0200000_12;
        if (aRunnableS31S0200000_12 != null) {
            C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.lao), new ACListenerS32S0100000_12(this, 28));
            post(new ARunnableS39S0100000_3(this, 20));
        } else {
            C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.lao), null);
            setTouchDelegate(null);
        }
        int i4 = 2;
        if (TextUtils.isEmpty(null)) {
            setContentDescription(null);
            setImportantForAccessibility(2);
            h0.LJIJI(this, null);
            if (!TextUtils.isEmpty(null)) {
                i4 = 1;
            }
            imageView.setImportantForAccessibility(i4);
            LIZ(R.id.lao).setImportantForAccessibility(1);
            LIZ(R.id.message_tv).setImportantForAccessibility(1);
            h0.LJIJI(LIZ(R.id.lao), this.LJLLLLLL);
            return;
        }
        setContentDescription(null);
        setImportantForAccessibility(1);
        h0.LJIJI(this, this.LJLLLLLL);
        imageView.setImportantForAccessibility(2);
        LIZ(R.id.lao).setImportantForAccessibility(2);
        LIZ(R.id.message_tv).setImportantForAccessibility(2);
        h0.LJIJI(LIZ(R.id.lao), null);
    }

    public final void setStatusMonitor(KUU kuu) {
        this.LJLIL = kuu;
    }

    public final void setTopMargin(float f) {
        LIZLLL();
        setTopMarginInner(f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        KUU kuu;
        if ((i == 4 || i == 8) && getVisibility() == 0 && o.LJ(this.LJLLLL, C73308Sps.LIZ) && (kuu = this.LJLIL) != null) {
            ((KUS) kuu).LIZLLL(true);
        }
        super.setVisibility(i);
    }

    public final void LJ(InterfaceC217298ft oldStatus, InterfaceC217298ft newStatus) {
        KUU kuu = this.LJLIL;
        if (kuu != null) {
            KUS kus = (KUS) kuu;
            o.LJIIIZ(oldStatus, "oldStatus");
            o.LJIIIZ(newStatus, "newStatus");
            C217288fs c217288fs = C217288fs.LIZ;
            if (o.LJ(newStatus, c217288fs)) {
                kus.LIZLLL(false);
            }
            if (o.LJ(oldStatus, c217288fs) && o.LJ(newStatus, C73308Sps.LIZ) && kus.LJFF > 0) {
                kus.LIZIZ++;
                kus.LIZJ = System.currentTimeMillis();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C73305Spp(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r0 = r8 & 2
            if (r0 == 0) goto L5
            r7 = 0
        L5:
            r4 = 4
            r0 = r8 & 4
            r2 = 0
            if (r0 == 0) goto L82
            r3 = 2130968902(0x7f040146, float:1.754647E38)
        Le:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r6, r0)
            r5.LJLZ = r0
            r5.<init>(r6, r7, r3)
            X.KUT r0 = X.KUT.LIZ
            r5.LJLLLL = r0
            o3.IDaS470S0100000_12 r1 = new o3.IDaS470S0100000_12
            r0 = 0
            r1.<init>(r5, r0)
            r5.LJLLLLLL = r1
            r0 = 9
            int[] r0 = new int[r0]
            r0 = {x0084: FILL_ARRAY_DATA , data: [2130969147, 2130969148, 2130969149, 2130969150, 2130969151, 2130969152, 2130971923, 2130971977, 2130971978} // fill-array
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r7, r0, r3, r2)
            java.lang.String r0 = "context.obtainStyledAttr…tusView, defStyleAttr, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            r0 = 6
            int r0 = r3.getInt(r0, r2)
            r5.LJLJJLL = r0
            r0 = 8
            r1 = 0
            float r0 = r3.getDimension(r0, r1)
            r5.LJLJL = r0
            r0 = 7
            float r0 = r3.getDimension(r0, r1)
            r5.LJLJLJ = r0
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r3.getColor(r4, r1)
            r5.LJLJLLL = r0
            r0 = 2
            int r0 = r3.getColor(r0, r1)
            r5.LJLL = r0
            r0 = 1
            int r0 = r3.getInt(r0, r2)
            r5.LJLLI = r0
            int r0 = r3.getInt(r2, r2)
            r5.LJLLILLLL = r0
            r0 = 5
            int r0 = r3.getInt(r0, r2)
            r5.LJLLJ = r0
            r0 = 3
            int r0 = r3.getInt(r0, r2)
            r5.LJLLL = r0
            r3.recycle()
            X.KUS r0 = new X.KUS
            r0.<init>(r5)
            r5.setStatusMonitor(r0)
            return
        L82:
            r3 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73305Spp.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
