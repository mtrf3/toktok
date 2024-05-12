package X;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K5T extends FrameLayout {
    public static final int LJZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
    public int LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public int LJLJJL;
    public float LJLJJLL;
    public boolean LJLJL;
    public C2068389v LJLJLJ;
    public View.OnClickListener LJLJLLL;
    public boolean LJLL;
    public View LJLLI;
    public View.OnClickListener LJLLILLLL;
    public boolean LJLLJ;
    public K6D LJLLL;
    public K6D LJLLLL;
    public EnumC51135K5b LJLLLLLL;
    public final java.util.Map<Integer, View> LJLZ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K5T(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLZ;
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

    public final void LIZLLL() {
        int LJJIIZ;
        int LJJIIZ2;
        if (this.LJLJJLL >= this.LJLLLLLL.getSearchBarInnerHeight() / 2) {
            LJJIIZ = C7MY.LIZIZ(8);
            LJJIIZ2 = C7MY.LIZIZ(2);
        } else {
            LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(6));
            LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
        }
        if (this.LJLLI != null) {
            LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
        }
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.enl).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.bytedance.tux.widget.FlexLayout.LayoutParams");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIIZ);
        LIZ.append("px");
        ((C86981YBt) layoutParams).LIZ = C86977YBp.LIZ(context, X1D.LIZIZ(LIZ), "layout_left");
        View inner_end_icon = LIZ(R.id.emv);
        o.LJIIIIZZ(inner_end_icon, "inner_end_icon");
        C26338AVi.LJI(inner_end_icon, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)) + LJJIIZ2), null, false, 26);
        View inner_empty_end_icon = LIZ(R.id.emt);
        o.LJIIIIZZ(inner_empty_end_icon, "inner_empty_end_icon");
        C26338AVi.LJI(inner_empty_end_icon, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, Integer.valueOf(LJJIIZ2), null, false, 26);
    }

    public final void LIZJ() {
        boolean z;
        Editable text = ((C19K) LIZ(R.id.jf6)).getText();
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.LJLL) {
            if (this.LJLJLJ != null) {
                ((ImageView) LIZ(R.id.emv)).setVisibility(8);
                ((ImageView) LIZ(R.id.emt)).setVisibility(0);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            ((ImageView) LIZ(R.id.emv)).setVisibility(8);
            ((ImageView) LIZ(R.id.emt)).setVisibility(8);
            return;
        }
        ((ImageView) LIZ(R.id.emv)).setVisibility(0);
        ((ImageView) LIZ(R.id.emt)).setVisibility(8);
    }

    public final T5T getEditTextView() {
        T5T search_edit_text = (T5T) LIZ(R.id.jf6);
        o.LJIIIIZZ(search_edit_text, "search_edit_text");
        return search_edit_text;
    }

    public final View getCtaView() {
        return this.LJLLI;
    }

    public final float getEditBackgroundRadius() {
        return this.LJLJJLL;
    }

    public final K6D getEndAction() {
        return this.LJLLLL;
    }

    public final boolean getHasInnerStartIcon() {
        return this.LJLJL;
    }

    public final C2068389v getInnerEmptyEndIcon() {
        return this.LJLJLJ;
    }

    public final boolean getNotDisplayX() {
        return this.LJLL;
    }

    public final View.OnClickListener getOnClickClearListener() {
        return this.LJLLILLLL;
    }

    public final View.OnClickListener getOnClickInnerEmptyEndIcon() {
        return this.LJLJLLL;
    }

    public final int getPrimaryColor$tux_theme_release() {
        return this.LJLIL;
    }

    public final EnumC51135K5b getSearchBarHeight() {
        return this.LJLLLLLL;
    }

    public final int getSecondaryColor$tux_theme_release() {
        return this.LJLILLLLZI;
    }

    public final boolean getShowSeparator() {
        return this.LJLLJ;
    }

    public final K6D getStartAction() {
        return this.LJLLL;
    }

    public final void setCtaView(View view) {
        this.LJLLI = view;
        ((ViewGroup) LIZ(R.id.c0c)).removeAllViews();
        View view2 = this.LJLLI;
        if (view2 != null) {
            ((ViewGroup) LIZ(R.id.c0c)).addView(view2);
        }
        LIZLLL();
    }

    public final void setEditBackgroundRadius(float f) {
        this.LJLJJLL = f;
        View LIZ = LIZ(R.id.jet);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(f);
        c110614Vt.LIZ = Integer.valueOf(this.LJLJJL);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        LIZ.setBackground(c110614Vt.LIZ(context));
        LIZLLL();
    }

    public final void setEndAction(K6D k6d) {
        this.LJLLLL = k6d;
        FrameLayout end_action_container = (FrameLayout) LIZ(R.id.cw7);
        o.LJIIIIZZ(end_action_container, "end_action_container");
        LIZIZ(k6d, end_action_container);
    }

    public final void setHasInnerStartIcon(boolean z) {
        this.LJLJL = z;
        if (z) {
            ((ImageView) LIZ(R.id.enl)).setVisibility(0);
        } else {
            ((ImageView) LIZ(R.id.enl)).setVisibility(8);
        }
    }

    public final void setInnerEmptyEndIcon(C2068389v c2068389v) {
        this.LJLJLJ = c2068389v;
        if (c2068389v != null) {
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        }
        ((TuxIconView) LIZ(R.id.emt)).setTuxIcon(c2068389v);
        LIZJ();
    }

    public final void setNotDisplayX(boolean z) {
        this.LJLL = z;
        LIZJ();
    }

    public final void setOnClickClearListener(View.OnClickListener onClickListener) {
        this.LJLLILLLL = onClickListener;
    }

    public final void setOnClickInnerEmptyEndIcon(View.OnClickListener onClickListener) {
        this.LJLJLLL = onClickListener;
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.emt), onClickListener);
        if (onClickListener != null) {
            View inner_empty_end_icon = LIZ(R.id.emt);
            o.LJIIIIZZ(inner_empty_end_icon, "inner_empty_end_icon");
            C78897Uxp.LJJJJLI(inner_empty_end_icon, null);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        LIZ(R.id.emt).setOnTouchListener(null);
    }

    public final void setPrimaryColor$tux_theme_release(int i) {
        this.LJLIL = i;
    }

    public final void setSearchBarHeight(EnumC51135K5b value) {
        o.LJIIIZ(value, "value");
        this.LJLLLLLL = value;
        LIZ(R.id.jeb).setLayoutParams(new FrameLayout.LayoutParams(-1, value.getSearchBarHeight()));
        View LIZ = LIZ(R.id.jet);
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.jet).getLayoutParams();
        layoutParams.height = value.getSearchBarInnerHeight();
        LIZ.setLayoutParams(layoutParams);
        LIZLLL();
    }

    public final void setSecondaryColor$tux_theme_release(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setShowSeparator(boolean z) {
        this.LJLLJ = z;
        if (z) {
            LIZ(R.id.jhe).setVisibility(0);
        } else {
            LIZ(R.id.jhe).setVisibility(8);
        }
    }

    public final void setStartAction(K6D k6d) {
        this.LJLLL = k6d;
        FrameLayout start_action_container = (FrameLayout) LIZ(R.id.kcl);
        o.LJIIIIZZ(start_action_container, "start_action_container");
        LIZIZ(k6d, start_action_container);
    }

    public final void LIZIZ(K6D k6d, FrameLayout frameLayout) {
        int LJJIIZ;
        int LJJIIZ2;
        Integer valueOf;
        frameLayout.removeAllViews();
        if (this.LJLLL != null) {
            LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
        } else {
            LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        }
        if (this.LJLLLL != null) {
            LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
        } else {
            LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        }
        View search_bar_layout = LIZ(R.id.jeb);
        o.LJIIIIZZ(search_bar_layout, "search_bar_layout");
        C26338AVi.LJIIIZ(search_bar_layout, Integer.valueOf(LJJIIZ), null, Integer.valueOf(LJJIIZ2), null, 26);
        if (k6d != null) {
            if (k6d instanceof K5S) {
                K5S k5s = (K5S) k6d;
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                C26338AVi.LJIIIZ(tuxIconView, Integer.valueOf(k5s.LIZLLL), null, Integer.valueOf(k5s.LJ), null, 26);
                tuxIconView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                C26338AVi.LJI(tuxIconView, Integer.valueOf(k5s.LIZIZ), null, Integer.valueOf(k5s.LIZJ), null, false, 26);
                C2068389v c2068389v = new C2068389v();
                int i = LJZ;
                c2068389v.LIZIZ = i;
                c2068389v.LIZJ = i;
                c2068389v.LIZ = k5s.LJI;
                if (k5s.LIZ == EnumC27399Ap9.PRIMARY) {
                    valueOf = Integer.valueOf(this.LJLIL);
                } else {
                    valueOf = Integer.valueOf(this.LJLILLLLZI);
                }
                c2068389v.LIZLLL = valueOf;
                tuxIconView.setTuxIcon(c2068389v);
                C16880lQ.LJJJ(tuxIconView, k5s.LJFF);
                C78897Uxp.LJJJJLI(tuxIconView, null);
                k5s.LJII = tuxIconView;
                k5s.LJIIIIZZ = this;
                frameLayout.addView(tuxIconView);
                return;
            }
            if (!(k6d instanceof K5U)) {
                return;
            }
            K5U k5u = (K5U) k6d;
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
            C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(k5u.LIZLLL), null, Integer.valueOf(k5u.LJ), null, 26);
            tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            C26338AVi.LJI(tuxTextView, Integer.valueOf(k5u.LIZIZ), null, Integer.valueOf(k5u.LIZJ), null, false, 26);
            tuxTextView.setGravity(16);
            if (k5u.LIZ == EnumC27399Ap9.PRIMARY) {
                tuxTextView.setTextColor(this.LJLIL);
                tuxTextView.setTuxFont(this.LJLJI);
            } else {
                tuxTextView.setTextColor(this.LJLILLLLZI);
                tuxTextView.setTuxFont(this.LJLJJI);
            }
            tuxTextView.setText(k5u.LJI);
            C16880lQ.LJJJJI(tuxTextView, k5u.LJFF);
            C78897Uxp.LJJJJLI(tuxTextView, null);
            k5u.LJII = tuxTextView;
            k5u.LJIIIIZZ = this;
            frameLayout.addView(tuxTextView);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K5T(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5T.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
