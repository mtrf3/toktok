package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ahL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C94459ahL extends C19K {
    public final List<View.OnFocusChangeListener> LJLJJLL;

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        setOnEditorActionListener(new C93694aV0(this));
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        super.setOnKeyListener(onKeyListener);
    }

    public C94459ahL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJJLL = new ArrayList();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        Iterator it = ((ArrayList) this.LJLJJLL).iterator();
        while (it.hasNext()) {
            C93729aVZ.LJ(this, new C94625ak1((View.OnFocusChangeListener) it.next(), this, z));
        }
        int i2 = 0;
        if (z) {
            C93736aVg.LIZIZ(getContext(), this);
            Editable text = getText();
            if (text != null) {
                i2 = text.length();
            }
            setSelection(i2);
            return;
        }
        Context context = getContext();
        IBinder windowToken = getWindowToken();
        if (context != null) {
            try {
                Object LLILL = C16880lQ.LLILL(context, "input_method");
                if (LLILL != null) {
                    ((InputMethodManager) LLILL).hideSoftInputFromWindow(windowToken, 0);
                    return;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                C94034aaU.LIZLLL(message);
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
