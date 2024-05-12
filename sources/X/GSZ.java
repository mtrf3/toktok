package X;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class GSZ extends T5T {
    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher watcher) {
        o.LJIIIZ(watcher, "watcher");
        super.addTextChangedListener(watcher);
    }

    @Override // android.widget.EditText
    public void setSelection(int i) {
        super.setSelection(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    @Override // android.widget.EditText
    public final void setSelection(int i, int i2) {
        super.setSelection(i, i2);
    }
}
