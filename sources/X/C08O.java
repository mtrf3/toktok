package X;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.08O, reason: invalid class name */
/* loaded from: classes.dex */
public class C08O implements TextWatcher, SpanWatcher {
    public final Object LJLIL;
    public final AtomicInteger LJLILLLLZI = new AtomicInteger(0);

    public C08O(Object obj) {
        this.LJLIL = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.LJLIL).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.LJLIL).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.LJLILLLLZI.get() > 0 && (obj instanceof C08H)) {
            return;
        }
        ((SpanWatcher) this.LJLIL).onSpanAdded(spannable, obj, i, i2);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.LJLILLLLZI.get() > 0 && (obj instanceof C08H)) {
            return;
        }
        ((SpanWatcher) this.LJLIL).onSpanRemoved(spannable, obj, i, i2);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.LJLIL).onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i3;
        if (this.LJLILLLLZI.get() > 0 && (obj instanceof C08H)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i5 > i2) {
                i5 = 0;
            }
            if (i6 > i4) {
                i6 = 0;
            }
        }
        ((SpanWatcher) this.LJLIL).onSpanChanged(spannable, obj, i5, i2, i6, i4);
    }
}
