package X;

import Y.IDLListenerS57S0200000_3;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.8Fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208218Fd extends TuxTextView {
    public static final /* synthetic */ int LLFF = 0;
    public final int LJLLLL;
    public String LJLLLLLL;
    public CharSequence LJLZ;
    public CharSequence LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public final java.util.Map<Integer, View> LLF;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLF;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LJJJJ(InterfaceC88472Yns<? super Boolean, C76800UCe> toggleSuccess) {
        o.LJIIIZ(toggleSuccess, "toggleSuccess");
        if (!this.LLD) {
            return;
        }
        if (this.LJZL) {
            this.LL = true;
            setText(this.LJLZ);
            toggleSuccess.invoke(Boolean.FALSE);
        } else {
            this.LL = false;
            setText(this.LJLZ);
            toggleSuccess.invoke(Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208218Fd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLF = C62850Ola.LJFF(context, "context");
        this.LJLLLLLL = "";
        this.LL = true;
        this.LJLLLL = 7;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ae7, R.attr.bar, R.attr.bjd});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.FoldTextView)");
            this.LJLLLL = obtainStyledAttributes.getInt(1, 7);
            obtainStyledAttributes.getColor(2, -1);
            obtainStyledAttributes.recycle();
        }
        setMovementMethod(C8FL.LIZ);
        setClickable(false);
        setLongClickable(false);
    }

    public final void LJJJIL(CharSequence charSequence, TextView.BufferType bufferType) {
        this.LJLZ = charSequence;
        Layout layout = getLayout();
        if (layout == null || !layout.getText().equals(this.LJLZ)) {
            super.setText(this.LJLZ, bufferType);
            layout = getLayout();
            if (layout == null) {
                getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS57S0200000_3(this, bufferType, 0));
                return;
            }
        }
        LJJJJJ(layout, bufferType);
    }

    public final void LJJJJJ(Layout layout, TextView.BufferType bufferType) {
        int i;
        CharSequence charSequence = this.LJLZ;
        if (charSequence != null) {
            if (layout.getLineCount() > this.LJLLLL) {
                this.LLD = true;
                this.LJZL = false;
                StringBuilder LJFF = C72972SkS.LJFF("...", ' ');
                LJFF.append(getContext().getString(R.string.s2y));
                this.LJLLLLLL = X1D.LIZIZ(LJFF);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LJLLLLLL);
                String str = this.LJLLLLLL;
                if (str != null) {
                    int LJJLIIIJL = s.LJJLIIIJL(str, "...", 0, false, 6);
                    int i2 = LJJLIIIJL + 3;
                    if (LJJLIIIJL >= 0 && i2 < spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(new T5U(62, false), i2, spannableStringBuilder.length(), 17);
                        Context context = getContext();
                        o.LJIIIIZZ(context, "context");
                        Integer LJI = C79045V0n.LJI(R.attr.gx, context);
                        if (LJI != null) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(LJI.intValue()), i2, spannableStringBuilder.length(), 17);
                        }
                    }
                }
                float measureText = getPaint().measureText(spannableStringBuilder, 0, spannableStringBuilder.length());
                int lineStart = layout.getLineStart(this.LJLLLL - 1);
                CharSequence subSequence = charSequence.subSequence(lineStart, layout.getLineEnd(this.LJLLLL - 1));
                if (subSequence instanceof SpannableStringBuilder) {
                    Object[] spans = ((Spanned) subSequence).getSpans(0, subSequence.length(), C8FK.class);
                    o.LJIIIIZZ(spans, "getSpans(start, end, T::class.java)");
                    i = 0;
                    for (C8FK c8fk : (C8FK[]) spans) {
                        i += c8fk.LIZLLL();
                    }
                } else {
                    i = 0;
                }
                int breakText = getPaint().breakText(subSequence.toString(), true, (layout.getWidth() - measureText) - i, null);
                CharSequence subSequence2 = charSequence.subSequence(0, lineStart);
                CharSequence subSequence3 = subSequence.subSequence(0, breakText - 1);
                if (s.LJJJLZIJ(subSequence3, "\n", false)) {
                    subSequence3 = subSequence3.subSequence(0, s.LJJLIIIJL(subSequence3, "\n", 0, false, 6));
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(subSequence2);
                spannableStringBuilder2.append(subSequence3);
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                this.LJZ = spannableStringBuilder2;
                super.setText(spannableStringBuilder2, bufferType);
                return;
            }
            this.LLD = false;
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setText(final CharSequence charSequence, final TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (TextUtils.isEmpty(charSequence) || this.LJLLLL == 0 || !this.LL) {
            this.LJZL = true;
            this.LJLZ = charSequence;
            super.setText(charSequence, bufferType);
            return;
        }
        CharSequence charSequence2 = this.LJZ;
        if (charSequence2 != null) {
            this.LJZL = false;
            this.LJLZ = charSequence;
            super.setText(charSequence2, bufferType);
        } else if (!this.LJZI) {
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.8Fe
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    C208218Fd.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    C208218Fd c208218Fd = C208218Fd.this;
                    c208218Fd.LJZI = true;
                    c208218Fd.LJJJIL(charSequence, bufferType);
                    return true;
                }
            });
        } else {
            LJJJIL(charSequence, bufferType);
        }
    }
}
