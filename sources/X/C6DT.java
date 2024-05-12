package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6DT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DT extends T5T {
    public View.OnKeyListener LJLJJLL;
    public C6AH LJLJL;

    @Override // X.C19K, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        o.LJIIIZ(outAttrs, "outAttrs");
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        return new InputConnectionWrapper(onCreateInputConnection) { // from class: X.8ry
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent event) {
                o.LJIIIZ(event, "event");
                C6DT c6dt = C6DT.this;
                View.OnKeyListener onKeyListener = c6dt.LJLJJLL;
                if (onKeyListener != null && onKeyListener.onKey(c6dt, event.getKeyCode(), event)) {
                    return true;
                }
                return super.sendKeyEvent(event);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) {
                if (i == 1 && i2 == 0) {
                    if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                        return true;
                    }
                    return false;
                }
                return super.deleteSurroundingText(i, i2);
            }
        };
    }

    public final void setOnSelectionChangedListener(C6AH c6ah) {
        this.LJLJL = c6ah;
    }

    public final void setSoftKeyListener(View.OnKeyListener listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6DT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C6AH c6ah = this.LJLJL;
        if (c6ah != null) {
            c6ah.LIZ(i);
        }
    }
}
