package X;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GSY extends InputConnectionWrapper {
    public InterfaceC41548GSi LIZ;

    public GSY() {
        super(null, true);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent event) {
        InterfaceC41548GSi interfaceC41548GSi;
        o.LJIIJ(event, "event");
        if (event.getKeyCode() == 67 && event.getAction() == 0 && (interfaceC41548GSi = this.LIZ) != null && interfaceC41548GSi.LIZ()) {
            return true;
        }
        return super.sendKeyEvent(event);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        InterfaceC41548GSi interfaceC41548GSi;
        if (i == 1 && i2 == 0 && (interfaceC41548GSi = this.LIZ) != null && interfaceC41548GSi.LIZ()) {
            return true;
        }
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        return super.setComposingRegion(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        return super.setComposingText(charSequence, i);
    }
}
