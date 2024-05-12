package X;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.S8g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnFocusChangeListenerC71602S8g extends FrameLayout implements View.OnFocusChangeListener, TextWatcher {
    public TextWatcher LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public final java.util.Map<Integer, View> LJLJJI;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJI;
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

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final T5T getEditText() {
        T5T _etInput = (T5T) LIZ(R.id.lr);
        o.LJIIIIZZ(_etInput, "_etInput");
        return _etInput;
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            View _ivClear = LIZ(R.id.ls);
            o.LJIIIIZZ(_ivClear, "_ivClear");
            OUP.LJJLIIIJ(_ivClear);
            if (this.LJLJI) {
                View _tvLimit = LIZ(R.id.lt);
                o.LJIIIIZZ(_tvLimit, "_tvLimit");
                OUP.LJJLIIIJ(_tvLimit);
            }
            TextView textView = (TextView) LIZ(R.id.lt);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((TextView) LIZ(R.id.lr)).getEditableText().length());
            LIZ.append('/');
            LIZ.append(this.LJLILLLLZI);
            textView.setText(X1D.LIZIZ(LIZ));
            return;
        }
        View _ivClear2 = LIZ(R.id.ls);
        o.LJIIIIZZ(_ivClear2, "_ivClear");
        OUP.LJIJJLI(_ivClear2);
        View _tvLimit2 = LIZ(R.id.lt);
        o.LJIIIIZZ(_tvLimit2, "_tvLimit");
        OUP.LJIJJLI(_tvLimit2);
        ((TextView) LIZ(R.id.lt)).setText("");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ(z);
        TextWatcher textWatcher = this.LJLIL;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(editable);
        }
    }

    public final void setHint(String str) {
        ((TextView) LIZ(R.id.lr)).setHint(str);
    }

    public final void setMaxLines(int i) {
        ((TextView) LIZ(R.id.lr)).setMaxLines(i);
    }

    public final void setText(String str) {
        ((TextView) LIZ(R.id.lr)).setText(str);
    }

    public final void setTextLimitLength(int i) {
        this.LJLILLLLZI = i;
        InputFilter[] oldFilters = ((TextView) LIZ(R.id.lr)).getFilters();
        TextView textView = (TextView) LIZ(R.id.lr);
        o.LJIIIIZZ(oldFilters, "oldFilters");
        textView.setFilters((InputFilter[]) C61898ORa.LJJII(new InputFilter.LengthFilter(this.LJLILLLLZI), oldFilters));
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        o.LJIIIZ(textWatcher, "textWatcher");
        this.LJLIL = textWatcher;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnFocusChangeListenerC71602S8g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJI = C62850Ola.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.aqo, this);
        LIZ(R.id.lr).setOnFocusChangeListener(this);
        View _ivClear = LIZ(R.id.ls);
        o.LJIIIIZZ(_ivClear, "_ivClear");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 89, 42), _ivClear);
        T5T _etInput = (T5T) LIZ(R.id.lr);
        o.LJIIIIZZ(_etInput, "_etInput");
        C76917UGr.LJIJJ(_etInput);
        this.LJLILLLLZI = Integer.MAX_VALUE;
        this.LJLJI = true;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        boolean z2 = false;
        if (z) {
            Editable editableText = ((TextView) LIZ(R.id.lr)).getEditableText();
            o.LJIIIIZZ(editableText, "_etInput.editableText");
            if (editableText.length() > 0) {
                z2 = true;
            }
        }
        LIZIZ(z2);
        if (z) {
            ((TextView) LIZ(R.id.lr)).addTextChangedListener(this);
        } else {
            ((TextView) LIZ(R.id.lr)).removeTextChangedListener(this);
        }
    }
}
