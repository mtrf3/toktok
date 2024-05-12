package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AJa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26018AJa extends FrameLayout implements InterfaceC26024AJg {
    public static final int LJLLI;
    public static final int LJLLILLLL;
    public static final int LJLLJ;
    public InterfaceC26019AJb LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public TuxIconView LJLJL;
    public C116414hZ LJLJLJ;
    public final int LJLJLLL;
    public final java.util.Map<Integer, View> LJLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26018AJa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLL;
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
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
        LJLLI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        LJLLILLLL = C7MY.LIZIZ(8);
        LJLLJ = C7MY.LIZIZ(4);
    }

    @Override // X.InterfaceC26024AJg
    public final void LIZ() {
        InterfaceC26019AJb interfaceC26019AJb = this.LJLIL;
        if (interfaceC26019AJb != null) {
            interfaceC26019AJb.LJJIIZI(this.LJLJI, ((C19K) LIZIZ(R.id.cps)).getText());
        }
    }

    public final void LJIIIIZZ() {
        View view = null;
        if (this.LJLILLLLZI) {
            if (this.LJLJL == null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                view = null;
                TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                this.LJLJL = tuxIconView;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = this.LJLJLLL;
                c2068389v.LIZLLL = Integer.valueOf(this.LJLJJI);
                tuxIconView.setTuxIcon(c2068389v);
                int i = LJLLI;
                tuxIconView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
                C26338AVi.LJI(tuxIconView, Integer.valueOf(LJLLILLLL), null, Integer.valueOf(LJLLJ), null, false, 26);
                C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 9));
            }
            Editable text = ((C19K) LIZIZ(R.id.cps)).getText();
            if (text != null && text.length() > 0) {
                LIZLLL(this.LJLJL);
                return;
            } else {
                LIZLLL(view);
                return;
            }
        }
        LIZLLL(null);
    }

    public final T5T getEditText() {
        T5T edit_text = (T5T) LIZIZ(R.id.cps);
        o.LJIIIIZZ(edit_text, "edit_text");
        return edit_text;
    }

    public final void LIZJ(TextWatcher textWatcher) {
        ((TextView) LIZIZ(R.id.cps)).addTextChangedListener(textWatcher);
    }

    public final void LIZLLL(View view) {
        ((ViewGroup) LIZIZ(R.id.cwv)).removeAllViews();
        if (view != null) {
            ((ViewGroup) LIZIZ(R.id.cwv)).addView(view);
            LIZIZ(R.id.cwv).setVisibility(0);
        } else {
            LIZIZ(R.id.cwv).setVisibility(8);
        }
    }

    public final void LJ(boolean z) {
        this.LJLILLLLZI = z;
        LJIIIIZZ();
    }

    public final void LJFF(boolean z) {
        if (z) {
            LIZIZ(R.id.joq).setBackgroundColor(this.LJLJJLL);
        } else {
            LIZIZ(R.id.joq).setBackgroundColor(this.LJLJJL);
        }
    }

    public final void LJI(int i) {
        ((TextView) LIZIZ(R.id.cps)).setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
    }

    public final void LJII(String str) {
        ((TextView) LIZIZ(R.id.cps)).setHint(str);
    }

    public final void LJIIIZ(String str) {
        ((TextView) LIZIZ(R.id.cps)).setText(str);
    }

    @Override // X.InterfaceC26024AJg
    public void setTuxFieldContentCallback(InterfaceC26019AJb callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLIL = callback;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26018AJa(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r0 = r11 & 2
            if (r0 == 0) goto L5
            r10 = 0
        L5:
            r6 = 4
            r0 = r11 & 4
            r7 = 0
            if (r0 == 0) goto Lae
            r2 = 2130968910(0x7f04014e, float:1.7546487E38)
        Le:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r9, r0)
            r8.LJLL = r0
            r8.<init>(r9, r10, r2)
            r3 = 1
            r8.LJLILLLLZI = r3
            r0 = 20
            r8.LJLJI = r0
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r9)
            r0 = 2131558435(0x7f0d0023, float:1.8742186E38)
            X.C16880lQ.LLLLIILL(r1, r0, r8, r3)
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x00b2: FILL_ARRAY_DATA , data: [2130969216, 2130969217, 2130969218, 2130969219, 2130969220, 2130969221, 2130969222, 2130969223} // fill-array
            android.content.res.TypedArray r2 = r9.obtainStyledAttributes(r10, r0, r2, r7)
            java.lang.String r0 = "context.obtainStyledAttr…xtField, defStyleAttr, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r0 = 7
            int r5 = r2.getInt(r0, r7)
            r0 = 6
            int r4 = r2.getColor(r0, r7)
            int r0 = r2.getColor(r3, r7)
            r8.LJLJJI = r0
            r0 = 5
            int r1 = r2.getColor(r0, r7)
            r8.LJLJJL = r1
            r0 = 2
            int r0 = r2.getColor(r0, r7)
            r8.LJLJJLL = r0
            r0 = 3
            r2.getResourceId(r0, r7)
            r2.getColor(r6, r7)
            int r0 = r2.getResourceId(r7, r7)
            r8.LJLJLLL = r0
            r2.recycle()
            r2 = 2131366130(0x7f0a10f2, float:1.8352145E38)
            android.view.View r0 = r8.LIZIZ(r2)
            X.T5T r0 = (X.T5T) r0
            r0.setTuxFont(r5)
            android.view.View r0 = r8.LIZIZ(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r4)
            r0 = 2131375688(0x7f0a3648, float:1.837153E38)
            android.view.View r0 = r8.LIZIZ(r0)
            r0.setBackgroundColor(r1)
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = X.C16880lQ.LLILL(r9, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            kotlin.jvm.internal.o.LJII(r1, r0)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.view.View r0 = r8.LIZIZ(r2)
            r1.showSoftInput(r0, r3)
            android.view.View r2 = r8.LIZIZ(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            Y.IDObjectS177S0100000_4 r1 = new Y.IDObjectS177S0100000_4
            r0 = 0
            r1.<init>(r8, r0)
            r2.addTextChangedListener(r1)
            r8.LIZ()
            return
        Lae:
            r2 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26018AJa.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
