package X;

import Y.ARunnableS40S0100000_4;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import kotlin.jvm.internal.o;

/* renamed from: X.9WD, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9WD {
    public static final void LIZIZ(EditText editText) {
        o.LJIIIZ(editText, "editText");
        editText.postDelayed(new ARunnableS40S0100000_4(editText, 20), 500L);
    }

    public static final boolean LIZJ(EditText editText) {
        return TextUtils.isEmpty(editText.getText());
    }

    public static final void LIZ(final EditText editText, final RBI watcher) {
        o.LJIIIZ(editText, "<this>");
        o.LJIIIZ(watcher, "watcher");
        editText.addTextChangedListener(new C9X0() { // from class: X.9Wz
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                watcher.LIZ(editText.getId(), editable);
            }
        });
    }
}
