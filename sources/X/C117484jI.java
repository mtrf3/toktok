package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4jI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117484jI extends TuxTextView {
    public boolean LJLLLL;
    public CharSequence LJLLLLLL;
    public String LJLZ;
    public final java.util.Map<Integer, View> LJZ;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJZ;
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

    private final CharSequence getTrimmedText() {
        Layout layout = getLayout();
        ForegroundColorSpan foregroundColorSpan = null;
        if (layout == null) {
            return null;
        }
        if (layout.getLineCount() <= 3) {
            return this.LJLLLLLL;
        }
        String string = getContext().getString(R.string.qkp);
        o.LJIIIIZZ(string, "context.getString(R.stri…detailsPage_moreTxt_link)");
        this.LJLZ = string;
        CharSequence subSequence = this.LJLLLLLL.subSequence(0, layout.getLineVisibleEnd(2) - 10);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) subSequence);
        LIZ.append("... ");
        LIZ.append(this.LJLZ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append((Object) subSequence);
        LIZ2.append("... ");
        LIZ2.append(this.LJLZ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X1D.LIZIZ(LIZ2));
        spannableStringBuilder.setSpan(new StyleSpan(1), subSequence.length() + 3, LIZIZ.length(), 34);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJ = C79045V0n.LJ(R.attr.go, context);
        if (LJ != null) {
            foregroundColorSpan = new ForegroundColorSpan(LJ.intValue());
        }
        spannableStringBuilder.setSpan(foregroundColorSpan, subSequence.length() + 3, LIZIZ.length(), 34);
        return spannableStringBuilder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C117484jI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LJZ = C62850Ola.LJFF(context, "context");
        this.LJLLLLLL = "";
        this.LJLZ = "More";
        setEllipsize(TextUtils.TruncateAt.END);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 110)));
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence != null && o.LJ(this.LJLLLLLL, "")) {
            this.LJLLLLLL = charSequence;
        }
        super.setText(charSequence, bufferType);
        if (!this.LJLLLL) {
            super.setText(getTrimmedText(), bufferType);
        } else {
            super.setText(charSequence, bufferType);
        }
    }
}
