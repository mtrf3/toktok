package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AJd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26021AJd extends FrameLayout implements InterfaceC26019AJb {
    public EnumC26023AJf LJLIL;
    public boolean LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public final java.util.Map<Integer, View> LJLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26021AJd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
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

    public final void LIZIZ() {
        EnumC26023AJf enumC26023AJf = this.LJLIL;
        if (enumC26023AJf == EnumC26023AJf.FOOTER) {
            LJ(null);
        } else {
            if (enumC26023AJf != EnumC26023AJf.HEADER) {
                return;
            }
            LJIIIZ(null);
        }
    }

    public final void LJII() {
        ((ImageView) LIZ(R.id.lul)).setVisibility(8);
    }

    public final void LIZJ(EnumC26023AJf position) {
        o.LJIIIZ(position, "position");
        if (this.LJLIL != position) {
            int i = C26022AJe.LIZ[position.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        LIZIZ();
                    }
                } else {
                    LIZIZ();
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    C6J7 c6j7 = new C6J7(context);
                    c6j7.setErrorColor(this.LJLJI);
                    LJIIIZ(c6j7);
                }
            } else {
                LIZIZ();
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                C6J7 c6j72 = new C6J7(context2);
                c6j72.setErrorColor(this.LJLJI);
                LJ(c6j72);
            }
            this.LJLIL = position;
        }
    }

    public final void LIZLLL(CharSequence charSequence) {
        boolean z;
        if (charSequence != null && charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "*").append(charSequence);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = this.LJLJJI;
            c2068389v.LIZLLL = Integer.valueOf(this.LJLJI);
            c2068389v.LIZIZ = C7MY.LIZIZ(16);
            c2068389v.LIZJ = C7MY.LIZIZ(16);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            C8FR LIZIZ = c2068389v.LIZIZ(2, context);
            C8FR.LIZJ(LIZIZ, C26338AVi.LIZLLL(this), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), 2);
            spannableStringBuilder.setSpan(LIZIZ, 0, 1, 17);
            ((TextView) LIZ(R.id.luj)).setText(spannableStringBuilder);
            LIZ(R.id.d1i).setVisibility(0);
            return;
        }
        ((TextView) LIZ(R.id.luj)).setText((CharSequence) null);
        LIZ(R.id.d1i).setVisibility(8);
    }

    public final void LJ(TuxTextView tuxTextView) {
        ((ViewGroup) LIZ(R.id.luk)).removeAllViews();
        if (tuxTextView != null) {
            ((ViewGroup) LIZ(R.id.luk)).addView(tuxTextView);
        }
        this.LJLJLJ = tuxTextView;
        KeyEvent.Callback callback = this.LJLJLLL;
        if (callback instanceof InterfaceC26024AJg) {
            ((InterfaceC26024AJg) callback).LIZ();
        }
    }

    public final void LJFF(CharSequence charSequence) {
        if (charSequence != null && ((String) charSequence).length() > 0) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setTuxFont(this.LJLJJL);
            tuxTextView.setTextColor(this.LJLJJLL);
            tuxTextView.setText(charSequence);
            tuxTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            LJ(tuxTextView);
            return;
        }
        ((ViewGroup) LIZ(R.id.luk)).removeAllViews();
    }

    public final void LJI(boolean z) {
        if (this.LJLILLLLZI) {
            if (!z) {
                C2314096i c2314096i = (C2314096i) LIZ(R.id.d1i);
                c2314096i.LJLILLLLZI.reverse();
                c2314096i.LJLJJL = true;
            }
        } else if (z) {
            C2314096i c2314096i2 = (C2314096i) LIZ(R.id.d1i);
            c2314096i2.LJLILLLLZI.start();
            c2314096i2.LJLJJL = false;
        }
        this.LJLILLLLZI = z;
    }

    public final void LJIIIIZZ(CharSequence charSequence) {
        TextView tux_form_title = (TextView) LIZ(R.id.lun);
        o.LJIIIIZZ(tux_form_title, "tux_form_title");
        tux_form_title.setText(charSequence);
        int i = 0;
        if (charSequence == null || charSequence.length() <= 0) {
            i = 8;
        }
        tux_form_title.setVisibility(i);
    }

    public final void LJIIIZ(C6J7 c6j7) {
        ((ViewGroup) LIZ(R.id.luo)).removeAllViews();
        if (c6j7 != null) {
            ((ViewGroup) LIZ(R.id.luo)).addView(c6j7);
        }
        this.LJLJL = c6j7;
        KeyEvent.Callback callback = this.LJLJLLL;
        if (callback instanceof InterfaceC26024AJg) {
            ((InterfaceC26024AJg) callback).LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFormField(View view) {
        ((ViewGroup) LIZ(R.id.lui)).removeAllViews();
        if (view != 0) {
            ((ViewGroup) LIZ(R.id.lui)).addView(view);
            if (view instanceof InterfaceC26024AJg) {
                ((InterfaceC26024AJg) view).setTuxFieldContentCallback(this);
            }
        }
        this.LJLJLLL = view;
    }

    @Override // X.InterfaceC26019AJb
    public final void LJJIIZI(int i, CharSequence charSequence) {
        KeyEvent.Callback callback = this.LJLJL;
        if (callback != null && (callback instanceof InterfaceC26019AJb)) {
            ((InterfaceC26019AJb) callback).LJJIIZI(i, charSequence);
        }
        KeyEvent.Callback callback2 = this.LJLJLJ;
        if (callback2 != null && (callback2 instanceof InterfaceC26019AJb)) {
            ((InterfaceC26019AJb) callback2).LJJIIZI(i, charSequence);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26021AJd(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L5
            r15 = 0
        L5:
            r0 = 4
            r1 = r16 & 4
            r11 = 0
            if (r1 == 0) goto Lf0
            r3 = 2130968881(0x7f040131, float:1.7546428E38)
        Le:
            java.lang.String r1 = "context"
            java.util.LinkedHashMap r1 = X.C62850Ola.LJFF(r14, r1)
            r13.LJLL = r1
            r13.<init>(r14, r15, r3)
            X.AJf r1 = X.EnumC26023AJf.NONE
            r13.LJLIL = r1
            android.view.LayoutInflater r2 = X.C16880lQ.LLZIL(r14)
            r1 = 2131558411(0x7f0d000b, float:1.8742137E38)
            r12 = 1
            X.C16880lQ.LLLLIILL(r2, r1, r13, r12)
            r1 = 11
            int[] r1 = new int[r1]
            r1 = {x00f4: FILL_ARRAY_DATA , data: [2130969030, 2130969031, 2130969032, 2130969033, 2130969034, 2130969035, 2130969036, 2130969037, 2130969038, 2130969039, 2130969040} // fill-array
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r15, r1, r3, r11)
            java.lang.String r2 = "context.obtainStyledAttr…ormView, defStyleAttr, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r2)
            r2 = 9
            int r10 = r1.getColor(r2, r11)
            r2 = 10
            int r9 = r1.getInt(r2, r11)
            r2 = 5
            int r8 = r1.getResourceId(r2, r11)
            r2 = 6
            int r7 = r1.getInt(r2, r11)
            r2 = 7
            int r5 = r1.getInt(r2, r11)
            r2 = 8
            int r6 = r1.getInt(r2, r11)
            r3 = 2
            int r4 = r1.getInt(r3, r11)
            int r3 = r1.getInt(r12, r11)
            r13.LJLJI = r3
            int r12 = r1.getResourceId(r11, r11)
            r13.LJLJJI = r12
            int r0 = r1.getInt(r0, r11)
            r13.LJLJJL = r0
            r0 = 3
            int r0 = r1.getInt(r0, r11)
            r13.LJLJJLL = r0
            r1.recycle()
            r1 = 2131378652(0x7f0a41dc, float:1.8377542E38)
            android.view.View r0 = r13.LIZ(r1)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r0.setTuxFont(r9)
            android.view.View r0 = r13.LIZ(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r10)
            android.view.View r0 = r13.LIZ(r1)
            r0.setVisibility(r2)
            r1 = 2131378650(0x7f0a41da, float:1.8377538E38)
            android.view.View r0 = r13.LIZ(r1)
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            r0.setIconRes(r8)
            android.view.View r0 = r13.LIZ(r1)
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            r0.setTintColor(r7)
            android.view.View r0 = r13.LIZ(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r2)
            r1 = 2131378651(0x7f0a41db, float:1.837754E38)
            android.view.View r0 = r13.LIZ(r1)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r0.setTuxFont(r6)
            android.view.View r0 = r13.LIZ(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r5)
            android.view.View r0 = r13.LIZ(r1)
            r0.setVisibility(r2)
            r1 = 2131378648(0x7f0a41d8, float:1.8377534E38)
            android.view.View r0 = r13.LIZ(r1)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r0.setTuxFont(r4)
            android.view.View r0 = r13.LIZ(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r3)
            r0 = 2131366564(0x7f0a12a4, float:1.8353025E38)
            android.view.View r0 = r13.LIZ(r0)
            r0.setVisibility(r2)
            return
        Lf0:
            r3 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26021AJd.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
