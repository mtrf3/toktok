package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.9vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252709vu extends FrameLayout {
    public C235119Kp LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public final java.util.Map<Integer, View> LJLLILLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C252709vu(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C252709vu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLILLLL;
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

    public final void LJIIIZ() {
        View LJFF;
        ((ViewGroup) LIZ(R.id.gwr)).removeAllViews();
        Iterator it = ((ArrayList) this.LJLIL.LIZIZ).iterator();
        while (it.hasNext()) {
            AbstractC234519Ih abstractC234519Ih = (AbstractC234519Ih) it.next();
            if (abstractC234519Ih instanceof C234509Ig) {
                LJFF = LJFF((C234509Ig) abstractC234519Ih);
            } else if (abstractC234519Ih instanceof C234529Ii) {
                LJFF = LJ((C234529Ii) abstractC234519Ih);
            } else if (abstractC234519Ih instanceof C235929Ns) {
                LJFF = LIZLLL((C235929Ns) abstractC234519Ih);
            }
            if (LJFF != null) {
                ((ViewGroup) LIZ(R.id.gwr)).addView(LJFF);
            }
        }
    }

    public final void LJIIJJI() {
        View LJFF;
        ((ViewGroup) LIZ(R.id.gx0)).removeAllViews();
        Iterator it = ((ArrayList) this.LJLIL.LIZ).iterator();
        while (it.hasNext()) {
            AbstractC234519Ih abstractC234519Ih = (AbstractC234519Ih) it.next();
            if (abstractC234519Ih instanceof C234509Ig) {
                LJFF = LJFF((C234509Ig) abstractC234519Ih);
            } else if (abstractC234519Ih instanceof C234529Ii) {
                LJFF = LJ((C234529Ii) abstractC234519Ih);
            } else if (abstractC234519Ih instanceof C235929Ns) {
                LJFF = LIZLLL((C235929Ns) abstractC234519Ih);
            }
            if (LJFF != null) {
                ((ViewGroup) LIZ(R.id.gx0)).addView(LJFF);
            }
        }
    }

    public final void LJIJJ() {
        LIZ(R.id.gwu).getLayoutParams().height = C7MY.LIZIZ(44);
    }

    public final int getNavBackgroundColor$tux_theme_release() {
        return this.LJLJLLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r2 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View LIZLLL(X.C235929Ns r3) {
        /*
            android.view.View r2 = r3.LIZJ
            boolean r0 = r3.LIZLLL
            if (r0 == 0) goto L25
            if (r2 == 0) goto L1e
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L1e
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
        L12:
            r2.setLayoutParams(r0)
            java.lang.Object r1 = r3.LIZIZ
            r0 = 2131378664(0x7f0a41e8, float:1.8377567E38)
            r2.setTag(r0, r1)
        L1d:
            return r2
        L1e:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            goto L30
        L25:
            r0 = 40
            int r1 = X.C7MY.LIZIZ(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r1)
        L30:
            if (r2 != 0) goto L12
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252709vu.LIZLLL(X.9Ns):android.view.View");
    }

    public final void LIZIZ(AbstractC234519Ih abstractC234519Ih) {
        ((ArrayList) this.LJLIL.LIZIZ).add(abstractC234519Ih);
        LJIIIZ();
    }

    public final void LIZJ(C234529Ii c234529Ii) {
        ((ArrayList) this.LJLIL.LIZ).add(c234529Ii);
        LJIIJJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TuxIconView LJ(C234529Ii c234529Ii) {
        if (c234529Ii.LIZJ == -1 && c234529Ii.LJ == null && c234529Ii.LJFF == null) {
            return null;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, 0 == true ? 1 : 0);
        int LIZIZ = C7MY.LIZIZ(40);
        tuxIconView.setLayoutParams(new LinearLayout.LayoutParams(LIZIZ, LIZIZ));
        LJIIZILJ(c234529Ii, tuxIconView);
        return tuxIconView;
    }

    public final TuxTextView LJFF(C234509Ig c234509Ig) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setGravity(17);
        C26338AVi.LJIIIZ(tuxTextView, C1FJ.LIZIZ(8), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, 26);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C7MY.LIZIZ(40));
        layoutParams.gravity = 16;
        tuxTextView.setLayoutParams(layoutParams);
        LJIJI(c234509Ig, tuxTextView);
        return tuxTextView;
    }

    public final View LJI(Object tag) {
        Object obj;
        o.LJIIIZ(tag, "tag");
        ViewGroup nav_start = (ViewGroup) LIZ(R.id.gx0);
        o.LJIIIIZZ(nav_start, "nav_start");
        C33961Uy LIZLLL = C78924UyG.LIZLLL(nav_start);
        ViewGroup nav_end = (ViewGroup) LIZ(R.id.gwr);
        o.LJIIIIZZ(nav_end, "nav_end");
        C51652KOy LJJJZ = OJ4.LJJJZ(LIZLLL, C78924UyG.LIZLLL(nav_end));
        ViewGroup nav_center = (ViewGroup) LIZ(R.id.gwm);
        o.LJIIIIZZ(nav_center, "nav_center");
        C51651KOx c51651KOx = new C51651KOx(OJ4.LJJJZ(LJJJZ, C78924UyG.LIZLLL(nav_center)));
        while (true) {
            if (c51651KOx.LIZ()) {
                obj = c51651KOx.next();
                if (LJII((View) obj, tag)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (View) obj;
    }

    public final void LJIIIIZZ(Object tag) {
        o.LJIIIZ(tag, "tag");
        ViewGroup nav_start = (ViewGroup) LIZ(R.id.gx0);
        o.LJIIIIZZ(nav_start, "nav_start");
        C33961Uy LIZLLL = C78924UyG.LIZLLL(nav_start);
        ViewGroup nav_end = (ViewGroup) LIZ(R.id.gwr);
        o.LJIIIIZZ(nav_end, "nav_end");
        C51651KOx c51651KOx = new C51651KOx(OJ4.LJJJZ(LIZLLL, C78924UyG.LIZLLL(nav_end)));
        while (c51651KOx.LIZ()) {
            View view = (View) c51651KOx.next();
            if (LJII(view, tag)) {
                C26338AVi.LIZIZ(view);
            }
        }
        View nav_bar_title = LIZ(R.id.gwk);
        o.LJIIIIZZ(nav_bar_title, "nav_bar_title");
        if (LJII(nav_bar_title, tag)) {
            View nav_bar_title2 = LIZ(R.id.gwk);
            o.LJIIIIZZ(nav_bar_title2, "nav_bar_title");
            C26338AVi.LIZIZ(nav_bar_title2);
        }
    }

    public final void LJIIJ(C9KF c9kf) {
        if (c9kf == null) {
            return;
        }
        View nav_bar_title = LIZ(R.id.gwk);
        o.LJIIIIZZ(nav_bar_title, "nav_bar_title");
        nav_bar_title.setTag(R.id.luz, c9kf.LIZIZ);
        CharSequence charSequence = c9kf.LIZJ;
        boolean z = true;
        if (charSequence.length() > 0) {
            if (!(charSequence instanceof String)) {
                ((TextView) LIZ(R.id.gwk)).setMovementMethod(AnonymousClass898.LIZ);
            }
            ((TextView) LIZ(R.id.gwk)).setText(c9kf.LIZJ);
        } else {
            ((TextView) LIZ(R.id.gwk)).setText("");
        }
        CharSequence charSequence2 = c9kf.LIZLLL;
        if (charSequence2.length() <= 0) {
            z = false;
        }
        if (z) {
            LIZ(R.id.gx4).setVisibility(0);
            ((TextView) LIZ(R.id.gx4)).setText(charSequence2);
            ((TuxTextView) LIZ(R.id.gwk)).setTuxFont(this.LJLLI);
        } else {
            LIZ(R.id.gx4).setVisibility(8);
            ((TuxTextView) LIZ(R.id.gwk)).setTuxFont(this.LJLL);
        }
        if (c9kf.LJ != -1) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = c9kf.LJ;
            c2068389v.LIZLLL = Integer.valueOf(this.LJLJL);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            SY9 LIZ = c2068389v.LIZ(context);
            LIZ.setBounds(0, 0, C7MY.LIZIZ(16), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            if (C26338AVi.LIZLLL(this)) {
                ((AppCompatTextView) LIZ(R.id.gwk)).setCompoundDrawables(LIZ, null, null, null);
            } else {
                ((AppCompatTextView) LIZ(R.id.gwk)).setCompoundDrawables(null, null, LIZ, null);
            }
            C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.gwk), new ACListenerS24S0100000_4(c9kf, 10));
            return;
        }
        ((AppCompatTextView) LIZ(R.id.gwk)).setCompoundDrawables(null, null, null, null);
    }

    public final void LJIIL(TypedArray typedArray) {
        int color = typedArray.getColor(4, -16777216);
        int color2 = typedArray.getColor(3, 0);
        this.LJLJJI = typedArray.getInt(1, 0);
        this.LJLJI = typedArray.getInt(2, 0);
        this.LJLJJL = typedArray.getColor(9, -16777216);
        this.LJLJJLL = typedArray.getColor(8, -16777216);
        this.LJLILLLLZI = typedArray.getColor(7, -16777216);
        this.LJLL = typedArray.getInt(11, 0);
        this.LJLLI = typedArray.getInt(12, 0);
        int i = typedArray.getInt(6, 0);
        int color3 = typedArray.getColor(10, -16777216);
        this.LJLJL = color3;
        int color4 = typedArray.getColor(5, -16777216);
        float dimension = typedArray.getDimension(13, 0.0f);
        this.LJLJLJ = typedArray.getDimensionPixelSize(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        typedArray.recycle();
        TuxTextView tuxTextView = (TuxTextView) LIZ(R.id.gwk);
        tuxTextView.setTuxFont(this.LJLL);
        tuxTextView.setTextColor(color3);
        tuxTextView.setMinTextSizePx((int) dimension);
        h0.LJIJJ(tuxTextView, true);
        TuxTextView tuxTextView2 = (TuxTextView) LIZ(R.id.gx4);
        tuxTextView2.setTuxFont(i);
        tuxTextView2.setTextColor(color4);
        LIZ(R.id.gwz).setBackgroundColor(color);
        setNavBackground(color2);
    }

    public final void LJIILJJIL(boolean z) {
        int i;
        View LIZ = LIZ(R.id.gwz);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        LIZ.setVisibility(i);
    }

    public final void LJIILL(int i) {
        TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), i).obtainStyledAttributes(null, new int[]{R.attr.p9, R.attr.p_, R.attr.pa, R.attr.pb, R.attr.pc, R.attr.pd, R.attr.pe, R.attr.pf, R.attr.pg, R.attr.ph, R.attr.pi, R.attr.pj, R.attr.pk, R.attr.pl}, R.attr.k_, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "ContextThemeWrapper(cont…xNavBarStyle, 0\n        )");
        LJIIL(obtainStyledAttributes);
        setNavActions(this.LJLIL);
    }

    public final void LJIILLIIL(C9KF centerAction) {
        o.LJIIIZ(centerAction, "centerAction");
        this.LJLIL.LIZJ = centerAction;
        LJIIJ(centerAction);
    }

    public final void setNavActions(C235119Kp actions) {
        o.LJIIIZ(actions, "actions");
        this.LJLIL = actions;
        LJIIJJI();
        LJIIIZ();
        LJIIJ(actions.LIZJ);
        LJIILJJIL(actions.LIZLLL);
        Integer num = actions.LJ;
        if (num != null) {
            setNavBackground(num.intValue());
        }
    }

    public final void setNavBackground(int i) {
        this.LJLJLLL = i;
        View LIZ = LIZ(R.id.gwu);
        if (LIZ != null) {
            LIZ.setBackgroundColor(i);
        }
    }

    public static boolean LJII(View view, Object obj) {
        Object tag = view.getTag(R.id.luz);
        if (tag != null && tag.equals(obj)) {
            return true;
        }
        return false;
    }

    public final void LJIIZILJ(C234529Ii c234529Ii, TuxIconView tuxIconView) {
        int i;
        int i2;
        tuxIconView.setTag(R.id.luz, c234529Ii.LIZIZ);
        if (c234529Ii.LJI) {
            i = 0;
        } else {
            i = 8;
        }
        tuxIconView.setVisibility(i);
        h0.LJIJI(tuxIconView, new C253879xn(c234529Ii.LJII, c234529Ii.LIZLLL));
        if (c234529Ii.LIZLLL) {
            C78897Uxp.LJJJJLI(tuxIconView, null);
            C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(c234529Ii, 11));
        } else {
            tuxIconView.setOnTouchListener(null);
            C16880lQ.LJJJ(tuxIconView, null);
        }
        C2068389v c2068389v = c234529Ii.LJ;
        if (c2068389v != null) {
            if (c2068389v.LIZIZ < 0) {
                c2068389v.LIZIZ = this.LJLJLJ;
            }
            if (c2068389v.LIZJ < 0) {
                c2068389v.LIZJ = this.LJLJLJ;
            }
            tuxIconView.setTuxIcon(c2068389v);
            return;
        }
        if (c234529Ii.LIZJ != -1) {
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = c234529Ii.LIZJ;
            if (c234529Ii.LIZLLL) {
                i2 = this.LJLJL;
            } else {
                i2 = this.LJLILLLLZI;
            }
            c2068389v2.LIZLLL = Integer.valueOf(i2);
            int i3 = this.LJLJLJ;
            c2068389v2.LIZIZ = i3;
            c2068389v2.LIZJ = i3;
            tuxIconView.setTuxIcon(c2068389v2);
            return;
        }
        InterfaceC88472Yns<? super TuxIconView, C76800UCe> interfaceC88472Yns = c234529Ii.LJFF;
        if (interfaceC88472Yns == null) {
            return;
        }
        interfaceC88472Yns.invoke(tuxIconView);
    }

    public final void LJIJ(Object tag, InterfaceC88472Yns<? super AbstractC234519Ih, C76800UCe> updater) {
        AbstractC234519Ih abstractC234519Ih;
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(updater, "updater");
        ViewGroup nav_start = (ViewGroup) LIZ(R.id.gx0);
        o.LJIIIIZZ(nav_start, "nav_start");
        C33961Uy LIZLLL = C78924UyG.LIZLLL(nav_start);
        ViewGroup nav_end = (ViewGroup) LIZ(R.id.gwr);
        o.LJIIIIZZ(nav_end, "nav_end");
        C51651KOx c51651KOx = new C51651KOx(OJ4.LJJJZ(LIZLLL, C78924UyG.LIZLLL(nav_end)));
        int i = 0;
        while (c51651KOx.LIZ()) {
            Object next = c51651KOx.next();
            int i2 = i + 1;
            if (i >= 0) {
                View view = (View) next;
                if (LJII(view, tag)) {
                    if (i < ((ArrayList) this.LJLIL.LIZ).size()) {
                        abstractC234519Ih = (AbstractC234519Ih) ListProtector.get(this.LJLIL.LIZ, i);
                    } else {
                        C235119Kp c235119Kp = this.LJLIL;
                        abstractC234519Ih = (AbstractC234519Ih) ListProtector.get(c235119Kp.LIZIZ, i - ((ArrayList) c235119Kp.LIZ).size());
                    }
                    updater.invoke(abstractC234519Ih);
                    if ((abstractC234519Ih instanceof C234529Ii) && (view instanceof TuxIconView)) {
                        LJIIZILJ((C234529Ii) abstractC234519Ih, (TuxIconView) view);
                    } else if ((abstractC234519Ih instanceof C234509Ig) && (view instanceof TuxTextView)) {
                        LJIJI((C234509Ig) abstractC234519Ih, (TuxTextView) view);
                    } else if (abstractC234519Ih instanceof C235929Ns) {
                        view.setTag(R.id.luz, abstractC234519Ih.LIZIZ);
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void LJIJI(C234509Ig c234509Ig, TuxTextView tuxTextView) {
        int i;
        tuxTextView.setTag(R.id.luz, c234509Ig.LIZIZ);
        if (c234509Ig.LJFF) {
            i = 0;
        } else {
            i = 8;
        }
        tuxTextView.setVisibility(i);
        if (C252719vv.LIZ[c234509Ig.LIZLLL.ordinal()] == 1) {
            tuxTextView.setTuxFont(this.LJLJI);
            tuxTextView.setTextColor(this.LJLJJL);
        } else {
            tuxTextView.setTuxFont(this.LJLJJI);
            tuxTextView.setTextColor(this.LJLJJLL);
        }
        if (c234509Ig.LJ) {
            C78897Uxp.LJJJJLI(tuxTextView, null);
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS24S0100000_4(c234509Ig, 12));
        } else {
            tuxTextView.setTextColor(this.LJLILLLLZI);
            tuxTextView.setOnTouchListener(null);
            C16880lQ.LJJJJI(tuxTextView, null);
        }
        tuxTextView.setText(c234509Ig.LIZJ);
        h0.LJIJI(tuxTextView, new C253879xn(c234509Ig.LIZJ, c234509Ig.LJ));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C252709vu(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            r0 = r6 & 4
            r2 = 0
            if (r0 == 0) goto L43
            r1 = 2130968890(0x7f04013a, float:1.7546446E38)
        Ld:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r4, r0)
            r3.LJLLILLLL = r0
            r3.<init>(r4, r5, r1)
            X.9Kp r0 = new X.9Kp
            r0.<init>()
            r3.LJLIL = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.LJLILLLLZI = r0
            r3.LJLJJL = r0
            r3.LJLJJLL = r0
            r3.LJLJL = r0
            r0 = 2131558420(0x7f0d0014, float:1.8742155E38)
            android.view.View.inflate(r4, r0, r3)
            r0 = 14
            int[] r0 = new int[r0]
            r0 = {x0046: FILL_ARRAY_DATA , data: [2130969074, 2130969075, 2130969076, 2130969077, 2130969078, 2130969079, 2130969080, 2130969081, 2130969082, 2130969083, 2130969084, 2130969085, 2130969086, 2130969087} // fill-array
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r0, r1, r2)
            java.lang.String r0 = "context.obtainStyledAttr…xNavBar, defStyleAttr, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.LJIIL(r1)
            return
        L43:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252709vu.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILIIL(int i, int i2, Object tag) {
        o.LJIIIZ(tag, "tag");
        ViewGroup nav_start = (ViewGroup) LIZ(R.id.gx0);
        o.LJIIIIZZ(nav_start, "nav_start");
        C33961Uy LIZLLL = C78924UyG.LIZLLL(nav_start);
        ViewGroup nav_end = (ViewGroup) LIZ(R.id.gwr);
        o.LJIIIIZZ(nav_end, "nav_end");
        C51651KOx c51651KOx = new C51651KOx(OJ4.LJJJZ(LIZLLL, C78924UyG.LIZLLL(nav_end)));
        while (c51651KOx.LIZ()) {
            View view = (View) c51651KOx.next();
            if (LJII(view, tag)) {
                C26338AVi.LIZ(view, i, C7MY.LIZIZ(8), i2, C32151Nz.LJIIZILJ(8), C32151Nz.LJIIZILJ(8));
                View nav_start2 = LIZ(R.id.gx0);
                o.LJIIIIZZ(nav_start2, "nav_start");
                View nav_end2 = LIZ(R.id.gwr);
                o.LJIIIIZZ(nav_end2, "nav_end");
                View nav_layout = LIZ(R.id.gwu);
                o.LJIIIIZZ(nav_layout, "nav_layout");
                for (ViewGroup viewGroup : C47261Igj.LJJIJIIJI(nav_start2, nav_end2, nav_layout)) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
            }
        }
        View nav_bar_title = LIZ(R.id.gwk);
        o.LJIIIIZZ(nav_bar_title, "nav_bar_title");
        if (LJII(nav_bar_title, tag)) {
            View nav_bar_title2 = LIZ(R.id.gwk);
            o.LJIIIIZZ(nav_bar_title2, "nav_bar_title");
            C26338AVi.LIZ(nav_bar_title2, i, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), i2, 0.0f, 0.0f);
            ((ViewGroup) LIZ(R.id.gwm)).setClipToPadding(false);
            ((ViewGroup) LIZ(R.id.gwm)).setClipChildren(false);
            ((ViewGroup) LIZ(R.id.gwu)).setClipToPadding(false);
            ((ViewGroup) LIZ(R.id.gwu)).setClipChildren(false);
        }
    }
}
